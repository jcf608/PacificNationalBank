package com.pnb.wire;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * WireDto046 — Data Transfer Object for wire operations.
 * Variant 46 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WireDto046 {

    @JsonProperty("wireField000")
    private Long wireField000;

    @JsonProperty("wireField001")
    private Double wireField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("wireField002")
    private BigDecimal wireField002;

    @JsonProperty("wireField003")
    private Long wireField003;

    @JsonProperty("wireField004")
    private Double wireField004;

    @JsonProperty("wireField005")
    private LocalDate wireField005;

    @Size(max = 40)
    @JsonProperty("wireField006")
    private String wireField006;

    @JsonProperty("wireField007")
    private Integer wireField007;

    @JsonProperty("wireField008")
    private LocalDate wireField008;

    @DecimalMin(value = "0.00")
    @JsonProperty("wireField009")
    private BigDecimal wireField009;

    @Size(max = 100)
    @JsonProperty("wireField010")
    private String wireField010;

    @JsonProperty("wireField011")
    private Long wireField011;

    @JsonProperty("wireField012")
    private Integer wireField012;

    @Size(max = 200)
    @JsonProperty("wireField013")
    private String wireField013;

    @JsonProperty("wireField014")
    private Boolean wireField014;

    @JsonProperty("wireField015")
    private Integer wireField015;

    @JsonProperty("wireField016")
    private Long wireField016;

    @JsonProperty("wireField017")
    private LocalDate wireField017;

    public WireDto046() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final WireDto046 instance = new WireDto046();

        public Builder wireField000(Long val) { instance.wireField000 = val; return this; }
        public Builder wireField001(Double val) { instance.wireField001 = val; return this; }
        public Builder wireField002(BigDecimal val) { instance.wireField002 = val; return this; }
        public Builder wireField003(Long val) { instance.wireField003 = val; return this; }
        public Builder wireField004(Double val) { instance.wireField004 = val; return this; }
        public Builder wireField005(LocalDate val) { instance.wireField005 = val; return this; }
        public Builder wireField006(String val) { instance.wireField006 = val; return this; }
        public Builder wireField007(Integer val) { instance.wireField007 = val; return this; }
        public Builder wireField008(LocalDate val) { instance.wireField008 = val; return this; }
        public Builder wireField009(BigDecimal val) { instance.wireField009 = val; return this; }
        public Builder wireField010(String val) { instance.wireField010 = val; return this; }
        public Builder wireField011(Long val) { instance.wireField011 = val; return this; }
        public Builder wireField012(Integer val) { instance.wireField012 = val; return this; }
        public Builder wireField013(String val) { instance.wireField013 = val; return this; }
        public Builder wireField014(Boolean val) { instance.wireField014 = val; return this; }
        public Builder wireField015(Integer val) { instance.wireField015 = val; return this; }
        public Builder wireField016(Long val) { instance.wireField016 = val; return this; }
        public Builder wireField017(LocalDate val) { instance.wireField017 = val; return this; }
        public WireDto046 build() { return instance; }
    }

    public Long getWireField000() { return wireField000; }
    public void setWireField000(Long wireField000) { this.wireField000 = wireField000; }

    public Double getWireField001() { return wireField001; }
    public void setWireField001(Double wireField001) { this.wireField001 = wireField001; }

    public BigDecimal getWireField002() { return wireField002; }
    public void setWireField002(BigDecimal wireField002) { this.wireField002 = wireField002; }

    public Long getWireField003() { return wireField003; }
    public void setWireField003(Long wireField003) { this.wireField003 = wireField003; }

    public Double getWireField004() { return wireField004; }
    public void setWireField004(Double wireField004) { this.wireField004 = wireField004; }

    public LocalDate getWireField005() { return wireField005; }
    public void setWireField005(LocalDate wireField005) { this.wireField005 = wireField005; }

    public String getWireField006() { return wireField006; }
    public void setWireField006(String wireField006) { this.wireField006 = wireField006; }

    public Integer getWireField007() { return wireField007; }
    public void setWireField007(Integer wireField007) { this.wireField007 = wireField007; }

    public LocalDate getWireField008() { return wireField008; }
    public void setWireField008(LocalDate wireField008) { this.wireField008 = wireField008; }

    public BigDecimal getWireField009() { return wireField009; }
    public void setWireField009(BigDecimal wireField009) { this.wireField009 = wireField009; }

    public String getWireField010() { return wireField010; }
    public void setWireField010(String wireField010) { this.wireField010 = wireField010; }

    public Long getWireField011() { return wireField011; }
    public void setWireField011(Long wireField011) { this.wireField011 = wireField011; }

    public Integer getWireField012() { return wireField012; }
    public void setWireField012(Integer wireField012) { this.wireField012 = wireField012; }

    public String getWireField013() { return wireField013; }
    public void setWireField013(String wireField013) { this.wireField013 = wireField013; }

    public Boolean getWireField014() { return wireField014; }
    public void setWireField014(Boolean wireField014) { this.wireField014 = wireField014; }

    public Integer getWireField015() { return wireField015; }
    public void setWireField015(Integer wireField015) { this.wireField015 = wireField015; }

    public Long getWireField016() { return wireField016; }
    public void setWireField016(Long wireField016) { this.wireField016 = wireField016; }

    public LocalDate getWireField017() { return wireField017; }
    public void setWireField017(LocalDate wireField017) { this.wireField017 = wireField017; }

    @Override
    public String toString() {
        return "WireDto046{" +
            "wireField000=" + wireField000 + ", " +
            "wireField001=" + wireField001 + ", " +
            "wireField002=" + wireField002 + ", " +
            "wireField003=" + wireField003 + ", " +
            "wireField004=" + wireField004 + ", " +
            "}";
    }
}
