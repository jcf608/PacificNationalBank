package com.pnb.audit;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AuditDto032 — Data Transfer Object for audit operations.
 * Variant 32 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuditDto032 {

    @DecimalMin(value = "0.00")
    @JsonProperty("audiField000")
    private BigDecimal audiField000;

    @JsonProperty("audiField001")
    private Long audiField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("audiField002")
    private BigDecimal audiField002;

    @JsonProperty("audiField003")
    private LocalDate audiField003;

    @DecimalMin(value = "0.00")
    @JsonProperty("audiField004")
    private BigDecimal audiField004;

    @Size(max = 40)
    @JsonProperty("audiField005")
    private String audiField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("audiField006")
    private BigDecimal audiField006;

    @JsonProperty("audiField007")
    private Double audiField007;

    @JsonProperty("audiField008")
    private Long audiField008;

    @JsonProperty("audiField009")
    private Long audiField009;

    @DecimalMin(value = "0.00")
    @JsonProperty("audiField010")
    private BigDecimal audiField010;

    @JsonProperty("audiField011")
    private Integer audiField011;

    @JsonProperty("audiField012")
    private Double audiField012;

    @JsonProperty("audiField013")
    private Long audiField013;

    @JsonProperty("audiField014")
    private Double audiField014;

    @JsonProperty("audiField015")
    private Double audiField015;

    public AuditDto032() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AuditDto032 instance = new AuditDto032();

        public Builder audiField000(BigDecimal val) { instance.audiField000 = val; return this; }
        public Builder audiField001(Long val) { instance.audiField001 = val; return this; }
        public Builder audiField002(BigDecimal val) { instance.audiField002 = val; return this; }
        public Builder audiField003(LocalDate val) { instance.audiField003 = val; return this; }
        public Builder audiField004(BigDecimal val) { instance.audiField004 = val; return this; }
        public Builder audiField005(String val) { instance.audiField005 = val; return this; }
        public Builder audiField006(BigDecimal val) { instance.audiField006 = val; return this; }
        public Builder audiField007(Double val) { instance.audiField007 = val; return this; }
        public Builder audiField008(Long val) { instance.audiField008 = val; return this; }
        public Builder audiField009(Long val) { instance.audiField009 = val; return this; }
        public Builder audiField010(BigDecimal val) { instance.audiField010 = val; return this; }
        public Builder audiField011(Integer val) { instance.audiField011 = val; return this; }
        public Builder audiField012(Double val) { instance.audiField012 = val; return this; }
        public Builder audiField013(Long val) { instance.audiField013 = val; return this; }
        public Builder audiField014(Double val) { instance.audiField014 = val; return this; }
        public Builder audiField015(Double val) { instance.audiField015 = val; return this; }
        public AuditDto032 build() { return instance; }
    }

    public BigDecimal getAudiField000() { return audiField000; }
    public void setAudiField000(BigDecimal audiField000) { this.audiField000 = audiField000; }

    public Long getAudiField001() { return audiField001; }
    public void setAudiField001(Long audiField001) { this.audiField001 = audiField001; }

    public BigDecimal getAudiField002() { return audiField002; }
    public void setAudiField002(BigDecimal audiField002) { this.audiField002 = audiField002; }

    public LocalDate getAudiField003() { return audiField003; }
    public void setAudiField003(LocalDate audiField003) { this.audiField003 = audiField003; }

    public BigDecimal getAudiField004() { return audiField004; }
    public void setAudiField004(BigDecimal audiField004) { this.audiField004 = audiField004; }

    public String getAudiField005() { return audiField005; }
    public void setAudiField005(String audiField005) { this.audiField005 = audiField005; }

    public BigDecimal getAudiField006() { return audiField006; }
    public void setAudiField006(BigDecimal audiField006) { this.audiField006 = audiField006; }

    public Double getAudiField007() { return audiField007; }
    public void setAudiField007(Double audiField007) { this.audiField007 = audiField007; }

    public Long getAudiField008() { return audiField008; }
    public void setAudiField008(Long audiField008) { this.audiField008 = audiField008; }

    public Long getAudiField009() { return audiField009; }
    public void setAudiField009(Long audiField009) { this.audiField009 = audiField009; }

    public BigDecimal getAudiField010() { return audiField010; }
    public void setAudiField010(BigDecimal audiField010) { this.audiField010 = audiField010; }

    public Integer getAudiField011() { return audiField011; }
    public void setAudiField011(Integer audiField011) { this.audiField011 = audiField011; }

    public Double getAudiField012() { return audiField012; }
    public void setAudiField012(Double audiField012) { this.audiField012 = audiField012; }

    public Long getAudiField013() { return audiField013; }
    public void setAudiField013(Long audiField013) { this.audiField013 = audiField013; }

    public Double getAudiField014() { return audiField014; }
    public void setAudiField014(Double audiField014) { this.audiField014 = audiField014; }

    public Double getAudiField015() { return audiField015; }
    public void setAudiField015(Double audiField015) { this.audiField015 = audiField015; }

    @Override
    public String toString() {
        return "AuditDto032{" +
            "audiField000=" + audiField000 + ", " +
            "audiField001=" + audiField001 + ", " +
            "audiField002=" + audiField002 + ", " +
            "audiField003=" + audiField003 + ", " +
            "audiField004=" + audiField004 + ", " +
            "}";
    }
}
