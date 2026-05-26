package com.pnb.fee;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * FeeDto034 — Data Transfer Object for fee operations.
 * Variant 34 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FeeDto034 {

    @Size(max = 200)
    @JsonProperty("feeField000")
    private String feeField000;

    @JsonProperty("feeField001")
    private Boolean feeField001;

    @JsonProperty("feeField002")
    private Double feeField002;

    @JsonProperty("feeField003")
    private Long feeField003;

    @JsonProperty("feeField004")
    private Double feeField004;

    @Size(max = 200)
    @JsonProperty("feeField005")
    private String feeField005;

    @Size(max = 60)
    @JsonProperty("feeField006")
    private String feeField006;

    @JsonProperty("feeField007")
    private Boolean feeField007;

    @JsonProperty("feeField008")
    private LocalDate feeField008;

    @Size(max = 100)
    @JsonProperty("feeField009")
    private String feeField009;

    @JsonProperty("feeField010")
    private Integer feeField010;

    @JsonProperty("feeField011")
    private Boolean feeField011;

    @JsonProperty("feeField012")
    private LocalDate feeField012;

    @Size(max = 100)
    @JsonProperty("feeField013")
    private String feeField013;

    @JsonProperty("feeField014")
    private LocalDate feeField014;

    @JsonProperty("feeField015")
    private Boolean feeField015;

    @JsonProperty("feeField016")
    private Integer feeField016;

    @JsonProperty("feeField017")
    private Double feeField017;

    public FeeDto034() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final FeeDto034 instance = new FeeDto034();

        public Builder feeField000(String val) { instance.feeField000 = val; return this; }
        public Builder feeField001(Boolean val) { instance.feeField001 = val; return this; }
        public Builder feeField002(Double val) { instance.feeField002 = val; return this; }
        public Builder feeField003(Long val) { instance.feeField003 = val; return this; }
        public Builder feeField004(Double val) { instance.feeField004 = val; return this; }
        public Builder feeField005(String val) { instance.feeField005 = val; return this; }
        public Builder feeField006(String val) { instance.feeField006 = val; return this; }
        public Builder feeField007(Boolean val) { instance.feeField007 = val; return this; }
        public Builder feeField008(LocalDate val) { instance.feeField008 = val; return this; }
        public Builder feeField009(String val) { instance.feeField009 = val; return this; }
        public Builder feeField010(Integer val) { instance.feeField010 = val; return this; }
        public Builder feeField011(Boolean val) { instance.feeField011 = val; return this; }
        public Builder feeField012(LocalDate val) { instance.feeField012 = val; return this; }
        public Builder feeField013(String val) { instance.feeField013 = val; return this; }
        public Builder feeField014(LocalDate val) { instance.feeField014 = val; return this; }
        public Builder feeField015(Boolean val) { instance.feeField015 = val; return this; }
        public Builder feeField016(Integer val) { instance.feeField016 = val; return this; }
        public Builder feeField017(Double val) { instance.feeField017 = val; return this; }
        public FeeDto034 build() { return instance; }
    }

    public String getFeeField000() { return feeField000; }
    public void setFeeField000(String feeField000) { this.feeField000 = feeField000; }

    public Boolean getFeeField001() { return feeField001; }
    public void setFeeField001(Boolean feeField001) { this.feeField001 = feeField001; }

    public Double getFeeField002() { return feeField002; }
    public void setFeeField002(Double feeField002) { this.feeField002 = feeField002; }

    public Long getFeeField003() { return feeField003; }
    public void setFeeField003(Long feeField003) { this.feeField003 = feeField003; }

    public Double getFeeField004() { return feeField004; }
    public void setFeeField004(Double feeField004) { this.feeField004 = feeField004; }

    public String getFeeField005() { return feeField005; }
    public void setFeeField005(String feeField005) { this.feeField005 = feeField005; }

    public String getFeeField006() { return feeField006; }
    public void setFeeField006(String feeField006) { this.feeField006 = feeField006; }

    public Boolean getFeeField007() { return feeField007; }
    public void setFeeField007(Boolean feeField007) { this.feeField007 = feeField007; }

    public LocalDate getFeeField008() { return feeField008; }
    public void setFeeField008(LocalDate feeField008) { this.feeField008 = feeField008; }

    public String getFeeField009() { return feeField009; }
    public void setFeeField009(String feeField009) { this.feeField009 = feeField009; }

    public Integer getFeeField010() { return feeField010; }
    public void setFeeField010(Integer feeField010) { this.feeField010 = feeField010; }

    public Boolean getFeeField011() { return feeField011; }
    public void setFeeField011(Boolean feeField011) { this.feeField011 = feeField011; }

    public LocalDate getFeeField012() { return feeField012; }
    public void setFeeField012(LocalDate feeField012) { this.feeField012 = feeField012; }

    public String getFeeField013() { return feeField013; }
    public void setFeeField013(String feeField013) { this.feeField013 = feeField013; }

    public LocalDate getFeeField014() { return feeField014; }
    public void setFeeField014(LocalDate feeField014) { this.feeField014 = feeField014; }

    public Boolean getFeeField015() { return feeField015; }
    public void setFeeField015(Boolean feeField015) { this.feeField015 = feeField015; }

    public Integer getFeeField016() { return feeField016; }
    public void setFeeField016(Integer feeField016) { this.feeField016 = feeField016; }

    public Double getFeeField017() { return feeField017; }
    public void setFeeField017(Double feeField017) { this.feeField017 = feeField017; }

    @Override
    public String toString() {
        return "FeeDto034{" +
            "feeField000=" + feeField000 + ", " +
            "feeField001=" + feeField001 + ", " +
            "feeField002=" + feeField002 + ", " +
            "feeField003=" + feeField003 + ", " +
            "feeField004=" + feeField004 + ", " +
            "}";
    }
}
