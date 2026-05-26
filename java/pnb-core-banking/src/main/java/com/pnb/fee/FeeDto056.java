package com.pnb.fee;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * FeeDto056 — Data Transfer Object for fee operations.
 * Variant 56 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FeeDto056 {

    @JsonProperty("feeField000")
    private Double feeField000;

    @JsonProperty("feeField001")
    private Double feeField001;

    @JsonProperty("feeField002")
    private Boolean feeField002;

    @DecimalMin(value = "0.00")
    @JsonProperty("feeField003")
    private BigDecimal feeField003;

    @JsonProperty("feeField004")
    private Boolean feeField004;

    @JsonProperty("feeField005")
    private Double feeField005;

    @JsonProperty("feeField006")
    private Integer feeField006;

    @JsonProperty("feeField007")
    private Double feeField007;

    @DecimalMin(value = "0.00")
    @JsonProperty("feeField008")
    private BigDecimal feeField008;

    @JsonProperty("feeField009")
    private Double feeField009;

    @Size(max = 40)
    @JsonProperty("feeField010")
    private String feeField010;

    @Size(max = 60)
    @JsonProperty("feeField011")
    private String feeField011;

    @Size(max = 60)
    @JsonProperty("feeField012")
    private String feeField012;

    @JsonProperty("feeField013")
    private Integer feeField013;

    @JsonProperty("feeField014")
    private Double feeField014;

    @JsonProperty("feeField015")
    private Long feeField015;

    public FeeDto056() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final FeeDto056 instance = new FeeDto056();

        public Builder feeField000(Double val) { instance.feeField000 = val; return this; }
        public Builder feeField001(Double val) { instance.feeField001 = val; return this; }
        public Builder feeField002(Boolean val) { instance.feeField002 = val; return this; }
        public Builder feeField003(BigDecimal val) { instance.feeField003 = val; return this; }
        public Builder feeField004(Boolean val) { instance.feeField004 = val; return this; }
        public Builder feeField005(Double val) { instance.feeField005 = val; return this; }
        public Builder feeField006(Integer val) { instance.feeField006 = val; return this; }
        public Builder feeField007(Double val) { instance.feeField007 = val; return this; }
        public Builder feeField008(BigDecimal val) { instance.feeField008 = val; return this; }
        public Builder feeField009(Double val) { instance.feeField009 = val; return this; }
        public Builder feeField010(String val) { instance.feeField010 = val; return this; }
        public Builder feeField011(String val) { instance.feeField011 = val; return this; }
        public Builder feeField012(String val) { instance.feeField012 = val; return this; }
        public Builder feeField013(Integer val) { instance.feeField013 = val; return this; }
        public Builder feeField014(Double val) { instance.feeField014 = val; return this; }
        public Builder feeField015(Long val) { instance.feeField015 = val; return this; }
        public FeeDto056 build() { return instance; }
    }

    public Double getFeeField000() { return feeField000; }
    public void setFeeField000(Double feeField000) { this.feeField000 = feeField000; }

    public Double getFeeField001() { return feeField001; }
    public void setFeeField001(Double feeField001) { this.feeField001 = feeField001; }

    public Boolean getFeeField002() { return feeField002; }
    public void setFeeField002(Boolean feeField002) { this.feeField002 = feeField002; }

    public BigDecimal getFeeField003() { return feeField003; }
    public void setFeeField003(BigDecimal feeField003) { this.feeField003 = feeField003; }

    public Boolean getFeeField004() { return feeField004; }
    public void setFeeField004(Boolean feeField004) { this.feeField004 = feeField004; }

    public Double getFeeField005() { return feeField005; }
    public void setFeeField005(Double feeField005) { this.feeField005 = feeField005; }

    public Integer getFeeField006() { return feeField006; }
    public void setFeeField006(Integer feeField006) { this.feeField006 = feeField006; }

    public Double getFeeField007() { return feeField007; }
    public void setFeeField007(Double feeField007) { this.feeField007 = feeField007; }

    public BigDecimal getFeeField008() { return feeField008; }
    public void setFeeField008(BigDecimal feeField008) { this.feeField008 = feeField008; }

    public Double getFeeField009() { return feeField009; }
    public void setFeeField009(Double feeField009) { this.feeField009 = feeField009; }

    public String getFeeField010() { return feeField010; }
    public void setFeeField010(String feeField010) { this.feeField010 = feeField010; }

    public String getFeeField011() { return feeField011; }
    public void setFeeField011(String feeField011) { this.feeField011 = feeField011; }

    public String getFeeField012() { return feeField012; }
    public void setFeeField012(String feeField012) { this.feeField012 = feeField012; }

    public Integer getFeeField013() { return feeField013; }
    public void setFeeField013(Integer feeField013) { this.feeField013 = feeField013; }

    public Double getFeeField014() { return feeField014; }
    public void setFeeField014(Double feeField014) { this.feeField014 = feeField014; }

    public Long getFeeField015() { return feeField015; }
    public void setFeeField015(Long feeField015) { this.feeField015 = feeField015; }

    @Override
    public String toString() {
        return "FeeDto056{" +
            "feeField000=" + feeField000 + ", " +
            "feeField001=" + feeField001 + ", " +
            "feeField002=" + feeField002 + ", " +
            "feeField003=" + feeField003 + ", " +
            "feeField004=" + feeField004 + ", " +
            "}";
    }
}
