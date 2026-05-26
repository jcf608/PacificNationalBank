package com.pnb.stop;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * StopDto029 — Data Transfer Object for stop operations.
 * Variant 29 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StopDto029 {

    @JsonProperty("stopField000")
    private Double stopField000;

    @JsonProperty("stopField001")
    private LocalDate stopField001;

    @JsonProperty("stopField002")
    private Long stopField002;

    @DecimalMin(value = "0.00")
    @JsonProperty("stopField003")
    private BigDecimal stopField003;

    @JsonProperty("stopField004")
    private LocalDate stopField004;

    @JsonProperty("stopField005")
    private Boolean stopField005;

    @JsonProperty("stopField006")
    private Boolean stopField006;

    @JsonProperty("stopField007")
    private Integer stopField007;

    @JsonProperty("stopField008")
    private Integer stopField008;

    @JsonProperty("stopField009")
    private Long stopField009;

    @JsonProperty("stopField010")
    private LocalDate stopField010;

    @Size(max = 200)
    @JsonProperty("stopField011")
    private String stopField011;

    @DecimalMin(value = "0.00")
    @JsonProperty("stopField012")
    private BigDecimal stopField012;

    public StopDto029() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final StopDto029 instance = new StopDto029();

        public Builder stopField000(Double val) { instance.stopField000 = val; return this; }
        public Builder stopField001(LocalDate val) { instance.stopField001 = val; return this; }
        public Builder stopField002(Long val) { instance.stopField002 = val; return this; }
        public Builder stopField003(BigDecimal val) { instance.stopField003 = val; return this; }
        public Builder stopField004(LocalDate val) { instance.stopField004 = val; return this; }
        public Builder stopField005(Boolean val) { instance.stopField005 = val; return this; }
        public Builder stopField006(Boolean val) { instance.stopField006 = val; return this; }
        public Builder stopField007(Integer val) { instance.stopField007 = val; return this; }
        public Builder stopField008(Integer val) { instance.stopField008 = val; return this; }
        public Builder stopField009(Long val) { instance.stopField009 = val; return this; }
        public Builder stopField010(LocalDate val) { instance.stopField010 = val; return this; }
        public Builder stopField011(String val) { instance.stopField011 = val; return this; }
        public Builder stopField012(BigDecimal val) { instance.stopField012 = val; return this; }
        public StopDto029 build() { return instance; }
    }

    public Double getStopField000() { return stopField000; }
    public void setStopField000(Double stopField000) { this.stopField000 = stopField000; }

    public LocalDate getStopField001() { return stopField001; }
    public void setStopField001(LocalDate stopField001) { this.stopField001 = stopField001; }

    public Long getStopField002() { return stopField002; }
    public void setStopField002(Long stopField002) { this.stopField002 = stopField002; }

    public BigDecimal getStopField003() { return stopField003; }
    public void setStopField003(BigDecimal stopField003) { this.stopField003 = stopField003; }

    public LocalDate getStopField004() { return stopField004; }
    public void setStopField004(LocalDate stopField004) { this.stopField004 = stopField004; }

    public Boolean getStopField005() { return stopField005; }
    public void setStopField005(Boolean stopField005) { this.stopField005 = stopField005; }

    public Boolean getStopField006() { return stopField006; }
    public void setStopField006(Boolean stopField006) { this.stopField006 = stopField006; }

    public Integer getStopField007() { return stopField007; }
    public void setStopField007(Integer stopField007) { this.stopField007 = stopField007; }

    public Integer getStopField008() { return stopField008; }
    public void setStopField008(Integer stopField008) { this.stopField008 = stopField008; }

    public Long getStopField009() { return stopField009; }
    public void setStopField009(Long stopField009) { this.stopField009 = stopField009; }

    public LocalDate getStopField010() { return stopField010; }
    public void setStopField010(LocalDate stopField010) { this.stopField010 = stopField010; }

    public String getStopField011() { return stopField011; }
    public void setStopField011(String stopField011) { this.stopField011 = stopField011; }

    public BigDecimal getStopField012() { return stopField012; }
    public void setStopField012(BigDecimal stopField012) { this.stopField012 = stopField012; }

    @Override
    public String toString() {
        return "StopDto029{" +
            "stopField000=" + stopField000 + ", " +
            "stopField001=" + stopField001 + ", " +
            "stopField002=" + stopField002 + ", " +
            "stopField003=" + stopField003 + ", " +
            "stopField004=" + stopField004 + ", " +
            "}";
    }
}
