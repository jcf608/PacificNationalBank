package com.pnb.stop;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * StopDto052 — Data Transfer Object for stop operations.
 * Variant 52 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StopDto052 {

    @JsonProperty("stopField000")
    private Long stopField000;

    @JsonProperty("stopField001")
    private LocalDate stopField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("stopField002")
    private BigDecimal stopField002;

    @JsonProperty("stopField003")
    private Integer stopField003;

    @JsonProperty("stopField004")
    private Long stopField004;

    @JsonProperty("stopField005")
    private Boolean stopField005;

    @JsonProperty("stopField006")
    private Long stopField006;

    @JsonProperty("stopField007")
    private Long stopField007;

    @JsonProperty("stopField008")
    private LocalDate stopField008;

    @JsonProperty("stopField009")
    private LocalDate stopField009;

    @Size(max = 100)
    @JsonProperty("stopField010")
    private String stopField010;

    @DecimalMin(value = "0.00")
    @JsonProperty("stopField011")
    private BigDecimal stopField011;

    public StopDto052() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final StopDto052 instance = new StopDto052();

        public Builder stopField000(Long val) { instance.stopField000 = val; return this; }
        public Builder stopField001(LocalDate val) { instance.stopField001 = val; return this; }
        public Builder stopField002(BigDecimal val) { instance.stopField002 = val; return this; }
        public Builder stopField003(Integer val) { instance.stopField003 = val; return this; }
        public Builder stopField004(Long val) { instance.stopField004 = val; return this; }
        public Builder stopField005(Boolean val) { instance.stopField005 = val; return this; }
        public Builder stopField006(Long val) { instance.stopField006 = val; return this; }
        public Builder stopField007(Long val) { instance.stopField007 = val; return this; }
        public Builder stopField008(LocalDate val) { instance.stopField008 = val; return this; }
        public Builder stopField009(LocalDate val) { instance.stopField009 = val; return this; }
        public Builder stopField010(String val) { instance.stopField010 = val; return this; }
        public Builder stopField011(BigDecimal val) { instance.stopField011 = val; return this; }
        public StopDto052 build() { return instance; }
    }

    public Long getStopField000() { return stopField000; }
    public void setStopField000(Long stopField000) { this.stopField000 = stopField000; }

    public LocalDate getStopField001() { return stopField001; }
    public void setStopField001(LocalDate stopField001) { this.stopField001 = stopField001; }

    public BigDecimal getStopField002() { return stopField002; }
    public void setStopField002(BigDecimal stopField002) { this.stopField002 = stopField002; }

    public Integer getStopField003() { return stopField003; }
    public void setStopField003(Integer stopField003) { this.stopField003 = stopField003; }

    public Long getStopField004() { return stopField004; }
    public void setStopField004(Long stopField004) { this.stopField004 = stopField004; }

    public Boolean getStopField005() { return stopField005; }
    public void setStopField005(Boolean stopField005) { this.stopField005 = stopField005; }

    public Long getStopField006() { return stopField006; }
    public void setStopField006(Long stopField006) { this.stopField006 = stopField006; }

    public Long getStopField007() { return stopField007; }
    public void setStopField007(Long stopField007) { this.stopField007 = stopField007; }

    public LocalDate getStopField008() { return stopField008; }
    public void setStopField008(LocalDate stopField008) { this.stopField008 = stopField008; }

    public LocalDate getStopField009() { return stopField009; }
    public void setStopField009(LocalDate stopField009) { this.stopField009 = stopField009; }

    public String getStopField010() { return stopField010; }
    public void setStopField010(String stopField010) { this.stopField010 = stopField010; }

    public BigDecimal getStopField011() { return stopField011; }
    public void setStopField011(BigDecimal stopField011) { this.stopField011 = stopField011; }

    @Override
    public String toString() {
        return "StopDto052{" +
            "stopField000=" + stopField000 + ", " +
            "stopField001=" + stopField001 + ", " +
            "stopField002=" + stopField002 + ", " +
            "stopField003=" + stopField003 + ", " +
            "stopField004=" + stopField004 + ", " +
            "}";
    }
}
