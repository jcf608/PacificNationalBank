package com.pnb.hold;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * HoldDto058 — Data Transfer Object for hold operations.
 * Variant 58 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HoldDto058 {

    @JsonProperty("holdField000")
    private LocalDate holdField000;

    @JsonProperty("holdField001")
    private Long holdField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("holdField002")
    private BigDecimal holdField002;

    @JsonProperty("holdField003")
    private Long holdField003;

    @JsonProperty("holdField004")
    private Double holdField004;

    @JsonProperty("holdField005")
    private LocalDate holdField005;

    @JsonProperty("holdField006")
    private Boolean holdField006;

    @JsonProperty("holdField007")
    private Boolean holdField007;

    @JsonProperty("holdField008")
    private Boolean holdField008;

    @JsonProperty("holdField009")
    private LocalDate holdField009;

    @JsonProperty("holdField010")
    private Double holdField010;

    @JsonProperty("holdField011")
    private Double holdField011;

    @JsonProperty("holdField012")
    private Double holdField012;

    @JsonProperty("holdField013")
    private LocalDate holdField013;

    @DecimalMin(value = "0.00")
    @JsonProperty("holdField014")
    private BigDecimal holdField014;

    @JsonProperty("holdField015")
    private Double holdField015;

    @Size(max = 100)
    @JsonProperty("holdField016")
    private String holdField016;

    @Size(max = 40)
    @JsonProperty("holdField017")
    private String holdField017;

    public HoldDto058() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final HoldDto058 instance = new HoldDto058();

        public Builder holdField000(LocalDate val) { instance.holdField000 = val; return this; }
        public Builder holdField001(Long val) { instance.holdField001 = val; return this; }
        public Builder holdField002(BigDecimal val) { instance.holdField002 = val; return this; }
        public Builder holdField003(Long val) { instance.holdField003 = val; return this; }
        public Builder holdField004(Double val) { instance.holdField004 = val; return this; }
        public Builder holdField005(LocalDate val) { instance.holdField005 = val; return this; }
        public Builder holdField006(Boolean val) { instance.holdField006 = val; return this; }
        public Builder holdField007(Boolean val) { instance.holdField007 = val; return this; }
        public Builder holdField008(Boolean val) { instance.holdField008 = val; return this; }
        public Builder holdField009(LocalDate val) { instance.holdField009 = val; return this; }
        public Builder holdField010(Double val) { instance.holdField010 = val; return this; }
        public Builder holdField011(Double val) { instance.holdField011 = val; return this; }
        public Builder holdField012(Double val) { instance.holdField012 = val; return this; }
        public Builder holdField013(LocalDate val) { instance.holdField013 = val; return this; }
        public Builder holdField014(BigDecimal val) { instance.holdField014 = val; return this; }
        public Builder holdField015(Double val) { instance.holdField015 = val; return this; }
        public Builder holdField016(String val) { instance.holdField016 = val; return this; }
        public Builder holdField017(String val) { instance.holdField017 = val; return this; }
        public HoldDto058 build() { return instance; }
    }

    public LocalDate getHoldField000() { return holdField000; }
    public void setHoldField000(LocalDate holdField000) { this.holdField000 = holdField000; }

    public Long getHoldField001() { return holdField001; }
    public void setHoldField001(Long holdField001) { this.holdField001 = holdField001; }

    public BigDecimal getHoldField002() { return holdField002; }
    public void setHoldField002(BigDecimal holdField002) { this.holdField002 = holdField002; }

    public Long getHoldField003() { return holdField003; }
    public void setHoldField003(Long holdField003) { this.holdField003 = holdField003; }

    public Double getHoldField004() { return holdField004; }
    public void setHoldField004(Double holdField004) { this.holdField004 = holdField004; }

    public LocalDate getHoldField005() { return holdField005; }
    public void setHoldField005(LocalDate holdField005) { this.holdField005 = holdField005; }

    public Boolean getHoldField006() { return holdField006; }
    public void setHoldField006(Boolean holdField006) { this.holdField006 = holdField006; }

    public Boolean getHoldField007() { return holdField007; }
    public void setHoldField007(Boolean holdField007) { this.holdField007 = holdField007; }

    public Boolean getHoldField008() { return holdField008; }
    public void setHoldField008(Boolean holdField008) { this.holdField008 = holdField008; }

    public LocalDate getHoldField009() { return holdField009; }
    public void setHoldField009(LocalDate holdField009) { this.holdField009 = holdField009; }

    public Double getHoldField010() { return holdField010; }
    public void setHoldField010(Double holdField010) { this.holdField010 = holdField010; }

    public Double getHoldField011() { return holdField011; }
    public void setHoldField011(Double holdField011) { this.holdField011 = holdField011; }

    public Double getHoldField012() { return holdField012; }
    public void setHoldField012(Double holdField012) { this.holdField012 = holdField012; }

    public LocalDate getHoldField013() { return holdField013; }
    public void setHoldField013(LocalDate holdField013) { this.holdField013 = holdField013; }

    public BigDecimal getHoldField014() { return holdField014; }
    public void setHoldField014(BigDecimal holdField014) { this.holdField014 = holdField014; }

    public Double getHoldField015() { return holdField015; }
    public void setHoldField015(Double holdField015) { this.holdField015 = holdField015; }

    public String getHoldField016() { return holdField016; }
    public void setHoldField016(String holdField016) { this.holdField016 = holdField016; }

    public String getHoldField017() { return holdField017; }
    public void setHoldField017(String holdField017) { this.holdField017 = holdField017; }

    @Override
    public String toString() {
        return "HoldDto058{" +
            "holdField000=" + holdField000 + ", " +
            "holdField001=" + holdField001 + ", " +
            "holdField002=" + holdField002 + ", " +
            "holdField003=" + holdField003 + ", " +
            "holdField004=" + holdField004 + ", " +
            "}";
    }
}
