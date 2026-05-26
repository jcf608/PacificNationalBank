package com.pnb.audit;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AuditDto051 — Data Transfer Object for audit operations.
 * Variant 51 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuditDto051 {

    @JsonProperty("audiField000")
    private Boolean audiField000;

    @Size(max = 20)
    @JsonProperty("audiField001")
    private String audiField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("audiField002")
    private BigDecimal audiField002;

    @JsonProperty("audiField003")
    private LocalDate audiField003;

    @DecimalMin(value = "0.00")
    @JsonProperty("audiField004")
    private BigDecimal audiField004;

    @JsonProperty("audiField005")
    private Boolean audiField005;

    @JsonProperty("audiField006")
    private Double audiField006;

    @Size(max = 60)
    @JsonProperty("audiField007")
    private String audiField007;

    @JsonProperty("audiField008")
    private Boolean audiField008;

    @JsonProperty("audiField009")
    private Boolean audiField009;

    @JsonProperty("audiField010")
    private LocalDate audiField010;

    public AuditDto051() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AuditDto051 instance = new AuditDto051();

        public Builder audiField000(Boolean val) { instance.audiField000 = val; return this; }
        public Builder audiField001(String val) { instance.audiField001 = val; return this; }
        public Builder audiField002(BigDecimal val) { instance.audiField002 = val; return this; }
        public Builder audiField003(LocalDate val) { instance.audiField003 = val; return this; }
        public Builder audiField004(BigDecimal val) { instance.audiField004 = val; return this; }
        public Builder audiField005(Boolean val) { instance.audiField005 = val; return this; }
        public Builder audiField006(Double val) { instance.audiField006 = val; return this; }
        public Builder audiField007(String val) { instance.audiField007 = val; return this; }
        public Builder audiField008(Boolean val) { instance.audiField008 = val; return this; }
        public Builder audiField009(Boolean val) { instance.audiField009 = val; return this; }
        public Builder audiField010(LocalDate val) { instance.audiField010 = val; return this; }
        public AuditDto051 build() { return instance; }
    }

    public Boolean getAudiField000() { return audiField000; }
    public void setAudiField000(Boolean audiField000) { this.audiField000 = audiField000; }

    public String getAudiField001() { return audiField001; }
    public void setAudiField001(String audiField001) { this.audiField001 = audiField001; }

    public BigDecimal getAudiField002() { return audiField002; }
    public void setAudiField002(BigDecimal audiField002) { this.audiField002 = audiField002; }

    public LocalDate getAudiField003() { return audiField003; }
    public void setAudiField003(LocalDate audiField003) { this.audiField003 = audiField003; }

    public BigDecimal getAudiField004() { return audiField004; }
    public void setAudiField004(BigDecimal audiField004) { this.audiField004 = audiField004; }

    public Boolean getAudiField005() { return audiField005; }
    public void setAudiField005(Boolean audiField005) { this.audiField005 = audiField005; }

    public Double getAudiField006() { return audiField006; }
    public void setAudiField006(Double audiField006) { this.audiField006 = audiField006; }

    public String getAudiField007() { return audiField007; }
    public void setAudiField007(String audiField007) { this.audiField007 = audiField007; }

    public Boolean getAudiField008() { return audiField008; }
    public void setAudiField008(Boolean audiField008) { this.audiField008 = audiField008; }

    public Boolean getAudiField009() { return audiField009; }
    public void setAudiField009(Boolean audiField009) { this.audiField009 = audiField009; }

    public LocalDate getAudiField010() { return audiField010; }
    public void setAudiField010(LocalDate audiField010) { this.audiField010 = audiField010; }

    @Override
    public String toString() {
        return "AuditDto051{" +
            "audiField000=" + audiField000 + ", " +
            "audiField001=" + audiField001 + ", " +
            "audiField002=" + audiField002 + ", " +
            "audiField003=" + audiField003 + ", " +
            "audiField004=" + audiField004 + ", " +
            "}";
    }
}
