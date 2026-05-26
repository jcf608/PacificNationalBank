package com.pnb.wire;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * WireDto031 — Data Transfer Object for wire operations.
 * Variant 31 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WireDto031 {

    @Size(max = 20)
    @JsonProperty("wireField000")
    private String wireField000;

    @Size(max = 40)
    @JsonProperty("wireField001")
    private String wireField001;

    @JsonProperty("wireField002")
    private Integer wireField002;

    @JsonProperty("wireField003")
    private LocalDate wireField003;

    @JsonProperty("wireField004")
    private Boolean wireField004;

    @JsonProperty("wireField005")
    private LocalDate wireField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("wireField006")
    private BigDecimal wireField006;

    @JsonProperty("wireField007")
    private Long wireField007;

    @DecimalMin(value = "0.00")
    @JsonProperty("wireField008")
    private BigDecimal wireField008;

    @JsonProperty("wireField009")
    private Boolean wireField009;

    @JsonProperty("wireField010")
    private Double wireField010;

    @JsonProperty("wireField011")
    private Double wireField011;

    @JsonProperty("wireField012")
    private Long wireField012;

    @JsonProperty("wireField013")
    private LocalDate wireField013;

    @JsonProperty("wireField014")
    private Boolean wireField014;

    public WireDto031() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final WireDto031 instance = new WireDto031();

        public Builder wireField000(String val) { instance.wireField000 = val; return this; }
        public Builder wireField001(String val) { instance.wireField001 = val; return this; }
        public Builder wireField002(Integer val) { instance.wireField002 = val; return this; }
        public Builder wireField003(LocalDate val) { instance.wireField003 = val; return this; }
        public Builder wireField004(Boolean val) { instance.wireField004 = val; return this; }
        public Builder wireField005(LocalDate val) { instance.wireField005 = val; return this; }
        public Builder wireField006(BigDecimal val) { instance.wireField006 = val; return this; }
        public Builder wireField007(Long val) { instance.wireField007 = val; return this; }
        public Builder wireField008(BigDecimal val) { instance.wireField008 = val; return this; }
        public Builder wireField009(Boolean val) { instance.wireField009 = val; return this; }
        public Builder wireField010(Double val) { instance.wireField010 = val; return this; }
        public Builder wireField011(Double val) { instance.wireField011 = val; return this; }
        public Builder wireField012(Long val) { instance.wireField012 = val; return this; }
        public Builder wireField013(LocalDate val) { instance.wireField013 = val; return this; }
        public Builder wireField014(Boolean val) { instance.wireField014 = val; return this; }
        public WireDto031 build() { return instance; }
    }

    public String getWireField000() { return wireField000; }
    public void setWireField000(String wireField000) { this.wireField000 = wireField000; }

    public String getWireField001() { return wireField001; }
    public void setWireField001(String wireField001) { this.wireField001 = wireField001; }

    public Integer getWireField002() { return wireField002; }
    public void setWireField002(Integer wireField002) { this.wireField002 = wireField002; }

    public LocalDate getWireField003() { return wireField003; }
    public void setWireField003(LocalDate wireField003) { this.wireField003 = wireField003; }

    public Boolean getWireField004() { return wireField004; }
    public void setWireField004(Boolean wireField004) { this.wireField004 = wireField004; }

    public LocalDate getWireField005() { return wireField005; }
    public void setWireField005(LocalDate wireField005) { this.wireField005 = wireField005; }

    public BigDecimal getWireField006() { return wireField006; }
    public void setWireField006(BigDecimal wireField006) { this.wireField006 = wireField006; }

    public Long getWireField007() { return wireField007; }
    public void setWireField007(Long wireField007) { this.wireField007 = wireField007; }

    public BigDecimal getWireField008() { return wireField008; }
    public void setWireField008(BigDecimal wireField008) { this.wireField008 = wireField008; }

    public Boolean getWireField009() { return wireField009; }
    public void setWireField009(Boolean wireField009) { this.wireField009 = wireField009; }

    public Double getWireField010() { return wireField010; }
    public void setWireField010(Double wireField010) { this.wireField010 = wireField010; }

    public Double getWireField011() { return wireField011; }
    public void setWireField011(Double wireField011) { this.wireField011 = wireField011; }

    public Long getWireField012() { return wireField012; }
    public void setWireField012(Long wireField012) { this.wireField012 = wireField012; }

    public LocalDate getWireField013() { return wireField013; }
    public void setWireField013(LocalDate wireField013) { this.wireField013 = wireField013; }

    public Boolean getWireField014() { return wireField014; }
    public void setWireField014(Boolean wireField014) { this.wireField014 = wireField014; }

    @Override
    public String toString() {
        return "WireDto031{" +
            "wireField000=" + wireField000 + ", " +
            "wireField001=" + wireField001 + ", " +
            "wireField002=" + wireField002 + ", " +
            "wireField003=" + wireField003 + ", " +
            "wireField004=" + wireField004 + ", " +
            "}";
    }
}
