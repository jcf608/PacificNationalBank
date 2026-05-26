package com.pnb.fee;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * FeeDto024 — Data Transfer Object for fee operations.
 * Variant 24 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FeeDto024 {

    @JsonProperty("feeField000")
    private Integer feeField000;

    @JsonProperty("feeField001")
    private LocalDate feeField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("feeField002")
    private BigDecimal feeField002;

    @Size(max = 100)
    @JsonProperty("feeField003")
    private String feeField003;

    @JsonProperty("feeField004")
    private Integer feeField004;

    @JsonProperty("feeField005")
    private Boolean feeField005;

    @JsonProperty("feeField006")
    private Boolean feeField006;

    @JsonProperty("feeField007")
    private Long feeField007;

    public FeeDto024() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final FeeDto024 instance = new FeeDto024();

        public Builder feeField000(Integer val) { instance.feeField000 = val; return this; }
        public Builder feeField001(LocalDate val) { instance.feeField001 = val; return this; }
        public Builder feeField002(BigDecimal val) { instance.feeField002 = val; return this; }
        public Builder feeField003(String val) { instance.feeField003 = val; return this; }
        public Builder feeField004(Integer val) { instance.feeField004 = val; return this; }
        public Builder feeField005(Boolean val) { instance.feeField005 = val; return this; }
        public Builder feeField006(Boolean val) { instance.feeField006 = val; return this; }
        public Builder feeField007(Long val) { instance.feeField007 = val; return this; }
        public FeeDto024 build() { return instance; }
    }

    public Integer getFeeField000() { return feeField000; }
    public void setFeeField000(Integer feeField000) { this.feeField000 = feeField000; }

    public LocalDate getFeeField001() { return feeField001; }
    public void setFeeField001(LocalDate feeField001) { this.feeField001 = feeField001; }

    public BigDecimal getFeeField002() { return feeField002; }
    public void setFeeField002(BigDecimal feeField002) { this.feeField002 = feeField002; }

    public String getFeeField003() { return feeField003; }
    public void setFeeField003(String feeField003) { this.feeField003 = feeField003; }

    public Integer getFeeField004() { return feeField004; }
    public void setFeeField004(Integer feeField004) { this.feeField004 = feeField004; }

    public Boolean getFeeField005() { return feeField005; }
    public void setFeeField005(Boolean feeField005) { this.feeField005 = feeField005; }

    public Boolean getFeeField006() { return feeField006; }
    public void setFeeField006(Boolean feeField006) { this.feeField006 = feeField006; }

    public Long getFeeField007() { return feeField007; }
    public void setFeeField007(Long feeField007) { this.feeField007 = feeField007; }

    @Override
    public String toString() {
        return "FeeDto024{" +
            "feeField000=" + feeField000 + ", " +
            "feeField001=" + feeField001 + ", " +
            "feeField002=" + feeField002 + ", " +
            "feeField003=" + feeField003 + ", " +
            "feeField004=" + feeField004 + ", " +
            "}";
    }
}
