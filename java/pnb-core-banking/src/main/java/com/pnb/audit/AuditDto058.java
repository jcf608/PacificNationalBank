package com.pnb.audit;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AuditDto058 — Data Transfer Object for audit operations.
 * Variant 58 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuditDto058 {

    @JsonProperty("audiField000")
    private LocalDate audiField000;

    @JsonProperty("audiField001")
    private LocalDate audiField001;

    @JsonProperty("audiField002")
    private LocalDate audiField002;

    @JsonProperty("audiField003")
    private Boolean audiField003;

    @JsonProperty("audiField004")
    private Long audiField004;

    @JsonProperty("audiField005")
    private LocalDate audiField005;

    @JsonProperty("audiField006")
    private Integer audiField006;

    @JsonProperty("audiField007")
    private LocalDate audiField007;

    @DecimalMin(value = "0.00")
    @JsonProperty("audiField008")
    private BigDecimal audiField008;

    @JsonProperty("audiField009")
    private LocalDate audiField009;

    @JsonProperty("audiField010")
    private Boolean audiField010;

    @JsonProperty("audiField011")
    private Integer audiField011;

    @Size(max = 100)
    @JsonProperty("audiField012")
    private String audiField012;

    @JsonProperty("audiField013")
    private Integer audiField013;

    @JsonProperty("audiField014")
    private Double audiField014;

    @JsonProperty("audiField015")
    private Boolean audiField015;

    @JsonProperty("audiField016")
    private Integer audiField016;

    @JsonProperty("audiField017")
    private Integer audiField017;

    public AuditDto058() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AuditDto058 instance = new AuditDto058();

        public Builder audiField000(LocalDate val) { instance.audiField000 = val; return this; }
        public Builder audiField001(LocalDate val) { instance.audiField001 = val; return this; }
        public Builder audiField002(LocalDate val) { instance.audiField002 = val; return this; }
        public Builder audiField003(Boolean val) { instance.audiField003 = val; return this; }
        public Builder audiField004(Long val) { instance.audiField004 = val; return this; }
        public Builder audiField005(LocalDate val) { instance.audiField005 = val; return this; }
        public Builder audiField006(Integer val) { instance.audiField006 = val; return this; }
        public Builder audiField007(LocalDate val) { instance.audiField007 = val; return this; }
        public Builder audiField008(BigDecimal val) { instance.audiField008 = val; return this; }
        public Builder audiField009(LocalDate val) { instance.audiField009 = val; return this; }
        public Builder audiField010(Boolean val) { instance.audiField010 = val; return this; }
        public Builder audiField011(Integer val) { instance.audiField011 = val; return this; }
        public Builder audiField012(String val) { instance.audiField012 = val; return this; }
        public Builder audiField013(Integer val) { instance.audiField013 = val; return this; }
        public Builder audiField014(Double val) { instance.audiField014 = val; return this; }
        public Builder audiField015(Boolean val) { instance.audiField015 = val; return this; }
        public Builder audiField016(Integer val) { instance.audiField016 = val; return this; }
        public Builder audiField017(Integer val) { instance.audiField017 = val; return this; }
        public AuditDto058 build() { return instance; }
    }

    public LocalDate getAudiField000() { return audiField000; }
    public void setAudiField000(LocalDate audiField000) { this.audiField000 = audiField000; }

    public LocalDate getAudiField001() { return audiField001; }
    public void setAudiField001(LocalDate audiField001) { this.audiField001 = audiField001; }

    public LocalDate getAudiField002() { return audiField002; }
    public void setAudiField002(LocalDate audiField002) { this.audiField002 = audiField002; }

    public Boolean getAudiField003() { return audiField003; }
    public void setAudiField003(Boolean audiField003) { this.audiField003 = audiField003; }

    public Long getAudiField004() { return audiField004; }
    public void setAudiField004(Long audiField004) { this.audiField004 = audiField004; }

    public LocalDate getAudiField005() { return audiField005; }
    public void setAudiField005(LocalDate audiField005) { this.audiField005 = audiField005; }

    public Integer getAudiField006() { return audiField006; }
    public void setAudiField006(Integer audiField006) { this.audiField006 = audiField006; }

    public LocalDate getAudiField007() { return audiField007; }
    public void setAudiField007(LocalDate audiField007) { this.audiField007 = audiField007; }

    public BigDecimal getAudiField008() { return audiField008; }
    public void setAudiField008(BigDecimal audiField008) { this.audiField008 = audiField008; }

    public LocalDate getAudiField009() { return audiField009; }
    public void setAudiField009(LocalDate audiField009) { this.audiField009 = audiField009; }

    public Boolean getAudiField010() { return audiField010; }
    public void setAudiField010(Boolean audiField010) { this.audiField010 = audiField010; }

    public Integer getAudiField011() { return audiField011; }
    public void setAudiField011(Integer audiField011) { this.audiField011 = audiField011; }

    public String getAudiField012() { return audiField012; }
    public void setAudiField012(String audiField012) { this.audiField012 = audiField012; }

    public Integer getAudiField013() { return audiField013; }
    public void setAudiField013(Integer audiField013) { this.audiField013 = audiField013; }

    public Double getAudiField014() { return audiField014; }
    public void setAudiField014(Double audiField014) { this.audiField014 = audiField014; }

    public Boolean getAudiField015() { return audiField015; }
    public void setAudiField015(Boolean audiField015) { this.audiField015 = audiField015; }

    public Integer getAudiField016() { return audiField016; }
    public void setAudiField016(Integer audiField016) { this.audiField016 = audiField016; }

    public Integer getAudiField017() { return audiField017; }
    public void setAudiField017(Integer audiField017) { this.audiField017 = audiField017; }

    @Override
    public String toString() {
        return "AuditDto058{" +
            "audiField000=" + audiField000 + ", " +
            "audiField001=" + audiField001 + ", " +
            "audiField002=" + audiField002 + ", " +
            "audiField003=" + audiField003 + ", " +
            "audiField004=" + audiField004 + ", " +
            "}";
    }
}
