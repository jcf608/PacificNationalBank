package com.pnb.audit;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AuditDto043 — Data Transfer Object for audit operations.
 * Variant 43 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuditDto043 {

    @JsonProperty("audiField000")
    private Boolean audiField000;

    @JsonProperty("audiField001")
    private Double audiField001;

    @Size(max = 100)
    @JsonProperty("audiField002")
    private String audiField002;

    @JsonProperty("audiField003")
    private Double audiField003;

    @Size(max = 20)
    @JsonProperty("audiField004")
    private String audiField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("audiField005")
    private BigDecimal audiField005;

    @JsonProperty("audiField006")
    private LocalDate audiField006;

    @JsonProperty("audiField007")
    private Boolean audiField007;

    @Size(max = 20)
    @JsonProperty("audiField008")
    private String audiField008;

    @JsonProperty("audiField009")
    private Integer audiField009;

    @JsonProperty("audiField010")
    private Integer audiField010;

    @JsonProperty("audiField011")
    private Long audiField011;

    @DecimalMin(value = "0.00")
    @JsonProperty("audiField012")
    private BigDecimal audiField012;

    @DecimalMin(value = "0.00")
    @JsonProperty("audiField013")
    private BigDecimal audiField013;

    @JsonProperty("audiField014")
    private LocalDate audiField014;

    public AuditDto043() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AuditDto043 instance = new AuditDto043();

        public Builder audiField000(Boolean val) { instance.audiField000 = val; return this; }
        public Builder audiField001(Double val) { instance.audiField001 = val; return this; }
        public Builder audiField002(String val) { instance.audiField002 = val; return this; }
        public Builder audiField003(Double val) { instance.audiField003 = val; return this; }
        public Builder audiField004(String val) { instance.audiField004 = val; return this; }
        public Builder audiField005(BigDecimal val) { instance.audiField005 = val; return this; }
        public Builder audiField006(LocalDate val) { instance.audiField006 = val; return this; }
        public Builder audiField007(Boolean val) { instance.audiField007 = val; return this; }
        public Builder audiField008(String val) { instance.audiField008 = val; return this; }
        public Builder audiField009(Integer val) { instance.audiField009 = val; return this; }
        public Builder audiField010(Integer val) { instance.audiField010 = val; return this; }
        public Builder audiField011(Long val) { instance.audiField011 = val; return this; }
        public Builder audiField012(BigDecimal val) { instance.audiField012 = val; return this; }
        public Builder audiField013(BigDecimal val) { instance.audiField013 = val; return this; }
        public Builder audiField014(LocalDate val) { instance.audiField014 = val; return this; }
        public AuditDto043 build() { return instance; }
    }

    public Boolean getAudiField000() { return audiField000; }
    public void setAudiField000(Boolean audiField000) { this.audiField000 = audiField000; }

    public Double getAudiField001() { return audiField001; }
    public void setAudiField001(Double audiField001) { this.audiField001 = audiField001; }

    public String getAudiField002() { return audiField002; }
    public void setAudiField002(String audiField002) { this.audiField002 = audiField002; }

    public Double getAudiField003() { return audiField003; }
    public void setAudiField003(Double audiField003) { this.audiField003 = audiField003; }

    public String getAudiField004() { return audiField004; }
    public void setAudiField004(String audiField004) { this.audiField004 = audiField004; }

    public BigDecimal getAudiField005() { return audiField005; }
    public void setAudiField005(BigDecimal audiField005) { this.audiField005 = audiField005; }

    public LocalDate getAudiField006() { return audiField006; }
    public void setAudiField006(LocalDate audiField006) { this.audiField006 = audiField006; }

    public Boolean getAudiField007() { return audiField007; }
    public void setAudiField007(Boolean audiField007) { this.audiField007 = audiField007; }

    public String getAudiField008() { return audiField008; }
    public void setAudiField008(String audiField008) { this.audiField008 = audiField008; }

    public Integer getAudiField009() { return audiField009; }
    public void setAudiField009(Integer audiField009) { this.audiField009 = audiField009; }

    public Integer getAudiField010() { return audiField010; }
    public void setAudiField010(Integer audiField010) { this.audiField010 = audiField010; }

    public Long getAudiField011() { return audiField011; }
    public void setAudiField011(Long audiField011) { this.audiField011 = audiField011; }

    public BigDecimal getAudiField012() { return audiField012; }
    public void setAudiField012(BigDecimal audiField012) { this.audiField012 = audiField012; }

    public BigDecimal getAudiField013() { return audiField013; }
    public void setAudiField013(BigDecimal audiField013) { this.audiField013 = audiField013; }

    public LocalDate getAudiField014() { return audiField014; }
    public void setAudiField014(LocalDate audiField014) { this.audiField014 = audiField014; }

    @Override
    public String toString() {
        return "AuditDto043{" +
            "audiField000=" + audiField000 + ", " +
            "audiField001=" + audiField001 + ", " +
            "audiField002=" + audiField002 + ", " +
            "audiField003=" + audiField003 + ", " +
            "audiField004=" + audiField004 + ", " +
            "}";
    }
}
