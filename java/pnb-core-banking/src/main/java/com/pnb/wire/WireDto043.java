package com.pnb.wire;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * WireDto043 — Data Transfer Object for wire operations.
 * Variant 43 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WireDto043 {

    @DecimalMin(value = "0.00")
    @JsonProperty("wireField000")
    private BigDecimal wireField000;

    @JsonProperty("wireField001")
    private Long wireField001;

    @Size(max = 100)
    @JsonProperty("wireField002")
    private String wireField002;

    @JsonProperty("wireField003")
    private Long wireField003;

    @JsonProperty("wireField004")
    private Long wireField004;

    @Size(max = 40)
    @JsonProperty("wireField005")
    private String wireField005;

    @Size(max = 100)
    @JsonProperty("wireField006")
    private String wireField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("wireField007")
    private BigDecimal wireField007;

    @JsonProperty("wireField008")
    private Double wireField008;

    @DecimalMin(value = "0.00")
    @JsonProperty("wireField009")
    private BigDecimal wireField009;

    @JsonProperty("wireField010")
    private LocalDate wireField010;

    @JsonProperty("wireField011")
    private Double wireField011;

    @Size(max = 100)
    @JsonProperty("wireField012")
    private String wireField012;

    @DecimalMin(value = "0.00")
    @JsonProperty("wireField013")
    private BigDecimal wireField013;

    @JsonProperty("wireField014")
    private LocalDate wireField014;

    public WireDto043() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final WireDto043 instance = new WireDto043();

        public Builder wireField000(BigDecimal val) { instance.wireField000 = val; return this; }
        public Builder wireField001(Long val) { instance.wireField001 = val; return this; }
        public Builder wireField002(String val) { instance.wireField002 = val; return this; }
        public Builder wireField003(Long val) { instance.wireField003 = val; return this; }
        public Builder wireField004(Long val) { instance.wireField004 = val; return this; }
        public Builder wireField005(String val) { instance.wireField005 = val; return this; }
        public Builder wireField006(String val) { instance.wireField006 = val; return this; }
        public Builder wireField007(BigDecimal val) { instance.wireField007 = val; return this; }
        public Builder wireField008(Double val) { instance.wireField008 = val; return this; }
        public Builder wireField009(BigDecimal val) { instance.wireField009 = val; return this; }
        public Builder wireField010(LocalDate val) { instance.wireField010 = val; return this; }
        public Builder wireField011(Double val) { instance.wireField011 = val; return this; }
        public Builder wireField012(String val) { instance.wireField012 = val; return this; }
        public Builder wireField013(BigDecimal val) { instance.wireField013 = val; return this; }
        public Builder wireField014(LocalDate val) { instance.wireField014 = val; return this; }
        public WireDto043 build() { return instance; }
    }

    public BigDecimal getWireField000() { return wireField000; }
    public void setWireField000(BigDecimal wireField000) { this.wireField000 = wireField000; }

    public Long getWireField001() { return wireField001; }
    public void setWireField001(Long wireField001) { this.wireField001 = wireField001; }

    public String getWireField002() { return wireField002; }
    public void setWireField002(String wireField002) { this.wireField002 = wireField002; }

    public Long getWireField003() { return wireField003; }
    public void setWireField003(Long wireField003) { this.wireField003 = wireField003; }

    public Long getWireField004() { return wireField004; }
    public void setWireField004(Long wireField004) { this.wireField004 = wireField004; }

    public String getWireField005() { return wireField005; }
    public void setWireField005(String wireField005) { this.wireField005 = wireField005; }

    public String getWireField006() { return wireField006; }
    public void setWireField006(String wireField006) { this.wireField006 = wireField006; }

    public BigDecimal getWireField007() { return wireField007; }
    public void setWireField007(BigDecimal wireField007) { this.wireField007 = wireField007; }

    public Double getWireField008() { return wireField008; }
    public void setWireField008(Double wireField008) { this.wireField008 = wireField008; }

    public BigDecimal getWireField009() { return wireField009; }
    public void setWireField009(BigDecimal wireField009) { this.wireField009 = wireField009; }

    public LocalDate getWireField010() { return wireField010; }
    public void setWireField010(LocalDate wireField010) { this.wireField010 = wireField010; }

    public Double getWireField011() { return wireField011; }
    public void setWireField011(Double wireField011) { this.wireField011 = wireField011; }

    public String getWireField012() { return wireField012; }
    public void setWireField012(String wireField012) { this.wireField012 = wireField012; }

    public BigDecimal getWireField013() { return wireField013; }
    public void setWireField013(BigDecimal wireField013) { this.wireField013 = wireField013; }

    public LocalDate getWireField014() { return wireField014; }
    public void setWireField014(LocalDate wireField014) { this.wireField014 = wireField014; }

    @Override
    public String toString() {
        return "WireDto043{" +
            "wireField000=" + wireField000 + ", " +
            "wireField001=" + wireField001 + ", " +
            "wireField002=" + wireField002 + ", " +
            "wireField003=" + wireField003 + ", " +
            "wireField004=" + wireField004 + ", " +
            "}";
    }
}
