package com.pnb.hold;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * HoldDto020 — Data Transfer Object for hold operations.
 * Variant 20 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HoldDto020 {

    @JsonProperty("holdField000")
    private Integer holdField000;

    @JsonProperty("holdField001")
    private LocalDate holdField001;

    @JsonProperty("holdField002")
    private Integer holdField002;

    @JsonProperty("holdField003")
    private LocalDate holdField003;

    @DecimalMin(value = "0.00")
    @JsonProperty("holdField004")
    private BigDecimal holdField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("holdField005")
    private BigDecimal holdField005;

    @JsonProperty("holdField006")
    private Boolean holdField006;

    @JsonProperty("holdField007")
    private Integer holdField007;

    @Size(max = 20)
    @JsonProperty("holdField008")
    private String holdField008;

    @JsonProperty("holdField009")
    private Integer holdField009;

    @Size(max = 60)
    @JsonProperty("holdField010")
    private String holdField010;

    @DecimalMin(value = "0.00")
    @JsonProperty("holdField011")
    private BigDecimal holdField011;

    @JsonProperty("holdField012")
    private Boolean holdField012;

    @DecimalMin(value = "0.00")
    @JsonProperty("holdField013")
    private BigDecimal holdField013;

    @JsonProperty("holdField014")
    private Integer holdField014;

    @JsonProperty("holdField015")
    private Long holdField015;

    public HoldDto020() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final HoldDto020 instance = new HoldDto020();

        public Builder holdField000(Integer val) { instance.holdField000 = val; return this; }
        public Builder holdField001(LocalDate val) { instance.holdField001 = val; return this; }
        public Builder holdField002(Integer val) { instance.holdField002 = val; return this; }
        public Builder holdField003(LocalDate val) { instance.holdField003 = val; return this; }
        public Builder holdField004(BigDecimal val) { instance.holdField004 = val; return this; }
        public Builder holdField005(BigDecimal val) { instance.holdField005 = val; return this; }
        public Builder holdField006(Boolean val) { instance.holdField006 = val; return this; }
        public Builder holdField007(Integer val) { instance.holdField007 = val; return this; }
        public Builder holdField008(String val) { instance.holdField008 = val; return this; }
        public Builder holdField009(Integer val) { instance.holdField009 = val; return this; }
        public Builder holdField010(String val) { instance.holdField010 = val; return this; }
        public Builder holdField011(BigDecimal val) { instance.holdField011 = val; return this; }
        public Builder holdField012(Boolean val) { instance.holdField012 = val; return this; }
        public Builder holdField013(BigDecimal val) { instance.holdField013 = val; return this; }
        public Builder holdField014(Integer val) { instance.holdField014 = val; return this; }
        public Builder holdField015(Long val) { instance.holdField015 = val; return this; }
        public HoldDto020 build() { return instance; }
    }

    public Integer getHoldField000() { return holdField000; }
    public void setHoldField000(Integer holdField000) { this.holdField000 = holdField000; }

    public LocalDate getHoldField001() { return holdField001; }
    public void setHoldField001(LocalDate holdField001) { this.holdField001 = holdField001; }

    public Integer getHoldField002() { return holdField002; }
    public void setHoldField002(Integer holdField002) { this.holdField002 = holdField002; }

    public LocalDate getHoldField003() { return holdField003; }
    public void setHoldField003(LocalDate holdField003) { this.holdField003 = holdField003; }

    public BigDecimal getHoldField004() { return holdField004; }
    public void setHoldField004(BigDecimal holdField004) { this.holdField004 = holdField004; }

    public BigDecimal getHoldField005() { return holdField005; }
    public void setHoldField005(BigDecimal holdField005) { this.holdField005 = holdField005; }

    public Boolean getHoldField006() { return holdField006; }
    public void setHoldField006(Boolean holdField006) { this.holdField006 = holdField006; }

    public Integer getHoldField007() { return holdField007; }
    public void setHoldField007(Integer holdField007) { this.holdField007 = holdField007; }

    public String getHoldField008() { return holdField008; }
    public void setHoldField008(String holdField008) { this.holdField008 = holdField008; }

    public Integer getHoldField009() { return holdField009; }
    public void setHoldField009(Integer holdField009) { this.holdField009 = holdField009; }

    public String getHoldField010() { return holdField010; }
    public void setHoldField010(String holdField010) { this.holdField010 = holdField010; }

    public BigDecimal getHoldField011() { return holdField011; }
    public void setHoldField011(BigDecimal holdField011) { this.holdField011 = holdField011; }

    public Boolean getHoldField012() { return holdField012; }
    public void setHoldField012(Boolean holdField012) { this.holdField012 = holdField012; }

    public BigDecimal getHoldField013() { return holdField013; }
    public void setHoldField013(BigDecimal holdField013) { this.holdField013 = holdField013; }

    public Integer getHoldField014() { return holdField014; }
    public void setHoldField014(Integer holdField014) { this.holdField014 = holdField014; }

    public Long getHoldField015() { return holdField015; }
    public void setHoldField015(Long holdField015) { this.holdField015 = holdField015; }

    @Override
    public String toString() {
        return "HoldDto020{" +
            "holdField000=" + holdField000 + ", " +
            "holdField001=" + holdField001 + ", " +
            "holdField002=" + holdField002 + ", " +
            "holdField003=" + holdField003 + ", " +
            "holdField004=" + holdField004 + ", " +
            "}";
    }
}
