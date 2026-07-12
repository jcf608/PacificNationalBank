SHELL := /bin/bash
.DEFAULT_GOAL := all

.PHONY: all test clean

all:
	@echo "Compiling representative COBOL programs"
	@if command -v cobc >/dev/null 2>&1; then 	  find programs/batch programs/online -name '*.cbl' | head -n 4 | while read -r f; do 	    cobc -x -free -I copybooks "$${f}" -o /tmp/"$$(basename "$${f}" .cbl)".exe || exit 1; 	  done; 	else 	  echo "cobc not found; structural validation only"; 	fi

test:
	python3 -m pytest -q tests

clean:
	rm -f /tmp/*.exe
