package com.pnb.wire;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * WireDto037 — Data Transfer Object for wire operations.
 * Variant 37 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WireDto037 {

    @JsonProperty("wireField000")
    private LocalDate wireField000;

    @JsonProperty("wireField001")
    private LocalDate wireField001;

    @JsonProperty("wireField002")
    private Boolean wireField002;

    @JsonProperty("wireField003")
    private LocalDate wireField003;

    @DecimalMin(value = "0.00")
    @JsonProperty("wireField004")
    private BigDecimal wireField004;

    @JsonProperty("wireField005")
    private Long wireField005;

    @JsonProperty("wireField006")
    private Boolean wireField006;

    @JsonProperty("wireField007")
    private Long wireField007;

    @Size(max = 20)
    @JsonProperty("wireField008")
    private String wireField008;

    public WireDto037() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final WireDto037 instance = new WireDto037();

        public Builder wireField000(LocalDate val) { instance.wireField000 = val; return this; }
        public Builder wireField001(LocalDate val) { instance.wireField001 = val; return this; }
        public Builder wireField002(Boolean val) { instance.wireField002 = val; return this; }
        public Builder wireField003(LocalDate val) { instance.wireField003 = val; return this; }
        public Builder wireField004(BigDecimal val) { instance.wireField004 = val; return this; }
        public Builder wireField005(Long val) { instance.wireField005 = val; return this; }
        public Builder wireField006(Boolean val) { instance.wireField006 = val; return this; }
        public Builder wireField007(Long val) { instance.wireField007 = val; return this; }
        public Builder wireField008(String val) { instance.wireField008 = val; return this; }
        public WireDto037 build() { return instance; }
    }

    public LocalDate getWireField000() { return wireField000; }
    public void setWireField000(LocalDate wireField000) { this.wireField000 = wireField000; }

    public LocalDate getWireField001() { return wireField001; }
    public void setWireField001(LocalDate wireField001) { this.wireField001 = wireField001; }

    public Boolean getWireField002() { return wireField002; }
    public void setWireField002(Boolean wireField002) { this.wireField002 = wireField002; }

    public LocalDate getWireField003() { return wireField003; }
    public void setWireField003(LocalDate wireField003) { this.wireField003 = wireField003; }

    public BigDecimal getWireField004() { return wireField004; }
    public void setWireField004(BigDecimal wireField004) { this.wireField004 = wireField004; }

    public Long getWireField005() { return wireField005; }
    public void setWireField005(Long wireField005) { this.wireField005 = wireField005; }

    public Boolean getWireField006() { return wireField006; }
    public void setWireField006(Boolean wireField006) { this.wireField006 = wireField006; }

    public Long getWireField007() { return wireField007; }
    public void setWireField007(Long wireField007) { this.wireField007 = wireField007; }

    public String getWireField008() { return wireField008; }
    public void setWireField008(String wireField008) { this.wireField008 = wireField008; }

    @Override
    public String toString() {
        return "WireDto037{" +
            "wireField000=" + wireField000 + ", " +
            "wireField001=" + wireField001 + ", " +
            "wireField002=" + wireField002 + ", " +
            "wireField003=" + wireField003 + ", " +
            "wireField004=" + wireField004 + ", " +
            "}";
    }
}
