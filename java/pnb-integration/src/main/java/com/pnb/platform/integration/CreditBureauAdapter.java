package com.pnb.platform.integration;

import java.util.Map;

public class CreditBureauAdapter {
    public String buildInquiryPayload(String customerId, int scoreHint) {
        return "{\"customerId\":\"" + customerId + "\",\"scoreHint\":" + scoreHint + "}";
    }

    public int parseRiskTier(Map<String, Integer> bureauResponse) {
        int score = bureauResponse.getOrDefault("score", 0);
        if (score >= 760) return 1;
        if (score >= 700) return 2;
        if (score >= 640) return 3;
        return 4;
    }
}
