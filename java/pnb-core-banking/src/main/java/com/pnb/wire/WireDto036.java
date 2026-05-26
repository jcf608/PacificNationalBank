package com.pnb.wire;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * WireDto036 — Data Transfer Object for wire operations.
 * Variant 36 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WireDto036 {

    @Size(max = 100)
    @JsonProperty("wireField000")
    private String wireField000;

    @DecimalMin(value = "0.00")
    @JsonProperty("wireField001")
    private BigDecimal wireField001;

    @Size(max = 20)
    @JsonProperty("wireField002")
    private String wireField002;

    @DecimalMin(value = "0.00")
    @JsonProperty("wireField003")
    private BigDecimal wireField003;

    @JsonProperty("wireField004")
    private Integer wireField004;

    @JsonProperty("wireField005")
    private Long wireField005;

    @JsonProperty("wireField006")
    private Boolean wireField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("wireField007")
    private BigDecimal wireField007;

    public WireDto036() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final WireDto036 instance = new WireDto036();

        public Builder wireField000(String val) { instance.wireField000 = val; return this; }
        public Builder wireField001(BigDecimal val) { instance.wireField001 = val; return this; }
        public Builder wireField002(String val) { instance.wireField002 = val; return this; }
        public Builder wireField003(BigDecimal val) { instance.wireField003 = val; return this; }
        public Builder wireField004(Integer val) { instance.wireField004 = val; return this; }
        public Builder wireField005(Long val) { instance.wireField005 = val; return this; }
        public Builder wireField006(Boolean val) { instance.wireField006 = val; return this; }
        public Builder wireField007(BigDecimal val) { instance.wireField007 = val; return this; }
        public WireDto036 build() { return instance; }
    }

    public String getWireField000() { return wireField000; }
    public void setWireField000(String wireField000) { this.wireField000 = wireField000; }

    public BigDecimal getWireField001() { return wireField001; }
    public void setWireField001(BigDecimal wireField001) { this.wireField001 = wireField001; }

    public String getWireField002() { return wireField002; }
    public void setWireField002(String wireField002) { this.wireField002 = wireField002; }

    public BigDecimal getWireField003() { return wireField003; }
    public void setWireField003(BigDecimal wireField003) { this.wireField003 = wireField003; }

    public Integer getWireField004() { return wireField004; }
    public void setWireField004(Integer wireField004) { this.wireField004 = wireField004; }

    public Long getWireField005() { return wireField005; }
    public void setWireField005(Long wireField005) { this.wireField005 = wireField005; }

    public Boolean getWireField006() { return wireField006; }
    public void setWireField006(Boolean wireField006) { this.wireField006 = wireField006; }

    public BigDecimal getWireField007() { return wireField007; }
    public void setWireField007(BigDecimal wireField007) { this.wireField007 = wireField007; }

    @Override
    public String toString() {
        return "WireDto036{" +
            "wireField000=" + wireField000 + ", " +
            "wireField001=" + wireField001 + ", " +
            "wireField002=" + wireField002 + ", " +
            "wireField003=" + wireField003 + ", " +
            "wireField004=" + wireField004 + ", " +
            "}";
    }
}
