package com.pnb.audit;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AuditDto024 — Data Transfer Object for audit operations.
 * Variant 24 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuditDto024 {

    @DecimalMin(value = "0.00")
    @JsonProperty("audiField000")
    private BigDecimal audiField000;

    @JsonProperty("audiField001")
    private LocalDate audiField001;

    @JsonProperty("audiField002")
    private Integer audiField002;

    @JsonProperty("audiField003")
    private Double audiField003;

    @DecimalMin(value = "0.00")
    @JsonProperty("audiField004")
    private BigDecimal audiField004;

    @Size(max = 100)
    @JsonProperty("audiField005")
    private String audiField005;

    @Size(max = 200)
    @JsonProperty("audiField006")
    private String audiField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("audiField007")
    private BigDecimal audiField007;

    public AuditDto024() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AuditDto024 instance = new AuditDto024();

        public Builder audiField000(BigDecimal val) { instance.audiField000 = val; return this; }
        public Builder audiField001(LocalDate val) { instance.audiField001 = val; return this; }
        public Builder audiField002(Integer val) { instance.audiField002 = val; return this; }
        public Builder audiField003(Double val) { instance.audiField003 = val; return this; }
        public Builder audiField004(BigDecimal val) { instance.audiField004 = val; return this; }
        public Builder audiField005(String val) { instance.audiField005 = val; return this; }
        public Builder audiField006(String val) { instance.audiField006 = val; return this; }
        public Builder audiField007(BigDecimal val) { instance.audiField007 = val; return this; }
        public AuditDto024 build() { return instance; }
    }

    public BigDecimal getAudiField000() { return audiField000; }
    public void setAudiField000(BigDecimal audiField000) { this.audiField000 = audiField000; }

    public LocalDate getAudiField001() { return audiField001; }
    public void setAudiField001(LocalDate audiField001) { this.audiField001 = audiField001; }

    public Integer getAudiField002() { return audiField002; }
    public void setAudiField002(Integer audiField002) { this.audiField002 = audiField002; }

    public Double getAudiField003() { return audiField003; }
    public void setAudiField003(Double audiField003) { this.audiField003 = audiField003; }

    public BigDecimal getAudiField004() { return audiField004; }
    public void setAudiField004(BigDecimal audiField004) { this.audiField004 = audiField004; }

    public String getAudiField005() { return audiField005; }
    public void setAudiField005(String audiField005) { this.audiField005 = audiField005; }

    public String getAudiField006() { return audiField006; }
    public void setAudiField006(String audiField006) { this.audiField006 = audiField006; }

    public BigDecimal getAudiField007() { return audiField007; }
    public void setAudiField007(BigDecimal audiField007) { this.audiField007 = audiField007; }

    @Override
    public String toString() {
        return "AuditDto024{" +
            "audiField000=" + audiField000 + ", " +
            "audiField001=" + audiField001 + ", " +
            "audiField002=" + audiField002 + ", " +
            "audiField003=" + audiField003 + ", " +
            "audiField004=" + audiField004 + ", " +
            "}";
    }
}
