package com.pnb.hold;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * HoldDto047 — Data Transfer Object for hold operations.
 * Variant 47 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HoldDto047 {

    @Size(max = 200)
    @JsonProperty("holdField000")
    private String holdField000;

    @Size(max = 100)
    @JsonProperty("holdField001")
    private String holdField001;

    @JsonProperty("holdField002")
    private Double holdField002;

    @JsonProperty("holdField003")
    private Boolean holdField003;

    @JsonProperty("holdField004")
    private Long holdField004;

    @JsonProperty("holdField005")
    private Boolean holdField005;

    @JsonProperty("holdField006")
    private LocalDate holdField006;

    @Size(max = 100)
    @JsonProperty("holdField007")
    private String holdField007;

    @JsonProperty("holdField008")
    private Integer holdField008;

    @JsonProperty("holdField009")
    private Long holdField009;

    @Size(max = 20)
    @JsonProperty("holdField010")
    private String holdField010;

    @JsonProperty("holdField011")
    private Integer holdField011;

    @JsonProperty("holdField012")
    private Long holdField012;

    @DecimalMin(value = "0.00")
    @JsonProperty("holdField013")
    private BigDecimal holdField013;

    @DecimalMin(value = "0.00")
    @JsonProperty("holdField014")
    private BigDecimal holdField014;

    @JsonProperty("holdField015")
    private LocalDate holdField015;

    @DecimalMin(value = "0.00")
    @JsonProperty("holdField016")
    private BigDecimal holdField016;

    @JsonProperty("holdField017")
    private Long holdField017;

    @Size(max = 40)
    @JsonProperty("holdField018")
    private String holdField018;

    public HoldDto047() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final HoldDto047 instance = new HoldDto047();

        public Builder holdField000(String val) { instance.holdField000 = val; return this; }
        public Builder holdField001(String val) { instance.holdField001 = val; return this; }
        public Builder holdField002(Double val) { instance.holdField002 = val; return this; }
        public Builder holdField003(Boolean val) { instance.holdField003 = val; return this; }
        public Builder holdField004(Long val) { instance.holdField004 = val; return this; }
        public Builder holdField005(Boolean val) { instance.holdField005 = val; return this; }
        public Builder holdField006(LocalDate val) { instance.holdField006 = val; return this; }
        public Builder holdField007(String val) { instance.holdField007 = val; return this; }
        public Builder holdField008(Integer val) { instance.holdField008 = val; return this; }
        public Builder holdField009(Long val) { instance.holdField009 = val; return this; }
        public Builder holdField010(String val) { instance.holdField010 = val; return this; }
        public Builder holdField011(Integer val) { instance.holdField011 = val; return this; }
        public Builder holdField012(Long val) { instance.holdField012 = val; return this; }
        public Builder holdField013(BigDecimal val) { instance.holdField013 = val; return this; }
        public Builder holdField014(BigDecimal val) { instance.holdField014 = val; return this; }
        public Builder holdField015(LocalDate val) { instance.holdField015 = val; return this; }
        public Builder holdField016(BigDecimal val) { instance.holdField016 = val; return this; }
        public Builder holdField017(Long val) { instance.holdField017 = val; return this; }
        public Builder holdField018(String val) { instance.holdField018 = val; return this; }
        public HoldDto047 build() { return instance; }
    }

    public String getHoldField000() { return holdField000; }
    public void setHoldField000(String holdField000) { this.holdField000 = holdField000; }

    public String getHoldField001() { return holdField001; }
    public void setHoldField001(String holdField001) { this.holdField001 = holdField001; }

    public Double getHoldField002() { return holdField002; }
    public void setHoldField002(Double holdField002) { this.holdField002 = holdField002; }

    public Boolean getHoldField003() { return holdField003; }
    public void setHoldField003(Boolean holdField003) { this.holdField003 = holdField003; }

    public Long getHoldField004() { return holdField004; }
    public void setHoldField004(Long holdField004) { this.holdField004 = holdField004; }

    public Boolean getHoldField005() { return holdField005; }
    public void setHoldField005(Boolean holdField005) { this.holdField005 = holdField005; }

    public LocalDate getHoldField006() { return holdField006; }
    public void setHoldField006(LocalDate holdField006) { this.holdField006 = holdField006; }

    public String getHoldField007() { return holdField007; }
    public void setHoldField007(String holdField007) { this.holdField007 = holdField007; }

    public Integer getHoldField008() { return holdField008; }
    public void setHoldField008(Integer holdField008) { this.holdField008 = holdField008; }

    public Long getHoldField009() { return holdField009; }
    public void setHoldField009(Long holdField009) { this.holdField009 = holdField009; }

    public String getHoldField010() { return holdField010; }
    public void setHoldField010(String holdField010) { this.holdField010 = holdField010; }

    public Integer getHoldField011() { return holdField011; }
    public void setHoldField011(Integer holdField011) { this.holdField011 = holdField011; }

    public Long getHoldField012() { return holdField012; }
    public void setHoldField012(Long holdField012) { this.holdField012 = holdField012; }

    public BigDecimal getHoldField013() { return holdField013; }
    public void setHoldField013(BigDecimal holdField013) { this.holdField013 = holdField013; }

    public BigDecimal getHoldField014() { return holdField014; }
    public void setHoldField014(BigDecimal holdField014) { this.holdField014 = holdField014; }

    public LocalDate getHoldField015() { return holdField015; }
    public void setHoldField015(LocalDate holdField015) { this.holdField015 = holdField015; }

    public BigDecimal getHoldField016() { return holdField016; }
    public void setHoldField016(BigDecimal holdField016) { this.holdField016 = holdField016; }

    public Long getHoldField017() { return holdField017; }
    public void setHoldField017(Long holdField017) { this.holdField017 = holdField017; }

    public String getHoldField018() { return holdField018; }
    public void setHoldField018(String holdField018) { this.holdField018 = holdField018; }

    @Override
    public String toString() {
        return "HoldDto047{" +
            "holdField000=" + holdField000 + ", " +
            "holdField001=" + holdField001 + ", " +
            "holdField002=" + holdField002 + ", " +
            "holdField003=" + holdField003 + ", " +
            "holdField004=" + holdField004 + ", " +
            "}";
    }
}
