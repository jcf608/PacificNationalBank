package com.pnb.fee;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * FeeDto052 — Data Transfer Object for fee operations.
 * Variant 52 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FeeDto052 {

    @JsonProperty("feeField000")
    private Integer feeField000;

    @JsonProperty("feeField001")
    private Boolean feeField001;

    @JsonProperty("feeField002")
    private Double feeField002;

    @JsonProperty("feeField003")
    private LocalDate feeField003;

    @JsonProperty("feeField004")
    private Boolean feeField004;

    @Size(max = 40)
    @JsonProperty("feeField005")
    private String feeField005;

    @JsonProperty("feeField006")
    private Integer feeField006;

    @Size(max = 20)
    @JsonProperty("feeField007")
    private String feeField007;

    @JsonProperty("feeField008")
    private Boolean feeField008;

    @JsonProperty("feeField009")
    private Boolean feeField009;

    @JsonProperty("feeField010")
    private Long feeField010;

    @JsonProperty("feeField011")
    private Boolean feeField011;

    public FeeDto052() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final FeeDto052 instance = new FeeDto052();

        public Builder feeField000(Integer val) { instance.feeField000 = val; return this; }
        public Builder feeField001(Boolean val) { instance.feeField001 = val; return this; }
        public Builder feeField002(Double val) { instance.feeField002 = val; return this; }
        public Builder feeField003(LocalDate val) { instance.feeField003 = val; return this; }
        public Builder feeField004(Boolean val) { instance.feeField004 = val; return this; }
        public Builder feeField005(String val) { instance.feeField005 = val; return this; }
        public Builder feeField006(Integer val) { instance.feeField006 = val; return this; }
        public Builder feeField007(String val) { instance.feeField007 = val; return this; }
        public Builder feeField008(Boolean val) { instance.feeField008 = val; return this; }
        public Builder feeField009(Boolean val) { instance.feeField009 = val; return this; }
        public Builder feeField010(Long val) { instance.feeField010 = val; return this; }
        public Builder feeField011(Boolean val) { instance.feeField011 = val; return this; }
        public FeeDto052 build() { return instance; }
    }

    public Integer getFeeField000() { return feeField000; }
    public void setFeeField000(Integer feeField000) { this.feeField000 = feeField000; }

    public Boolean getFeeField001() { return feeField001; }
    public void setFeeField001(Boolean feeField001) { this.feeField001 = feeField001; }

    public Double getFeeField002() { return feeField002; }
    public void setFeeField002(Double feeField002) { this.feeField002 = feeField002; }

    public LocalDate getFeeField003() { return feeField003; }
    public void setFeeField003(LocalDate feeField003) { this.feeField003 = feeField003; }

    public Boolean getFeeField004() { return feeField004; }
    public void setFeeField004(Boolean feeField004) { this.feeField004 = feeField004; }

    public String getFeeField005() { return feeField005; }
    public void setFeeField005(String feeField005) { this.feeField005 = feeField005; }

    public Integer getFeeField006() { return feeField006; }
    public void setFeeField006(Integer feeField006) { this.feeField006 = feeField006; }

    public String getFeeField007() { return feeField007; }
    public void setFeeField007(String feeField007) { this.feeField007 = feeField007; }

    public Boolean getFeeField008() { return feeField008; }
    public void setFeeField008(Boolean feeField008) { this.feeField008 = feeField008; }

    public Boolean getFeeField009() { return feeField009; }
    public void setFeeField009(Boolean feeField009) { this.feeField009 = feeField009; }

    public Long getFeeField010() { return feeField010; }
    public void setFeeField010(Long feeField010) { this.feeField010 = feeField010; }

    public Boolean getFeeField011() { return feeField011; }
    public void setFeeField011(Boolean feeField011) { this.feeField011 = feeField011; }

    @Override
    public String toString() {
        return "FeeDto052{" +
            "feeField000=" + feeField000 + ", " +
            "feeField001=" + feeField001 + ", " +
            "feeField002=" + feeField002 + ", " +
            "feeField003=" + feeField003 + ", " +
            "feeField004=" + feeField004 + ", " +
            "}";
    }
}
