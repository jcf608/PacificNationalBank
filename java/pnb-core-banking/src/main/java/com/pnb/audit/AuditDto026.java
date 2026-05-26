package com.pnb.audit;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AuditDto026 — Data Transfer Object for audit operations.
 * Variant 26 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuditDto026 {

    @JsonProperty("audiField000")
    private Long audiField000;

    @JsonProperty("audiField001")
    private Long audiField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("audiField002")
    private BigDecimal audiField002;

    @JsonProperty("audiField003")
    private Integer audiField003;

    @JsonProperty("audiField004")
    private LocalDate audiField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("audiField005")
    private BigDecimal audiField005;

    @Size(max = 200)
    @JsonProperty("audiField006")
    private String audiField006;

    @JsonProperty("audiField007")
    private Integer audiField007;

    @JsonProperty("audiField008")
    private Long audiField008;

    @JsonProperty("audiField009")
    private Long audiField009;

    public AuditDto026() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AuditDto026 instance = new AuditDto026();

        public Builder audiField000(Long val) { instance.audiField000 = val; return this; }
        public Builder audiField001(Long val) { instance.audiField001 = val; return this; }
        public Builder audiField002(BigDecimal val) { instance.audiField002 = val; return this; }
        public Builder audiField003(Integer val) { instance.audiField003 = val; return this; }
        public Builder audiField004(LocalDate val) { instance.audiField004 = val; return this; }
        public Builder audiField005(BigDecimal val) { instance.audiField005 = val; return this; }
        public Builder audiField006(String val) { instance.audiField006 = val; return this; }
        public Builder audiField007(Integer val) { instance.audiField007 = val; return this; }
        public Builder audiField008(Long val) { instance.audiField008 = val; return this; }
        public Builder audiField009(Long val) { instance.audiField009 = val; return this; }
        public AuditDto026 build() { return instance; }
    }

    public Long getAudiField000() { return audiField000; }
    public void setAudiField000(Long audiField000) { this.audiField000 = audiField000; }

    public Long getAudiField001() { return audiField001; }
    public void setAudiField001(Long audiField001) { this.audiField001 = audiField001; }

    public BigDecimal getAudiField002() { return audiField002; }
    public void setAudiField002(BigDecimal audiField002) { this.audiField002 = audiField002; }

    public Integer getAudiField003() { return audiField003; }
    public void setAudiField003(Integer audiField003) { this.audiField003 = audiField003; }

    public LocalDate getAudiField004() { return audiField004; }
    public void setAudiField004(LocalDate audiField004) { this.audiField004 = audiField004; }

    public BigDecimal getAudiField005() { return audiField005; }
    public void setAudiField005(BigDecimal audiField005) { this.audiField005 = audiField005; }

    public String getAudiField006() { return audiField006; }
    public void setAudiField006(String audiField006) { this.audiField006 = audiField006; }

    public Integer getAudiField007() { return audiField007; }
    public void setAudiField007(Integer audiField007) { this.audiField007 = audiField007; }

    public Long getAudiField008() { return audiField008; }
    public void setAudiField008(Long audiField008) { this.audiField008 = audiField008; }

    public Long getAudiField009() { return audiField009; }
    public void setAudiField009(Long audiField009) { this.audiField009 = audiField009; }

    @Override
    public String toString() {
        return "AuditDto026{" +
            "audiField000=" + audiField000 + ", " +
            "audiField001=" + audiField001 + ", " +
            "audiField002=" + audiField002 + ", " +
            "audiField003=" + audiField003 + ", " +
            "audiField004=" + audiField004 + ", " +
            "}";
    }
}
