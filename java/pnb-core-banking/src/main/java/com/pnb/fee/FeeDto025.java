package com.pnb.fee;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * FeeDto025 — Data Transfer Object for fee operations.
 * Variant 25 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FeeDto025 {

    @Size(max = 40)
    @JsonProperty("feeField000")
    private String feeField000;

    @JsonProperty("feeField001")
    private Boolean feeField001;

    @JsonProperty("feeField002")
    private Integer feeField002;

    @JsonProperty("feeField003")
    private Long feeField003;

    @JsonProperty("feeField004")
    private Boolean feeField004;

    @JsonProperty("feeField005")
    private Long feeField005;

    @Size(max = 40)
    @JsonProperty("feeField006")
    private String feeField006;

    @JsonProperty("feeField007")
    private Boolean feeField007;

    @JsonProperty("feeField008")
    private Integer feeField008;

    public FeeDto025() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final FeeDto025 instance = new FeeDto025();

        public Builder feeField000(String val) { instance.feeField000 = val; return this; }
        public Builder feeField001(Boolean val) { instance.feeField001 = val; return this; }
        public Builder feeField002(Integer val) { instance.feeField002 = val; return this; }
        public Builder feeField003(Long val) { instance.feeField003 = val; return this; }
        public Builder feeField004(Boolean val) { instance.feeField004 = val; return this; }
        public Builder feeField005(Long val) { instance.feeField005 = val; return this; }
        public Builder feeField006(String val) { instance.feeField006 = val; return this; }
        public Builder feeField007(Boolean val) { instance.feeField007 = val; return this; }
        public Builder feeField008(Integer val) { instance.feeField008 = val; return this; }
        public FeeDto025 build() { return instance; }
    }

    public String getFeeField000() { return feeField000; }
    public void setFeeField000(String feeField000) { this.feeField000 = feeField000; }

    public Boolean getFeeField001() { return feeField001; }
    public void setFeeField001(Boolean feeField001) { this.feeField001 = feeField001; }

    public Integer getFeeField002() { return feeField002; }
    public void setFeeField002(Integer feeField002) { this.feeField002 = feeField002; }

    public Long getFeeField003() { return feeField003; }
    public void setFeeField003(Long feeField003) { this.feeField003 = feeField003; }

    public Boolean getFeeField004() { return feeField004; }
    public void setFeeField004(Boolean feeField004) { this.feeField004 = feeField004; }

    public Long getFeeField005() { return feeField005; }
    public void setFeeField005(Long feeField005) { this.feeField005 = feeField005; }

    public String getFeeField006() { return feeField006; }
    public void setFeeField006(String feeField006) { this.feeField006 = feeField006; }

    public Boolean getFeeField007() { return feeField007; }
    public void setFeeField007(Boolean feeField007) { this.feeField007 = feeField007; }

    public Integer getFeeField008() { return feeField008; }
    public void setFeeField008(Integer feeField008) { this.feeField008 = feeField008; }

    @Override
    public String toString() {
        return "FeeDto025{" +
            "feeField000=" + feeField000 + ", " +
            "feeField001=" + feeField001 + ", " +
            "feeField002=" + feeField002 + ", " +
            "feeField003=" + feeField003 + ", " +
            "feeField004=" + feeField004 + ", " +
            "}";
    }
}
