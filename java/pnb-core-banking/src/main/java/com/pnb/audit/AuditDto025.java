package com.pnb.audit;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AuditDto025 — Data Transfer Object for audit operations.
 * Variant 25 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuditDto025 {

    @Size(max = 40)
    @JsonProperty("audiField000")
    private String audiField000;

    @JsonProperty("audiField001")
    private LocalDate audiField001;

    @JsonProperty("audiField002")
    private LocalDate audiField002;

    @JsonProperty("audiField003")
    private LocalDate audiField003;

    @JsonProperty("audiField004")
    private Long audiField004;

    @JsonProperty("audiField005")
    private Double audiField005;

    @JsonProperty("audiField006")
    private Integer audiField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("audiField007")
    private BigDecimal audiField007;

    @Size(max = 200)
    @JsonProperty("audiField008")
    private String audiField008;

    public AuditDto025() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AuditDto025 instance = new AuditDto025();

        public Builder audiField000(String val) { instance.audiField000 = val; return this; }
        public Builder audiField001(LocalDate val) { instance.audiField001 = val; return this; }
        public Builder audiField002(LocalDate val) { instance.audiField002 = val; return this; }
        public Builder audiField003(LocalDate val) { instance.audiField003 = val; return this; }
        public Builder audiField004(Long val) { instance.audiField004 = val; return this; }
        public Builder audiField005(Double val) { instance.audiField005 = val; return this; }
        public Builder audiField006(Integer val) { instance.audiField006 = val; return this; }
        public Builder audiField007(BigDecimal val) { instance.audiField007 = val; return this; }
        public Builder audiField008(String val) { instance.audiField008 = val; return this; }
        public AuditDto025 build() { return instance; }
    }

    public String getAudiField000() { return audiField000; }
    public void setAudiField000(String audiField000) { this.audiField000 = audiField000; }

    public LocalDate getAudiField001() { return audiField001; }
    public void setAudiField001(LocalDate audiField001) { this.audiField001 = audiField001; }

    public LocalDate getAudiField002() { return audiField002; }
    public void setAudiField002(LocalDate audiField002) { this.audiField002 = audiField002; }

    public LocalDate getAudiField003() { return audiField003; }
    public void setAudiField003(LocalDate audiField003) { this.audiField003 = audiField003; }

    public Long getAudiField004() { return audiField004; }
    public void setAudiField004(Long audiField004) { this.audiField004 = audiField004; }

    public Double getAudiField005() { return audiField005; }
    public void setAudiField005(Double audiField005) { this.audiField005 = audiField005; }

    public Integer getAudiField006() { return audiField006; }
    public void setAudiField006(Integer audiField006) { this.audiField006 = audiField006; }

    public BigDecimal getAudiField007() { return audiField007; }
    public void setAudiField007(BigDecimal audiField007) { this.audiField007 = audiField007; }

    public String getAudiField008() { return audiField008; }
    public void setAudiField008(String audiField008) { this.audiField008 = audiField008; }

    @Override
    public String toString() {
        return "AuditDto025{" +
            "audiField000=" + audiField000 + ", " +
            "audiField001=" + audiField001 + ", " +
            "audiField002=" + audiField002 + ", " +
            "audiField003=" + audiField003 + ", " +
            "audiField004=" + audiField004 + ", " +
            "}";
    }
}
