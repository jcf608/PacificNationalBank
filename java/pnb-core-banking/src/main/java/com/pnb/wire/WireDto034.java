package com.pnb.wire;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * WireDto034 — Data Transfer Object for wire operations.
 * Variant 34 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WireDto034 {

    @JsonProperty("wireField000")
    private LocalDate wireField000;

    @JsonProperty("wireField001")
    private LocalDate wireField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("wireField002")
    private BigDecimal wireField002;

    @JsonProperty("wireField003")
    private Integer wireField003;

    @JsonProperty("wireField004")
    private Long wireField004;

    @JsonProperty("wireField005")
    private Double wireField005;

    @JsonProperty("wireField006")
    private LocalDate wireField006;

    @JsonProperty("wireField007")
    private Integer wireField007;

    @JsonProperty("wireField008")
    private LocalDate wireField008;

    @JsonProperty("wireField009")
    private LocalDate wireField009;

    @JsonProperty("wireField010")
    private Long wireField010;

    @JsonProperty("wireField011")
    private Boolean wireField011;

    @JsonProperty("wireField012")
    private Integer wireField012;

    @DecimalMin(value = "0.00")
    @JsonProperty("wireField013")
    private BigDecimal wireField013;

    @JsonProperty("wireField014")
    private Double wireField014;

    @JsonProperty("wireField015")
    private Boolean wireField015;

    @DecimalMin(value = "0.00")
    @JsonProperty("wireField016")
    private BigDecimal wireField016;

    @DecimalMin(value = "0.00")
    @JsonProperty("wireField017")
    private BigDecimal wireField017;

    public WireDto034() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final WireDto034 instance = new WireDto034();

        public Builder wireField000(LocalDate val) { instance.wireField000 = val; return this; }
        public Builder wireField001(LocalDate val) { instance.wireField001 = val; return this; }
        public Builder wireField002(BigDecimal val) { instance.wireField002 = val; return this; }
        public Builder wireField003(Integer val) { instance.wireField003 = val; return this; }
        public Builder wireField004(Long val) { instance.wireField004 = val; return this; }
        public Builder wireField005(Double val) { instance.wireField005 = val; return this; }
        public Builder wireField006(LocalDate val) { instance.wireField006 = val; return this; }
        public Builder wireField007(Integer val) { instance.wireField007 = val; return this; }
        public Builder wireField008(LocalDate val) { instance.wireField008 = val; return this; }
        public Builder wireField009(LocalDate val) { instance.wireField009 = val; return this; }
        public Builder wireField010(Long val) { instance.wireField010 = val; return this; }
        public Builder wireField011(Boolean val) { instance.wireField011 = val; return this; }
        public Builder wireField012(Integer val) { instance.wireField012 = val; return this; }
        public Builder wireField013(BigDecimal val) { instance.wireField013 = val; return this; }
        public Builder wireField014(Double val) { instance.wireField014 = val; return this; }
        public Builder wireField015(Boolean val) { instance.wireField015 = val; return this; }
        public Builder wireField016(BigDecimal val) { instance.wireField016 = val; return this; }
        public Builder wireField017(BigDecimal val) { instance.wireField017 = val; return this; }
        public WireDto034 build() { return instance; }
    }

    public LocalDate getWireField000() { return wireField000; }
    public void setWireField000(LocalDate wireField000) { this.wireField000 = wireField000; }

    public LocalDate getWireField001() { return wireField001; }
    public void setWireField001(LocalDate wireField001) { this.wireField001 = wireField001; }

    public BigDecimal getWireField002() { return wireField002; }
    public void setWireField002(BigDecimal wireField002) { this.wireField002 = wireField002; }

    public Integer getWireField003() { return wireField003; }
    public void setWireField003(Integer wireField003) { this.wireField003 = wireField003; }

    public Long getWireField004() { return wireField004; }
    public void setWireField004(Long wireField004) { this.wireField004 = wireField004; }

    public Double getWireField005() { return wireField005; }
    public void setWireField005(Double wireField005) { this.wireField005 = wireField005; }

    public LocalDate getWireField006() { return wireField006; }
    public void setWireField006(LocalDate wireField006) { this.wireField006 = wireField006; }

    public Integer getWireField007() { return wireField007; }
    public void setWireField007(Integer wireField007) { this.wireField007 = wireField007; }

    public LocalDate getWireField008() { return wireField008; }
    public void setWireField008(LocalDate wireField008) { this.wireField008 = wireField008; }

    public LocalDate getWireField009() { return wireField009; }
    public void setWireField009(LocalDate wireField009) { this.wireField009 = wireField009; }

    public Long getWireField010() { return wireField010; }
    public void setWireField010(Long wireField010) { this.wireField010 = wireField010; }

    public Boolean getWireField011() { return wireField011; }
    public void setWireField011(Boolean wireField011) { this.wireField011 = wireField011; }

    public Integer getWireField012() { return wireField012; }
    public void setWireField012(Integer wireField012) { this.wireField012 = wireField012; }

    public BigDecimal getWireField013() { return wireField013; }
    public void setWireField013(BigDecimal wireField013) { this.wireField013 = wireField013; }

    public Double getWireField014() { return wireField014; }
    public void setWireField014(Double wireField014) { this.wireField014 = wireField014; }

    public Boolean getWireField015() { return wireField015; }
    public void setWireField015(Boolean wireField015) { this.wireField015 = wireField015; }

    public BigDecimal getWireField016() { return wireField016; }
    public void setWireField016(BigDecimal wireField016) { this.wireField016 = wireField016; }

    public BigDecimal getWireField017() { return wireField017; }
    public void setWireField017(BigDecimal wireField017) { this.wireField017 = wireField017; }

    @Override
    public String toString() {
        return "WireDto034{" +
            "wireField000=" + wireField000 + ", " +
            "wireField001=" + wireField001 + ", " +
            "wireField002=" + wireField002 + ", " +
            "wireField003=" + wireField003 + ", " +
            "wireField004=" + wireField004 + ", " +
            "}";
    }
}
