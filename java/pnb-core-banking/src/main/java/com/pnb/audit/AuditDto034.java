package com.pnb.audit;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AuditDto034 — Data Transfer Object for audit operations.
 * Variant 34 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuditDto034 {

    @JsonProperty("audiField000")
    private LocalDate audiField000;

    @JsonProperty("audiField001")
    private Boolean audiField001;

    @JsonProperty("audiField002")
    private Long audiField002;

    @JsonProperty("audiField003")
    private LocalDate audiField003;

    @Size(max = 200)
    @JsonProperty("audiField004")
    private String audiField004;

    @JsonProperty("audiField005")
    private Integer audiField005;

    @JsonProperty("audiField006")
    private Double audiField006;

    @JsonProperty("audiField007")
    private LocalDate audiField007;

    @JsonProperty("audiField008")
    private Long audiField008;

    @JsonProperty("audiField009")
    private Integer audiField009;

    @JsonProperty("audiField010")
    private Integer audiField010;

    @JsonProperty("audiField011")
    private Long audiField011;

    @DecimalMin(value = "0.00")
    @JsonProperty("audiField012")
    private BigDecimal audiField012;

    @JsonProperty("audiField013")
    private Integer audiField013;

    @JsonProperty("audiField014")
    private Double audiField014;

    @JsonProperty("audiField015")
    private LocalDate audiField015;

    @JsonProperty("audiField016")
    private Double audiField016;

    @JsonProperty("audiField017")
    private Long audiField017;

    public AuditDto034() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AuditDto034 instance = new AuditDto034();

        public Builder audiField000(LocalDate val) { instance.audiField000 = val; return this; }
        public Builder audiField001(Boolean val) { instance.audiField001 = val; return this; }
        public Builder audiField002(Long val) { instance.audiField002 = val; return this; }
        public Builder audiField003(LocalDate val) { instance.audiField003 = val; return this; }
        public Builder audiField004(String val) { instance.audiField004 = val; return this; }
        public Builder audiField005(Integer val) { instance.audiField005 = val; return this; }
        public Builder audiField006(Double val) { instance.audiField006 = val; return this; }
        public Builder audiField007(LocalDate val) { instance.audiField007 = val; return this; }
        public Builder audiField008(Long val) { instance.audiField008 = val; return this; }
        public Builder audiField009(Integer val) { instance.audiField009 = val; return this; }
        public Builder audiField010(Integer val) { instance.audiField010 = val; return this; }
        public Builder audiField011(Long val) { instance.audiField011 = val; return this; }
        public Builder audiField012(BigDecimal val) { instance.audiField012 = val; return this; }
        public Builder audiField013(Integer val) { instance.audiField013 = val; return this; }
        public Builder audiField014(Double val) { instance.audiField014 = val; return this; }
        public Builder audiField015(LocalDate val) { instance.audiField015 = val; return this; }
        public Builder audiField016(Double val) { instance.audiField016 = val; return this; }
        public Builder audiField017(Long val) { instance.audiField017 = val; return this; }
        public AuditDto034 build() { return instance; }
    }

    public LocalDate getAudiField000() { return audiField000; }
    public void setAudiField000(LocalDate audiField000) { this.audiField000 = audiField000; }

    public Boolean getAudiField001() { return audiField001; }
    public void setAudiField001(Boolean audiField001) { this.audiField001 = audiField001; }

    public Long getAudiField002() { return audiField002; }
    public void setAudiField002(Long audiField002) { this.audiField002 = audiField002; }

    public LocalDate getAudiField003() { return audiField003; }
    public void setAudiField003(LocalDate audiField003) { this.audiField003 = audiField003; }

    public String getAudiField004() { return audiField004; }
    public void setAudiField004(String audiField004) { this.audiField004 = audiField004; }

    public Integer getAudiField005() { return audiField005; }
    public void setAudiField005(Integer audiField005) { this.audiField005 = audiField005; }

    public Double getAudiField006() { return audiField006; }
    public void setAudiField006(Double audiField006) { this.audiField006 = audiField006; }

    public LocalDate getAudiField007() { return audiField007; }
    public void setAudiField007(LocalDate audiField007) { this.audiField007 = audiField007; }

    public Long getAudiField008() { return audiField008; }
    public void setAudiField008(Long audiField008) { this.audiField008 = audiField008; }

    public Integer getAudiField009() { return audiField009; }
    public void setAudiField009(Integer audiField009) { this.audiField009 = audiField009; }

    public Integer getAudiField010() { return audiField010; }
    public void setAudiField010(Integer audiField010) { this.audiField010 = audiField010; }

    public Long getAudiField011() { return audiField011; }
    public void setAudiField011(Long audiField011) { this.audiField011 = audiField011; }

    public BigDecimal getAudiField012() { return audiField012; }
    public void setAudiField012(BigDecimal audiField012) { this.audiField012 = audiField012; }

    public Integer getAudiField013() { return audiField013; }
    public void setAudiField013(Integer audiField013) { this.audiField013 = audiField013; }

    public Double getAudiField014() { return audiField014; }
    public void setAudiField014(Double audiField014) { this.audiField014 = audiField014; }

    public LocalDate getAudiField015() { return audiField015; }
    public void setAudiField015(LocalDate audiField015) { this.audiField015 = audiField015; }

    public Double getAudiField016() { return audiField016; }
    public void setAudiField016(Double audiField016) { this.audiField016 = audiField016; }

    public Long getAudiField017() { return audiField017; }
    public void setAudiField017(Long audiField017) { this.audiField017 = audiField017; }

    @Override
    public String toString() {
        return "AuditDto034{" +
            "audiField000=" + audiField000 + ", " +
            "audiField001=" + audiField001 + ", " +
            "audiField002=" + audiField002 + ", " +
            "audiField003=" + audiField003 + ", " +
            "audiField004=" + audiField004 + ", " +
            "}";
    }
}
