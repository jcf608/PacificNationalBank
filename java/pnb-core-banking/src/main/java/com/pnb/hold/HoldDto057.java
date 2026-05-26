package com.pnb.hold;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * HoldDto057 — Data Transfer Object for hold operations.
 * Variant 57 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HoldDto057 {

    @JsonProperty("holdField000")
    private Double holdField000;

    @JsonProperty("holdField001")
    private Integer holdField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("holdField002")
    private BigDecimal holdField002;

    @JsonProperty("holdField003")
    private LocalDate holdField003;

    @Size(max = 20)
    @JsonProperty("holdField004")
    private String holdField004;

    @JsonProperty("holdField005")
    private Double holdField005;

    @JsonProperty("holdField006")
    private Integer holdField006;

    @JsonProperty("holdField007")
    private Integer holdField007;

    @JsonProperty("holdField008")
    private Long holdField008;

    @JsonProperty("holdField009")
    private Double holdField009;

    @Size(max = 20)
    @JsonProperty("holdField010")
    private String holdField010;

    @JsonProperty("holdField011")
    private Double holdField011;

    @DecimalMin(value = "0.00")
    @JsonProperty("holdField012")
    private BigDecimal holdField012;

    @DecimalMin(value = "0.00")
    @JsonProperty("holdField013")
    private BigDecimal holdField013;

    @JsonProperty("holdField014")
    private Double holdField014;

    @JsonProperty("holdField015")
    private Long holdField015;

    @JsonProperty("holdField016")
    private Long holdField016;

    public HoldDto057() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final HoldDto057 instance = new HoldDto057();

        public Builder holdField000(Double val) { instance.holdField000 = val; return this; }
        public Builder holdField001(Integer val) { instance.holdField001 = val; return this; }
        public Builder holdField002(BigDecimal val) { instance.holdField002 = val; return this; }
        public Builder holdField003(LocalDate val) { instance.holdField003 = val; return this; }
        public Builder holdField004(String val) { instance.holdField004 = val; return this; }
        public Builder holdField005(Double val) { instance.holdField005 = val; return this; }
        public Builder holdField006(Integer val) { instance.holdField006 = val; return this; }
        public Builder holdField007(Integer val) { instance.holdField007 = val; return this; }
        public Builder holdField008(Long val) { instance.holdField008 = val; return this; }
        public Builder holdField009(Double val) { instance.holdField009 = val; return this; }
        public Builder holdField010(String val) { instance.holdField010 = val; return this; }
        public Builder holdField011(Double val) { instance.holdField011 = val; return this; }
        public Builder holdField012(BigDecimal val) { instance.holdField012 = val; return this; }
        public Builder holdField013(BigDecimal val) { instance.holdField013 = val; return this; }
        public Builder holdField014(Double val) { instance.holdField014 = val; return this; }
        public Builder holdField015(Long val) { instance.holdField015 = val; return this; }
        public Builder holdField016(Long val) { instance.holdField016 = val; return this; }
        public HoldDto057 build() { return instance; }
    }

    public Double getHoldField000() { return holdField000; }
    public void setHoldField000(Double holdField000) { this.holdField000 = holdField000; }

    public Integer getHoldField001() { return holdField001; }
    public void setHoldField001(Integer holdField001) { this.holdField001 = holdField001; }

    public BigDecimal getHoldField002() { return holdField002; }
    public void setHoldField002(BigDecimal holdField002) { this.holdField002 = holdField002; }

    public LocalDate getHoldField003() { return holdField003; }
    public void setHoldField003(LocalDate holdField003) { this.holdField003 = holdField003; }

    public String getHoldField004() { return holdField004; }
    public void setHoldField004(String holdField004) { this.holdField004 = holdField004; }

    public Double getHoldField005() { return holdField005; }
    public void setHoldField005(Double holdField005) { this.holdField005 = holdField005; }

    public Integer getHoldField006() { return holdField006; }
    public void setHoldField006(Integer holdField006) { this.holdField006 = holdField006; }

    public Integer getHoldField007() { return holdField007; }
    public void setHoldField007(Integer holdField007) { this.holdField007 = holdField007; }

    public Long getHoldField008() { return holdField008; }
    public void setHoldField008(Long holdField008) { this.holdField008 = holdField008; }

    public Double getHoldField009() { return holdField009; }
    public void setHoldField009(Double holdField009) { this.holdField009 = holdField009; }

    public String getHoldField010() { return holdField010; }
    public void setHoldField010(String holdField010) { this.holdField010 = holdField010; }

    public Double getHoldField011() { return holdField011; }
    public void setHoldField011(Double holdField011) { this.holdField011 = holdField011; }

    public BigDecimal getHoldField012() { return holdField012; }
    public void setHoldField012(BigDecimal holdField012) { this.holdField012 = holdField012; }

    public BigDecimal getHoldField013() { return holdField013; }
    public void setHoldField013(BigDecimal holdField013) { this.holdField013 = holdField013; }

    public Double getHoldField014() { return holdField014; }
    public void setHoldField014(Double holdField014) { this.holdField014 = holdField014; }

    public Long getHoldField015() { return holdField015; }
    public void setHoldField015(Long holdField015) { this.holdField015 = holdField015; }

    public Long getHoldField016() { return holdField016; }
    public void setHoldField016(Long holdField016) { this.holdField016 = holdField016; }

    @Override
    public String toString() {
        return "HoldDto057{" +
            "holdField000=" + holdField000 + ", " +
            "holdField001=" + holdField001 + ", " +
            "holdField002=" + holdField002 + ", " +
            "holdField003=" + holdField003 + ", " +
            "holdField004=" + holdField004 + ", " +
            "}";
    }
}
