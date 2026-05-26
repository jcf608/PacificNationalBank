package com.pnb.fee;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * FeeDto022 — Data Transfer Object for fee operations.
 * Variant 22 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FeeDto022 {

    @Size(max = 60)
    @JsonProperty("feeField000")
    private String feeField000;

    @JsonProperty("feeField001")
    private LocalDate feeField001;

    @JsonProperty("feeField002")
    private Boolean feeField002;

    @JsonProperty("feeField003")
    private Double feeField003;

    @JsonProperty("feeField004")
    private Integer feeField004;

    @JsonProperty("feeField005")
    private Long feeField005;

    @JsonProperty("feeField006")
    private Double feeField006;

    @JsonProperty("feeField007")
    private Boolean feeField007;

    @Size(max = 20)
    @JsonProperty("feeField008")
    private String feeField008;

    @JsonProperty("feeField009")
    private Boolean feeField009;

    @JsonProperty("feeField010")
    private LocalDate feeField010;

    @JsonProperty("feeField011")
    private Boolean feeField011;

    @JsonProperty("feeField012")
    private Boolean feeField012;

    @JsonProperty("feeField013")
    private Long feeField013;

    @DecimalMin(value = "0.00")
    @JsonProperty("feeField014")
    private BigDecimal feeField014;

    @JsonProperty("feeField015")
    private Double feeField015;

    @JsonProperty("feeField016")
    private Double feeField016;

    @JsonProperty("feeField017")
    private Double feeField017;

    public FeeDto022() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final FeeDto022 instance = new FeeDto022();

        public Builder feeField000(String val) { instance.feeField000 = val; return this; }
        public Builder feeField001(LocalDate val) { instance.feeField001 = val; return this; }
        public Builder feeField002(Boolean val) { instance.feeField002 = val; return this; }
        public Builder feeField003(Double val) { instance.feeField003 = val; return this; }
        public Builder feeField004(Integer val) { instance.feeField004 = val; return this; }
        public Builder feeField005(Long val) { instance.feeField005 = val; return this; }
        public Builder feeField006(Double val) { instance.feeField006 = val; return this; }
        public Builder feeField007(Boolean val) { instance.feeField007 = val; return this; }
        public Builder feeField008(String val) { instance.feeField008 = val; return this; }
        public Builder feeField009(Boolean val) { instance.feeField009 = val; return this; }
        public Builder feeField010(LocalDate val) { instance.feeField010 = val; return this; }
        public Builder feeField011(Boolean val) { instance.feeField011 = val; return this; }
        public Builder feeField012(Boolean val) { instance.feeField012 = val; return this; }
        public Builder feeField013(Long val) { instance.feeField013 = val; return this; }
        public Builder feeField014(BigDecimal val) { instance.feeField014 = val; return this; }
        public Builder feeField015(Double val) { instance.feeField015 = val; return this; }
        public Builder feeField016(Double val) { instance.feeField016 = val; return this; }
        public Builder feeField017(Double val) { instance.feeField017 = val; return this; }
        public FeeDto022 build() { return instance; }
    }

    public String getFeeField000() { return feeField000; }
    public void setFeeField000(String feeField000) { this.feeField000 = feeField000; }

    public LocalDate getFeeField001() { return feeField001; }
    public void setFeeField001(LocalDate feeField001) { this.feeField001 = feeField001; }

    public Boolean getFeeField002() { return feeField002; }
    public void setFeeField002(Boolean feeField002) { this.feeField002 = feeField002; }

    public Double getFeeField003() { return feeField003; }
    public void setFeeField003(Double feeField003) { this.feeField003 = feeField003; }

    public Integer getFeeField004() { return feeField004; }
    public void setFeeField004(Integer feeField004) { this.feeField004 = feeField004; }

    public Long getFeeField005() { return feeField005; }
    public void setFeeField005(Long feeField005) { this.feeField005 = feeField005; }

    public Double getFeeField006() { return feeField006; }
    public void setFeeField006(Double feeField006) { this.feeField006 = feeField006; }

    public Boolean getFeeField007() { return feeField007; }
    public void setFeeField007(Boolean feeField007) { this.feeField007 = feeField007; }

    public String getFeeField008() { return feeField008; }
    public void setFeeField008(String feeField008) { this.feeField008 = feeField008; }

    public Boolean getFeeField009() { return feeField009; }
    public void setFeeField009(Boolean feeField009) { this.feeField009 = feeField009; }

    public LocalDate getFeeField010() { return feeField010; }
    public void setFeeField010(LocalDate feeField010) { this.feeField010 = feeField010; }

    public Boolean getFeeField011() { return feeField011; }
    public void setFeeField011(Boolean feeField011) { this.feeField011 = feeField011; }

    public Boolean getFeeField012() { return feeField012; }
    public void setFeeField012(Boolean feeField012) { this.feeField012 = feeField012; }

    public Long getFeeField013() { return feeField013; }
    public void setFeeField013(Long feeField013) { this.feeField013 = feeField013; }

    public BigDecimal getFeeField014() { return feeField014; }
    public void setFeeField014(BigDecimal feeField014) { this.feeField014 = feeField014; }

    public Double getFeeField015() { return feeField015; }
    public void setFeeField015(Double feeField015) { this.feeField015 = feeField015; }

    public Double getFeeField016() { return feeField016; }
    public void setFeeField016(Double feeField016) { this.feeField016 = feeField016; }

    public Double getFeeField017() { return feeField017; }
    public void setFeeField017(Double feeField017) { this.feeField017 = feeField017; }

    @Override
    public String toString() {
        return "FeeDto022{" +
            "feeField000=" + feeField000 + ", " +
            "feeField001=" + feeField001 + ", " +
            "feeField002=" + feeField002 + ", " +
            "feeField003=" + feeField003 + ", " +
            "feeField004=" + feeField004 + ", " +
            "}";
    }
}
