package com.pnb.fee;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * FeeDto040 — Data Transfer Object for fee operations.
 * Variant 40 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FeeDto040 {

    @JsonProperty("feeField000")
    private Integer feeField000;

    @DecimalMin(value = "0.00")
    @JsonProperty("feeField001")
    private BigDecimal feeField001;

    @JsonProperty("feeField002")
    private Long feeField002;

    @JsonProperty("feeField003")
    private Boolean feeField003;

    @JsonProperty("feeField004")
    private Integer feeField004;

    @JsonProperty("feeField005")
    private Integer feeField005;

    @JsonProperty("feeField006")
    private Double feeField006;

    @JsonProperty("feeField007")
    private LocalDate feeField007;

    @JsonProperty("feeField008")
    private Long feeField008;

    @JsonProperty("feeField009")
    private Integer feeField009;

    @JsonProperty("feeField010")
    private Integer feeField010;

    @DecimalMin(value = "0.00")
    @JsonProperty("feeField011")
    private BigDecimal feeField011;

    public FeeDto040() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final FeeDto040 instance = new FeeDto040();

        public Builder feeField000(Integer val) { instance.feeField000 = val; return this; }
        public Builder feeField001(BigDecimal val) { instance.feeField001 = val; return this; }
        public Builder feeField002(Long val) { instance.feeField002 = val; return this; }
        public Builder feeField003(Boolean val) { instance.feeField003 = val; return this; }
        public Builder feeField004(Integer val) { instance.feeField004 = val; return this; }
        public Builder feeField005(Integer val) { instance.feeField005 = val; return this; }
        public Builder feeField006(Double val) { instance.feeField006 = val; return this; }
        public Builder feeField007(LocalDate val) { instance.feeField007 = val; return this; }
        public Builder feeField008(Long val) { instance.feeField008 = val; return this; }
        public Builder feeField009(Integer val) { instance.feeField009 = val; return this; }
        public Builder feeField010(Integer val) { instance.feeField010 = val; return this; }
        public Builder feeField011(BigDecimal val) { instance.feeField011 = val; return this; }
        public FeeDto040 build() { return instance; }
    }

    public Integer getFeeField000() { return feeField000; }
    public void setFeeField000(Integer feeField000) { this.feeField000 = feeField000; }

    public BigDecimal getFeeField001() { return feeField001; }
    public void setFeeField001(BigDecimal feeField001) { this.feeField001 = feeField001; }

    public Long getFeeField002() { return feeField002; }
    public void setFeeField002(Long feeField002) { this.feeField002 = feeField002; }

    public Boolean getFeeField003() { return feeField003; }
    public void setFeeField003(Boolean feeField003) { this.feeField003 = feeField003; }

    public Integer getFeeField004() { return feeField004; }
    public void setFeeField004(Integer feeField004) { this.feeField004 = feeField004; }

    public Integer getFeeField005() { return feeField005; }
    public void setFeeField005(Integer feeField005) { this.feeField005 = feeField005; }

    public Double getFeeField006() { return feeField006; }
    public void setFeeField006(Double feeField006) { this.feeField006 = feeField006; }

    public LocalDate getFeeField007() { return feeField007; }
    public void setFeeField007(LocalDate feeField007) { this.feeField007 = feeField007; }

    public Long getFeeField008() { return feeField008; }
    public void setFeeField008(Long feeField008) { this.feeField008 = feeField008; }

    public Integer getFeeField009() { return feeField009; }
    public void setFeeField009(Integer feeField009) { this.feeField009 = feeField009; }

    public Integer getFeeField010() { return feeField010; }
    public void setFeeField010(Integer feeField010) { this.feeField010 = feeField010; }

    public BigDecimal getFeeField011() { return feeField011; }
    public void setFeeField011(BigDecimal feeField011) { this.feeField011 = feeField011; }

    @Override
    public String toString() {
        return "FeeDto040{" +
            "feeField000=" + feeField000 + ", " +
            "feeField001=" + feeField001 + ", " +
            "feeField002=" + feeField002 + ", " +
            "feeField003=" + feeField003 + ", " +
            "feeField004=" + feeField004 + ", " +
            "}";
    }
}
