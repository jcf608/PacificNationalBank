package com.pnb.hold;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * HoldDto041 — Data Transfer Object for hold operations.
 * Variant 41 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HoldDto041 {

    @Size(max = 40)
    @JsonProperty("holdField000")
    private String holdField000;

    @JsonProperty("holdField001")
    private Boolean holdField001;

    @JsonProperty("holdField002")
    private Integer holdField002;

    @DecimalMin(value = "0.00")
    @JsonProperty("holdField003")
    private BigDecimal holdField003;

    @JsonProperty("holdField004")
    private Long holdField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("holdField005")
    private BigDecimal holdField005;

    @JsonProperty("holdField006")
    private Double holdField006;

    @JsonProperty("holdField007")
    private Boolean holdField007;

    @JsonProperty("holdField008")
    private Boolean holdField008;

    @JsonProperty("holdField009")
    private Double holdField009;

    @JsonProperty("holdField010")
    private Integer holdField010;

    @Size(max = 100)
    @JsonProperty("holdField011")
    private String holdField011;

    @JsonProperty("holdField012")
    private LocalDate holdField012;

    public HoldDto041() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final HoldDto041 instance = new HoldDto041();

        public Builder holdField000(String val) { instance.holdField000 = val; return this; }
        public Builder holdField001(Boolean val) { instance.holdField001 = val; return this; }
        public Builder holdField002(Integer val) { instance.holdField002 = val; return this; }
        public Builder holdField003(BigDecimal val) { instance.holdField003 = val; return this; }
        public Builder holdField004(Long val) { instance.holdField004 = val; return this; }
        public Builder holdField005(BigDecimal val) { instance.holdField005 = val; return this; }
        public Builder holdField006(Double val) { instance.holdField006 = val; return this; }
        public Builder holdField007(Boolean val) { instance.holdField007 = val; return this; }
        public Builder holdField008(Boolean val) { instance.holdField008 = val; return this; }
        public Builder holdField009(Double val) { instance.holdField009 = val; return this; }
        public Builder holdField010(Integer val) { instance.holdField010 = val; return this; }
        public Builder holdField011(String val) { instance.holdField011 = val; return this; }
        public Builder holdField012(LocalDate val) { instance.holdField012 = val; return this; }
        public HoldDto041 build() { return instance; }
    }

    public String getHoldField000() { return holdField000; }
    public void setHoldField000(String holdField000) { this.holdField000 = holdField000; }

    public Boolean getHoldField001() { return holdField001; }
    public void setHoldField001(Boolean holdField001) { this.holdField001 = holdField001; }

    public Integer getHoldField002() { return holdField002; }
    public void setHoldField002(Integer holdField002) { this.holdField002 = holdField002; }

    public BigDecimal getHoldField003() { return holdField003; }
    public void setHoldField003(BigDecimal holdField003) { this.holdField003 = holdField003; }

    public Long getHoldField004() { return holdField004; }
    public void setHoldField004(Long holdField004) { this.holdField004 = holdField004; }

    public BigDecimal getHoldField005() { return holdField005; }
    public void setHoldField005(BigDecimal holdField005) { this.holdField005 = holdField005; }

    public Double getHoldField006() { return holdField006; }
    public void setHoldField006(Double holdField006) { this.holdField006 = holdField006; }

    public Boolean getHoldField007() { return holdField007; }
    public void setHoldField007(Boolean holdField007) { this.holdField007 = holdField007; }

    public Boolean getHoldField008() { return holdField008; }
    public void setHoldField008(Boolean holdField008) { this.holdField008 = holdField008; }

    public Double getHoldField009() { return holdField009; }
    public void setHoldField009(Double holdField009) { this.holdField009 = holdField009; }

    public Integer getHoldField010() { return holdField010; }
    public void setHoldField010(Integer holdField010) { this.holdField010 = holdField010; }

    public String getHoldField011() { return holdField011; }
    public void setHoldField011(String holdField011) { this.holdField011 = holdField011; }

    public LocalDate getHoldField012() { return holdField012; }
    public void setHoldField012(LocalDate holdField012) { this.holdField012 = holdField012; }

    @Override
    public String toString() {
        return "HoldDto041{" +
            "holdField000=" + holdField000 + ", " +
            "holdField001=" + holdField001 + ", " +
            "holdField002=" + holdField002 + ", " +
            "holdField003=" + holdField003 + ", " +
            "holdField004=" + holdField004 + ", " +
            "}";
    }
}
