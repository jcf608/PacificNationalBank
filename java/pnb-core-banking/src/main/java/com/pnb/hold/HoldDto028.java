package com.pnb.hold;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * HoldDto028 — Data Transfer Object for hold operations.
 * Variant 28 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HoldDto028 {

    @JsonProperty("holdField000")
    private Double holdField000;

    @JsonProperty("holdField001")
    private Integer holdField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("holdField002")
    private BigDecimal holdField002;

    @JsonProperty("holdField003")
    private Boolean holdField003;

    @Size(max = 60)
    @JsonProperty("holdField004")
    private String holdField004;

    @JsonProperty("holdField005")
    private LocalDate holdField005;

    @JsonProperty("holdField006")
    private Boolean holdField006;

    @JsonProperty("holdField007")
    private Long holdField007;

    @Size(max = 20)
    @JsonProperty("holdField008")
    private String holdField008;

    @JsonProperty("holdField009")
    private Long holdField009;

    @JsonProperty("holdField010")
    private Integer holdField010;

    @JsonProperty("holdField011")
    private Integer holdField011;

    public HoldDto028() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final HoldDto028 instance = new HoldDto028();

        public Builder holdField000(Double val) { instance.holdField000 = val; return this; }
        public Builder holdField001(Integer val) { instance.holdField001 = val; return this; }
        public Builder holdField002(BigDecimal val) { instance.holdField002 = val; return this; }
        public Builder holdField003(Boolean val) { instance.holdField003 = val; return this; }
        public Builder holdField004(String val) { instance.holdField004 = val; return this; }
        public Builder holdField005(LocalDate val) { instance.holdField005 = val; return this; }
        public Builder holdField006(Boolean val) { instance.holdField006 = val; return this; }
        public Builder holdField007(Long val) { instance.holdField007 = val; return this; }
        public Builder holdField008(String val) { instance.holdField008 = val; return this; }
        public Builder holdField009(Long val) { instance.holdField009 = val; return this; }
        public Builder holdField010(Integer val) { instance.holdField010 = val; return this; }
        public Builder holdField011(Integer val) { instance.holdField011 = val; return this; }
        public HoldDto028 build() { return instance; }
    }

    public Double getHoldField000() { return holdField000; }
    public void setHoldField000(Double holdField000) { this.holdField000 = holdField000; }

    public Integer getHoldField001() { return holdField001; }
    public void setHoldField001(Integer holdField001) { this.holdField001 = holdField001; }

    public BigDecimal getHoldField002() { return holdField002; }
    public void setHoldField002(BigDecimal holdField002) { this.holdField002 = holdField002; }

    public Boolean getHoldField003() { return holdField003; }
    public void setHoldField003(Boolean holdField003) { this.holdField003 = holdField003; }

    public String getHoldField004() { return holdField004; }
    public void setHoldField004(String holdField004) { this.holdField004 = holdField004; }

    public LocalDate getHoldField005() { return holdField005; }
    public void setHoldField005(LocalDate holdField005) { this.holdField005 = holdField005; }

    public Boolean getHoldField006() { return holdField006; }
    public void setHoldField006(Boolean holdField006) { this.holdField006 = holdField006; }

    public Long getHoldField007() { return holdField007; }
    public void setHoldField007(Long holdField007) { this.holdField007 = holdField007; }

    public String getHoldField008() { return holdField008; }
    public void setHoldField008(String holdField008) { this.holdField008 = holdField008; }

    public Long getHoldField009() { return holdField009; }
    public void setHoldField009(Long holdField009) { this.holdField009 = holdField009; }

    public Integer getHoldField010() { return holdField010; }
    public void setHoldField010(Integer holdField010) { this.holdField010 = holdField010; }

    public Integer getHoldField011() { return holdField011; }
    public void setHoldField011(Integer holdField011) { this.holdField011 = holdField011; }

    @Override
    public String toString() {
        return "HoldDto028{" +
            "holdField000=" + holdField000 + ", " +
            "holdField001=" + holdField001 + ", " +
            "holdField002=" + holdField002 + ", " +
            "holdField003=" + holdField003 + ", " +
            "holdField004=" + holdField004 + ", " +
            "}";
    }
}
