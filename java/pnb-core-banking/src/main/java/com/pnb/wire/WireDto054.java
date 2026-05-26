package com.pnb.wire;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * WireDto054 — Data Transfer Object for wire operations.
 * Variant 54 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WireDto054 {

    @JsonProperty("wireField000")
    private Integer wireField000;

    @JsonProperty("wireField001")
    private Long wireField001;

    @JsonProperty("wireField002")
    private Integer wireField002;

    @Size(max = 60)
    @JsonProperty("wireField003")
    private String wireField003;

    @DecimalMin(value = "0.00")
    @JsonProperty("wireField004")
    private BigDecimal wireField004;

    @JsonProperty("wireField005")
    private Integer wireField005;

    @JsonProperty("wireField006")
    private Boolean wireField006;

    @JsonProperty("wireField007")
    private Integer wireField007;

    @JsonProperty("wireField008")
    private Long wireField008;

    @JsonProperty("wireField009")
    private Boolean wireField009;

    @JsonProperty("wireField010")
    private Double wireField010;

    @JsonProperty("wireField011")
    private Long wireField011;

    @JsonProperty("wireField012")
    private Integer wireField012;

    @JsonProperty("wireField013")
    private Long wireField013;

    public WireDto054() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final WireDto054 instance = new WireDto054();

        public Builder wireField000(Integer val) { instance.wireField000 = val; return this; }
        public Builder wireField001(Long val) { instance.wireField001 = val; return this; }
        public Builder wireField002(Integer val) { instance.wireField002 = val; return this; }
        public Builder wireField003(String val) { instance.wireField003 = val; return this; }
        public Builder wireField004(BigDecimal val) { instance.wireField004 = val; return this; }
        public Builder wireField005(Integer val) { instance.wireField005 = val; return this; }
        public Builder wireField006(Boolean val) { instance.wireField006 = val; return this; }
        public Builder wireField007(Integer val) { instance.wireField007 = val; return this; }
        public Builder wireField008(Long val) { instance.wireField008 = val; return this; }
        public Builder wireField009(Boolean val) { instance.wireField009 = val; return this; }
        public Builder wireField010(Double val) { instance.wireField010 = val; return this; }
        public Builder wireField011(Long val) { instance.wireField011 = val; return this; }
        public Builder wireField012(Integer val) { instance.wireField012 = val; return this; }
        public Builder wireField013(Long val) { instance.wireField013 = val; return this; }
        public WireDto054 build() { return instance; }
    }

    public Integer getWireField000() { return wireField000; }
    public void setWireField000(Integer wireField000) { this.wireField000 = wireField000; }

    public Long getWireField001() { return wireField001; }
    public void setWireField001(Long wireField001) { this.wireField001 = wireField001; }

    public Integer getWireField002() { return wireField002; }
    public void setWireField002(Integer wireField002) { this.wireField002 = wireField002; }

    public String getWireField003() { return wireField003; }
    public void setWireField003(String wireField003) { this.wireField003 = wireField003; }

    public BigDecimal getWireField004() { return wireField004; }
    public void setWireField004(BigDecimal wireField004) { this.wireField004 = wireField004; }

    public Integer getWireField005() { return wireField005; }
    public void setWireField005(Integer wireField005) { this.wireField005 = wireField005; }

    public Boolean getWireField006() { return wireField006; }
    public void setWireField006(Boolean wireField006) { this.wireField006 = wireField006; }

    public Integer getWireField007() { return wireField007; }
    public void setWireField007(Integer wireField007) { this.wireField007 = wireField007; }

    public Long getWireField008() { return wireField008; }
    public void setWireField008(Long wireField008) { this.wireField008 = wireField008; }

    public Boolean getWireField009() { return wireField009; }
    public void setWireField009(Boolean wireField009) { this.wireField009 = wireField009; }

    public Double getWireField010() { return wireField010; }
    public void setWireField010(Double wireField010) { this.wireField010 = wireField010; }

    public Long getWireField011() { return wireField011; }
    public void setWireField011(Long wireField011) { this.wireField011 = wireField011; }

    public Integer getWireField012() { return wireField012; }
    public void setWireField012(Integer wireField012) { this.wireField012 = wireField012; }

    public Long getWireField013() { return wireField013; }
    public void setWireField013(Long wireField013) { this.wireField013 = wireField013; }

    @Override
    public String toString() {
        return "WireDto054{" +
            "wireField000=" + wireField000 + ", " +
            "wireField001=" + wireField001 + ", " +
            "wireField002=" + wireField002 + ", " +
            "wireField003=" + wireField003 + ", " +
            "wireField004=" + wireField004 + ", " +
            "}";
    }
}
