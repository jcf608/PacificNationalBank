package com.pnb.trust;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * TrustDto020 — Data Transfer Object for trust operations.
 * Variant 20 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TrustDto020 {

    @JsonProperty("trusField000")
    private Double trusField000;

    @JsonProperty("trusField001")
    private Boolean trusField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("trusField002")
    private BigDecimal trusField002;

    @JsonProperty("trusField003")
    private Double trusField003;

    @JsonProperty("trusField004")
    private LocalDate trusField004;

    @JsonProperty("trusField005")
    private Long trusField005;

    @JsonProperty("trusField006")
    private Long trusField006;

    @JsonProperty("trusField007")
    private LocalDate trusField007;

    @Size(max = 40)
    @JsonProperty("trusField008")
    private String trusField008;

    @JsonProperty("trusField009")
    private Boolean trusField009;

    @DecimalMin(value = "0.00")
    @JsonProperty("trusField010")
    private BigDecimal trusField010;

    @JsonProperty("trusField011")
    private Long trusField011;

    @JsonProperty("trusField012")
    private Double trusField012;

    @JsonProperty("trusField013")
    private Boolean trusField013;

    @JsonProperty("trusField014")
    private LocalDate trusField014;

    @JsonProperty("trusField015")
    private Integer trusField015;

    public TrustDto020() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final TrustDto020 instance = new TrustDto020();

        public Builder trusField000(Double val) { instance.trusField000 = val; return this; }
        public Builder trusField001(Boolean val) { instance.trusField001 = val; return this; }
        public Builder trusField002(BigDecimal val) { instance.trusField002 = val; return this; }
        public Builder trusField003(Double val) { instance.trusField003 = val; return this; }
        public Builder trusField004(LocalDate val) { instance.trusField004 = val; return this; }
        public Builder trusField005(Long val) { instance.trusField005 = val; return this; }
        public Builder trusField006(Long val) { instance.trusField006 = val; return this; }
        public Builder trusField007(LocalDate val) { instance.trusField007 = val; return this; }
        public Builder trusField008(String val) { instance.trusField008 = val; return this; }
        public Builder trusField009(Boolean val) { instance.trusField009 = val; return this; }
        public Builder trusField010(BigDecimal val) { instance.trusField010 = val; return this; }
        public Builder trusField011(Long val) { instance.trusField011 = val; return this; }
        public Builder trusField012(Double val) { instance.trusField012 = val; return this; }
        public Builder trusField013(Boolean val) { instance.trusField013 = val; return this; }
        public Builder trusField014(LocalDate val) { instance.trusField014 = val; return this; }
        public Builder trusField015(Integer val) { instance.trusField015 = val; return this; }
        public TrustDto020 build() { return instance; }
    }

    public Double getTrusField000() { return trusField000; }
    public void setTrusField000(Double trusField000) { this.trusField000 = trusField000; }

    public Boolean getTrusField001() { return trusField001; }
    public void setTrusField001(Boolean trusField001) { this.trusField001 = trusField001; }

    public BigDecimal getTrusField002() { return trusField002; }
    public void setTrusField002(BigDecimal trusField002) { this.trusField002 = trusField002; }

    public Double getTrusField003() { return trusField003; }
    public void setTrusField003(Double trusField003) { this.trusField003 = trusField003; }

    public LocalDate getTrusField004() { return trusField004; }
    public void setTrusField004(LocalDate trusField004) { this.trusField004 = trusField004; }

    public Long getTrusField005() { return trusField005; }
    public void setTrusField005(Long trusField005) { this.trusField005 = trusField005; }

    public Long getTrusField006() { return trusField006; }
    public void setTrusField006(Long trusField006) { this.trusField006 = trusField006; }

    public LocalDate getTrusField007() { return trusField007; }
    public void setTrusField007(LocalDate trusField007) { this.trusField007 = trusField007; }

    public String getTrusField008() { return trusField008; }
    public void setTrusField008(String trusField008) { this.trusField008 = trusField008; }

    public Boolean getTrusField009() { return trusField009; }
    public void setTrusField009(Boolean trusField009) { this.trusField009 = trusField009; }

    public BigDecimal getTrusField010() { return trusField010; }
    public void setTrusField010(BigDecimal trusField010) { this.trusField010 = trusField010; }

    public Long getTrusField011() { return trusField011; }
    public void setTrusField011(Long trusField011) { this.trusField011 = trusField011; }

    public Double getTrusField012() { return trusField012; }
    public void setTrusField012(Double trusField012) { this.trusField012 = trusField012; }

    public Boolean getTrusField013() { return trusField013; }
    public void setTrusField013(Boolean trusField013) { this.trusField013 = trusField013; }

    public LocalDate getTrusField014() { return trusField014; }
    public void setTrusField014(LocalDate trusField014) { this.trusField014 = trusField014; }

    public Integer getTrusField015() { return trusField015; }
    public void setTrusField015(Integer trusField015) { this.trusField015 = trusField015; }

    @Override
    public String toString() {
        return "TrustDto020{" +
            "trusField000=" + trusField000 + ", " +
            "trusField001=" + trusField001 + ", " +
            "trusField002=" + trusField002 + ", " +
            "trusField003=" + trusField003 + ", " +
            "trusField004=" + trusField004 + ", " +
            "}";
    }
}
