package com.pnb.hold;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * HoldDto029 — Data Transfer Object for hold operations.
 * Variant 29 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HoldDto029 {

    @DecimalMin(value = "0.00")
    @JsonProperty("holdField000")
    private BigDecimal holdField000;

    @JsonProperty("holdField001")
    private Double holdField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("holdField002")
    private BigDecimal holdField002;

    @Size(max = 200)
    @JsonProperty("holdField003")
    private String holdField003;

    @JsonProperty("holdField004")
    private Integer holdField004;

    @JsonProperty("holdField005")
    private Integer holdField005;

    @JsonProperty("holdField006")
    private Boolean holdField006;

    @JsonProperty("holdField007")
    private Integer holdField007;

    @JsonProperty("holdField008")
    private Long holdField008;

    @JsonProperty("holdField009")
    private LocalDate holdField009;

    @Size(max = 60)
    @JsonProperty("holdField010")
    private String holdField010;

    @JsonProperty("holdField011")
    private Integer holdField011;

    @JsonProperty("holdField012")
    private LocalDate holdField012;

    public HoldDto029() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final HoldDto029 instance = new HoldDto029();

        public Builder holdField000(BigDecimal val) { instance.holdField000 = val; return this; }
        public Builder holdField001(Double val) { instance.holdField001 = val; return this; }
        public Builder holdField002(BigDecimal val) { instance.holdField002 = val; return this; }
        public Builder holdField003(String val) { instance.holdField003 = val; return this; }
        public Builder holdField004(Integer val) { instance.holdField004 = val; return this; }
        public Builder holdField005(Integer val) { instance.holdField005 = val; return this; }
        public Builder holdField006(Boolean val) { instance.holdField006 = val; return this; }
        public Builder holdField007(Integer val) { instance.holdField007 = val; return this; }
        public Builder holdField008(Long val) { instance.holdField008 = val; return this; }
        public Builder holdField009(LocalDate val) { instance.holdField009 = val; return this; }
        public Builder holdField010(String val) { instance.holdField010 = val; return this; }
        public Builder holdField011(Integer val) { instance.holdField011 = val; return this; }
        public Builder holdField012(LocalDate val) { instance.holdField012 = val; return this; }
        public HoldDto029 build() { return instance; }
    }

    public BigDecimal getHoldField000() { return holdField000; }
    public void setHoldField000(BigDecimal holdField000) { this.holdField000 = holdField000; }

    public Double getHoldField001() { return holdField001; }
    public void setHoldField001(Double holdField001) { this.holdField001 = holdField001; }

    public BigDecimal getHoldField002() { return holdField002; }
    public void setHoldField002(BigDecimal holdField002) { this.holdField002 = holdField002; }

    public String getHoldField003() { return holdField003; }
    public void setHoldField003(String holdField003) { this.holdField003 = holdField003; }

    public Integer getHoldField004() { return holdField004; }
    public void setHoldField004(Integer holdField004) { this.holdField004 = holdField004; }

    public Integer getHoldField005() { return holdField005; }
    public void setHoldField005(Integer holdField005) { this.holdField005 = holdField005; }

    public Boolean getHoldField006() { return holdField006; }
    public void setHoldField006(Boolean holdField006) { this.holdField006 = holdField006; }

    public Integer getHoldField007() { return holdField007; }
    public void setHoldField007(Integer holdField007) { this.holdField007 = holdField007; }

    public Long getHoldField008() { return holdField008; }
    public void setHoldField008(Long holdField008) { this.holdField008 = holdField008; }

    public LocalDate getHoldField009() { return holdField009; }
    public void setHoldField009(LocalDate holdField009) { this.holdField009 = holdField009; }

    public String getHoldField010() { return holdField010; }
    public void setHoldField010(String holdField010) { this.holdField010 = holdField010; }

    public Integer getHoldField011() { return holdField011; }
    public void setHoldField011(Integer holdField011) { this.holdField011 = holdField011; }

    public LocalDate getHoldField012() { return holdField012; }
    public void setHoldField012(LocalDate holdField012) { this.holdField012 = holdField012; }

    @Override
    public String toString() {
        return "HoldDto029{" +
            "holdField000=" + holdField000 + ", " +
            "holdField001=" + holdField001 + ", " +
            "holdField002=" + holdField002 + ", " +
            "holdField003=" + holdField003 + ", " +
            "holdField004=" + holdField004 + ", " +
            "}";
    }
}
