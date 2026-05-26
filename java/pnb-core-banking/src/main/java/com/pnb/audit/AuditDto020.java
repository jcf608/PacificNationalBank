package com.pnb.audit;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AuditDto020 — Data Transfer Object for audit operations.
 * Variant 20 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuditDto020 {

    @JsonProperty("audiField000")
    private Long audiField000;

    @JsonProperty("audiField001")
    private Boolean audiField001;

    @JsonProperty("audiField002")
    private Long audiField002;

    @Size(max = 20)
    @JsonProperty("audiField003")
    private String audiField003;

    @DecimalMin(value = "0.00")
    @JsonProperty("audiField004")
    private BigDecimal audiField004;

    @Size(max = 60)
    @JsonProperty("audiField005")
    private String audiField005;

    @JsonProperty("audiField006")
    private Boolean audiField006;

    @JsonProperty("audiField007")
    private Double audiField007;

    @JsonProperty("audiField008")
    private LocalDate audiField008;

    @JsonProperty("audiField009")
    private Boolean audiField009;

    @JsonProperty("audiField010")
    private LocalDate audiField010;

    @DecimalMin(value = "0.00")
    @JsonProperty("audiField011")
    private BigDecimal audiField011;

    @JsonProperty("audiField012")
    private Integer audiField012;

    @JsonProperty("audiField013")
    private Integer audiField013;

    @JsonProperty("audiField014")
    private LocalDate audiField014;

    @JsonProperty("audiField015")
    private Long audiField015;

    public AuditDto020() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AuditDto020 instance = new AuditDto020();

        public Builder audiField000(Long val) { instance.audiField000 = val; return this; }
        public Builder audiField001(Boolean val) { instance.audiField001 = val; return this; }
        public Builder audiField002(Long val) { instance.audiField002 = val; return this; }
        public Builder audiField003(String val) { instance.audiField003 = val; return this; }
        public Builder audiField004(BigDecimal val) { instance.audiField004 = val; return this; }
        public Builder audiField005(String val) { instance.audiField005 = val; return this; }
        public Builder audiField006(Boolean val) { instance.audiField006 = val; return this; }
        public Builder audiField007(Double val) { instance.audiField007 = val; return this; }
        public Builder audiField008(LocalDate val) { instance.audiField008 = val; return this; }
        public Builder audiField009(Boolean val) { instance.audiField009 = val; return this; }
        public Builder audiField010(LocalDate val) { instance.audiField010 = val; return this; }
        public Builder audiField011(BigDecimal val) { instance.audiField011 = val; return this; }
        public Builder audiField012(Integer val) { instance.audiField012 = val; return this; }
        public Builder audiField013(Integer val) { instance.audiField013 = val; return this; }
        public Builder audiField014(LocalDate val) { instance.audiField014 = val; return this; }
        public Builder audiField015(Long val) { instance.audiField015 = val; return this; }
        public AuditDto020 build() { return instance; }
    }

    public Long getAudiField000() { return audiField000; }
    public void setAudiField000(Long audiField000) { this.audiField000 = audiField000; }

    public Boolean getAudiField001() { return audiField001; }
    public void setAudiField001(Boolean audiField001) { this.audiField001 = audiField001; }

    public Long getAudiField002() { return audiField002; }
    public void setAudiField002(Long audiField002) { this.audiField002 = audiField002; }

    public String getAudiField003() { return audiField003; }
    public void setAudiField003(String audiField003) { this.audiField003 = audiField003; }

    public BigDecimal getAudiField004() { return audiField004; }
    public void setAudiField004(BigDecimal audiField004) { this.audiField004 = audiField004; }

    public String getAudiField005() { return audiField005; }
    public void setAudiField005(String audiField005) { this.audiField005 = audiField005; }

    public Boolean getAudiField006() { return audiField006; }
    public void setAudiField006(Boolean audiField006) { this.audiField006 = audiField006; }

    public Double getAudiField007() { return audiField007; }
    public void setAudiField007(Double audiField007) { this.audiField007 = audiField007; }

    public LocalDate getAudiField008() { return audiField008; }
    public void setAudiField008(LocalDate audiField008) { this.audiField008 = audiField008; }

    public Boolean getAudiField009() { return audiField009; }
    public void setAudiField009(Boolean audiField009) { this.audiField009 = audiField009; }

    public LocalDate getAudiField010() { return audiField010; }
    public void setAudiField010(LocalDate audiField010) { this.audiField010 = audiField010; }

    public BigDecimal getAudiField011() { return audiField011; }
    public void setAudiField011(BigDecimal audiField011) { this.audiField011 = audiField011; }

    public Integer getAudiField012() { return audiField012; }
    public void setAudiField012(Integer audiField012) { this.audiField012 = audiField012; }

    public Integer getAudiField013() { return audiField013; }
    public void setAudiField013(Integer audiField013) { this.audiField013 = audiField013; }

    public LocalDate getAudiField014() { return audiField014; }
    public void setAudiField014(LocalDate audiField014) { this.audiField014 = audiField014; }

    public Long getAudiField015() { return audiField015; }
    public void setAudiField015(Long audiField015) { this.audiField015 = audiField015; }

    @Override
    public String toString() {
        return "AuditDto020{" +
            "audiField000=" + audiField000 + ", " +
            "audiField001=" + audiField001 + ", " +
            "audiField002=" + audiField002 + ", " +
            "audiField003=" + audiField003 + ", " +
            "audiField004=" + audiField004 + ", " +
            "}";
    }
}
