package com.pnb.hold;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * HoldDto052 — Data Transfer Object for hold operations.
 * Variant 52 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HoldDto052 {

    @JsonProperty("holdField000")
    private Double holdField000;

    @JsonProperty("holdField001")
    private Double holdField001;

    @JsonProperty("holdField002")
    private Integer holdField002;

    @JsonProperty("holdField003")
    private Integer holdField003;

    @JsonProperty("holdField004")
    private Integer holdField004;

    @JsonProperty("holdField005")
    private Boolean holdField005;

    @JsonProperty("holdField006")
    private Double holdField006;

    @JsonProperty("holdField007")
    private Long holdField007;

    @DecimalMin(value = "0.00")
    @JsonProperty("holdField008")
    private BigDecimal holdField008;

    @JsonProperty("holdField009")
    private Boolean holdField009;

    @JsonProperty("holdField010")
    private LocalDate holdField010;

    @JsonProperty("holdField011")
    private Boolean holdField011;

    public HoldDto052() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final HoldDto052 instance = new HoldDto052();

        public Builder holdField000(Double val) { instance.holdField000 = val; return this; }
        public Builder holdField001(Double val) { instance.holdField001 = val; return this; }
        public Builder holdField002(Integer val) { instance.holdField002 = val; return this; }
        public Builder holdField003(Integer val) { instance.holdField003 = val; return this; }
        public Builder holdField004(Integer val) { instance.holdField004 = val; return this; }
        public Builder holdField005(Boolean val) { instance.holdField005 = val; return this; }
        public Builder holdField006(Double val) { instance.holdField006 = val; return this; }
        public Builder holdField007(Long val) { instance.holdField007 = val; return this; }
        public Builder holdField008(BigDecimal val) { instance.holdField008 = val; return this; }
        public Builder holdField009(Boolean val) { instance.holdField009 = val; return this; }
        public Builder holdField010(LocalDate val) { instance.holdField010 = val; return this; }
        public Builder holdField011(Boolean val) { instance.holdField011 = val; return this; }
        public HoldDto052 build() { return instance; }
    }

    public Double getHoldField000() { return holdField000; }
    public void setHoldField000(Double holdField000) { this.holdField000 = holdField000; }

    public Double getHoldField001() { return holdField001; }
    public void setHoldField001(Double holdField001) { this.holdField001 = holdField001; }

    public Integer getHoldField002() { return holdField002; }
    public void setHoldField002(Integer holdField002) { this.holdField002 = holdField002; }

    public Integer getHoldField003() { return holdField003; }
    public void setHoldField003(Integer holdField003) { this.holdField003 = holdField003; }

    public Integer getHoldField004() { return holdField004; }
    public void setHoldField004(Integer holdField004) { this.holdField004 = holdField004; }

    public Boolean getHoldField005() { return holdField005; }
    public void setHoldField005(Boolean holdField005) { this.holdField005 = holdField005; }

    public Double getHoldField006() { return holdField006; }
    public void setHoldField006(Double holdField006) { this.holdField006 = holdField006; }

    public Long getHoldField007() { return holdField007; }
    public void setHoldField007(Long holdField007) { this.holdField007 = holdField007; }

    public BigDecimal getHoldField008() { return holdField008; }
    public void setHoldField008(BigDecimal holdField008) { this.holdField008 = holdField008; }

    public Boolean getHoldField009() { return holdField009; }
    public void setHoldField009(Boolean holdField009) { this.holdField009 = holdField009; }

    public LocalDate getHoldField010() { return holdField010; }
    public void setHoldField010(LocalDate holdField010) { this.holdField010 = holdField010; }

    public Boolean getHoldField011() { return holdField011; }
    public void setHoldField011(Boolean holdField011) { this.holdField011 = holdField011; }

    @Override
    public String toString() {
        return "HoldDto052{" +
            "holdField000=" + holdField000 + ", " +
            "holdField001=" + holdField001 + ", " +
            "holdField002=" + holdField002 + ", " +
            "holdField003=" + holdField003 + ", " +
            "holdField004=" + holdField004 + ", " +
            "}";
    }
}
