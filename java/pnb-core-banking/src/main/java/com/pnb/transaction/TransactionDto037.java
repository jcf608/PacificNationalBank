package com.pnb.transaction;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * TransactionDto037 — Data Transfer Object for transaction operations.
 * Variant 37 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransactionDto037 {

    @JsonProperty("tranField000")
    private LocalDate tranField000;

    @JsonProperty("tranField001")
    private Double tranField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("tranField002")
    private BigDecimal tranField002;

    @JsonProperty("tranField003")
    private Boolean tranField003;

    @JsonProperty("tranField004")
    private Boolean tranField004;

    @JsonProperty("tranField005")
    private LocalDate tranField005;

    @JsonProperty("tranField006")
    private Long tranField006;

    @JsonProperty("tranField007")
    private Double tranField007;

    @JsonProperty("tranField008")
    private Boolean tranField008;

    public TransactionDto037() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final TransactionDto037 instance = new TransactionDto037();

        public Builder tranField000(LocalDate val) { instance.tranField000 = val; return this; }
        public Builder tranField001(Double val) { instance.tranField001 = val; return this; }
        public Builder tranField002(BigDecimal val) { instance.tranField002 = val; return this; }
        public Builder tranField003(Boolean val) { instance.tranField003 = val; return this; }
        public Builder tranField004(Boolean val) { instance.tranField004 = val; return this; }
        public Builder tranField005(LocalDate val) { instance.tranField005 = val; return this; }
        public Builder tranField006(Long val) { instance.tranField006 = val; return this; }
        public Builder tranField007(Double val) { instance.tranField007 = val; return this; }
        public Builder tranField008(Boolean val) { instance.tranField008 = val; return this; }
        public TransactionDto037 build() { return instance; }
    }

    public LocalDate getTranField000() { return tranField000; }
    public void setTranField000(LocalDate tranField000) { this.tranField000 = tranField000; }

    public Double getTranField001() { return tranField001; }
    public void setTranField001(Double tranField001) { this.tranField001 = tranField001; }

    public BigDecimal getTranField002() { return tranField002; }
    public void setTranField002(BigDecimal tranField002) { this.tranField002 = tranField002; }

    public Boolean getTranField003() { return tranField003; }
    public void setTranField003(Boolean tranField003) { this.tranField003 = tranField003; }

    public Boolean getTranField004() { return tranField004; }
    public void setTranField004(Boolean tranField004) { this.tranField004 = tranField004; }

    public LocalDate getTranField005() { return tranField005; }
    public void setTranField005(LocalDate tranField005) { this.tranField005 = tranField005; }

    public Long getTranField006() { return tranField006; }
    public void setTranField006(Long tranField006) { this.tranField006 = tranField006; }

    public Double getTranField007() { return tranField007; }
    public void setTranField007(Double tranField007) { this.tranField007 = tranField007; }

    public Boolean getTranField008() { return tranField008; }
    public void setTranField008(Boolean tranField008) { this.tranField008 = tranField008; }

    @Override
    public String toString() {
        return "TransactionDto037{" +
            "tranField000=" + tranField000 + ", " +
            "tranField001=" + tranField001 + ", " +
            "tranField002=" + tranField002 + ", " +
            "tranField003=" + tranField003 + ", " +
            "tranField004=" + tranField004 + ", " +
            "}";
    }
}
