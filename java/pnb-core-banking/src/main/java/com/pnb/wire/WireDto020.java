package com.pnb.wire;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * WireDto020 — Data Transfer Object for wire operations.
 * Variant 20 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WireDto020 {

    @DecimalMin(value = "0.00")
    @JsonProperty("wireField000")
    private BigDecimal wireField000;

    @Size(max = 60)
    @JsonProperty("wireField001")
    private String wireField001;

    @Size(max = 200)
    @JsonProperty("wireField002")
    private String wireField002;

    @Size(max = 200)
    @JsonProperty("wireField003")
    private String wireField003;

    @DecimalMin(value = "0.00")
    @JsonProperty("wireField004")
    private BigDecimal wireField004;

    @JsonProperty("wireField005")
    private Long wireField005;

    @JsonProperty("wireField006")
    private Double wireField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("wireField007")
    private BigDecimal wireField007;

    @JsonProperty("wireField008")
    private Boolean wireField008;

    @JsonProperty("wireField009")
    private Integer wireField009;

    @JsonProperty("wireField010")
    private Boolean wireField010;

    @JsonProperty("wireField011")
    private Integer wireField011;

    @DecimalMin(value = "0.00")
    @JsonProperty("wireField012")
    private BigDecimal wireField012;

    @JsonProperty("wireField013")
    private Boolean wireField013;

    @DecimalMin(value = "0.00")
    @JsonProperty("wireField014")
    private BigDecimal wireField014;

    @JsonProperty("wireField015")
    private Boolean wireField015;

    public WireDto020() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final WireDto020 instance = new WireDto020();

        public Builder wireField000(BigDecimal val) { instance.wireField000 = val; return this; }
        public Builder wireField001(String val) { instance.wireField001 = val; return this; }
        public Builder wireField002(String val) { instance.wireField002 = val; return this; }
        public Builder wireField003(String val) { instance.wireField003 = val; return this; }
        public Builder wireField004(BigDecimal val) { instance.wireField004 = val; return this; }
        public Builder wireField005(Long val) { instance.wireField005 = val; return this; }
        public Builder wireField006(Double val) { instance.wireField006 = val; return this; }
        public Builder wireField007(BigDecimal val) { instance.wireField007 = val; return this; }
        public Builder wireField008(Boolean val) { instance.wireField008 = val; return this; }
        public Builder wireField009(Integer val) { instance.wireField009 = val; return this; }
        public Builder wireField010(Boolean val) { instance.wireField010 = val; return this; }
        public Builder wireField011(Integer val) { instance.wireField011 = val; return this; }
        public Builder wireField012(BigDecimal val) { instance.wireField012 = val; return this; }
        public Builder wireField013(Boolean val) { instance.wireField013 = val; return this; }
        public Builder wireField014(BigDecimal val) { instance.wireField014 = val; return this; }
        public Builder wireField015(Boolean val) { instance.wireField015 = val; return this; }
        public WireDto020 build() { return instance; }
    }

    public BigDecimal getWireField000() { return wireField000; }
    public void setWireField000(BigDecimal wireField000) { this.wireField000 = wireField000; }

    public String getWireField001() { return wireField001; }
    public void setWireField001(String wireField001) { this.wireField001 = wireField001; }

    public String getWireField002() { return wireField002; }
    public void setWireField002(String wireField002) { this.wireField002 = wireField002; }

    public String getWireField003() { return wireField003; }
    public void setWireField003(String wireField003) { this.wireField003 = wireField003; }

    public BigDecimal getWireField004() { return wireField004; }
    public void setWireField004(BigDecimal wireField004) { this.wireField004 = wireField004; }

    public Long getWireField005() { return wireField005; }
    public void setWireField005(Long wireField005) { this.wireField005 = wireField005; }

    public Double getWireField006() { return wireField006; }
    public void setWireField006(Double wireField006) { this.wireField006 = wireField006; }

    public BigDecimal getWireField007() { return wireField007; }
    public void setWireField007(BigDecimal wireField007) { this.wireField007 = wireField007; }

    public Boolean getWireField008() { return wireField008; }
    public void setWireField008(Boolean wireField008) { this.wireField008 = wireField008; }

    public Integer getWireField009() { return wireField009; }
    public void setWireField009(Integer wireField009) { this.wireField009 = wireField009; }

    public Boolean getWireField010() { return wireField010; }
    public void setWireField010(Boolean wireField010) { this.wireField010 = wireField010; }

    public Integer getWireField011() { return wireField011; }
    public void setWireField011(Integer wireField011) { this.wireField011 = wireField011; }

    public BigDecimal getWireField012() { return wireField012; }
    public void setWireField012(BigDecimal wireField012) { this.wireField012 = wireField012; }

    public Boolean getWireField013() { return wireField013; }
    public void setWireField013(Boolean wireField013) { this.wireField013 = wireField013; }

    public BigDecimal getWireField014() { return wireField014; }
    public void setWireField014(BigDecimal wireField014) { this.wireField014 = wireField014; }

    public Boolean getWireField015() { return wireField015; }
    public void setWireField015(Boolean wireField015) { this.wireField015 = wireField015; }

    @Override
    public String toString() {
        return "WireDto020{" +
            "wireField000=" + wireField000 + ", " +
            "wireField001=" + wireField001 + ", " +
            "wireField002=" + wireField002 + ", " +
            "wireField003=" + wireField003 + ", " +
            "wireField004=" + wireField004 + ", " +
            "}";
    }
}
