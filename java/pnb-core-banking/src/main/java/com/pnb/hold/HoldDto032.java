package com.pnb.hold;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * HoldDto032 — Data Transfer Object for hold operations.
 * Variant 32 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HoldDto032 {

    @JsonProperty("holdField000")
    private Double holdField000;

    @JsonProperty("holdField001")
    private Long holdField001;

    @JsonProperty("holdField002")
    private Integer holdField002;

    @JsonProperty("holdField003")
    private Long holdField003;

    @JsonProperty("holdField004")
    private Long holdField004;

    @JsonProperty("holdField005")
    private LocalDate holdField005;

    @Size(max = 20)
    @JsonProperty("holdField006")
    private String holdField006;

    @JsonProperty("holdField007")
    private Integer holdField007;

    @JsonProperty("holdField008")
    private LocalDate holdField008;

    @JsonProperty("holdField009")
    private Integer holdField009;

    @JsonProperty("holdField010")
    private Integer holdField010;

    @JsonProperty("holdField011")
    private Boolean holdField011;

    @JsonProperty("holdField012")
    private LocalDate holdField012;

    @JsonProperty("holdField013")
    private Long holdField013;

    @DecimalMin(value = "0.00")
    @JsonProperty("holdField014")
    private BigDecimal holdField014;

    @Size(max = 100)
    @JsonProperty("holdField015")
    private String holdField015;

    public HoldDto032() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final HoldDto032 instance = new HoldDto032();

        public Builder holdField000(Double val) { instance.holdField000 = val; return this; }
        public Builder holdField001(Long val) { instance.holdField001 = val; return this; }
        public Builder holdField002(Integer val) { instance.holdField002 = val; return this; }
        public Builder holdField003(Long val) { instance.holdField003 = val; return this; }
        public Builder holdField004(Long val) { instance.holdField004 = val; return this; }
        public Builder holdField005(LocalDate val) { instance.holdField005 = val; return this; }
        public Builder holdField006(String val) { instance.holdField006 = val; return this; }
        public Builder holdField007(Integer val) { instance.holdField007 = val; return this; }
        public Builder holdField008(LocalDate val) { instance.holdField008 = val; return this; }
        public Builder holdField009(Integer val) { instance.holdField009 = val; return this; }
        public Builder holdField010(Integer val) { instance.holdField010 = val; return this; }
        public Builder holdField011(Boolean val) { instance.holdField011 = val; return this; }
        public Builder holdField012(LocalDate val) { instance.holdField012 = val; return this; }
        public Builder holdField013(Long val) { instance.holdField013 = val; return this; }
        public Builder holdField014(BigDecimal val) { instance.holdField014 = val; return this; }
        public Builder holdField015(String val) { instance.holdField015 = val; return this; }
        public HoldDto032 build() { return instance; }
    }

    public Double getHoldField000() { return holdField000; }
    public void setHoldField000(Double holdField000) { this.holdField000 = holdField000; }

    public Long getHoldField001() { return holdField001; }
    public void setHoldField001(Long holdField001) { this.holdField001 = holdField001; }

    public Integer getHoldField002() { return holdField002; }
    public void setHoldField002(Integer holdField002) { this.holdField002 = holdField002; }

    public Long getHoldField003() { return holdField003; }
    public void setHoldField003(Long holdField003) { this.holdField003 = holdField003; }

    public Long getHoldField004() { return holdField004; }
    public void setHoldField004(Long holdField004) { this.holdField004 = holdField004; }

    public LocalDate getHoldField005() { return holdField005; }
    public void setHoldField005(LocalDate holdField005) { this.holdField005 = holdField005; }

    public String getHoldField006() { return holdField006; }
    public void setHoldField006(String holdField006) { this.holdField006 = holdField006; }

    public Integer getHoldField007() { return holdField007; }
    public void setHoldField007(Integer holdField007) { this.holdField007 = holdField007; }

    public LocalDate getHoldField008() { return holdField008; }
    public void setHoldField008(LocalDate holdField008) { this.holdField008 = holdField008; }

    public Integer getHoldField009() { return holdField009; }
    public void setHoldField009(Integer holdField009) { this.holdField009 = holdField009; }

    public Integer getHoldField010() { return holdField010; }
    public void setHoldField010(Integer holdField010) { this.holdField010 = holdField010; }

    public Boolean getHoldField011() { return holdField011; }
    public void setHoldField011(Boolean holdField011) { this.holdField011 = holdField011; }

    public LocalDate getHoldField012() { return holdField012; }
    public void setHoldField012(LocalDate holdField012) { this.holdField012 = holdField012; }

    public Long getHoldField013() { return holdField013; }
    public void setHoldField013(Long holdField013) { this.holdField013 = holdField013; }

    public BigDecimal getHoldField014() { return holdField014; }
    public void setHoldField014(BigDecimal holdField014) { this.holdField014 = holdField014; }

    public String getHoldField015() { return holdField015; }
    public void setHoldField015(String holdField015) { this.holdField015 = holdField015; }

    @Override
    public String toString() {
        return "HoldDto032{" +
            "holdField000=" + holdField000 + ", " +
            "holdField001=" + holdField001 + ", " +
            "holdField002=" + holdField002 + ", " +
            "holdField003=" + holdField003 + ", " +
            "holdField004=" + holdField004 + ", " +
            "}";
    }
}
