package com.pnb.wire;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * WireDto059 — Data Transfer Object for wire operations.
 * Variant 59 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WireDto059 {

    @JsonProperty("wireField000")
    private Double wireField000;

    @Size(max = 60)
    @JsonProperty("wireField001")
    private String wireField001;

    @JsonProperty("wireField002")
    private Boolean wireField002;

    @JsonProperty("wireField003")
    private Long wireField003;

    @DecimalMin(value = "0.00")
    @JsonProperty("wireField004")
    private BigDecimal wireField004;

    @JsonProperty("wireField005")
    private LocalDate wireField005;

    @JsonProperty("wireField006")
    private Long wireField006;

    @JsonProperty("wireField007")
    private LocalDate wireField007;

    @JsonProperty("wireField008")
    private Long wireField008;

    @DecimalMin(value = "0.00")
    @JsonProperty("wireField009")
    private BigDecimal wireField009;

    @JsonProperty("wireField010")
    private Boolean wireField010;

    @JsonProperty("wireField011")
    private Double wireField011;

    @DecimalMin(value = "0.00")
    @JsonProperty("wireField012")
    private BigDecimal wireField012;

    @JsonProperty("wireField013")
    private Integer wireField013;

    @JsonProperty("wireField014")
    private Double wireField014;

    @JsonProperty("wireField015")
    private LocalDate wireField015;

    @Size(max = 60)
    @JsonProperty("wireField016")
    private String wireField016;

    @JsonProperty("wireField017")
    private Double wireField017;

    @JsonProperty("wireField018")
    private Double wireField018;

    public WireDto059() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final WireDto059 instance = new WireDto059();

        public Builder wireField000(Double val) { instance.wireField000 = val; return this; }
        public Builder wireField001(String val) { instance.wireField001 = val; return this; }
        public Builder wireField002(Boolean val) { instance.wireField002 = val; return this; }
        public Builder wireField003(Long val) { instance.wireField003 = val; return this; }
        public Builder wireField004(BigDecimal val) { instance.wireField004 = val; return this; }
        public Builder wireField005(LocalDate val) { instance.wireField005 = val; return this; }
        public Builder wireField006(Long val) { instance.wireField006 = val; return this; }
        public Builder wireField007(LocalDate val) { instance.wireField007 = val; return this; }
        public Builder wireField008(Long val) { instance.wireField008 = val; return this; }
        public Builder wireField009(BigDecimal val) { instance.wireField009 = val; return this; }
        public Builder wireField010(Boolean val) { instance.wireField010 = val; return this; }
        public Builder wireField011(Double val) { instance.wireField011 = val; return this; }
        public Builder wireField012(BigDecimal val) { instance.wireField012 = val; return this; }
        public Builder wireField013(Integer val) { instance.wireField013 = val; return this; }
        public Builder wireField014(Double val) { instance.wireField014 = val; return this; }
        public Builder wireField015(LocalDate val) { instance.wireField015 = val; return this; }
        public Builder wireField016(String val) { instance.wireField016 = val; return this; }
        public Builder wireField017(Double val) { instance.wireField017 = val; return this; }
        public Builder wireField018(Double val) { instance.wireField018 = val; return this; }
        public WireDto059 build() { return instance; }
    }

    public Double getWireField000() { return wireField000; }
    public void setWireField000(Double wireField000) { this.wireField000 = wireField000; }

    public String getWireField001() { return wireField001; }
    public void setWireField001(String wireField001) { this.wireField001 = wireField001; }

    public Boolean getWireField002() { return wireField002; }
    public void setWireField002(Boolean wireField002) { this.wireField002 = wireField002; }

    public Long getWireField003() { return wireField003; }
    public void setWireField003(Long wireField003) { this.wireField003 = wireField003; }

    public BigDecimal getWireField004() { return wireField004; }
    public void setWireField004(BigDecimal wireField004) { this.wireField004 = wireField004; }

    public LocalDate getWireField005() { return wireField005; }
    public void setWireField005(LocalDate wireField005) { this.wireField005 = wireField005; }

    public Long getWireField006() { return wireField006; }
    public void setWireField006(Long wireField006) { this.wireField006 = wireField006; }

    public LocalDate getWireField007() { return wireField007; }
    public void setWireField007(LocalDate wireField007) { this.wireField007 = wireField007; }

    public Long getWireField008() { return wireField008; }
    public void setWireField008(Long wireField008) { this.wireField008 = wireField008; }

    public BigDecimal getWireField009() { return wireField009; }
    public void setWireField009(BigDecimal wireField009) { this.wireField009 = wireField009; }

    public Boolean getWireField010() { return wireField010; }
    public void setWireField010(Boolean wireField010) { this.wireField010 = wireField010; }

    public Double getWireField011() { return wireField011; }
    public void setWireField011(Double wireField011) { this.wireField011 = wireField011; }

    public BigDecimal getWireField012() { return wireField012; }
    public void setWireField012(BigDecimal wireField012) { this.wireField012 = wireField012; }

    public Integer getWireField013() { return wireField013; }
    public void setWireField013(Integer wireField013) { this.wireField013 = wireField013; }

    public Double getWireField014() { return wireField014; }
    public void setWireField014(Double wireField014) { this.wireField014 = wireField014; }

    public LocalDate getWireField015() { return wireField015; }
    public void setWireField015(LocalDate wireField015) { this.wireField015 = wireField015; }

    public String getWireField016() { return wireField016; }
    public void setWireField016(String wireField016) { this.wireField016 = wireField016; }

    public Double getWireField017() { return wireField017; }
    public void setWireField017(Double wireField017) { this.wireField017 = wireField017; }

    public Double getWireField018() { return wireField018; }
    public void setWireField018(Double wireField018) { this.wireField018 = wireField018; }

    @Override
    public String toString() {
        return "WireDto059{" +
            "wireField000=" + wireField000 + ", " +
            "wireField001=" + wireField001 + ", " +
            "wireField002=" + wireField002 + ", " +
            "wireField003=" + wireField003 + ", " +
            "wireField004=" + wireField004 + ", " +
            "}";
    }
}
