package com.pnb.fee;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * FeeDto051 — Data Transfer Object for fee operations.
 * Variant 51 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FeeDto051 {

    @JsonProperty("feeField000")
    private LocalDate feeField000;

    @DecimalMin(value = "0.00")
    @JsonProperty("feeField001")
    private BigDecimal feeField001;

    @JsonProperty("feeField002")
    private Long feeField002;

    @DecimalMin(value = "0.00")
    @JsonProperty("feeField003")
    private BigDecimal feeField003;

    @JsonProperty("feeField004")
    private Double feeField004;

    @JsonProperty("feeField005")
    private LocalDate feeField005;

    @JsonProperty("feeField006")
    private LocalDate feeField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("feeField007")
    private BigDecimal feeField007;

    @JsonProperty("feeField008")
    private Boolean feeField008;

    @JsonProperty("feeField009")
    private Integer feeField009;

    @JsonProperty("feeField010")
    private Boolean feeField010;

    public FeeDto051() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final FeeDto051 instance = new FeeDto051();

        public Builder feeField000(LocalDate val) { instance.feeField000 = val; return this; }
        public Builder feeField001(BigDecimal val) { instance.feeField001 = val; return this; }
        public Builder feeField002(Long val) { instance.feeField002 = val; return this; }
        public Builder feeField003(BigDecimal val) { instance.feeField003 = val; return this; }
        public Builder feeField004(Double val) { instance.feeField004 = val; return this; }
        public Builder feeField005(LocalDate val) { instance.feeField005 = val; return this; }
        public Builder feeField006(LocalDate val) { instance.feeField006 = val; return this; }
        public Builder feeField007(BigDecimal val) { instance.feeField007 = val; return this; }
        public Builder feeField008(Boolean val) { instance.feeField008 = val; return this; }
        public Builder feeField009(Integer val) { instance.feeField009 = val; return this; }
        public Builder feeField010(Boolean val) { instance.feeField010 = val; return this; }
        public FeeDto051 build() { return instance; }
    }

    public LocalDate getFeeField000() { return feeField000; }
    public void setFeeField000(LocalDate feeField000) { this.feeField000 = feeField000; }

    public BigDecimal getFeeField001() { return feeField001; }
    public void setFeeField001(BigDecimal feeField001) { this.feeField001 = feeField001; }

    public Long getFeeField002() { return feeField002; }
    public void setFeeField002(Long feeField002) { this.feeField002 = feeField002; }

    public BigDecimal getFeeField003() { return feeField003; }
    public void setFeeField003(BigDecimal feeField003) { this.feeField003 = feeField003; }

    public Double getFeeField004() { return feeField004; }
    public void setFeeField004(Double feeField004) { this.feeField004 = feeField004; }

    public LocalDate getFeeField005() { return feeField005; }
    public void setFeeField005(LocalDate feeField005) { this.feeField005 = feeField005; }

    public LocalDate getFeeField006() { return feeField006; }
    public void setFeeField006(LocalDate feeField006) { this.feeField006 = feeField006; }

    public BigDecimal getFeeField007() { return feeField007; }
    public void setFeeField007(BigDecimal feeField007) { this.feeField007 = feeField007; }

    public Boolean getFeeField008() { return feeField008; }
    public void setFeeField008(Boolean feeField008) { this.feeField008 = feeField008; }

    public Integer getFeeField009() { return feeField009; }
    public void setFeeField009(Integer feeField009) { this.feeField009 = feeField009; }

    public Boolean getFeeField010() { return feeField010; }
    public void setFeeField010(Boolean feeField010) { this.feeField010 = feeField010; }

    @Override
    public String toString() {
        return "FeeDto051{" +
            "feeField000=" + feeField000 + ", " +
            "feeField001=" + feeField001 + ", " +
            "feeField002=" + feeField002 + ", " +
            "feeField003=" + feeField003 + ", " +
            "feeField004=" + feeField004 + ", " +
            "}";
    }
}
