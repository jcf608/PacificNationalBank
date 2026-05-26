package com.pnb.audit;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AuditDto054 — Data Transfer Object for audit operations.
 * Variant 54 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuditDto054 {

    @JsonProperty("audiField000")
    private Boolean audiField000;

    @JsonProperty("audiField001")
    private Integer audiField001;

    @JsonProperty("audiField002")
    private Integer audiField002;

    @JsonProperty("audiField003")
    private LocalDate audiField003;

    @JsonProperty("audiField004")
    private LocalDate audiField004;

    @JsonProperty("audiField005")
    private Long audiField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("audiField006")
    private BigDecimal audiField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("audiField007")
    private BigDecimal audiField007;

    @JsonProperty("audiField008")
    private LocalDate audiField008;

    @JsonProperty("audiField009")
    private Boolean audiField009;

    @JsonProperty("audiField010")
    private Integer audiField010;

    @JsonProperty("audiField011")
    private LocalDate audiField011;

    @JsonProperty("audiField012")
    private LocalDate audiField012;

    @JsonProperty("audiField013")
    private LocalDate audiField013;

    public AuditDto054() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AuditDto054 instance = new AuditDto054();

        public Builder audiField000(Boolean val) { instance.audiField000 = val; return this; }
        public Builder audiField001(Integer val) { instance.audiField001 = val; return this; }
        public Builder audiField002(Integer val) { instance.audiField002 = val; return this; }
        public Builder audiField003(LocalDate val) { instance.audiField003 = val; return this; }
        public Builder audiField004(LocalDate val) { instance.audiField004 = val; return this; }
        public Builder audiField005(Long val) { instance.audiField005 = val; return this; }
        public Builder audiField006(BigDecimal val) { instance.audiField006 = val; return this; }
        public Builder audiField007(BigDecimal val) { instance.audiField007 = val; return this; }
        public Builder audiField008(LocalDate val) { instance.audiField008 = val; return this; }
        public Builder audiField009(Boolean val) { instance.audiField009 = val; return this; }
        public Builder audiField010(Integer val) { instance.audiField010 = val; return this; }
        public Builder audiField011(LocalDate val) { instance.audiField011 = val; return this; }
        public Builder audiField012(LocalDate val) { instance.audiField012 = val; return this; }
        public Builder audiField013(LocalDate val) { instance.audiField013 = val; return this; }
        public AuditDto054 build() { return instance; }
    }

    public Boolean getAudiField000() { return audiField000; }
    public void setAudiField000(Boolean audiField000) { this.audiField000 = audiField000; }

    public Integer getAudiField001() { return audiField001; }
    public void setAudiField001(Integer audiField001) { this.audiField001 = audiField001; }

    public Integer getAudiField002() { return audiField002; }
    public void setAudiField002(Integer audiField002) { this.audiField002 = audiField002; }

    public LocalDate getAudiField003() { return audiField003; }
    public void setAudiField003(LocalDate audiField003) { this.audiField003 = audiField003; }

    public LocalDate getAudiField004() { return audiField004; }
    public void setAudiField004(LocalDate audiField004) { this.audiField004 = audiField004; }

    public Long getAudiField005() { return audiField005; }
    public void setAudiField005(Long audiField005) { this.audiField005 = audiField005; }

    public BigDecimal getAudiField006() { return audiField006; }
    public void setAudiField006(BigDecimal audiField006) { this.audiField006 = audiField006; }

    public BigDecimal getAudiField007() { return audiField007; }
    public void setAudiField007(BigDecimal audiField007) { this.audiField007 = audiField007; }

    public LocalDate getAudiField008() { return audiField008; }
    public void setAudiField008(LocalDate audiField008) { this.audiField008 = audiField008; }

    public Boolean getAudiField009() { return audiField009; }
    public void setAudiField009(Boolean audiField009) { this.audiField009 = audiField009; }

    public Integer getAudiField010() { return audiField010; }
    public void setAudiField010(Integer audiField010) { this.audiField010 = audiField010; }

    public LocalDate getAudiField011() { return audiField011; }
    public void setAudiField011(LocalDate audiField011) { this.audiField011 = audiField011; }

    public LocalDate getAudiField012() { return audiField012; }
    public void setAudiField012(LocalDate audiField012) { this.audiField012 = audiField012; }

    public LocalDate getAudiField013() { return audiField013; }
    public void setAudiField013(LocalDate audiField013) { this.audiField013 = audiField013; }

    @Override
    public String toString() {
        return "AuditDto054{" +
            "audiField000=" + audiField000 + ", " +
            "audiField001=" + audiField001 + ", " +
            "audiField002=" + audiField002 + ", " +
            "audiField003=" + audiField003 + ", " +
            "audiField004=" + audiField004 + ", " +
            "}";
    }
}
