package com.pnb.wire;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * WireDto025 — Data Transfer Object for wire operations.
 * Variant 25 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WireDto025 {

    @JsonProperty("wireField000")
    private LocalDate wireField000;

    @Size(max = 100)
    @JsonProperty("wireField001")
    private String wireField001;

    @JsonProperty("wireField002")
    private LocalDate wireField002;

    @DecimalMin(value = "0.00")
    @JsonProperty("wireField003")
    private BigDecimal wireField003;

    @JsonProperty("wireField004")
    private Boolean wireField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("wireField005")
    private BigDecimal wireField005;

    @Size(max = 40)
    @JsonProperty("wireField006")
    private String wireField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("wireField007")
    private BigDecimal wireField007;

    @Size(max = 200)
    @JsonProperty("wireField008")
    private String wireField008;

    public WireDto025() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final WireDto025 instance = new WireDto025();

        public Builder wireField000(LocalDate val) { instance.wireField000 = val; return this; }
        public Builder wireField001(String val) { instance.wireField001 = val; return this; }
        public Builder wireField002(LocalDate val) { instance.wireField002 = val; return this; }
        public Builder wireField003(BigDecimal val) { instance.wireField003 = val; return this; }
        public Builder wireField004(Boolean val) { instance.wireField004 = val; return this; }
        public Builder wireField005(BigDecimal val) { instance.wireField005 = val; return this; }
        public Builder wireField006(String val) { instance.wireField006 = val; return this; }
        public Builder wireField007(BigDecimal val) { instance.wireField007 = val; return this; }
        public Builder wireField008(String val) { instance.wireField008 = val; return this; }
        public WireDto025 build() { return instance; }
    }

    public LocalDate getWireField000() { return wireField000; }
    public void setWireField000(LocalDate wireField000) { this.wireField000 = wireField000; }

    public String getWireField001() { return wireField001; }
    public void setWireField001(String wireField001) { this.wireField001 = wireField001; }

    public LocalDate getWireField002() { return wireField002; }
    public void setWireField002(LocalDate wireField002) { this.wireField002 = wireField002; }

    public BigDecimal getWireField003() { return wireField003; }
    public void setWireField003(BigDecimal wireField003) { this.wireField003 = wireField003; }

    public Boolean getWireField004() { return wireField004; }
    public void setWireField004(Boolean wireField004) { this.wireField004 = wireField004; }

    public BigDecimal getWireField005() { return wireField005; }
    public void setWireField005(BigDecimal wireField005) { this.wireField005 = wireField005; }

    public String getWireField006() { return wireField006; }
    public void setWireField006(String wireField006) { this.wireField006 = wireField006; }

    public BigDecimal getWireField007() { return wireField007; }
    public void setWireField007(BigDecimal wireField007) { this.wireField007 = wireField007; }

    public String getWireField008() { return wireField008; }
    public void setWireField008(String wireField008) { this.wireField008 = wireField008; }

    @Override
    public String toString() {
        return "WireDto025{" +
            "wireField000=" + wireField000 + ", " +
            "wireField001=" + wireField001 + ", " +
            "wireField002=" + wireField002 + ", " +
            "wireField003=" + wireField003 + ", " +
            "wireField004=" + wireField004 + ", " +
            "}";
    }
}
