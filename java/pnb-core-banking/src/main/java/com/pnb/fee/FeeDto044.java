package com.pnb.fee;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * FeeDto044 — Data Transfer Object for fee operations.
 * Variant 44 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FeeDto044 {

    @JsonProperty("feeField000")
    private LocalDate feeField000;

    @JsonProperty("feeField001")
    private Integer feeField001;

    @Size(max = 20)
    @JsonProperty("feeField002")
    private String feeField002;

    @Size(max = 60)
    @JsonProperty("feeField003")
    private String feeField003;

    @Size(max = 20)
    @JsonProperty("feeField004")
    private String feeField004;

    @JsonProperty("feeField005")
    private Double feeField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("feeField006")
    private BigDecimal feeField006;

    @JsonProperty("feeField007")
    private Long feeField007;

    @JsonProperty("feeField008")
    private Boolean feeField008;

    @JsonProperty("feeField009")
    private Double feeField009;

    @JsonProperty("feeField010")
    private LocalDate feeField010;

    @Size(max = 100)
    @JsonProperty("feeField011")
    private String feeField011;

    @JsonProperty("feeField012")
    private Long feeField012;

    @JsonProperty("feeField013")
    private Integer feeField013;

    @JsonProperty("feeField014")
    private Long feeField014;

    @JsonProperty("feeField015")
    private Integer feeField015;

    public FeeDto044() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final FeeDto044 instance = new FeeDto044();

        public Builder feeField000(LocalDate val) { instance.feeField000 = val; return this; }
        public Builder feeField001(Integer val) { instance.feeField001 = val; return this; }
        public Builder feeField002(String val) { instance.feeField002 = val; return this; }
        public Builder feeField003(String val) { instance.feeField003 = val; return this; }
        public Builder feeField004(String val) { instance.feeField004 = val; return this; }
        public Builder feeField005(Double val) { instance.feeField005 = val; return this; }
        public Builder feeField006(BigDecimal val) { instance.feeField006 = val; return this; }
        public Builder feeField007(Long val) { instance.feeField007 = val; return this; }
        public Builder feeField008(Boolean val) { instance.feeField008 = val; return this; }
        public Builder feeField009(Double val) { instance.feeField009 = val; return this; }
        public Builder feeField010(LocalDate val) { instance.feeField010 = val; return this; }
        public Builder feeField011(String val) { instance.feeField011 = val; return this; }
        public Builder feeField012(Long val) { instance.feeField012 = val; return this; }
        public Builder feeField013(Integer val) { instance.feeField013 = val; return this; }
        public Builder feeField014(Long val) { instance.feeField014 = val; return this; }
        public Builder feeField015(Integer val) { instance.feeField015 = val; return this; }
        public FeeDto044 build() { return instance; }
    }

    public LocalDate getFeeField000() { return feeField000; }
    public void setFeeField000(LocalDate feeField000) { this.feeField000 = feeField000; }

    public Integer getFeeField001() { return feeField001; }
    public void setFeeField001(Integer feeField001) { this.feeField001 = feeField001; }

    public String getFeeField002() { return feeField002; }
    public void setFeeField002(String feeField002) { this.feeField002 = feeField002; }

    public String getFeeField003() { return feeField003; }
    public void setFeeField003(String feeField003) { this.feeField003 = feeField003; }

    public String getFeeField004() { return feeField004; }
    public void setFeeField004(String feeField004) { this.feeField004 = feeField004; }

    public Double getFeeField005() { return feeField005; }
    public void setFeeField005(Double feeField005) { this.feeField005 = feeField005; }

    public BigDecimal getFeeField006() { return feeField006; }
    public void setFeeField006(BigDecimal feeField006) { this.feeField006 = feeField006; }

    public Long getFeeField007() { return feeField007; }
    public void setFeeField007(Long feeField007) { this.feeField007 = feeField007; }

    public Boolean getFeeField008() { return feeField008; }
    public void setFeeField008(Boolean feeField008) { this.feeField008 = feeField008; }

    public Double getFeeField009() { return feeField009; }
    public void setFeeField009(Double feeField009) { this.feeField009 = feeField009; }

    public LocalDate getFeeField010() { return feeField010; }
    public void setFeeField010(LocalDate feeField010) { this.feeField010 = feeField010; }

    public String getFeeField011() { return feeField011; }
    public void setFeeField011(String feeField011) { this.feeField011 = feeField011; }

    public Long getFeeField012() { return feeField012; }
    public void setFeeField012(Long feeField012) { this.feeField012 = feeField012; }

    public Integer getFeeField013() { return feeField013; }
    public void setFeeField013(Integer feeField013) { this.feeField013 = feeField013; }

    public Long getFeeField014() { return feeField014; }
    public void setFeeField014(Long feeField014) { this.feeField014 = feeField014; }

    public Integer getFeeField015() { return feeField015; }
    public void setFeeField015(Integer feeField015) { this.feeField015 = feeField015; }

    @Override
    public String toString() {
        return "FeeDto044{" +
            "feeField000=" + feeField000 + ", " +
            "feeField001=" + feeField001 + ", " +
            "feeField002=" + feeField002 + ", " +
            "feeField003=" + feeField003 + ", " +
            "feeField004=" + feeField004 + ", " +
            "}";
    }
}
