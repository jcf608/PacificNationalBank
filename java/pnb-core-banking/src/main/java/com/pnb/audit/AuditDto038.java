package com.pnb.audit;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AuditDto038 — Data Transfer Object for audit operations.
 * Variant 38 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuditDto038 {

    @JsonProperty("audiField000")
    private Boolean audiField000;

    @DecimalMin(value = "0.00")
    @JsonProperty("audiField001")
    private BigDecimal audiField001;

    @JsonProperty("audiField002")
    private Boolean audiField002;

    @JsonProperty("audiField003")
    private Long audiField003;

    @JsonProperty("audiField004")
    private Double audiField004;

    @JsonProperty("audiField005")
    private Double audiField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("audiField006")
    private BigDecimal audiField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("audiField007")
    private BigDecimal audiField007;

    @JsonProperty("audiField008")
    private Boolean audiField008;

    @JsonProperty("audiField009")
    private LocalDate audiField009;

    public AuditDto038() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AuditDto038 instance = new AuditDto038();

        public Builder audiField000(Boolean val) { instance.audiField000 = val; return this; }
        public Builder audiField001(BigDecimal val) { instance.audiField001 = val; return this; }
        public Builder audiField002(Boolean val) { instance.audiField002 = val; return this; }
        public Builder audiField003(Long val) { instance.audiField003 = val; return this; }
        public Builder audiField004(Double val) { instance.audiField004 = val; return this; }
        public Builder audiField005(Double val) { instance.audiField005 = val; return this; }
        public Builder audiField006(BigDecimal val) { instance.audiField006 = val; return this; }
        public Builder audiField007(BigDecimal val) { instance.audiField007 = val; return this; }
        public Builder audiField008(Boolean val) { instance.audiField008 = val; return this; }
        public Builder audiField009(LocalDate val) { instance.audiField009 = val; return this; }
        public AuditDto038 build() { return instance; }
    }

    public Boolean getAudiField000() { return audiField000; }
    public void setAudiField000(Boolean audiField000) { this.audiField000 = audiField000; }

    public BigDecimal getAudiField001() { return audiField001; }
    public void setAudiField001(BigDecimal audiField001) { this.audiField001 = audiField001; }

    public Boolean getAudiField002() { return audiField002; }
    public void setAudiField002(Boolean audiField002) { this.audiField002 = audiField002; }

    public Long getAudiField003() { return audiField003; }
    public void setAudiField003(Long audiField003) { this.audiField003 = audiField003; }

    public Double getAudiField004() { return audiField004; }
    public void setAudiField004(Double audiField004) { this.audiField004 = audiField004; }

    public Double getAudiField005() { return audiField005; }
    public void setAudiField005(Double audiField005) { this.audiField005 = audiField005; }

    public BigDecimal getAudiField006() { return audiField006; }
    public void setAudiField006(BigDecimal audiField006) { this.audiField006 = audiField006; }

    public BigDecimal getAudiField007() { return audiField007; }
    public void setAudiField007(BigDecimal audiField007) { this.audiField007 = audiField007; }

    public Boolean getAudiField008() { return audiField008; }
    public void setAudiField008(Boolean audiField008) { this.audiField008 = audiField008; }

    public LocalDate getAudiField009() { return audiField009; }
    public void setAudiField009(LocalDate audiField009) { this.audiField009 = audiField009; }

    @Override
    public String toString() {
        return "AuditDto038{" +
            "audiField000=" + audiField000 + ", " +
            "audiField001=" + audiField001 + ", " +
            "audiField002=" + audiField002 + ", " +
            "audiField003=" + audiField003 + ", " +
            "audiField004=" + audiField004 + ", " +
            "}";
    }
}
