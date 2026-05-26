package com.pnb.audit;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AuditDto050 — Data Transfer Object for audit operations.
 * Variant 50 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuditDto050 {

    @JsonProperty("audiField000")
    private Long audiField000;

    @JsonProperty("audiField001")
    private Long audiField001;

    @Size(max = 100)
    @JsonProperty("audiField002")
    private String audiField002;

    @JsonProperty("audiField003")
    private LocalDate audiField003;

    @JsonProperty("audiField004")
    private Boolean audiField004;

    @JsonProperty("audiField005")
    private Integer audiField005;

    @JsonProperty("audiField006")
    private LocalDate audiField006;

    @JsonProperty("audiField007")
    private Boolean audiField007;

    @DecimalMin(value = "0.00")
    @JsonProperty("audiField008")
    private BigDecimal audiField008;

    @JsonProperty("audiField009")
    private Boolean audiField009;

    public AuditDto050() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AuditDto050 instance = new AuditDto050();

        public Builder audiField000(Long val) { instance.audiField000 = val; return this; }
        public Builder audiField001(Long val) { instance.audiField001 = val; return this; }
        public Builder audiField002(String val) { instance.audiField002 = val; return this; }
        public Builder audiField003(LocalDate val) { instance.audiField003 = val; return this; }
        public Builder audiField004(Boolean val) { instance.audiField004 = val; return this; }
        public Builder audiField005(Integer val) { instance.audiField005 = val; return this; }
        public Builder audiField006(LocalDate val) { instance.audiField006 = val; return this; }
        public Builder audiField007(Boolean val) { instance.audiField007 = val; return this; }
        public Builder audiField008(BigDecimal val) { instance.audiField008 = val; return this; }
        public Builder audiField009(Boolean val) { instance.audiField009 = val; return this; }
        public AuditDto050 build() { return instance; }
    }

    public Long getAudiField000() { return audiField000; }
    public void setAudiField000(Long audiField000) { this.audiField000 = audiField000; }

    public Long getAudiField001() { return audiField001; }
    public void setAudiField001(Long audiField001) { this.audiField001 = audiField001; }

    public String getAudiField002() { return audiField002; }
    public void setAudiField002(String audiField002) { this.audiField002 = audiField002; }

    public LocalDate getAudiField003() { return audiField003; }
    public void setAudiField003(LocalDate audiField003) { this.audiField003 = audiField003; }

    public Boolean getAudiField004() { return audiField004; }
    public void setAudiField004(Boolean audiField004) { this.audiField004 = audiField004; }

    public Integer getAudiField005() { return audiField005; }
    public void setAudiField005(Integer audiField005) { this.audiField005 = audiField005; }

    public LocalDate getAudiField006() { return audiField006; }
    public void setAudiField006(LocalDate audiField006) { this.audiField006 = audiField006; }

    public Boolean getAudiField007() { return audiField007; }
    public void setAudiField007(Boolean audiField007) { this.audiField007 = audiField007; }

    public BigDecimal getAudiField008() { return audiField008; }
    public void setAudiField008(BigDecimal audiField008) { this.audiField008 = audiField008; }

    public Boolean getAudiField009() { return audiField009; }
    public void setAudiField009(Boolean audiField009) { this.audiField009 = audiField009; }

    @Override
    public String toString() {
        return "AuditDto050{" +
            "audiField000=" + audiField000 + ", " +
            "audiField001=" + audiField001 + ", " +
            "audiField002=" + audiField002 + ", " +
            "audiField003=" + audiField003 + ", " +
            "audiField004=" + audiField004 + ", " +
            "}";
    }
}
