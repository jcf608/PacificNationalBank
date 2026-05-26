package com.pnb.wire;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * WireDto047 — Data Transfer Object for wire operations.
 * Variant 47 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WireDto047 {

    @JsonProperty("wireField000")
    private Long wireField000;

    @Size(max = 60)
    @JsonProperty("wireField001")
    private String wireField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("wireField002")
    private BigDecimal wireField002;

    @JsonProperty("wireField003")
    private Integer wireField003;

    @JsonProperty("wireField004")
    private Long wireField004;

    @JsonProperty("wireField005")
    private Integer wireField005;

    @JsonProperty("wireField006")
    private Double wireField006;

    @JsonProperty("wireField007")
    private LocalDate wireField007;

    @JsonProperty("wireField008")
    private Long wireField008;

    @JsonProperty("wireField009")
    private Boolean wireField009;

    @Size(max = 40)
    @JsonProperty("wireField010")
    private String wireField010;

    @JsonProperty("wireField011")
    private Long wireField011;

    @JsonProperty("wireField012")
    private Long wireField012;

    @JsonProperty("wireField013")
    private Long wireField013;

    @JsonProperty("wireField014")
    private Long wireField014;

    @JsonProperty("wireField015")
    private Double wireField015;

    @JsonProperty("wireField016")
    private LocalDate wireField016;

    @Size(max = 40)
    @JsonProperty("wireField017")
    private String wireField017;

    @DecimalMin(value = "0.00")
    @JsonProperty("wireField018")
    private BigDecimal wireField018;

    public WireDto047() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final WireDto047 instance = new WireDto047();

        public Builder wireField000(Long val) { instance.wireField000 = val; return this; }
        public Builder wireField001(String val) { instance.wireField001 = val; return this; }
        public Builder wireField002(BigDecimal val) { instance.wireField002 = val; return this; }
        public Builder wireField003(Integer val) { instance.wireField003 = val; return this; }
        public Builder wireField004(Long val) { instance.wireField004 = val; return this; }
        public Builder wireField005(Integer val) { instance.wireField005 = val; return this; }
        public Builder wireField006(Double val) { instance.wireField006 = val; return this; }
        public Builder wireField007(LocalDate val) { instance.wireField007 = val; return this; }
        public Builder wireField008(Long val) { instance.wireField008 = val; return this; }
        public Builder wireField009(Boolean val) { instance.wireField009 = val; return this; }
        public Builder wireField010(String val) { instance.wireField010 = val; return this; }
        public Builder wireField011(Long val) { instance.wireField011 = val; return this; }
        public Builder wireField012(Long val) { instance.wireField012 = val; return this; }
        public Builder wireField013(Long val) { instance.wireField013 = val; return this; }
        public Builder wireField014(Long val) { instance.wireField014 = val; return this; }
        public Builder wireField015(Double val) { instance.wireField015 = val; return this; }
        public Builder wireField016(LocalDate val) { instance.wireField016 = val; return this; }
        public Builder wireField017(String val) { instance.wireField017 = val; return this; }
        public Builder wireField018(BigDecimal val) { instance.wireField018 = val; return this; }
        public WireDto047 build() { return instance; }
    }

    public Long getWireField000() { return wireField000; }
    public void setWireField000(Long wireField000) { this.wireField000 = wireField000; }

    public String getWireField001() { return wireField001; }
    public void setWireField001(String wireField001) { this.wireField001 = wireField001; }

    public BigDecimal getWireField002() { return wireField002; }
    public void setWireField002(BigDecimal wireField002) { this.wireField002 = wireField002; }

    public Integer getWireField003() { return wireField003; }
    public void setWireField003(Integer wireField003) { this.wireField003 = wireField003; }

    public Long getWireField004() { return wireField004; }
    public void setWireField004(Long wireField004) { this.wireField004 = wireField004; }

    public Integer getWireField005() { return wireField005; }
    public void setWireField005(Integer wireField005) { this.wireField005 = wireField005; }

    public Double getWireField006() { return wireField006; }
    public void setWireField006(Double wireField006) { this.wireField006 = wireField006; }

    public LocalDate getWireField007() { return wireField007; }
    public void setWireField007(LocalDate wireField007) { this.wireField007 = wireField007; }

    public Long getWireField008() { return wireField008; }
    public void setWireField008(Long wireField008) { this.wireField008 = wireField008; }

    public Boolean getWireField009() { return wireField009; }
    public void setWireField009(Boolean wireField009) { this.wireField009 = wireField009; }

    public String getWireField010() { return wireField010; }
    public void setWireField010(String wireField010) { this.wireField010 = wireField010; }

    public Long getWireField011() { return wireField011; }
    public void setWireField011(Long wireField011) { this.wireField011 = wireField011; }

    public Long getWireField012() { return wireField012; }
    public void setWireField012(Long wireField012) { this.wireField012 = wireField012; }

    public Long getWireField013() { return wireField013; }
    public void setWireField013(Long wireField013) { this.wireField013 = wireField013; }

    public Long getWireField014() { return wireField014; }
    public void setWireField014(Long wireField014) { this.wireField014 = wireField014; }

    public Double getWireField015() { return wireField015; }
    public void setWireField015(Double wireField015) { this.wireField015 = wireField015; }

    public LocalDate getWireField016() { return wireField016; }
    public void setWireField016(LocalDate wireField016) { this.wireField016 = wireField016; }

    public String getWireField017() { return wireField017; }
    public void setWireField017(String wireField017) { this.wireField017 = wireField017; }

    public BigDecimal getWireField018() { return wireField018; }
    public void setWireField018(BigDecimal wireField018) { this.wireField018 = wireField018; }

    @Override
    public String toString() {
        return "WireDto047{" +
            "wireField000=" + wireField000 + ", " +
            "wireField001=" + wireField001 + ", " +
            "wireField002=" + wireField002 + ", " +
            "wireField003=" + wireField003 + ", " +
            "wireField004=" + wireField004 + ", " +
            "}";
    }
}
