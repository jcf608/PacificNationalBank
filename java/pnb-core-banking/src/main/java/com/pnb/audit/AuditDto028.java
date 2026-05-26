package com.pnb.audit;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AuditDto028 — Data Transfer Object for audit operations.
 * Variant 28 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuditDto028 {

    @JsonProperty("audiField000")
    private Double audiField000;

    @JsonProperty("audiField001")
    private Double audiField001;

    @JsonProperty("audiField002")
    private Long audiField002;

    @JsonProperty("audiField003")
    private Double audiField003;

    @JsonProperty("audiField004")
    private Double audiField004;

    @JsonProperty("audiField005")
    private Boolean audiField005;

    @JsonProperty("audiField006")
    private Double audiField006;

    @JsonProperty("audiField007")
    private Double audiField007;

    @JsonProperty("audiField008")
    private Double audiField008;

    @JsonProperty("audiField009")
    private Double audiField009;

    @Size(max = 60)
    @JsonProperty("audiField010")
    private String audiField010;

    @DecimalMin(value = "0.00")
    @JsonProperty("audiField011")
    private BigDecimal audiField011;

    public AuditDto028() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AuditDto028 instance = new AuditDto028();

        public Builder audiField000(Double val) { instance.audiField000 = val; return this; }
        public Builder audiField001(Double val) { instance.audiField001 = val; return this; }
        public Builder audiField002(Long val) { instance.audiField002 = val; return this; }
        public Builder audiField003(Double val) { instance.audiField003 = val; return this; }
        public Builder audiField004(Double val) { instance.audiField004 = val; return this; }
        public Builder audiField005(Boolean val) { instance.audiField005 = val; return this; }
        public Builder audiField006(Double val) { instance.audiField006 = val; return this; }
        public Builder audiField007(Double val) { instance.audiField007 = val; return this; }
        public Builder audiField008(Double val) { instance.audiField008 = val; return this; }
        public Builder audiField009(Double val) { instance.audiField009 = val; return this; }
        public Builder audiField010(String val) { instance.audiField010 = val; return this; }
        public Builder audiField011(BigDecimal val) { instance.audiField011 = val; return this; }
        public AuditDto028 build() { return instance; }
    }

    public Double getAudiField000() { return audiField000; }
    public void setAudiField000(Double audiField000) { this.audiField000 = audiField000; }

    public Double getAudiField001() { return audiField001; }
    public void setAudiField001(Double audiField001) { this.audiField001 = audiField001; }

    public Long getAudiField002() { return audiField002; }
    public void setAudiField002(Long audiField002) { this.audiField002 = audiField002; }

    public Double getAudiField003() { return audiField003; }
    public void setAudiField003(Double audiField003) { this.audiField003 = audiField003; }

    public Double getAudiField004() { return audiField004; }
    public void setAudiField004(Double audiField004) { this.audiField004 = audiField004; }

    public Boolean getAudiField005() { return audiField005; }
    public void setAudiField005(Boolean audiField005) { this.audiField005 = audiField005; }

    public Double getAudiField006() { return audiField006; }
    public void setAudiField006(Double audiField006) { this.audiField006 = audiField006; }

    public Double getAudiField007() { return audiField007; }
    public void setAudiField007(Double audiField007) { this.audiField007 = audiField007; }

    public Double getAudiField008() { return audiField008; }
    public void setAudiField008(Double audiField008) { this.audiField008 = audiField008; }

    public Double getAudiField009() { return audiField009; }
    public void setAudiField009(Double audiField009) { this.audiField009 = audiField009; }

    public String getAudiField010() { return audiField010; }
    public void setAudiField010(String audiField010) { this.audiField010 = audiField010; }

    public BigDecimal getAudiField011() { return audiField011; }
    public void setAudiField011(BigDecimal audiField011) { this.audiField011 = audiField011; }

    @Override
    public String toString() {
        return "AuditDto028{" +
            "audiField000=" + audiField000 + ", " +
            "audiField001=" + audiField001 + ", " +
            "audiField002=" + audiField002 + ", " +
            "audiField003=" + audiField003 + ", " +
            "audiField004=" + audiField004 + ", " +
            "}";
    }
}
