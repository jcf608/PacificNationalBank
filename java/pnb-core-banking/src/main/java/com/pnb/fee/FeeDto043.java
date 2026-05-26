package com.pnb.fee;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * FeeDto043 — Data Transfer Object for fee operations.
 * Variant 43 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FeeDto043 {

    @JsonProperty("feeField000")
    private Long feeField000;

    @JsonProperty("feeField001")
    private Double feeField001;

    @JsonProperty("feeField002")
    private LocalDate feeField002;

    @JsonProperty("feeField003")
    private Integer feeField003;

    @JsonProperty("feeField004")
    private Integer feeField004;

    @JsonProperty("feeField005")
    private Integer feeField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("feeField006")
    private BigDecimal feeField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("feeField007")
    private BigDecimal feeField007;

    @JsonProperty("feeField008")
    private Long feeField008;

    @Size(max = 40)
    @JsonProperty("feeField009")
    private String feeField009;

    @JsonProperty("feeField010")
    private Long feeField010;

    @JsonProperty("feeField011")
    private Boolean feeField011;

    @JsonProperty("feeField012")
    private Boolean feeField012;

    @JsonProperty("feeField013")
    private Long feeField013;

    @JsonProperty("feeField014")
    private Integer feeField014;

    public FeeDto043() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final FeeDto043 instance = new FeeDto043();

        public Builder feeField000(Long val) { instance.feeField000 = val; return this; }
        public Builder feeField001(Double val) { instance.feeField001 = val; return this; }
        public Builder feeField002(LocalDate val) { instance.feeField002 = val; return this; }
        public Builder feeField003(Integer val) { instance.feeField003 = val; return this; }
        public Builder feeField004(Integer val) { instance.feeField004 = val; return this; }
        public Builder feeField005(Integer val) { instance.feeField005 = val; return this; }
        public Builder feeField006(BigDecimal val) { instance.feeField006 = val; return this; }
        public Builder feeField007(BigDecimal val) { instance.feeField007 = val; return this; }
        public Builder feeField008(Long val) { instance.feeField008 = val; return this; }
        public Builder feeField009(String val) { instance.feeField009 = val; return this; }
        public Builder feeField010(Long val) { instance.feeField010 = val; return this; }
        public Builder feeField011(Boolean val) { instance.feeField011 = val; return this; }
        public Builder feeField012(Boolean val) { instance.feeField012 = val; return this; }
        public Builder feeField013(Long val) { instance.feeField013 = val; return this; }
        public Builder feeField014(Integer val) { instance.feeField014 = val; return this; }
        public FeeDto043 build() { return instance; }
    }

    public Long getFeeField000() { return feeField000; }
    public void setFeeField000(Long feeField000) { this.feeField000 = feeField000; }

    public Double getFeeField001() { return feeField001; }
    public void setFeeField001(Double feeField001) { this.feeField001 = feeField001; }

    public LocalDate getFeeField002() { return feeField002; }
    public void setFeeField002(LocalDate feeField002) { this.feeField002 = feeField002; }

    public Integer getFeeField003() { return feeField003; }
    public void setFeeField003(Integer feeField003) { this.feeField003 = feeField003; }

    public Integer getFeeField004() { return feeField004; }
    public void setFeeField004(Integer feeField004) { this.feeField004 = feeField004; }

    public Integer getFeeField005() { return feeField005; }
    public void setFeeField005(Integer feeField005) { this.feeField005 = feeField005; }

    public BigDecimal getFeeField006() { return feeField006; }
    public void setFeeField006(BigDecimal feeField006) { this.feeField006 = feeField006; }

    public BigDecimal getFeeField007() { return feeField007; }
    public void setFeeField007(BigDecimal feeField007) { this.feeField007 = feeField007; }

    public Long getFeeField008() { return feeField008; }
    public void setFeeField008(Long feeField008) { this.feeField008 = feeField008; }

    public String getFeeField009() { return feeField009; }
    public void setFeeField009(String feeField009) { this.feeField009 = feeField009; }

    public Long getFeeField010() { return feeField010; }
    public void setFeeField010(Long feeField010) { this.feeField010 = feeField010; }

    public Boolean getFeeField011() { return feeField011; }
    public void setFeeField011(Boolean feeField011) { this.feeField011 = feeField011; }

    public Boolean getFeeField012() { return feeField012; }
    public void setFeeField012(Boolean feeField012) { this.feeField012 = feeField012; }

    public Long getFeeField013() { return feeField013; }
    public void setFeeField013(Long feeField013) { this.feeField013 = feeField013; }

    public Integer getFeeField014() { return feeField014; }
    public void setFeeField014(Integer feeField014) { this.feeField014 = feeField014; }

    @Override
    public String toString() {
        return "FeeDto043{" +
            "feeField000=" + feeField000 + ", " +
            "feeField001=" + feeField001 + ", " +
            "feeField002=" + feeField002 + ", " +
            "feeField003=" + feeField003 + ", " +
            "feeField004=" + feeField004 + ", " +
            "}";
    }
}
