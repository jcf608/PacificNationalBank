package com.pnb.hold;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * HoldDto053 — Data Transfer Object for hold operations.
 * Variant 53 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HoldDto053 {

    @Size(max = 40)
    @JsonProperty("holdField000")
    private String holdField000;

    @JsonProperty("holdField001")
    private Integer holdField001;

    @JsonProperty("holdField002")
    private Integer holdField002;

    @JsonProperty("holdField003")
    private Boolean holdField003;

    @DecimalMin(value = "0.00")
    @JsonProperty("holdField004")
    private BigDecimal holdField004;

    @JsonProperty("holdField005")
    private Integer holdField005;

    @JsonProperty("holdField006")
    private Long holdField006;

    @Size(max = 100)
    @JsonProperty("holdField007")
    private String holdField007;

    @JsonProperty("holdField008")
    private Long holdField008;

    @JsonProperty("holdField009")
    private Integer holdField009;

    @JsonProperty("holdField010")
    private Long holdField010;

    @JsonProperty("holdField011")
    private LocalDate holdField011;

    @DecimalMin(value = "0.00")
    @JsonProperty("holdField012")
    private BigDecimal holdField012;

    public HoldDto053() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final HoldDto053 instance = new HoldDto053();

        public Builder holdField000(String val) { instance.holdField000 = val; return this; }
        public Builder holdField001(Integer val) { instance.holdField001 = val; return this; }
        public Builder holdField002(Integer val) { instance.holdField002 = val; return this; }
        public Builder holdField003(Boolean val) { instance.holdField003 = val; return this; }
        public Builder holdField004(BigDecimal val) { instance.holdField004 = val; return this; }
        public Builder holdField005(Integer val) { instance.holdField005 = val; return this; }
        public Builder holdField006(Long val) { instance.holdField006 = val; return this; }
        public Builder holdField007(String val) { instance.holdField007 = val; return this; }
        public Builder holdField008(Long val) { instance.holdField008 = val; return this; }
        public Builder holdField009(Integer val) { instance.holdField009 = val; return this; }
        public Builder holdField010(Long val) { instance.holdField010 = val; return this; }
        public Builder holdField011(LocalDate val) { instance.holdField011 = val; return this; }
        public Builder holdField012(BigDecimal val) { instance.holdField012 = val; return this; }
        public HoldDto053 build() { return instance; }
    }

    public String getHoldField000() { return holdField000; }
    public void setHoldField000(String holdField000) { this.holdField000 = holdField000; }

    public Integer getHoldField001() { return holdField001; }
    public void setHoldField001(Integer holdField001) { this.holdField001 = holdField001; }

    public Integer getHoldField002() { return holdField002; }
    public void setHoldField002(Integer holdField002) { this.holdField002 = holdField002; }

    public Boolean getHoldField003() { return holdField003; }
    public void setHoldField003(Boolean holdField003) { this.holdField003 = holdField003; }

    public BigDecimal getHoldField004() { return holdField004; }
    public void setHoldField004(BigDecimal holdField004) { this.holdField004 = holdField004; }

    public Integer getHoldField005() { return holdField005; }
    public void setHoldField005(Integer holdField005) { this.holdField005 = holdField005; }

    public Long getHoldField006() { return holdField006; }
    public void setHoldField006(Long holdField006) { this.holdField006 = holdField006; }

    public String getHoldField007() { return holdField007; }
    public void setHoldField007(String holdField007) { this.holdField007 = holdField007; }

    public Long getHoldField008() { return holdField008; }
    public void setHoldField008(Long holdField008) { this.holdField008 = holdField008; }

    public Integer getHoldField009() { return holdField009; }
    public void setHoldField009(Integer holdField009) { this.holdField009 = holdField009; }

    public Long getHoldField010() { return holdField010; }
    public void setHoldField010(Long holdField010) { this.holdField010 = holdField010; }

    public LocalDate getHoldField011() { return holdField011; }
    public void setHoldField011(LocalDate holdField011) { this.holdField011 = holdField011; }

    public BigDecimal getHoldField012() { return holdField012; }
    public void setHoldField012(BigDecimal holdField012) { this.holdField012 = holdField012; }

    @Override
    public String toString() {
        return "HoldDto053{" +
            "holdField000=" + holdField000 + ", " +
            "holdField001=" + holdField001 + ", " +
            "holdField002=" + holdField002 + ", " +
            "holdField003=" + holdField003 + ", " +
            "holdField004=" + holdField004 + ", " +
            "}";
    }
}
