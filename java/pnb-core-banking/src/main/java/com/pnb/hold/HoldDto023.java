package com.pnb.hold;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * HoldDto023 — Data Transfer Object for hold operations.
 * Variant 23 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HoldDto023 {

    @JsonProperty("holdField000")
    private Integer holdField000;

    @JsonProperty("holdField001")
    private LocalDate holdField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("holdField002")
    private BigDecimal holdField002;

    @JsonProperty("holdField003")
    private Boolean holdField003;

    @JsonProperty("holdField004")
    private Boolean holdField004;

    @JsonProperty("holdField005")
    private Double holdField005;

    @JsonProperty("holdField006")
    private Long holdField006;

    @JsonProperty("holdField007")
    private LocalDate holdField007;

    @Size(max = 100)
    @JsonProperty("holdField008")
    private String holdField008;

    @JsonProperty("holdField009")
    private Long holdField009;

    @Size(max = 40)
    @JsonProperty("holdField010")
    private String holdField010;

    @DecimalMin(value = "0.00")
    @JsonProperty("holdField011")
    private BigDecimal holdField011;

    @JsonProperty("holdField012")
    private Boolean holdField012;

    @JsonProperty("holdField013")
    private LocalDate holdField013;

    @JsonProperty("holdField014")
    private Double holdField014;

    @JsonProperty("holdField015")
    private Boolean holdField015;

    @Size(max = 60)
    @JsonProperty("holdField016")
    private String holdField016;

    @JsonProperty("holdField017")
    private Double holdField017;

    @DecimalMin(value = "0.00")
    @JsonProperty("holdField018")
    private BigDecimal holdField018;

    public HoldDto023() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final HoldDto023 instance = new HoldDto023();

        public Builder holdField000(Integer val) { instance.holdField000 = val; return this; }
        public Builder holdField001(LocalDate val) { instance.holdField001 = val; return this; }
        public Builder holdField002(BigDecimal val) { instance.holdField002 = val; return this; }
        public Builder holdField003(Boolean val) { instance.holdField003 = val; return this; }
        public Builder holdField004(Boolean val) { instance.holdField004 = val; return this; }
        public Builder holdField005(Double val) { instance.holdField005 = val; return this; }
        public Builder holdField006(Long val) { instance.holdField006 = val; return this; }
        public Builder holdField007(LocalDate val) { instance.holdField007 = val; return this; }
        public Builder holdField008(String val) { instance.holdField008 = val; return this; }
        public Builder holdField009(Long val) { instance.holdField009 = val; return this; }
        public Builder holdField010(String val) { instance.holdField010 = val; return this; }
        public Builder holdField011(BigDecimal val) { instance.holdField011 = val; return this; }
        public Builder holdField012(Boolean val) { instance.holdField012 = val; return this; }
        public Builder holdField013(LocalDate val) { instance.holdField013 = val; return this; }
        public Builder holdField014(Double val) { instance.holdField014 = val; return this; }
        public Builder holdField015(Boolean val) { instance.holdField015 = val; return this; }
        public Builder holdField016(String val) { instance.holdField016 = val; return this; }
        public Builder holdField017(Double val) { instance.holdField017 = val; return this; }
        public Builder holdField018(BigDecimal val) { instance.holdField018 = val; return this; }
        public HoldDto023 build() { return instance; }
    }

    public Integer getHoldField000() { return holdField000; }
    public void setHoldField000(Integer holdField000) { this.holdField000 = holdField000; }

    public LocalDate getHoldField001() { return holdField001; }
    public void setHoldField001(LocalDate holdField001) { this.holdField001 = holdField001; }

    public BigDecimal getHoldField002() { return holdField002; }
    public void setHoldField002(BigDecimal holdField002) { this.holdField002 = holdField002; }

    public Boolean getHoldField003() { return holdField003; }
    public void setHoldField003(Boolean holdField003) { this.holdField003 = holdField003; }

    public Boolean getHoldField004() { return holdField004; }
    public void setHoldField004(Boolean holdField004) { this.holdField004 = holdField004; }

    public Double getHoldField005() { return holdField005; }
    public void setHoldField005(Double holdField005) { this.holdField005 = holdField005; }

    public Long getHoldField006() { return holdField006; }
    public void setHoldField006(Long holdField006) { this.holdField006 = holdField006; }

    public LocalDate getHoldField007() { return holdField007; }
    public void setHoldField007(LocalDate holdField007) { this.holdField007 = holdField007; }

    public String getHoldField008() { return holdField008; }
    public void setHoldField008(String holdField008) { this.holdField008 = holdField008; }

    public Long getHoldField009() { return holdField009; }
    public void setHoldField009(Long holdField009) { this.holdField009 = holdField009; }

    public String getHoldField010() { return holdField010; }
    public void setHoldField010(String holdField010) { this.holdField010 = holdField010; }

    public BigDecimal getHoldField011() { return holdField011; }
    public void setHoldField011(BigDecimal holdField011) { this.holdField011 = holdField011; }

    public Boolean getHoldField012() { return holdField012; }
    public void setHoldField012(Boolean holdField012) { this.holdField012 = holdField012; }

    public LocalDate getHoldField013() { return holdField013; }
    public void setHoldField013(LocalDate holdField013) { this.holdField013 = holdField013; }

    public Double getHoldField014() { return holdField014; }
    public void setHoldField014(Double holdField014) { this.holdField014 = holdField014; }

    public Boolean getHoldField015() { return holdField015; }
    public void setHoldField015(Boolean holdField015) { this.holdField015 = holdField015; }

    public String getHoldField016() { return holdField016; }
    public void setHoldField016(String holdField016) { this.holdField016 = holdField016; }

    public Double getHoldField017() { return holdField017; }
    public void setHoldField017(Double holdField017) { this.holdField017 = holdField017; }

    public BigDecimal getHoldField018() { return holdField018; }
    public void setHoldField018(BigDecimal holdField018) { this.holdField018 = holdField018; }

    @Override
    public String toString() {
        return "HoldDto023{" +
            "holdField000=" + holdField000 + ", " +
            "holdField001=" + holdField001 + ", " +
            "holdField002=" + holdField002 + ", " +
            "holdField003=" + holdField003 + ", " +
            "holdField004=" + holdField004 + ", " +
            "}";
    }
}
