package com.pnb.fee;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * FeeDto059 — Data Transfer Object for fee operations.
 * Variant 59 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FeeDto059 {

    @JsonProperty("feeField000")
    private LocalDate feeField000;

    @JsonProperty("feeField001")
    private Integer feeField001;

    @JsonProperty("feeField002")
    private Integer feeField002;

    @Size(max = 20)
    @JsonProperty("feeField003")
    private String feeField003;

    @JsonProperty("feeField004")
    private Integer feeField004;

    @JsonProperty("feeField005")
    private Boolean feeField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("feeField006")
    private BigDecimal feeField006;

    @Size(max = 40)
    @JsonProperty("feeField007")
    private String feeField007;

    @JsonProperty("feeField008")
    private Long feeField008;

    @DecimalMin(value = "0.00")
    @JsonProperty("feeField009")
    private BigDecimal feeField009;

    @JsonProperty("feeField010")
    private LocalDate feeField010;

    @JsonProperty("feeField011")
    private LocalDate feeField011;

    @JsonProperty("feeField012")
    private LocalDate feeField012;

    @JsonProperty("feeField013")
    private Long feeField013;

    @JsonProperty("feeField014")
    private LocalDate feeField014;

    @JsonProperty("feeField015")
    private Integer feeField015;

    @JsonProperty("feeField016")
    private Boolean feeField016;

    @JsonProperty("feeField017")
    private Integer feeField017;

    @JsonProperty("feeField018")
    private Boolean feeField018;

    public FeeDto059() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final FeeDto059 instance = new FeeDto059();

        public Builder feeField000(LocalDate val) { instance.feeField000 = val; return this; }
        public Builder feeField001(Integer val) { instance.feeField001 = val; return this; }
        public Builder feeField002(Integer val) { instance.feeField002 = val; return this; }
        public Builder feeField003(String val) { instance.feeField003 = val; return this; }
        public Builder feeField004(Integer val) { instance.feeField004 = val; return this; }
        public Builder feeField005(Boolean val) { instance.feeField005 = val; return this; }
        public Builder feeField006(BigDecimal val) { instance.feeField006 = val; return this; }
        public Builder feeField007(String val) { instance.feeField007 = val; return this; }
        public Builder feeField008(Long val) { instance.feeField008 = val; return this; }
        public Builder feeField009(BigDecimal val) { instance.feeField009 = val; return this; }
        public Builder feeField010(LocalDate val) { instance.feeField010 = val; return this; }
        public Builder feeField011(LocalDate val) { instance.feeField011 = val; return this; }
        public Builder feeField012(LocalDate val) { instance.feeField012 = val; return this; }
        public Builder feeField013(Long val) { instance.feeField013 = val; return this; }
        public Builder feeField014(LocalDate val) { instance.feeField014 = val; return this; }
        public Builder feeField015(Integer val) { instance.feeField015 = val; return this; }
        public Builder feeField016(Boolean val) { instance.feeField016 = val; return this; }
        public Builder feeField017(Integer val) { instance.feeField017 = val; return this; }
        public Builder feeField018(Boolean val) { instance.feeField018 = val; return this; }
        public FeeDto059 build() { return instance; }
    }

    public LocalDate getFeeField000() { return feeField000; }
    public void setFeeField000(LocalDate feeField000) { this.feeField000 = feeField000; }

    public Integer getFeeField001() { return feeField001; }
    public void setFeeField001(Integer feeField001) { this.feeField001 = feeField001; }

    public Integer getFeeField002() { return feeField002; }
    public void setFeeField002(Integer feeField002) { this.feeField002 = feeField002; }

    public String getFeeField003() { return feeField003; }
    public void setFeeField003(String feeField003) { this.feeField003 = feeField003; }

    public Integer getFeeField004() { return feeField004; }
    public void setFeeField004(Integer feeField004) { this.feeField004 = feeField004; }

    public Boolean getFeeField005() { return feeField005; }
    public void setFeeField005(Boolean feeField005) { this.feeField005 = feeField005; }

    public BigDecimal getFeeField006() { return feeField006; }
    public void setFeeField006(BigDecimal feeField006) { this.feeField006 = feeField006; }

    public String getFeeField007() { return feeField007; }
    public void setFeeField007(String feeField007) { this.feeField007 = feeField007; }

    public Long getFeeField008() { return feeField008; }
    public void setFeeField008(Long feeField008) { this.feeField008 = feeField008; }

    public BigDecimal getFeeField009() { return feeField009; }
    public void setFeeField009(BigDecimal feeField009) { this.feeField009 = feeField009; }

    public LocalDate getFeeField010() { return feeField010; }
    public void setFeeField010(LocalDate feeField010) { this.feeField010 = feeField010; }

    public LocalDate getFeeField011() { return feeField011; }
    public void setFeeField011(LocalDate feeField011) { this.feeField011 = feeField011; }

    public LocalDate getFeeField012() { return feeField012; }
    public void setFeeField012(LocalDate feeField012) { this.feeField012 = feeField012; }

    public Long getFeeField013() { return feeField013; }
    public void setFeeField013(Long feeField013) { this.feeField013 = feeField013; }

    public LocalDate getFeeField014() { return feeField014; }
    public void setFeeField014(LocalDate feeField014) { this.feeField014 = feeField014; }

    public Integer getFeeField015() { return feeField015; }
    public void setFeeField015(Integer feeField015) { this.feeField015 = feeField015; }

    public Boolean getFeeField016() { return feeField016; }
    public void setFeeField016(Boolean feeField016) { this.feeField016 = feeField016; }

    public Integer getFeeField017() { return feeField017; }
    public void setFeeField017(Integer feeField017) { this.feeField017 = feeField017; }

    public Boolean getFeeField018() { return feeField018; }
    public void setFeeField018(Boolean feeField018) { this.feeField018 = feeField018; }

    @Override
    public String toString() {
        return "FeeDto059{" +
            "feeField000=" + feeField000 + ", " +
            "feeField001=" + feeField001 + ", " +
            "feeField002=" + feeField002 + ", " +
            "feeField003=" + feeField003 + ", " +
            "feeField004=" + feeField004 + ", " +
            "}";
    }
}
