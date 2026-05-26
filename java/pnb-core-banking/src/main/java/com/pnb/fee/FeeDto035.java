package com.pnb.fee;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * FeeDto035 — Data Transfer Object for fee operations.
 * Variant 35 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FeeDto035 {

    @JsonProperty("feeField000")
    private Long feeField000;

    @Size(max = 20)
    @JsonProperty("feeField001")
    private String feeField001;

    @JsonProperty("feeField002")
    private Boolean feeField002;

    @JsonProperty("feeField003")
    private Integer feeField003;

    @JsonProperty("feeField004")
    private Integer feeField004;

    @JsonProperty("feeField005")
    private Boolean feeField005;

    @Size(max = 200)
    @JsonProperty("feeField006")
    private String feeField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("feeField007")
    private BigDecimal feeField007;

    @JsonProperty("feeField008")
    private Integer feeField008;

    @JsonProperty("feeField009")
    private Double feeField009;

    @DecimalMin(value = "0.00")
    @JsonProperty("feeField010")
    private BigDecimal feeField010;

    @JsonProperty("feeField011")
    private LocalDate feeField011;

    @JsonProperty("feeField012")
    private LocalDate feeField012;

    @JsonProperty("feeField013")
    private Long feeField013;

    @Size(max = 40)
    @JsonProperty("feeField014")
    private String feeField014;

    @JsonProperty("feeField015")
    private Long feeField015;

    @JsonProperty("feeField016")
    private Double feeField016;

    @DecimalMin(value = "0.00")
    @JsonProperty("feeField017")
    private BigDecimal feeField017;

    @JsonProperty("feeField018")
    private Integer feeField018;

    public FeeDto035() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final FeeDto035 instance = new FeeDto035();

        public Builder feeField000(Long val) { instance.feeField000 = val; return this; }
        public Builder feeField001(String val) { instance.feeField001 = val; return this; }
        public Builder feeField002(Boolean val) { instance.feeField002 = val; return this; }
        public Builder feeField003(Integer val) { instance.feeField003 = val; return this; }
        public Builder feeField004(Integer val) { instance.feeField004 = val; return this; }
        public Builder feeField005(Boolean val) { instance.feeField005 = val; return this; }
        public Builder feeField006(String val) { instance.feeField006 = val; return this; }
        public Builder feeField007(BigDecimal val) { instance.feeField007 = val; return this; }
        public Builder feeField008(Integer val) { instance.feeField008 = val; return this; }
        public Builder feeField009(Double val) { instance.feeField009 = val; return this; }
        public Builder feeField010(BigDecimal val) { instance.feeField010 = val; return this; }
        public Builder feeField011(LocalDate val) { instance.feeField011 = val; return this; }
        public Builder feeField012(LocalDate val) { instance.feeField012 = val; return this; }
        public Builder feeField013(Long val) { instance.feeField013 = val; return this; }
        public Builder feeField014(String val) { instance.feeField014 = val; return this; }
        public Builder feeField015(Long val) { instance.feeField015 = val; return this; }
        public Builder feeField016(Double val) { instance.feeField016 = val; return this; }
        public Builder feeField017(BigDecimal val) { instance.feeField017 = val; return this; }
        public Builder feeField018(Integer val) { instance.feeField018 = val; return this; }
        public FeeDto035 build() { return instance; }
    }

    public Long getFeeField000() { return feeField000; }
    public void setFeeField000(Long feeField000) { this.feeField000 = feeField000; }

    public String getFeeField001() { return feeField001; }
    public void setFeeField001(String feeField001) { this.feeField001 = feeField001; }

    public Boolean getFeeField002() { return feeField002; }
    public void setFeeField002(Boolean feeField002) { this.feeField002 = feeField002; }

    public Integer getFeeField003() { return feeField003; }
    public void setFeeField003(Integer feeField003) { this.feeField003 = feeField003; }

    public Integer getFeeField004() { return feeField004; }
    public void setFeeField004(Integer feeField004) { this.feeField004 = feeField004; }

    public Boolean getFeeField005() { return feeField005; }
    public void setFeeField005(Boolean feeField005) { this.feeField005 = feeField005; }

    public String getFeeField006() { return feeField006; }
    public void setFeeField006(String feeField006) { this.feeField006 = feeField006; }

    public BigDecimal getFeeField007() { return feeField007; }
    public void setFeeField007(BigDecimal feeField007) { this.feeField007 = feeField007; }

    public Integer getFeeField008() { return feeField008; }
    public void setFeeField008(Integer feeField008) { this.feeField008 = feeField008; }

    public Double getFeeField009() { return feeField009; }
    public void setFeeField009(Double feeField009) { this.feeField009 = feeField009; }

    public BigDecimal getFeeField010() { return feeField010; }
    public void setFeeField010(BigDecimal feeField010) { this.feeField010 = feeField010; }

    public LocalDate getFeeField011() { return feeField011; }
    public void setFeeField011(LocalDate feeField011) { this.feeField011 = feeField011; }

    public LocalDate getFeeField012() { return feeField012; }
    public void setFeeField012(LocalDate feeField012) { this.feeField012 = feeField012; }

    public Long getFeeField013() { return feeField013; }
    public void setFeeField013(Long feeField013) { this.feeField013 = feeField013; }

    public String getFeeField014() { return feeField014; }
    public void setFeeField014(String feeField014) { this.feeField014 = feeField014; }

    public Long getFeeField015() { return feeField015; }
    public void setFeeField015(Long feeField015) { this.feeField015 = feeField015; }

    public Double getFeeField016() { return feeField016; }
    public void setFeeField016(Double feeField016) { this.feeField016 = feeField016; }

    public BigDecimal getFeeField017() { return feeField017; }
    public void setFeeField017(BigDecimal feeField017) { this.feeField017 = feeField017; }

    public Integer getFeeField018() { return feeField018; }
    public void setFeeField018(Integer feeField018) { this.feeField018 = feeField018; }

    @Override
    public String toString() {
        return "FeeDto035{" +
            "feeField000=" + feeField000 + ", " +
            "feeField001=" + feeField001 + ", " +
            "feeField002=" + feeField002 + ", " +
            "feeField003=" + feeField003 + ", " +
            "feeField004=" + feeField004 + ", " +
            "}";
    }
}
