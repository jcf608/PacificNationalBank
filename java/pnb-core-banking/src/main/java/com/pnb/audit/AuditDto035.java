package com.pnb.audit;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AuditDto035 — Data Transfer Object for audit operations.
 * Variant 35 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuditDto035 {

    @JsonProperty("audiField000")
    private Long audiField000;

    @DecimalMin(value = "0.00")
    @JsonProperty("audiField001")
    private BigDecimal audiField001;

    @JsonProperty("audiField002")
    private Double audiField002;

    @JsonProperty("audiField003")
    private Integer audiField003;

    @JsonProperty("audiField004")
    private LocalDate audiField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("audiField005")
    private BigDecimal audiField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("audiField006")
    private BigDecimal audiField006;

    @Size(max = 60)
    @JsonProperty("audiField007")
    private String audiField007;

    @Size(max = 200)
    @JsonProperty("audiField008")
    private String audiField008;

    @JsonProperty("audiField009")
    private Boolean audiField009;

    @JsonProperty("audiField010")
    private LocalDate audiField010;

    @DecimalMin(value = "0.00")
    @JsonProperty("audiField011")
    private BigDecimal audiField011;

    @DecimalMin(value = "0.00")
    @JsonProperty("audiField012")
    private BigDecimal audiField012;

    @JsonProperty("audiField013")
    private Long audiField013;

    @Size(max = 60)
    @JsonProperty("audiField014")
    private String audiField014;

    @JsonProperty("audiField015")
    private Boolean audiField015;

    @JsonProperty("audiField016")
    private Long audiField016;

    @JsonProperty("audiField017")
    private Boolean audiField017;

    @Size(max = 40)
    @JsonProperty("audiField018")
    private String audiField018;

    public AuditDto035() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AuditDto035 instance = new AuditDto035();

        public Builder audiField000(Long val) { instance.audiField000 = val; return this; }
        public Builder audiField001(BigDecimal val) { instance.audiField001 = val; return this; }
        public Builder audiField002(Double val) { instance.audiField002 = val; return this; }
        public Builder audiField003(Integer val) { instance.audiField003 = val; return this; }
        public Builder audiField004(LocalDate val) { instance.audiField004 = val; return this; }
        public Builder audiField005(BigDecimal val) { instance.audiField005 = val; return this; }
        public Builder audiField006(BigDecimal val) { instance.audiField006 = val; return this; }
        public Builder audiField007(String val) { instance.audiField007 = val; return this; }
        public Builder audiField008(String val) { instance.audiField008 = val; return this; }
        public Builder audiField009(Boolean val) { instance.audiField009 = val; return this; }
        public Builder audiField010(LocalDate val) { instance.audiField010 = val; return this; }
        public Builder audiField011(BigDecimal val) { instance.audiField011 = val; return this; }
        public Builder audiField012(BigDecimal val) { instance.audiField012 = val; return this; }
        public Builder audiField013(Long val) { instance.audiField013 = val; return this; }
        public Builder audiField014(String val) { instance.audiField014 = val; return this; }
        public Builder audiField015(Boolean val) { instance.audiField015 = val; return this; }
        public Builder audiField016(Long val) { instance.audiField016 = val; return this; }
        public Builder audiField017(Boolean val) { instance.audiField017 = val; return this; }
        public Builder audiField018(String val) { instance.audiField018 = val; return this; }
        public AuditDto035 build() { return instance; }
    }

    public Long getAudiField000() { return audiField000; }
    public void setAudiField000(Long audiField000) { this.audiField000 = audiField000; }

    public BigDecimal getAudiField001() { return audiField001; }
    public void setAudiField001(BigDecimal audiField001) { this.audiField001 = audiField001; }

    public Double getAudiField002() { return audiField002; }
    public void setAudiField002(Double audiField002) { this.audiField002 = audiField002; }

    public Integer getAudiField003() { return audiField003; }
    public void setAudiField003(Integer audiField003) { this.audiField003 = audiField003; }

    public LocalDate getAudiField004() { return audiField004; }
    public void setAudiField004(LocalDate audiField004) { this.audiField004 = audiField004; }

    public BigDecimal getAudiField005() { return audiField005; }
    public void setAudiField005(BigDecimal audiField005) { this.audiField005 = audiField005; }

    public BigDecimal getAudiField006() { return audiField006; }
    public void setAudiField006(BigDecimal audiField006) { this.audiField006 = audiField006; }

    public String getAudiField007() { return audiField007; }
    public void setAudiField007(String audiField007) { this.audiField007 = audiField007; }

    public String getAudiField008() { return audiField008; }
    public void setAudiField008(String audiField008) { this.audiField008 = audiField008; }

    public Boolean getAudiField009() { return audiField009; }
    public void setAudiField009(Boolean audiField009) { this.audiField009 = audiField009; }

    public LocalDate getAudiField010() { return audiField010; }
    public void setAudiField010(LocalDate audiField010) { this.audiField010 = audiField010; }

    public BigDecimal getAudiField011() { return audiField011; }
    public void setAudiField011(BigDecimal audiField011) { this.audiField011 = audiField011; }

    public BigDecimal getAudiField012() { return audiField012; }
    public void setAudiField012(BigDecimal audiField012) { this.audiField012 = audiField012; }

    public Long getAudiField013() { return audiField013; }
    public void setAudiField013(Long audiField013) { this.audiField013 = audiField013; }

    public String getAudiField014() { return audiField014; }
    public void setAudiField014(String audiField014) { this.audiField014 = audiField014; }

    public Boolean getAudiField015() { return audiField015; }
    public void setAudiField015(Boolean audiField015) { this.audiField015 = audiField015; }

    public Long getAudiField016() { return audiField016; }
    public void setAudiField016(Long audiField016) { this.audiField016 = audiField016; }

    public Boolean getAudiField017() { return audiField017; }
    public void setAudiField017(Boolean audiField017) { this.audiField017 = audiField017; }

    public String getAudiField018() { return audiField018; }
    public void setAudiField018(String audiField018) { this.audiField018 = audiField018; }

    @Override
    public String toString() {
        return "AuditDto035{" +
            "audiField000=" + audiField000 + ", " +
            "audiField001=" + audiField001 + ", " +
            "audiField002=" + audiField002 + ", " +
            "audiField003=" + audiField003 + ", " +
            "audiField004=" + audiField004 + ", " +
            "}";
    }
}
