package com.pnb.hold;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * HoldDto059 — Data Transfer Object for hold operations.
 * Variant 59 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HoldDto059 {

    @JsonProperty("holdField000")
    private Double holdField000;

    @JsonProperty("holdField001")
    private LocalDate holdField001;

    @JsonProperty("holdField002")
    private Integer holdField002;

    @DecimalMin(value = "0.00")
    @JsonProperty("holdField003")
    private BigDecimal holdField003;

    @Size(max = 20)
    @JsonProperty("holdField004")
    private String holdField004;

    @JsonProperty("holdField005")
    private Integer holdField005;

    @JsonProperty("holdField006")
    private Boolean holdField006;

    @JsonProperty("holdField007")
    private Long holdField007;

    @JsonProperty("holdField008")
    private Double holdField008;

    @JsonProperty("holdField009")
    private Boolean holdField009;

    @Size(max = 60)
    @JsonProperty("holdField010")
    private String holdField010;

    @JsonProperty("holdField011")
    private Boolean holdField011;

    @JsonProperty("holdField012")
    private Long holdField012;

    @JsonProperty("holdField013")
    private Integer holdField013;

    @JsonProperty("holdField014")
    private Integer holdField014;

    @JsonProperty("holdField015")
    private LocalDate holdField015;

    @JsonProperty("holdField016")
    private Double holdField016;

    @JsonProperty("holdField017")
    private Boolean holdField017;

    @DecimalMin(value = "0.00")
    @JsonProperty("holdField018")
    private BigDecimal holdField018;

    public HoldDto059() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final HoldDto059 instance = new HoldDto059();

        public Builder holdField000(Double val) { instance.holdField000 = val; return this; }
        public Builder holdField001(LocalDate val) { instance.holdField001 = val; return this; }
        public Builder holdField002(Integer val) { instance.holdField002 = val; return this; }
        public Builder holdField003(BigDecimal val) { instance.holdField003 = val; return this; }
        public Builder holdField004(String val) { instance.holdField004 = val; return this; }
        public Builder holdField005(Integer val) { instance.holdField005 = val; return this; }
        public Builder holdField006(Boolean val) { instance.holdField006 = val; return this; }
        public Builder holdField007(Long val) { instance.holdField007 = val; return this; }
        public Builder holdField008(Double val) { instance.holdField008 = val; return this; }
        public Builder holdField009(Boolean val) { instance.holdField009 = val; return this; }
        public Builder holdField010(String val) { instance.holdField010 = val; return this; }
        public Builder holdField011(Boolean val) { instance.holdField011 = val; return this; }
        public Builder holdField012(Long val) { instance.holdField012 = val; return this; }
        public Builder holdField013(Integer val) { instance.holdField013 = val; return this; }
        public Builder holdField014(Integer val) { instance.holdField014 = val; return this; }
        public Builder holdField015(LocalDate val) { instance.holdField015 = val; return this; }
        public Builder holdField016(Double val) { instance.holdField016 = val; return this; }
        public Builder holdField017(Boolean val) { instance.holdField017 = val; return this; }
        public Builder holdField018(BigDecimal val) { instance.holdField018 = val; return this; }
        public HoldDto059 build() { return instance; }
    }

    public Double getHoldField000() { return holdField000; }
    public void setHoldField000(Double holdField000) { this.holdField000 = holdField000; }

    public LocalDate getHoldField001() { return holdField001; }
    public void setHoldField001(LocalDate holdField001) { this.holdField001 = holdField001; }

    public Integer getHoldField002() { return holdField002; }
    public void setHoldField002(Integer holdField002) { this.holdField002 = holdField002; }

    public BigDecimal getHoldField003() { return holdField003; }
    public void setHoldField003(BigDecimal holdField003) { this.holdField003 = holdField003; }

    public String getHoldField004() { return holdField004; }
    public void setHoldField004(String holdField004) { this.holdField004 = holdField004; }

    public Integer getHoldField005() { return holdField005; }
    public void setHoldField005(Integer holdField005) { this.holdField005 = holdField005; }

    public Boolean getHoldField006() { return holdField006; }
    public void setHoldField006(Boolean holdField006) { this.holdField006 = holdField006; }

    public Long getHoldField007() { return holdField007; }
    public void setHoldField007(Long holdField007) { this.holdField007 = holdField007; }

    public Double getHoldField008() { return holdField008; }
    public void setHoldField008(Double holdField008) { this.holdField008 = holdField008; }

    public Boolean getHoldField009() { return holdField009; }
    public void setHoldField009(Boolean holdField009) { this.holdField009 = holdField009; }

    public String getHoldField010() { return holdField010; }
    public void setHoldField010(String holdField010) { this.holdField010 = holdField010; }

    public Boolean getHoldField011() { return holdField011; }
    public void setHoldField011(Boolean holdField011) { this.holdField011 = holdField011; }

    public Long getHoldField012() { return holdField012; }
    public void setHoldField012(Long holdField012) { this.holdField012 = holdField012; }

    public Integer getHoldField013() { return holdField013; }
    public void setHoldField013(Integer holdField013) { this.holdField013 = holdField013; }

    public Integer getHoldField014() { return holdField014; }
    public void setHoldField014(Integer holdField014) { this.holdField014 = holdField014; }

    public LocalDate getHoldField015() { return holdField015; }
    public void setHoldField015(LocalDate holdField015) { this.holdField015 = holdField015; }

    public Double getHoldField016() { return holdField016; }
    public void setHoldField016(Double holdField016) { this.holdField016 = holdField016; }

    public Boolean getHoldField017() { return holdField017; }
    public void setHoldField017(Boolean holdField017) { this.holdField017 = holdField017; }

    public BigDecimal getHoldField018() { return holdField018; }
    public void setHoldField018(BigDecimal holdField018) { this.holdField018 = holdField018; }

    @Override
    public String toString() {
        return "HoldDto059{" +
            "holdField000=" + holdField000 + ", " +
            "holdField001=" + holdField001 + ", " +
            "holdField002=" + holdField002 + ", " +
            "holdField003=" + holdField003 + ", " +
            "holdField004=" + holdField004 + ", " +
            "}";
    }
}
