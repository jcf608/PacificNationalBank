package com.pnb.hold;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * HoldDto045 — Data Transfer Object for hold operations.
 * Variant 45 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HoldDto045 {

    @Size(max = 20)
    @JsonProperty("holdField000")
    private String holdField000;

    @JsonProperty("holdField001")
    private Boolean holdField001;

    @JsonProperty("holdField002")
    private Integer holdField002;

    @Size(max = 40)
    @JsonProperty("holdField003")
    private String holdField003;

    @JsonProperty("holdField004")
    private Double holdField004;

    @JsonProperty("holdField005")
    private LocalDate holdField005;

    @JsonProperty("holdField006")
    private Boolean holdField006;

    @JsonProperty("holdField007")
    private LocalDate holdField007;

    @JsonProperty("holdField008")
    private Integer holdField008;

    @DecimalMin(value = "0.00")
    @JsonProperty("holdField009")
    private BigDecimal holdField009;

    @Size(max = 200)
    @JsonProperty("holdField010")
    private String holdField010;

    @DecimalMin(value = "0.00")
    @JsonProperty("holdField011")
    private BigDecimal holdField011;

    @JsonProperty("holdField012")
    private Integer holdField012;

    @DecimalMin(value = "0.00")
    @JsonProperty("holdField013")
    private BigDecimal holdField013;

    @JsonProperty("holdField014")
    private Double holdField014;

    @JsonProperty("holdField015")
    private Boolean holdField015;

    @Size(max = 20)
    @JsonProperty("holdField016")
    private String holdField016;

    public HoldDto045() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final HoldDto045 instance = new HoldDto045();

        public Builder holdField000(String val) { instance.holdField000 = val; return this; }
        public Builder holdField001(Boolean val) { instance.holdField001 = val; return this; }
        public Builder holdField002(Integer val) { instance.holdField002 = val; return this; }
        public Builder holdField003(String val) { instance.holdField003 = val; return this; }
        public Builder holdField004(Double val) { instance.holdField004 = val; return this; }
        public Builder holdField005(LocalDate val) { instance.holdField005 = val; return this; }
        public Builder holdField006(Boolean val) { instance.holdField006 = val; return this; }
        public Builder holdField007(LocalDate val) { instance.holdField007 = val; return this; }
        public Builder holdField008(Integer val) { instance.holdField008 = val; return this; }
        public Builder holdField009(BigDecimal val) { instance.holdField009 = val; return this; }
        public Builder holdField010(String val) { instance.holdField010 = val; return this; }
        public Builder holdField011(BigDecimal val) { instance.holdField011 = val; return this; }
        public Builder holdField012(Integer val) { instance.holdField012 = val; return this; }
        public Builder holdField013(BigDecimal val) { instance.holdField013 = val; return this; }
        public Builder holdField014(Double val) { instance.holdField014 = val; return this; }
        public Builder holdField015(Boolean val) { instance.holdField015 = val; return this; }
        public Builder holdField016(String val) { instance.holdField016 = val; return this; }
        public HoldDto045 build() { return instance; }
    }

    public String getHoldField000() { return holdField000; }
    public void setHoldField000(String holdField000) { this.holdField000 = holdField000; }

    public Boolean getHoldField001() { return holdField001; }
    public void setHoldField001(Boolean holdField001) { this.holdField001 = holdField001; }

    public Integer getHoldField002() { return holdField002; }
    public void setHoldField002(Integer holdField002) { this.holdField002 = holdField002; }

    public String getHoldField003() { return holdField003; }
    public void setHoldField003(String holdField003) { this.holdField003 = holdField003; }

    public Double getHoldField004() { return holdField004; }
    public void setHoldField004(Double holdField004) { this.holdField004 = holdField004; }

    public LocalDate getHoldField005() { return holdField005; }
    public void setHoldField005(LocalDate holdField005) { this.holdField005 = holdField005; }

    public Boolean getHoldField006() { return holdField006; }
    public void setHoldField006(Boolean holdField006) { this.holdField006 = holdField006; }

    public LocalDate getHoldField007() { return holdField007; }
    public void setHoldField007(LocalDate holdField007) { this.holdField007 = holdField007; }

    public Integer getHoldField008() { return holdField008; }
    public void setHoldField008(Integer holdField008) { this.holdField008 = holdField008; }

    public BigDecimal getHoldField009() { return holdField009; }
    public void setHoldField009(BigDecimal holdField009) { this.holdField009 = holdField009; }

    public String getHoldField010() { return holdField010; }
    public void setHoldField010(String holdField010) { this.holdField010 = holdField010; }

    public BigDecimal getHoldField011() { return holdField011; }
    public void setHoldField011(BigDecimal holdField011) { this.holdField011 = holdField011; }

    public Integer getHoldField012() { return holdField012; }
    public void setHoldField012(Integer holdField012) { this.holdField012 = holdField012; }

    public BigDecimal getHoldField013() { return holdField013; }
    public void setHoldField013(BigDecimal holdField013) { this.holdField013 = holdField013; }

    public Double getHoldField014() { return holdField014; }
    public void setHoldField014(Double holdField014) { this.holdField014 = holdField014; }

    public Boolean getHoldField015() { return holdField015; }
    public void setHoldField015(Boolean holdField015) { this.holdField015 = holdField015; }

    public String getHoldField016() { return holdField016; }
    public void setHoldField016(String holdField016) { this.holdField016 = holdField016; }

    @Override
    public String toString() {
        return "HoldDto045{" +
            "holdField000=" + holdField000 + ", " +
            "holdField001=" + holdField001 + ", " +
            "holdField002=" + holdField002 + ", " +
            "holdField003=" + holdField003 + ", " +
            "holdField004=" + holdField004 + ", " +
            "}";
    }
}
