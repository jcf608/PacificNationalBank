package com.pnb.audit;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AuditDto021 — Data Transfer Object for audit operations.
 * Variant 21 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuditDto021 {

    @JsonProperty("audiField000")
    private LocalDate audiField000;

    @JsonProperty("audiField001")
    private LocalDate audiField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("audiField002")
    private BigDecimal audiField002;

    @JsonProperty("audiField003")
    private Long audiField003;

    @JsonProperty("audiField004")
    private Integer audiField004;

    @Size(max = 20)
    @JsonProperty("audiField005")
    private String audiField005;

    @JsonProperty("audiField006")
    private LocalDate audiField006;

    @JsonProperty("audiField007")
    private Long audiField007;

    @JsonProperty("audiField008")
    private Double audiField008;

    @JsonProperty("audiField009")
    private Long audiField009;

    @JsonProperty("audiField010")
    private LocalDate audiField010;

    @DecimalMin(value = "0.00")
    @JsonProperty("audiField011")
    private BigDecimal audiField011;

    @DecimalMin(value = "0.00")
    @JsonProperty("audiField012")
    private BigDecimal audiField012;

    @JsonProperty("audiField013")
    private Boolean audiField013;

    @DecimalMin(value = "0.00")
    @JsonProperty("audiField014")
    private BigDecimal audiField014;

    @JsonProperty("audiField015")
    private LocalDate audiField015;

    @JsonProperty("audiField016")
    private Integer audiField016;

    public AuditDto021() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AuditDto021 instance = new AuditDto021();

        public Builder audiField000(LocalDate val) { instance.audiField000 = val; return this; }
        public Builder audiField001(LocalDate val) { instance.audiField001 = val; return this; }
        public Builder audiField002(BigDecimal val) { instance.audiField002 = val; return this; }
        public Builder audiField003(Long val) { instance.audiField003 = val; return this; }
        public Builder audiField004(Integer val) { instance.audiField004 = val; return this; }
        public Builder audiField005(String val) { instance.audiField005 = val; return this; }
        public Builder audiField006(LocalDate val) { instance.audiField006 = val; return this; }
        public Builder audiField007(Long val) { instance.audiField007 = val; return this; }
        public Builder audiField008(Double val) { instance.audiField008 = val; return this; }
        public Builder audiField009(Long val) { instance.audiField009 = val; return this; }
        public Builder audiField010(LocalDate val) { instance.audiField010 = val; return this; }
        public Builder audiField011(BigDecimal val) { instance.audiField011 = val; return this; }
        public Builder audiField012(BigDecimal val) { instance.audiField012 = val; return this; }
        public Builder audiField013(Boolean val) { instance.audiField013 = val; return this; }
        public Builder audiField014(BigDecimal val) { instance.audiField014 = val; return this; }
        public Builder audiField015(LocalDate val) { instance.audiField015 = val; return this; }
        public Builder audiField016(Integer val) { instance.audiField016 = val; return this; }
        public AuditDto021 build() { return instance; }
    }

    public LocalDate getAudiField000() { return audiField000; }
    public void setAudiField000(LocalDate audiField000) { this.audiField000 = audiField000; }

    public LocalDate getAudiField001() { return audiField001; }
    public void setAudiField001(LocalDate audiField001) { this.audiField001 = audiField001; }

    public BigDecimal getAudiField002() { return audiField002; }
    public void setAudiField002(BigDecimal audiField002) { this.audiField002 = audiField002; }

    public Long getAudiField003() { return audiField003; }
    public void setAudiField003(Long audiField003) { this.audiField003 = audiField003; }

    public Integer getAudiField004() { return audiField004; }
    public void setAudiField004(Integer audiField004) { this.audiField004 = audiField004; }

    public String getAudiField005() { return audiField005; }
    public void setAudiField005(String audiField005) { this.audiField005 = audiField005; }

    public LocalDate getAudiField006() { return audiField006; }
    public void setAudiField006(LocalDate audiField006) { this.audiField006 = audiField006; }

    public Long getAudiField007() { return audiField007; }
    public void setAudiField007(Long audiField007) { this.audiField007 = audiField007; }

    public Double getAudiField008() { return audiField008; }
    public void setAudiField008(Double audiField008) { this.audiField008 = audiField008; }

    public Long getAudiField009() { return audiField009; }
    public void setAudiField009(Long audiField009) { this.audiField009 = audiField009; }

    public LocalDate getAudiField010() { return audiField010; }
    public void setAudiField010(LocalDate audiField010) { this.audiField010 = audiField010; }

    public BigDecimal getAudiField011() { return audiField011; }
    public void setAudiField011(BigDecimal audiField011) { this.audiField011 = audiField011; }

    public BigDecimal getAudiField012() { return audiField012; }
    public void setAudiField012(BigDecimal audiField012) { this.audiField012 = audiField012; }

    public Boolean getAudiField013() { return audiField013; }
    public void setAudiField013(Boolean audiField013) { this.audiField013 = audiField013; }

    public BigDecimal getAudiField014() { return audiField014; }
    public void setAudiField014(BigDecimal audiField014) { this.audiField014 = audiField014; }

    public LocalDate getAudiField015() { return audiField015; }
    public void setAudiField015(LocalDate audiField015) { this.audiField015 = audiField015; }

    public Integer getAudiField016() { return audiField016; }
    public void setAudiField016(Integer audiField016) { this.audiField016 = audiField016; }

    @Override
    public String toString() {
        return "AuditDto021{" +
            "audiField000=" + audiField000 + ", " +
            "audiField001=" + audiField001 + ", " +
            "audiField002=" + audiField002 + ", " +
            "audiField003=" + audiField003 + ", " +
            "audiField004=" + audiField004 + ", " +
            "}";
    }
}
