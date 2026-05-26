package com.pnb.hold;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * HoldDto051 — Data Transfer Object for hold operations.
 * Variant 51 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HoldDto051 {

    @Size(max = 60)
    @JsonProperty("holdField000")
    private String holdField000;

    @JsonProperty("holdField001")
    private Integer holdField001;

    @JsonProperty("holdField002")
    private Boolean holdField002;

    @DecimalMin(value = "0.00")
    @JsonProperty("holdField003")
    private BigDecimal holdField003;

    @JsonProperty("holdField004")
    private Long holdField004;

    @JsonProperty("holdField005")
    private Boolean holdField005;

    @JsonProperty("holdField006")
    private Boolean holdField006;

    @JsonProperty("holdField007")
    private Double holdField007;

    @Size(max = 60)
    @JsonProperty("holdField008")
    private String holdField008;

    @JsonProperty("holdField009")
    private Integer holdField009;

    @JsonProperty("holdField010")
    private Long holdField010;

    public HoldDto051() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final HoldDto051 instance = new HoldDto051();

        public Builder holdField000(String val) { instance.holdField000 = val; return this; }
        public Builder holdField001(Integer val) { instance.holdField001 = val; return this; }
        public Builder holdField002(Boolean val) { instance.holdField002 = val; return this; }
        public Builder holdField003(BigDecimal val) { instance.holdField003 = val; return this; }
        public Builder holdField004(Long val) { instance.holdField004 = val; return this; }
        public Builder holdField005(Boolean val) { instance.holdField005 = val; return this; }
        public Builder holdField006(Boolean val) { instance.holdField006 = val; return this; }
        public Builder holdField007(Double val) { instance.holdField007 = val; return this; }
        public Builder holdField008(String val) { instance.holdField008 = val; return this; }
        public Builder holdField009(Integer val) { instance.holdField009 = val; return this; }
        public Builder holdField010(Long val) { instance.holdField010 = val; return this; }
        public HoldDto051 build() { return instance; }
    }

    public String getHoldField000() { return holdField000; }
    public void setHoldField000(String holdField000) { this.holdField000 = holdField000; }

    public Integer getHoldField001() { return holdField001; }
    public void setHoldField001(Integer holdField001) { this.holdField001 = holdField001; }

    public Boolean getHoldField002() { return holdField002; }
    public void setHoldField002(Boolean holdField002) { this.holdField002 = holdField002; }

    public BigDecimal getHoldField003() { return holdField003; }
    public void setHoldField003(BigDecimal holdField003) { this.holdField003 = holdField003; }

    public Long getHoldField004() { return holdField004; }
    public void setHoldField004(Long holdField004) { this.holdField004 = holdField004; }

    public Boolean getHoldField005() { return holdField005; }
    public void setHoldField005(Boolean holdField005) { this.holdField005 = holdField005; }

    public Boolean getHoldField006() { return holdField006; }
    public void setHoldField006(Boolean holdField006) { this.holdField006 = holdField006; }

    public Double getHoldField007() { return holdField007; }
    public void setHoldField007(Double holdField007) { this.holdField007 = holdField007; }

    public String getHoldField008() { return holdField008; }
    public void setHoldField008(String holdField008) { this.holdField008 = holdField008; }

    public Integer getHoldField009() { return holdField009; }
    public void setHoldField009(Integer holdField009) { this.holdField009 = holdField009; }

    public Long getHoldField010() { return holdField010; }
    public void setHoldField010(Long holdField010) { this.holdField010 = holdField010; }

    @Override
    public String toString() {
        return "HoldDto051{" +
            "holdField000=" + holdField000 + ", " +
            "holdField001=" + holdField001 + ", " +
            "holdField002=" + holdField002 + ", " +
            "holdField003=" + holdField003 + ", " +
            "holdField004=" + holdField004 + ", " +
            "}";
    }
}
