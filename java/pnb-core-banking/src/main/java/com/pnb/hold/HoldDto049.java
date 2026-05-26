package com.pnb.hold;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * HoldDto049 — Data Transfer Object for hold operations.
 * Variant 49 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HoldDto049 {

    @DecimalMin(value = "0.00")
    @JsonProperty("holdField000")
    private BigDecimal holdField000;

    @JsonProperty("holdField001")
    private LocalDate holdField001;

    @JsonProperty("holdField002")
    private Boolean holdField002;

    @JsonProperty("holdField003")
    private Double holdField003;

    @JsonProperty("holdField004")
    private Double holdField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("holdField005")
    private BigDecimal holdField005;

    @JsonProperty("holdField006")
    private Integer holdField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("holdField007")
    private BigDecimal holdField007;

    @JsonProperty("holdField008")
    private Long holdField008;

    public HoldDto049() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final HoldDto049 instance = new HoldDto049();

        public Builder holdField000(BigDecimal val) { instance.holdField000 = val; return this; }
        public Builder holdField001(LocalDate val) { instance.holdField001 = val; return this; }
        public Builder holdField002(Boolean val) { instance.holdField002 = val; return this; }
        public Builder holdField003(Double val) { instance.holdField003 = val; return this; }
        public Builder holdField004(Double val) { instance.holdField004 = val; return this; }
        public Builder holdField005(BigDecimal val) { instance.holdField005 = val; return this; }
        public Builder holdField006(Integer val) { instance.holdField006 = val; return this; }
        public Builder holdField007(BigDecimal val) { instance.holdField007 = val; return this; }
        public Builder holdField008(Long val) { instance.holdField008 = val; return this; }
        public HoldDto049 build() { return instance; }
    }

    public BigDecimal getHoldField000() { return holdField000; }
    public void setHoldField000(BigDecimal holdField000) { this.holdField000 = holdField000; }

    public LocalDate getHoldField001() { return holdField001; }
    public void setHoldField001(LocalDate holdField001) { this.holdField001 = holdField001; }

    public Boolean getHoldField002() { return holdField002; }
    public void setHoldField002(Boolean holdField002) { this.holdField002 = holdField002; }

    public Double getHoldField003() { return holdField003; }
    public void setHoldField003(Double holdField003) { this.holdField003 = holdField003; }

    public Double getHoldField004() { return holdField004; }
    public void setHoldField004(Double holdField004) { this.holdField004 = holdField004; }

    public BigDecimal getHoldField005() { return holdField005; }
    public void setHoldField005(BigDecimal holdField005) { this.holdField005 = holdField005; }

    public Integer getHoldField006() { return holdField006; }
    public void setHoldField006(Integer holdField006) { this.holdField006 = holdField006; }

    public BigDecimal getHoldField007() { return holdField007; }
    public void setHoldField007(BigDecimal holdField007) { this.holdField007 = holdField007; }

    public Long getHoldField008() { return holdField008; }
    public void setHoldField008(Long holdField008) { this.holdField008 = holdField008; }

    @Override
    public String toString() {
        return "HoldDto049{" +
            "holdField000=" + holdField000 + ", " +
            "holdField001=" + holdField001 + ", " +
            "holdField002=" + holdField002 + ", " +
            "holdField003=" + holdField003 + ", " +
            "holdField004=" + holdField004 + ", " +
            "}";
    }
}
