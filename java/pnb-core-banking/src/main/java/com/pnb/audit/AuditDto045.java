package com.pnb.audit;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AuditDto045 — Data Transfer Object for audit operations.
 * Variant 45 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuditDto045 {

    @JsonProperty("audiField000")
    private Integer audiField000;

    @JsonProperty("audiField001")
    private Long audiField001;

    @JsonProperty("audiField002")
    private LocalDate audiField002;

    @JsonProperty("audiField003")
    private LocalDate audiField003;

    @JsonProperty("audiField004")
    private Integer audiField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("audiField005")
    private BigDecimal audiField005;

    @JsonProperty("audiField006")
    private Integer audiField006;

    @JsonProperty("audiField007")
    private Integer audiField007;

    @JsonProperty("audiField008")
    private Boolean audiField008;

    @JsonProperty("audiField009")
    private LocalDate audiField009;

    @Size(max = 60)
    @JsonProperty("audiField010")
    private String audiField010;

    @DecimalMin(value = "0.00")
    @JsonProperty("audiField011")
    private BigDecimal audiField011;

    @DecimalMin(value = "0.00")
    @JsonProperty("audiField012")
    private BigDecimal audiField012;

    @JsonProperty("audiField013")
    private Boolean audiField013;

    @JsonProperty("audiField014")
    private Long audiField014;

    @JsonProperty("audiField015")
    private Double audiField015;

    @JsonProperty("audiField016")
    private Boolean audiField016;

    public AuditDto045() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AuditDto045 instance = new AuditDto045();

        public Builder audiField000(Integer val) { instance.audiField000 = val; return this; }
        public Builder audiField001(Long val) { instance.audiField001 = val; return this; }
        public Builder audiField002(LocalDate val) { instance.audiField002 = val; return this; }
        public Builder audiField003(LocalDate val) { instance.audiField003 = val; return this; }
        public Builder audiField004(Integer val) { instance.audiField004 = val; return this; }
        public Builder audiField005(BigDecimal val) { instance.audiField005 = val; return this; }
        public Builder audiField006(Integer val) { instance.audiField006 = val; return this; }
        public Builder audiField007(Integer val) { instance.audiField007 = val; return this; }
        public Builder audiField008(Boolean val) { instance.audiField008 = val; return this; }
        public Builder audiField009(LocalDate val) { instance.audiField009 = val; return this; }
        public Builder audiField010(String val) { instance.audiField010 = val; return this; }
        public Builder audiField011(BigDecimal val) { instance.audiField011 = val; return this; }
        public Builder audiField012(BigDecimal val) { instance.audiField012 = val; return this; }
        public Builder audiField013(Boolean val) { instance.audiField013 = val; return this; }
        public Builder audiField014(Long val) { instance.audiField014 = val; return this; }
        public Builder audiField015(Double val) { instance.audiField015 = val; return this; }
        public Builder audiField016(Boolean val) { instance.audiField016 = val; return this; }
        public AuditDto045 build() { return instance; }
    }

    public Integer getAudiField000() { return audiField000; }
    public void setAudiField000(Integer audiField000) { this.audiField000 = audiField000; }

    public Long getAudiField001() { return audiField001; }
    public void setAudiField001(Long audiField001) { this.audiField001 = audiField001; }

    public LocalDate getAudiField002() { return audiField002; }
    public void setAudiField002(LocalDate audiField002) { this.audiField002 = audiField002; }

    public LocalDate getAudiField003() { return audiField003; }
    public void setAudiField003(LocalDate audiField003) { this.audiField003 = audiField003; }

    public Integer getAudiField004() { return audiField004; }
    public void setAudiField004(Integer audiField004) { this.audiField004 = audiField004; }

    public BigDecimal getAudiField005() { return audiField005; }
    public void setAudiField005(BigDecimal audiField005) { this.audiField005 = audiField005; }

    public Integer getAudiField006() { return audiField006; }
    public void setAudiField006(Integer audiField006) { this.audiField006 = audiField006; }

    public Integer getAudiField007() { return audiField007; }
    public void setAudiField007(Integer audiField007) { this.audiField007 = audiField007; }

    public Boolean getAudiField008() { return audiField008; }
    public void setAudiField008(Boolean audiField008) { this.audiField008 = audiField008; }

    public LocalDate getAudiField009() { return audiField009; }
    public void setAudiField009(LocalDate audiField009) { this.audiField009 = audiField009; }

    public String getAudiField010() { return audiField010; }
    public void setAudiField010(String audiField010) { this.audiField010 = audiField010; }

    public BigDecimal getAudiField011() { return audiField011; }
    public void setAudiField011(BigDecimal audiField011) { this.audiField011 = audiField011; }

    public BigDecimal getAudiField012() { return audiField012; }
    public void setAudiField012(BigDecimal audiField012) { this.audiField012 = audiField012; }

    public Boolean getAudiField013() { return audiField013; }
    public void setAudiField013(Boolean audiField013) { this.audiField013 = audiField013; }

    public Long getAudiField014() { return audiField014; }
    public void setAudiField014(Long audiField014) { this.audiField014 = audiField014; }

    public Double getAudiField015() { return audiField015; }
    public void setAudiField015(Double audiField015) { this.audiField015 = audiField015; }

    public Boolean getAudiField016() { return audiField016; }
    public void setAudiField016(Boolean audiField016) { this.audiField016 = audiField016; }

    @Override
    public String toString() {
        return "AuditDto045{" +
            "audiField000=" + audiField000 + ", " +
            "audiField001=" + audiField001 + ", " +
            "audiField002=" + audiField002 + ", " +
            "audiField003=" + audiField003 + ", " +
            "audiField004=" + audiField004 + ", " +
            "}";
    }
}
