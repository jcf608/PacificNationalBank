package com.pnb.fee;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * FeeDto039 — Data Transfer Object for fee operations.
 * Variant 39 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FeeDto039 {

    @Size(max = 100)
    @JsonProperty("feeField000")
    private String feeField000;

    @JsonProperty("feeField001")
    private Long feeField001;

    @Size(max = 200)
    @JsonProperty("feeField002")
    private String feeField002;

    @JsonProperty("feeField003")
    private Boolean feeField003;

    @Size(max = 60)
    @JsonProperty("feeField004")
    private String feeField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("feeField005")
    private BigDecimal feeField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("feeField006")
    private BigDecimal feeField006;

    @JsonProperty("feeField007")
    private Integer feeField007;

    @JsonProperty("feeField008")
    private Long feeField008;

    @Size(max = 100)
    @JsonProperty("feeField009")
    private String feeField009;

    @Size(max = 100)
    @JsonProperty("feeField010")
    private String feeField010;

    public FeeDto039() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final FeeDto039 instance = new FeeDto039();

        public Builder feeField000(String val) { instance.feeField000 = val; return this; }
        public Builder feeField001(Long val) { instance.feeField001 = val; return this; }
        public Builder feeField002(String val) { instance.feeField002 = val; return this; }
        public Builder feeField003(Boolean val) { instance.feeField003 = val; return this; }
        public Builder feeField004(String val) { instance.feeField004 = val; return this; }
        public Builder feeField005(BigDecimal val) { instance.feeField005 = val; return this; }
        public Builder feeField006(BigDecimal val) { instance.feeField006 = val; return this; }
        public Builder feeField007(Integer val) { instance.feeField007 = val; return this; }
        public Builder feeField008(Long val) { instance.feeField008 = val; return this; }
        public Builder feeField009(String val) { instance.feeField009 = val; return this; }
        public Builder feeField010(String val) { instance.feeField010 = val; return this; }
        public FeeDto039 build() { return instance; }
    }

    public String getFeeField000() { return feeField000; }
    public void setFeeField000(String feeField000) { this.feeField000 = feeField000; }

    public Long getFeeField001() { return feeField001; }
    public void setFeeField001(Long feeField001) { this.feeField001 = feeField001; }

    public String getFeeField002() { return feeField002; }
    public void setFeeField002(String feeField002) { this.feeField002 = feeField002; }

    public Boolean getFeeField003() { return feeField003; }
    public void setFeeField003(Boolean feeField003) { this.feeField003 = feeField003; }

    public String getFeeField004() { return feeField004; }
    public void setFeeField004(String feeField004) { this.feeField004 = feeField004; }

    public BigDecimal getFeeField005() { return feeField005; }
    public void setFeeField005(BigDecimal feeField005) { this.feeField005 = feeField005; }

    public BigDecimal getFeeField006() { return feeField006; }
    public void setFeeField006(BigDecimal feeField006) { this.feeField006 = feeField006; }

    public Integer getFeeField007() { return feeField007; }
    public void setFeeField007(Integer feeField007) { this.feeField007 = feeField007; }

    public Long getFeeField008() { return feeField008; }
    public void setFeeField008(Long feeField008) { this.feeField008 = feeField008; }

    public String getFeeField009() { return feeField009; }
    public void setFeeField009(String feeField009) { this.feeField009 = feeField009; }

    public String getFeeField010() { return feeField010; }
    public void setFeeField010(String feeField010) { this.feeField010 = feeField010; }

    @Override
    public String toString() {
        return "FeeDto039{" +
            "feeField000=" + feeField000 + ", " +
            "feeField001=" + feeField001 + ", " +
            "feeField002=" + feeField002 + ", " +
            "feeField003=" + feeField003 + ", " +
            "feeField004=" + feeField004 + ", " +
            "}";
    }
}
