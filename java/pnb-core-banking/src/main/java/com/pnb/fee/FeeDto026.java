package com.pnb.fee;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * FeeDto026 — Data Transfer Object for fee operations.
 * Variant 26 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FeeDto026 {

    @JsonProperty("feeField000")
    private Integer feeField000;

    @JsonProperty("feeField001")
    private Boolean feeField001;

    @Size(max = 40)
    @JsonProperty("feeField002")
    private String feeField002;

    @JsonProperty("feeField003")
    private Integer feeField003;

    @JsonProperty("feeField004")
    private Long feeField004;

    @Size(max = 60)
    @JsonProperty("feeField005")
    private String feeField005;

    @JsonProperty("feeField006")
    private LocalDate feeField006;

    @JsonProperty("feeField007")
    private Integer feeField007;

    @JsonProperty("feeField008")
    private Double feeField008;

    @DecimalMin(value = "0.00")
    @JsonProperty("feeField009")
    private BigDecimal feeField009;

    public FeeDto026() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final FeeDto026 instance = new FeeDto026();

        public Builder feeField000(Integer val) { instance.feeField000 = val; return this; }
        public Builder feeField001(Boolean val) { instance.feeField001 = val; return this; }
        public Builder feeField002(String val) { instance.feeField002 = val; return this; }
        public Builder feeField003(Integer val) { instance.feeField003 = val; return this; }
        public Builder feeField004(Long val) { instance.feeField004 = val; return this; }
        public Builder feeField005(String val) { instance.feeField005 = val; return this; }
        public Builder feeField006(LocalDate val) { instance.feeField006 = val; return this; }
        public Builder feeField007(Integer val) { instance.feeField007 = val; return this; }
        public Builder feeField008(Double val) { instance.feeField008 = val; return this; }
        public Builder feeField009(BigDecimal val) { instance.feeField009 = val; return this; }
        public FeeDto026 build() { return instance; }
    }

    public Integer getFeeField000() { return feeField000; }
    public void setFeeField000(Integer feeField000) { this.feeField000 = feeField000; }

    public Boolean getFeeField001() { return feeField001; }
    public void setFeeField001(Boolean feeField001) { this.feeField001 = feeField001; }

    public String getFeeField002() { return feeField002; }
    public void setFeeField002(String feeField002) { this.feeField002 = feeField002; }

    public Integer getFeeField003() { return feeField003; }
    public void setFeeField003(Integer feeField003) { this.feeField003 = feeField003; }

    public Long getFeeField004() { return feeField004; }
    public void setFeeField004(Long feeField004) { this.feeField004 = feeField004; }

    public String getFeeField005() { return feeField005; }
    public void setFeeField005(String feeField005) { this.feeField005 = feeField005; }

    public LocalDate getFeeField006() { return feeField006; }
    public void setFeeField006(LocalDate feeField006) { this.feeField006 = feeField006; }

    public Integer getFeeField007() { return feeField007; }
    public void setFeeField007(Integer feeField007) { this.feeField007 = feeField007; }

    public Double getFeeField008() { return feeField008; }
    public void setFeeField008(Double feeField008) { this.feeField008 = feeField008; }

    public BigDecimal getFeeField009() { return feeField009; }
    public void setFeeField009(BigDecimal feeField009) { this.feeField009 = feeField009; }

    @Override
    public String toString() {
        return "FeeDto026{" +
            "feeField000=" + feeField000 + ", " +
            "feeField001=" + feeField001 + ", " +
            "feeField002=" + feeField002 + ", " +
            "feeField003=" + feeField003 + ", " +
            "feeField004=" + feeField004 + ", " +
            "}";
    }
}
