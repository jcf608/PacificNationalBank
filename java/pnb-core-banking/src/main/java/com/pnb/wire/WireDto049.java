package com.pnb.wire;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * WireDto049 — Data Transfer Object for wire operations.
 * Variant 49 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WireDto049 {

    @Size(max = 200)
    @JsonProperty("wireField000")
    private String wireField000;

    @Size(max = 60)
    @JsonProperty("wireField001")
    private String wireField001;

    @JsonProperty("wireField002")
    private Double wireField002;

    @DecimalMin(value = "0.00")
    @JsonProperty("wireField003")
    private BigDecimal wireField003;

    @JsonProperty("wireField004")
    private Long wireField004;

    @JsonProperty("wireField005")
    private Double wireField005;

    @JsonProperty("wireField006")
    private Double wireField006;

    @JsonProperty("wireField007")
    private LocalDate wireField007;

    @JsonProperty("wireField008")
    private Boolean wireField008;

    public WireDto049() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final WireDto049 instance = new WireDto049();

        public Builder wireField000(String val) { instance.wireField000 = val; return this; }
        public Builder wireField001(String val) { instance.wireField001 = val; return this; }
        public Builder wireField002(Double val) { instance.wireField002 = val; return this; }
        public Builder wireField003(BigDecimal val) { instance.wireField003 = val; return this; }
        public Builder wireField004(Long val) { instance.wireField004 = val; return this; }
        public Builder wireField005(Double val) { instance.wireField005 = val; return this; }
        public Builder wireField006(Double val) { instance.wireField006 = val; return this; }
        public Builder wireField007(LocalDate val) { instance.wireField007 = val; return this; }
        public Builder wireField008(Boolean val) { instance.wireField008 = val; return this; }
        public WireDto049 build() { return instance; }
    }

    public String getWireField000() { return wireField000; }
    public void setWireField000(String wireField000) { this.wireField000 = wireField000; }

    public String getWireField001() { return wireField001; }
    public void setWireField001(String wireField001) { this.wireField001 = wireField001; }

    public Double getWireField002() { return wireField002; }
    public void setWireField002(Double wireField002) { this.wireField002 = wireField002; }

    public BigDecimal getWireField003() { return wireField003; }
    public void setWireField003(BigDecimal wireField003) { this.wireField003 = wireField003; }

    public Long getWireField004() { return wireField004; }
    public void setWireField004(Long wireField004) { this.wireField004 = wireField004; }

    public Double getWireField005() { return wireField005; }
    public void setWireField005(Double wireField005) { this.wireField005 = wireField005; }

    public Double getWireField006() { return wireField006; }
    public void setWireField006(Double wireField006) { this.wireField006 = wireField006; }

    public LocalDate getWireField007() { return wireField007; }
    public void setWireField007(LocalDate wireField007) { this.wireField007 = wireField007; }

    public Boolean getWireField008() { return wireField008; }
    public void setWireField008(Boolean wireField008) { this.wireField008 = wireField008; }

    @Override
    public String toString() {
        return "WireDto049{" +
            "wireField000=" + wireField000 + ", " +
            "wireField001=" + wireField001 + ", " +
            "wireField002=" + wireField002 + ", " +
            "wireField003=" + wireField003 + ", " +
            "wireField004=" + wireField004 + ", " +
            "}";
    }
}
