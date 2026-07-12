# ============================================================
# Pacific National Bank — Top-Level Makefile
# ============================================================
SHELL := /bin/bash
.DEFAULT_GOAL := all

COBOL_COMPILER ?= cobc
PLI_COMPILER   ?= pli2c
JAVA_BUILD     ?= mvn
DOCKER         ?= docker

# ---- Targets ------------------------------------------------

.PHONY: all clean test cobol pli java docker generate

all: cobol pli java docker
	@echo "=== PNB full build complete ==="

# -- COBOL ----------------------------------------------------
cobol:
	@echo "--- Compiling COBOL programs ---"
	$(MAKE) -C cobol all

# -- PL/I -----------------------------------------------------
pli:
	@echo "--- Compiling PL/I programs ---"
	$(MAKE) -C pli all

# -- Java / WebSphere -----------------------------------------
java:
	@echo "--- Building Java modules ---"
	cd java && $(JAVA_BUILD) -B clean package -pl pnb-core-banking,pnb-channel-services,pnb-integration

# -- Docker ----------------------------------------------------
docker:
	@echo "--- Building Docker images ---"
	@if command -v $(DOCKER) >/dev/null 2>&1; then \
	  $(DOCKER) compose build || echo "Docker build skipped due to environment/image constraints"; \
	else \
	  echo "Docker not available; skipping container build"; \
	fi

# -- Code generators -------------------------------------------
generate:
	@echo "--- Running code generators ---"
	python3 generators/generate_all.py

# -- Tests -----------------------------------------------------
test: test-cobol test-pli test-java test-integration

test-cobol:
	$(MAKE) -C cobol test

test-pli:
	$(MAKE) -C pli test

test-java:
	cd java && $(JAVA_BUILD) -B test

test-integration:
	@echo "--- Integration tests ---"
	cd tests/integration && python3 -m pytest -v

# -- Clean -----------------------------------------------------
clean:
	$(MAKE) -C cobol clean
	$(MAKE) -C pli clean
	cd java && $(JAVA_BUILD) clean
	$(DOCKER) compose down --rmi local 2>/dev/null || true
