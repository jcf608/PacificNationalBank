package com.pnb.wire;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * WireDto032 — Data Transfer Object for wire operations.
 * Variant 32 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WireDto032 {

    @Size(max = 60)
    @JsonProperty("wireField000")
    private String wireField000;

    @JsonProperty("wireField001")
    private LocalDate wireField001;

    @JsonProperty("wireField002")
    private Double wireField002;

    @DecimalMin(value = "0.00")
    @JsonProperty("wireField003")
    private BigDecimal wireField003;

    @JsonProperty("wireField004")
    private Long wireField004;

    @JsonProperty("wireField005")
    private Integer wireField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("wireField006")
    private BigDecimal wireField006;

    @JsonProperty("wireField007")
    private Boolean wireField007;

    @DecimalMin(value = "0.00")
    @JsonProperty("wireField008")
    private BigDecimal wireField008;

    @JsonProperty("wireField009")
    private Integer wireField009;

    @JsonProperty("wireField010")
    private Long wireField010;

    @JsonProperty("wireField011")
    private LocalDate wireField011;

    @DecimalMin(value = "0.00")
    @JsonProperty("wireField012")
    private BigDecimal wireField012;

    @JsonProperty("wireField013")
    private Boolean wireField013;

    @JsonProperty("wireField014")
    private Boolean wireField014;

    @JsonProperty("wireField015")
    private LocalDate wireField015;

    public WireDto032() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final WireDto032 instance = new WireDto032();

        public Builder wireField000(String val) { instance.wireField000 = val; return this; }
        public Builder wireField001(LocalDate val) { instance.wireField001 = val; return this; }
        public Builder wireField002(Double val) { instance.wireField002 = val; return this; }
        public Builder wireField003(BigDecimal val) { instance.wireField003 = val; return this; }
        public Builder wireField004(Long val) { instance.wireField004 = val; return this; }
        public Builder wireField005(Integer val) { instance.wireField005 = val; return this; }
        public Builder wireField006(BigDecimal val) { instance.wireField006 = val; return this; }
        public Builder wireField007(Boolean val) { instance.wireField007 = val; return this; }
        public Builder wireField008(BigDecimal val) { instance.wireField008 = val; return this; }
        public Builder wireField009(Integer val) { instance.wireField009 = val; return this; }
        public Builder wireField010(Long val) { instance.wireField010 = val; return this; }
        public Builder wireField011(LocalDate val) { instance.wireField011 = val; return this; }
        public Builder wireField012(BigDecimal val) { instance.wireField012 = val; return this; }
        public Builder wireField013(Boolean val) { instance.wireField013 = val; return this; }
        public Builder wireField014(Boolean val) { instance.wireField014 = val; return this; }
        public Builder wireField015(LocalDate val) { instance.wireField015 = val; return this; }
        public WireDto032 build() { return instance; }
    }

    public String getWireField000() { return wireField000; }
    public void setWireField000(String wireField000) { this.wireField000 = wireField000; }

    public LocalDate getWireField001() { return wireField001; }
    public void setWireField001(LocalDate wireField001) { this.wireField001 = wireField001; }

    public Double getWireField002() { return wireField002; }
    public void setWireField002(Double wireField002) { this.wireField002 = wireField002; }

    public BigDecimal getWireField003() { return wireField003; }
    public void setWireField003(BigDecimal wireField003) { this.wireField003 = wireField003; }

    public Long getWireField004() { return wireField004; }
    public void setWireField004(Long wireField004) { this.wireField004 = wireField004; }

    public Integer getWireField005() { return wireField005; }
    public void setWireField005(Integer wireField005) { this.wireField005 = wireField005; }

    public BigDecimal getWireField006() { return wireField006; }
    public void setWireField006(BigDecimal wireField006) { this.wireField006 = wireField006; }

    public Boolean getWireField007() { return wireField007; }
    public void setWireField007(Boolean wireField007) { this.wireField007 = wireField007; }

    public BigDecimal getWireField008() { return wireField008; }
    public void setWireField008(BigDecimal wireField008) { this.wireField008 = wireField008; }

    public Integer getWireField009() { return wireField009; }
    public void setWireField009(Integer wireField009) { this.wireField009 = wireField009; }

    public Long getWireField010() { return wireField010; }
    public void setWireField010(Long wireField010) { this.wireField010 = wireField010; }

    public LocalDate getWireField011() { return wireField011; }
    public void setWireField011(LocalDate wireField011) { this.wireField011 = wireField011; }

    public BigDecimal getWireField012() { return wireField012; }
    public void setWireField012(BigDecimal wireField012) { this.wireField012 = wireField012; }

    public Boolean getWireField013() { return wireField013; }
    public void setWireField013(Boolean wireField013) { this.wireField013 = wireField013; }

    public Boolean getWireField014() { return wireField014; }
    public void setWireField014(Boolean wireField014) { this.wireField014 = wireField014; }

    public LocalDate getWireField015() { return wireField015; }
    public void setWireField015(LocalDate wireField015) { this.wireField015 = wireField015; }

    @Override
    public String toString() {
        return "WireDto032{" +
            "wireField000=" + wireField000 + ", " +
            "wireField001=" + wireField001 + ", " +
            "wireField002=" + wireField002 + ", " +
            "wireField003=" + wireField003 + ", " +
            "wireField004=" + wireField004 + ", " +
            "}";
    }
}
