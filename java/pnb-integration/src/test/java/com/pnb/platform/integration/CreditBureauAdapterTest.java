package com.pnb.platform.integration;

import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CreditBureauAdapterTest {
    @Test
    void parseRiskTierAssignsExpectedBand() {
        CreditBureauAdapter adapter = new CreditBureauAdapter();
        assertEquals(2, adapter.parseRiskTier(Map.of("score", 720)));
    }
}
