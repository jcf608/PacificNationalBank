package com.pnb.wire;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * WireDto039 — Data Transfer Object for wire operations.
 * Variant 39 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WireDto039 {

    @JsonProperty("wireField000")
    private Long wireField000;

    @JsonProperty("wireField001")
    private Integer wireField001;

    @JsonProperty("wireField002")
    private Long wireField002;

    @DecimalMin(value = "0.00")
    @JsonProperty("wireField003")
    private BigDecimal wireField003;

    @DecimalMin(value = "0.00")
    @JsonProperty("wireField004")
    private BigDecimal wireField004;

    @JsonProperty("wireField005")
    private Long wireField005;

    @JsonProperty("wireField006")
    private Double wireField006;

    @JsonProperty("wireField007")
    private Long wireField007;

    @JsonProperty("wireField008")
    private Integer wireField008;

    @Size(max = 60)
    @JsonProperty("wireField009")
    private String wireField009;

    @JsonProperty("wireField010")
    private Boolean wireField010;

    public WireDto039() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final WireDto039 instance = new WireDto039();

        public Builder wireField000(Long val) { instance.wireField000 = val; return this; }
        public Builder wireField001(Integer val) { instance.wireField001 = val; return this; }
        public Builder wireField002(Long val) { instance.wireField002 = val; return this; }
        public Builder wireField003(BigDecimal val) { instance.wireField003 = val; return this; }
        public Builder wireField004(BigDecimal val) { instance.wireField004 = val; return this; }
        public Builder wireField005(Long val) { instance.wireField005 = val; return this; }
        public Builder wireField006(Double val) { instance.wireField006 = val; return this; }
        public Builder wireField007(Long val) { instance.wireField007 = val; return this; }
        public Builder wireField008(Integer val) { instance.wireField008 = val; return this; }
        public Builder wireField009(String val) { instance.wireField009 = val; return this; }
        public Builder wireField010(Boolean val) { instance.wireField010 = val; return this; }
        public WireDto039 build() { return instance; }
    }

    public Long getWireField000() { return wireField000; }
    public void setWireField000(Long wireField000) { this.wireField000 = wireField000; }

    public Integer getWireField001() { return wireField001; }
    public void setWireField001(Integer wireField001) { this.wireField001 = wireField001; }

    public Long getWireField002() { return wireField002; }
    public void setWireField002(Long wireField002) { this.wireField002 = wireField002; }

    public BigDecimal getWireField003() { return wireField003; }
    public void setWireField003(BigDecimal wireField003) { this.wireField003 = wireField003; }

    public BigDecimal getWireField004() { return wireField004; }
    public void setWireField004(BigDecimal wireField004) { this.wireField004 = wireField004; }

    public Long getWireField005() { return wireField005; }
    public void setWireField005(Long wireField005) { this.wireField005 = wireField005; }

    public Double getWireField006() { return wireField006; }
    public void setWireField006(Double wireField006) { this.wireField006 = wireField006; }

    public Long getWireField007() { return wireField007; }
    public void setWireField007(Long wireField007) { this.wireField007 = wireField007; }

    public Integer getWireField008() { return wireField008; }
    public void setWireField008(Integer wireField008) { this.wireField008 = wireField008; }

    public String getWireField009() { return wireField009; }
    public void setWireField009(String wireField009) { this.wireField009 = wireField009; }

    public Boolean getWireField010() { return wireField010; }
    public void setWireField010(Boolean wireField010) { this.wireField010 = wireField010; }

    @Override
    public String toString() {
        return "WireDto039{" +
            "wireField000=" + wireField000 + ", " +
            "wireField001=" + wireField001 + ", " +
            "wireField002=" + wireField002 + ", " +
            "wireField003=" + wireField003 + ", " +
            "wireField004=" + wireField004 + ", " +
            "}";
    }
}
