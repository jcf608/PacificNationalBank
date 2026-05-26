package com.pnb.fee;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * FeeDto045 — Data Transfer Object for fee operations.
 * Variant 45 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FeeDto045 {

    @JsonProperty("feeField000")
    private LocalDate feeField000;

    @Size(max = 60)
    @JsonProperty("feeField001")
    private String feeField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("feeField002")
    private BigDecimal feeField002;

    @JsonProperty("feeField003")
    private Long feeField003;

    @DecimalMin(value = "0.00")
    @JsonProperty("feeField004")
    private BigDecimal feeField004;

    @JsonProperty("feeField005")
    private Double feeField005;

    @JsonProperty("feeField006")
    private LocalDate feeField006;

    @Size(max = 20)
    @JsonProperty("feeField007")
    private String feeField007;

    @Size(max = 20)
    @JsonProperty("feeField008")
    private String feeField008;

    @JsonProperty("feeField009")
    private Boolean feeField009;

    @JsonProperty("feeField010")
    private Boolean feeField010;

    @JsonProperty("feeField011")
    private LocalDate feeField011;

    @JsonProperty("feeField012")
    private LocalDate feeField012;

    @JsonProperty("feeField013")
    private Double feeField013;

    @JsonProperty("feeField014")
    private Integer feeField014;

    @Size(max = 60)
    @JsonProperty("feeField015")
    private String feeField015;

    @JsonProperty("feeField016")
    private Integer feeField016;

    public FeeDto045() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final FeeDto045 instance = new FeeDto045();

        public Builder feeField000(LocalDate val) { instance.feeField000 = val; return this; }
        public Builder feeField001(String val) { instance.feeField001 = val; return this; }
        public Builder feeField002(BigDecimal val) { instance.feeField002 = val; return this; }
        public Builder feeField003(Long val) { instance.feeField003 = val; return this; }
        public Builder feeField004(BigDecimal val) { instance.feeField004 = val; return this; }
        public Builder feeField005(Double val) { instance.feeField005 = val; return this; }
        public Builder feeField006(LocalDate val) { instance.feeField006 = val; return this; }
        public Builder feeField007(String val) { instance.feeField007 = val; return this; }
        public Builder feeField008(String val) { instance.feeField008 = val; return this; }
        public Builder feeField009(Boolean val) { instance.feeField009 = val; return this; }
        public Builder feeField010(Boolean val) { instance.feeField010 = val; return this; }
        public Builder feeField011(LocalDate val) { instance.feeField011 = val; return this; }
        public Builder feeField012(LocalDate val) { instance.feeField012 = val; return this; }
        public Builder feeField013(Double val) { instance.feeField013 = val; return this; }
        public Builder feeField014(Integer val) { instance.feeField014 = val; return this; }
        public Builder feeField015(String val) { instance.feeField015 = val; return this; }
        public Builder feeField016(Integer val) { instance.feeField016 = val; return this; }
        public FeeDto045 build() { return instance; }
    }

    public LocalDate getFeeField000() { return feeField000; }
    public void setFeeField000(LocalDate feeField000) { this.feeField000 = feeField000; }

    public String getFeeField001() { return feeField001; }
    public void setFeeField001(String feeField001) { this.feeField001 = feeField001; }

    public BigDecimal getFeeField002() { return feeField002; }
    public void setFeeField002(BigDecimal feeField002) { this.feeField002 = feeField002; }

    public Long getFeeField003() { return feeField003; }
    public void setFeeField003(Long feeField003) { this.feeField003 = feeField003; }

    public BigDecimal getFeeField004() { return feeField004; }
    public void setFeeField004(BigDecimal feeField004) { this.feeField004 = feeField004; }

    public Double getFeeField005() { return feeField005; }
    public void setFeeField005(Double feeField005) { this.feeField005 = feeField005; }

    public LocalDate getFeeField006() { return feeField006; }
    public void setFeeField006(LocalDate feeField006) { this.feeField006 = feeField006; }

    public String getFeeField007() { return feeField007; }
    public void setFeeField007(String feeField007) { this.feeField007 = feeField007; }

    public String getFeeField008() { return feeField008; }
    public void setFeeField008(String feeField008) { this.feeField008 = feeField008; }

    public Boolean getFeeField009() { return feeField009; }
    public void setFeeField009(Boolean feeField009) { this.feeField009 = feeField009; }

    public Boolean getFeeField010() { return feeField010; }
    public void setFeeField010(Boolean feeField010) { this.feeField010 = feeField010; }

    public LocalDate getFeeField011() { return feeField011; }
    public void setFeeField011(LocalDate feeField011) { this.feeField011 = feeField011; }

    public LocalDate getFeeField012() { return feeField012; }
    public void setFeeField012(LocalDate feeField012) { this.feeField012 = feeField012; }

    public Double getFeeField013() { return feeField013; }
    public void setFeeField013(Double feeField013) { this.feeField013 = feeField013; }

    public Integer getFeeField014() { return feeField014; }
    public void setFeeField014(Integer feeField014) { this.feeField014 = feeField014; }

    public String getFeeField015() { return feeField015; }
    public void setFeeField015(String feeField015) { this.feeField015 = feeField015; }

    public Integer getFeeField016() { return feeField016; }
    public void setFeeField016(Integer feeField016) { this.feeField016 = feeField016; }

    @Override
    public String toString() {
        return "FeeDto045{" +
            "feeField000=" + feeField000 + ", " +
            "feeField001=" + feeField001 + ", " +
            "feeField002=" + feeField002 + ", " +
            "feeField003=" + feeField003 + ", " +
            "feeField004=" + feeField004 + ", " +
            "}";
    }
}
