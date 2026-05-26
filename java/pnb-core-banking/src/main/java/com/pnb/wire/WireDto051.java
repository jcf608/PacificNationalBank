package com.pnb.wire;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * WireDto051 — Data Transfer Object for wire operations.
 * Variant 51 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WireDto051 {

    @DecimalMin(value = "0.00")
    @JsonProperty("wireField000")
    private BigDecimal wireField000;

    @JsonProperty("wireField001")
    private Double wireField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("wireField002")
    private BigDecimal wireField002;

    @JsonProperty("wireField003")
    private Double wireField003;

    @JsonProperty("wireField004")
    private Integer wireField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("wireField005")
    private BigDecimal wireField005;

    @JsonProperty("wireField006")
    private Integer wireField006;

    @JsonProperty("wireField007")
    private Integer wireField007;

    @JsonProperty("wireField008")
    private Double wireField008;

    @JsonProperty("wireField009")
    private Double wireField009;

    @Size(max = 100)
    @JsonProperty("wireField010")
    private String wireField010;

    public WireDto051() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final WireDto051 instance = new WireDto051();

        public Builder wireField000(BigDecimal val) { instance.wireField000 = val; return this; }
        public Builder wireField001(Double val) { instance.wireField001 = val; return this; }
        public Builder wireField002(BigDecimal val) { instance.wireField002 = val; return this; }
        public Builder wireField003(Double val) { instance.wireField003 = val; return this; }
        public Builder wireField004(Integer val) { instance.wireField004 = val; return this; }
        public Builder wireField005(BigDecimal val) { instance.wireField005 = val; return this; }
        public Builder wireField006(Integer val) { instance.wireField006 = val; return this; }
        public Builder wireField007(Integer val) { instance.wireField007 = val; return this; }
        public Builder wireField008(Double val) { instance.wireField008 = val; return this; }
        public Builder wireField009(Double val) { instance.wireField009 = val; return this; }
        public Builder wireField010(String val) { instance.wireField010 = val; return this; }
        public WireDto051 build() { return instance; }
    }

    public BigDecimal getWireField000() { return wireField000; }
    public void setWireField000(BigDecimal wireField000) { this.wireField000 = wireField000; }

    public Double getWireField001() { return wireField001; }
    public void setWireField001(Double wireField001) { this.wireField001 = wireField001; }

    public BigDecimal getWireField002() { return wireField002; }
    public void setWireField002(BigDecimal wireField002) { this.wireField002 = wireField002; }

    public Double getWireField003() { return wireField003; }
    public void setWireField003(Double wireField003) { this.wireField003 = wireField003; }

    public Integer getWireField004() { return wireField004; }
    public void setWireField004(Integer wireField004) { this.wireField004 = wireField004; }

    public BigDecimal getWireField005() { return wireField005; }
    public void setWireField005(BigDecimal wireField005) { this.wireField005 = wireField005; }

    public Integer getWireField006() { return wireField006; }
    public void setWireField006(Integer wireField006) { this.wireField006 = wireField006; }

    public Integer getWireField007() { return wireField007; }
    public void setWireField007(Integer wireField007) { this.wireField007 = wireField007; }

    public Double getWireField008() { return wireField008; }
    public void setWireField008(Double wireField008) { this.wireField008 = wireField008; }

    public Double getWireField009() { return wireField009; }
    public void setWireField009(Double wireField009) { this.wireField009 = wireField009; }

    public String getWireField010() { return wireField010; }
    public void setWireField010(String wireField010) { this.wireField010 = wireField010; }

    @Override
    public String toString() {
        return "WireDto051{" +
            "wireField000=" + wireField000 + ", " +
            "wireField001=" + wireField001 + ", " +
            "wireField002=" + wireField002 + ", " +
            "wireField003=" + wireField003 + ", " +
            "wireField004=" + wireField004 + ", " +
            "}";
    }
}
