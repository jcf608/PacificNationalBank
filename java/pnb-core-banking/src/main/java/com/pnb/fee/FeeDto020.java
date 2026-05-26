package com.pnb.fee;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * FeeDto020 — Data Transfer Object for fee operations.
 * Variant 20 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FeeDto020 {

    @DecimalMin(value = "0.00")
    @JsonProperty("feeField000")
    private BigDecimal feeField000;

    @JsonProperty("feeField001")
    private Integer feeField001;

    @JsonProperty("feeField002")
    private LocalDate feeField002;

    @JsonProperty("feeField003")
    private Long feeField003;

    @DecimalMin(value = "0.00")
    @JsonProperty("feeField004")
    private BigDecimal feeField004;

    @JsonProperty("feeField005")
    private Integer feeField005;

    @Size(max = 200)
    @JsonProperty("feeField006")
    private String feeField006;

    @Size(max = 60)
    @JsonProperty("feeField007")
    private String feeField007;

    @Size(max = 40)
    @JsonProperty("feeField008")
    private String feeField008;

    @JsonProperty("feeField009")
    private LocalDate feeField009;

    @JsonProperty("feeField010")
    private LocalDate feeField010;

    @JsonProperty("feeField011")
    private Boolean feeField011;

    @Size(max = 100)
    @JsonProperty("feeField012")
    private String feeField012;

    @Size(max = 60)
    @JsonProperty("feeField013")
    private String feeField013;

    @DecimalMin(value = "0.00")
    @JsonProperty("feeField014")
    private BigDecimal feeField014;

    @JsonProperty("feeField015")
    private Integer feeField015;

    public FeeDto020() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final FeeDto020 instance = new FeeDto020();

        public Builder feeField000(BigDecimal val) { instance.feeField000 = val; return this; }
        public Builder feeField001(Integer val) { instance.feeField001 = val; return this; }
        public Builder feeField002(LocalDate val) { instance.feeField002 = val; return this; }
        public Builder feeField003(Long val) { instance.feeField003 = val; return this; }
        public Builder feeField004(BigDecimal val) { instance.feeField004 = val; return this; }
        public Builder feeField005(Integer val) { instance.feeField005 = val; return this; }
        public Builder feeField006(String val) { instance.feeField006 = val; return this; }
        public Builder feeField007(String val) { instance.feeField007 = val; return this; }
        public Builder feeField008(String val) { instance.feeField008 = val; return this; }
        public Builder feeField009(LocalDate val) { instance.feeField009 = val; return this; }
        public Builder feeField010(LocalDate val) { instance.feeField010 = val; return this; }
        public Builder feeField011(Boolean val) { instance.feeField011 = val; return this; }
        public Builder feeField012(String val) { instance.feeField012 = val; return this; }
        public Builder feeField013(String val) { instance.feeField013 = val; return this; }
        public Builder feeField014(BigDecimal val) { instance.feeField014 = val; return this; }
        public Builder feeField015(Integer val) { instance.feeField015 = val; return this; }
        public FeeDto020 build() { return instance; }
    }

    public BigDecimal getFeeField000() { return feeField000; }
    public void setFeeField000(BigDecimal feeField000) { this.feeField000 = feeField000; }

    public Integer getFeeField001() { return feeField001; }
    public void setFeeField001(Integer feeField001) { this.feeField001 = feeField001; }

    public LocalDate getFeeField002() { return feeField002; }
    public void setFeeField002(LocalDate feeField002) { this.feeField002 = feeField002; }

    public Long getFeeField003() { return feeField003; }
    public void setFeeField003(Long feeField003) { this.feeField003 = feeField003; }

    public BigDecimal getFeeField004() { return feeField004; }
    public void setFeeField004(BigDecimal feeField004) { this.feeField004 = feeField004; }

    public Integer getFeeField005() { return feeField005; }
    public void setFeeField005(Integer feeField005) { this.feeField005 = feeField005; }

    public String getFeeField006() { return feeField006; }
    public void setFeeField006(String feeField006) { this.feeField006 = feeField006; }

    public String getFeeField007() { return feeField007; }
    public void setFeeField007(String feeField007) { this.feeField007 = feeField007; }

    public String getFeeField008() { return feeField008; }
    public void setFeeField008(String feeField008) { this.feeField008 = feeField008; }

    public LocalDate getFeeField009() { return feeField009; }
    public void setFeeField009(LocalDate feeField009) { this.feeField009 = feeField009; }

    public LocalDate getFeeField010() { return feeField010; }
    public void setFeeField010(LocalDate feeField010) { this.feeField010 = feeField010; }

    public Boolean getFeeField011() { return feeField011; }
    public void setFeeField011(Boolean feeField011) { this.feeField011 = feeField011; }

    public String getFeeField012() { return feeField012; }
    public void setFeeField012(String feeField012) { this.feeField012 = feeField012; }

    public String getFeeField013() { return feeField013; }
    public void setFeeField013(String feeField013) { this.feeField013 = feeField013; }

    public BigDecimal getFeeField014() { return feeField014; }
    public void setFeeField014(BigDecimal feeField014) { this.feeField014 = feeField014; }

    public Integer getFeeField015() { return feeField015; }
    public void setFeeField015(Integer feeField015) { this.feeField015 = feeField015; }

    @Override
    public String toString() {
        return "FeeDto020{" +
            "feeField000=" + feeField000 + ", " +
            "feeField001=" + feeField001 + ", " +
            "feeField002=" + feeField002 + ", " +
            "feeField003=" + feeField003 + ", " +
            "feeField004=" + feeField004 + ", " +
            "}";
    }
}
