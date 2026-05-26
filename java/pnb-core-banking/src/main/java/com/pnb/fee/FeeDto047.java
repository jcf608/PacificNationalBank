package com.pnb.fee;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * FeeDto047 — Data Transfer Object for fee operations.
 * Variant 47 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FeeDto047 {

    @JsonProperty("feeField000")
    private Boolean feeField000;

    @JsonProperty("feeField001")
    private LocalDate feeField001;

    @Size(max = 100)
    @JsonProperty("feeField002")
    private String feeField002;

    @JsonProperty("feeField003")
    private Double feeField003;

    @Size(max = 200)
    @JsonProperty("feeField004")
    private String feeField004;

    @Size(max = 60)
    @JsonProperty("feeField005")
    private String feeField005;

    @JsonProperty("feeField006")
    private Double feeField006;

    @JsonProperty("feeField007")
    private Double feeField007;

    @Size(max = 100)
    @JsonProperty("feeField008")
    private String feeField008;

    @JsonProperty("feeField009")
    private Long feeField009;

    @JsonProperty("feeField010")
    private LocalDate feeField010;

    @Size(max = 200)
    @JsonProperty("feeField011")
    private String feeField011;

    @JsonProperty("feeField012")
    private Boolean feeField012;

    @DecimalMin(value = "0.00")
    @JsonProperty("feeField013")
    private BigDecimal feeField013;

    @JsonProperty("feeField014")
    private Long feeField014;

    @JsonProperty("feeField015")
    private Long feeField015;

    @JsonProperty("feeField016")
    private Integer feeField016;

    @JsonProperty("feeField017")
    private LocalDate feeField017;

    @JsonProperty("feeField018")
    private Long feeField018;

    public FeeDto047() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final FeeDto047 instance = new FeeDto047();

        public Builder feeField000(Boolean val) { instance.feeField000 = val; return this; }
        public Builder feeField001(LocalDate val) { instance.feeField001 = val; return this; }
        public Builder feeField002(String val) { instance.feeField002 = val; return this; }
        public Builder feeField003(Double val) { instance.feeField003 = val; return this; }
        public Builder feeField004(String val) { instance.feeField004 = val; return this; }
        public Builder feeField005(String val) { instance.feeField005 = val; return this; }
        public Builder feeField006(Double val) { instance.feeField006 = val; return this; }
        public Builder feeField007(Double val) { instance.feeField007 = val; return this; }
        public Builder feeField008(String val) { instance.feeField008 = val; return this; }
        public Builder feeField009(Long val) { instance.feeField009 = val; return this; }
        public Builder feeField010(LocalDate val) { instance.feeField010 = val; return this; }
        public Builder feeField011(String val) { instance.feeField011 = val; return this; }
        public Builder feeField012(Boolean val) { instance.feeField012 = val; return this; }
        public Builder feeField013(BigDecimal val) { instance.feeField013 = val; return this; }
        public Builder feeField014(Long val) { instance.feeField014 = val; return this; }
        public Builder feeField015(Long val) { instance.feeField015 = val; return this; }
        public Builder feeField016(Integer val) { instance.feeField016 = val; return this; }
        public Builder feeField017(LocalDate val) { instance.feeField017 = val; return this; }
        public Builder feeField018(Long val) { instance.feeField018 = val; return this; }
        public FeeDto047 build() { return instance; }
    }

    public Boolean getFeeField000() { return feeField000; }
    public void setFeeField000(Boolean feeField000) { this.feeField000 = feeField000; }

    public LocalDate getFeeField001() { return feeField001; }
    public void setFeeField001(LocalDate feeField001) { this.feeField001 = feeField001; }

    public String getFeeField002() { return feeField002; }
    public void setFeeField002(String feeField002) { this.feeField002 = feeField002; }

    public Double getFeeField003() { return feeField003; }
    public void setFeeField003(Double feeField003) { this.feeField003 = feeField003; }

    public String getFeeField004() { return feeField004; }
    public void setFeeField004(String feeField004) { this.feeField004 = feeField004; }

    public String getFeeField005() { return feeField005; }
    public void setFeeField005(String feeField005) { this.feeField005 = feeField005; }

    public Double getFeeField006() { return feeField006; }
    public void setFeeField006(Double feeField006) { this.feeField006 = feeField006; }

    public Double getFeeField007() { return feeField007; }
    public void setFeeField007(Double feeField007) { this.feeField007 = feeField007; }

    public String getFeeField008() { return feeField008; }
    public void setFeeField008(String feeField008) { this.feeField008 = feeField008; }

    public Long getFeeField009() { return feeField009; }
    public void setFeeField009(Long feeField009) { this.feeField009 = feeField009; }

    public LocalDate getFeeField010() { return feeField010; }
    public void setFeeField010(LocalDate feeField010) { this.feeField010 = feeField010; }

    public String getFeeField011() { return feeField011; }
    public void setFeeField011(String feeField011) { this.feeField011 = feeField011; }

    public Boolean getFeeField012() { return feeField012; }
    public void setFeeField012(Boolean feeField012) { this.feeField012 = feeField012; }

    public BigDecimal getFeeField013() { return feeField013; }
    public void setFeeField013(BigDecimal feeField013) { this.feeField013 = feeField013; }

    public Long getFeeField014() { return feeField014; }
    public void setFeeField014(Long feeField014) { this.feeField014 = feeField014; }

    public Long getFeeField015() { return feeField015; }
    public void setFeeField015(Long feeField015) { this.feeField015 = feeField015; }

    public Integer getFeeField016() { return feeField016; }
    public void setFeeField016(Integer feeField016) { this.feeField016 = feeField016; }

    public LocalDate getFeeField017() { return feeField017; }
    public void setFeeField017(LocalDate feeField017) { this.feeField017 = feeField017; }

    public Long getFeeField018() { return feeField018; }
    public void setFeeField018(Long feeField018) { this.feeField018 = feeField018; }

    @Override
    public String toString() {
        return "FeeDto047{" +
            "feeField000=" + feeField000 + ", " +
            "feeField001=" + feeField001 + ", " +
            "feeField002=" + feeField002 + ", " +
            "feeField003=" + feeField003 + ", " +
            "feeField004=" + feeField004 + ", " +
            "}";
    }
}
