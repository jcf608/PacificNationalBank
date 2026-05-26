package com.pnb.hold;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * HoldDto027 — Data Transfer Object for hold operations.
 * Variant 27 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HoldDto027 {

    @Size(max = 60)
    @JsonProperty("holdField000")
    private String holdField000;

    @JsonProperty("holdField001")
    private Double holdField001;

    @JsonProperty("holdField002")
    private LocalDate holdField002;

    @DecimalMin(value = "0.00")
    @JsonProperty("holdField003")
    private BigDecimal holdField003;

    @JsonProperty("holdField004")
    private LocalDate holdField004;

    @JsonProperty("holdField005")
    private LocalDate holdField005;

    @JsonProperty("holdField006")
    private LocalDate holdField006;

    @JsonProperty("holdField007")
    private Long holdField007;

    @JsonProperty("holdField008")
    private Boolean holdField008;

    @JsonProperty("holdField009")
    private Double holdField009;

    @JsonProperty("holdField010")
    private Double holdField010;

    public HoldDto027() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final HoldDto027 instance = new HoldDto027();

        public Builder holdField000(String val) { instance.holdField000 = val; return this; }
        public Builder holdField001(Double val) { instance.holdField001 = val; return this; }
        public Builder holdField002(LocalDate val) { instance.holdField002 = val; return this; }
        public Builder holdField003(BigDecimal val) { instance.holdField003 = val; return this; }
        public Builder holdField004(LocalDate val) { instance.holdField004 = val; return this; }
        public Builder holdField005(LocalDate val) { instance.holdField005 = val; return this; }
        public Builder holdField006(LocalDate val) { instance.holdField006 = val; return this; }
        public Builder holdField007(Long val) { instance.holdField007 = val; return this; }
        public Builder holdField008(Boolean val) { instance.holdField008 = val; return this; }
        public Builder holdField009(Double val) { instance.holdField009 = val; return this; }
        public Builder holdField010(Double val) { instance.holdField010 = val; return this; }
        public HoldDto027 build() { return instance; }
    }

    public String getHoldField000() { return holdField000; }
    public void setHoldField000(String holdField000) { this.holdField000 = holdField000; }

    public Double getHoldField001() { return holdField001; }
    public void setHoldField001(Double holdField001) { this.holdField001 = holdField001; }

    public LocalDate getHoldField002() { return holdField002; }
    public void setHoldField002(LocalDate holdField002) { this.holdField002 = holdField002; }

    public BigDecimal getHoldField003() { return holdField003; }
    public void setHoldField003(BigDecimal holdField003) { this.holdField003 = holdField003; }

    public LocalDate getHoldField004() { return holdField004; }
    public void setHoldField004(LocalDate holdField004) { this.holdField004 = holdField004; }

    public LocalDate getHoldField005() { return holdField005; }
    public void setHoldField005(LocalDate holdField005) { this.holdField005 = holdField005; }

    public LocalDate getHoldField006() { return holdField006; }
    public void setHoldField006(LocalDate holdField006) { this.holdField006 = holdField006; }

    public Long getHoldField007() { return holdField007; }
    public void setHoldField007(Long holdField007) { this.holdField007 = holdField007; }

    public Boolean getHoldField008() { return holdField008; }
    public void setHoldField008(Boolean holdField008) { this.holdField008 = holdField008; }

    public Double getHoldField009() { return holdField009; }
    public void setHoldField009(Double holdField009) { this.holdField009 = holdField009; }

    public Double getHoldField010() { return holdField010; }
    public void setHoldField010(Double holdField010) { this.holdField010 = holdField010; }

    @Override
    public String toString() {
        return "HoldDto027{" +
            "holdField000=" + holdField000 + ", " +
            "holdField001=" + holdField001 + ", " +
            "holdField002=" + holdField002 + ", " +
            "holdField003=" + holdField003 + ", " +
            "holdField004=" + holdField004 + ", " +
            "}";
    }
}
