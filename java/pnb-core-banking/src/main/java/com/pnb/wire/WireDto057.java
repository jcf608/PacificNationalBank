package com.pnb.wire;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * WireDto057 — Data Transfer Object for wire operations.
 * Variant 57 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WireDto057 {

    @JsonProperty("wireField000")
    private Long wireField000;

    @JsonProperty("wireField001")
    private Integer wireField001;

    @Size(max = 60)
    @JsonProperty("wireField002")
    private String wireField002;

    @JsonProperty("wireField003")
    private Long wireField003;

    @JsonProperty("wireField004")
    private Boolean wireField004;

    @JsonProperty("wireField005")
    private Integer wireField005;

    @Size(max = 60)
    @JsonProperty("wireField006")
    private String wireField006;

    @JsonProperty("wireField007")
    private LocalDate wireField007;

    @JsonProperty("wireField008")
    private LocalDate wireField008;

    @JsonProperty("wireField009")
    private Boolean wireField009;

    @JsonProperty("wireField010")
    private Double wireField010;

    @DecimalMin(value = "0.00")
    @JsonProperty("wireField011")
    private BigDecimal wireField011;

    @JsonProperty("wireField012")
    private Double wireField012;

    @JsonProperty("wireField013")
    private Integer wireField013;

    @Size(max = 20)
    @JsonProperty("wireField014")
    private String wireField014;

    @DecimalMin(value = "0.00")
    @JsonProperty("wireField015")
    private BigDecimal wireField015;

    @JsonProperty("wireField016")
    private Double wireField016;

    public WireDto057() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final WireDto057 instance = new WireDto057();

        public Builder wireField000(Long val) { instance.wireField000 = val; return this; }
        public Builder wireField001(Integer val) { instance.wireField001 = val; return this; }
        public Builder wireField002(String val) { instance.wireField002 = val; return this; }
        public Builder wireField003(Long val) { instance.wireField003 = val; return this; }
        public Builder wireField004(Boolean val) { instance.wireField004 = val; return this; }
        public Builder wireField005(Integer val) { instance.wireField005 = val; return this; }
        public Builder wireField006(String val) { instance.wireField006 = val; return this; }
        public Builder wireField007(LocalDate val) { instance.wireField007 = val; return this; }
        public Builder wireField008(LocalDate val) { instance.wireField008 = val; return this; }
        public Builder wireField009(Boolean val) { instance.wireField009 = val; return this; }
        public Builder wireField010(Double val) { instance.wireField010 = val; return this; }
        public Builder wireField011(BigDecimal val) { instance.wireField011 = val; return this; }
        public Builder wireField012(Double val) { instance.wireField012 = val; return this; }
        public Builder wireField013(Integer val) { instance.wireField013 = val; return this; }
        public Builder wireField014(String val) { instance.wireField014 = val; return this; }
        public Builder wireField015(BigDecimal val) { instance.wireField015 = val; return this; }
        public Builder wireField016(Double val) { instance.wireField016 = val; return this; }
        public WireDto057 build() { return instance; }
    }

    public Long getWireField000() { return wireField000; }
    public void setWireField000(Long wireField000) { this.wireField000 = wireField000; }

    public Integer getWireField001() { return wireField001; }
    public void setWireField001(Integer wireField001) { this.wireField001 = wireField001; }

    public String getWireField002() { return wireField002; }
    public void setWireField002(String wireField002) { this.wireField002 = wireField002; }

    public Long getWireField003() { return wireField003; }
    public void setWireField003(Long wireField003) { this.wireField003 = wireField003; }

    public Boolean getWireField004() { return wireField004; }
    public void setWireField004(Boolean wireField004) { this.wireField004 = wireField004; }

    public Integer getWireField005() { return wireField005; }
    public void setWireField005(Integer wireField005) { this.wireField005 = wireField005; }

    public String getWireField006() { return wireField006; }
    public void setWireField006(String wireField006) { this.wireField006 = wireField006; }

    public LocalDate getWireField007() { return wireField007; }
    public void setWireField007(LocalDate wireField007) { this.wireField007 = wireField007; }

    public LocalDate getWireField008() { return wireField008; }
    public void setWireField008(LocalDate wireField008) { this.wireField008 = wireField008; }

    public Boolean getWireField009() { return wireField009; }
    public void setWireField009(Boolean wireField009) { this.wireField009 = wireField009; }

    public Double getWireField010() { return wireField010; }
    public void setWireField010(Double wireField010) { this.wireField010 = wireField010; }

    public BigDecimal getWireField011() { return wireField011; }
    public void setWireField011(BigDecimal wireField011) { this.wireField011 = wireField011; }

    public Double getWireField012() { return wireField012; }
    public void setWireField012(Double wireField012) { this.wireField012 = wireField012; }

    public Integer getWireField013() { return wireField013; }
    public void setWireField013(Integer wireField013) { this.wireField013 = wireField013; }

    public String getWireField014() { return wireField014; }
    public void setWireField014(String wireField014) { this.wireField014 = wireField014; }

    public BigDecimal getWireField015() { return wireField015; }
    public void setWireField015(BigDecimal wireField015) { this.wireField015 = wireField015; }

    public Double getWireField016() { return wireField016; }
    public void setWireField016(Double wireField016) { this.wireField016 = wireField016; }

    @Override
    public String toString() {
        return "WireDto057{" +
            "wireField000=" + wireField000 + ", " +
            "wireField001=" + wireField001 + ", " +
            "wireField002=" + wireField002 + ", " +
            "wireField003=" + wireField003 + ", " +
            "wireField004=" + wireField004 + ", " +
            "}";
    }
}
