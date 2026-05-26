package com.pnb.fee;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * FeeDto030 — Data Transfer Object for fee operations.
 * Variant 30 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FeeDto030 {

    @DecimalMin(value = "0.00")
    @JsonProperty("feeField000")
    private BigDecimal feeField000;

    @Size(max = 200)
    @JsonProperty("feeField001")
    private String feeField001;

    @Size(max = 20)
    @JsonProperty("feeField002")
    private String feeField002;

    @JsonProperty("feeField003")
    private Boolean feeField003;

    @JsonProperty("feeField004")
    private Long feeField004;

    @Size(max = 40)
    @JsonProperty("feeField005")
    private String feeField005;

    @JsonProperty("feeField006")
    private Double feeField006;

    @JsonProperty("feeField007")
    private Long feeField007;

    @JsonProperty("feeField008")
    private Integer feeField008;

    @JsonProperty("feeField009")
    private Long feeField009;

    @Size(max = 40)
    @JsonProperty("feeField010")
    private String feeField010;

    @JsonProperty("feeField011")
    private Boolean feeField011;

    @Size(max = 20)
    @JsonProperty("feeField012")
    private String feeField012;

    @JsonProperty("feeField013")
    private Integer feeField013;

    public FeeDto030() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final FeeDto030 instance = new FeeDto030();

        public Builder feeField000(BigDecimal val) { instance.feeField000 = val; return this; }
        public Builder feeField001(String val) { instance.feeField001 = val; return this; }
        public Builder feeField002(String val) { instance.feeField002 = val; return this; }
        public Builder feeField003(Boolean val) { instance.feeField003 = val; return this; }
        public Builder feeField004(Long val) { instance.feeField004 = val; return this; }
        public Builder feeField005(String val) { instance.feeField005 = val; return this; }
        public Builder feeField006(Double val) { instance.feeField006 = val; return this; }
        public Builder feeField007(Long val) { instance.feeField007 = val; return this; }
        public Builder feeField008(Integer val) { instance.feeField008 = val; return this; }
        public Builder feeField009(Long val) { instance.feeField009 = val; return this; }
        public Builder feeField010(String val) { instance.feeField010 = val; return this; }
        public Builder feeField011(Boolean val) { instance.feeField011 = val; return this; }
        public Builder feeField012(String val) { instance.feeField012 = val; return this; }
        public Builder feeField013(Integer val) { instance.feeField013 = val; return this; }
        public FeeDto030 build() { return instance; }
    }

    public BigDecimal getFeeField000() { return feeField000; }
    public void setFeeField000(BigDecimal feeField000) { this.feeField000 = feeField000; }

    public String getFeeField001() { return feeField001; }
    public void setFeeField001(String feeField001) { this.feeField001 = feeField001; }

    public String getFeeField002() { return feeField002; }
    public void setFeeField002(String feeField002) { this.feeField002 = feeField002; }

    public Boolean getFeeField003() { return feeField003; }
    public void setFeeField003(Boolean feeField003) { this.feeField003 = feeField003; }

    public Long getFeeField004() { return feeField004; }
    public void setFeeField004(Long feeField004) { this.feeField004 = feeField004; }

    public String getFeeField005() { return feeField005; }
    public void setFeeField005(String feeField005) { this.feeField005 = feeField005; }

    public Double getFeeField006() { return feeField006; }
    public void setFeeField006(Double feeField006) { this.feeField006 = feeField006; }

    public Long getFeeField007() { return feeField007; }
    public void setFeeField007(Long feeField007) { this.feeField007 = feeField007; }

    public Integer getFeeField008() { return feeField008; }
    public void setFeeField008(Integer feeField008) { this.feeField008 = feeField008; }

    public Long getFeeField009() { return feeField009; }
    public void setFeeField009(Long feeField009) { this.feeField009 = feeField009; }

    public String getFeeField010() { return feeField010; }
    public void setFeeField010(String feeField010) { this.feeField010 = feeField010; }

    public Boolean getFeeField011() { return feeField011; }
    public void setFeeField011(Boolean feeField011) { this.feeField011 = feeField011; }

    public String getFeeField012() { return feeField012; }
    public void setFeeField012(String feeField012) { this.feeField012 = feeField012; }

    public Integer getFeeField013() { return feeField013; }
    public void setFeeField013(Integer feeField013) { this.feeField013 = feeField013; }

    @Override
    public String toString() {
        return "FeeDto030{" +
            "feeField000=" + feeField000 + ", " +
            "feeField001=" + feeField001 + ", " +
            "feeField002=" + feeField002 + ", " +
            "feeField003=" + feeField003 + ", " +
            "feeField004=" + feeField004 + ", " +
            "}";
    }
}
