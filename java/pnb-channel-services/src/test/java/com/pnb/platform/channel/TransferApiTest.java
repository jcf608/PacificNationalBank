package com.pnb.platform.channel;

import java.math.BigDecimal;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TransferApiTest {
    @Test
    void previewTransferSubtractsFromSource() {
        TransferApi api = new TransferApi();
        assertEquals(new BigDecimal("80.00"), api.previewTransfer(new BigDecimal("100.00"), new BigDecimal("20.00")));
    }
}
