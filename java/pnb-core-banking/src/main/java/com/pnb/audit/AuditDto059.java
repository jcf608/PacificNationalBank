package com.pnb.audit;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AuditDto059 — Data Transfer Object for audit operations.
 * Variant 59 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuditDto059 {

    @JsonProperty("audiField000")
    private Long audiField000;

    @DecimalMin(value = "0.00")
    @JsonProperty("audiField001")
    private BigDecimal audiField001;

    @JsonProperty("audiField002")
    private Boolean audiField002;

    @JsonProperty("audiField003")
    private Integer audiField003;

    @JsonProperty("audiField004")
    private Long audiField004;

    @JsonProperty("audiField005")
    private Integer audiField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("audiField006")
    private BigDecimal audiField006;

    @JsonProperty("audiField007")
    private Double audiField007;

    @DecimalMin(value = "0.00")
    @JsonProperty("audiField008")
    private BigDecimal audiField008;

    @DecimalMin(value = "0.00")
    @JsonProperty("audiField009")
    private BigDecimal audiField009;

    @JsonProperty("audiField010")
    private Boolean audiField010;

    @JsonProperty("audiField011")
    private LocalDate audiField011;

    @JsonProperty("audiField012")
    private LocalDate audiField012;

    @JsonProperty("audiField013")
    private LocalDate audiField013;

    @DecimalMin(value = "0.00")
    @JsonProperty("audiField014")
    private BigDecimal audiField014;

    @DecimalMin(value = "0.00")
    @JsonProperty("audiField015")
    private BigDecimal audiField015;

    @Size(max = 200)
    @JsonProperty("audiField016")
    private String audiField016;

    @JsonProperty("audiField017")
    private Boolean audiField017;

    @JsonProperty("audiField018")
    private Boolean audiField018;

    public AuditDto059() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AuditDto059 instance = new AuditDto059();

        public Builder audiField000(Long val) { instance.audiField000 = val; return this; }
        public Builder audiField001(BigDecimal val) { instance.audiField001 = val; return this; }
        public Builder audiField002(Boolean val) { instance.audiField002 = val; return this; }
        public Builder audiField003(Integer val) { instance.audiField003 = val; return this; }
        public Builder audiField004(Long val) { instance.audiField004 = val; return this; }
        public Builder audiField005(Integer val) { instance.audiField005 = val; return this; }
        public Builder audiField006(BigDecimal val) { instance.audiField006 = val; return this; }
        public Builder audiField007(Double val) { instance.audiField007 = val; return this; }
        public Builder audiField008(BigDecimal val) { instance.audiField008 = val; return this; }
        public Builder audiField009(BigDecimal val) { instance.audiField009 = val; return this; }
        public Builder audiField010(Boolean val) { instance.audiField010 = val; return this; }
        public Builder audiField011(LocalDate val) { instance.audiField011 = val; return this; }
        public Builder audiField012(LocalDate val) { instance.audiField012 = val; return this; }
        public Builder audiField013(LocalDate val) { instance.audiField013 = val; return this; }
        public Builder audiField014(BigDecimal val) { instance.audiField014 = val; return this; }
        public Builder audiField015(BigDecimal val) { instance.audiField015 = val; return this; }
        public Builder audiField016(String val) { instance.audiField016 = val; return this; }
        public Builder audiField017(Boolean val) { instance.audiField017 = val; return this; }
        public Builder audiField018(Boolean val) { instance.audiField018 = val; return this; }
        public AuditDto059 build() { return instance; }
    }

    public Long getAudiField000() { return audiField000; }
    public void setAudiField000(Long audiField000) { this.audiField000 = audiField000; }

    public BigDecimal getAudiField001() { return audiField001; }
    public void setAudiField001(BigDecimal audiField001) { this.audiField001 = audiField001; }

    public Boolean getAudiField002() { return audiField002; }
    public void setAudiField002(Boolean audiField002) { this.audiField002 = audiField002; }

    public Integer getAudiField003() { return audiField003; }
    public void setAudiField003(Integer audiField003) { this.audiField003 = audiField003; }

    public Long getAudiField004() { return audiField004; }
    public void setAudiField004(Long audiField004) { this.audiField004 = audiField004; }

    public Integer getAudiField005() { return audiField005; }
    public void setAudiField005(Integer audiField005) { this.audiField005 = audiField005; }

    public BigDecimal getAudiField006() { return audiField006; }
    public void setAudiField006(BigDecimal audiField006) { this.audiField006 = audiField006; }

    public Double getAudiField007() { return audiField007; }
    public void setAudiField007(Double audiField007) { this.audiField007 = audiField007; }

    public BigDecimal getAudiField008() { return audiField008; }
    public void setAudiField008(BigDecimal audiField008) { this.audiField008 = audiField008; }

    public BigDecimal getAudiField009() { return audiField009; }
    public void setAudiField009(BigDecimal audiField009) { this.audiField009 = audiField009; }

    public Boolean getAudiField010() { return audiField010; }
    public void setAudiField010(Boolean audiField010) { this.audiField010 = audiField010; }

    public LocalDate getAudiField011() { return audiField011; }
    public void setAudiField011(LocalDate audiField011) { this.audiField011 = audiField011; }

    public LocalDate getAudiField012() { return audiField012; }
    public void setAudiField012(LocalDate audiField012) { this.audiField012 = audiField012; }

    public LocalDate getAudiField013() { return audiField013; }
    public void setAudiField013(LocalDate audiField013) { this.audiField013 = audiField013; }

    public BigDecimal getAudiField014() { return audiField014; }
    public void setAudiField014(BigDecimal audiField014) { this.audiField014 = audiField014; }

    public BigDecimal getAudiField015() { return audiField015; }
    public void setAudiField015(BigDecimal audiField015) { this.audiField015 = audiField015; }

    public String getAudiField016() { return audiField016; }
    public void setAudiField016(String audiField016) { this.audiField016 = audiField016; }

    public Boolean getAudiField017() { return audiField017; }
    public void setAudiField017(Boolean audiField017) { this.audiField017 = audiField017; }

    public Boolean getAudiField018() { return audiField018; }
    public void setAudiField018(Boolean audiField018) { this.audiField018 = audiField018; }

    @Override
    public String toString() {
        return "AuditDto059{" +
            "audiField000=" + audiField000 + ", " +
            "audiField001=" + audiField001 + ", " +
            "audiField002=" + audiField002 + ", " +
            "audiField003=" + audiField003 + ", " +
            "audiField004=" + audiField004 + ", " +
            "}";
    }
}
