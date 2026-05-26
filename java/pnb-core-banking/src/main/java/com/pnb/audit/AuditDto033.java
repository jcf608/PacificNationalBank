package com.pnb.audit;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AuditDto033 — Data Transfer Object for audit operations.
 * Variant 33 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuditDto033 {

    @JsonProperty("audiField000")
    private LocalDate audiField000;

    @DecimalMin(value = "0.00")
    @JsonProperty("audiField001")
    private BigDecimal audiField001;

    @JsonProperty("audiField002")
    private Double audiField002;

    @JsonProperty("audiField003")
    private Boolean audiField003;

    @JsonProperty("audiField004")
    private Long audiField004;

    @JsonProperty("audiField005")
    private Double audiField005;

    @JsonProperty("audiField006")
    private LocalDate audiField006;

    @JsonProperty("audiField007")
    private Integer audiField007;

    @JsonProperty("audiField008")
    private Integer audiField008;

    @Size(max = 200)
    @JsonProperty("audiField009")
    private String audiField009;

    @JsonProperty("audiField010")
    private Long audiField010;

    @JsonProperty("audiField011")
    private LocalDate audiField011;

    @JsonProperty("audiField012")
    private Boolean audiField012;

    @JsonProperty("audiField013")
    private LocalDate audiField013;

    @JsonProperty("audiField014")
    private Boolean audiField014;

    @JsonProperty("audiField015")
    private Integer audiField015;

    @JsonProperty("audiField016")
    private Double audiField016;

    public AuditDto033() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AuditDto033 instance = new AuditDto033();

        public Builder audiField000(LocalDate val) { instance.audiField000 = val; return this; }
        public Builder audiField001(BigDecimal val) { instance.audiField001 = val; return this; }
        public Builder audiField002(Double val) { instance.audiField002 = val; return this; }
        public Builder audiField003(Boolean val) { instance.audiField003 = val; return this; }
        public Builder audiField004(Long val) { instance.audiField004 = val; return this; }
        public Builder audiField005(Double val) { instance.audiField005 = val; return this; }
        public Builder audiField006(LocalDate val) { instance.audiField006 = val; return this; }
        public Builder audiField007(Integer val) { instance.audiField007 = val; return this; }
        public Builder audiField008(Integer val) { instance.audiField008 = val; return this; }
        public Builder audiField009(String val) { instance.audiField009 = val; return this; }
        public Builder audiField010(Long val) { instance.audiField010 = val; return this; }
        public Builder audiField011(LocalDate val) { instance.audiField011 = val; return this; }
        public Builder audiField012(Boolean val) { instance.audiField012 = val; return this; }
        public Builder audiField013(LocalDate val) { instance.audiField013 = val; return this; }
        public Builder audiField014(Boolean val) { instance.audiField014 = val; return this; }
        public Builder audiField015(Integer val) { instance.audiField015 = val; return this; }
        public Builder audiField016(Double val) { instance.audiField016 = val; return this; }
        public AuditDto033 build() { return instance; }
    }

    public LocalDate getAudiField000() { return audiField000; }
    public void setAudiField000(LocalDate audiField000) { this.audiField000 = audiField000; }

    public BigDecimal getAudiField001() { return audiField001; }
    public void setAudiField001(BigDecimal audiField001) { this.audiField001 = audiField001; }

    public Double getAudiField002() { return audiField002; }
    public void setAudiField002(Double audiField002) { this.audiField002 = audiField002; }

    public Boolean getAudiField003() { return audiField003; }
    public void setAudiField003(Boolean audiField003) { this.audiField003 = audiField003; }

    public Long getAudiField004() { return audiField004; }
    public void setAudiField004(Long audiField004) { this.audiField004 = audiField004; }

    public Double getAudiField005() { return audiField005; }
    public void setAudiField005(Double audiField005) { this.audiField005 = audiField005; }

    public LocalDate getAudiField006() { return audiField006; }
    public void setAudiField006(LocalDate audiField006) { this.audiField006 = audiField006; }

    public Integer getAudiField007() { return audiField007; }
    public void setAudiField007(Integer audiField007) { this.audiField007 = audiField007; }

    public Integer getAudiField008() { return audiField008; }
    public void setAudiField008(Integer audiField008) { this.audiField008 = audiField008; }

    public String getAudiField009() { return audiField009; }
    public void setAudiField009(String audiField009) { this.audiField009 = audiField009; }

    public Long getAudiField010() { return audiField010; }
    public void setAudiField010(Long audiField010) { this.audiField010 = audiField010; }

    public LocalDate getAudiField011() { return audiField011; }
    public void setAudiField011(LocalDate audiField011) { this.audiField011 = audiField011; }

    public Boolean getAudiField012() { return audiField012; }
    public void setAudiField012(Boolean audiField012) { this.audiField012 = audiField012; }

    public LocalDate getAudiField013() { return audiField013; }
    public void setAudiField013(LocalDate audiField013) { this.audiField013 = audiField013; }

    public Boolean getAudiField014() { return audiField014; }
    public void setAudiField014(Boolean audiField014) { this.audiField014 = audiField014; }

    public Integer getAudiField015() { return audiField015; }
    public void setAudiField015(Integer audiField015) { this.audiField015 = audiField015; }

    public Double getAudiField016() { return audiField016; }
    public void setAudiField016(Double audiField016) { this.audiField016 = audiField016; }

    @Override
    public String toString() {
        return "AuditDto033{" +
            "audiField000=" + audiField000 + ", " +
            "audiField001=" + audiField001 + ", " +
            "audiField002=" + audiField002 + ", " +
            "audiField003=" + audiField003 + ", " +
            "audiField004=" + audiField004 + ", " +
            "}";
    }
}
