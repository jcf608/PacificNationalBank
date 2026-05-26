package com.pnb.wire;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * WireDto026 — Data Transfer Object for wire operations.
 * Variant 26 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WireDto026 {

    @DecimalMin(value = "0.00")
    @JsonProperty("wireField000")
    private BigDecimal wireField000;

    @JsonProperty("wireField001")
    private Integer wireField001;

    @JsonProperty("wireField002")
    private Integer wireField002;

    @JsonProperty("wireField003")
    private Long wireField003;

    @JsonProperty("wireField004")
    private Long wireField004;

    @JsonProperty("wireField005")
    private LocalDate wireField005;

    @JsonProperty("wireField006")
    private LocalDate wireField006;

    @Size(max = 40)
    @JsonProperty("wireField007")
    private String wireField007;

    @DecimalMin(value = "0.00")
    @JsonProperty("wireField008")
    private BigDecimal wireField008;

    @JsonProperty("wireField009")
    private Long wireField009;

    public WireDto026() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final WireDto026 instance = new WireDto026();

        public Builder wireField000(BigDecimal val) { instance.wireField000 = val; return this; }
        public Builder wireField001(Integer val) { instance.wireField001 = val; return this; }
        public Builder wireField002(Integer val) { instance.wireField002 = val; return this; }
        public Builder wireField003(Long val) { instance.wireField003 = val; return this; }
        public Builder wireField004(Long val) { instance.wireField004 = val; return this; }
        public Builder wireField005(LocalDate val) { instance.wireField005 = val; return this; }
        public Builder wireField006(LocalDate val) { instance.wireField006 = val; return this; }
        public Builder wireField007(String val) { instance.wireField007 = val; return this; }
        public Builder wireField008(BigDecimal val) { instance.wireField008 = val; return this; }
        public Builder wireField009(Long val) { instance.wireField009 = val; return this; }
        public WireDto026 build() { return instance; }
    }

    public BigDecimal getWireField000() { return wireField000; }
    public void setWireField000(BigDecimal wireField000) { this.wireField000 = wireField000; }

    public Integer getWireField001() { return wireField001; }
    public void setWireField001(Integer wireField001) { this.wireField001 = wireField001; }

    public Integer getWireField002() { return wireField002; }
    public void setWireField002(Integer wireField002) { this.wireField002 = wireField002; }

    public Long getWireField003() { return wireField003; }
    public void setWireField003(Long wireField003) { this.wireField003 = wireField003; }

    public Long getWireField004() { return wireField004; }
    public void setWireField004(Long wireField004) { this.wireField004 = wireField004; }

    public LocalDate getWireField005() { return wireField005; }
    public void setWireField005(LocalDate wireField005) { this.wireField005 = wireField005; }

    public LocalDate getWireField006() { return wireField006; }
    public void setWireField006(LocalDate wireField006) { this.wireField006 = wireField006; }

    public String getWireField007() { return wireField007; }
    public void setWireField007(String wireField007) { this.wireField007 = wireField007; }

    public BigDecimal getWireField008() { return wireField008; }
    public void setWireField008(BigDecimal wireField008) { this.wireField008 = wireField008; }

    public Long getWireField009() { return wireField009; }
    public void setWireField009(Long wireField009) { this.wireField009 = wireField009; }

    @Override
    public String toString() {
        return "WireDto026{" +
            "wireField000=" + wireField000 + ", " +
            "wireField001=" + wireField001 + ", " +
            "wireField002=" + wireField002 + ", " +
            "wireField003=" + wireField003 + ", " +
            "wireField004=" + wireField004 + ", " +
            "}";
    }
}
