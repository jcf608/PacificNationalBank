package com.pnb.wire;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * WireDto045 — Data Transfer Object for wire operations.
 * Variant 45 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WireDto045 {

    @JsonProperty("wireField000")
    private Long wireField000;

    @JsonProperty("wireField001")
    private Boolean wireField001;

    @Size(max = 200)
    @JsonProperty("wireField002")
    private String wireField002;

    @Size(max = 40)
    @JsonProperty("wireField003")
    private String wireField003;

    @JsonProperty("wireField004")
    private LocalDate wireField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("wireField005")
    private BigDecimal wireField005;

    @JsonProperty("wireField006")
    private Double wireField006;

    @JsonProperty("wireField007")
    private LocalDate wireField007;

    @DecimalMin(value = "0.00")
    @JsonProperty("wireField008")
    private BigDecimal wireField008;

    @JsonProperty("wireField009")
    private LocalDate wireField009;

    @Size(max = 60)
    @JsonProperty("wireField010")
    private String wireField010;

    @DecimalMin(value = "0.00")
    @JsonProperty("wireField011")
    private BigDecimal wireField011;

    @Size(max = 100)
    @JsonProperty("wireField012")
    private String wireField012;

    @JsonProperty("wireField013")
    private Integer wireField013;

    @JsonProperty("wireField014")
    private Double wireField014;

    @JsonProperty("wireField015")
    private Integer wireField015;

    @JsonProperty("wireField016")
    private Long wireField016;

    public WireDto045() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final WireDto045 instance = new WireDto045();

        public Builder wireField000(Long val) { instance.wireField000 = val; return this; }
        public Builder wireField001(Boolean val) { instance.wireField001 = val; return this; }
        public Builder wireField002(String val) { instance.wireField002 = val; return this; }
        public Builder wireField003(String val) { instance.wireField003 = val; return this; }
        public Builder wireField004(LocalDate val) { instance.wireField004 = val; return this; }
        public Builder wireField005(BigDecimal val) { instance.wireField005 = val; return this; }
        public Builder wireField006(Double val) { instance.wireField006 = val; return this; }
        public Builder wireField007(LocalDate val) { instance.wireField007 = val; return this; }
        public Builder wireField008(BigDecimal val) { instance.wireField008 = val; return this; }
        public Builder wireField009(LocalDate val) { instance.wireField009 = val; return this; }
        public Builder wireField010(String val) { instance.wireField010 = val; return this; }
        public Builder wireField011(BigDecimal val) { instance.wireField011 = val; return this; }
        public Builder wireField012(String val) { instance.wireField012 = val; return this; }
        public Builder wireField013(Integer val) { instance.wireField013 = val; return this; }
        public Builder wireField014(Double val) { instance.wireField014 = val; return this; }
        public Builder wireField015(Integer val) { instance.wireField015 = val; return this; }
        public Builder wireField016(Long val) { instance.wireField016 = val; return this; }
        public WireDto045 build() { return instance; }
    }

    public Long getWireField000() { return wireField000; }
    public void setWireField000(Long wireField000) { this.wireField000 = wireField000; }

    public Boolean getWireField001() { return wireField001; }
    public void setWireField001(Boolean wireField001) { this.wireField001 = wireField001; }

    public String getWireField002() { return wireField002; }
    public void setWireField002(String wireField002) { this.wireField002 = wireField002; }

    public String getWireField003() { return wireField003; }
    public void setWireField003(String wireField003) { this.wireField003 = wireField003; }

    public LocalDate getWireField004() { return wireField004; }
    public void setWireField004(LocalDate wireField004) { this.wireField004 = wireField004; }

    public BigDecimal getWireField005() { return wireField005; }
    public void setWireField005(BigDecimal wireField005) { this.wireField005 = wireField005; }

    public Double getWireField006() { return wireField006; }
    public void setWireField006(Double wireField006) { this.wireField006 = wireField006; }

    public LocalDate getWireField007() { return wireField007; }
    public void setWireField007(LocalDate wireField007) { this.wireField007 = wireField007; }

    public BigDecimal getWireField008() { return wireField008; }
    public void setWireField008(BigDecimal wireField008) { this.wireField008 = wireField008; }

    public LocalDate getWireField009() { return wireField009; }
    public void setWireField009(LocalDate wireField009) { this.wireField009 = wireField009; }

    public String getWireField010() { return wireField010; }
    public void setWireField010(String wireField010) { this.wireField010 = wireField010; }

    public BigDecimal getWireField011() { return wireField011; }
    public void setWireField011(BigDecimal wireField011) { this.wireField011 = wireField011; }

    public String getWireField012() { return wireField012; }
    public void setWireField012(String wireField012) { this.wireField012 = wireField012; }

    public Integer getWireField013() { return wireField013; }
    public void setWireField013(Integer wireField013) { this.wireField013 = wireField013; }

    public Double getWireField014() { return wireField014; }
    public void setWireField014(Double wireField014) { this.wireField014 = wireField014; }

    public Integer getWireField015() { return wireField015; }
    public void setWireField015(Integer wireField015) { this.wireField015 = wireField015; }

    public Long getWireField016() { return wireField016; }
    public void setWireField016(Long wireField016) { this.wireField016 = wireField016; }

    @Override
    public String toString() {
        return "WireDto045{" +
            "wireField000=" + wireField000 + ", " +
            "wireField001=" + wireField001 + ", " +
            "wireField002=" + wireField002 + ", " +
            "wireField003=" + wireField003 + ", " +
            "wireField004=" + wireField004 + ", " +
            "}";
    }
}
