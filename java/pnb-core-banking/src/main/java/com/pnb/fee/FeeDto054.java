package com.pnb.fee;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * FeeDto054 — Data Transfer Object for fee operations.
 * Variant 54 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FeeDto054 {

    @DecimalMin(value = "0.00")
    @JsonProperty("feeField000")
    private BigDecimal feeField000;

    @DecimalMin(value = "0.00")
    @JsonProperty("feeField001")
    private BigDecimal feeField001;

    @Size(max = 60)
    @JsonProperty("feeField002")
    private String feeField002;

    @Size(max = 20)
    @JsonProperty("feeField003")
    private String feeField003;

    @JsonProperty("feeField004")
    private Double feeField004;

    @JsonProperty("feeField005")
    private Double feeField005;

    @JsonProperty("feeField006")
    private LocalDate feeField006;

    @JsonProperty("feeField007")
    private Boolean feeField007;

    @JsonProperty("feeField008")
    private LocalDate feeField008;

    @DecimalMin(value = "0.00")
    @JsonProperty("feeField009")
    private BigDecimal feeField009;

    @JsonProperty("feeField010")
    private LocalDate feeField010;

    @JsonProperty("feeField011")
    private Boolean feeField011;

    @JsonProperty("feeField012")
    private Long feeField012;

    @JsonProperty("feeField013")
    private Integer feeField013;

    public FeeDto054() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final FeeDto054 instance = new FeeDto054();

        public Builder feeField000(BigDecimal val) { instance.feeField000 = val; return this; }
        public Builder feeField001(BigDecimal val) { instance.feeField001 = val; return this; }
        public Builder feeField002(String val) { instance.feeField002 = val; return this; }
        public Builder feeField003(String val) { instance.feeField003 = val; return this; }
        public Builder feeField004(Double val) { instance.feeField004 = val; return this; }
        public Builder feeField005(Double val) { instance.feeField005 = val; return this; }
        public Builder feeField006(LocalDate val) { instance.feeField006 = val; return this; }
        public Builder feeField007(Boolean val) { instance.feeField007 = val; return this; }
        public Builder feeField008(LocalDate val) { instance.feeField008 = val; return this; }
        public Builder feeField009(BigDecimal val) { instance.feeField009 = val; return this; }
        public Builder feeField010(LocalDate val) { instance.feeField010 = val; return this; }
        public Builder feeField011(Boolean val) { instance.feeField011 = val; return this; }
        public Builder feeField012(Long val) { instance.feeField012 = val; return this; }
        public Builder feeField013(Integer val) { instance.feeField013 = val; return this; }
        public FeeDto054 build() { return instance; }
    }

    public BigDecimal getFeeField000() { return feeField000; }
    public void setFeeField000(BigDecimal feeField000) { this.feeField000 = feeField000; }

    public BigDecimal getFeeField001() { return feeField001; }
    public void setFeeField001(BigDecimal feeField001) { this.feeField001 = feeField001; }

    public String getFeeField002() { return feeField002; }
    public void setFeeField002(String feeField002) { this.feeField002 = feeField002; }

    public String getFeeField003() { return feeField003; }
    public void setFeeField003(String feeField003) { this.feeField003 = feeField003; }

    public Double getFeeField004() { return feeField004; }
    public void setFeeField004(Double feeField004) { this.feeField004 = feeField004; }

    public Double getFeeField005() { return feeField005; }
    public void setFeeField005(Double feeField005) { this.feeField005 = feeField005; }

    public LocalDate getFeeField006() { return feeField006; }
    public void setFeeField006(LocalDate feeField006) { this.feeField006 = feeField006; }

    public Boolean getFeeField007() { return feeField007; }
    public void setFeeField007(Boolean feeField007) { this.feeField007 = feeField007; }

    public LocalDate getFeeField008() { return feeField008; }
    public void setFeeField008(LocalDate feeField008) { this.feeField008 = feeField008; }

    public BigDecimal getFeeField009() { return feeField009; }
    public void setFeeField009(BigDecimal feeField009) { this.feeField009 = feeField009; }

    public LocalDate getFeeField010() { return feeField010; }
    public void setFeeField010(LocalDate feeField010) { this.feeField010 = feeField010; }

    public Boolean getFeeField011() { return feeField011; }
    public void setFeeField011(Boolean feeField011) { this.feeField011 = feeField011; }

    public Long getFeeField012() { return feeField012; }
    public void setFeeField012(Long feeField012) { this.feeField012 = feeField012; }

    public Integer getFeeField013() { return feeField013; }
    public void setFeeField013(Integer feeField013) { this.feeField013 = feeField013; }

    @Override
    public String toString() {
        return "FeeDto054{" +
            "feeField000=" + feeField000 + ", " +
            "feeField001=" + feeField001 + ", " +
            "feeField002=" + feeField002 + ", " +
            "feeField003=" + feeField003 + ", " +
            "feeField004=" + feeField004 + ", " +
            "}";
    }
}
