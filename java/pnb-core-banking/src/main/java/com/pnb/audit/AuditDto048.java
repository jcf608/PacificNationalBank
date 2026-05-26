package com.pnb.audit;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AuditDto048 — Data Transfer Object for audit operations.
 * Variant 48 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuditDto048 {

    @JsonProperty("audiField000")
    private LocalDate audiField000;

    @JsonProperty("audiField001")
    private LocalDate audiField001;

    @JsonProperty("audiField002")
    private LocalDate audiField002;

    @Size(max = 40)
    @JsonProperty("audiField003")
    private String audiField003;

    @JsonProperty("audiField004")
    private Boolean audiField004;

    @JsonProperty("audiField005")
    private Boolean audiField005;

    @JsonProperty("audiField006")
    private Long audiField006;

    @JsonProperty("audiField007")
    private Double audiField007;

    public AuditDto048() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AuditDto048 instance = new AuditDto048();

        public Builder audiField000(LocalDate val) { instance.audiField000 = val; return this; }
        public Builder audiField001(LocalDate val) { instance.audiField001 = val; return this; }
        public Builder audiField002(LocalDate val) { instance.audiField002 = val; return this; }
        public Builder audiField003(String val) { instance.audiField003 = val; return this; }
        public Builder audiField004(Boolean val) { instance.audiField004 = val; return this; }
        public Builder audiField005(Boolean val) { instance.audiField005 = val; return this; }
        public Builder audiField006(Long val) { instance.audiField006 = val; return this; }
        public Builder audiField007(Double val) { instance.audiField007 = val; return this; }
        public AuditDto048 build() { return instance; }
    }

    public LocalDate getAudiField000() { return audiField000; }
    public void setAudiField000(LocalDate audiField000) { this.audiField000 = audiField000; }

    public LocalDate getAudiField001() { return audiField001; }
    public void setAudiField001(LocalDate audiField001) { this.audiField001 = audiField001; }

    public LocalDate getAudiField002() { return audiField002; }
    public void setAudiField002(LocalDate audiField002) { this.audiField002 = audiField002; }

    public String getAudiField003() { return audiField003; }
    public void setAudiField003(String audiField003) { this.audiField003 = audiField003; }

    public Boolean getAudiField004() { return audiField004; }
    public void setAudiField004(Boolean audiField004) { this.audiField004 = audiField004; }

    public Boolean getAudiField005() { return audiField005; }
    public void setAudiField005(Boolean audiField005) { this.audiField005 = audiField005; }

    public Long getAudiField006() { return audiField006; }
    public void setAudiField006(Long audiField006) { this.audiField006 = audiField006; }

    public Double getAudiField007() { return audiField007; }
    public void setAudiField007(Double audiField007) { this.audiField007 = audiField007; }

    @Override
    public String toString() {
        return "AuditDto048{" +
            "audiField000=" + audiField000 + ", " +
            "audiField001=" + audiField001 + ", " +
            "audiField002=" + audiField002 + ", " +
            "audiField003=" + audiField003 + ", " +
            "audiField004=" + audiField004 + ", " +
            "}";
    }
}
