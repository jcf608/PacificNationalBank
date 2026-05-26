package com.pnb.hold;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * HoldDto035 — Data Transfer Object for hold operations.
 * Variant 35 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HoldDto035 {

    @JsonProperty("holdField000")
    private Double holdField000;

    @Size(max = 60)
    @JsonProperty("holdField001")
    private String holdField001;

    @JsonProperty("holdField002")
    private Double holdField002;

    @JsonProperty("holdField003")
    private Integer holdField003;

    @JsonProperty("holdField004")
    private Integer holdField004;

    @JsonProperty("holdField005")
    private Double holdField005;

    @JsonProperty("holdField006")
    private Boolean holdField006;

    @JsonProperty("holdField007")
    private Long holdField007;

    @JsonProperty("holdField008")
    private Integer holdField008;

    @Size(max = 100)
    @JsonProperty("holdField009")
    private String holdField009;

    @JsonProperty("holdField010")
    private Double holdField010;

    @DecimalMin(value = "0.00")
    @JsonProperty("holdField011")
    private BigDecimal holdField011;

    @DecimalMin(value = "0.00")
    @JsonProperty("holdField012")
    private BigDecimal holdField012;

    @Size(max = 40)
    @JsonProperty("holdField013")
    private String holdField013;

    @JsonProperty("holdField014")
    private Double holdField014;

    @JsonProperty("holdField015")
    private LocalDate holdField015;

    @DecimalMin(value = "0.00")
    @JsonProperty("holdField016")
    private BigDecimal holdField016;

    @JsonProperty("holdField017")
    private Double holdField017;

    @JsonProperty("holdField018")
    private Long holdField018;

    public HoldDto035() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final HoldDto035 instance = new HoldDto035();

        public Builder holdField000(Double val) { instance.holdField000 = val; return this; }
        public Builder holdField001(String val) { instance.holdField001 = val; return this; }
        public Builder holdField002(Double val) { instance.holdField002 = val; return this; }
        public Builder holdField003(Integer val) { instance.holdField003 = val; return this; }
        public Builder holdField004(Integer val) { instance.holdField004 = val; return this; }
        public Builder holdField005(Double val) { instance.holdField005 = val; return this; }
        public Builder holdField006(Boolean val) { instance.holdField006 = val; return this; }
        public Builder holdField007(Long val) { instance.holdField007 = val; return this; }
        public Builder holdField008(Integer val) { instance.holdField008 = val; return this; }
        public Builder holdField009(String val) { instance.holdField009 = val; return this; }
        public Builder holdField010(Double val) { instance.holdField010 = val; return this; }
        public Builder holdField011(BigDecimal val) { instance.holdField011 = val; return this; }
        public Builder holdField012(BigDecimal val) { instance.holdField012 = val; return this; }
        public Builder holdField013(String val) { instance.holdField013 = val; return this; }
        public Builder holdField014(Double val) { instance.holdField014 = val; return this; }
        public Builder holdField015(LocalDate val) { instance.holdField015 = val; return this; }
        public Builder holdField016(BigDecimal val) { instance.holdField016 = val; return this; }
        public Builder holdField017(Double val) { instance.holdField017 = val; return this; }
        public Builder holdField018(Long val) { instance.holdField018 = val; return this; }
        public HoldDto035 build() { return instance; }
    }

    public Double getHoldField000() { return holdField000; }
    public void setHoldField000(Double holdField000) { this.holdField000 = holdField000; }

    public String getHoldField001() { return holdField001; }
    public void setHoldField001(String holdField001) { this.holdField001 = holdField001; }

    public Double getHoldField002() { return holdField002; }
    public void setHoldField002(Double holdField002) { this.holdField002 = holdField002; }

    public Integer getHoldField003() { return holdField003; }
    public void setHoldField003(Integer holdField003) { this.holdField003 = holdField003; }

    public Integer getHoldField004() { return holdField004; }
    public void setHoldField004(Integer holdField004) { this.holdField004 = holdField004; }

    public Double getHoldField005() { return holdField005; }
    public void setHoldField005(Double holdField005) { this.holdField005 = holdField005; }

    public Boolean getHoldField006() { return holdField006; }
    public void setHoldField006(Boolean holdField006) { this.holdField006 = holdField006; }

    public Long getHoldField007() { return holdField007; }
    public void setHoldField007(Long holdField007) { this.holdField007 = holdField007; }

    public Integer getHoldField008() { return holdField008; }
    public void setHoldField008(Integer holdField008) { this.holdField008 = holdField008; }

    public String getHoldField009() { return holdField009; }
    public void setHoldField009(String holdField009) { this.holdField009 = holdField009; }

    public Double getHoldField010() { return holdField010; }
    public void setHoldField010(Double holdField010) { this.holdField010 = holdField010; }

    public BigDecimal getHoldField011() { return holdField011; }
    public void setHoldField011(BigDecimal holdField011) { this.holdField011 = holdField011; }

    public BigDecimal getHoldField012() { return holdField012; }
    public void setHoldField012(BigDecimal holdField012) { this.holdField012 = holdField012; }

    public String getHoldField013() { return holdField013; }
    public void setHoldField013(String holdField013) { this.holdField013 = holdField013; }

    public Double getHoldField014() { return holdField014; }
    public void setHoldField014(Double holdField014) { this.holdField014 = holdField014; }

    public LocalDate getHoldField015() { return holdField015; }
    public void setHoldField015(LocalDate holdField015) { this.holdField015 = holdField015; }

    public BigDecimal getHoldField016() { return holdField016; }
    public void setHoldField016(BigDecimal holdField016) { this.holdField016 = holdField016; }

    public Double getHoldField017() { return holdField017; }
    public void setHoldField017(Double holdField017) { this.holdField017 = holdField017; }

    public Long getHoldField018() { return holdField018; }
    public void setHoldField018(Long holdField018) { this.holdField018 = holdField018; }

    @Override
    public String toString() {
        return "HoldDto035{" +
            "holdField000=" + holdField000 + ", " +
            "holdField001=" + holdField001 + ", " +
            "holdField002=" + holdField002 + ", " +
            "holdField003=" + holdField003 + ", " +
            "holdField004=" + holdField004 + ", " +
            "}";
    }
}
