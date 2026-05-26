package com.pnb.fee;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * FeeDto058 — Data Transfer Object for fee operations.
 * Variant 58 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FeeDto058 {

    @JsonProperty("feeField000")
    private Double feeField000;

    @JsonProperty("feeField001")
    private Long feeField001;

    @JsonProperty("feeField002")
    private Double feeField002;

    @JsonProperty("feeField003")
    private Integer feeField003;

    @JsonProperty("feeField004")
    private Boolean feeField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("feeField005")
    private BigDecimal feeField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("feeField006")
    private BigDecimal feeField006;

    @Size(max = 200)
    @JsonProperty("feeField007")
    private String feeField007;

    @DecimalMin(value = "0.00")
    @JsonProperty("feeField008")
    private BigDecimal feeField008;

    @JsonProperty("feeField009")
    private Long feeField009;

    @Size(max = 40)
    @JsonProperty("feeField010")
    private String feeField010;

    @JsonProperty("feeField011")
    private Double feeField011;

    @JsonProperty("feeField012")
    private LocalDate feeField012;

    @DecimalMin(value = "0.00")
    @JsonProperty("feeField013")
    private BigDecimal feeField013;

    @JsonProperty("feeField014")
    private Long feeField014;

    @JsonProperty("feeField015")
    private LocalDate feeField015;

    @DecimalMin(value = "0.00")
    @JsonProperty("feeField016")
    private BigDecimal feeField016;

    @JsonProperty("feeField017")
    private LocalDate feeField017;

    public FeeDto058() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final FeeDto058 instance = new FeeDto058();

        public Builder feeField000(Double val) { instance.feeField000 = val; return this; }
        public Builder feeField001(Long val) { instance.feeField001 = val; return this; }
        public Builder feeField002(Double val) { instance.feeField002 = val; return this; }
        public Builder feeField003(Integer val) { instance.feeField003 = val; return this; }
        public Builder feeField004(Boolean val) { instance.feeField004 = val; return this; }
        public Builder feeField005(BigDecimal val) { instance.feeField005 = val; return this; }
        public Builder feeField006(BigDecimal val) { instance.feeField006 = val; return this; }
        public Builder feeField007(String val) { instance.feeField007 = val; return this; }
        public Builder feeField008(BigDecimal val) { instance.feeField008 = val; return this; }
        public Builder feeField009(Long val) { instance.feeField009 = val; return this; }
        public Builder feeField010(String val) { instance.feeField010 = val; return this; }
        public Builder feeField011(Double val) { instance.feeField011 = val; return this; }
        public Builder feeField012(LocalDate val) { instance.feeField012 = val; return this; }
        public Builder feeField013(BigDecimal val) { instance.feeField013 = val; return this; }
        public Builder feeField014(Long val) { instance.feeField014 = val; return this; }
        public Builder feeField015(LocalDate val) { instance.feeField015 = val; return this; }
        public Builder feeField016(BigDecimal val) { instance.feeField016 = val; return this; }
        public Builder feeField017(LocalDate val) { instance.feeField017 = val; return this; }
        public FeeDto058 build() { return instance; }
    }

    public Double getFeeField000() { return feeField000; }
    public void setFeeField000(Double feeField000) { this.feeField000 = feeField000; }

    public Long getFeeField001() { return feeField001; }
    public void setFeeField001(Long feeField001) { this.feeField001 = feeField001; }

    public Double getFeeField002() { return feeField002; }
    public void setFeeField002(Double feeField002) { this.feeField002 = feeField002; }

    public Integer getFeeField003() { return feeField003; }
    public void setFeeField003(Integer feeField003) { this.feeField003 = feeField003; }

    public Boolean getFeeField004() { return feeField004; }
    public void setFeeField004(Boolean feeField004) { this.feeField004 = feeField004; }

    public BigDecimal getFeeField005() { return feeField005; }
    public void setFeeField005(BigDecimal feeField005) { this.feeField005 = feeField005; }

    public BigDecimal getFeeField006() { return feeField006; }
    public void setFeeField006(BigDecimal feeField006) { this.feeField006 = feeField006; }

    public String getFeeField007() { return feeField007; }
    public void setFeeField007(String feeField007) { this.feeField007 = feeField007; }

    public BigDecimal getFeeField008() { return feeField008; }
    public void setFeeField008(BigDecimal feeField008) { this.feeField008 = feeField008; }

    public Long getFeeField009() { return feeField009; }
    public void setFeeField009(Long feeField009) { this.feeField009 = feeField009; }

    public String getFeeField010() { return feeField010; }
    public void setFeeField010(String feeField010) { this.feeField010 = feeField010; }

    public Double getFeeField011() { return feeField011; }
    public void setFeeField011(Double feeField011) { this.feeField011 = feeField011; }

    public LocalDate getFeeField012() { return feeField012; }
    public void setFeeField012(LocalDate feeField012) { this.feeField012 = feeField012; }

    public BigDecimal getFeeField013() { return feeField013; }
    public void setFeeField013(BigDecimal feeField013) { this.feeField013 = feeField013; }

    public Long getFeeField014() { return feeField014; }
    public void setFeeField014(Long feeField014) { this.feeField014 = feeField014; }

    public LocalDate getFeeField015() { return feeField015; }
    public void setFeeField015(LocalDate feeField015) { this.feeField015 = feeField015; }

    public BigDecimal getFeeField016() { return feeField016; }
    public void setFeeField016(BigDecimal feeField016) { this.feeField016 = feeField016; }

    public LocalDate getFeeField017() { return feeField017; }
    public void setFeeField017(LocalDate feeField017) { this.feeField017 = feeField017; }

    @Override
    public String toString() {
        return "FeeDto058{" +
            "feeField000=" + feeField000 + ", " +
            "feeField001=" + feeField001 + ", " +
            "feeField002=" + feeField002 + ", " +
            "feeField003=" + feeField003 + ", " +
            "feeField004=" + feeField004 + ", " +
            "}";
    }
}
