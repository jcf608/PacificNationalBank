package com.pnb.wire;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * WireDto041 — Data Transfer Object for wire operations.
 * Variant 41 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WireDto041 {

    @JsonProperty("wireField000")
    private Boolean wireField000;

    @JsonProperty("wireField001")
    private Long wireField001;

    @JsonProperty("wireField002")
    private Integer wireField002;

    @DecimalMin(value = "0.00")
    @JsonProperty("wireField003")
    private BigDecimal wireField003;

    @JsonProperty("wireField004")
    private Long wireField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("wireField005")
    private BigDecimal wireField005;

    @JsonProperty("wireField006")
    private Double wireField006;

    @Size(max = 60)
    @JsonProperty("wireField007")
    private String wireField007;

    @DecimalMin(value = "0.00")
    @JsonProperty("wireField008")
    private BigDecimal wireField008;

    @JsonProperty("wireField009")
    private Double wireField009;

    @JsonProperty("wireField010")
    private LocalDate wireField010;

    @DecimalMin(value = "0.00")
    @JsonProperty("wireField011")
    private BigDecimal wireField011;

    @Size(max = 40)
    @JsonProperty("wireField012")
    private String wireField012;

    public WireDto041() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final WireDto041 instance = new WireDto041();

        public Builder wireField000(Boolean val) { instance.wireField000 = val; return this; }
        public Builder wireField001(Long val) { instance.wireField001 = val; return this; }
        public Builder wireField002(Integer val) { instance.wireField002 = val; return this; }
        public Builder wireField003(BigDecimal val) { instance.wireField003 = val; return this; }
        public Builder wireField004(Long val) { instance.wireField004 = val; return this; }
        public Builder wireField005(BigDecimal val) { instance.wireField005 = val; return this; }
        public Builder wireField006(Double val) { instance.wireField006 = val; return this; }
        public Builder wireField007(String val) { instance.wireField007 = val; return this; }
        public Builder wireField008(BigDecimal val) { instance.wireField008 = val; return this; }
        public Builder wireField009(Double val) { instance.wireField009 = val; return this; }
        public Builder wireField010(LocalDate val) { instance.wireField010 = val; return this; }
        public Builder wireField011(BigDecimal val) { instance.wireField011 = val; return this; }
        public Builder wireField012(String val) { instance.wireField012 = val; return this; }
        public WireDto041 build() { return instance; }
    }

    public Boolean getWireField000() { return wireField000; }
    public void setWireField000(Boolean wireField000) { this.wireField000 = wireField000; }

    public Long getWireField001() { return wireField001; }
    public void setWireField001(Long wireField001) { this.wireField001 = wireField001; }

    public Integer getWireField002() { return wireField002; }
    public void setWireField002(Integer wireField002) { this.wireField002 = wireField002; }

    public BigDecimal getWireField003() { return wireField003; }
    public void setWireField003(BigDecimal wireField003) { this.wireField003 = wireField003; }

    public Long getWireField004() { return wireField004; }
    public void setWireField004(Long wireField004) { this.wireField004 = wireField004; }

    public BigDecimal getWireField005() { return wireField005; }
    public void setWireField005(BigDecimal wireField005) { this.wireField005 = wireField005; }

    public Double getWireField006() { return wireField006; }
    public void setWireField006(Double wireField006) { this.wireField006 = wireField006; }

    public String getWireField007() { return wireField007; }
    public void setWireField007(String wireField007) { this.wireField007 = wireField007; }

    public BigDecimal getWireField008() { return wireField008; }
    public void setWireField008(BigDecimal wireField008) { this.wireField008 = wireField008; }

    public Double getWireField009() { return wireField009; }
    public void setWireField009(Double wireField009) { this.wireField009 = wireField009; }

    public LocalDate getWireField010() { return wireField010; }
    public void setWireField010(LocalDate wireField010) { this.wireField010 = wireField010; }

    public BigDecimal getWireField011() { return wireField011; }
    public void setWireField011(BigDecimal wireField011) { this.wireField011 = wireField011; }

    public String getWireField012() { return wireField012; }
    public void setWireField012(String wireField012) { this.wireField012 = wireField012; }

    @Override
    public String toString() {
        return "WireDto041{" +
            "wireField000=" + wireField000 + ", " +
            "wireField001=" + wireField001 + ", " +
            "wireField002=" + wireField002 + ", " +
            "wireField003=" + wireField003 + ", " +
            "wireField004=" + wireField004 + ", " +
            "}";
    }
}
