package com.pnb.fee;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * FeeDto055 — Data Transfer Object for fee operations.
 * Variant 55 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FeeDto055 {

    @JsonProperty("feeField000")
    private Integer feeField000;

    @JsonProperty("feeField001")
    private Long feeField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("feeField002")
    private BigDecimal feeField002;

    @Size(max = 20)
    @JsonProperty("feeField003")
    private String feeField003;

    @JsonProperty("feeField004")
    private Double feeField004;

    @JsonProperty("feeField005")
    private Double feeField005;

    @JsonProperty("feeField006")
    private Double feeField006;

    @JsonProperty("feeField007")
    private Long feeField007;

    @JsonProperty("feeField008")
    private LocalDate feeField008;

    @JsonProperty("feeField009")
    private Long feeField009;

    @JsonProperty("feeField010")
    private Integer feeField010;

    @JsonProperty("feeField011")
    private LocalDate feeField011;

    @DecimalMin(value = "0.00")
    @JsonProperty("feeField012")
    private BigDecimal feeField012;

    @JsonProperty("feeField013")
    private LocalDate feeField013;

    @JsonProperty("feeField014")
    private LocalDate feeField014;

    public FeeDto055() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final FeeDto055 instance = new FeeDto055();

        public Builder feeField000(Integer val) { instance.feeField000 = val; return this; }
        public Builder feeField001(Long val) { instance.feeField001 = val; return this; }
        public Builder feeField002(BigDecimal val) { instance.feeField002 = val; return this; }
        public Builder feeField003(String val) { instance.feeField003 = val; return this; }
        public Builder feeField004(Double val) { instance.feeField004 = val; return this; }
        public Builder feeField005(Double val) { instance.feeField005 = val; return this; }
        public Builder feeField006(Double val) { instance.feeField006 = val; return this; }
        public Builder feeField007(Long val) { instance.feeField007 = val; return this; }
        public Builder feeField008(LocalDate val) { instance.feeField008 = val; return this; }
        public Builder feeField009(Long val) { instance.feeField009 = val; return this; }
        public Builder feeField010(Integer val) { instance.feeField010 = val; return this; }
        public Builder feeField011(LocalDate val) { instance.feeField011 = val; return this; }
        public Builder feeField012(BigDecimal val) { instance.feeField012 = val; return this; }
        public Builder feeField013(LocalDate val) { instance.feeField013 = val; return this; }
        public Builder feeField014(LocalDate val) { instance.feeField014 = val; return this; }
        public FeeDto055 build() { return instance; }
    }

    public Integer getFeeField000() { return feeField000; }
    public void setFeeField000(Integer feeField000) { this.feeField000 = feeField000; }

    public Long getFeeField001() { return feeField001; }
    public void setFeeField001(Long feeField001) { this.feeField001 = feeField001; }

    public BigDecimal getFeeField002() { return feeField002; }
    public void setFeeField002(BigDecimal feeField002) { this.feeField002 = feeField002; }

    public String getFeeField003() { return feeField003; }
    public void setFeeField003(String feeField003) { this.feeField003 = feeField003; }

    public Double getFeeField004() { return feeField004; }
    public void setFeeField004(Double feeField004) { this.feeField004 = feeField004; }

    public Double getFeeField005() { return feeField005; }
    public void setFeeField005(Double feeField005) { this.feeField005 = feeField005; }

    public Double getFeeField006() { return feeField006; }
    public void setFeeField006(Double feeField006) { this.feeField006 = feeField006; }

    public Long getFeeField007() { return feeField007; }
    public void setFeeField007(Long feeField007) { this.feeField007 = feeField007; }

    public LocalDate getFeeField008() { return feeField008; }
    public void setFeeField008(LocalDate feeField008) { this.feeField008 = feeField008; }

    public Long getFeeField009() { return feeField009; }
    public void setFeeField009(Long feeField009) { this.feeField009 = feeField009; }

    public Integer getFeeField010() { return feeField010; }
    public void setFeeField010(Integer feeField010) { this.feeField010 = feeField010; }

    public LocalDate getFeeField011() { return feeField011; }
    public void setFeeField011(LocalDate feeField011) { this.feeField011 = feeField011; }

    public BigDecimal getFeeField012() { return feeField012; }
    public void setFeeField012(BigDecimal feeField012) { this.feeField012 = feeField012; }

    public LocalDate getFeeField013() { return feeField013; }
    public void setFeeField013(LocalDate feeField013) { this.feeField013 = feeField013; }

    public LocalDate getFeeField014() { return feeField014; }
    public void setFeeField014(LocalDate feeField014) { this.feeField014 = feeField014; }

    @Override
    public String toString() {
        return "FeeDto055{" +
            "feeField000=" + feeField000 + ", " +
            "feeField001=" + feeField001 + ", " +
            "feeField002=" + feeField002 + ", " +
            "feeField003=" + feeField003 + ", " +
            "feeField004=" + feeField004 + ", " +
            "}";
    }
}
