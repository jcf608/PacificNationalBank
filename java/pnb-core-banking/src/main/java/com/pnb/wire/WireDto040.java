package com.pnb.wire;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * WireDto040 — Data Transfer Object for wire operations.
 * Variant 40 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WireDto040 {

    @JsonProperty("wireField000")
    private Boolean wireField000;

    @JsonProperty("wireField001")
    private Integer wireField001;

    @Size(max = 40)
    @JsonProperty("wireField002")
    private String wireField002;

    @JsonProperty("wireField003")
    private Integer wireField003;

    @JsonProperty("wireField004")
    private Boolean wireField004;

    @JsonProperty("wireField005")
    private Boolean wireField005;

    @JsonProperty("wireField006")
    private Double wireField006;

    @JsonProperty("wireField007")
    private Integer wireField007;

    @Size(max = 60)
    @JsonProperty("wireField008")
    private String wireField008;

    @JsonProperty("wireField009")
    private LocalDate wireField009;

    @DecimalMin(value = "0.00")
    @JsonProperty("wireField010")
    private BigDecimal wireField010;

    @JsonProperty("wireField011")
    private Long wireField011;

    public WireDto040() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final WireDto040 instance = new WireDto040();

        public Builder wireField000(Boolean val) { instance.wireField000 = val; return this; }
        public Builder wireField001(Integer val) { instance.wireField001 = val; return this; }
        public Builder wireField002(String val) { instance.wireField002 = val; return this; }
        public Builder wireField003(Integer val) { instance.wireField003 = val; return this; }
        public Builder wireField004(Boolean val) { instance.wireField004 = val; return this; }
        public Builder wireField005(Boolean val) { instance.wireField005 = val; return this; }
        public Builder wireField006(Double val) { instance.wireField006 = val; return this; }
        public Builder wireField007(Integer val) { instance.wireField007 = val; return this; }
        public Builder wireField008(String val) { instance.wireField008 = val; return this; }
        public Builder wireField009(LocalDate val) { instance.wireField009 = val; return this; }
        public Builder wireField010(BigDecimal val) { instance.wireField010 = val; return this; }
        public Builder wireField011(Long val) { instance.wireField011 = val; return this; }
        public WireDto040 build() { return instance; }
    }

    public Boolean getWireField000() { return wireField000; }
    public void setWireField000(Boolean wireField000) { this.wireField000 = wireField000; }

    public Integer getWireField001() { return wireField001; }
    public void setWireField001(Integer wireField001) { this.wireField001 = wireField001; }

    public String getWireField002() { return wireField002; }
    public void setWireField002(String wireField002) { this.wireField002 = wireField002; }

    public Integer getWireField003() { return wireField003; }
    public void setWireField003(Integer wireField003) { this.wireField003 = wireField003; }

    public Boolean getWireField004() { return wireField004; }
    public void setWireField004(Boolean wireField004) { this.wireField004 = wireField004; }

    public Boolean getWireField005() { return wireField005; }
    public void setWireField005(Boolean wireField005) { this.wireField005 = wireField005; }

    public Double getWireField006() { return wireField006; }
    public void setWireField006(Double wireField006) { this.wireField006 = wireField006; }

    public Integer getWireField007() { return wireField007; }
    public void setWireField007(Integer wireField007) { this.wireField007 = wireField007; }

    public String getWireField008() { return wireField008; }
    public void setWireField008(String wireField008) { this.wireField008 = wireField008; }

    public LocalDate getWireField009() { return wireField009; }
    public void setWireField009(LocalDate wireField009) { this.wireField009 = wireField009; }

    public BigDecimal getWireField010() { return wireField010; }
    public void setWireField010(BigDecimal wireField010) { this.wireField010 = wireField010; }

    public Long getWireField011() { return wireField011; }
    public void setWireField011(Long wireField011) { this.wireField011 = wireField011; }

    @Override
    public String toString() {
        return "WireDto040{" +
            "wireField000=" + wireField000 + ", " +
            "wireField001=" + wireField001 + ", " +
            "wireField002=" + wireField002 + ", " +
            "wireField003=" + wireField003 + ", " +
            "wireField004=" + wireField004 + ", " +
            "}";
    }
}
