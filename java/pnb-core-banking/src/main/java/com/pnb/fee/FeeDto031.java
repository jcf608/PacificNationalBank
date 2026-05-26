package com.pnb.fee;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * FeeDto031 — Data Transfer Object for fee operations.
 * Variant 31 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FeeDto031 {

    @DecimalMin(value = "0.00")
    @JsonProperty("feeField000")
    private BigDecimal feeField000;

    @Size(max = 60)
    @JsonProperty("feeField001")
    private String feeField001;

    @JsonProperty("feeField002")
    private Long feeField002;

    @JsonProperty("feeField003")
    private Integer feeField003;

    @JsonProperty("feeField004")
    private Double feeField004;

    @JsonProperty("feeField005")
    private Long feeField005;

    @JsonProperty("feeField006")
    private Integer feeField006;

    @JsonProperty("feeField007")
    private Integer feeField007;

    @JsonProperty("feeField008")
    private Double feeField008;

    @JsonProperty("feeField009")
    private LocalDate feeField009;

    @JsonProperty("feeField010")
    private Double feeField010;

    @JsonProperty("feeField011")
    private Double feeField011;

    @DecimalMin(value = "0.00")
    @JsonProperty("feeField012")
    private BigDecimal feeField012;

    @JsonProperty("feeField013")
    private LocalDate feeField013;

    @DecimalMin(value = "0.00")
    @JsonProperty("feeField014")
    private BigDecimal feeField014;

    public FeeDto031() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final FeeDto031 instance = new FeeDto031();

        public Builder feeField000(BigDecimal val) { instance.feeField000 = val; return this; }
        public Builder feeField001(String val) { instance.feeField001 = val; return this; }
        public Builder feeField002(Long val) { instance.feeField002 = val; return this; }
        public Builder feeField003(Integer val) { instance.feeField003 = val; return this; }
        public Builder feeField004(Double val) { instance.feeField004 = val; return this; }
        public Builder feeField005(Long val) { instance.feeField005 = val; return this; }
        public Builder feeField006(Integer val) { instance.feeField006 = val; return this; }
        public Builder feeField007(Integer val) { instance.feeField007 = val; return this; }
        public Builder feeField008(Double val) { instance.feeField008 = val; return this; }
        public Builder feeField009(LocalDate val) { instance.feeField009 = val; return this; }
        public Builder feeField010(Double val) { instance.feeField010 = val; return this; }
        public Builder feeField011(Double val) { instance.feeField011 = val; return this; }
        public Builder feeField012(BigDecimal val) { instance.feeField012 = val; return this; }
        public Builder feeField013(LocalDate val) { instance.feeField013 = val; return this; }
        public Builder feeField014(BigDecimal val) { instance.feeField014 = val; return this; }
        public FeeDto031 build() { return instance; }
    }

    public BigDecimal getFeeField000() { return feeField000; }
    public void setFeeField000(BigDecimal feeField000) { this.feeField000 = feeField000; }

    public String getFeeField001() { return feeField001; }
    public void setFeeField001(String feeField001) { this.feeField001 = feeField001; }

    public Long getFeeField002() { return feeField002; }
    public void setFeeField002(Long feeField002) { this.feeField002 = feeField002; }

    public Integer getFeeField003() { return feeField003; }
    public void setFeeField003(Integer feeField003) { this.feeField003 = feeField003; }

    public Double getFeeField004() { return feeField004; }
    public void setFeeField004(Double feeField004) { this.feeField004 = feeField004; }

    public Long getFeeField005() { return feeField005; }
    public void setFeeField005(Long feeField005) { this.feeField005 = feeField005; }

    public Integer getFeeField006() { return feeField006; }
    public void setFeeField006(Integer feeField006) { this.feeField006 = feeField006; }

    public Integer getFeeField007() { return feeField007; }
    public void setFeeField007(Integer feeField007) { this.feeField007 = feeField007; }

    public Double getFeeField008() { return feeField008; }
    public void setFeeField008(Double feeField008) { this.feeField008 = feeField008; }

    public LocalDate getFeeField009() { return feeField009; }
    public void setFeeField009(LocalDate feeField009) { this.feeField009 = feeField009; }

    public Double getFeeField010() { return feeField010; }
    public void setFeeField010(Double feeField010) { this.feeField010 = feeField010; }

    public Double getFeeField011() { return feeField011; }
    public void setFeeField011(Double feeField011) { this.feeField011 = feeField011; }

    public BigDecimal getFeeField012() { return feeField012; }
    public void setFeeField012(BigDecimal feeField012) { this.feeField012 = feeField012; }

    public LocalDate getFeeField013() { return feeField013; }
    public void setFeeField013(LocalDate feeField013) { this.feeField013 = feeField013; }

    public BigDecimal getFeeField014() { return feeField014; }
    public void setFeeField014(BigDecimal feeField014) { this.feeField014 = feeField014; }

    @Override
    public String toString() {
        return "FeeDto031{" +
            "feeField000=" + feeField000 + ", " +
            "feeField001=" + feeField001 + ", " +
            "feeField002=" + feeField002 + ", " +
            "feeField003=" + feeField003 + ", " +
            "feeField004=" + feeField004 + ", " +
            "}";
    }
}
