package com.pnb.wire;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * WireDto056 — Data Transfer Object for wire operations.
 * Variant 56 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WireDto056 {

    @JsonProperty("wireField000")
    private Long wireField000;

    @JsonProperty("wireField001")
    private LocalDate wireField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("wireField002")
    private BigDecimal wireField002;

    @JsonProperty("wireField003")
    private Long wireField003;

    @DecimalMin(value = "0.00")
    @JsonProperty("wireField004")
    private BigDecimal wireField004;

    @JsonProperty("wireField005")
    private Integer wireField005;

    @JsonProperty("wireField006")
    private Boolean wireField006;

    @JsonProperty("wireField007")
    private Long wireField007;

    @JsonProperty("wireField008")
    private Double wireField008;

    @DecimalMin(value = "0.00")
    @JsonProperty("wireField009")
    private BigDecimal wireField009;

    @JsonProperty("wireField010")
    private Boolean wireField010;

    @JsonProperty("wireField011")
    private Integer wireField011;

    @JsonProperty("wireField012")
    private Long wireField012;

    @JsonProperty("wireField013")
    private Boolean wireField013;

    @JsonProperty("wireField014")
    private Double wireField014;

    @JsonProperty("wireField015")
    private Boolean wireField015;

    public WireDto056() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final WireDto056 instance = new WireDto056();

        public Builder wireField000(Long val) { instance.wireField000 = val; return this; }
        public Builder wireField001(LocalDate val) { instance.wireField001 = val; return this; }
        public Builder wireField002(BigDecimal val) { instance.wireField002 = val; return this; }
        public Builder wireField003(Long val) { instance.wireField003 = val; return this; }
        public Builder wireField004(BigDecimal val) { instance.wireField004 = val; return this; }
        public Builder wireField005(Integer val) { instance.wireField005 = val; return this; }
        public Builder wireField006(Boolean val) { instance.wireField006 = val; return this; }
        public Builder wireField007(Long val) { instance.wireField007 = val; return this; }
        public Builder wireField008(Double val) { instance.wireField008 = val; return this; }
        public Builder wireField009(BigDecimal val) { instance.wireField009 = val; return this; }
        public Builder wireField010(Boolean val) { instance.wireField010 = val; return this; }
        public Builder wireField011(Integer val) { instance.wireField011 = val; return this; }
        public Builder wireField012(Long val) { instance.wireField012 = val; return this; }
        public Builder wireField013(Boolean val) { instance.wireField013 = val; return this; }
        public Builder wireField014(Double val) { instance.wireField014 = val; return this; }
        public Builder wireField015(Boolean val) { instance.wireField015 = val; return this; }
        public WireDto056 build() { return instance; }
    }

    public Long getWireField000() { return wireField000; }
    public void setWireField000(Long wireField000) { this.wireField000 = wireField000; }

    public LocalDate getWireField001() { return wireField001; }
    public void setWireField001(LocalDate wireField001) { this.wireField001 = wireField001; }

    public BigDecimal getWireField002() { return wireField002; }
    public void setWireField002(BigDecimal wireField002) { this.wireField002 = wireField002; }

    public Long getWireField003() { return wireField003; }
    public void setWireField003(Long wireField003) { this.wireField003 = wireField003; }

    public BigDecimal getWireField004() { return wireField004; }
    public void setWireField004(BigDecimal wireField004) { this.wireField004 = wireField004; }

    public Integer getWireField005() { return wireField005; }
    public void setWireField005(Integer wireField005) { this.wireField005 = wireField005; }

    public Boolean getWireField006() { return wireField006; }
    public void setWireField006(Boolean wireField006) { this.wireField006 = wireField006; }

    public Long getWireField007() { return wireField007; }
    public void setWireField007(Long wireField007) { this.wireField007 = wireField007; }

    public Double getWireField008() { return wireField008; }
    public void setWireField008(Double wireField008) { this.wireField008 = wireField008; }

    public BigDecimal getWireField009() { return wireField009; }
    public void setWireField009(BigDecimal wireField009) { this.wireField009 = wireField009; }

    public Boolean getWireField010() { return wireField010; }
    public void setWireField010(Boolean wireField010) { this.wireField010 = wireField010; }

    public Integer getWireField011() { return wireField011; }
    public void setWireField011(Integer wireField011) { this.wireField011 = wireField011; }

    public Long getWireField012() { return wireField012; }
    public void setWireField012(Long wireField012) { this.wireField012 = wireField012; }

    public Boolean getWireField013() { return wireField013; }
    public void setWireField013(Boolean wireField013) { this.wireField013 = wireField013; }

    public Double getWireField014() { return wireField014; }
    public void setWireField014(Double wireField014) { this.wireField014 = wireField014; }

    public Boolean getWireField015() { return wireField015; }
    public void setWireField015(Boolean wireField015) { this.wireField015 = wireField015; }

    @Override
    public String toString() {
        return "WireDto056{" +
            "wireField000=" + wireField000 + ", " +
            "wireField001=" + wireField001 + ", " +
            "wireField002=" + wireField002 + ", " +
            "wireField003=" + wireField003 + ", " +
            "wireField004=" + wireField004 + ", " +
            "}";
    }
}
