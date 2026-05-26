package com.pnb.wire;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * WireDto024 — Data Transfer Object for wire operations.
 * Variant 24 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WireDto024 {

    @JsonProperty("wireField000")
    private LocalDate wireField000;

    @DecimalMin(value = "0.00")
    @JsonProperty("wireField001")
    private BigDecimal wireField001;

    @JsonProperty("wireField002")
    private Double wireField002;

    @JsonProperty("wireField003")
    private Integer wireField003;

    @Size(max = 100)
    @JsonProperty("wireField004")
    private String wireField004;

    @JsonProperty("wireField005")
    private Long wireField005;

    @JsonProperty("wireField006")
    private Boolean wireField006;

    @JsonProperty("wireField007")
    private Integer wireField007;

    public WireDto024() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final WireDto024 instance = new WireDto024();

        public Builder wireField000(LocalDate val) { instance.wireField000 = val; return this; }
        public Builder wireField001(BigDecimal val) { instance.wireField001 = val; return this; }
        public Builder wireField002(Double val) { instance.wireField002 = val; return this; }
        public Builder wireField003(Integer val) { instance.wireField003 = val; return this; }
        public Builder wireField004(String val) { instance.wireField004 = val; return this; }
        public Builder wireField005(Long val) { instance.wireField005 = val; return this; }
        public Builder wireField006(Boolean val) { instance.wireField006 = val; return this; }
        public Builder wireField007(Integer val) { instance.wireField007 = val; return this; }
        public WireDto024 build() { return instance; }
    }

    public LocalDate getWireField000() { return wireField000; }
    public void setWireField000(LocalDate wireField000) { this.wireField000 = wireField000; }

    public BigDecimal getWireField001() { return wireField001; }
    public void setWireField001(BigDecimal wireField001) { this.wireField001 = wireField001; }

    public Double getWireField002() { return wireField002; }
    public void setWireField002(Double wireField002) { this.wireField002 = wireField002; }

    public Integer getWireField003() { return wireField003; }
    public void setWireField003(Integer wireField003) { this.wireField003 = wireField003; }

    public String getWireField004() { return wireField004; }
    public void setWireField004(String wireField004) { this.wireField004 = wireField004; }

    public Long getWireField005() { return wireField005; }
    public void setWireField005(Long wireField005) { this.wireField005 = wireField005; }

    public Boolean getWireField006() { return wireField006; }
    public void setWireField006(Boolean wireField006) { this.wireField006 = wireField006; }

    public Integer getWireField007() { return wireField007; }
    public void setWireField007(Integer wireField007) { this.wireField007 = wireField007; }

    @Override
    public String toString() {
        return "WireDto024{" +
            "wireField000=" + wireField000 + ", " +
            "wireField001=" + wireField001 + ", " +
            "wireField002=" + wireField002 + ", " +
            "wireField003=" + wireField003 + ", " +
            "wireField004=" + wireField004 + ", " +
            "}";
    }
}
