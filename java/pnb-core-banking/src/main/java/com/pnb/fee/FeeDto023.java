package com.pnb.fee;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * FeeDto023 — Data Transfer Object for fee operations.
 * Variant 23 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FeeDto023 {

    @JsonProperty("feeField000")
    private Double feeField000;

    @Size(max = 60)
    @JsonProperty("feeField001")
    private String feeField001;

    @Size(max = 100)
    @JsonProperty("feeField002")
    private String feeField002;

    @JsonProperty("feeField003")
    private Boolean feeField003;

    @JsonProperty("feeField004")
    private Double feeField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("feeField005")
    private BigDecimal feeField005;

    @JsonProperty("feeField006")
    private Integer feeField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("feeField007")
    private BigDecimal feeField007;

    @DecimalMin(value = "0.00")
    @JsonProperty("feeField008")
    private BigDecimal feeField008;

    @JsonProperty("feeField009")
    private Long feeField009;

    @JsonProperty("feeField010")
    private Integer feeField010;

    @JsonProperty("feeField011")
    private Integer feeField011;

    @Size(max = 100)
    @JsonProperty("feeField012")
    private String feeField012;

    @JsonProperty("feeField013")
    private Double feeField013;

    @JsonProperty("feeField014")
    private Double feeField014;

    @JsonProperty("feeField015")
    private LocalDate feeField015;

    @JsonProperty("feeField016")
    private Integer feeField016;

    @JsonProperty("feeField017")
    private Boolean feeField017;

    @JsonProperty("feeField018")
    private LocalDate feeField018;

    public FeeDto023() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final FeeDto023 instance = new FeeDto023();

        public Builder feeField000(Double val) { instance.feeField000 = val; return this; }
        public Builder feeField001(String val) { instance.feeField001 = val; return this; }
        public Builder feeField002(String val) { instance.feeField002 = val; return this; }
        public Builder feeField003(Boolean val) { instance.feeField003 = val; return this; }
        public Builder feeField004(Double val) { instance.feeField004 = val; return this; }
        public Builder feeField005(BigDecimal val) { instance.feeField005 = val; return this; }
        public Builder feeField006(Integer val) { instance.feeField006 = val; return this; }
        public Builder feeField007(BigDecimal val) { instance.feeField007 = val; return this; }
        public Builder feeField008(BigDecimal val) { instance.feeField008 = val; return this; }
        public Builder feeField009(Long val) { instance.feeField009 = val; return this; }
        public Builder feeField010(Integer val) { instance.feeField010 = val; return this; }
        public Builder feeField011(Integer val) { instance.feeField011 = val; return this; }
        public Builder feeField012(String val) { instance.feeField012 = val; return this; }
        public Builder feeField013(Double val) { instance.feeField013 = val; return this; }
        public Builder feeField014(Double val) { instance.feeField014 = val; return this; }
        public Builder feeField015(LocalDate val) { instance.feeField015 = val; return this; }
        public Builder feeField016(Integer val) { instance.feeField016 = val; return this; }
        public Builder feeField017(Boolean val) { instance.feeField017 = val; return this; }
        public Builder feeField018(LocalDate val) { instance.feeField018 = val; return this; }
        public FeeDto023 build() { return instance; }
    }

    public Double getFeeField000() { return feeField000; }
    public void setFeeField000(Double feeField000) { this.feeField000 = feeField000; }

    public String getFeeField001() { return feeField001; }
    public void setFeeField001(String feeField001) { this.feeField001 = feeField001; }

    public String getFeeField002() { return feeField002; }
    public void setFeeField002(String feeField002) { this.feeField002 = feeField002; }

    public Boolean getFeeField003() { return feeField003; }
    public void setFeeField003(Boolean feeField003) { this.feeField003 = feeField003; }

    public Double getFeeField004() { return feeField004; }
    public void setFeeField004(Double feeField004) { this.feeField004 = feeField004; }

    public BigDecimal getFeeField005() { return feeField005; }
    public void setFeeField005(BigDecimal feeField005) { this.feeField005 = feeField005; }

    public Integer getFeeField006() { return feeField006; }
    public void setFeeField006(Integer feeField006) { this.feeField006 = feeField006; }

    public BigDecimal getFeeField007() { return feeField007; }
    public void setFeeField007(BigDecimal feeField007) { this.feeField007 = feeField007; }

    public BigDecimal getFeeField008() { return feeField008; }
    public void setFeeField008(BigDecimal feeField008) { this.feeField008 = feeField008; }

    public Long getFeeField009() { return feeField009; }
    public void setFeeField009(Long feeField009) { this.feeField009 = feeField009; }

    public Integer getFeeField010() { return feeField010; }
    public void setFeeField010(Integer feeField010) { this.feeField010 = feeField010; }

    public Integer getFeeField011() { return feeField011; }
    public void setFeeField011(Integer feeField011) { this.feeField011 = feeField011; }

    public String getFeeField012() { return feeField012; }
    public void setFeeField012(String feeField012) { this.feeField012 = feeField012; }

    public Double getFeeField013() { return feeField013; }
    public void setFeeField013(Double feeField013) { this.feeField013 = feeField013; }

    public Double getFeeField014() { return feeField014; }
    public void setFeeField014(Double feeField014) { this.feeField014 = feeField014; }

    public LocalDate getFeeField015() { return feeField015; }
    public void setFeeField015(LocalDate feeField015) { this.feeField015 = feeField015; }

    public Integer getFeeField016() { return feeField016; }
    public void setFeeField016(Integer feeField016) { this.feeField016 = feeField016; }

    public Boolean getFeeField017() { return feeField017; }
    public void setFeeField017(Boolean feeField017) { this.feeField017 = feeField017; }

    public LocalDate getFeeField018() { return feeField018; }
    public void setFeeField018(LocalDate feeField018) { this.feeField018 = feeField018; }

    @Override
    public String toString() {
        return "FeeDto023{" +
            "feeField000=" + feeField000 + ", " +
            "feeField001=" + feeField001 + ", " +
            "feeField002=" + feeField002 + ", " +
            "feeField003=" + feeField003 + ", " +
            "feeField004=" + feeField004 + ", " +
            "}";
    }
}
