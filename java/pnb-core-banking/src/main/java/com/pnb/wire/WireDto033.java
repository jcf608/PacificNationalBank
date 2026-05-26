package com.pnb.wire;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * WireDto033 — Data Transfer Object for wire operations.
 * Variant 33 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WireDto033 {

    @JsonProperty("wireField000")
    private Integer wireField000;

    @Size(max = 200)
    @JsonProperty("wireField001")
    private String wireField001;

    @JsonProperty("wireField002")
    private Double wireField002;

    @JsonProperty("wireField003")
    private LocalDate wireField003;

    @JsonProperty("wireField004")
    private Boolean wireField004;

    @JsonProperty("wireField005")
    private Long wireField005;

    @JsonProperty("wireField006")
    private Double wireField006;

    @JsonProperty("wireField007")
    private Double wireField007;

    @JsonProperty("wireField008")
    private Boolean wireField008;

    @JsonProperty("wireField009")
    private LocalDate wireField009;

    @JsonProperty("wireField010")
    private Integer wireField010;

    @JsonProperty("wireField011")
    private Integer wireField011;

    @JsonProperty("wireField012")
    private Long wireField012;

    @JsonProperty("wireField013")
    private Integer wireField013;

    @Size(max = 200)
    @JsonProperty("wireField014")
    private String wireField014;

    @JsonProperty("wireField015")
    private Integer wireField015;

    @DecimalMin(value = "0.00")
    @JsonProperty("wireField016")
    private BigDecimal wireField016;

    public WireDto033() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final WireDto033 instance = new WireDto033();

        public Builder wireField000(Integer val) { instance.wireField000 = val; return this; }
        public Builder wireField001(String val) { instance.wireField001 = val; return this; }
        public Builder wireField002(Double val) { instance.wireField002 = val; return this; }
        public Builder wireField003(LocalDate val) { instance.wireField003 = val; return this; }
        public Builder wireField004(Boolean val) { instance.wireField004 = val; return this; }
        public Builder wireField005(Long val) { instance.wireField005 = val; return this; }
        public Builder wireField006(Double val) { instance.wireField006 = val; return this; }
        public Builder wireField007(Double val) { instance.wireField007 = val; return this; }
        public Builder wireField008(Boolean val) { instance.wireField008 = val; return this; }
        public Builder wireField009(LocalDate val) { instance.wireField009 = val; return this; }
        public Builder wireField010(Integer val) { instance.wireField010 = val; return this; }
        public Builder wireField011(Integer val) { instance.wireField011 = val; return this; }
        public Builder wireField012(Long val) { instance.wireField012 = val; return this; }
        public Builder wireField013(Integer val) { instance.wireField013 = val; return this; }
        public Builder wireField014(String val) { instance.wireField014 = val; return this; }
        public Builder wireField015(Integer val) { instance.wireField015 = val; return this; }
        public Builder wireField016(BigDecimal val) { instance.wireField016 = val; return this; }
        public WireDto033 build() { return instance; }
    }

    public Integer getWireField000() { return wireField000; }
    public void setWireField000(Integer wireField000) { this.wireField000 = wireField000; }

    public String getWireField001() { return wireField001; }
    public void setWireField001(String wireField001) { this.wireField001 = wireField001; }

    public Double getWireField002() { return wireField002; }
    public void setWireField002(Double wireField002) { this.wireField002 = wireField002; }

    public LocalDate getWireField003() { return wireField003; }
    public void setWireField003(LocalDate wireField003) { this.wireField003 = wireField003; }

    public Boolean getWireField004() { return wireField004; }
    public void setWireField004(Boolean wireField004) { this.wireField004 = wireField004; }

    public Long getWireField005() { return wireField005; }
    public void setWireField005(Long wireField005) { this.wireField005 = wireField005; }

    public Double getWireField006() { return wireField006; }
    public void setWireField006(Double wireField006) { this.wireField006 = wireField006; }

    public Double getWireField007() { return wireField007; }
    public void setWireField007(Double wireField007) { this.wireField007 = wireField007; }

    public Boolean getWireField008() { return wireField008; }
    public void setWireField008(Boolean wireField008) { this.wireField008 = wireField008; }

    public LocalDate getWireField009() { return wireField009; }
    public void setWireField009(LocalDate wireField009) { this.wireField009 = wireField009; }

    public Integer getWireField010() { return wireField010; }
    public void setWireField010(Integer wireField010) { this.wireField010 = wireField010; }

    public Integer getWireField011() { return wireField011; }
    public void setWireField011(Integer wireField011) { this.wireField011 = wireField011; }

    public Long getWireField012() { return wireField012; }
    public void setWireField012(Long wireField012) { this.wireField012 = wireField012; }

    public Integer getWireField013() { return wireField013; }
    public void setWireField013(Integer wireField013) { this.wireField013 = wireField013; }

    public String getWireField014() { return wireField014; }
    public void setWireField014(String wireField014) { this.wireField014 = wireField014; }

    public Integer getWireField015() { return wireField015; }
    public void setWireField015(Integer wireField015) { this.wireField015 = wireField015; }

    public BigDecimal getWireField016() { return wireField016; }
    public void setWireField016(BigDecimal wireField016) { this.wireField016 = wireField016; }

    @Override
    public String toString() {
        return "WireDto033{" +
            "wireField000=" + wireField000 + ", " +
            "wireField001=" + wireField001 + ", " +
            "wireField002=" + wireField002 + ", " +
            "wireField003=" + wireField003 + ", " +
            "wireField004=" + wireField004 + ", " +
            "}";
    }
}
