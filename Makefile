# ============================================================
# PNB + ACB Enterprise Banking Suite
# ============================================================
SHELL := /bin/bash
.DEFAULT_GOAL := all

COBC          ?= cobc
PLI_COMPILER  ?= pli2c
JAVA_BUILD    ?= mvn
DOCKER        ?= docker
PYTHON        ?= python3

.PHONY: all clean test bootstrap legacy azure mule integration generate corpus corpus-stats

all: legacy azure
	@echo "=== PNB + ACB enterprise build complete ==="

bootstrap:
	$(PYTHON) scripts/bootstrap_enterprise_suite.py

legacy: pnb-legacy acb-legacy

pnb-legacy:
	$(MAKE) -C pnb/legacy/cobol all

acb-legacy:
	$(MAKE) -C acb/legacy/pli all

azure: pnb-azure acb-azure

pnb-azure:
	cd pnb/azure/services && $(JAVA_BUILD) -B -q package -DskipTests

acb-azure:
	cd acb/azure/services && $(JAVA_BUILD) -B -q package -DskipTests

mule:
	@echo "MuleSoft app: platform/mulesoft/apps/acb-pnb-reconciliation"
	cd platform/mulesoft/apps/acb-pnb-reconciliation && $(JAVA_BUILD) -B -q package -DskipTests || true

docker:
	$(DOCKER) compose build

test: test-legacy test-azure test-integration

test-legacy:
	$(MAKE) -C pnb/legacy/cobol test
	$(MAKE) -C acb/legacy/pli test

test-azure:
	cd pnb/azure/services/pnb-deposits-service && $(JAVA_BUILD) -B -q test
	cd acb/azure/services && $(JAVA_BUILD) -B -q test -DskipTests || true

test-integration:
	cd tests/integration && $(PYTHON) -m pytest -v

generate:
	$(PYTHON) generators/generate_batch.py 1 || true

corpus:
	$(PYTHON) generators/generate_enterprise_corpus.py --target 3000000 --commit-every 500000

corpus-stats:
	@bash scripts/count_corpus.sh

clean:
	$(MAKE) -C pnb/legacy/cobol clean
	$(MAKE) -C acb/legacy/pli clean
	cd pnb/azure/services && $(JAVA_BUILD) clean || true
	cd acb/azure/services && $(JAVA_BUILD) clean || true
	$(DOCKER) compose down --rmi local 2>/dev/null || true
