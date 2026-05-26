package com.pnb.fee;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * FeeDto053 — Data Transfer Object for fee operations.
 * Variant 53 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FeeDto053 {

    @JsonProperty("feeField000")
    private Boolean feeField000;

    @JsonProperty("feeField001")
    private Long feeField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("feeField002")
    private BigDecimal feeField002;

    @JsonProperty("feeField003")
    private Long feeField003;

    @Size(max = 40)
    @JsonProperty("feeField004")
    private String feeField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("feeField005")
    private BigDecimal feeField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("feeField006")
    private BigDecimal feeField006;

    @JsonProperty("feeField007")
    private LocalDate feeField007;

    @JsonProperty("feeField008")
    private LocalDate feeField008;

    @JsonProperty("feeField009")
    private Integer feeField009;

    @DecimalMin(value = "0.00")
    @JsonProperty("feeField010")
    private BigDecimal feeField010;

    @JsonProperty("feeField011")
    private Integer feeField011;

    @JsonProperty("feeField012")
    private Long feeField012;

    public FeeDto053() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final FeeDto053 instance = new FeeDto053();

        public Builder feeField000(Boolean val) { instance.feeField000 = val; return this; }
        public Builder feeField001(Long val) { instance.feeField001 = val; return this; }
        public Builder feeField002(BigDecimal val) { instance.feeField002 = val; return this; }
        public Builder feeField003(Long val) { instance.feeField003 = val; return this; }
        public Builder feeField004(String val) { instance.feeField004 = val; return this; }
        public Builder feeField005(BigDecimal val) { instance.feeField005 = val; return this; }
        public Builder feeField006(BigDecimal val) { instance.feeField006 = val; return this; }
        public Builder feeField007(LocalDate val) { instance.feeField007 = val; return this; }
        public Builder feeField008(LocalDate val) { instance.feeField008 = val; return this; }
        public Builder feeField009(Integer val) { instance.feeField009 = val; return this; }
        public Builder feeField010(BigDecimal val) { instance.feeField010 = val; return this; }
        public Builder feeField011(Integer val) { instance.feeField011 = val; return this; }
        public Builder feeField012(Long val) { instance.feeField012 = val; return this; }
        public FeeDto053 build() { return instance; }
    }

    public Boolean getFeeField000() { return feeField000; }
    public void setFeeField000(Boolean feeField000) { this.feeField000 = feeField000; }

    public Long getFeeField001() { return feeField001; }
    public void setFeeField001(Long feeField001) { this.feeField001 = feeField001; }

    public BigDecimal getFeeField002() { return feeField002; }
    public void setFeeField002(BigDecimal feeField002) { this.feeField002 = feeField002; }

    public Long getFeeField003() { return feeField003; }
    public void setFeeField003(Long feeField003) { this.feeField003 = feeField003; }

    public String getFeeField004() { return feeField004; }
    public void setFeeField004(String feeField004) { this.feeField004 = feeField004; }

    public BigDecimal getFeeField005() { return feeField005; }
    public void setFeeField005(BigDecimal feeField005) { this.feeField005 = feeField005; }

    public BigDecimal getFeeField006() { return feeField006; }
    public void setFeeField006(BigDecimal feeField006) { this.feeField006 = feeField006; }

    public LocalDate getFeeField007() { return feeField007; }
    public void setFeeField007(LocalDate feeField007) { this.feeField007 = feeField007; }

    public LocalDate getFeeField008() { return feeField008; }
    public void setFeeField008(LocalDate feeField008) { this.feeField008 = feeField008; }

    public Integer getFeeField009() { return feeField009; }
    public void setFeeField009(Integer feeField009) { this.feeField009 = feeField009; }

    public BigDecimal getFeeField010() { return feeField010; }
    public void setFeeField010(BigDecimal feeField010) { this.feeField010 = feeField010; }

    public Integer getFeeField011() { return feeField011; }
    public void setFeeField011(Integer feeField011) { this.feeField011 = feeField011; }

    public Long getFeeField012() { return feeField012; }
    public void setFeeField012(Long feeField012) { this.feeField012 = feeField012; }

    @Override
    public String toString() {
        return "FeeDto053{" +
            "feeField000=" + feeField000 + ", " +
            "feeField001=" + feeField001 + ", " +
            "feeField002=" + feeField002 + ", " +
            "feeField003=" + feeField003 + ", " +
            "feeField004=" + feeField004 + ", " +
            "}";
    }
}
