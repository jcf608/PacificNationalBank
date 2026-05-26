package com.pnb.fee;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * FeeDto042 — Data Transfer Object for fee operations.
 * Variant 42 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FeeDto042 {

    @JsonProperty("feeField000")
    private LocalDate feeField000;

    @JsonProperty("feeField001")
    private Double feeField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("feeField002")
    private BigDecimal feeField002;

    @JsonProperty("feeField003")
    private Integer feeField003;

    @Size(max = 200)
    @JsonProperty("feeField004")
    private String feeField004;

    @JsonProperty("feeField005")
    private Boolean feeField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("feeField006")
    private BigDecimal feeField006;

    @JsonProperty("feeField007")
    private Integer feeField007;

    @JsonProperty("feeField008")
    private LocalDate feeField008;

    @JsonProperty("feeField009")
    private Boolean feeField009;

    @JsonProperty("feeField010")
    private Double feeField010;

    @DecimalMin(value = "0.00")
    @JsonProperty("feeField011")
    private BigDecimal feeField011;

    @JsonProperty("feeField012")
    private Boolean feeField012;

    @DecimalMin(value = "0.00")
    @JsonProperty("feeField013")
    private BigDecimal feeField013;

    public FeeDto042() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final FeeDto042 instance = new FeeDto042();

        public Builder feeField000(LocalDate val) { instance.feeField000 = val; return this; }
        public Builder feeField001(Double val) { instance.feeField001 = val; return this; }
        public Builder feeField002(BigDecimal val) { instance.feeField002 = val; return this; }
        public Builder feeField003(Integer val) { instance.feeField003 = val; return this; }
        public Builder feeField004(String val) { instance.feeField004 = val; return this; }
        public Builder feeField005(Boolean val) { instance.feeField005 = val; return this; }
        public Builder feeField006(BigDecimal val) { instance.feeField006 = val; return this; }
        public Builder feeField007(Integer val) { instance.feeField007 = val; return this; }
        public Builder feeField008(LocalDate val) { instance.feeField008 = val; return this; }
        public Builder feeField009(Boolean val) { instance.feeField009 = val; return this; }
        public Builder feeField010(Double val) { instance.feeField010 = val; return this; }
        public Builder feeField011(BigDecimal val) { instance.feeField011 = val; return this; }
        public Builder feeField012(Boolean val) { instance.feeField012 = val; return this; }
        public Builder feeField013(BigDecimal val) { instance.feeField013 = val; return this; }
        public FeeDto042 build() { return instance; }
    }

    public LocalDate getFeeField000() { return feeField000; }
    public void setFeeField000(LocalDate feeField000) { this.feeField000 = feeField000; }

    public Double getFeeField001() { return feeField001; }
    public void setFeeField001(Double feeField001) { this.feeField001 = feeField001; }

    public BigDecimal getFeeField002() { return feeField002; }
    public void setFeeField002(BigDecimal feeField002) { this.feeField002 = feeField002; }

    public Integer getFeeField003() { return feeField003; }
    public void setFeeField003(Integer feeField003) { this.feeField003 = feeField003; }

    public String getFeeField004() { return feeField004; }
    public void setFeeField004(String feeField004) { this.feeField004 = feeField004; }

    public Boolean getFeeField005() { return feeField005; }
    public void setFeeField005(Boolean feeField005) { this.feeField005 = feeField005; }

    public BigDecimal getFeeField006() { return feeField006; }
    public void setFeeField006(BigDecimal feeField006) { this.feeField006 = feeField006; }

    public Integer getFeeField007() { return feeField007; }
    public void setFeeField007(Integer feeField007) { this.feeField007 = feeField007; }

    public LocalDate getFeeField008() { return feeField008; }
    public void setFeeField008(LocalDate feeField008) { this.feeField008 = feeField008; }

    public Boolean getFeeField009() { return feeField009; }
    public void setFeeField009(Boolean feeField009) { this.feeField009 = feeField009; }

    public Double getFeeField010() { return feeField010; }
    public void setFeeField010(Double feeField010) { this.feeField010 = feeField010; }

    public BigDecimal getFeeField011() { return feeField011; }
    public void setFeeField011(BigDecimal feeField011) { this.feeField011 = feeField011; }

    public Boolean getFeeField012() { return feeField012; }
    public void setFeeField012(Boolean feeField012) { this.feeField012 = feeField012; }

    public BigDecimal getFeeField013() { return feeField013; }
    public void setFeeField013(BigDecimal feeField013) { this.feeField013 = feeField013; }

    @Override
    public String toString() {
        return "FeeDto042{" +
            "feeField000=" + feeField000 + ", " +
            "feeField001=" + feeField001 + ", " +
            "feeField002=" + feeField002 + ", " +
            "feeField003=" + feeField003 + ", " +
            "feeField004=" + feeField004 + ", " +
            "}";
    }
}
