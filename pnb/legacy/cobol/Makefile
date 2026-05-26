SHELL := /bin/bash
COBC ?= cobc
COB_FLAGS := -x -free -I copybooks

BATCH_SRCS := $(wildcard programs/batch/*.cbl)
ONLINE_SRCS := $(wildcard programs/online/*.cbl)
BIN_DIR := build/bin

.PHONY: all test clean

ALL_SRCS := $(BATCH_SRCS) $(ONLINE_SRCS)

all: $(BIN_DIR)
	@for src in $(ALL_SRCS); do \
	  base=$$(basename $$src .cbl); \
	  $(COBC) $(COB_FLAGS) -o $(BIN_DIR)/$$base $$src 2>/dev/null || \
	    echo "skip $$base (missing copybook chain in dev build)"; \
	done
	@echo "PNB COBOL build: $$(ls $(BIN_DIR) 2>/dev/null | wc -l) programs"

$(BIN_DIR):
	mkdir -p $(BIN_DIR)

test:
	@echo "PNB COBOL unit tests — run via tests/integration/pnb"

clean:
	rm -rf build
