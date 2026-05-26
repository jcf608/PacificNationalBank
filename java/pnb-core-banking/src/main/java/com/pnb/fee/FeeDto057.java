package com.pnb.fee;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * FeeDto057 — Data Transfer Object for fee operations.
 * Variant 57 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FeeDto057 {

    @Size(max = 20)
    @JsonProperty("feeField000")
    private String feeField000;

    @Size(max = 100)
    @JsonProperty("feeField001")
    private String feeField001;

    @JsonProperty("feeField002")
    private Integer feeField002;

    @JsonProperty("feeField003")
    private Double feeField003;

    @DecimalMin(value = "0.00")
    @JsonProperty("feeField004")
    private BigDecimal feeField004;

    @JsonProperty("feeField005")
    private Boolean feeField005;

    @Size(max = 20)
    @JsonProperty("feeField006")
    private String feeField006;

    @JsonProperty("feeField007")
    private Long feeField007;

    @JsonProperty("feeField008")
    private Boolean feeField008;

    @JsonProperty("feeField009")
    private Boolean feeField009;

    @JsonProperty("feeField010")
    private Boolean feeField010;

    @JsonProperty("feeField011")
    private Double feeField011;

    @JsonProperty("feeField012")
    private Long feeField012;

    @JsonProperty("feeField013")
    private Double feeField013;

    @JsonProperty("feeField014")
    private Integer feeField014;

    @JsonProperty("feeField015")
    private Boolean feeField015;

    @Size(max = 40)
    @JsonProperty("feeField016")
    private String feeField016;

    public FeeDto057() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final FeeDto057 instance = new FeeDto057();

        public Builder feeField000(String val) { instance.feeField000 = val; return this; }
        public Builder feeField001(String val) { instance.feeField001 = val; return this; }
        public Builder feeField002(Integer val) { instance.feeField002 = val; return this; }
        public Builder feeField003(Double val) { instance.feeField003 = val; return this; }
        public Builder feeField004(BigDecimal val) { instance.feeField004 = val; return this; }
        public Builder feeField005(Boolean val) { instance.feeField005 = val; return this; }
        public Builder feeField006(String val) { instance.feeField006 = val; return this; }
        public Builder feeField007(Long val) { instance.feeField007 = val; return this; }
        public Builder feeField008(Boolean val) { instance.feeField008 = val; return this; }
        public Builder feeField009(Boolean val) { instance.feeField009 = val; return this; }
        public Builder feeField010(Boolean val) { instance.feeField010 = val; return this; }
        public Builder feeField011(Double val) { instance.feeField011 = val; return this; }
        public Builder feeField012(Long val) { instance.feeField012 = val; return this; }
        public Builder feeField013(Double val) { instance.feeField013 = val; return this; }
        public Builder feeField014(Integer val) { instance.feeField014 = val; return this; }
        public Builder feeField015(Boolean val) { instance.feeField015 = val; return this; }
        public Builder feeField016(String val) { instance.feeField016 = val; return this; }
        public FeeDto057 build() { return instance; }
    }

    public String getFeeField000() { return feeField000; }
    public void setFeeField000(String feeField000) { this.feeField000 = feeField000; }

    public String getFeeField001() { return feeField001; }
    public void setFeeField001(String feeField001) { this.feeField001 = feeField001; }

    public Integer getFeeField002() { return feeField002; }
    public void setFeeField002(Integer feeField002) { this.feeField002 = feeField002; }

    public Double getFeeField003() { return feeField003; }
    public void setFeeField003(Double feeField003) { this.feeField003 = feeField003; }

    public BigDecimal getFeeField004() { return feeField004; }
    public void setFeeField004(BigDecimal feeField004) { this.feeField004 = feeField004; }

    public Boolean getFeeField005() { return feeField005; }
    public void setFeeField005(Boolean feeField005) { this.feeField005 = feeField005; }

    public String getFeeField006() { return feeField006; }
    public void setFeeField006(String feeField006) { this.feeField006 = feeField006; }

    public Long getFeeField007() { return feeField007; }
    public void setFeeField007(Long feeField007) { this.feeField007 = feeField007; }

    public Boolean getFeeField008() { return feeField008; }
    public void setFeeField008(Boolean feeField008) { this.feeField008 = feeField008; }

    public Boolean getFeeField009() { return feeField009; }
    public void setFeeField009(Boolean feeField009) { this.feeField009 = feeField009; }

    public Boolean getFeeField010() { return feeField010; }
    public void setFeeField010(Boolean feeField010) { this.feeField010 = feeField010; }

    public Double getFeeField011() { return feeField011; }
    public void setFeeField011(Double feeField011) { this.feeField011 = feeField011; }

    public Long getFeeField012() { return feeField012; }
    public void setFeeField012(Long feeField012) { this.feeField012 = feeField012; }

    public Double getFeeField013() { return feeField013; }
    public void setFeeField013(Double feeField013) { this.feeField013 = feeField013; }

    public Integer getFeeField014() { return feeField014; }
    public void setFeeField014(Integer feeField014) { this.feeField014 = feeField014; }

    public Boolean getFeeField015() { return feeField015; }
    public void setFeeField015(Boolean feeField015) { this.feeField015 = feeField015; }

    public String getFeeField016() { return feeField016; }
    public void setFeeField016(String feeField016) { this.feeField016 = feeField016; }

    @Override
    public String toString() {
        return "FeeDto057{" +
            "feeField000=" + feeField000 + ", " +
            "feeField001=" + feeField001 + ", " +
            "feeField002=" + feeField002 + ", " +
            "feeField003=" + feeField003 + ", " +
            "feeField004=" + feeField004 + ", " +
            "}";
    }
}
