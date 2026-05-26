package com.pnb.hold;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * HoldDto030 — Data Transfer Object for hold operations.
 * Variant 30 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HoldDto030 {

    @DecimalMin(value = "0.00")
    @JsonProperty("holdField000")
    private BigDecimal holdField000;

    @Size(max = 200)
    @JsonProperty("holdField001")
    private String holdField001;

    @JsonProperty("holdField002")
    private Integer holdField002;

    @JsonProperty("holdField003")
    private Boolean holdField003;

    @JsonProperty("holdField004")
    private Boolean holdField004;

    @JsonProperty("holdField005")
    private Integer holdField005;

    @Size(max = 40)
    @JsonProperty("holdField006")
    private String holdField006;

    @JsonProperty("holdField007")
    private LocalDate holdField007;

    @JsonProperty("holdField008")
    private Double holdField008;

    @JsonProperty("holdField009")
    private Long holdField009;

    @JsonProperty("holdField010")
    private Integer holdField010;

    @JsonProperty("holdField011")
    private Integer holdField011;

    @JsonProperty("holdField012")
    private LocalDate holdField012;

    @JsonProperty("holdField013")
    private LocalDate holdField013;

    public HoldDto030() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final HoldDto030 instance = new HoldDto030();

        public Builder holdField000(BigDecimal val) { instance.holdField000 = val; return this; }
        public Builder holdField001(String val) { instance.holdField001 = val; return this; }
        public Builder holdField002(Integer val) { instance.holdField002 = val; return this; }
        public Builder holdField003(Boolean val) { instance.holdField003 = val; return this; }
        public Builder holdField004(Boolean val) { instance.holdField004 = val; return this; }
        public Builder holdField005(Integer val) { instance.holdField005 = val; return this; }
        public Builder holdField006(String val) { instance.holdField006 = val; return this; }
        public Builder holdField007(LocalDate val) { instance.holdField007 = val; return this; }
        public Builder holdField008(Double val) { instance.holdField008 = val; return this; }
        public Builder holdField009(Long val) { instance.holdField009 = val; return this; }
        public Builder holdField010(Integer val) { instance.holdField010 = val; return this; }
        public Builder holdField011(Integer val) { instance.holdField011 = val; return this; }
        public Builder holdField012(LocalDate val) { instance.holdField012 = val; return this; }
        public Builder holdField013(LocalDate val) { instance.holdField013 = val; return this; }
        public HoldDto030 build() { return instance; }
    }

    public BigDecimal getHoldField000() { return holdField000; }
    public void setHoldField000(BigDecimal holdField000) { this.holdField000 = holdField000; }

    public String getHoldField001() { return holdField001; }
    public void setHoldField001(String holdField001) { this.holdField001 = holdField001; }

    public Integer getHoldField002() { return holdField002; }
    public void setHoldField002(Integer holdField002) { this.holdField002 = holdField002; }

    public Boolean getHoldField003() { return holdField003; }
    public void setHoldField003(Boolean holdField003) { this.holdField003 = holdField003; }

    public Boolean getHoldField004() { return holdField004; }
    public void setHoldField004(Boolean holdField004) { this.holdField004 = holdField004; }

    public Integer getHoldField005() { return holdField005; }
    public void setHoldField005(Integer holdField005) { this.holdField005 = holdField005; }

    public String getHoldField006() { return holdField006; }
    public void setHoldField006(String holdField006) { this.holdField006 = holdField006; }

    public LocalDate getHoldField007() { return holdField007; }
    public void setHoldField007(LocalDate holdField007) { this.holdField007 = holdField007; }

    public Double getHoldField008() { return holdField008; }
    public void setHoldField008(Double holdField008) { this.holdField008 = holdField008; }

    public Long getHoldField009() { return holdField009; }
    public void setHoldField009(Long holdField009) { this.holdField009 = holdField009; }

    public Integer getHoldField010() { return holdField010; }
    public void setHoldField010(Integer holdField010) { this.holdField010 = holdField010; }

    public Integer getHoldField011() { return holdField011; }
    public void setHoldField011(Integer holdField011) { this.holdField011 = holdField011; }

    public LocalDate getHoldField012() { return holdField012; }
    public void setHoldField012(LocalDate holdField012) { this.holdField012 = holdField012; }

    public LocalDate getHoldField013() { return holdField013; }
    public void setHoldField013(LocalDate holdField013) { this.holdField013 = holdField013; }

    @Override
    public String toString() {
        return "HoldDto030{" +
            "holdField000=" + holdField000 + ", " +
            "holdField001=" + holdField001 + ", " +
            "holdField002=" + holdField002 + ", " +
            "holdField003=" + holdField003 + ", " +
            "holdField004=" + holdField004 + ", " +
            "}";
    }
}
