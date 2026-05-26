package com.pnb.hold;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * HoldDto050 — Data Transfer Object for hold operations.
 * Variant 50 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HoldDto050 {

    @JsonProperty("holdField000")
    private Boolean holdField000;

    @JsonProperty("holdField001")
    private Long holdField001;

    @Size(max = 60)
    @JsonProperty("holdField002")
    private String holdField002;

    @JsonProperty("holdField003")
    private Boolean holdField003;

    @DecimalMin(value = "0.00")
    @JsonProperty("holdField004")
    private BigDecimal holdField004;

    @JsonProperty("holdField005")
    private Integer holdField005;

    @JsonProperty("holdField006")
    private Double holdField006;

    @JsonProperty("holdField007")
    private Integer holdField007;

    @JsonProperty("holdField008")
    private Double holdField008;

    @JsonProperty("holdField009")
    private LocalDate holdField009;

    public HoldDto050() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final HoldDto050 instance = new HoldDto050();

        public Builder holdField000(Boolean val) { instance.holdField000 = val; return this; }
        public Builder holdField001(Long val) { instance.holdField001 = val; return this; }
        public Builder holdField002(String val) { instance.holdField002 = val; return this; }
        public Builder holdField003(Boolean val) { instance.holdField003 = val; return this; }
        public Builder holdField004(BigDecimal val) { instance.holdField004 = val; return this; }
        public Builder holdField005(Integer val) { instance.holdField005 = val; return this; }
        public Builder holdField006(Double val) { instance.holdField006 = val; return this; }
        public Builder holdField007(Integer val) { instance.holdField007 = val; return this; }
        public Builder holdField008(Double val) { instance.holdField008 = val; return this; }
        public Builder holdField009(LocalDate val) { instance.holdField009 = val; return this; }
        public HoldDto050 build() { return instance; }
    }

    public Boolean getHoldField000() { return holdField000; }
    public void setHoldField000(Boolean holdField000) { this.holdField000 = holdField000; }

    public Long getHoldField001() { return holdField001; }
    public void setHoldField001(Long holdField001) { this.holdField001 = holdField001; }

    public String getHoldField002() { return holdField002; }
    public void setHoldField002(String holdField002) { this.holdField002 = holdField002; }

    public Boolean getHoldField003() { return holdField003; }
    public void setHoldField003(Boolean holdField003) { this.holdField003 = holdField003; }

    public BigDecimal getHoldField004() { return holdField004; }
    public void setHoldField004(BigDecimal holdField004) { this.holdField004 = holdField004; }

    public Integer getHoldField005() { return holdField005; }
    public void setHoldField005(Integer holdField005) { this.holdField005 = holdField005; }

    public Double getHoldField006() { return holdField006; }
    public void setHoldField006(Double holdField006) { this.holdField006 = holdField006; }

    public Integer getHoldField007() { return holdField007; }
    public void setHoldField007(Integer holdField007) { this.holdField007 = holdField007; }

    public Double getHoldField008() { return holdField008; }
    public void setHoldField008(Double holdField008) { this.holdField008 = holdField008; }

    public LocalDate getHoldField009() { return holdField009; }
    public void setHoldField009(LocalDate holdField009) { this.holdField009 = holdField009; }

    @Override
    public String toString() {
        return "HoldDto050{" +
            "holdField000=" + holdField000 + ", " +
            "holdField001=" + holdField001 + ", " +
            "holdField002=" + holdField002 + ", " +
            "holdField003=" + holdField003 + ", " +
            "holdField004=" + holdField004 + ", " +
            "}";
    }
}
