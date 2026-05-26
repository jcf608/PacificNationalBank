package com.pnb.fee;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * FeeDto029 — Data Transfer Object for fee operations.
 * Variant 29 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FeeDto029 {

    @JsonProperty("feeField000")
    private Long feeField000;

    @JsonProperty("feeField001")
    private LocalDate feeField001;

    @JsonProperty("feeField002")
    private LocalDate feeField002;

    @JsonProperty("feeField003")
    private Integer feeField003;

    @JsonProperty("feeField004")
    private Integer feeField004;

    @JsonProperty("feeField005")
    private LocalDate feeField005;

    @Size(max = 40)
    @JsonProperty("feeField006")
    private String feeField006;

    @Size(max = 60)
    @JsonProperty("feeField007")
    private String feeField007;

    @JsonProperty("feeField008")
    private LocalDate feeField008;

    @JsonProperty("feeField009")
    private LocalDate feeField009;

    @JsonProperty("feeField010")
    private Long feeField010;

    @JsonProperty("feeField011")
    private Integer feeField011;

    @JsonProperty("feeField012")
    private Double feeField012;

    public FeeDto029() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final FeeDto029 instance = new FeeDto029();

        public Builder feeField000(Long val) { instance.feeField000 = val; return this; }
        public Builder feeField001(LocalDate val) { instance.feeField001 = val; return this; }
        public Builder feeField002(LocalDate val) { instance.feeField002 = val; return this; }
        public Builder feeField003(Integer val) { instance.feeField003 = val; return this; }
        public Builder feeField004(Integer val) { instance.feeField004 = val; return this; }
        public Builder feeField005(LocalDate val) { instance.feeField005 = val; return this; }
        public Builder feeField006(String val) { instance.feeField006 = val; return this; }
        public Builder feeField007(String val) { instance.feeField007 = val; return this; }
        public Builder feeField008(LocalDate val) { instance.feeField008 = val; return this; }
        public Builder feeField009(LocalDate val) { instance.feeField009 = val; return this; }
        public Builder feeField010(Long val) { instance.feeField010 = val; return this; }
        public Builder feeField011(Integer val) { instance.feeField011 = val; return this; }
        public Builder feeField012(Double val) { instance.feeField012 = val; return this; }
        public FeeDto029 build() { return instance; }
    }

    public Long getFeeField000() { return feeField000; }
    public void setFeeField000(Long feeField000) { this.feeField000 = feeField000; }

    public LocalDate getFeeField001() { return feeField001; }
    public void setFeeField001(LocalDate feeField001) { this.feeField001 = feeField001; }

    public LocalDate getFeeField002() { return feeField002; }
    public void setFeeField002(LocalDate feeField002) { this.feeField002 = feeField002; }

    public Integer getFeeField003() { return feeField003; }
    public void setFeeField003(Integer feeField003) { this.feeField003 = feeField003; }

    public Integer getFeeField004() { return feeField004; }
    public void setFeeField004(Integer feeField004) { this.feeField004 = feeField004; }

    public LocalDate getFeeField005() { return feeField005; }
    public void setFeeField005(LocalDate feeField005) { this.feeField005 = feeField005; }

    public String getFeeField006() { return feeField006; }
    public void setFeeField006(String feeField006) { this.feeField006 = feeField006; }

    public String getFeeField007() { return feeField007; }
    public void setFeeField007(String feeField007) { this.feeField007 = feeField007; }

    public LocalDate getFeeField008() { return feeField008; }
    public void setFeeField008(LocalDate feeField008) { this.feeField008 = feeField008; }

    public LocalDate getFeeField009() { return feeField009; }
    public void setFeeField009(LocalDate feeField009) { this.feeField009 = feeField009; }

    public Long getFeeField010() { return feeField010; }
    public void setFeeField010(Long feeField010) { this.feeField010 = feeField010; }

    public Integer getFeeField011() { return feeField011; }
    public void setFeeField011(Integer feeField011) { this.feeField011 = feeField011; }

    public Double getFeeField012() { return feeField012; }
    public void setFeeField012(Double feeField012) { this.feeField012 = feeField012; }

    @Override
    public String toString() {
        return "FeeDto029{" +
            "feeField000=" + feeField000 + ", " +
            "feeField001=" + feeField001 + ", " +
            "feeField002=" + feeField002 + ", " +
            "feeField003=" + feeField003 + ", " +
            "feeField004=" + feeField004 + ", " +
            "}";
    }
}
