package com.pnb.fee;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * FeeDto028 — Data Transfer Object for fee operations.
 * Variant 28 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FeeDto028 {

    @JsonProperty("feeField000")
    private Integer feeField000;

    @JsonProperty("feeField001")
    private Long feeField001;

    @Size(max = 200)
    @JsonProperty("feeField002")
    private String feeField002;

    @JsonProperty("feeField003")
    private Long feeField003;

    @JsonProperty("feeField004")
    private Integer feeField004;

    @Size(max = 200)
    @JsonProperty("feeField005")
    private String feeField005;

    @JsonProperty("feeField006")
    private Integer feeField006;

    @JsonProperty("feeField007")
    private LocalDate feeField007;

    @JsonProperty("feeField008")
    private Long feeField008;

    @JsonProperty("feeField009")
    private Double feeField009;

    @Size(max = 200)
    @JsonProperty("feeField010")
    private String feeField010;

    @JsonProperty("feeField011")
    private LocalDate feeField011;

    public FeeDto028() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final FeeDto028 instance = new FeeDto028();

        public Builder feeField000(Integer val) { instance.feeField000 = val; return this; }
        public Builder feeField001(Long val) { instance.feeField001 = val; return this; }
        public Builder feeField002(String val) { instance.feeField002 = val; return this; }
        public Builder feeField003(Long val) { instance.feeField003 = val; return this; }
        public Builder feeField004(Integer val) { instance.feeField004 = val; return this; }
        public Builder feeField005(String val) { instance.feeField005 = val; return this; }
        public Builder feeField006(Integer val) { instance.feeField006 = val; return this; }
        public Builder feeField007(LocalDate val) { instance.feeField007 = val; return this; }
        public Builder feeField008(Long val) { instance.feeField008 = val; return this; }
        public Builder feeField009(Double val) { instance.feeField009 = val; return this; }
        public Builder feeField010(String val) { instance.feeField010 = val; return this; }
        public Builder feeField011(LocalDate val) { instance.feeField011 = val; return this; }
        public FeeDto028 build() { return instance; }
    }

    public Integer getFeeField000() { return feeField000; }
    public void setFeeField000(Integer feeField000) { this.feeField000 = feeField000; }

    public Long getFeeField001() { return feeField001; }
    public void setFeeField001(Long feeField001) { this.feeField001 = feeField001; }

    public String getFeeField002() { return feeField002; }
    public void setFeeField002(String feeField002) { this.feeField002 = feeField002; }

    public Long getFeeField003() { return feeField003; }
    public void setFeeField003(Long feeField003) { this.feeField003 = feeField003; }

    public Integer getFeeField004() { return feeField004; }
    public void setFeeField004(Integer feeField004) { this.feeField004 = feeField004; }

    public String getFeeField005() { return feeField005; }
    public void setFeeField005(String feeField005) { this.feeField005 = feeField005; }

    public Integer getFeeField006() { return feeField006; }
    public void setFeeField006(Integer feeField006) { this.feeField006 = feeField006; }

    public LocalDate getFeeField007() { return feeField007; }
    public void setFeeField007(LocalDate feeField007) { this.feeField007 = feeField007; }

    public Long getFeeField008() { return feeField008; }
    public void setFeeField008(Long feeField008) { this.feeField008 = feeField008; }

    public Double getFeeField009() { return feeField009; }
    public void setFeeField009(Double feeField009) { this.feeField009 = feeField009; }

    public String getFeeField010() { return feeField010; }
    public void setFeeField010(String feeField010) { this.feeField010 = feeField010; }

    public LocalDate getFeeField011() { return feeField011; }
    public void setFeeField011(LocalDate feeField011) { this.feeField011 = feeField011; }

    @Override
    public String toString() {
        return "FeeDto028{" +
            "feeField000=" + feeField000 + ", " +
            "feeField001=" + feeField001 + ", " +
            "feeField002=" + feeField002 + ", " +
            "feeField003=" + feeField003 + ", " +
            "feeField004=" + feeField004 + ", " +
            "}";
    }
}
