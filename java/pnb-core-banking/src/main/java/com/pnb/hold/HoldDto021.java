package com.pnb.hold;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * HoldDto021 — Data Transfer Object for hold operations.
 * Variant 21 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HoldDto021 {

    @JsonProperty("holdField000")
    private Boolean holdField000;

    @DecimalMin(value = "0.00")
    @JsonProperty("holdField001")
    private BigDecimal holdField001;

    @JsonProperty("holdField002")
    private Boolean holdField002;

    @JsonProperty("holdField003")
    private LocalDate holdField003;

    @JsonProperty("holdField004")
    private LocalDate holdField004;

    @Size(max = 200)
    @JsonProperty("holdField005")
    private String holdField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("holdField006")
    private BigDecimal holdField006;

    @JsonProperty("holdField007")
    private Integer holdField007;

    @JsonProperty("holdField008")
    private Boolean holdField008;

    @JsonProperty("holdField009")
    private Long holdField009;

    @JsonProperty("holdField010")
    private Boolean holdField010;

    @JsonProperty("holdField011")
    private Long holdField011;

    @Size(max = 200)
    @JsonProperty("holdField012")
    private String holdField012;

    @DecimalMin(value = "0.00")
    @JsonProperty("holdField013")
    private BigDecimal holdField013;

    @JsonProperty("holdField014")
    private Integer holdField014;

    @Size(max = 40)
    @JsonProperty("holdField015")
    private String holdField015;

    @Size(max = 20)
    @JsonProperty("holdField016")
    private String holdField016;

    public HoldDto021() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final HoldDto021 instance = new HoldDto021();

        public Builder holdField000(Boolean val) { instance.holdField000 = val; return this; }
        public Builder holdField001(BigDecimal val) { instance.holdField001 = val; return this; }
        public Builder holdField002(Boolean val) { instance.holdField002 = val; return this; }
        public Builder holdField003(LocalDate val) { instance.holdField003 = val; return this; }
        public Builder holdField004(LocalDate val) { instance.holdField004 = val; return this; }
        public Builder holdField005(String val) { instance.holdField005 = val; return this; }
        public Builder holdField006(BigDecimal val) { instance.holdField006 = val; return this; }
        public Builder holdField007(Integer val) { instance.holdField007 = val; return this; }
        public Builder holdField008(Boolean val) { instance.holdField008 = val; return this; }
        public Builder holdField009(Long val) { instance.holdField009 = val; return this; }
        public Builder holdField010(Boolean val) { instance.holdField010 = val; return this; }
        public Builder holdField011(Long val) { instance.holdField011 = val; return this; }
        public Builder holdField012(String val) { instance.holdField012 = val; return this; }
        public Builder holdField013(BigDecimal val) { instance.holdField013 = val; return this; }
        public Builder holdField014(Integer val) { instance.holdField014 = val; return this; }
        public Builder holdField015(String val) { instance.holdField015 = val; return this; }
        public Builder holdField016(String val) { instance.holdField016 = val; return this; }
        public HoldDto021 build() { return instance; }
    }

    public Boolean getHoldField000() { return holdField000; }
    public void setHoldField000(Boolean holdField000) { this.holdField000 = holdField000; }

    public BigDecimal getHoldField001() { return holdField001; }
    public void setHoldField001(BigDecimal holdField001) { this.holdField001 = holdField001; }

    public Boolean getHoldField002() { return holdField002; }
    public void setHoldField002(Boolean holdField002) { this.holdField002 = holdField002; }

    public LocalDate getHoldField003() { return holdField003; }
    public void setHoldField003(LocalDate holdField003) { this.holdField003 = holdField003; }

    public LocalDate getHoldField004() { return holdField004; }
    public void setHoldField004(LocalDate holdField004) { this.holdField004 = holdField004; }

    public String getHoldField005() { return holdField005; }
    public void setHoldField005(String holdField005) { this.holdField005 = holdField005; }

    public BigDecimal getHoldField006() { return holdField006; }
    public void setHoldField006(BigDecimal holdField006) { this.holdField006 = holdField006; }

    public Integer getHoldField007() { return holdField007; }
    public void setHoldField007(Integer holdField007) { this.holdField007 = holdField007; }

    public Boolean getHoldField008() { return holdField008; }
    public void setHoldField008(Boolean holdField008) { this.holdField008 = holdField008; }

    public Long getHoldField009() { return holdField009; }
    public void setHoldField009(Long holdField009) { this.holdField009 = holdField009; }

    public Boolean getHoldField010() { return holdField010; }
    public void setHoldField010(Boolean holdField010) { this.holdField010 = holdField010; }

    public Long getHoldField011() { return holdField011; }
    public void setHoldField011(Long holdField011) { this.holdField011 = holdField011; }

    public String getHoldField012() { return holdField012; }
    public void setHoldField012(String holdField012) { this.holdField012 = holdField012; }

    public BigDecimal getHoldField013() { return holdField013; }
    public void setHoldField013(BigDecimal holdField013) { this.holdField013 = holdField013; }

    public Integer getHoldField014() { return holdField014; }
    public void setHoldField014(Integer holdField014) { this.holdField014 = holdField014; }

    public String getHoldField015() { return holdField015; }
    public void setHoldField015(String holdField015) { this.holdField015 = holdField015; }

    public String getHoldField016() { return holdField016; }
    public void setHoldField016(String holdField016) { this.holdField016 = holdField016; }

    @Override
    public String toString() {
        return "HoldDto021{" +
            "holdField000=" + holdField000 + ", " +
            "holdField001=" + holdField001 + ", " +
            "holdField002=" + holdField002 + ", " +
            "holdField003=" + holdField003 + ", " +
            "holdField004=" + holdField004 + ", " +
            "}";
    }
}
