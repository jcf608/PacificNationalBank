package com.pnb.hold;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * HoldDto037 — Data Transfer Object for hold operations.
 * Variant 37 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HoldDto037 {

    @JsonProperty("holdField000")
    private Double holdField000;

    @JsonProperty("holdField001")
    private Long holdField001;

    @JsonProperty("holdField002")
    private Boolean holdField002;

    @JsonProperty("holdField003")
    private Long holdField003;

    @JsonProperty("holdField004")
    private Integer holdField004;

    @JsonProperty("holdField005")
    private Boolean holdField005;

    @JsonProperty("holdField006")
    private Integer holdField006;

    @Size(max = 60)
    @JsonProperty("holdField007")
    private String holdField007;

    @JsonProperty("holdField008")
    private Double holdField008;

    public HoldDto037() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final HoldDto037 instance = new HoldDto037();

        public Builder holdField000(Double val) { instance.holdField000 = val; return this; }
        public Builder holdField001(Long val) { instance.holdField001 = val; return this; }
        public Builder holdField002(Boolean val) { instance.holdField002 = val; return this; }
        public Builder holdField003(Long val) { instance.holdField003 = val; return this; }
        public Builder holdField004(Integer val) { instance.holdField004 = val; return this; }
        public Builder holdField005(Boolean val) { instance.holdField005 = val; return this; }
        public Builder holdField006(Integer val) { instance.holdField006 = val; return this; }
        public Builder holdField007(String val) { instance.holdField007 = val; return this; }
        public Builder holdField008(Double val) { instance.holdField008 = val; return this; }
        public HoldDto037 build() { return instance; }
    }

    public Double getHoldField000() { return holdField000; }
    public void setHoldField000(Double holdField000) { this.holdField000 = holdField000; }

    public Long getHoldField001() { return holdField001; }
    public void setHoldField001(Long holdField001) { this.holdField001 = holdField001; }

    public Boolean getHoldField002() { return holdField002; }
    public void setHoldField002(Boolean holdField002) { this.holdField002 = holdField002; }

    public Long getHoldField003() { return holdField003; }
    public void setHoldField003(Long holdField003) { this.holdField003 = holdField003; }

    public Integer getHoldField004() { return holdField004; }
    public void setHoldField004(Integer holdField004) { this.holdField004 = holdField004; }

    public Boolean getHoldField005() { return holdField005; }
    public void setHoldField005(Boolean holdField005) { this.holdField005 = holdField005; }

    public Integer getHoldField006() { return holdField006; }
    public void setHoldField006(Integer holdField006) { this.holdField006 = holdField006; }

    public String getHoldField007() { return holdField007; }
    public void setHoldField007(String holdField007) { this.holdField007 = holdField007; }

    public Double getHoldField008() { return holdField008; }
    public void setHoldField008(Double holdField008) { this.holdField008 = holdField008; }

    @Override
    public String toString() {
        return "HoldDto037{" +
            "holdField000=" + holdField000 + ", " +
            "holdField001=" + holdField001 + ", " +
            "holdField002=" + holdField002 + ", " +
            "holdField003=" + holdField003 + ", " +
            "holdField004=" + holdField004 + ", " +
            "}";
    }
}
