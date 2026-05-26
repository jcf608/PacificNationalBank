package com.pnb.audit;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AuditDto036 — Data Transfer Object for audit operations.
 * Variant 36 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuditDto036 {

    @JsonProperty("audiField000")
    private Boolean audiField000;

    @JsonProperty("audiField001")
    private LocalDate audiField001;

    @JsonProperty("audiField002")
    private LocalDate audiField002;

    @JsonProperty("audiField003")
    private Double audiField003;

    @JsonProperty("audiField004")
    private LocalDate audiField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("audiField005")
    private BigDecimal audiField005;

    @Size(max = 100)
    @JsonProperty("audiField006")
    private String audiField006;

    @Size(max = 20)
    @JsonProperty("audiField007")
    private String audiField007;

    public AuditDto036() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AuditDto036 instance = new AuditDto036();

        public Builder audiField000(Boolean val) { instance.audiField000 = val; return this; }
        public Builder audiField001(LocalDate val) { instance.audiField001 = val; return this; }
        public Builder audiField002(LocalDate val) { instance.audiField002 = val; return this; }
        public Builder audiField003(Double val) { instance.audiField003 = val; return this; }
        public Builder audiField004(LocalDate val) { instance.audiField004 = val; return this; }
        public Builder audiField005(BigDecimal val) { instance.audiField005 = val; return this; }
        public Builder audiField006(String val) { instance.audiField006 = val; return this; }
        public Builder audiField007(String val) { instance.audiField007 = val; return this; }
        public AuditDto036 build() { return instance; }
    }

    public Boolean getAudiField000() { return audiField000; }
    public void setAudiField000(Boolean audiField000) { this.audiField000 = audiField000; }

    public LocalDate getAudiField001() { return audiField001; }
    public void setAudiField001(LocalDate audiField001) { this.audiField001 = audiField001; }

    public LocalDate getAudiField002() { return audiField002; }
    public void setAudiField002(LocalDate audiField002) { this.audiField002 = audiField002; }

    public Double getAudiField003() { return audiField003; }
    public void setAudiField003(Double audiField003) { this.audiField003 = audiField003; }

    public LocalDate getAudiField004() { return audiField004; }
    public void setAudiField004(LocalDate audiField004) { this.audiField004 = audiField004; }

    public BigDecimal getAudiField005() { return audiField005; }
    public void setAudiField005(BigDecimal audiField005) { this.audiField005 = audiField005; }

    public String getAudiField006() { return audiField006; }
    public void setAudiField006(String audiField006) { this.audiField006 = audiField006; }

    public String getAudiField007() { return audiField007; }
    public void setAudiField007(String audiField007) { this.audiField007 = audiField007; }

    @Override
    public String toString() {
        return "AuditDto036{" +
            "audiField000=" + audiField000 + ", " +
            "audiField001=" + audiField001 + ", " +
            "audiField002=" + audiField002 + ", " +
            "audiField003=" + audiField003 + ", " +
            "audiField004=" + audiField004 + ", " +
            "}";
    }
}
