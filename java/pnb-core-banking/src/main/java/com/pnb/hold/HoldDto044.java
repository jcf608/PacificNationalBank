package com.pnb.hold;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * HoldDto044 — Data Transfer Object for hold operations.
 * Variant 44 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HoldDto044 {

    @JsonProperty("holdField000")
    private LocalDate holdField000;

    @Size(max = 40)
    @JsonProperty("holdField001")
    private String holdField001;

    @JsonProperty("holdField002")
    private Boolean holdField002;

    @JsonProperty("holdField003")
    private LocalDate holdField003;

    @Size(max = 100)
    @JsonProperty("holdField004")
    private String holdField004;

    @JsonProperty("holdField005")
    private Integer holdField005;

    @JsonProperty("holdField006")
    private Integer holdField006;

    @JsonProperty("holdField007")
    private LocalDate holdField007;

    @JsonProperty("holdField008")
    private LocalDate holdField008;

    @JsonProperty("holdField009")
    private Double holdField009;

    @JsonProperty("holdField010")
    private LocalDate holdField010;

    @JsonProperty("holdField011")
    private Long holdField011;

    @JsonProperty("holdField012")
    private Double holdField012;

    @JsonProperty("holdField013")
    private Boolean holdField013;

    @JsonProperty("holdField014")
    private Double holdField014;

    @JsonProperty("holdField015")
    private Boolean holdField015;

    public HoldDto044() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final HoldDto044 instance = new HoldDto044();

        public Builder holdField000(LocalDate val) { instance.holdField000 = val; return this; }
        public Builder holdField001(String val) { instance.holdField001 = val; return this; }
        public Builder holdField002(Boolean val) { instance.holdField002 = val; return this; }
        public Builder holdField003(LocalDate val) { instance.holdField003 = val; return this; }
        public Builder holdField004(String val) { instance.holdField004 = val; return this; }
        public Builder holdField005(Integer val) { instance.holdField005 = val; return this; }
        public Builder holdField006(Integer val) { instance.holdField006 = val; return this; }
        public Builder holdField007(LocalDate val) { instance.holdField007 = val; return this; }
        public Builder holdField008(LocalDate val) { instance.holdField008 = val; return this; }
        public Builder holdField009(Double val) { instance.holdField009 = val; return this; }
        public Builder holdField010(LocalDate val) { instance.holdField010 = val; return this; }
        public Builder holdField011(Long val) { instance.holdField011 = val; return this; }
        public Builder holdField012(Double val) { instance.holdField012 = val; return this; }
        public Builder holdField013(Boolean val) { instance.holdField013 = val; return this; }
        public Builder holdField014(Double val) { instance.holdField014 = val; return this; }
        public Builder holdField015(Boolean val) { instance.holdField015 = val; return this; }
        public HoldDto044 build() { return instance; }
    }

    public LocalDate getHoldField000() { return holdField000; }
    public void setHoldField000(LocalDate holdField000) { this.holdField000 = holdField000; }

    public String getHoldField001() { return holdField001; }
    public void setHoldField001(String holdField001) { this.holdField001 = holdField001; }

    public Boolean getHoldField002() { return holdField002; }
    public void setHoldField002(Boolean holdField002) { this.holdField002 = holdField002; }

    public LocalDate getHoldField003() { return holdField003; }
    public void setHoldField003(LocalDate holdField003) { this.holdField003 = holdField003; }

    public String getHoldField004() { return holdField004; }
    public void setHoldField004(String holdField004) { this.holdField004 = holdField004; }

    public Integer getHoldField005() { return holdField005; }
    public void setHoldField005(Integer holdField005) { this.holdField005 = holdField005; }

    public Integer getHoldField006() { return holdField006; }
    public void setHoldField006(Integer holdField006) { this.holdField006 = holdField006; }

    public LocalDate getHoldField007() { return holdField007; }
    public void setHoldField007(LocalDate holdField007) { this.holdField007 = holdField007; }

    public LocalDate getHoldField008() { return holdField008; }
    public void setHoldField008(LocalDate holdField008) { this.holdField008 = holdField008; }

    public Double getHoldField009() { return holdField009; }
    public void setHoldField009(Double holdField009) { this.holdField009 = holdField009; }

    public LocalDate getHoldField010() { return holdField010; }
    public void setHoldField010(LocalDate holdField010) { this.holdField010 = holdField010; }

    public Long getHoldField011() { return holdField011; }
    public void setHoldField011(Long holdField011) { this.holdField011 = holdField011; }

    public Double getHoldField012() { return holdField012; }
    public void setHoldField012(Double holdField012) { this.holdField012 = holdField012; }

    public Boolean getHoldField013() { return holdField013; }
    public void setHoldField013(Boolean holdField013) { this.holdField013 = holdField013; }

    public Double getHoldField014() { return holdField014; }
    public void setHoldField014(Double holdField014) { this.holdField014 = holdField014; }

    public Boolean getHoldField015() { return holdField015; }
    public void setHoldField015(Boolean holdField015) { this.holdField015 = holdField015; }

    @Override
    public String toString() {
        return "HoldDto044{" +
            "holdField000=" + holdField000 + ", " +
            "holdField001=" + holdField001 + ", " +
            "holdField002=" + holdField002 + ", " +
            "holdField003=" + holdField003 + ", " +
            "holdField004=" + holdField004 + ", " +
            "}";
    }
}
