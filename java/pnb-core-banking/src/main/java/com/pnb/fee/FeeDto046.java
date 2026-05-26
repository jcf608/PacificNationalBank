package com.pnb.fee;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * FeeDto046 — Data Transfer Object for fee operations.
 * Variant 46 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FeeDto046 {

    @JsonProperty("feeField000")
    private Integer feeField000;

    @Size(max = 100)
    @JsonProperty("feeField001")
    private String feeField001;

    @JsonProperty("feeField002")
    private LocalDate feeField002;

    @JsonProperty("feeField003")
    private Boolean feeField003;

    @DecimalMin(value = "0.00")
    @JsonProperty("feeField004")
    private BigDecimal feeField004;

    @JsonProperty("feeField005")
    private Long feeField005;

    @JsonProperty("feeField006")
    private Boolean feeField006;

    @JsonProperty("feeField007")
    private Boolean feeField007;

    @JsonProperty("feeField008")
    private Boolean feeField008;

    @JsonProperty("feeField009")
    private LocalDate feeField009;

    @JsonProperty("feeField010")
    private LocalDate feeField010;

    @JsonProperty("feeField011")
    private Double feeField011;

    @DecimalMin(value = "0.00")
    @JsonProperty("feeField012")
    private BigDecimal feeField012;

    @JsonProperty("feeField013")
    private Long feeField013;

    @JsonProperty("feeField014")
    private Double feeField014;

    @Size(max = 60)
    @JsonProperty("feeField015")
    private String feeField015;

    @JsonProperty("feeField016")
    private Double feeField016;

    @JsonProperty("feeField017")
    private Long feeField017;

    public FeeDto046() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final FeeDto046 instance = new FeeDto046();

        public Builder feeField000(Integer val) { instance.feeField000 = val; return this; }
        public Builder feeField001(String val) { instance.feeField001 = val; return this; }
        public Builder feeField002(LocalDate val) { instance.feeField002 = val; return this; }
        public Builder feeField003(Boolean val) { instance.feeField003 = val; return this; }
        public Builder feeField004(BigDecimal val) { instance.feeField004 = val; return this; }
        public Builder feeField005(Long val) { instance.feeField005 = val; return this; }
        public Builder feeField006(Boolean val) { instance.feeField006 = val; return this; }
        public Builder feeField007(Boolean val) { instance.feeField007 = val; return this; }
        public Builder feeField008(Boolean val) { instance.feeField008 = val; return this; }
        public Builder feeField009(LocalDate val) { instance.feeField009 = val; return this; }
        public Builder feeField010(LocalDate val) { instance.feeField010 = val; return this; }
        public Builder feeField011(Double val) { instance.feeField011 = val; return this; }
        public Builder feeField012(BigDecimal val) { instance.feeField012 = val; return this; }
        public Builder feeField013(Long val) { instance.feeField013 = val; return this; }
        public Builder feeField014(Double val) { instance.feeField014 = val; return this; }
        public Builder feeField015(String val) { instance.feeField015 = val; return this; }
        public Builder feeField016(Double val) { instance.feeField016 = val; return this; }
        public Builder feeField017(Long val) { instance.feeField017 = val; return this; }
        public FeeDto046 build() { return instance; }
    }

    public Integer getFeeField000() { return feeField000; }
    public void setFeeField000(Integer feeField000) { this.feeField000 = feeField000; }

    public String getFeeField001() { return feeField001; }
    public void setFeeField001(String feeField001) { this.feeField001 = feeField001; }

    public LocalDate getFeeField002() { return feeField002; }
    public void setFeeField002(LocalDate feeField002) { this.feeField002 = feeField002; }

    public Boolean getFeeField003() { return feeField003; }
    public void setFeeField003(Boolean feeField003) { this.feeField003 = feeField003; }

    public BigDecimal getFeeField004() { return feeField004; }
    public void setFeeField004(BigDecimal feeField004) { this.feeField004 = feeField004; }

    public Long getFeeField005() { return feeField005; }
    public void setFeeField005(Long feeField005) { this.feeField005 = feeField005; }

    public Boolean getFeeField006() { return feeField006; }
    public void setFeeField006(Boolean feeField006) { this.feeField006 = feeField006; }

    public Boolean getFeeField007() { return feeField007; }
    public void setFeeField007(Boolean feeField007) { this.feeField007 = feeField007; }

    public Boolean getFeeField008() { return feeField008; }
    public void setFeeField008(Boolean feeField008) { this.feeField008 = feeField008; }

    public LocalDate getFeeField009() { return feeField009; }
    public void setFeeField009(LocalDate feeField009) { this.feeField009 = feeField009; }

    public LocalDate getFeeField010() { return feeField010; }
    public void setFeeField010(LocalDate feeField010) { this.feeField010 = feeField010; }

    public Double getFeeField011() { return feeField011; }
    public void setFeeField011(Double feeField011) { this.feeField011 = feeField011; }

    public BigDecimal getFeeField012() { return feeField012; }
    public void setFeeField012(BigDecimal feeField012) { this.feeField012 = feeField012; }

    public Long getFeeField013() { return feeField013; }
    public void setFeeField013(Long feeField013) { this.feeField013 = feeField013; }

    public Double getFeeField014() { return feeField014; }
    public void setFeeField014(Double feeField014) { this.feeField014 = feeField014; }

    public String getFeeField015() { return feeField015; }
    public void setFeeField015(String feeField015) { this.feeField015 = feeField015; }

    public Double getFeeField016() { return feeField016; }
    public void setFeeField016(Double feeField016) { this.feeField016 = feeField016; }

    public Long getFeeField017() { return feeField017; }
    public void setFeeField017(Long feeField017) { this.feeField017 = feeField017; }

    @Override
    public String toString() {
        return "FeeDto046{" +
            "feeField000=" + feeField000 + ", " +
            "feeField001=" + feeField001 + ", " +
            "feeField002=" + feeField002 + ", " +
            "feeField003=" + feeField003 + ", " +
            "feeField004=" + feeField004 + ", " +
            "}";
    }
}
