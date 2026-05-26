package com.pnb.hold;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * HoldDto055 — Data Transfer Object for hold operations.
 * Variant 55 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HoldDto055 {

    @JsonProperty("holdField000")
    private Boolean holdField000;

    @JsonProperty("holdField001")
    private LocalDate holdField001;

    @JsonProperty("holdField002")
    private Double holdField002;

    @JsonProperty("holdField003")
    private Boolean holdField003;

    @JsonProperty("holdField004")
    private Double holdField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("holdField005")
    private BigDecimal holdField005;

    @JsonProperty("holdField006")
    private Integer holdField006;

    @Size(max = 100)
    @JsonProperty("holdField007")
    private String holdField007;

    @JsonProperty("holdField008")
    private Integer holdField008;

    @JsonProperty("holdField009")
    private Long holdField009;

    @JsonProperty("holdField010")
    private Boolean holdField010;

    @JsonProperty("holdField011")
    private Long holdField011;

    @JsonProperty("holdField012")
    private Long holdField012;

    @DecimalMin(value = "0.00")
    @JsonProperty("holdField013")
    private BigDecimal holdField013;

    @Size(max = 40)
    @JsonProperty("holdField014")
    private String holdField014;

    public HoldDto055() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final HoldDto055 instance = new HoldDto055();

        public Builder holdField000(Boolean val) { instance.holdField000 = val; return this; }
        public Builder holdField001(LocalDate val) { instance.holdField001 = val; return this; }
        public Builder holdField002(Double val) { instance.holdField002 = val; return this; }
        public Builder holdField003(Boolean val) { instance.holdField003 = val; return this; }
        public Builder holdField004(Double val) { instance.holdField004 = val; return this; }
        public Builder holdField005(BigDecimal val) { instance.holdField005 = val; return this; }
        public Builder holdField006(Integer val) { instance.holdField006 = val; return this; }
        public Builder holdField007(String val) { instance.holdField007 = val; return this; }
        public Builder holdField008(Integer val) { instance.holdField008 = val; return this; }
        public Builder holdField009(Long val) { instance.holdField009 = val; return this; }
        public Builder holdField010(Boolean val) { instance.holdField010 = val; return this; }
        public Builder holdField011(Long val) { instance.holdField011 = val; return this; }
        public Builder holdField012(Long val) { instance.holdField012 = val; return this; }
        public Builder holdField013(BigDecimal val) { instance.holdField013 = val; return this; }
        public Builder holdField014(String val) { instance.holdField014 = val; return this; }
        public HoldDto055 build() { return instance; }
    }

    public Boolean getHoldField000() { return holdField000; }
    public void setHoldField000(Boolean holdField000) { this.holdField000 = holdField000; }

    public LocalDate getHoldField001() { return holdField001; }
    public void setHoldField001(LocalDate holdField001) { this.holdField001 = holdField001; }

    public Double getHoldField002() { return holdField002; }
    public void setHoldField002(Double holdField002) { this.holdField002 = holdField002; }

    public Boolean getHoldField003() { return holdField003; }
    public void setHoldField003(Boolean holdField003) { this.holdField003 = holdField003; }

    public Double getHoldField004() { return holdField004; }
    public void setHoldField004(Double holdField004) { this.holdField004 = holdField004; }

    public BigDecimal getHoldField005() { return holdField005; }
    public void setHoldField005(BigDecimal holdField005) { this.holdField005 = holdField005; }

    public Integer getHoldField006() { return holdField006; }
    public void setHoldField006(Integer holdField006) { this.holdField006 = holdField006; }

    public String getHoldField007() { return holdField007; }
    public void setHoldField007(String holdField007) { this.holdField007 = holdField007; }

    public Integer getHoldField008() { return holdField008; }
    public void setHoldField008(Integer holdField008) { this.holdField008 = holdField008; }

    public Long getHoldField009() { return holdField009; }
    public void setHoldField009(Long holdField009) { this.holdField009 = holdField009; }

    public Boolean getHoldField010() { return holdField010; }
    public void setHoldField010(Boolean holdField010) { this.holdField010 = holdField010; }

    public Long getHoldField011() { return holdField011; }
    public void setHoldField011(Long holdField011) { this.holdField011 = holdField011; }

    public Long getHoldField012() { return holdField012; }
    public void setHoldField012(Long holdField012) { this.holdField012 = holdField012; }

    public BigDecimal getHoldField013() { return holdField013; }
    public void setHoldField013(BigDecimal holdField013) { this.holdField013 = holdField013; }

    public String getHoldField014() { return holdField014; }
    public void setHoldField014(String holdField014) { this.holdField014 = holdField014; }

    @Override
    public String toString() {
        return "HoldDto055{" +
            "holdField000=" + holdField000 + ", " +
            "holdField001=" + holdField001 + ", " +
            "holdField002=" + holdField002 + ", " +
            "holdField003=" + holdField003 + ", " +
            "holdField004=" + holdField004 + ", " +
            "}";
    }
}
