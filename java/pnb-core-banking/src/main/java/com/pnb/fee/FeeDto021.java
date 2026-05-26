package com.pnb.fee;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * FeeDto021 — Data Transfer Object for fee operations.
 * Variant 21 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FeeDto021 {

    @Size(max = 200)
    @JsonProperty("feeField000")
    private String feeField000;

    @JsonProperty("feeField001")
    private Boolean feeField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("feeField002")
    private BigDecimal feeField002;

    @JsonProperty("feeField003")
    private LocalDate feeField003;

    @JsonProperty("feeField004")
    private Double feeField004;

    @JsonProperty("feeField005")
    private Integer feeField005;

    @JsonProperty("feeField006")
    private Boolean feeField006;

    @JsonProperty("feeField007")
    private LocalDate feeField007;

    @JsonProperty("feeField008")
    private Integer feeField008;

    @DecimalMin(value = "0.00")
    @JsonProperty("feeField009")
    private BigDecimal feeField009;

    @JsonProperty("feeField010")
    private Double feeField010;

    @JsonProperty("feeField011")
    private Long feeField011;

    @JsonProperty("feeField012")
    private Long feeField012;

    @JsonProperty("feeField013")
    private Double feeField013;

    @DecimalMin(value = "0.00")
    @JsonProperty("feeField014")
    private BigDecimal feeField014;

    @JsonProperty("feeField015")
    private Boolean feeField015;

    @JsonProperty("feeField016")
    private Boolean feeField016;

    public FeeDto021() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final FeeDto021 instance = new FeeDto021();

        public Builder feeField000(String val) { instance.feeField000 = val; return this; }
        public Builder feeField001(Boolean val) { instance.feeField001 = val; return this; }
        public Builder feeField002(BigDecimal val) { instance.feeField002 = val; return this; }
        public Builder feeField003(LocalDate val) { instance.feeField003 = val; return this; }
        public Builder feeField004(Double val) { instance.feeField004 = val; return this; }
        public Builder feeField005(Integer val) { instance.feeField005 = val; return this; }
        public Builder feeField006(Boolean val) { instance.feeField006 = val; return this; }
        public Builder feeField007(LocalDate val) { instance.feeField007 = val; return this; }
        public Builder feeField008(Integer val) { instance.feeField008 = val; return this; }
        public Builder feeField009(BigDecimal val) { instance.feeField009 = val; return this; }
        public Builder feeField010(Double val) { instance.feeField010 = val; return this; }
        public Builder feeField011(Long val) { instance.feeField011 = val; return this; }
        public Builder feeField012(Long val) { instance.feeField012 = val; return this; }
        public Builder feeField013(Double val) { instance.feeField013 = val; return this; }
        public Builder feeField014(BigDecimal val) { instance.feeField014 = val; return this; }
        public Builder feeField015(Boolean val) { instance.feeField015 = val; return this; }
        public Builder feeField016(Boolean val) { instance.feeField016 = val; return this; }
        public FeeDto021 build() { return instance; }
    }

    public String getFeeField000() { return feeField000; }
    public void setFeeField000(String feeField000) { this.feeField000 = feeField000; }

    public Boolean getFeeField001() { return feeField001; }
    public void setFeeField001(Boolean feeField001) { this.feeField001 = feeField001; }

    public BigDecimal getFeeField002() { return feeField002; }
    public void setFeeField002(BigDecimal feeField002) { this.feeField002 = feeField002; }

    public LocalDate getFeeField003() { return feeField003; }
    public void setFeeField003(LocalDate feeField003) { this.feeField003 = feeField003; }

    public Double getFeeField004() { return feeField004; }
    public void setFeeField004(Double feeField004) { this.feeField004 = feeField004; }

    public Integer getFeeField005() { return feeField005; }
    public void setFeeField005(Integer feeField005) { this.feeField005 = feeField005; }

    public Boolean getFeeField006() { return feeField006; }
    public void setFeeField006(Boolean feeField006) { this.feeField006 = feeField006; }

    public LocalDate getFeeField007() { return feeField007; }
    public void setFeeField007(LocalDate feeField007) { this.feeField007 = feeField007; }

    public Integer getFeeField008() { return feeField008; }
    public void setFeeField008(Integer feeField008) { this.feeField008 = feeField008; }

    public BigDecimal getFeeField009() { return feeField009; }
    public void setFeeField009(BigDecimal feeField009) { this.feeField009 = feeField009; }

    public Double getFeeField010() { return feeField010; }
    public void setFeeField010(Double feeField010) { this.feeField010 = feeField010; }

    public Long getFeeField011() { return feeField011; }
    public void setFeeField011(Long feeField011) { this.feeField011 = feeField011; }

    public Long getFeeField012() { return feeField012; }
    public void setFeeField012(Long feeField012) { this.feeField012 = feeField012; }

    public Double getFeeField013() { return feeField013; }
    public void setFeeField013(Double feeField013) { this.feeField013 = feeField013; }

    public BigDecimal getFeeField014() { return feeField014; }
    public void setFeeField014(BigDecimal feeField014) { this.feeField014 = feeField014; }

    public Boolean getFeeField015() { return feeField015; }
    public void setFeeField015(Boolean feeField015) { this.feeField015 = feeField015; }

    public Boolean getFeeField016() { return feeField016; }
    public void setFeeField016(Boolean feeField016) { this.feeField016 = feeField016; }

    @Override
    public String toString() {
        return "FeeDto021{" +
            "feeField000=" + feeField000 + ", " +
            "feeField001=" + feeField001 + ", " +
            "feeField002=" + feeField002 + ", " +
            "feeField003=" + feeField003 + ", " +
            "feeField004=" + feeField004 + ", " +
            "}";
    }
}
