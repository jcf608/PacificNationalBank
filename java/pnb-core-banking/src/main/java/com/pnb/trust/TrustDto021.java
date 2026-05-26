package com.pnb.trust;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * TrustDto021 — Data Transfer Object for trust operations.
 * Variant 21 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TrustDto021 {

    @DecimalMin(value = "0.00")
    @JsonProperty("trusField000")
    private BigDecimal trusField000;

    @JsonProperty("trusField001")
    private LocalDate trusField001;

    @JsonProperty("trusField002")
    private Long trusField002;

    @JsonProperty("trusField003")
    private LocalDate trusField003;

    @DecimalMin(value = "0.00")
    @JsonProperty("trusField004")
    private BigDecimal trusField004;

    @JsonProperty("trusField005")
    private Integer trusField005;

    @Size(max = 200)
    @JsonProperty("trusField006")
    private String trusField006;

    @JsonProperty("trusField007")
    private Long trusField007;

    @JsonProperty("trusField008")
    private Integer trusField008;

    @DecimalMin(value = "0.00")
    @JsonProperty("trusField009")
    private BigDecimal trusField009;

    @JsonProperty("trusField010")
    private Double trusField010;

    @JsonProperty("trusField011")
    private Boolean trusField011;

    @JsonProperty("trusField012")
    private Boolean trusField012;

    @Size(max = 60)
    @JsonProperty("trusField013")
    private String trusField013;

    @JsonProperty("trusField014")
    private Integer trusField014;

    @JsonProperty("trusField015")
    private Integer trusField015;

    @DecimalMin(value = "0.00")
    @JsonProperty("trusField016")
    private BigDecimal trusField016;

    public TrustDto021() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final TrustDto021 instance = new TrustDto021();

        public Builder trusField000(BigDecimal val) { instance.trusField000 = val; return this; }
        public Builder trusField001(LocalDate val) { instance.trusField001 = val; return this; }
        public Builder trusField002(Long val) { instance.trusField002 = val; return this; }
        public Builder trusField003(LocalDate val) { instance.trusField003 = val; return this; }
        public Builder trusField004(BigDecimal val) { instance.trusField004 = val; return this; }
        public Builder trusField005(Integer val) { instance.trusField005 = val; return this; }
        public Builder trusField006(String val) { instance.trusField006 = val; return this; }
        public Builder trusField007(Long val) { instance.trusField007 = val; return this; }
        public Builder trusField008(Integer val) { instance.trusField008 = val; return this; }
        public Builder trusField009(BigDecimal val) { instance.trusField009 = val; return this; }
        public Builder trusField010(Double val) { instance.trusField010 = val; return this; }
        public Builder trusField011(Boolean val) { instance.trusField011 = val; return this; }
        public Builder trusField012(Boolean val) { instance.trusField012 = val; return this; }
        public Builder trusField013(String val) { instance.trusField013 = val; return this; }
        public Builder trusField014(Integer val) { instance.trusField014 = val; return this; }
        public Builder trusField015(Integer val) { instance.trusField015 = val; return this; }
        public Builder trusField016(BigDecimal val) { instance.trusField016 = val; return this; }
        public TrustDto021 build() { return instance; }
    }

    public BigDecimal getTrusField000() { return trusField000; }
    public void setTrusField000(BigDecimal trusField000) { this.trusField000 = trusField000; }

    public LocalDate getTrusField001() { return trusField001; }
    public void setTrusField001(LocalDate trusField001) { this.trusField001 = trusField001; }

    public Long getTrusField002() { return trusField002; }
    public void setTrusField002(Long trusField002) { this.trusField002 = trusField002; }

    public LocalDate getTrusField003() { return trusField003; }
    public void setTrusField003(LocalDate trusField003) { this.trusField003 = trusField003; }

    public BigDecimal getTrusField004() { return trusField004; }
    public void setTrusField004(BigDecimal trusField004) { this.trusField004 = trusField004; }

    public Integer getTrusField005() { return trusField005; }
    public void setTrusField005(Integer trusField005) { this.trusField005 = trusField005; }

    public String getTrusField006() { return trusField006; }
    public void setTrusField006(String trusField006) { this.trusField006 = trusField006; }

    public Long getTrusField007() { return trusField007; }
    public void setTrusField007(Long trusField007) { this.trusField007 = trusField007; }

    public Integer getTrusField008() { return trusField008; }
    public void setTrusField008(Integer trusField008) { this.trusField008 = trusField008; }

    public BigDecimal getTrusField009() { return trusField009; }
    public void setTrusField009(BigDecimal trusField009) { this.trusField009 = trusField009; }

    public Double getTrusField010() { return trusField010; }
    public void setTrusField010(Double trusField010) { this.trusField010 = trusField010; }

    public Boolean getTrusField011() { return trusField011; }
    public void setTrusField011(Boolean trusField011) { this.trusField011 = trusField011; }

    public Boolean getTrusField012() { return trusField012; }
    public void setTrusField012(Boolean trusField012) { this.trusField012 = trusField012; }

    public String getTrusField013() { return trusField013; }
    public void setTrusField013(String trusField013) { this.trusField013 = trusField013; }

    public Integer getTrusField014() { return trusField014; }
    public void setTrusField014(Integer trusField014) { this.trusField014 = trusField014; }

    public Integer getTrusField015() { return trusField015; }
    public void setTrusField015(Integer trusField015) { this.trusField015 = trusField015; }

    public BigDecimal getTrusField016() { return trusField016; }
    public void setTrusField016(BigDecimal trusField016) { this.trusField016 = trusField016; }

    @Override
    public String toString() {
        return "TrustDto021{" +
            "trusField000=" + trusField000 + ", " +
            "trusField001=" + trusField001 + ", " +
            "trusField002=" + trusField002 + ", " +
            "trusField003=" + trusField003 + ", " +
            "trusField004=" + trusField004 + ", " +
            "}";
    }
}
