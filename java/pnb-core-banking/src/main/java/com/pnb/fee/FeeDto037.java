package com.pnb.fee;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * FeeDto037 — Data Transfer Object for fee operations.
 * Variant 37 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FeeDto037 {

    @JsonProperty("feeField000")
    private Boolean feeField000;

    @JsonProperty("feeField001")
    private Integer feeField001;

    @JsonProperty("feeField002")
    private Boolean feeField002;

    @DecimalMin(value = "0.00")
    @JsonProperty("feeField003")
    private BigDecimal feeField003;

    @DecimalMin(value = "0.00")
    @JsonProperty("feeField004")
    private BigDecimal feeField004;

    @JsonProperty("feeField005")
    private Long feeField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("feeField006")
    private BigDecimal feeField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("feeField007")
    private BigDecimal feeField007;

    @JsonProperty("feeField008")
    private LocalDate feeField008;

    public FeeDto037() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final FeeDto037 instance = new FeeDto037();

        public Builder feeField000(Boolean val) { instance.feeField000 = val; return this; }
        public Builder feeField001(Integer val) { instance.feeField001 = val; return this; }
        public Builder feeField002(Boolean val) { instance.feeField002 = val; return this; }
        public Builder feeField003(BigDecimal val) { instance.feeField003 = val; return this; }
        public Builder feeField004(BigDecimal val) { instance.feeField004 = val; return this; }
        public Builder feeField005(Long val) { instance.feeField005 = val; return this; }
        public Builder feeField006(BigDecimal val) { instance.feeField006 = val; return this; }
        public Builder feeField007(BigDecimal val) { instance.feeField007 = val; return this; }
        public Builder feeField008(LocalDate val) { instance.feeField008 = val; return this; }
        public FeeDto037 build() { return instance; }
    }

    public Boolean getFeeField000() { return feeField000; }
    public void setFeeField000(Boolean feeField000) { this.feeField000 = feeField000; }

    public Integer getFeeField001() { return feeField001; }
    public void setFeeField001(Integer feeField001) { this.feeField001 = feeField001; }

    public Boolean getFeeField002() { return feeField002; }
    public void setFeeField002(Boolean feeField002) { this.feeField002 = feeField002; }

    public BigDecimal getFeeField003() { return feeField003; }
    public void setFeeField003(BigDecimal feeField003) { this.feeField003 = feeField003; }

    public BigDecimal getFeeField004() { return feeField004; }
    public void setFeeField004(BigDecimal feeField004) { this.feeField004 = feeField004; }

    public Long getFeeField005() { return feeField005; }
    public void setFeeField005(Long feeField005) { this.feeField005 = feeField005; }

    public BigDecimal getFeeField006() { return feeField006; }
    public void setFeeField006(BigDecimal feeField006) { this.feeField006 = feeField006; }

    public BigDecimal getFeeField007() { return feeField007; }
    public void setFeeField007(BigDecimal feeField007) { this.feeField007 = feeField007; }

    public LocalDate getFeeField008() { return feeField008; }
    public void setFeeField008(LocalDate feeField008) { this.feeField008 = feeField008; }

    @Override
    public String toString() {
        return "FeeDto037{" +
            "feeField000=" + feeField000 + ", " +
            "feeField001=" + feeField001 + ", " +
            "feeField002=" + feeField002 + ", " +
            "feeField003=" + feeField003 + ", " +
            "feeField004=" + feeField004 + ", " +
            "}";
    }
}
