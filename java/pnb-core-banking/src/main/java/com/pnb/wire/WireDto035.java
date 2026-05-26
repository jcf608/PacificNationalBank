package com.pnb.wire;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * WireDto035 — Data Transfer Object for wire operations.
 * Variant 35 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WireDto035 {

    @JsonProperty("wireField000")
    private Double wireField000;

    @JsonProperty("wireField001")
    private LocalDate wireField001;

    @JsonProperty("wireField002")
    private LocalDate wireField002;

    @JsonProperty("wireField003")
    private Long wireField003;

    @JsonProperty("wireField004")
    private Double wireField004;

    @JsonProperty("wireField005")
    private LocalDate wireField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("wireField006")
    private BigDecimal wireField006;

    @JsonProperty("wireField007")
    private Long wireField007;

    @Size(max = 20)
    @JsonProperty("wireField008")
    private String wireField008;

    @JsonProperty("wireField009")
    private Integer wireField009;

    @JsonProperty("wireField010")
    private LocalDate wireField010;

    @Size(max = 40)
    @JsonProperty("wireField011")
    private String wireField011;

    @JsonProperty("wireField012")
    private Long wireField012;

    @JsonProperty("wireField013")
    private Boolean wireField013;

    @JsonProperty("wireField014")
    private Integer wireField014;

    @JsonProperty("wireField015")
    private Boolean wireField015;

    @JsonProperty("wireField016")
    private LocalDate wireField016;

    @JsonProperty("wireField017")
    private Integer wireField017;

    @JsonProperty("wireField018")
    private Double wireField018;

    public WireDto035() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final WireDto035 instance = new WireDto035();

        public Builder wireField000(Double val) { instance.wireField000 = val; return this; }
        public Builder wireField001(LocalDate val) { instance.wireField001 = val; return this; }
        public Builder wireField002(LocalDate val) { instance.wireField002 = val; return this; }
        public Builder wireField003(Long val) { instance.wireField003 = val; return this; }
        public Builder wireField004(Double val) { instance.wireField004 = val; return this; }
        public Builder wireField005(LocalDate val) { instance.wireField005 = val; return this; }
        public Builder wireField006(BigDecimal val) { instance.wireField006 = val; return this; }
        public Builder wireField007(Long val) { instance.wireField007 = val; return this; }
        public Builder wireField008(String val) { instance.wireField008 = val; return this; }
        public Builder wireField009(Integer val) { instance.wireField009 = val; return this; }
        public Builder wireField010(LocalDate val) { instance.wireField010 = val; return this; }
        public Builder wireField011(String val) { instance.wireField011 = val; return this; }
        public Builder wireField012(Long val) { instance.wireField012 = val; return this; }
        public Builder wireField013(Boolean val) { instance.wireField013 = val; return this; }
        public Builder wireField014(Integer val) { instance.wireField014 = val; return this; }
        public Builder wireField015(Boolean val) { instance.wireField015 = val; return this; }
        public Builder wireField016(LocalDate val) { instance.wireField016 = val; return this; }
        public Builder wireField017(Integer val) { instance.wireField017 = val; return this; }
        public Builder wireField018(Double val) { instance.wireField018 = val; return this; }
        public WireDto035 build() { return instance; }
    }

    public Double getWireField000() { return wireField000; }
    public void setWireField000(Double wireField000) { this.wireField000 = wireField000; }

    public LocalDate getWireField001() { return wireField001; }
    public void setWireField001(LocalDate wireField001) { this.wireField001 = wireField001; }

    public LocalDate getWireField002() { return wireField002; }
    public void setWireField002(LocalDate wireField002) { this.wireField002 = wireField002; }

    public Long getWireField003() { return wireField003; }
    public void setWireField003(Long wireField003) { this.wireField003 = wireField003; }

    public Double getWireField004() { return wireField004; }
    public void setWireField004(Double wireField004) { this.wireField004 = wireField004; }

    public LocalDate getWireField005() { return wireField005; }
    public void setWireField005(LocalDate wireField005) { this.wireField005 = wireField005; }

    public BigDecimal getWireField006() { return wireField006; }
    public void setWireField006(BigDecimal wireField006) { this.wireField006 = wireField006; }

    public Long getWireField007() { return wireField007; }
    public void setWireField007(Long wireField007) { this.wireField007 = wireField007; }

    public String getWireField008() { return wireField008; }
    public void setWireField008(String wireField008) { this.wireField008 = wireField008; }

    public Integer getWireField009() { return wireField009; }
    public void setWireField009(Integer wireField009) { this.wireField009 = wireField009; }

    public LocalDate getWireField010() { return wireField010; }
    public void setWireField010(LocalDate wireField010) { this.wireField010 = wireField010; }

    public String getWireField011() { return wireField011; }
    public void setWireField011(String wireField011) { this.wireField011 = wireField011; }

    public Long getWireField012() { return wireField012; }
    public void setWireField012(Long wireField012) { this.wireField012 = wireField012; }

    public Boolean getWireField013() { return wireField013; }
    public void setWireField013(Boolean wireField013) { this.wireField013 = wireField013; }

    public Integer getWireField014() { return wireField014; }
    public void setWireField014(Integer wireField014) { this.wireField014 = wireField014; }

    public Boolean getWireField015() { return wireField015; }
    public void setWireField015(Boolean wireField015) { this.wireField015 = wireField015; }

    public LocalDate getWireField016() { return wireField016; }
    public void setWireField016(LocalDate wireField016) { this.wireField016 = wireField016; }

    public Integer getWireField017() { return wireField017; }
    public void setWireField017(Integer wireField017) { this.wireField017 = wireField017; }

    public Double getWireField018() { return wireField018; }
    public void setWireField018(Double wireField018) { this.wireField018 = wireField018; }

    @Override
    public String toString() {
        return "WireDto035{" +
            "wireField000=" + wireField000 + ", " +
            "wireField001=" + wireField001 + ", " +
            "wireField002=" + wireField002 + ", " +
            "wireField003=" + wireField003 + ", " +
            "wireField004=" + wireField004 + ", " +
            "}";
    }
}
