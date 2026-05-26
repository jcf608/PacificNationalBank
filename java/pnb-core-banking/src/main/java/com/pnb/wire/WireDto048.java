package com.pnb.wire;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * WireDto048 — Data Transfer Object for wire operations.
 * Variant 48 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WireDto048 {

    @JsonProperty("wireField000")
    private LocalDate wireField000;

    @JsonProperty("wireField001")
    private Integer wireField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("wireField002")
    private BigDecimal wireField002;

    @JsonProperty("wireField003")
    private LocalDate wireField003;

    @JsonProperty("wireField004")
    private LocalDate wireField004;

    @JsonProperty("wireField005")
    private LocalDate wireField005;

    @JsonProperty("wireField006")
    private Double wireField006;

    @JsonProperty("wireField007")
    private Long wireField007;

    public WireDto048() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final WireDto048 instance = new WireDto048();

        public Builder wireField000(LocalDate val) { instance.wireField000 = val; return this; }
        public Builder wireField001(Integer val) { instance.wireField001 = val; return this; }
        public Builder wireField002(BigDecimal val) { instance.wireField002 = val; return this; }
        public Builder wireField003(LocalDate val) { instance.wireField003 = val; return this; }
        public Builder wireField004(LocalDate val) { instance.wireField004 = val; return this; }
        public Builder wireField005(LocalDate val) { instance.wireField005 = val; return this; }
        public Builder wireField006(Double val) { instance.wireField006 = val; return this; }
        public Builder wireField007(Long val) { instance.wireField007 = val; return this; }
        public WireDto048 build() { return instance; }
    }

    public LocalDate getWireField000() { return wireField000; }
    public void setWireField000(LocalDate wireField000) { this.wireField000 = wireField000; }

    public Integer getWireField001() { return wireField001; }
    public void setWireField001(Integer wireField001) { this.wireField001 = wireField001; }

    public BigDecimal getWireField002() { return wireField002; }
    public void setWireField002(BigDecimal wireField002) { this.wireField002 = wireField002; }

    public LocalDate getWireField003() { return wireField003; }
    public void setWireField003(LocalDate wireField003) { this.wireField003 = wireField003; }

    public LocalDate getWireField004() { return wireField004; }
    public void setWireField004(LocalDate wireField004) { this.wireField004 = wireField004; }

    public LocalDate getWireField005() { return wireField005; }
    public void setWireField005(LocalDate wireField005) { this.wireField005 = wireField005; }

    public Double getWireField006() { return wireField006; }
    public void setWireField006(Double wireField006) { this.wireField006 = wireField006; }

    public Long getWireField007() { return wireField007; }
    public void setWireField007(Long wireField007) { this.wireField007 = wireField007; }

    @Override
    public String toString() {
        return "WireDto048{" +
            "wireField000=" + wireField000 + ", " +
            "wireField001=" + wireField001 + ", " +
            "wireField002=" + wireField002 + ", " +
            "wireField003=" + wireField003 + ", " +
            "wireField004=" + wireField004 + ", " +
            "}";
    }
}
