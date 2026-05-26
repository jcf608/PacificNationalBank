package com.pnb.hold;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * HoldDto039 — Data Transfer Object for hold operations.
 * Variant 39 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HoldDto039 {

    @JsonProperty("holdField000")
    private Integer holdField000;

    @DecimalMin(value = "0.00")
    @JsonProperty("holdField001")
    private BigDecimal holdField001;

    @JsonProperty("holdField002")
    private LocalDate holdField002;

    @JsonProperty("holdField003")
    private Integer holdField003;

    @JsonProperty("holdField004")
    private Boolean holdField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("holdField005")
    private BigDecimal holdField005;

    @JsonProperty("holdField006")
    private Boolean holdField006;

    @JsonProperty("holdField007")
    private Integer holdField007;

    @DecimalMin(value = "0.00")
    @JsonProperty("holdField008")
    private BigDecimal holdField008;

    @JsonProperty("holdField009")
    private Long holdField009;

    @JsonProperty("holdField010")
    private Boolean holdField010;

    public HoldDto039() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final HoldDto039 instance = new HoldDto039();

        public Builder holdField000(Integer val) { instance.holdField000 = val; return this; }
        public Builder holdField001(BigDecimal val) { instance.holdField001 = val; return this; }
        public Builder holdField002(LocalDate val) { instance.holdField002 = val; return this; }
        public Builder holdField003(Integer val) { instance.holdField003 = val; return this; }
        public Builder holdField004(Boolean val) { instance.holdField004 = val; return this; }
        public Builder holdField005(BigDecimal val) { instance.holdField005 = val; return this; }
        public Builder holdField006(Boolean val) { instance.holdField006 = val; return this; }
        public Builder holdField007(Integer val) { instance.holdField007 = val; return this; }
        public Builder holdField008(BigDecimal val) { instance.holdField008 = val; return this; }
        public Builder holdField009(Long val) { instance.holdField009 = val; return this; }
        public Builder holdField010(Boolean val) { instance.holdField010 = val; return this; }
        public HoldDto039 build() { return instance; }
    }

    public Integer getHoldField000() { return holdField000; }
    public void setHoldField000(Integer holdField000) { this.holdField000 = holdField000; }

    public BigDecimal getHoldField001() { return holdField001; }
    public void setHoldField001(BigDecimal holdField001) { this.holdField001 = holdField001; }

    public LocalDate getHoldField002() { return holdField002; }
    public void setHoldField002(LocalDate holdField002) { this.holdField002 = holdField002; }

    public Integer getHoldField003() { return holdField003; }
    public void setHoldField003(Integer holdField003) { this.holdField003 = holdField003; }

    public Boolean getHoldField004() { return holdField004; }
    public void setHoldField004(Boolean holdField004) { this.holdField004 = holdField004; }

    public BigDecimal getHoldField005() { return holdField005; }
    public void setHoldField005(BigDecimal holdField005) { this.holdField005 = holdField005; }

    public Boolean getHoldField006() { return holdField006; }
    public void setHoldField006(Boolean holdField006) { this.holdField006 = holdField006; }

    public Integer getHoldField007() { return holdField007; }
    public void setHoldField007(Integer holdField007) { this.holdField007 = holdField007; }

    public BigDecimal getHoldField008() { return holdField008; }
    public void setHoldField008(BigDecimal holdField008) { this.holdField008 = holdField008; }

    public Long getHoldField009() { return holdField009; }
    public void setHoldField009(Long holdField009) { this.holdField009 = holdField009; }

    public Boolean getHoldField010() { return holdField010; }
    public void setHoldField010(Boolean holdField010) { this.holdField010 = holdField010; }

    @Override
    public String toString() {
        return "HoldDto039{" +
            "holdField000=" + holdField000 + ", " +
            "holdField001=" + holdField001 + ", " +
            "holdField002=" + holdField002 + ", " +
            "holdField003=" + holdField003 + ", " +
            "holdField004=" + holdField004 + ", " +
            "}";
    }
}
