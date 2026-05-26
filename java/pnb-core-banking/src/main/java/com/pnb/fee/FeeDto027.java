package com.pnb.fee;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * FeeDto027 — Data Transfer Object for fee operations.
 * Variant 27 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FeeDto027 {

    @JsonProperty("feeField000")
    private Integer feeField000;

    @JsonProperty("feeField001")
    private LocalDate feeField001;

    @JsonProperty("feeField002")
    private Double feeField002;

    @JsonProperty("feeField003")
    private Boolean feeField003;

    @Size(max = 60)
    @JsonProperty("feeField004")
    private String feeField004;

    @Size(max = 60)
    @JsonProperty("feeField005")
    private String feeField005;

    @JsonProperty("feeField006")
    private Boolean feeField006;

    @JsonProperty("feeField007")
    private Double feeField007;

    @JsonProperty("feeField008")
    private Long feeField008;

    @JsonProperty("feeField009")
    private LocalDate feeField009;

    @Size(max = 100)
    @JsonProperty("feeField010")
    private String feeField010;

    public FeeDto027() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final FeeDto027 instance = new FeeDto027();

        public Builder feeField000(Integer val) { instance.feeField000 = val; return this; }
        public Builder feeField001(LocalDate val) { instance.feeField001 = val; return this; }
        public Builder feeField002(Double val) { instance.feeField002 = val; return this; }
        public Builder feeField003(Boolean val) { instance.feeField003 = val; return this; }
        public Builder feeField004(String val) { instance.feeField004 = val; return this; }
        public Builder feeField005(String val) { instance.feeField005 = val; return this; }
        public Builder feeField006(Boolean val) { instance.feeField006 = val; return this; }
        public Builder feeField007(Double val) { instance.feeField007 = val; return this; }
        public Builder feeField008(Long val) { instance.feeField008 = val; return this; }
        public Builder feeField009(LocalDate val) { instance.feeField009 = val; return this; }
        public Builder feeField010(String val) { instance.feeField010 = val; return this; }
        public FeeDto027 build() { return instance; }
    }

    public Integer getFeeField000() { return feeField000; }
    public void setFeeField000(Integer feeField000) { this.feeField000 = feeField000; }

    public LocalDate getFeeField001() { return feeField001; }
    public void setFeeField001(LocalDate feeField001) { this.feeField001 = feeField001; }

    public Double getFeeField002() { return feeField002; }
    public void setFeeField002(Double feeField002) { this.feeField002 = feeField002; }

    public Boolean getFeeField003() { return feeField003; }
    public void setFeeField003(Boolean feeField003) { this.feeField003 = feeField003; }

    public String getFeeField004() { return feeField004; }
    public void setFeeField004(String feeField004) { this.feeField004 = feeField004; }

    public String getFeeField005() { return feeField005; }
    public void setFeeField005(String feeField005) { this.feeField005 = feeField005; }

    public Boolean getFeeField006() { return feeField006; }
    public void setFeeField006(Boolean feeField006) { this.feeField006 = feeField006; }

    public Double getFeeField007() { return feeField007; }
    public void setFeeField007(Double feeField007) { this.feeField007 = feeField007; }

    public Long getFeeField008() { return feeField008; }
    public void setFeeField008(Long feeField008) { this.feeField008 = feeField008; }

    public LocalDate getFeeField009() { return feeField009; }
    public void setFeeField009(LocalDate feeField009) { this.feeField009 = feeField009; }

    public String getFeeField010() { return feeField010; }
    public void setFeeField010(String feeField010) { this.feeField010 = feeField010; }

    @Override
    public String toString() {
        return "FeeDto027{" +
            "feeField000=" + feeField000 + ", " +
            "feeField001=" + feeField001 + ", " +
            "feeField002=" + feeField002 + ", " +
            "feeField003=" + feeField003 + ", " +
            "feeField004=" + feeField004 + ", " +
            "}";
    }
}
