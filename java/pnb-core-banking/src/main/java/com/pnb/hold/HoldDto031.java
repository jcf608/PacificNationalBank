package com.pnb.hold;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * HoldDto031 — Data Transfer Object for hold operations.
 * Variant 31 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HoldDto031 {

    @DecimalMin(value = "0.00")
    @JsonProperty("holdField000")
    private BigDecimal holdField000;

    @JsonProperty("holdField001")
    private Boolean holdField001;

    @JsonProperty("holdField002")
    private Long holdField002;

    @Size(max = 20)
    @JsonProperty("holdField003")
    private String holdField003;

    @JsonProperty("holdField004")
    private LocalDate holdField004;

    @JsonProperty("holdField005")
    private Long holdField005;

    @JsonProperty("holdField006")
    private Long holdField006;

    @Size(max = 20)
    @JsonProperty("holdField007")
    private String holdField007;

    @JsonProperty("holdField008")
    private Long holdField008;

    @JsonProperty("holdField009")
    private Boolean holdField009;

    @JsonProperty("holdField010")
    private Boolean holdField010;

    @Size(max = 60)
    @JsonProperty("holdField011")
    private String holdField011;

    @Size(max = 100)
    @JsonProperty("holdField012")
    private String holdField012;

    @JsonProperty("holdField013")
    private LocalDate holdField013;

    @JsonProperty("holdField014")
    private Double holdField014;

    public HoldDto031() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final HoldDto031 instance = new HoldDto031();

        public Builder holdField000(BigDecimal val) { instance.holdField000 = val; return this; }
        public Builder holdField001(Boolean val) { instance.holdField001 = val; return this; }
        public Builder holdField002(Long val) { instance.holdField002 = val; return this; }
        public Builder holdField003(String val) { instance.holdField003 = val; return this; }
        public Builder holdField004(LocalDate val) { instance.holdField004 = val; return this; }
        public Builder holdField005(Long val) { instance.holdField005 = val; return this; }
        public Builder holdField006(Long val) { instance.holdField006 = val; return this; }
        public Builder holdField007(String val) { instance.holdField007 = val; return this; }
        public Builder holdField008(Long val) { instance.holdField008 = val; return this; }
        public Builder holdField009(Boolean val) { instance.holdField009 = val; return this; }
        public Builder holdField010(Boolean val) { instance.holdField010 = val; return this; }
        public Builder holdField011(String val) { instance.holdField011 = val; return this; }
        public Builder holdField012(String val) { instance.holdField012 = val; return this; }
        public Builder holdField013(LocalDate val) { instance.holdField013 = val; return this; }
        public Builder holdField014(Double val) { instance.holdField014 = val; return this; }
        public HoldDto031 build() { return instance; }
    }

    public BigDecimal getHoldField000() { return holdField000; }
    public void setHoldField000(BigDecimal holdField000) { this.holdField000 = holdField000; }

    public Boolean getHoldField001() { return holdField001; }
    public void setHoldField001(Boolean holdField001) { this.holdField001 = holdField001; }

    public Long getHoldField002() { return holdField002; }
    public void setHoldField002(Long holdField002) { this.holdField002 = holdField002; }

    public String getHoldField003() { return holdField003; }
    public void setHoldField003(String holdField003) { this.holdField003 = holdField003; }

    public LocalDate getHoldField004() { return holdField004; }
    public void setHoldField004(LocalDate holdField004) { this.holdField004 = holdField004; }

    public Long getHoldField005() { return holdField005; }
    public void setHoldField005(Long holdField005) { this.holdField005 = holdField005; }

    public Long getHoldField006() { return holdField006; }
    public void setHoldField006(Long holdField006) { this.holdField006 = holdField006; }

    public String getHoldField007() { return holdField007; }
    public void setHoldField007(String holdField007) { this.holdField007 = holdField007; }

    public Long getHoldField008() { return holdField008; }
    public void setHoldField008(Long holdField008) { this.holdField008 = holdField008; }

    public Boolean getHoldField009() { return holdField009; }
    public void setHoldField009(Boolean holdField009) { this.holdField009 = holdField009; }

    public Boolean getHoldField010() { return holdField010; }
    public void setHoldField010(Boolean holdField010) { this.holdField010 = holdField010; }

    public String getHoldField011() { return holdField011; }
    public void setHoldField011(String holdField011) { this.holdField011 = holdField011; }

    public String getHoldField012() { return holdField012; }
    public void setHoldField012(String holdField012) { this.holdField012 = holdField012; }

    public LocalDate getHoldField013() { return holdField013; }
    public void setHoldField013(LocalDate holdField013) { this.holdField013 = holdField013; }

    public Double getHoldField014() { return holdField014; }
    public void setHoldField014(Double holdField014) { this.holdField014 = holdField014; }

    @Override
    public String toString() {
        return "HoldDto031{" +
            "holdField000=" + holdField000 + ", " +
            "holdField001=" + holdField001 + ", " +
            "holdField002=" + holdField002 + ", " +
            "holdField003=" + holdField003 + ", " +
            "holdField004=" + holdField004 + ", " +
            "}";
    }
}
