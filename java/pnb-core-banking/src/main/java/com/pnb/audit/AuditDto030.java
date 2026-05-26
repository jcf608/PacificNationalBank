package com.pnb.audit;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AuditDto030 — Data Transfer Object for audit operations.
 * Variant 30 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuditDto030 {

    @DecimalMin(value = "0.00")
    @JsonProperty("audiField000")
    private BigDecimal audiField000;

    @Size(max = 100)
    @JsonProperty("audiField001")
    private String audiField001;

    @JsonProperty("audiField002")
    private Double audiField002;

    @JsonProperty("audiField003")
    private Long audiField003;

    @JsonProperty("audiField004")
    private LocalDate audiField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("audiField005")
    private BigDecimal audiField005;

    @JsonProperty("audiField006")
    private Long audiField006;

    @JsonProperty("audiField007")
    private Integer audiField007;

    @JsonProperty("audiField008")
    private LocalDate audiField008;

    @JsonProperty("audiField009")
    private LocalDate audiField009;

    @JsonProperty("audiField010")
    private Double audiField010;

    @JsonProperty("audiField011")
    private Long audiField011;

    @JsonProperty("audiField012")
    private LocalDate audiField012;

    @JsonProperty("audiField013")
    private Integer audiField013;

    public AuditDto030() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AuditDto030 instance = new AuditDto030();

        public Builder audiField000(BigDecimal val) { instance.audiField000 = val; return this; }
        public Builder audiField001(String val) { instance.audiField001 = val; return this; }
        public Builder audiField002(Double val) { instance.audiField002 = val; return this; }
        public Builder audiField003(Long val) { instance.audiField003 = val; return this; }
        public Builder audiField004(LocalDate val) { instance.audiField004 = val; return this; }
        public Builder audiField005(BigDecimal val) { instance.audiField005 = val; return this; }
        public Builder audiField006(Long val) { instance.audiField006 = val; return this; }
        public Builder audiField007(Integer val) { instance.audiField007 = val; return this; }
        public Builder audiField008(LocalDate val) { instance.audiField008 = val; return this; }
        public Builder audiField009(LocalDate val) { instance.audiField009 = val; return this; }
        public Builder audiField010(Double val) { instance.audiField010 = val; return this; }
        public Builder audiField011(Long val) { instance.audiField011 = val; return this; }
        public Builder audiField012(LocalDate val) { instance.audiField012 = val; return this; }
        public Builder audiField013(Integer val) { instance.audiField013 = val; return this; }
        public AuditDto030 build() { return instance; }
    }

    public BigDecimal getAudiField000() { return audiField000; }
    public void setAudiField000(BigDecimal audiField000) { this.audiField000 = audiField000; }

    public String getAudiField001() { return audiField001; }
    public void setAudiField001(String audiField001) { this.audiField001 = audiField001; }

    public Double getAudiField002() { return audiField002; }
    public void setAudiField002(Double audiField002) { this.audiField002 = audiField002; }

    public Long getAudiField003() { return audiField003; }
    public void setAudiField003(Long audiField003) { this.audiField003 = audiField003; }

    public LocalDate getAudiField004() { return audiField004; }
    public void setAudiField004(LocalDate audiField004) { this.audiField004 = audiField004; }

    public BigDecimal getAudiField005() { return audiField005; }
    public void setAudiField005(BigDecimal audiField005) { this.audiField005 = audiField005; }

    public Long getAudiField006() { return audiField006; }
    public void setAudiField006(Long audiField006) { this.audiField006 = audiField006; }

    public Integer getAudiField007() { return audiField007; }
    public void setAudiField007(Integer audiField007) { this.audiField007 = audiField007; }

    public LocalDate getAudiField008() { return audiField008; }
    public void setAudiField008(LocalDate audiField008) { this.audiField008 = audiField008; }

    public LocalDate getAudiField009() { return audiField009; }
    public void setAudiField009(LocalDate audiField009) { this.audiField009 = audiField009; }

    public Double getAudiField010() { return audiField010; }
    public void setAudiField010(Double audiField010) { this.audiField010 = audiField010; }

    public Long getAudiField011() { return audiField011; }
    public void setAudiField011(Long audiField011) { this.audiField011 = audiField011; }

    public LocalDate getAudiField012() { return audiField012; }
    public void setAudiField012(LocalDate audiField012) { this.audiField012 = audiField012; }

    public Integer getAudiField013() { return audiField013; }
    public void setAudiField013(Integer audiField013) { this.audiField013 = audiField013; }

    @Override
    public String toString() {
        return "AuditDto030{" +
            "audiField000=" + audiField000 + ", " +
            "audiField001=" + audiField001 + ", " +
            "audiField002=" + audiField002 + ", " +
            "audiField003=" + audiField003 + ", " +
            "audiField004=" + audiField004 + ", " +
            "}";
    }
}
