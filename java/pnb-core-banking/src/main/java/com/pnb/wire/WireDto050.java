package com.pnb.wire;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * WireDto050 — Data Transfer Object for wire operations.
 * Variant 50 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WireDto050 {

    @JsonProperty("wireField000")
    private Boolean wireField000;

    @JsonProperty("wireField001")
    private Double wireField001;

    @JsonProperty("wireField002")
    private Integer wireField002;

    @JsonProperty("wireField003")
    private Integer wireField003;

    @JsonProperty("wireField004")
    private Boolean wireField004;

    @Size(max = 200)
    @JsonProperty("wireField005")
    private String wireField005;

    @JsonProperty("wireField006")
    private Boolean wireField006;

    @JsonProperty("wireField007")
    private Long wireField007;

    @JsonProperty("wireField008")
    private Long wireField008;

    @Size(max = 60)
    @JsonProperty("wireField009")
    private String wireField009;

    public WireDto050() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final WireDto050 instance = new WireDto050();

        public Builder wireField000(Boolean val) { instance.wireField000 = val; return this; }
        public Builder wireField001(Double val) { instance.wireField001 = val; return this; }
        public Builder wireField002(Integer val) { instance.wireField002 = val; return this; }
        public Builder wireField003(Integer val) { instance.wireField003 = val; return this; }
        public Builder wireField004(Boolean val) { instance.wireField004 = val; return this; }
        public Builder wireField005(String val) { instance.wireField005 = val; return this; }
        public Builder wireField006(Boolean val) { instance.wireField006 = val; return this; }
        public Builder wireField007(Long val) { instance.wireField007 = val; return this; }
        public Builder wireField008(Long val) { instance.wireField008 = val; return this; }
        public Builder wireField009(String val) { instance.wireField009 = val; return this; }
        public WireDto050 build() { return instance; }
    }

    public Boolean getWireField000() { return wireField000; }
    public void setWireField000(Boolean wireField000) { this.wireField000 = wireField000; }

    public Double getWireField001() { return wireField001; }
    public void setWireField001(Double wireField001) { this.wireField001 = wireField001; }

    public Integer getWireField002() { return wireField002; }
    public void setWireField002(Integer wireField002) { this.wireField002 = wireField002; }

    public Integer getWireField003() { return wireField003; }
    public void setWireField003(Integer wireField003) { this.wireField003 = wireField003; }

    public Boolean getWireField004() { return wireField004; }
    public void setWireField004(Boolean wireField004) { this.wireField004 = wireField004; }

    public String getWireField005() { return wireField005; }
    public void setWireField005(String wireField005) { this.wireField005 = wireField005; }

    public Boolean getWireField006() { return wireField006; }
    public void setWireField006(Boolean wireField006) { this.wireField006 = wireField006; }

    public Long getWireField007() { return wireField007; }
    public void setWireField007(Long wireField007) { this.wireField007 = wireField007; }

    public Long getWireField008() { return wireField008; }
    public void setWireField008(Long wireField008) { this.wireField008 = wireField008; }

    public String getWireField009() { return wireField009; }
    public void setWireField009(String wireField009) { this.wireField009 = wireField009; }

    @Override
    public String toString() {
        return "WireDto050{" +
            "wireField000=" + wireField000 + ", " +
            "wireField001=" + wireField001 + ", " +
            "wireField002=" + wireField002 + ", " +
            "wireField003=" + wireField003 + ", " +
            "wireField004=" + wireField004 + ", " +
            "}";
    }
}
