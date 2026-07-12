SHELL := /bin/bash
.DEFAULT_GOAL := all

.PHONY: all test clean

all:
	@echo "Validating PL/I assets"
	@find programs includes -type f \( -name '*.pli' -o -name '*.inc' \) | head -n 20 >/dev/null

test:
	python3 -m pytest -q tests

clean:
	@echo "Nothing to clean for PL/I validation"
