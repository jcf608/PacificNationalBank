package com.pnb.stop;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * StopDto042 — Data Transfer Object for stop operations.
 * Variant 42 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StopDto042 {

    @Size(max = 60)
    @JsonProperty("stopField000")
    private String stopField000;

    @Size(max = 200)
    @JsonProperty("stopField001")
    private String stopField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("stopField002")
    private BigDecimal stopField002;

    @JsonProperty("stopField003")
    private Long stopField003;

    @Size(max = 100)
    @JsonProperty("stopField004")
    private String stopField004;

    @JsonProperty("stopField005")
    private LocalDate stopField005;

    @JsonProperty("stopField006")
    private LocalDate stopField006;

    @JsonProperty("stopField007")
    private LocalDate stopField007;

    @DecimalMin(value = "0.00")
    @JsonProperty("stopField008")
    private BigDecimal stopField008;

    @JsonProperty("stopField009")
    private Integer stopField009;

    @Size(max = 200)
    @JsonProperty("stopField010")
    private String stopField010;

    @JsonProperty("stopField011")
    private Double stopField011;

    @JsonProperty("stopField012")
    private Boolean stopField012;

    @JsonProperty("stopField013")
    private LocalDate stopField013;

    public StopDto042() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final StopDto042 instance = new StopDto042();

        public Builder stopField000(String val) { instance.stopField000 = val; return this; }
        public Builder stopField001(String val) { instance.stopField001 = val; return this; }
        public Builder stopField002(BigDecimal val) { instance.stopField002 = val; return this; }
        public Builder stopField003(Long val) { instance.stopField003 = val; return this; }
        public Builder stopField004(String val) { instance.stopField004 = val; return this; }
        public Builder stopField005(LocalDate val) { instance.stopField005 = val; return this; }
        public Builder stopField006(LocalDate val) { instance.stopField006 = val; return this; }
        public Builder stopField007(LocalDate val) { instance.stopField007 = val; return this; }
        public Builder stopField008(BigDecimal val) { instance.stopField008 = val; return this; }
        public Builder stopField009(Integer val) { instance.stopField009 = val; return this; }
        public Builder stopField010(String val) { instance.stopField010 = val; return this; }
        public Builder stopField011(Double val) { instance.stopField011 = val; return this; }
        public Builder stopField012(Boolean val) { instance.stopField012 = val; return this; }
        public Builder stopField013(LocalDate val) { instance.stopField013 = val; return this; }
        public StopDto042 build() { return instance; }
    }

    public String getStopField000() { return stopField000; }
    public void setStopField000(String stopField000) { this.stopField000 = stopField000; }

    public String getStopField001() { return stopField001; }
    public void setStopField001(String stopField001) { this.stopField001 = stopField001; }

    public BigDecimal getStopField002() { return stopField002; }
    public void setStopField002(BigDecimal stopField002) { this.stopField002 = stopField002; }

    public Long getStopField003() { return stopField003; }
    public void setStopField003(Long stopField003) { this.stopField003 = stopField003; }

    public String getStopField004() { return stopField004; }
    public void setStopField004(String stopField004) { this.stopField004 = stopField004; }

    public LocalDate getStopField005() { return stopField005; }
    public void setStopField005(LocalDate stopField005) { this.stopField005 = stopField005; }

    public LocalDate getStopField006() { return stopField006; }
    public void setStopField006(LocalDate stopField006) { this.stopField006 = stopField006; }

    public LocalDate getStopField007() { return stopField007; }
    public void setStopField007(LocalDate stopField007) { this.stopField007 = stopField007; }

    public BigDecimal getStopField008() { return stopField008; }
    public void setStopField008(BigDecimal stopField008) { this.stopField008 = stopField008; }

    public Integer getStopField009() { return stopField009; }
    public void setStopField009(Integer stopField009) { this.stopField009 = stopField009; }

    public String getStopField010() { return stopField010; }
    public void setStopField010(String stopField010) { this.stopField010 = stopField010; }

    public Double getStopField011() { return stopField011; }
    public void setStopField011(Double stopField011) { this.stopField011 = stopField011; }

    public Boolean getStopField012() { return stopField012; }
    public void setStopField012(Boolean stopField012) { this.stopField012 = stopField012; }

    public LocalDate getStopField013() { return stopField013; }
    public void setStopField013(LocalDate stopField013) { this.stopField013 = stopField013; }

    @Override
    public String toString() {
        return "StopDto042{" +
            "stopField000=" + stopField000 + ", " +
            "stopField001=" + stopField001 + ", " +
            "stopField002=" + stopField002 + ", " +
            "stopField003=" + stopField003 + ", " +
            "stopField004=" + stopField004 + ", " +
            "}";
    }
}
