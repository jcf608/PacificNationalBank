package com.pnb.fee;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * FeeDto041 — Data Transfer Object for fee operations.
 * Variant 41 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FeeDto041 {

    @JsonProperty("feeField000")
    private Double feeField000;

    @DecimalMin(value = "0.00")
    @JsonProperty("feeField001")
    private BigDecimal feeField001;

    @JsonProperty("feeField002")
    private Integer feeField002;

    @JsonProperty("feeField003")
    private Double feeField003;

    @JsonProperty("feeField004")
    private LocalDate feeField004;

    @JsonProperty("feeField005")
    private Boolean feeField005;

    @JsonProperty("feeField006")
    private Long feeField006;

    @JsonProperty("feeField007")
    private Long feeField007;

    @JsonProperty("feeField008")
    private Double feeField008;

    @JsonProperty("feeField009")
    private LocalDate feeField009;

    @JsonProperty("feeField010")
    private Long feeField010;

    @DecimalMin(value = "0.00")
    @JsonProperty("feeField011")
    private BigDecimal feeField011;

    @JsonProperty("feeField012")
    private LocalDate feeField012;

    public FeeDto041() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final FeeDto041 instance = new FeeDto041();

        public Builder feeField000(Double val) { instance.feeField000 = val; return this; }
        public Builder feeField001(BigDecimal val) { instance.feeField001 = val; return this; }
        public Builder feeField002(Integer val) { instance.feeField002 = val; return this; }
        public Builder feeField003(Double val) { instance.feeField003 = val; return this; }
        public Builder feeField004(LocalDate val) { instance.feeField004 = val; return this; }
        public Builder feeField005(Boolean val) { instance.feeField005 = val; return this; }
        public Builder feeField006(Long val) { instance.feeField006 = val; return this; }
        public Builder feeField007(Long val) { instance.feeField007 = val; return this; }
        public Builder feeField008(Double val) { instance.feeField008 = val; return this; }
        public Builder feeField009(LocalDate val) { instance.feeField009 = val; return this; }
        public Builder feeField010(Long val) { instance.feeField010 = val; return this; }
        public Builder feeField011(BigDecimal val) { instance.feeField011 = val; return this; }
        public Builder feeField012(LocalDate val) { instance.feeField012 = val; return this; }
        public FeeDto041 build() { return instance; }
    }

    public Double getFeeField000() { return feeField000; }
    public void setFeeField000(Double feeField000) { this.feeField000 = feeField000; }

    public BigDecimal getFeeField001() { return feeField001; }
    public void setFeeField001(BigDecimal feeField001) { this.feeField001 = feeField001; }

    public Integer getFeeField002() { return feeField002; }
    public void setFeeField002(Integer feeField002) { this.feeField002 = feeField002; }

    public Double getFeeField003() { return feeField003; }
    public void setFeeField003(Double feeField003) { this.feeField003 = feeField003; }

    public LocalDate getFeeField004() { return feeField004; }
    public void setFeeField004(LocalDate feeField004) { this.feeField004 = feeField004; }

    public Boolean getFeeField005() { return feeField005; }
    public void setFeeField005(Boolean feeField005) { this.feeField005 = feeField005; }

    public Long getFeeField006() { return feeField006; }
    public void setFeeField006(Long feeField006) { this.feeField006 = feeField006; }

    public Long getFeeField007() { return feeField007; }
    public void setFeeField007(Long feeField007) { this.feeField007 = feeField007; }

    public Double getFeeField008() { return feeField008; }
    public void setFeeField008(Double feeField008) { this.feeField008 = feeField008; }

    public LocalDate getFeeField009() { return feeField009; }
    public void setFeeField009(LocalDate feeField009) { this.feeField009 = feeField009; }

    public Long getFeeField010() { return feeField010; }
    public void setFeeField010(Long feeField010) { this.feeField010 = feeField010; }

    public BigDecimal getFeeField011() { return feeField011; }
    public void setFeeField011(BigDecimal feeField011) { this.feeField011 = feeField011; }

    public LocalDate getFeeField012() { return feeField012; }
    public void setFeeField012(LocalDate feeField012) { this.feeField012 = feeField012; }

    @Override
    public String toString() {
        return "FeeDto041{" +
            "feeField000=" + feeField000 + ", " +
            "feeField001=" + feeField001 + ", " +
            "feeField002=" + feeField002 + ", " +
            "feeField003=" + feeField003 + ", " +
            "feeField004=" + feeField004 + ", " +
            "}";
    }
}
