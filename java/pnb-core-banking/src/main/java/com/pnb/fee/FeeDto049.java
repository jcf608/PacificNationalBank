package com.pnb.fee;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * FeeDto049 — Data Transfer Object for fee operations.
 * Variant 49 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FeeDto049 {

    @JsonProperty("feeField000")
    private Double feeField000;

    @Size(max = 20)
    @JsonProperty("feeField001")
    private String feeField001;

    @JsonProperty("feeField002")
    private LocalDate feeField002;

    @JsonProperty("feeField003")
    private Long feeField003;

    @JsonProperty("feeField004")
    private Double feeField004;

    @JsonProperty("feeField005")
    private LocalDate feeField005;

    @JsonProperty("feeField006")
    private Integer feeField006;

    @JsonProperty("feeField007")
    private Boolean feeField007;

    @JsonProperty("feeField008")
    private Integer feeField008;

    public FeeDto049() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final FeeDto049 instance = new FeeDto049();

        public Builder feeField000(Double val) { instance.feeField000 = val; return this; }
        public Builder feeField001(String val) { instance.feeField001 = val; return this; }
        public Builder feeField002(LocalDate val) { instance.feeField002 = val; return this; }
        public Builder feeField003(Long val) { instance.feeField003 = val; return this; }
        public Builder feeField004(Double val) { instance.feeField004 = val; return this; }
        public Builder feeField005(LocalDate val) { instance.feeField005 = val; return this; }
        public Builder feeField006(Integer val) { instance.feeField006 = val; return this; }
        public Builder feeField007(Boolean val) { instance.feeField007 = val; return this; }
        public Builder feeField008(Integer val) { instance.feeField008 = val; return this; }
        public FeeDto049 build() { return instance; }
    }

    public Double getFeeField000() { return feeField000; }
    public void setFeeField000(Double feeField000) { this.feeField000 = feeField000; }

    public String getFeeField001() { return feeField001; }
    public void setFeeField001(String feeField001) { this.feeField001 = feeField001; }

    public LocalDate getFeeField002() { return feeField002; }
    public void setFeeField002(LocalDate feeField002) { this.feeField002 = feeField002; }

    public Long getFeeField003() { return feeField003; }
    public void setFeeField003(Long feeField003) { this.feeField003 = feeField003; }

    public Double getFeeField004() { return feeField004; }
    public void setFeeField004(Double feeField004) { this.feeField004 = feeField004; }

    public LocalDate getFeeField005() { return feeField005; }
    public void setFeeField005(LocalDate feeField005) { this.feeField005 = feeField005; }

    public Integer getFeeField006() { return feeField006; }
    public void setFeeField006(Integer feeField006) { this.feeField006 = feeField006; }

    public Boolean getFeeField007() { return feeField007; }
    public void setFeeField007(Boolean feeField007) { this.feeField007 = feeField007; }

    public Integer getFeeField008() { return feeField008; }
    public void setFeeField008(Integer feeField008) { this.feeField008 = feeField008; }

    @Override
    public String toString() {
        return "FeeDto049{" +
            "feeField000=" + feeField000 + ", " +
            "feeField001=" + feeField001 + ", " +
            "feeField002=" + feeField002 + ", " +
            "feeField003=" + feeField003 + ", " +
            "feeField004=" + feeField004 + ", " +
            "}";
    }
}
