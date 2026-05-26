package com.pnb.audit;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AuditDto052 — Data Transfer Object for audit operations.
 * Variant 52 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuditDto052 {

    @DecimalMin(value = "0.00")
    @JsonProperty("audiField000")
    private BigDecimal audiField000;

    @JsonProperty("audiField001")
    private Long audiField001;

    @Size(max = 100)
    @JsonProperty("audiField002")
    private String audiField002;

    @JsonProperty("audiField003")
    private LocalDate audiField003;

    @JsonProperty("audiField004")
    private Integer audiField004;

    @JsonProperty("audiField005")
    private Integer audiField005;

    @JsonProperty("audiField006")
    private Double audiField006;

    @JsonProperty("audiField007")
    private Boolean audiField007;

    @JsonProperty("audiField008")
    private Boolean audiField008;

    @JsonProperty("audiField009")
    private Double audiField009;

    @JsonProperty("audiField010")
    private LocalDate audiField010;

    @JsonProperty("audiField011")
    private Double audiField011;

    public AuditDto052() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AuditDto052 instance = new AuditDto052();

        public Builder audiField000(BigDecimal val) { instance.audiField000 = val; return this; }
        public Builder audiField001(Long val) { instance.audiField001 = val; return this; }
        public Builder audiField002(String val) { instance.audiField002 = val; return this; }
        public Builder audiField003(LocalDate val) { instance.audiField003 = val; return this; }
        public Builder audiField004(Integer val) { instance.audiField004 = val; return this; }
        public Builder audiField005(Integer val) { instance.audiField005 = val; return this; }
        public Builder audiField006(Double val) { instance.audiField006 = val; return this; }
        public Builder audiField007(Boolean val) { instance.audiField007 = val; return this; }
        public Builder audiField008(Boolean val) { instance.audiField008 = val; return this; }
        public Builder audiField009(Double val) { instance.audiField009 = val; return this; }
        public Builder audiField010(LocalDate val) { instance.audiField010 = val; return this; }
        public Builder audiField011(Double val) { instance.audiField011 = val; return this; }
        public AuditDto052 build() { return instance; }
    }

    public BigDecimal getAudiField000() { return audiField000; }
    public void setAudiField000(BigDecimal audiField000) { this.audiField000 = audiField000; }

    public Long getAudiField001() { return audiField001; }
    public void setAudiField001(Long audiField001) { this.audiField001 = audiField001; }

    public String getAudiField002() { return audiField002; }
    public void setAudiField002(String audiField002) { this.audiField002 = audiField002; }

    public LocalDate getAudiField003() { return audiField003; }
    public void setAudiField003(LocalDate audiField003) { this.audiField003 = audiField003; }

    public Integer getAudiField004() { return audiField004; }
    public void setAudiField004(Integer audiField004) { this.audiField004 = audiField004; }

    public Integer getAudiField005() { return audiField005; }
    public void setAudiField005(Integer audiField005) { this.audiField005 = audiField005; }

    public Double getAudiField006() { return audiField006; }
    public void setAudiField006(Double audiField006) { this.audiField006 = audiField006; }

    public Boolean getAudiField007() { return audiField007; }
    public void setAudiField007(Boolean audiField007) { this.audiField007 = audiField007; }

    public Boolean getAudiField008() { return audiField008; }
    public void setAudiField008(Boolean audiField008) { this.audiField008 = audiField008; }

    public Double getAudiField009() { return audiField009; }
    public void setAudiField009(Double audiField009) { this.audiField009 = audiField009; }

    public LocalDate getAudiField010() { return audiField010; }
    public void setAudiField010(LocalDate audiField010) { this.audiField010 = audiField010; }

    public Double getAudiField011() { return audiField011; }
    public void setAudiField011(Double audiField011) { this.audiField011 = audiField011; }

    @Override
    public String toString() {
        return "AuditDto052{" +
            "audiField000=" + audiField000 + ", " +
            "audiField001=" + audiField001 + ", " +
            "audiField002=" + audiField002 + ", " +
            "audiField003=" + audiField003 + ", " +
            "audiField004=" + audiField004 + ", " +
            "}";
    }
}
