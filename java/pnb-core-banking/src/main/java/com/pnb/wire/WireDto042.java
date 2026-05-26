package com.pnb.wire;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * WireDto042 — Data Transfer Object for wire operations.
 * Variant 42 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WireDto042 {

    @JsonProperty("wireField000")
    private Double wireField000;

    @DecimalMin(value = "0.00")
    @JsonProperty("wireField001")
    private BigDecimal wireField001;

    @Size(max = 100)
    @JsonProperty("wireField002")
    private String wireField002;

    @JsonProperty("wireField003")
    private Long wireField003;

    @JsonProperty("wireField004")
    private Integer wireField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("wireField005")
    private BigDecimal wireField005;

    @JsonProperty("wireField006")
    private Double wireField006;

    @JsonProperty("wireField007")
    private Integer wireField007;

    @JsonProperty("wireField008")
    private LocalDate wireField008;

    @JsonProperty("wireField009")
    private Boolean wireField009;

    @JsonProperty("wireField010")
    private LocalDate wireField010;

    @JsonProperty("wireField011")
    private Double wireField011;

    @JsonProperty("wireField012")
    private Double wireField012;

    @JsonProperty("wireField013")
    private Double wireField013;

    public WireDto042() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final WireDto042 instance = new WireDto042();

        public Builder wireField000(Double val) { instance.wireField000 = val; return this; }
        public Builder wireField001(BigDecimal val) { instance.wireField001 = val; return this; }
        public Builder wireField002(String val) { instance.wireField002 = val; return this; }
        public Builder wireField003(Long val) { instance.wireField003 = val; return this; }
        public Builder wireField004(Integer val) { instance.wireField004 = val; return this; }
        public Builder wireField005(BigDecimal val) { instance.wireField005 = val; return this; }
        public Builder wireField006(Double val) { instance.wireField006 = val; return this; }
        public Builder wireField007(Integer val) { instance.wireField007 = val; return this; }
        public Builder wireField008(LocalDate val) { instance.wireField008 = val; return this; }
        public Builder wireField009(Boolean val) { instance.wireField009 = val; return this; }
        public Builder wireField010(LocalDate val) { instance.wireField010 = val; return this; }
        public Builder wireField011(Double val) { instance.wireField011 = val; return this; }
        public Builder wireField012(Double val) { instance.wireField012 = val; return this; }
        public Builder wireField013(Double val) { instance.wireField013 = val; return this; }
        public WireDto042 build() { return instance; }
    }

    public Double getWireField000() { return wireField000; }
    public void setWireField000(Double wireField000) { this.wireField000 = wireField000; }

    public BigDecimal getWireField001() { return wireField001; }
    public void setWireField001(BigDecimal wireField001) { this.wireField001 = wireField001; }

    public String getWireField002() { return wireField002; }
    public void setWireField002(String wireField002) { this.wireField002 = wireField002; }

    public Long getWireField003() { return wireField003; }
    public void setWireField003(Long wireField003) { this.wireField003 = wireField003; }

    public Integer getWireField004() { return wireField004; }
    public void setWireField004(Integer wireField004) { this.wireField004 = wireField004; }

    public BigDecimal getWireField005() { return wireField005; }
    public void setWireField005(BigDecimal wireField005) { this.wireField005 = wireField005; }

    public Double getWireField006() { return wireField006; }
    public void setWireField006(Double wireField006) { this.wireField006 = wireField006; }

    public Integer getWireField007() { return wireField007; }
    public void setWireField007(Integer wireField007) { this.wireField007 = wireField007; }

    public LocalDate getWireField008() { return wireField008; }
    public void setWireField008(LocalDate wireField008) { this.wireField008 = wireField008; }

    public Boolean getWireField009() { return wireField009; }
    public void setWireField009(Boolean wireField009) { this.wireField009 = wireField009; }

    public LocalDate getWireField010() { return wireField010; }
    public void setWireField010(LocalDate wireField010) { this.wireField010 = wireField010; }

    public Double getWireField011() { return wireField011; }
    public void setWireField011(Double wireField011) { this.wireField011 = wireField011; }

    public Double getWireField012() { return wireField012; }
    public void setWireField012(Double wireField012) { this.wireField012 = wireField012; }

    public Double getWireField013() { return wireField013; }
    public void setWireField013(Double wireField013) { this.wireField013 = wireField013; }

    @Override
    public String toString() {
        return "WireDto042{" +
            "wireField000=" + wireField000 + ", " +
            "wireField001=" + wireField001 + ", " +
            "wireField002=" + wireField002 + ", " +
            "wireField003=" + wireField003 + ", " +
            "wireField004=" + wireField004 + ", " +
            "}";
    }
}
