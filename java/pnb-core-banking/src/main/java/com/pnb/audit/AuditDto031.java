package com.pnb.audit;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AuditDto031 — Data Transfer Object for audit operations.
 * Variant 31 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuditDto031 {

    @JsonProperty("audiField000")
    private Boolean audiField000;

    @JsonProperty("audiField001")
    private Long audiField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("audiField002")
    private BigDecimal audiField002;

    @JsonProperty("audiField003")
    private Long audiField003;

    @Size(max = 20)
    @JsonProperty("audiField004")
    private String audiField004;

    @Size(max = 60)
    @JsonProperty("audiField005")
    private String audiField005;

    @JsonProperty("audiField006")
    private Double audiField006;

    @Size(max = 40)
    @JsonProperty("audiField007")
    private String audiField007;

    @JsonProperty("audiField008")
    private LocalDate audiField008;

    @Size(max = 60)
    @JsonProperty("audiField009")
    private String audiField009;

    @JsonProperty("audiField010")
    private Double audiField010;

    @JsonProperty("audiField011")
    private Integer audiField011;

    @DecimalMin(value = "0.00")
    @JsonProperty("audiField012")
    private BigDecimal audiField012;

    @Size(max = 60)
    @JsonProperty("audiField013")
    private String audiField013;

    @DecimalMin(value = "0.00")
    @JsonProperty("audiField014")
    private BigDecimal audiField014;

    public AuditDto031() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AuditDto031 instance = new AuditDto031();

        public Builder audiField000(Boolean val) { instance.audiField000 = val; return this; }
        public Builder audiField001(Long val) { instance.audiField001 = val; return this; }
        public Builder audiField002(BigDecimal val) { instance.audiField002 = val; return this; }
        public Builder audiField003(Long val) { instance.audiField003 = val; return this; }
        public Builder audiField004(String val) { instance.audiField004 = val; return this; }
        public Builder audiField005(String val) { instance.audiField005 = val; return this; }
        public Builder audiField006(Double val) { instance.audiField006 = val; return this; }
        public Builder audiField007(String val) { instance.audiField007 = val; return this; }
        public Builder audiField008(LocalDate val) { instance.audiField008 = val; return this; }
        public Builder audiField009(String val) { instance.audiField009 = val; return this; }
        public Builder audiField010(Double val) { instance.audiField010 = val; return this; }
        public Builder audiField011(Integer val) { instance.audiField011 = val; return this; }
        public Builder audiField012(BigDecimal val) { instance.audiField012 = val; return this; }
        public Builder audiField013(String val) { instance.audiField013 = val; return this; }
        public Builder audiField014(BigDecimal val) { instance.audiField014 = val; return this; }
        public AuditDto031 build() { return instance; }
    }

    public Boolean getAudiField000() { return audiField000; }
    public void setAudiField000(Boolean audiField000) { this.audiField000 = audiField000; }

    public Long getAudiField001() { return audiField001; }
    public void setAudiField001(Long audiField001) { this.audiField001 = audiField001; }

    public BigDecimal getAudiField002() { return audiField002; }
    public void setAudiField002(BigDecimal audiField002) { this.audiField002 = audiField002; }

    public Long getAudiField003() { return audiField003; }
    public void setAudiField003(Long audiField003) { this.audiField003 = audiField003; }

    public String getAudiField004() { return audiField004; }
    public void setAudiField004(String audiField004) { this.audiField004 = audiField004; }

    public String getAudiField005() { return audiField005; }
    public void setAudiField005(String audiField005) { this.audiField005 = audiField005; }

    public Double getAudiField006() { return audiField006; }
    public void setAudiField006(Double audiField006) { this.audiField006 = audiField006; }

    public String getAudiField007() { return audiField007; }
    public void setAudiField007(String audiField007) { this.audiField007 = audiField007; }

    public LocalDate getAudiField008() { return audiField008; }
    public void setAudiField008(LocalDate audiField008) { this.audiField008 = audiField008; }

    public String getAudiField009() { return audiField009; }
    public void setAudiField009(String audiField009) { this.audiField009 = audiField009; }

    public Double getAudiField010() { return audiField010; }
    public void setAudiField010(Double audiField010) { this.audiField010 = audiField010; }

    public Integer getAudiField011() { return audiField011; }
    public void setAudiField011(Integer audiField011) { this.audiField011 = audiField011; }

    public BigDecimal getAudiField012() { return audiField012; }
    public void setAudiField012(BigDecimal audiField012) { this.audiField012 = audiField012; }

    public String getAudiField013() { return audiField013; }
    public void setAudiField013(String audiField013) { this.audiField013 = audiField013; }

    public BigDecimal getAudiField014() { return audiField014; }
    public void setAudiField014(BigDecimal audiField014) { this.audiField014 = audiField014; }

    @Override
    public String toString() {
        return "AuditDto031{" +
            "audiField000=" + audiField000 + ", " +
            "audiField001=" + audiField001 + ", " +
            "audiField002=" + audiField002 + ", " +
            "audiField003=" + audiField003 + ", " +
            "audiField004=" + audiField004 + ", " +
            "}";
    }
}
