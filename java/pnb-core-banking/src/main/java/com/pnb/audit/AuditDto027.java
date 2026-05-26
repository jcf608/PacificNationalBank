package com.pnb.audit;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AuditDto027 — Data Transfer Object for audit operations.
 * Variant 27 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuditDto027 {

    @JsonProperty("audiField000")
    private Long audiField000;

    @JsonProperty("audiField001")
    private Boolean audiField001;

    @Size(max = 200)
    @JsonProperty("audiField002")
    private String audiField002;

    @JsonProperty("audiField003")
    private LocalDate audiField003;

    @DecimalMin(value = "0.00")
    @JsonProperty("audiField004")
    private BigDecimal audiField004;

    @JsonProperty("audiField005")
    private Integer audiField005;

    @JsonProperty("audiField006")
    private Integer audiField006;

    @JsonProperty("audiField007")
    private Integer audiField007;

    @JsonProperty("audiField008")
    private Double audiField008;

    @JsonProperty("audiField009")
    private Long audiField009;

    @JsonProperty("audiField010")
    private Integer audiField010;

    public AuditDto027() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AuditDto027 instance = new AuditDto027();

        public Builder audiField000(Long val) { instance.audiField000 = val; return this; }
        public Builder audiField001(Boolean val) { instance.audiField001 = val; return this; }
        public Builder audiField002(String val) { instance.audiField002 = val; return this; }
        public Builder audiField003(LocalDate val) { instance.audiField003 = val; return this; }
        public Builder audiField004(BigDecimal val) { instance.audiField004 = val; return this; }
        public Builder audiField005(Integer val) { instance.audiField005 = val; return this; }
        public Builder audiField006(Integer val) { instance.audiField006 = val; return this; }
        public Builder audiField007(Integer val) { instance.audiField007 = val; return this; }
        public Builder audiField008(Double val) { instance.audiField008 = val; return this; }
        public Builder audiField009(Long val) { instance.audiField009 = val; return this; }
        public Builder audiField010(Integer val) { instance.audiField010 = val; return this; }
        public AuditDto027 build() { return instance; }
    }

    public Long getAudiField000() { return audiField000; }
    public void setAudiField000(Long audiField000) { this.audiField000 = audiField000; }

    public Boolean getAudiField001() { return audiField001; }
    public void setAudiField001(Boolean audiField001) { this.audiField001 = audiField001; }

    public String getAudiField002() { return audiField002; }
    public void setAudiField002(String audiField002) { this.audiField002 = audiField002; }

    public LocalDate getAudiField003() { return audiField003; }
    public void setAudiField003(LocalDate audiField003) { this.audiField003 = audiField003; }

    public BigDecimal getAudiField004() { return audiField004; }
    public void setAudiField004(BigDecimal audiField004) { this.audiField004 = audiField004; }

    public Integer getAudiField005() { return audiField005; }
    public void setAudiField005(Integer audiField005) { this.audiField005 = audiField005; }

    public Integer getAudiField006() { return audiField006; }
    public void setAudiField006(Integer audiField006) { this.audiField006 = audiField006; }

    public Integer getAudiField007() { return audiField007; }
    public void setAudiField007(Integer audiField007) { this.audiField007 = audiField007; }

    public Double getAudiField008() { return audiField008; }
    public void setAudiField008(Double audiField008) { this.audiField008 = audiField008; }

    public Long getAudiField009() { return audiField009; }
    public void setAudiField009(Long audiField009) { this.audiField009 = audiField009; }

    public Integer getAudiField010() { return audiField010; }
    public void setAudiField010(Integer audiField010) { this.audiField010 = audiField010; }

    @Override
    public String toString() {
        return "AuditDto027{" +
            "audiField000=" + audiField000 + ", " +
            "audiField001=" + audiField001 + ", " +
            "audiField002=" + audiField002 + ", " +
            "audiField003=" + audiField003 + ", " +
            "audiField004=" + audiField004 + ", " +
            "}";
    }
}
