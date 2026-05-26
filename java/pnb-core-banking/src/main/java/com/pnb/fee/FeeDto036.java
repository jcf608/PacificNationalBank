package com.pnb.fee;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * FeeDto036 — Data Transfer Object for fee operations.
 * Variant 36 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FeeDto036 {

    @JsonProperty("feeField000")
    private Integer feeField000;

    @JsonProperty("feeField001")
    private Double feeField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("feeField002")
    private BigDecimal feeField002;

    @DecimalMin(value = "0.00")
    @JsonProperty("feeField003")
    private BigDecimal feeField003;

    @JsonProperty("feeField004")
    private Long feeField004;

    @JsonProperty("feeField005")
    private LocalDate feeField005;

    @JsonProperty("feeField006")
    private Integer feeField006;

    @Size(max = 200)
    @JsonProperty("feeField007")
    private String feeField007;

    public FeeDto036() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final FeeDto036 instance = new FeeDto036();

        public Builder feeField000(Integer val) { instance.feeField000 = val; return this; }
        public Builder feeField001(Double val) { instance.feeField001 = val; return this; }
        public Builder feeField002(BigDecimal val) { instance.feeField002 = val; return this; }
        public Builder feeField003(BigDecimal val) { instance.feeField003 = val; return this; }
        public Builder feeField004(Long val) { instance.feeField004 = val; return this; }
        public Builder feeField005(LocalDate val) { instance.feeField005 = val; return this; }
        public Builder feeField006(Integer val) { instance.feeField006 = val; return this; }
        public Builder feeField007(String val) { instance.feeField007 = val; return this; }
        public FeeDto036 build() { return instance; }
    }

    public Integer getFeeField000() { return feeField000; }
    public void setFeeField000(Integer feeField000) { this.feeField000 = feeField000; }

    public Double getFeeField001() { return feeField001; }
    public void setFeeField001(Double feeField001) { this.feeField001 = feeField001; }

    public BigDecimal getFeeField002() { return feeField002; }
    public void setFeeField002(BigDecimal feeField002) { this.feeField002 = feeField002; }

    public BigDecimal getFeeField003() { return feeField003; }
    public void setFeeField003(BigDecimal feeField003) { this.feeField003 = feeField003; }

    public Long getFeeField004() { return feeField004; }
    public void setFeeField004(Long feeField004) { this.feeField004 = feeField004; }

    public LocalDate getFeeField005() { return feeField005; }
    public void setFeeField005(LocalDate feeField005) { this.feeField005 = feeField005; }

    public Integer getFeeField006() { return feeField006; }
    public void setFeeField006(Integer feeField006) { this.feeField006 = feeField006; }

    public String getFeeField007() { return feeField007; }
    public void setFeeField007(String feeField007) { this.feeField007 = feeField007; }

    @Override
    public String toString() {
        return "FeeDto036{" +
            "feeField000=" + feeField000 + ", " +
            "feeField001=" + feeField001 + ", " +
            "feeField002=" + feeField002 + ", " +
            "feeField003=" + feeField003 + ", " +
            "feeField004=" + feeField004 + ", " +
            "}";
    }
}
