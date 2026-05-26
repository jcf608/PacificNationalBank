package com.pnb.hold;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * HoldDto026 — Data Transfer Object for hold operations.
 * Variant 26 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HoldDto026 {

    @Size(max = 40)
    @JsonProperty("holdField000")
    private String holdField000;

    @JsonProperty("holdField001")
    private LocalDate holdField001;

    @Size(max = 40)
    @JsonProperty("holdField002")
    private String holdField002;

    @JsonProperty("holdField003")
    private Double holdField003;

    @JsonProperty("holdField004")
    private Integer holdField004;

    @JsonProperty("holdField005")
    private Double holdField005;

    @JsonProperty("holdField006")
    private Double holdField006;

    @JsonProperty("holdField007")
    private Boolean holdField007;

    @JsonProperty("holdField008")
    private Boolean holdField008;

    @JsonProperty("holdField009")
    private LocalDate holdField009;

    public HoldDto026() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final HoldDto026 instance = new HoldDto026();

        public Builder holdField000(String val) { instance.holdField000 = val; return this; }
        public Builder holdField001(LocalDate val) { instance.holdField001 = val; return this; }
        public Builder holdField002(String val) { instance.holdField002 = val; return this; }
        public Builder holdField003(Double val) { instance.holdField003 = val; return this; }
        public Builder holdField004(Integer val) { instance.holdField004 = val; return this; }
        public Builder holdField005(Double val) { instance.holdField005 = val; return this; }
        public Builder holdField006(Double val) { instance.holdField006 = val; return this; }
        public Builder holdField007(Boolean val) { instance.holdField007 = val; return this; }
        public Builder holdField008(Boolean val) { instance.holdField008 = val; return this; }
        public Builder holdField009(LocalDate val) { instance.holdField009 = val; return this; }
        public HoldDto026 build() { return instance; }
    }

    public String getHoldField000() { return holdField000; }
    public void setHoldField000(String holdField000) { this.holdField000 = holdField000; }

    public LocalDate getHoldField001() { return holdField001; }
    public void setHoldField001(LocalDate holdField001) { this.holdField001 = holdField001; }

    public String getHoldField002() { return holdField002; }
    public void setHoldField002(String holdField002) { this.holdField002 = holdField002; }

    public Double getHoldField003() { return holdField003; }
    public void setHoldField003(Double holdField003) { this.holdField003 = holdField003; }

    public Integer getHoldField004() { return holdField004; }
    public void setHoldField004(Integer holdField004) { this.holdField004 = holdField004; }

    public Double getHoldField005() { return holdField005; }
    public void setHoldField005(Double holdField005) { this.holdField005 = holdField005; }

    public Double getHoldField006() { return holdField006; }
    public void setHoldField006(Double holdField006) { this.holdField006 = holdField006; }

    public Boolean getHoldField007() { return holdField007; }
    public void setHoldField007(Boolean holdField007) { this.holdField007 = holdField007; }

    public Boolean getHoldField008() { return holdField008; }
    public void setHoldField008(Boolean holdField008) { this.holdField008 = holdField008; }

    public LocalDate getHoldField009() { return holdField009; }
    public void setHoldField009(LocalDate holdField009) { this.holdField009 = holdField009; }

    @Override
    public String toString() {
        return "HoldDto026{" +
            "holdField000=" + holdField000 + ", " +
            "holdField001=" + holdField001 + ", " +
            "holdField002=" + holdField002 + ", " +
            "holdField003=" + holdField003 + ", " +
            "holdField004=" + holdField004 + ", " +
            "}";
    }
}
