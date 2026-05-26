package com.pnb.wire;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * WireDto023 — Data Transfer Object for wire operations.
 * Variant 23 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WireDto023 {

    @JsonProperty("wireField000")
    private Long wireField000;

    @DecimalMin(value = "0.00")
    @JsonProperty("wireField001")
    private BigDecimal wireField001;

    @JsonProperty("wireField002")
    private LocalDate wireField002;

    @JsonProperty("wireField003")
    private Integer wireField003;

    @JsonProperty("wireField004")
    private Long wireField004;

    @JsonProperty("wireField005")
    private Long wireField005;

    @Size(max = 60)
    @JsonProperty("wireField006")
    private String wireField006;

    @Size(max = 40)
    @JsonProperty("wireField007")
    private String wireField007;

    @JsonProperty("wireField008")
    private Double wireField008;

    @JsonProperty("wireField009")
    private Double wireField009;

    @JsonProperty("wireField010")
    private LocalDate wireField010;

    @JsonProperty("wireField011")
    private Double wireField011;

    @JsonProperty("wireField012")
    private Long wireField012;

    @JsonProperty("wireField013")
    private Double wireField013;

    @JsonProperty("wireField014")
    private Long wireField014;

    @JsonProperty("wireField015")
    private LocalDate wireField015;

    @DecimalMin(value = "0.00")
    @JsonProperty("wireField016")
    private BigDecimal wireField016;

    @JsonProperty("wireField017")
    private Boolean wireField017;

    @JsonProperty("wireField018")
    private Integer wireField018;

    public WireDto023() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final WireDto023 instance = new WireDto023();

        public Builder wireField000(Long val) { instance.wireField000 = val; return this; }
        public Builder wireField001(BigDecimal val) { instance.wireField001 = val; return this; }
        public Builder wireField002(LocalDate val) { instance.wireField002 = val; return this; }
        public Builder wireField003(Integer val) { instance.wireField003 = val; return this; }
        public Builder wireField004(Long val) { instance.wireField004 = val; return this; }
        public Builder wireField005(Long val) { instance.wireField005 = val; return this; }
        public Builder wireField006(String val) { instance.wireField006 = val; return this; }
        public Builder wireField007(String val) { instance.wireField007 = val; return this; }
        public Builder wireField008(Double val) { instance.wireField008 = val; return this; }
        public Builder wireField009(Double val) { instance.wireField009 = val; return this; }
        public Builder wireField010(LocalDate val) { instance.wireField010 = val; return this; }
        public Builder wireField011(Double val) { instance.wireField011 = val; return this; }
        public Builder wireField012(Long val) { instance.wireField012 = val; return this; }
        public Builder wireField013(Double val) { instance.wireField013 = val; return this; }
        public Builder wireField014(Long val) { instance.wireField014 = val; return this; }
        public Builder wireField015(LocalDate val) { instance.wireField015 = val; return this; }
        public Builder wireField016(BigDecimal val) { instance.wireField016 = val; return this; }
        public Builder wireField017(Boolean val) { instance.wireField017 = val; return this; }
        public Builder wireField018(Integer val) { instance.wireField018 = val; return this; }
        public WireDto023 build() { return instance; }
    }

    public Long getWireField000() { return wireField000; }
    public void setWireField000(Long wireField000) { this.wireField000 = wireField000; }

    public BigDecimal getWireField001() { return wireField001; }
    public void setWireField001(BigDecimal wireField001) { this.wireField001 = wireField001; }

    public LocalDate getWireField002() { return wireField002; }
    public void setWireField002(LocalDate wireField002) { this.wireField002 = wireField002; }

    public Integer getWireField003() { return wireField003; }
    public void setWireField003(Integer wireField003) { this.wireField003 = wireField003; }

    public Long getWireField004() { return wireField004; }
    public void setWireField004(Long wireField004) { this.wireField004 = wireField004; }

    public Long getWireField005() { return wireField005; }
    public void setWireField005(Long wireField005) { this.wireField005 = wireField005; }

    public String getWireField006() { return wireField006; }
    public void setWireField006(String wireField006) { this.wireField006 = wireField006; }

    public String getWireField007() { return wireField007; }
    public void setWireField007(String wireField007) { this.wireField007 = wireField007; }

    public Double getWireField008() { return wireField008; }
    public void setWireField008(Double wireField008) { this.wireField008 = wireField008; }

    public Double getWireField009() { return wireField009; }
    public void setWireField009(Double wireField009) { this.wireField009 = wireField009; }

    public LocalDate getWireField010() { return wireField010; }
    public void setWireField010(LocalDate wireField010) { this.wireField010 = wireField010; }

    public Double getWireField011() { return wireField011; }
    public void setWireField011(Double wireField011) { this.wireField011 = wireField011; }

    public Long getWireField012() { return wireField012; }
    public void setWireField012(Long wireField012) { this.wireField012 = wireField012; }

    public Double getWireField013() { return wireField013; }
    public void setWireField013(Double wireField013) { this.wireField013 = wireField013; }

    public Long getWireField014() { return wireField014; }
    public void setWireField014(Long wireField014) { this.wireField014 = wireField014; }

    public LocalDate getWireField015() { return wireField015; }
    public void setWireField015(LocalDate wireField015) { this.wireField015 = wireField015; }

    public BigDecimal getWireField016() { return wireField016; }
    public void setWireField016(BigDecimal wireField016) { this.wireField016 = wireField016; }

    public Boolean getWireField017() { return wireField017; }
    public void setWireField017(Boolean wireField017) { this.wireField017 = wireField017; }

    public Integer getWireField018() { return wireField018; }
    public void setWireField018(Integer wireField018) { this.wireField018 = wireField018; }

    @Override
    public String toString() {
        return "WireDto023{" +
            "wireField000=" + wireField000 + ", " +
            "wireField001=" + wireField001 + ", " +
            "wireField002=" + wireField002 + ", " +
            "wireField003=" + wireField003 + ", " +
            "wireField004=" + wireField004 + ", " +
            "}";
    }
}
