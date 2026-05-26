package com.pnb.wire;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * WireDto030 — Data Transfer Object for wire operations.
 * Variant 30 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WireDto030 {

    @JsonProperty("wireField000")
    private Long wireField000;

    @JsonProperty("wireField001")
    private Boolean wireField001;

    @JsonProperty("wireField002")
    private Boolean wireField002;

    @JsonProperty("wireField003")
    private Long wireField003;

    @JsonProperty("wireField004")
    private Boolean wireField004;

    @JsonProperty("wireField005")
    private LocalDate wireField005;

    @JsonProperty("wireField006")
    private Long wireField006;

    @JsonProperty("wireField007")
    private Integer wireField007;

    @Size(max = 20)
    @JsonProperty("wireField008")
    private String wireField008;

    @JsonProperty("wireField009")
    private Boolean wireField009;

    @Size(max = 60)
    @JsonProperty("wireField010")
    private String wireField010;

    @DecimalMin(value = "0.00")
    @JsonProperty("wireField011")
    private BigDecimal wireField011;

    @JsonProperty("wireField012")
    private LocalDate wireField012;

    @JsonProperty("wireField013")
    private Integer wireField013;

    public WireDto030() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final WireDto030 instance = new WireDto030();

        public Builder wireField000(Long val) { instance.wireField000 = val; return this; }
        public Builder wireField001(Boolean val) { instance.wireField001 = val; return this; }
        public Builder wireField002(Boolean val) { instance.wireField002 = val; return this; }
        public Builder wireField003(Long val) { instance.wireField003 = val; return this; }
        public Builder wireField004(Boolean val) { instance.wireField004 = val; return this; }
        public Builder wireField005(LocalDate val) { instance.wireField005 = val; return this; }
        public Builder wireField006(Long val) { instance.wireField006 = val; return this; }
        public Builder wireField007(Integer val) { instance.wireField007 = val; return this; }
        public Builder wireField008(String val) { instance.wireField008 = val; return this; }
        public Builder wireField009(Boolean val) { instance.wireField009 = val; return this; }
        public Builder wireField010(String val) { instance.wireField010 = val; return this; }
        public Builder wireField011(BigDecimal val) { instance.wireField011 = val; return this; }
        public Builder wireField012(LocalDate val) { instance.wireField012 = val; return this; }
        public Builder wireField013(Integer val) { instance.wireField013 = val; return this; }
        public WireDto030 build() { return instance; }
    }

    public Long getWireField000() { return wireField000; }
    public void setWireField000(Long wireField000) { this.wireField000 = wireField000; }

    public Boolean getWireField001() { return wireField001; }
    public void setWireField001(Boolean wireField001) { this.wireField001 = wireField001; }

    public Boolean getWireField002() { return wireField002; }
    public void setWireField002(Boolean wireField002) { this.wireField002 = wireField002; }

    public Long getWireField003() { return wireField003; }
    public void setWireField003(Long wireField003) { this.wireField003 = wireField003; }

    public Boolean getWireField004() { return wireField004; }
    public void setWireField004(Boolean wireField004) { this.wireField004 = wireField004; }

    public LocalDate getWireField005() { return wireField005; }
    public void setWireField005(LocalDate wireField005) { this.wireField005 = wireField005; }

    public Long getWireField006() { return wireField006; }
    public void setWireField006(Long wireField006) { this.wireField006 = wireField006; }

    public Integer getWireField007() { return wireField007; }
    public void setWireField007(Integer wireField007) { this.wireField007 = wireField007; }

    public String getWireField008() { return wireField008; }
    public void setWireField008(String wireField008) { this.wireField008 = wireField008; }

    public Boolean getWireField009() { return wireField009; }
    public void setWireField009(Boolean wireField009) { this.wireField009 = wireField009; }

    public String getWireField010() { return wireField010; }
    public void setWireField010(String wireField010) { this.wireField010 = wireField010; }

    public BigDecimal getWireField011() { return wireField011; }
    public void setWireField011(BigDecimal wireField011) { this.wireField011 = wireField011; }

    public LocalDate getWireField012() { return wireField012; }
    public void setWireField012(LocalDate wireField012) { this.wireField012 = wireField012; }

    public Integer getWireField013() { return wireField013; }
    public void setWireField013(Integer wireField013) { this.wireField013 = wireField013; }

    @Override
    public String toString() {
        return "WireDto030{" +
            "wireField000=" + wireField000 + ", " +
            "wireField001=" + wireField001 + ", " +
            "wireField002=" + wireField002 + ", " +
            "wireField003=" + wireField003 + ", " +
            "wireField004=" + wireField004 + ", " +
            "}";
    }
}
