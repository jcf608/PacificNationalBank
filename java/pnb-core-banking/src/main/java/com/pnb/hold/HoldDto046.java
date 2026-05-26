package com.pnb.hold;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * HoldDto046 — Data Transfer Object for hold operations.
 * Variant 46 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HoldDto046 {

    @JsonProperty("holdField000")
    private Integer holdField000;

    @Size(max = 60)
    @JsonProperty("holdField001")
    private String holdField001;

    @JsonProperty("holdField002")
    private Integer holdField002;

    @DecimalMin(value = "0.00")
    @JsonProperty("holdField003")
    private BigDecimal holdField003;

    @Size(max = 100)
    @JsonProperty("holdField004")
    private String holdField004;

    @JsonProperty("holdField005")
    private LocalDate holdField005;

    @JsonProperty("holdField006")
    private Long holdField006;

    @JsonProperty("holdField007")
    private Boolean holdField007;

    @JsonProperty("holdField008")
    private Integer holdField008;

    @JsonProperty("holdField009")
    private Boolean holdField009;

    @JsonProperty("holdField010")
    private Integer holdField010;

    @DecimalMin(value = "0.00")
    @JsonProperty("holdField011")
    private BigDecimal holdField011;

    @JsonProperty("holdField012")
    private Long holdField012;

    @JsonProperty("holdField013")
    private Long holdField013;

    @JsonProperty("holdField014")
    private Integer holdField014;

    @Size(max = 20)
    @JsonProperty("holdField015")
    private String holdField015;

    @JsonProperty("holdField016")
    private LocalDate holdField016;

    @Size(max = 200)
    @JsonProperty("holdField017")
    private String holdField017;

    public HoldDto046() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final HoldDto046 instance = new HoldDto046();

        public Builder holdField000(Integer val) { instance.holdField000 = val; return this; }
        public Builder holdField001(String val) { instance.holdField001 = val; return this; }
        public Builder holdField002(Integer val) { instance.holdField002 = val; return this; }
        public Builder holdField003(BigDecimal val) { instance.holdField003 = val; return this; }
        public Builder holdField004(String val) { instance.holdField004 = val; return this; }
        public Builder holdField005(LocalDate val) { instance.holdField005 = val; return this; }
        public Builder holdField006(Long val) { instance.holdField006 = val; return this; }
        public Builder holdField007(Boolean val) { instance.holdField007 = val; return this; }
        public Builder holdField008(Integer val) { instance.holdField008 = val; return this; }
        public Builder holdField009(Boolean val) { instance.holdField009 = val; return this; }
        public Builder holdField010(Integer val) { instance.holdField010 = val; return this; }
        public Builder holdField011(BigDecimal val) { instance.holdField011 = val; return this; }
        public Builder holdField012(Long val) { instance.holdField012 = val; return this; }
        public Builder holdField013(Long val) { instance.holdField013 = val; return this; }
        public Builder holdField014(Integer val) { instance.holdField014 = val; return this; }
        public Builder holdField015(String val) { instance.holdField015 = val; return this; }
        public Builder holdField016(LocalDate val) { instance.holdField016 = val; return this; }
        public Builder holdField017(String val) { instance.holdField017 = val; return this; }
        public HoldDto046 build() { return instance; }
    }

    public Integer getHoldField000() { return holdField000; }
    public void setHoldField000(Integer holdField000) { this.holdField000 = holdField000; }

    public String getHoldField001() { return holdField001; }
    public void setHoldField001(String holdField001) { this.holdField001 = holdField001; }

    public Integer getHoldField002() { return holdField002; }
    public void setHoldField002(Integer holdField002) { this.holdField002 = holdField002; }

    public BigDecimal getHoldField003() { return holdField003; }
    public void setHoldField003(BigDecimal holdField003) { this.holdField003 = holdField003; }

    public String getHoldField004() { return holdField004; }
    public void setHoldField004(String holdField004) { this.holdField004 = holdField004; }

    public LocalDate getHoldField005() { return holdField005; }
    public void setHoldField005(LocalDate holdField005) { this.holdField005 = holdField005; }

    public Long getHoldField006() { return holdField006; }
    public void setHoldField006(Long holdField006) { this.holdField006 = holdField006; }

    public Boolean getHoldField007() { return holdField007; }
    public void setHoldField007(Boolean holdField007) { this.holdField007 = holdField007; }

    public Integer getHoldField008() { return holdField008; }
    public void setHoldField008(Integer holdField008) { this.holdField008 = holdField008; }

    public Boolean getHoldField009() { return holdField009; }
    public void setHoldField009(Boolean holdField009) { this.holdField009 = holdField009; }

    public Integer getHoldField010() { return holdField010; }
    public void setHoldField010(Integer holdField010) { this.holdField010 = holdField010; }

    public BigDecimal getHoldField011() { return holdField011; }
    public void setHoldField011(BigDecimal holdField011) { this.holdField011 = holdField011; }

    public Long getHoldField012() { return holdField012; }
    public void setHoldField012(Long holdField012) { this.holdField012 = holdField012; }

    public Long getHoldField013() { return holdField013; }
    public void setHoldField013(Long holdField013) { this.holdField013 = holdField013; }

    public Integer getHoldField014() { return holdField014; }
    public void setHoldField014(Integer holdField014) { this.holdField014 = holdField014; }

    public String getHoldField015() { return holdField015; }
    public void setHoldField015(String holdField015) { this.holdField015 = holdField015; }

    public LocalDate getHoldField016() { return holdField016; }
    public void setHoldField016(LocalDate holdField016) { this.holdField016 = holdField016; }

    public String getHoldField017() { return holdField017; }
    public void setHoldField017(String holdField017) { this.holdField017 = holdField017; }

    @Override
    public String toString() {
        return "HoldDto046{" +
            "holdField000=" + holdField000 + ", " +
            "holdField001=" + holdField001 + ", " +
            "holdField002=" + holdField002 + ", " +
            "holdField003=" + holdField003 + ", " +
            "holdField004=" + holdField004 + ", " +
            "}";
    }
}
