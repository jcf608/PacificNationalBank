#!/usr/bin/env python3
"""Minimal IMS Connect simulator for PNB/ACB integration tests."""
import os

from flask import Flask, jsonify, request

app = Flask(__name__)
BANK = os.environ.get("IMS_SIM_BANK", "PNB")


@app.route("/health", methods=["GET"])
def health():
    return jsonify({"bank": BANK, "status": "UP"})


@app.route("/transaction/<txn_id>", methods=["POST"])
def transaction(txn_id: str):
    payload = request.get_json(silent=True) or {}
    return jsonify(
        {
            "bank": BANK,
            "transactionId": txn_id,
            "returnCode": "00",
            "message": f"{BANK} IMS/TM processed",
            "payload": payload,
        }
    )


if __name__ == "__main__":
    port = int(os.environ.get("IMS_SIM_PORT", "9999"))
    app.run(host="0.0.0.0", port=port)
