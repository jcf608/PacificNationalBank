package com.pnb.hold;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * HoldDto025 — Data Transfer Object for hold operations.
 * Variant 25 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HoldDto025 {

    @JsonProperty("holdField000")
    private Boolean holdField000;

    @DecimalMin(value = "0.00")
    @JsonProperty("holdField001")
    private BigDecimal holdField001;

    @JsonProperty("holdField002")
    private Double holdField002;

    @Size(max = 100)
    @JsonProperty("holdField003")
    private String holdField003;

    @JsonProperty("holdField004")
    private Double holdField004;

    @JsonProperty("holdField005")
    private LocalDate holdField005;

    @JsonProperty("holdField006")
    private LocalDate holdField006;

    @JsonProperty("holdField007")
    private Double holdField007;

    @Size(max = 60)
    @JsonProperty("holdField008")
    private String holdField008;

    public HoldDto025() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final HoldDto025 instance = new HoldDto025();

        public Builder holdField000(Boolean val) { instance.holdField000 = val; return this; }
        public Builder holdField001(BigDecimal val) { instance.holdField001 = val; return this; }
        public Builder holdField002(Double val) { instance.holdField002 = val; return this; }
        public Builder holdField003(String val) { instance.holdField003 = val; return this; }
        public Builder holdField004(Double val) { instance.holdField004 = val; return this; }
        public Builder holdField005(LocalDate val) { instance.holdField005 = val; return this; }
        public Builder holdField006(LocalDate val) { instance.holdField006 = val; return this; }
        public Builder holdField007(Double val) { instance.holdField007 = val; return this; }
        public Builder holdField008(String val) { instance.holdField008 = val; return this; }
        public HoldDto025 build() { return instance; }
    }

    public Boolean getHoldField000() { return holdField000; }
    public void setHoldField000(Boolean holdField000) { this.holdField000 = holdField000; }

    public BigDecimal getHoldField001() { return holdField001; }
    public void setHoldField001(BigDecimal holdField001) { this.holdField001 = holdField001; }

    public Double getHoldField002() { return holdField002; }
    public void setHoldField002(Double holdField002) { this.holdField002 = holdField002; }

    public String getHoldField003() { return holdField003; }
    public void setHoldField003(String holdField003) { this.holdField003 = holdField003; }

    public Double getHoldField004() { return holdField004; }
    public void setHoldField004(Double holdField004) { this.holdField004 = holdField004; }

    public LocalDate getHoldField005() { return holdField005; }
    public void setHoldField005(LocalDate holdField005) { this.holdField005 = holdField005; }

    public LocalDate getHoldField006() { return holdField006; }
    public void setHoldField006(LocalDate holdField006) { this.holdField006 = holdField006; }

    public Double getHoldField007() { return holdField007; }
    public void setHoldField007(Double holdField007) { this.holdField007 = holdField007; }

    public String getHoldField008() { return holdField008; }
    public void setHoldField008(String holdField008) { this.holdField008 = holdField008; }

    @Override
    public String toString() {
        return "HoldDto025{" +
            "holdField000=" + holdField000 + ", " +
            "holdField001=" + holdField001 + ", " +
            "holdField002=" + holdField002 + ", " +
            "holdField003=" + holdField003 + ", " +
            "holdField004=" + holdField004 + ", " +
            "}";
    }
}
