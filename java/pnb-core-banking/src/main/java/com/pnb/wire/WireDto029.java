package com.pnb.wire;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * WireDto029 — Data Transfer Object for wire operations.
 * Variant 29 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WireDto029 {

    @JsonProperty("wireField000")
    private Integer wireField000;

    @JsonProperty("wireField001")
    private Double wireField001;

    @JsonProperty("wireField002")
    private Long wireField002;

    @DecimalMin(value = "0.00")
    @JsonProperty("wireField003")
    private BigDecimal wireField003;

    @JsonProperty("wireField004")
    private Double wireField004;

    @JsonProperty("wireField005")
    private Integer wireField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("wireField006")
    private BigDecimal wireField006;

    @JsonProperty("wireField007")
    private Integer wireField007;

    @DecimalMin(value = "0.00")
    @JsonProperty("wireField008")
    private BigDecimal wireField008;

    @DecimalMin(value = "0.00")
    @JsonProperty("wireField009")
    private BigDecimal wireField009;

    @JsonProperty("wireField010")
    private Integer wireField010;

    @DecimalMin(value = "0.00")
    @JsonProperty("wireField011")
    private BigDecimal wireField011;

    @JsonProperty("wireField012")
    private Boolean wireField012;

    public WireDto029() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final WireDto029 instance = new WireDto029();

        public Builder wireField000(Integer val) { instance.wireField000 = val; return this; }
        public Builder wireField001(Double val) { instance.wireField001 = val; return this; }
        public Builder wireField002(Long val) { instance.wireField002 = val; return this; }
        public Builder wireField003(BigDecimal val) { instance.wireField003 = val; return this; }
        public Builder wireField004(Double val) { instance.wireField004 = val; return this; }
        public Builder wireField005(Integer val) { instance.wireField005 = val; return this; }
        public Builder wireField006(BigDecimal val) { instance.wireField006 = val; return this; }
        public Builder wireField007(Integer val) { instance.wireField007 = val; return this; }
        public Builder wireField008(BigDecimal val) { instance.wireField008 = val; return this; }
        public Builder wireField009(BigDecimal val) { instance.wireField009 = val; return this; }
        public Builder wireField010(Integer val) { instance.wireField010 = val; return this; }
        public Builder wireField011(BigDecimal val) { instance.wireField011 = val; return this; }
        public Builder wireField012(Boolean val) { instance.wireField012 = val; return this; }
        public WireDto029 build() { return instance; }
    }

    public Integer getWireField000() { return wireField000; }
    public void setWireField000(Integer wireField000) { this.wireField000 = wireField000; }

    public Double getWireField001() { return wireField001; }
    public void setWireField001(Double wireField001) { this.wireField001 = wireField001; }

    public Long getWireField002() { return wireField002; }
    public void setWireField002(Long wireField002) { this.wireField002 = wireField002; }

    public BigDecimal getWireField003() { return wireField003; }
    public void setWireField003(BigDecimal wireField003) { this.wireField003 = wireField003; }

    public Double getWireField004() { return wireField004; }
    public void setWireField004(Double wireField004) { this.wireField004 = wireField004; }

    public Integer getWireField005() { return wireField005; }
    public void setWireField005(Integer wireField005) { this.wireField005 = wireField005; }

    public BigDecimal getWireField006() { return wireField006; }
    public void setWireField006(BigDecimal wireField006) { this.wireField006 = wireField006; }

    public Integer getWireField007() { return wireField007; }
    public void setWireField007(Integer wireField007) { this.wireField007 = wireField007; }

    public BigDecimal getWireField008() { return wireField008; }
    public void setWireField008(BigDecimal wireField008) { this.wireField008 = wireField008; }

    public BigDecimal getWireField009() { return wireField009; }
    public void setWireField009(BigDecimal wireField009) { this.wireField009 = wireField009; }

    public Integer getWireField010() { return wireField010; }
    public void setWireField010(Integer wireField010) { this.wireField010 = wireField010; }

    public BigDecimal getWireField011() { return wireField011; }
    public void setWireField011(BigDecimal wireField011) { this.wireField011 = wireField011; }

    public Boolean getWireField012() { return wireField012; }
    public void setWireField012(Boolean wireField012) { this.wireField012 = wireField012; }

    @Override
    public String toString() {
        return "WireDto029{" +
            "wireField000=" + wireField000 + ", " +
            "wireField001=" + wireField001 + ", " +
            "wireField002=" + wireField002 + ", " +
            "wireField003=" + wireField003 + ", " +
            "wireField004=" + wireField004 + ", " +
            "}";
    }
}
