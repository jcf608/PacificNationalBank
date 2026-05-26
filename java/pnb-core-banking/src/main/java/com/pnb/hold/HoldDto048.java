package com.pnb.hold;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * HoldDto048 — Data Transfer Object for hold operations.
 * Variant 48 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HoldDto048 {

    @JsonProperty("holdField000")
    private Long holdField000;

    @JsonProperty("holdField001")
    private Boolean holdField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("holdField002")
    private BigDecimal holdField002;

    @DecimalMin(value = "0.00")
    @JsonProperty("holdField003")
    private BigDecimal holdField003;

    @JsonProperty("holdField004")
    private Long holdField004;

    @JsonProperty("holdField005")
    private Integer holdField005;

    @JsonProperty("holdField006")
    private Integer holdField006;

    @Size(max = 60)
    @JsonProperty("holdField007")
    private String holdField007;

    public HoldDto048() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final HoldDto048 instance = new HoldDto048();

        public Builder holdField000(Long val) { instance.holdField000 = val; return this; }
        public Builder holdField001(Boolean val) { instance.holdField001 = val; return this; }
        public Builder holdField002(BigDecimal val) { instance.holdField002 = val; return this; }
        public Builder holdField003(BigDecimal val) { instance.holdField003 = val; return this; }
        public Builder holdField004(Long val) { instance.holdField004 = val; return this; }
        public Builder holdField005(Integer val) { instance.holdField005 = val; return this; }
        public Builder holdField006(Integer val) { instance.holdField006 = val; return this; }
        public Builder holdField007(String val) { instance.holdField007 = val; return this; }
        public HoldDto048 build() { return instance; }
    }

    public Long getHoldField000() { return holdField000; }
    public void setHoldField000(Long holdField000) { this.holdField000 = holdField000; }

    public Boolean getHoldField001() { return holdField001; }
    public void setHoldField001(Boolean holdField001) { this.holdField001 = holdField001; }

    public BigDecimal getHoldField002() { return holdField002; }
    public void setHoldField002(BigDecimal holdField002) { this.holdField002 = holdField002; }

    public BigDecimal getHoldField003() { return holdField003; }
    public void setHoldField003(BigDecimal holdField003) { this.holdField003 = holdField003; }

    public Long getHoldField004() { return holdField004; }
    public void setHoldField004(Long holdField004) { this.holdField004 = holdField004; }

    public Integer getHoldField005() { return holdField005; }
    public void setHoldField005(Integer holdField005) { this.holdField005 = holdField005; }

    public Integer getHoldField006() { return holdField006; }
    public void setHoldField006(Integer holdField006) { this.holdField006 = holdField006; }

    public String getHoldField007() { return holdField007; }
    public void setHoldField007(String holdField007) { this.holdField007 = holdField007; }

    @Override
    public String toString() {
        return "HoldDto048{" +
            "holdField000=" + holdField000 + ", " +
            "holdField001=" + holdField001 + ", " +
            "holdField002=" + holdField002 + ", " +
            "holdField003=" + holdField003 + ", " +
            "holdField004=" + holdField004 + ", " +
            "}";
    }
}
