package com.pnb.fee;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * FeeDto038 — Data Transfer Object for fee operations.
 * Variant 38 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FeeDto038 {

    @Size(max = 40)
    @JsonProperty("feeField000")
    private String feeField000;

    @JsonProperty("feeField001")
    private Boolean feeField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("feeField002")
    private BigDecimal feeField002;

    @JsonProperty("feeField003")
    private Boolean feeField003;

    @JsonProperty("feeField004")
    private Double feeField004;

    @JsonProperty("feeField005")
    private Boolean feeField005;

    @JsonProperty("feeField006")
    private Long feeField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("feeField007")
    private BigDecimal feeField007;

    @JsonProperty("feeField008")
    private LocalDate feeField008;

    @JsonProperty("feeField009")
    private Integer feeField009;

    public FeeDto038() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final FeeDto038 instance = new FeeDto038();

        public Builder feeField000(String val) { instance.feeField000 = val; return this; }
        public Builder feeField001(Boolean val) { instance.feeField001 = val; return this; }
        public Builder feeField002(BigDecimal val) { instance.feeField002 = val; return this; }
        public Builder feeField003(Boolean val) { instance.feeField003 = val; return this; }
        public Builder feeField004(Double val) { instance.feeField004 = val; return this; }
        public Builder feeField005(Boolean val) { instance.feeField005 = val; return this; }
        public Builder feeField006(Long val) { instance.feeField006 = val; return this; }
        public Builder feeField007(BigDecimal val) { instance.feeField007 = val; return this; }
        public Builder feeField008(LocalDate val) { instance.feeField008 = val; return this; }
        public Builder feeField009(Integer val) { instance.feeField009 = val; return this; }
        public FeeDto038 build() { return instance; }
    }

    public String getFeeField000() { return feeField000; }
    public void setFeeField000(String feeField000) { this.feeField000 = feeField000; }

    public Boolean getFeeField001() { return feeField001; }
    public void setFeeField001(Boolean feeField001) { this.feeField001 = feeField001; }

    public BigDecimal getFeeField002() { return feeField002; }
    public void setFeeField002(BigDecimal feeField002) { this.feeField002 = feeField002; }

    public Boolean getFeeField003() { return feeField003; }
    public void setFeeField003(Boolean feeField003) { this.feeField003 = feeField003; }

    public Double getFeeField004() { return feeField004; }
    public void setFeeField004(Double feeField004) { this.feeField004 = feeField004; }

    public Boolean getFeeField005() { return feeField005; }
    public void setFeeField005(Boolean feeField005) { this.feeField005 = feeField005; }

    public Long getFeeField006() { return feeField006; }
    public void setFeeField006(Long feeField006) { this.feeField006 = feeField006; }

    public BigDecimal getFeeField007() { return feeField007; }
    public void setFeeField007(BigDecimal feeField007) { this.feeField007 = feeField007; }

    public LocalDate getFeeField008() { return feeField008; }
    public void setFeeField008(LocalDate feeField008) { this.feeField008 = feeField008; }

    public Integer getFeeField009() { return feeField009; }
    public void setFeeField009(Integer feeField009) { this.feeField009 = feeField009; }

    @Override
    public String toString() {
        return "FeeDto038{" +
            "feeField000=" + feeField000 + ", " +
            "feeField001=" + feeField001 + ", " +
            "feeField002=" + feeField002 + ", " +
            "feeField003=" + feeField003 + ", " +
            "feeField004=" + feeField004 + ", " +
            "}";
    }
}
