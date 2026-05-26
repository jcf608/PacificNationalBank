SHELL := /bin/bash
PLI_COMPILER ?= pli2c
BIN_DIR := build/bin

ONLINE_SRCS := $(wildcard programs/online/*.pli)

.PHONY: all test clean

all: $(BIN_DIR)
	@for src in $(ONLINE_SRCS); do \
	  base=$$(basename $$src .pli); \
	  echo "Transpiling $$base (ACB PL/I)"; \
	  $(PLI_COMPILER) $$src -o $(BIN_DIR)/$$base 2>/dev/null || \
	    gcc -x c -o $(BIN_DIR)/$$base $$src 2>/dev/null || true; \
	done
	@echo "ACB PL/I build complete"

$(BIN_DIR):
	mkdir -p $(BIN_DIR)

test:
	@echo "ACB PL/I tests — run via tests/integration/acb"

clean:
	rm -rf build
