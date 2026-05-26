package com.pnb.wire;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * WireDto038 — Data Transfer Object for wire operations.
 * Variant 38 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WireDto038 {

    @JsonProperty("wireField000")
    private LocalDate wireField000;

    @JsonProperty("wireField001")
    private Integer wireField001;

    @JsonProperty("wireField002")
    private LocalDate wireField002;

    @JsonProperty("wireField003")
    private LocalDate wireField003;

    @JsonProperty("wireField004")
    private Double wireField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("wireField005")
    private BigDecimal wireField005;

    @JsonProperty("wireField006")
    private Boolean wireField006;

    @JsonProperty("wireField007")
    private Integer wireField007;

    @JsonProperty("wireField008")
    private LocalDate wireField008;

    @JsonProperty("wireField009")
    private Double wireField009;

    public WireDto038() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final WireDto038 instance = new WireDto038();

        public Builder wireField000(LocalDate val) { instance.wireField000 = val; return this; }
        public Builder wireField001(Integer val) { instance.wireField001 = val; return this; }
        public Builder wireField002(LocalDate val) { instance.wireField002 = val; return this; }
        public Builder wireField003(LocalDate val) { instance.wireField003 = val; return this; }
        public Builder wireField004(Double val) { instance.wireField004 = val; return this; }
        public Builder wireField005(BigDecimal val) { instance.wireField005 = val; return this; }
        public Builder wireField006(Boolean val) { instance.wireField006 = val; return this; }
        public Builder wireField007(Integer val) { instance.wireField007 = val; return this; }
        public Builder wireField008(LocalDate val) { instance.wireField008 = val; return this; }
        public Builder wireField009(Double val) { instance.wireField009 = val; return this; }
        public WireDto038 build() { return instance; }
    }

    public LocalDate getWireField000() { return wireField000; }
    public void setWireField000(LocalDate wireField000) { this.wireField000 = wireField000; }

    public Integer getWireField001() { return wireField001; }
    public void setWireField001(Integer wireField001) { this.wireField001 = wireField001; }

    public LocalDate getWireField002() { return wireField002; }
    public void setWireField002(LocalDate wireField002) { this.wireField002 = wireField002; }

    public LocalDate getWireField003() { return wireField003; }
    public void setWireField003(LocalDate wireField003) { this.wireField003 = wireField003; }

    public Double getWireField004() { return wireField004; }
    public void setWireField004(Double wireField004) { this.wireField004 = wireField004; }

    public BigDecimal getWireField005() { return wireField005; }
    public void setWireField005(BigDecimal wireField005) { this.wireField005 = wireField005; }

    public Boolean getWireField006() { return wireField006; }
    public void setWireField006(Boolean wireField006) { this.wireField006 = wireField006; }

    public Integer getWireField007() { return wireField007; }
    public void setWireField007(Integer wireField007) { this.wireField007 = wireField007; }

    public LocalDate getWireField008() { return wireField008; }
    public void setWireField008(LocalDate wireField008) { this.wireField008 = wireField008; }

    public Double getWireField009() { return wireField009; }
    public void setWireField009(Double wireField009) { this.wireField009 = wireField009; }

    @Override
    public String toString() {
        return "WireDto038{" +
            "wireField000=" + wireField000 + ", " +
            "wireField001=" + wireField001 + ", " +
            "wireField002=" + wireField002 + ", " +
            "wireField003=" + wireField003 + ", " +
            "wireField004=" + wireField004 + ", " +
            "}";
    }
}
