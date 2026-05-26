package com.pnb.wire;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * WireDto027 — Data Transfer Object for wire operations.
 * Variant 27 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WireDto027 {

    @JsonProperty("wireField000")
    private Double wireField000;

    @JsonProperty("wireField001")
    private Long wireField001;

    @Size(max = 200)
    @JsonProperty("wireField002")
    private String wireField002;

    @JsonProperty("wireField003")
    private Boolean wireField003;

    @JsonProperty("wireField004")
    private Integer wireField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("wireField005")
    private BigDecimal wireField005;

    @Size(max = 100)
    @JsonProperty("wireField006")
    private String wireField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("wireField007")
    private BigDecimal wireField007;

    @DecimalMin(value = "0.00")
    @JsonProperty("wireField008")
    private BigDecimal wireField008;

    @Size(max = 200)
    @JsonProperty("wireField009")
    private String wireField009;

    @Size(max = 20)
    @JsonProperty("wireField010")
    private String wireField010;

    public WireDto027() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final WireDto027 instance = new WireDto027();

        public Builder wireField000(Double val) { instance.wireField000 = val; return this; }
        public Builder wireField001(Long val) { instance.wireField001 = val; return this; }
        public Builder wireField002(String val) { instance.wireField002 = val; return this; }
        public Builder wireField003(Boolean val) { instance.wireField003 = val; return this; }
        public Builder wireField004(Integer val) { instance.wireField004 = val; return this; }
        public Builder wireField005(BigDecimal val) { instance.wireField005 = val; return this; }
        public Builder wireField006(String val) { instance.wireField006 = val; return this; }
        public Builder wireField007(BigDecimal val) { instance.wireField007 = val; return this; }
        public Builder wireField008(BigDecimal val) { instance.wireField008 = val; return this; }
        public Builder wireField009(String val) { instance.wireField009 = val; return this; }
        public Builder wireField010(String val) { instance.wireField010 = val; return this; }
        public WireDto027 build() { return instance; }
    }

    public Double getWireField000() { return wireField000; }
    public void setWireField000(Double wireField000) { this.wireField000 = wireField000; }

    public Long getWireField001() { return wireField001; }
    public void setWireField001(Long wireField001) { this.wireField001 = wireField001; }

    public String getWireField002() { return wireField002; }
    public void setWireField002(String wireField002) { this.wireField002 = wireField002; }

    public Boolean getWireField003() { return wireField003; }
    public void setWireField003(Boolean wireField003) { this.wireField003 = wireField003; }

    public Integer getWireField004() { return wireField004; }
    public void setWireField004(Integer wireField004) { this.wireField004 = wireField004; }

    public BigDecimal getWireField005() { return wireField005; }
    public void setWireField005(BigDecimal wireField005) { this.wireField005 = wireField005; }

    public String getWireField006() { return wireField006; }
    public void setWireField006(String wireField006) { this.wireField006 = wireField006; }

    public BigDecimal getWireField007() { return wireField007; }
    public void setWireField007(BigDecimal wireField007) { this.wireField007 = wireField007; }

    public BigDecimal getWireField008() { return wireField008; }
    public void setWireField008(BigDecimal wireField008) { this.wireField008 = wireField008; }

    public String getWireField009() { return wireField009; }
    public void setWireField009(String wireField009) { this.wireField009 = wireField009; }

    public String getWireField010() { return wireField010; }
    public void setWireField010(String wireField010) { this.wireField010 = wireField010; }

    @Override
    public String toString() {
        return "WireDto027{" +
            "wireField000=" + wireField000 + ", " +
            "wireField001=" + wireField001 + ", " +
            "wireField002=" + wireField002 + ", " +
            "wireField003=" + wireField003 + ", " +
            "wireField004=" + wireField004 + ", " +
            "}";
    }
}
