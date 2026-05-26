package com.pnb.fee;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * FeeDto032 — Data Transfer Object for fee operations.
 * Variant 32 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FeeDto032 {

    @JsonProperty("feeField000")
    private LocalDate feeField000;

    @JsonProperty("feeField001")
    private Double feeField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("feeField002")
    private BigDecimal feeField002;

    @JsonProperty("feeField003")
    private Integer feeField003;

    @JsonProperty("feeField004")
    private Long feeField004;

    @JsonProperty("feeField005")
    private LocalDate feeField005;

    @JsonProperty("feeField006")
    private Boolean feeField006;

    @JsonProperty("feeField007")
    private Long feeField007;

    @DecimalMin(value = "0.00")
    @JsonProperty("feeField008")
    private BigDecimal feeField008;

    @JsonProperty("feeField009")
    private Long feeField009;

    @DecimalMin(value = "0.00")
    @JsonProperty("feeField010")
    private BigDecimal feeField010;

    @DecimalMin(value = "0.00")
    @JsonProperty("feeField011")
    private BigDecimal feeField011;

    @Size(max = 100)
    @JsonProperty("feeField012")
    private String feeField012;

    @JsonProperty("feeField013")
    private Integer feeField013;

    @JsonProperty("feeField014")
    private Boolean feeField014;

    @JsonProperty("feeField015")
    private LocalDate feeField015;

    public FeeDto032() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final FeeDto032 instance = new FeeDto032();

        public Builder feeField000(LocalDate val) { instance.feeField000 = val; return this; }
        public Builder feeField001(Double val) { instance.feeField001 = val; return this; }
        public Builder feeField002(BigDecimal val) { instance.feeField002 = val; return this; }
        public Builder feeField003(Integer val) { instance.feeField003 = val; return this; }
        public Builder feeField004(Long val) { instance.feeField004 = val; return this; }
        public Builder feeField005(LocalDate val) { instance.feeField005 = val; return this; }
        public Builder feeField006(Boolean val) { instance.feeField006 = val; return this; }
        public Builder feeField007(Long val) { instance.feeField007 = val; return this; }
        public Builder feeField008(BigDecimal val) { instance.feeField008 = val; return this; }
        public Builder feeField009(Long val) { instance.feeField009 = val; return this; }
        public Builder feeField010(BigDecimal val) { instance.feeField010 = val; return this; }
        public Builder feeField011(BigDecimal val) { instance.feeField011 = val; return this; }
        public Builder feeField012(String val) { instance.feeField012 = val; return this; }
        public Builder feeField013(Integer val) { instance.feeField013 = val; return this; }
        public Builder feeField014(Boolean val) { instance.feeField014 = val; return this; }
        public Builder feeField015(LocalDate val) { instance.feeField015 = val; return this; }
        public FeeDto032 build() { return instance; }
    }

    public LocalDate getFeeField000() { return feeField000; }
    public void setFeeField000(LocalDate feeField000) { this.feeField000 = feeField000; }

    public Double getFeeField001() { return feeField001; }
    public void setFeeField001(Double feeField001) { this.feeField001 = feeField001; }

    public BigDecimal getFeeField002() { return feeField002; }
    public void setFeeField002(BigDecimal feeField002) { this.feeField002 = feeField002; }

    public Integer getFeeField003() { return feeField003; }
    public void setFeeField003(Integer feeField003) { this.feeField003 = feeField003; }

    public Long getFeeField004() { return feeField004; }
    public void setFeeField004(Long feeField004) { this.feeField004 = feeField004; }

    public LocalDate getFeeField005() { return feeField005; }
    public void setFeeField005(LocalDate feeField005) { this.feeField005 = feeField005; }

    public Boolean getFeeField006() { return feeField006; }
    public void setFeeField006(Boolean feeField006) { this.feeField006 = feeField006; }

    public Long getFeeField007() { return feeField007; }
    public void setFeeField007(Long feeField007) { this.feeField007 = feeField007; }

    public BigDecimal getFeeField008() { return feeField008; }
    public void setFeeField008(BigDecimal feeField008) { this.feeField008 = feeField008; }

    public Long getFeeField009() { return feeField009; }
    public void setFeeField009(Long feeField009) { this.feeField009 = feeField009; }

    public BigDecimal getFeeField010() { return feeField010; }
    public void setFeeField010(BigDecimal feeField010) { this.feeField010 = feeField010; }

    public BigDecimal getFeeField011() { return feeField011; }
    public void setFeeField011(BigDecimal feeField011) { this.feeField011 = feeField011; }

    public String getFeeField012() { return feeField012; }
    public void setFeeField012(String feeField012) { this.feeField012 = feeField012; }

    public Integer getFeeField013() { return feeField013; }
    public void setFeeField013(Integer feeField013) { this.feeField013 = feeField013; }

    public Boolean getFeeField014() { return feeField014; }
    public void setFeeField014(Boolean feeField014) { this.feeField014 = feeField014; }

    public LocalDate getFeeField015() { return feeField015; }
    public void setFeeField015(LocalDate feeField015) { this.feeField015 = feeField015; }

    @Override
    public String toString() {
        return "FeeDto032{" +
            "feeField000=" + feeField000 + ", " +
            "feeField001=" + feeField001 + ", " +
            "feeField002=" + feeField002 + ", " +
            "feeField003=" + feeField003 + ", " +
            "feeField004=" + feeField004 + ", " +
            "}";
    }
}
