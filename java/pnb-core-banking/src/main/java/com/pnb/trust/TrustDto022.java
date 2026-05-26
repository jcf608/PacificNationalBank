package com.pnb.trust;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * TrustDto022 — Data Transfer Object for trust operations.
 * Variant 22 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TrustDto022 {

    @DecimalMin(value = "0.00")
    @JsonProperty("trusField000")
    private BigDecimal trusField000;

    @JsonProperty("trusField001")
    private Double trusField001;

    @JsonProperty("trusField002")
    private LocalDate trusField002;

    @Size(max = 60)
    @JsonProperty("trusField003")
    private String trusField003;

    @JsonProperty("trusField004")
    private Boolean trusField004;

    @JsonProperty("trusField005")
    private Long trusField005;

    @JsonProperty("trusField006")
    private Long trusField006;

    @JsonProperty("trusField007")
    private Boolean trusField007;

    @JsonProperty("trusField008")
    private Double trusField008;

    @JsonProperty("trusField009")
    private LocalDate trusField009;

    @JsonProperty("trusField010")
    private Integer trusField010;

    @JsonProperty("trusField011")
    private LocalDate trusField011;

    @Size(max = 20)
    @JsonProperty("trusField012")
    private String trusField012;

    @JsonProperty("trusField013")
    private Integer trusField013;

    @JsonProperty("trusField014")
    private Double trusField014;

    @Size(max = 60)
    @JsonProperty("trusField015")
    private String trusField015;

    @DecimalMin(value = "0.00")
    @JsonProperty("trusField016")
    private BigDecimal trusField016;

    @JsonProperty("trusField017")
    private Long trusField017;

    public TrustDto022() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final TrustDto022 instance = new TrustDto022();

        public Builder trusField000(BigDecimal val) { instance.trusField000 = val; return this; }
        public Builder trusField001(Double val) { instance.trusField001 = val; return this; }
        public Builder trusField002(LocalDate val) { instance.trusField002 = val; return this; }
        public Builder trusField003(String val) { instance.trusField003 = val; return this; }
        public Builder trusField004(Boolean val) { instance.trusField004 = val; return this; }
        public Builder trusField005(Long val) { instance.trusField005 = val; return this; }
        public Builder trusField006(Long val) { instance.trusField006 = val; return this; }
        public Builder trusField007(Boolean val) { instance.trusField007 = val; return this; }
        public Builder trusField008(Double val) { instance.trusField008 = val; return this; }
        public Builder trusField009(LocalDate val) { instance.trusField009 = val; return this; }
        public Builder trusField010(Integer val) { instance.trusField010 = val; return this; }
        public Builder trusField011(LocalDate val) { instance.trusField011 = val; return this; }
        public Builder trusField012(String val) { instance.trusField012 = val; return this; }
        public Builder trusField013(Integer val) { instance.trusField013 = val; return this; }
        public Builder trusField014(Double val) { instance.trusField014 = val; return this; }
        public Builder trusField015(String val) { instance.trusField015 = val; return this; }
        public Builder trusField016(BigDecimal val) { instance.trusField016 = val; return this; }
        public Builder trusField017(Long val) { instance.trusField017 = val; return this; }
        public TrustDto022 build() { return instance; }
    }

    public BigDecimal getTrusField000() { return trusField000; }
    public void setTrusField000(BigDecimal trusField000) { this.trusField000 = trusField000; }

    public Double getTrusField001() { return trusField001; }
    public void setTrusField001(Double trusField001) { this.trusField001 = trusField001; }

    public LocalDate getTrusField002() { return trusField002; }
    public void setTrusField002(LocalDate trusField002) { this.trusField002 = trusField002; }

    public String getTrusField003() { return trusField003; }
    public void setTrusField003(String trusField003) { this.trusField003 = trusField003; }

    public Boolean getTrusField004() { return trusField004; }
    public void setTrusField004(Boolean trusField004) { this.trusField004 = trusField004; }

    public Long getTrusField005() { return trusField005; }
    public void setTrusField005(Long trusField005) { this.trusField005 = trusField005; }

    public Long getTrusField006() { return trusField006; }
    public void setTrusField006(Long trusField006) { this.trusField006 = trusField006; }

    public Boolean getTrusField007() { return trusField007; }
    public void setTrusField007(Boolean trusField007) { this.trusField007 = trusField007; }

    public Double getTrusField008() { return trusField008; }
    public void setTrusField008(Double trusField008) { this.trusField008 = trusField008; }

    public LocalDate getTrusField009() { return trusField009; }
    public void setTrusField009(LocalDate trusField009) { this.trusField009 = trusField009; }

    public Integer getTrusField010() { return trusField010; }
    public void setTrusField010(Integer trusField010) { this.trusField010 = trusField010; }

    public LocalDate getTrusField011() { return trusField011; }
    public void setTrusField011(LocalDate trusField011) { this.trusField011 = trusField011; }

    public String getTrusField012() { return trusField012; }
    public void setTrusField012(String trusField012) { this.trusField012 = trusField012; }

    public Integer getTrusField013() { return trusField013; }
    public void setTrusField013(Integer trusField013) { this.trusField013 = trusField013; }

    public Double getTrusField014() { return trusField014; }
    public void setTrusField014(Double trusField014) { this.trusField014 = trusField014; }

    public String getTrusField015() { return trusField015; }
    public void setTrusField015(String trusField015) { this.trusField015 = trusField015; }

    public BigDecimal getTrusField016() { return trusField016; }
    public void setTrusField016(BigDecimal trusField016) { this.trusField016 = trusField016; }

    public Long getTrusField017() { return trusField017; }
    public void setTrusField017(Long trusField017) { this.trusField017 = trusField017; }

    @Override
    public String toString() {
        return "TrustDto022{" +
            "trusField000=" + trusField000 + ", " +
            "trusField001=" + trusField001 + ", " +
            "trusField002=" + trusField002 + ", " +
            "trusField003=" + trusField003 + ", " +
            "trusField004=" + trusField004 + ", " +
            "}";
    }
}
