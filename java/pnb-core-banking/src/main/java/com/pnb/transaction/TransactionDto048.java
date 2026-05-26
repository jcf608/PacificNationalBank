package com.pnb.transaction;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * TransactionDto048 — Data Transfer Object for transaction operations.
 * Variant 48 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransactionDto048 {

    @DecimalMin(value = "0.00")
    @JsonProperty("tranField000")
    private BigDecimal tranField000;

    @JsonProperty("tranField001")
    private Boolean tranField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("tranField002")
    private BigDecimal tranField002;

    @DecimalMin(value = "0.00")
    @JsonProperty("tranField003")
    private BigDecimal tranField003;

    @JsonProperty("tranField004")
    private Double tranField004;

    @JsonProperty("tranField005")
    private Boolean tranField005;

    @JsonProperty("tranField006")
    private Long tranField006;

    @JsonProperty("tranField007")
    private Boolean tranField007;

    public TransactionDto048() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final TransactionDto048 instance = new TransactionDto048();

        public Builder tranField000(BigDecimal val) { instance.tranField000 = val; return this; }
        public Builder tranField001(Boolean val) { instance.tranField001 = val; return this; }
        public Builder tranField002(BigDecimal val) { instance.tranField002 = val; return this; }
        public Builder tranField003(BigDecimal val) { instance.tranField003 = val; return this; }
        public Builder tranField004(Double val) { instance.tranField004 = val; return this; }
        public Builder tranField005(Boolean val) { instance.tranField005 = val; return this; }
        public Builder tranField006(Long val) { instance.tranField006 = val; return this; }
        public Builder tranField007(Boolean val) { instance.tranField007 = val; return this; }
        public TransactionDto048 build() { return instance; }
    }

    public BigDecimal getTranField000() { return tranField000; }
    public void setTranField000(BigDecimal tranField000) { this.tranField000 = tranField000; }

    public Boolean getTranField001() { return tranField001; }
    public void setTranField001(Boolean tranField001) { this.tranField001 = tranField001; }

    public BigDecimal getTranField002() { return tranField002; }
    public void setTranField002(BigDecimal tranField002) { this.tranField002 = tranField002; }

    public BigDecimal getTranField003() { return tranField003; }
    public void setTranField003(BigDecimal tranField003) { this.tranField003 = tranField003; }

    public Double getTranField004() { return tranField004; }
    public void setTranField004(Double tranField004) { this.tranField004 = tranField004; }

    public Boolean getTranField005() { return tranField005; }
    public void setTranField005(Boolean tranField005) { this.tranField005 = tranField005; }

    public Long getTranField006() { return tranField006; }
    public void setTranField006(Long tranField006) { this.tranField006 = tranField006; }

    public Boolean getTranField007() { return tranField007; }
    public void setTranField007(Boolean tranField007) { this.tranField007 = tranField007; }

    @Override
    public String toString() {
        return "TransactionDto048{" +
            "tranField000=" + tranField000 + ", " +
            "tranField001=" + tranField001 + ", " +
            "tranField002=" + tranField002 + ", " +
            "tranField003=" + tranField003 + ", " +
            "tranField004=" + tranField004 + ", " +
            "}";
    }
}
