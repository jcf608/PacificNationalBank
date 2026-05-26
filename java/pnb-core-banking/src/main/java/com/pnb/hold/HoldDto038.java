package com.pnb.hold;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * HoldDto038 — Data Transfer Object for hold operations.
 * Variant 38 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HoldDto038 {

    @Size(max = 200)
    @JsonProperty("holdField000")
    private String holdField000;

    @JsonProperty("holdField001")
    private Double holdField001;

    @JsonProperty("holdField002")
    private Boolean holdField002;

    @Size(max = 20)
    @JsonProperty("holdField003")
    private String holdField003;

    @JsonProperty("holdField004")
    private Long holdField004;

    @JsonProperty("holdField005")
    private LocalDate holdField005;

    @JsonProperty("holdField006")
    private LocalDate holdField006;

    @Size(max = 100)
    @JsonProperty("holdField007")
    private String holdField007;

    @Size(max = 100)
    @JsonProperty("holdField008")
    private String holdField008;

    @JsonProperty("holdField009")
    private Double holdField009;

    public HoldDto038() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final HoldDto038 instance = new HoldDto038();

        public Builder holdField000(String val) { instance.holdField000 = val; return this; }
        public Builder holdField001(Double val) { instance.holdField001 = val; return this; }
        public Builder holdField002(Boolean val) { instance.holdField002 = val; return this; }
        public Builder holdField003(String val) { instance.holdField003 = val; return this; }
        public Builder holdField004(Long val) { instance.holdField004 = val; return this; }
        public Builder holdField005(LocalDate val) { instance.holdField005 = val; return this; }
        public Builder holdField006(LocalDate val) { instance.holdField006 = val; return this; }
        public Builder holdField007(String val) { instance.holdField007 = val; return this; }
        public Builder holdField008(String val) { instance.holdField008 = val; return this; }
        public Builder holdField009(Double val) { instance.holdField009 = val; return this; }
        public HoldDto038 build() { return instance; }
    }

    public String getHoldField000() { return holdField000; }
    public void setHoldField000(String holdField000) { this.holdField000 = holdField000; }

    public Double getHoldField001() { return holdField001; }
    public void setHoldField001(Double holdField001) { this.holdField001 = holdField001; }

    public Boolean getHoldField002() { return holdField002; }
    public void setHoldField002(Boolean holdField002) { this.holdField002 = holdField002; }

    public String getHoldField003() { return holdField003; }
    public void setHoldField003(String holdField003) { this.holdField003 = holdField003; }

    public Long getHoldField004() { return holdField004; }
    public void setHoldField004(Long holdField004) { this.holdField004 = holdField004; }

    public LocalDate getHoldField005() { return holdField005; }
    public void setHoldField005(LocalDate holdField005) { this.holdField005 = holdField005; }

    public LocalDate getHoldField006() { return holdField006; }
    public void setHoldField006(LocalDate holdField006) { this.holdField006 = holdField006; }

    public String getHoldField007() { return holdField007; }
    public void setHoldField007(String holdField007) { this.holdField007 = holdField007; }

    public String getHoldField008() { return holdField008; }
    public void setHoldField008(String holdField008) { this.holdField008 = holdField008; }

    public Double getHoldField009() { return holdField009; }
    public void setHoldField009(Double holdField009) { this.holdField009 = holdField009; }

    @Override
    public String toString() {
        return "HoldDto038{" +
            "holdField000=" + holdField000 + ", " +
            "holdField001=" + holdField001 + ", " +
            "holdField002=" + holdField002 + ", " +
            "holdField003=" + holdField003 + ", " +
            "holdField004=" + holdField004 + ", " +
            "}";
    }
}
