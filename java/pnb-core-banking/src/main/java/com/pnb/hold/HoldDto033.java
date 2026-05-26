package com.pnb.hold;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * HoldDto033 — Data Transfer Object for hold operations.
 * Variant 33 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HoldDto033 {

    @JsonProperty("holdField000")
    private Long holdField000;

    @JsonProperty("holdField001")
    private Integer holdField001;

    @JsonProperty("holdField002")
    private Integer holdField002;

    @Size(max = 60)
    @JsonProperty("holdField003")
    private String holdField003;

    @Size(max = 200)
    @JsonProperty("holdField004")
    private String holdField004;

    @JsonProperty("holdField005")
    private Double holdField005;

    @JsonProperty("holdField006")
    private Integer holdField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("holdField007")
    private BigDecimal holdField007;

    @DecimalMin(value = "0.00")
    @JsonProperty("holdField008")
    private BigDecimal holdField008;

    @JsonProperty("holdField009")
    private Long holdField009;

    @JsonProperty("holdField010")
    private Boolean holdField010;

    @DecimalMin(value = "0.00")
    @JsonProperty("holdField011")
    private BigDecimal holdField011;

    @JsonProperty("holdField012")
    private Integer holdField012;

    @JsonProperty("holdField013")
    private Boolean holdField013;

    @JsonProperty("holdField014")
    private Integer holdField014;

    @DecimalMin(value = "0.00")
    @JsonProperty("holdField015")
    private BigDecimal holdField015;

    @DecimalMin(value = "0.00")
    @JsonProperty("holdField016")
    private BigDecimal holdField016;

    public HoldDto033() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final HoldDto033 instance = new HoldDto033();

        public Builder holdField000(Long val) { instance.holdField000 = val; return this; }
        public Builder holdField001(Integer val) { instance.holdField001 = val; return this; }
        public Builder holdField002(Integer val) { instance.holdField002 = val; return this; }
        public Builder holdField003(String val) { instance.holdField003 = val; return this; }
        public Builder holdField004(String val) { instance.holdField004 = val; return this; }
        public Builder holdField005(Double val) { instance.holdField005 = val; return this; }
        public Builder holdField006(Integer val) { instance.holdField006 = val; return this; }
        public Builder holdField007(BigDecimal val) { instance.holdField007 = val; return this; }
        public Builder holdField008(BigDecimal val) { instance.holdField008 = val; return this; }
        public Builder holdField009(Long val) { instance.holdField009 = val; return this; }
        public Builder holdField010(Boolean val) { instance.holdField010 = val; return this; }
        public Builder holdField011(BigDecimal val) { instance.holdField011 = val; return this; }
        public Builder holdField012(Integer val) { instance.holdField012 = val; return this; }
        public Builder holdField013(Boolean val) { instance.holdField013 = val; return this; }
        public Builder holdField014(Integer val) { instance.holdField014 = val; return this; }
        public Builder holdField015(BigDecimal val) { instance.holdField015 = val; return this; }
        public Builder holdField016(BigDecimal val) { instance.holdField016 = val; return this; }
        public HoldDto033 build() { return instance; }
    }

    public Long getHoldField000() { return holdField000; }
    public void setHoldField000(Long holdField000) { this.holdField000 = holdField000; }

    public Integer getHoldField001() { return holdField001; }
    public void setHoldField001(Integer holdField001) { this.holdField001 = holdField001; }

    public Integer getHoldField002() { return holdField002; }
    public void setHoldField002(Integer holdField002) { this.holdField002 = holdField002; }

    public String getHoldField003() { return holdField003; }
    public void setHoldField003(String holdField003) { this.holdField003 = holdField003; }

    public String getHoldField004() { return holdField004; }
    public void setHoldField004(String holdField004) { this.holdField004 = holdField004; }

    public Double getHoldField005() { return holdField005; }
    public void setHoldField005(Double holdField005) { this.holdField005 = holdField005; }

    public Integer getHoldField006() { return holdField006; }
    public void setHoldField006(Integer holdField006) { this.holdField006 = holdField006; }

    public BigDecimal getHoldField007() { return holdField007; }
    public void setHoldField007(BigDecimal holdField007) { this.holdField007 = holdField007; }

    public BigDecimal getHoldField008() { return holdField008; }
    public void setHoldField008(BigDecimal holdField008) { this.holdField008 = holdField008; }

    public Long getHoldField009() { return holdField009; }
    public void setHoldField009(Long holdField009) { this.holdField009 = holdField009; }

    public Boolean getHoldField010() { return holdField010; }
    public void setHoldField010(Boolean holdField010) { this.holdField010 = holdField010; }

    public BigDecimal getHoldField011() { return holdField011; }
    public void setHoldField011(BigDecimal holdField011) { this.holdField011 = holdField011; }

    public Integer getHoldField012() { return holdField012; }
    public void setHoldField012(Integer holdField012) { this.holdField012 = holdField012; }

    public Boolean getHoldField013() { return holdField013; }
    public void setHoldField013(Boolean holdField013) { this.holdField013 = holdField013; }

    public Integer getHoldField014() { return holdField014; }
    public void setHoldField014(Integer holdField014) { this.holdField014 = holdField014; }

    public BigDecimal getHoldField015() { return holdField015; }
    public void setHoldField015(BigDecimal holdField015) { this.holdField015 = holdField015; }

    public BigDecimal getHoldField016() { return holdField016; }
    public void setHoldField016(BigDecimal holdField016) { this.holdField016 = holdField016; }

    @Override
    public String toString() {
        return "HoldDto033{" +
            "holdField000=" + holdField000 + ", " +
            "holdField001=" + holdField001 + ", " +
            "holdField002=" + holdField002 + ", " +
            "holdField003=" + holdField003 + ", " +
            "holdField004=" + holdField004 + ", " +
            "}";
    }
}
