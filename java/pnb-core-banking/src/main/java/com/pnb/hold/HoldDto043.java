package com.pnb.hold;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * HoldDto043 — Data Transfer Object for hold operations.
 * Variant 43 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HoldDto043 {

    @JsonProperty("holdField000")
    private LocalDate holdField000;

    @JsonProperty("holdField001")
    private Long holdField001;

    @JsonProperty("holdField002")
    private Long holdField002;

    @JsonProperty("holdField003")
    private Long holdField003;

    @JsonProperty("holdField004")
    private Double holdField004;

    @Size(max = 100)
    @JsonProperty("holdField005")
    private String holdField005;

    @JsonProperty("holdField006")
    private Boolean holdField006;

    @JsonProperty("holdField007")
    private LocalDate holdField007;

    @JsonProperty("holdField008")
    private Double holdField008;

    @JsonProperty("holdField009")
    private Boolean holdField009;

    @Size(max = 60)
    @JsonProperty("holdField010")
    private String holdField010;

    @JsonProperty("holdField011")
    private Integer holdField011;

    @JsonProperty("holdField012")
    private Integer holdField012;

    @JsonProperty("holdField013")
    private Long holdField013;

    @JsonProperty("holdField014")
    private Double holdField014;

    public HoldDto043() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final HoldDto043 instance = new HoldDto043();

        public Builder holdField000(LocalDate val) { instance.holdField000 = val; return this; }
        public Builder holdField001(Long val) { instance.holdField001 = val; return this; }
        public Builder holdField002(Long val) { instance.holdField002 = val; return this; }
        public Builder holdField003(Long val) { instance.holdField003 = val; return this; }
        public Builder holdField004(Double val) { instance.holdField004 = val; return this; }
        public Builder holdField005(String val) { instance.holdField005 = val; return this; }
        public Builder holdField006(Boolean val) { instance.holdField006 = val; return this; }
        public Builder holdField007(LocalDate val) { instance.holdField007 = val; return this; }
        public Builder holdField008(Double val) { instance.holdField008 = val; return this; }
        public Builder holdField009(Boolean val) { instance.holdField009 = val; return this; }
        public Builder holdField010(String val) { instance.holdField010 = val; return this; }
        public Builder holdField011(Integer val) { instance.holdField011 = val; return this; }
        public Builder holdField012(Integer val) { instance.holdField012 = val; return this; }
        public Builder holdField013(Long val) { instance.holdField013 = val; return this; }
        public Builder holdField014(Double val) { instance.holdField014 = val; return this; }
        public HoldDto043 build() { return instance; }
    }

    public LocalDate getHoldField000() { return holdField000; }
    public void setHoldField000(LocalDate holdField000) { this.holdField000 = holdField000; }

    public Long getHoldField001() { return holdField001; }
    public void setHoldField001(Long holdField001) { this.holdField001 = holdField001; }

    public Long getHoldField002() { return holdField002; }
    public void setHoldField002(Long holdField002) { this.holdField002 = holdField002; }

    public Long getHoldField003() { return holdField003; }
    public void setHoldField003(Long holdField003) { this.holdField003 = holdField003; }

    public Double getHoldField004() { return holdField004; }
    public void setHoldField004(Double holdField004) { this.holdField004 = holdField004; }

    public String getHoldField005() { return holdField005; }
    public void setHoldField005(String holdField005) { this.holdField005 = holdField005; }

    public Boolean getHoldField006() { return holdField006; }
    public void setHoldField006(Boolean holdField006) { this.holdField006 = holdField006; }

    public LocalDate getHoldField007() { return holdField007; }
    public void setHoldField007(LocalDate holdField007) { this.holdField007 = holdField007; }

    public Double getHoldField008() { return holdField008; }
    public void setHoldField008(Double holdField008) { this.holdField008 = holdField008; }

    public Boolean getHoldField009() { return holdField009; }
    public void setHoldField009(Boolean holdField009) { this.holdField009 = holdField009; }

    public String getHoldField010() { return holdField010; }
    public void setHoldField010(String holdField010) { this.holdField010 = holdField010; }

    public Integer getHoldField011() { return holdField011; }
    public void setHoldField011(Integer holdField011) { this.holdField011 = holdField011; }

    public Integer getHoldField012() { return holdField012; }
    public void setHoldField012(Integer holdField012) { this.holdField012 = holdField012; }

    public Long getHoldField013() { return holdField013; }
    public void setHoldField013(Long holdField013) { this.holdField013 = holdField013; }

    public Double getHoldField014() { return holdField014; }
    public void setHoldField014(Double holdField014) { this.holdField014 = holdField014; }

    @Override
    public String toString() {
        return "HoldDto043{" +
            "holdField000=" + holdField000 + ", " +
            "holdField001=" + holdField001 + ", " +
            "holdField002=" + holdField002 + ", " +
            "holdField003=" + holdField003 + ", " +
            "holdField004=" + holdField004 + ", " +
            "}";
    }
}
