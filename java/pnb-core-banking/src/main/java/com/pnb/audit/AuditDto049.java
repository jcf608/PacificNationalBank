package com.pnb.audit;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AuditDto049 — Data Transfer Object for audit operations.
 * Variant 49 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuditDto049 {

    @JsonProperty("audiField000")
    private Boolean audiField000;

    @JsonProperty("audiField001")
    private Integer audiField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("audiField002")
    private BigDecimal audiField002;

    @JsonProperty("audiField003")
    private LocalDate audiField003;

    @JsonProperty("audiField004")
    private Integer audiField004;

    @Size(max = 40)
    @JsonProperty("audiField005")
    private String audiField005;

    @JsonProperty("audiField006")
    private Long audiField006;

    @JsonProperty("audiField007")
    private Boolean audiField007;

    @JsonProperty("audiField008")
    private Integer audiField008;

    public AuditDto049() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AuditDto049 instance = new AuditDto049();

        public Builder audiField000(Boolean val) { instance.audiField000 = val; return this; }
        public Builder audiField001(Integer val) { instance.audiField001 = val; return this; }
        public Builder audiField002(BigDecimal val) { instance.audiField002 = val; return this; }
        public Builder audiField003(LocalDate val) { instance.audiField003 = val; return this; }
        public Builder audiField004(Integer val) { instance.audiField004 = val; return this; }
        public Builder audiField005(String val) { instance.audiField005 = val; return this; }
        public Builder audiField006(Long val) { instance.audiField006 = val; return this; }
        public Builder audiField007(Boolean val) { instance.audiField007 = val; return this; }
        public Builder audiField008(Integer val) { instance.audiField008 = val; return this; }
        public AuditDto049 build() { return instance; }
    }

    public Boolean getAudiField000() { return audiField000; }
    public void setAudiField000(Boolean audiField000) { this.audiField000 = audiField000; }

    public Integer getAudiField001() { return audiField001; }
    public void setAudiField001(Integer audiField001) { this.audiField001 = audiField001; }

    public BigDecimal getAudiField002() { return audiField002; }
    public void setAudiField002(BigDecimal audiField002) { this.audiField002 = audiField002; }

    public LocalDate getAudiField003() { return audiField003; }
    public void setAudiField003(LocalDate audiField003) { this.audiField003 = audiField003; }

    public Integer getAudiField004() { return audiField004; }
    public void setAudiField004(Integer audiField004) { this.audiField004 = audiField004; }

    public String getAudiField005() { return audiField005; }
    public void setAudiField005(String audiField005) { this.audiField005 = audiField005; }

    public Long getAudiField006() { return audiField006; }
    public void setAudiField006(Long audiField006) { this.audiField006 = audiField006; }

    public Boolean getAudiField007() { return audiField007; }
    public void setAudiField007(Boolean audiField007) { this.audiField007 = audiField007; }

    public Integer getAudiField008() { return audiField008; }
    public void setAudiField008(Integer audiField008) { this.audiField008 = audiField008; }

    @Override
    public String toString() {
        return "AuditDto049{" +
            "audiField000=" + audiField000 + ", " +
            "audiField001=" + audiField001 + ", " +
            "audiField002=" + audiField002 + ", " +
            "audiField003=" + audiField003 + ", " +
            "audiField004=" + audiField004 + ", " +
            "}";
    }
}
