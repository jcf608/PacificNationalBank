package com.pnb.hold;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * HoldDto036 — Data Transfer Object for hold operations.
 * Variant 36 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HoldDto036 {

    @JsonProperty("holdField000")
    private Boolean holdField000;

    @JsonProperty("holdField001")
    private Boolean holdField001;

    @JsonProperty("holdField002")
    private Integer holdField002;

    @JsonProperty("holdField003")
    private Boolean holdField003;

    @JsonProperty("holdField004")
    private Long holdField004;

    @JsonProperty("holdField005")
    private Double holdField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("holdField006")
    private BigDecimal holdField006;

    @JsonProperty("holdField007")
    private LocalDate holdField007;

    public HoldDto036() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final HoldDto036 instance = new HoldDto036();

        public Builder holdField000(Boolean val) { instance.holdField000 = val; return this; }
        public Builder holdField001(Boolean val) { instance.holdField001 = val; return this; }
        public Builder holdField002(Integer val) { instance.holdField002 = val; return this; }
        public Builder holdField003(Boolean val) { instance.holdField003 = val; return this; }
        public Builder holdField004(Long val) { instance.holdField004 = val; return this; }
        public Builder holdField005(Double val) { instance.holdField005 = val; return this; }
        public Builder holdField006(BigDecimal val) { instance.holdField006 = val; return this; }
        public Builder holdField007(LocalDate val) { instance.holdField007 = val; return this; }
        public HoldDto036 build() { return instance; }
    }

    public Boolean getHoldField000() { return holdField000; }
    public void setHoldField000(Boolean holdField000) { this.holdField000 = holdField000; }

    public Boolean getHoldField001() { return holdField001; }
    public void setHoldField001(Boolean holdField001) { this.holdField001 = holdField001; }

    public Integer getHoldField002() { return holdField002; }
    public void setHoldField002(Integer holdField002) { this.holdField002 = holdField002; }

    public Boolean getHoldField003() { return holdField003; }
    public void setHoldField003(Boolean holdField003) { this.holdField003 = holdField003; }

    public Long getHoldField004() { return holdField004; }
    public void setHoldField004(Long holdField004) { this.holdField004 = holdField004; }

    public Double getHoldField005() { return holdField005; }
    public void setHoldField005(Double holdField005) { this.holdField005 = holdField005; }

    public BigDecimal getHoldField006() { return holdField006; }
    public void setHoldField006(BigDecimal holdField006) { this.holdField006 = holdField006; }

    public LocalDate getHoldField007() { return holdField007; }
    public void setHoldField007(LocalDate holdField007) { this.holdField007 = holdField007; }

    @Override
    public String toString() {
        return "HoldDto036{" +
            "holdField000=" + holdField000 + ", " +
            "holdField001=" + holdField001 + ", " +
            "holdField002=" + holdField002 + ", " +
            "holdField003=" + holdField003 + ", " +
            "holdField004=" + holdField004 + ", " +
            "}";
    }
}
