package com.pnb.hold;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * HoldDto056 — Data Transfer Object for hold operations.
 * Variant 56 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HoldDto056 {

    @JsonProperty("holdField000")
    private Long holdField000;

    @JsonProperty("holdField001")
    private Long holdField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("holdField002")
    private BigDecimal holdField002;

    @JsonProperty("holdField003")
    private Long holdField003;

    @JsonProperty("holdField004")
    private Integer holdField004;

    @JsonProperty("holdField005")
    private Integer holdField005;

    @JsonProperty("holdField006")
    private Long holdField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("holdField007")
    private BigDecimal holdField007;

    @JsonProperty("holdField008")
    private Boolean holdField008;

    @JsonProperty("holdField009")
    private Double holdField009;

    @JsonProperty("holdField010")
    private Integer holdField010;

    @JsonProperty("holdField011")
    private Double holdField011;

    @JsonProperty("holdField012")
    private Integer holdField012;

    @DecimalMin(value = "0.00")
    @JsonProperty("holdField013")
    private BigDecimal holdField013;

    @Size(max = 60)
    @JsonProperty("holdField014")
    private String holdField014;

    @JsonProperty("holdField015")
    private Double holdField015;

    public HoldDto056() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final HoldDto056 instance = new HoldDto056();

        public Builder holdField000(Long val) { instance.holdField000 = val; return this; }
        public Builder holdField001(Long val) { instance.holdField001 = val; return this; }
        public Builder holdField002(BigDecimal val) { instance.holdField002 = val; return this; }
        public Builder holdField003(Long val) { instance.holdField003 = val; return this; }
        public Builder holdField004(Integer val) { instance.holdField004 = val; return this; }
        public Builder holdField005(Integer val) { instance.holdField005 = val; return this; }
        public Builder holdField006(Long val) { instance.holdField006 = val; return this; }
        public Builder holdField007(BigDecimal val) { instance.holdField007 = val; return this; }
        public Builder holdField008(Boolean val) { instance.holdField008 = val; return this; }
        public Builder holdField009(Double val) { instance.holdField009 = val; return this; }
        public Builder holdField010(Integer val) { instance.holdField010 = val; return this; }
        public Builder holdField011(Double val) { instance.holdField011 = val; return this; }
        public Builder holdField012(Integer val) { instance.holdField012 = val; return this; }
        public Builder holdField013(BigDecimal val) { instance.holdField013 = val; return this; }
        public Builder holdField014(String val) { instance.holdField014 = val; return this; }
        public Builder holdField015(Double val) { instance.holdField015 = val; return this; }
        public HoldDto056 build() { return instance; }
    }

    public Long getHoldField000() { return holdField000; }
    public void setHoldField000(Long holdField000) { this.holdField000 = holdField000; }

    public Long getHoldField001() { return holdField001; }
    public void setHoldField001(Long holdField001) { this.holdField001 = holdField001; }

    public BigDecimal getHoldField002() { return holdField002; }
    public void setHoldField002(BigDecimal holdField002) { this.holdField002 = holdField002; }

    public Long getHoldField003() { return holdField003; }
    public void setHoldField003(Long holdField003) { this.holdField003 = holdField003; }

    public Integer getHoldField004() { return holdField004; }
    public void setHoldField004(Integer holdField004) { this.holdField004 = holdField004; }

    public Integer getHoldField005() { return holdField005; }
    public void setHoldField005(Integer holdField005) { this.holdField005 = holdField005; }

    public Long getHoldField006() { return holdField006; }
    public void setHoldField006(Long holdField006) { this.holdField006 = holdField006; }

    public BigDecimal getHoldField007() { return holdField007; }
    public void setHoldField007(BigDecimal holdField007) { this.holdField007 = holdField007; }

    public Boolean getHoldField008() { return holdField008; }
    public void setHoldField008(Boolean holdField008) { this.holdField008 = holdField008; }

    public Double getHoldField009() { return holdField009; }
    public void setHoldField009(Double holdField009) { this.holdField009 = holdField009; }

    public Integer getHoldField010() { return holdField010; }
    public void setHoldField010(Integer holdField010) { this.holdField010 = holdField010; }

    public Double getHoldField011() { return holdField011; }
    public void setHoldField011(Double holdField011) { this.holdField011 = holdField011; }

    public Integer getHoldField012() { return holdField012; }
    public void setHoldField012(Integer holdField012) { this.holdField012 = holdField012; }

    public BigDecimal getHoldField013() { return holdField013; }
    public void setHoldField013(BigDecimal holdField013) { this.holdField013 = holdField013; }

    public String getHoldField014() { return holdField014; }
    public void setHoldField014(String holdField014) { this.holdField014 = holdField014; }

    public Double getHoldField015() { return holdField015; }
    public void setHoldField015(Double holdField015) { this.holdField015 = holdField015; }

    @Override
    public String toString() {
        return "HoldDto056{" +
            "holdField000=" + holdField000 + ", " +
            "holdField001=" + holdField001 + ", " +
            "holdField002=" + holdField002 + ", " +
            "holdField003=" + holdField003 + ", " +
            "holdField004=" + holdField004 + ", " +
            "}";
    }
}
