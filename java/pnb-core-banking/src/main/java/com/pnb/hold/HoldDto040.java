package com.pnb.hold;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * HoldDto040 — Data Transfer Object for hold operations.
 * Variant 40 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HoldDto040 {

    @JsonProperty("holdField000")
    private Boolean holdField000;

    @JsonProperty("holdField001")
    private Integer holdField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("holdField002")
    private BigDecimal holdField002;

    @Size(max = 40)
    @JsonProperty("holdField003")
    private String holdField003;

    @JsonProperty("holdField004")
    private Boolean holdField004;

    @JsonProperty("holdField005")
    private Boolean holdField005;

    @Size(max = 20)
    @JsonProperty("holdField006")
    private String holdField006;

    @JsonProperty("holdField007")
    private LocalDate holdField007;

    @JsonProperty("holdField008")
    private Boolean holdField008;

    @JsonProperty("holdField009")
    private LocalDate holdField009;

    @JsonProperty("holdField010")
    private Long holdField010;

    @JsonProperty("holdField011")
    private LocalDate holdField011;

    public HoldDto040() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final HoldDto040 instance = new HoldDto040();

        public Builder holdField000(Boolean val) { instance.holdField000 = val; return this; }
        public Builder holdField001(Integer val) { instance.holdField001 = val; return this; }
        public Builder holdField002(BigDecimal val) { instance.holdField002 = val; return this; }
        public Builder holdField003(String val) { instance.holdField003 = val; return this; }
        public Builder holdField004(Boolean val) { instance.holdField004 = val; return this; }
        public Builder holdField005(Boolean val) { instance.holdField005 = val; return this; }
        public Builder holdField006(String val) { instance.holdField006 = val; return this; }
        public Builder holdField007(LocalDate val) { instance.holdField007 = val; return this; }
        public Builder holdField008(Boolean val) { instance.holdField008 = val; return this; }
        public Builder holdField009(LocalDate val) { instance.holdField009 = val; return this; }
        public Builder holdField010(Long val) { instance.holdField010 = val; return this; }
        public Builder holdField011(LocalDate val) { instance.holdField011 = val; return this; }
        public HoldDto040 build() { return instance; }
    }

    public Boolean getHoldField000() { return holdField000; }
    public void setHoldField000(Boolean holdField000) { this.holdField000 = holdField000; }

    public Integer getHoldField001() { return holdField001; }
    public void setHoldField001(Integer holdField001) { this.holdField001 = holdField001; }

    public BigDecimal getHoldField002() { return holdField002; }
    public void setHoldField002(BigDecimal holdField002) { this.holdField002 = holdField002; }

    public String getHoldField003() { return holdField003; }
    public void setHoldField003(String holdField003) { this.holdField003 = holdField003; }

    public Boolean getHoldField004() { return holdField004; }
    public void setHoldField004(Boolean holdField004) { this.holdField004 = holdField004; }

    public Boolean getHoldField005() { return holdField005; }
    public void setHoldField005(Boolean holdField005) { this.holdField005 = holdField005; }

    public String getHoldField006() { return holdField006; }
    public void setHoldField006(String holdField006) { this.holdField006 = holdField006; }

    public LocalDate getHoldField007() { return holdField007; }
    public void setHoldField007(LocalDate holdField007) { this.holdField007 = holdField007; }

    public Boolean getHoldField008() { return holdField008; }
    public void setHoldField008(Boolean holdField008) { this.holdField008 = holdField008; }

    public LocalDate getHoldField009() { return holdField009; }
    public void setHoldField009(LocalDate holdField009) { this.holdField009 = holdField009; }

    public Long getHoldField010() { return holdField010; }
    public void setHoldField010(Long holdField010) { this.holdField010 = holdField010; }

    public LocalDate getHoldField011() { return holdField011; }
    public void setHoldField011(LocalDate holdField011) { this.holdField011 = holdField011; }

    @Override
    public String toString() {
        return "HoldDto040{" +
            "holdField000=" + holdField000 + ", " +
            "holdField001=" + holdField001 + ", " +
            "holdField002=" + holdField002 + ", " +
            "holdField003=" + holdField003 + ", " +
            "holdField004=" + holdField004 + ", " +
            "}";
    }
}
