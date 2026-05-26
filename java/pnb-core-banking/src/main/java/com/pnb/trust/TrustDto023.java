package com.pnb.trust;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * TrustDto023 — Data Transfer Object for trust operations.
 * Variant 23 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TrustDto023 {

    @JsonProperty("trusField000")
    private Long trusField000;

    @JsonProperty("trusField001")
    private Double trusField001;

    @JsonProperty("trusField002")
    private Long trusField002;

    @Size(max = 20)
    @JsonProperty("trusField003")
    private String trusField003;

    @JsonProperty("trusField004")
    private Long trusField004;

    @JsonProperty("trusField005")
    private Boolean trusField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("trusField006")
    private BigDecimal trusField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("trusField007")
    private BigDecimal trusField007;

    @JsonProperty("trusField008")
    private Long trusField008;

    @JsonProperty("trusField009")
    private Long trusField009;

    @JsonProperty("trusField010")
    private LocalDate trusField010;

    @JsonProperty("trusField011")
    private Boolean trusField011;

    @DecimalMin(value = "0.00")
    @JsonProperty("trusField012")
    private BigDecimal trusField012;

    @Size(max = 100)
    @JsonProperty("trusField013")
    private String trusField013;

    @JsonProperty("trusField014")
    private Long trusField014;

    @JsonProperty("trusField015")
    private Boolean trusField015;

    @Size(max = 200)
    @JsonProperty("trusField016")
    private String trusField016;

    @JsonProperty("trusField017")
    private LocalDate trusField017;

    @DecimalMin(value = "0.00")
    @JsonProperty("trusField018")
    private BigDecimal trusField018;

    public TrustDto023() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final TrustDto023 instance = new TrustDto023();

        public Builder trusField000(Long val) { instance.trusField000 = val; return this; }
        public Builder trusField001(Double val) { instance.trusField001 = val; return this; }
        public Builder trusField002(Long val) { instance.trusField002 = val; return this; }
        public Builder trusField003(String val) { instance.trusField003 = val; return this; }
        public Builder trusField004(Long val) { instance.trusField004 = val; return this; }
        public Builder trusField005(Boolean val) { instance.trusField005 = val; return this; }
        public Builder trusField006(BigDecimal val) { instance.trusField006 = val; return this; }
        public Builder trusField007(BigDecimal val) { instance.trusField007 = val; return this; }
        public Builder trusField008(Long val) { instance.trusField008 = val; return this; }
        public Builder trusField009(Long val) { instance.trusField009 = val; return this; }
        public Builder trusField010(LocalDate val) { instance.trusField010 = val; return this; }
        public Builder trusField011(Boolean val) { instance.trusField011 = val; return this; }
        public Builder trusField012(BigDecimal val) { instance.trusField012 = val; return this; }
        public Builder trusField013(String val) { instance.trusField013 = val; return this; }
        public Builder trusField014(Long val) { instance.trusField014 = val; return this; }
        public Builder trusField015(Boolean val) { instance.trusField015 = val; return this; }
        public Builder trusField016(String val) { instance.trusField016 = val; return this; }
        public Builder trusField017(LocalDate val) { instance.trusField017 = val; return this; }
        public Builder trusField018(BigDecimal val) { instance.trusField018 = val; return this; }
        public TrustDto023 build() { return instance; }
    }

    public Long getTrusField000() { return trusField000; }
    public void setTrusField000(Long trusField000) { this.trusField000 = trusField000; }

    public Double getTrusField001() { return trusField001; }
    public void setTrusField001(Double trusField001) { this.trusField001 = trusField001; }

    public Long getTrusField002() { return trusField002; }
    public void setTrusField002(Long trusField002) { this.trusField002 = trusField002; }

    public String getTrusField003() { return trusField003; }
    public void setTrusField003(String trusField003) { this.trusField003 = trusField003; }

    public Long getTrusField004() { return trusField004; }
    public void setTrusField004(Long trusField004) { this.trusField004 = trusField004; }

    public Boolean getTrusField005() { return trusField005; }
    public void setTrusField005(Boolean trusField005) { this.trusField005 = trusField005; }

    public BigDecimal getTrusField006() { return trusField006; }
    public void setTrusField006(BigDecimal trusField006) { this.trusField006 = trusField006; }

    public BigDecimal getTrusField007() { return trusField007; }
    public void setTrusField007(BigDecimal trusField007) { this.trusField007 = trusField007; }

    public Long getTrusField008() { return trusField008; }
    public void setTrusField008(Long trusField008) { this.trusField008 = trusField008; }

    public Long getTrusField009() { return trusField009; }
    public void setTrusField009(Long trusField009) { this.trusField009 = trusField009; }

    public LocalDate getTrusField010() { return trusField010; }
    public void setTrusField010(LocalDate trusField010) { this.trusField010 = trusField010; }

    public Boolean getTrusField011() { return trusField011; }
    public void setTrusField011(Boolean trusField011) { this.trusField011 = trusField011; }

    public BigDecimal getTrusField012() { return trusField012; }
    public void setTrusField012(BigDecimal trusField012) { this.trusField012 = trusField012; }

    public String getTrusField013() { return trusField013; }
    public void setTrusField013(String trusField013) { this.trusField013 = trusField013; }

    public Long getTrusField014() { return trusField014; }
    public void setTrusField014(Long trusField014) { this.trusField014 = trusField014; }

    public Boolean getTrusField015() { return trusField015; }
    public void setTrusField015(Boolean trusField015) { this.trusField015 = trusField015; }

    public String getTrusField016() { return trusField016; }
    public void setTrusField016(String trusField016) { this.trusField016 = trusField016; }

    public LocalDate getTrusField017() { return trusField017; }
    public void setTrusField017(LocalDate trusField017) { this.trusField017 = trusField017; }

    public BigDecimal getTrusField018() { return trusField018; }
    public void setTrusField018(BigDecimal trusField018) { this.trusField018 = trusField018; }

    @Override
    public String toString() {
        return "TrustDto023{" +
            "trusField000=" + trusField000 + ", " +
            "trusField001=" + trusField001 + ", " +
            "trusField002=" + trusField002 + ", " +
            "trusField003=" + trusField003 + ", " +
            "trusField004=" + trusField004 + ", " +
            "}";
    }
}
