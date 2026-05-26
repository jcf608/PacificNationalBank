package com.pnb.hold;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * HoldDto042 — Data Transfer Object for hold operations.
 * Variant 42 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HoldDto042 {

    @JsonProperty("holdField000")
    private Double holdField000;

    @JsonProperty("holdField001")
    private Boolean holdField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("holdField002")
    private BigDecimal holdField002;

    @DecimalMin(value = "0.00")
    @JsonProperty("holdField003")
    private BigDecimal holdField003;

    @JsonProperty("holdField004")
    private Boolean holdField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("holdField005")
    private BigDecimal holdField005;

    @JsonProperty("holdField006")
    private Integer holdField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("holdField007")
    private BigDecimal holdField007;

    @JsonProperty("holdField008")
    private Integer holdField008;

    @JsonProperty("holdField009")
    private Long holdField009;

    @DecimalMin(value = "0.00")
    @JsonProperty("holdField010")
    private BigDecimal holdField010;

    @JsonProperty("holdField011")
    private LocalDate holdField011;

    @JsonProperty("holdField012")
    private Boolean holdField012;

    @Size(max = 60)
    @JsonProperty("holdField013")
    private String holdField013;

    public HoldDto042() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final HoldDto042 instance = new HoldDto042();

        public Builder holdField000(Double val) { instance.holdField000 = val; return this; }
        public Builder holdField001(Boolean val) { instance.holdField001 = val; return this; }
        public Builder holdField002(BigDecimal val) { instance.holdField002 = val; return this; }
        public Builder holdField003(BigDecimal val) { instance.holdField003 = val; return this; }
        public Builder holdField004(Boolean val) { instance.holdField004 = val; return this; }
        public Builder holdField005(BigDecimal val) { instance.holdField005 = val; return this; }
        public Builder holdField006(Integer val) { instance.holdField006 = val; return this; }
        public Builder holdField007(BigDecimal val) { instance.holdField007 = val; return this; }
        public Builder holdField008(Integer val) { instance.holdField008 = val; return this; }
        public Builder holdField009(Long val) { instance.holdField009 = val; return this; }
        public Builder holdField010(BigDecimal val) { instance.holdField010 = val; return this; }
        public Builder holdField011(LocalDate val) { instance.holdField011 = val; return this; }
        public Builder holdField012(Boolean val) { instance.holdField012 = val; return this; }
        public Builder holdField013(String val) { instance.holdField013 = val; return this; }
        public HoldDto042 build() { return instance; }
    }

    public Double getHoldField000() { return holdField000; }
    public void setHoldField000(Double holdField000) { this.holdField000 = holdField000; }

    public Boolean getHoldField001() { return holdField001; }
    public void setHoldField001(Boolean holdField001) { this.holdField001 = holdField001; }

    public BigDecimal getHoldField002() { return holdField002; }
    public void setHoldField002(BigDecimal holdField002) { this.holdField002 = holdField002; }

    public BigDecimal getHoldField003() { return holdField003; }
    public void setHoldField003(BigDecimal holdField003) { this.holdField003 = holdField003; }

    public Boolean getHoldField004() { return holdField004; }
    public void setHoldField004(Boolean holdField004) { this.holdField004 = holdField004; }

    public BigDecimal getHoldField005() { return holdField005; }
    public void setHoldField005(BigDecimal holdField005) { this.holdField005 = holdField005; }

    public Integer getHoldField006() { return holdField006; }
    public void setHoldField006(Integer holdField006) { this.holdField006 = holdField006; }

    public BigDecimal getHoldField007() { return holdField007; }
    public void setHoldField007(BigDecimal holdField007) { this.holdField007 = holdField007; }

    public Integer getHoldField008() { return holdField008; }
    public void setHoldField008(Integer holdField008) { this.holdField008 = holdField008; }

    public Long getHoldField009() { return holdField009; }
    public void setHoldField009(Long holdField009) { this.holdField009 = holdField009; }

    public BigDecimal getHoldField010() { return holdField010; }
    public void setHoldField010(BigDecimal holdField010) { this.holdField010 = holdField010; }

    public LocalDate getHoldField011() { return holdField011; }
    public void setHoldField011(LocalDate holdField011) { this.holdField011 = holdField011; }

    public Boolean getHoldField012() { return holdField012; }
    public void setHoldField012(Boolean holdField012) { this.holdField012 = holdField012; }

    public String getHoldField013() { return holdField013; }
    public void setHoldField013(String holdField013) { this.holdField013 = holdField013; }

    @Override
    public String toString() {
        return "HoldDto042{" +
            "holdField000=" + holdField000 + ", " +
            "holdField001=" + holdField001 + ", " +
            "holdField002=" + holdField002 + ", " +
            "holdField003=" + holdField003 + ", " +
            "holdField004=" + holdField004 + ", " +
            "}";
    }
}
