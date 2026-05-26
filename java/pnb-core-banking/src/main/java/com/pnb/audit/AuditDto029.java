package com.pnb.audit;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AuditDto029 — Data Transfer Object for audit operations.
 * Variant 29 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuditDto029 {

    @JsonProperty("audiField000")
    private Boolean audiField000;

    @JsonProperty("audiField001")
    private LocalDate audiField001;

    @JsonProperty("audiField002")
    private Double audiField002;

    @JsonProperty("audiField003")
    private Integer audiField003;

    @DecimalMin(value = "0.00")
    @JsonProperty("audiField004")
    private BigDecimal audiField004;

    @JsonProperty("audiField005")
    private LocalDate audiField005;

    @JsonProperty("audiField006")
    private LocalDate audiField006;

    @JsonProperty("audiField007")
    private Double audiField007;

    @Size(max = 100)
    @JsonProperty("audiField008")
    private String audiField008;

    @JsonProperty("audiField009")
    private Long audiField009;

    @JsonProperty("audiField010")
    private Long audiField010;

    @DecimalMin(value = "0.00")
    @JsonProperty("audiField011")
    private BigDecimal audiField011;

    @DecimalMin(value = "0.00")
    @JsonProperty("audiField012")
    private BigDecimal audiField012;

    public AuditDto029() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AuditDto029 instance = new AuditDto029();

        public Builder audiField000(Boolean val) { instance.audiField000 = val; return this; }
        public Builder audiField001(LocalDate val) { instance.audiField001 = val; return this; }
        public Builder audiField002(Double val) { instance.audiField002 = val; return this; }
        public Builder audiField003(Integer val) { instance.audiField003 = val; return this; }
        public Builder audiField004(BigDecimal val) { instance.audiField004 = val; return this; }
        public Builder audiField005(LocalDate val) { instance.audiField005 = val; return this; }
        public Builder audiField006(LocalDate val) { instance.audiField006 = val; return this; }
        public Builder audiField007(Double val) { instance.audiField007 = val; return this; }
        public Builder audiField008(String val) { instance.audiField008 = val; return this; }
        public Builder audiField009(Long val) { instance.audiField009 = val; return this; }
        public Builder audiField010(Long val) { instance.audiField010 = val; return this; }
        public Builder audiField011(BigDecimal val) { instance.audiField011 = val; return this; }
        public Builder audiField012(BigDecimal val) { instance.audiField012 = val; return this; }
        public AuditDto029 build() { return instance; }
    }

    public Boolean getAudiField000() { return audiField000; }
    public void setAudiField000(Boolean audiField000) { this.audiField000 = audiField000; }

    public LocalDate getAudiField001() { return audiField001; }
    public void setAudiField001(LocalDate audiField001) { this.audiField001 = audiField001; }

    public Double getAudiField002() { return audiField002; }
    public void setAudiField002(Double audiField002) { this.audiField002 = audiField002; }

    public Integer getAudiField003() { return audiField003; }
    public void setAudiField003(Integer audiField003) { this.audiField003 = audiField003; }

    public BigDecimal getAudiField004() { return audiField004; }
    public void setAudiField004(BigDecimal audiField004) { this.audiField004 = audiField004; }

    public LocalDate getAudiField005() { return audiField005; }
    public void setAudiField005(LocalDate audiField005) { this.audiField005 = audiField005; }

    public LocalDate getAudiField006() { return audiField006; }
    public void setAudiField006(LocalDate audiField006) { this.audiField006 = audiField006; }

    public Double getAudiField007() { return audiField007; }
    public void setAudiField007(Double audiField007) { this.audiField007 = audiField007; }

    public String getAudiField008() { return audiField008; }
    public void setAudiField008(String audiField008) { this.audiField008 = audiField008; }

    public Long getAudiField009() { return audiField009; }
    public void setAudiField009(Long audiField009) { this.audiField009 = audiField009; }

    public Long getAudiField010() { return audiField010; }
    public void setAudiField010(Long audiField010) { this.audiField010 = audiField010; }

    public BigDecimal getAudiField011() { return audiField011; }
    public void setAudiField011(BigDecimal audiField011) { this.audiField011 = audiField011; }

    public BigDecimal getAudiField012() { return audiField012; }
    public void setAudiField012(BigDecimal audiField012) { this.audiField012 = audiField012; }

    @Override
    public String toString() {
        return "AuditDto029{" +
            "audiField000=" + audiField000 + ", " +
            "audiField001=" + audiField001 + ", " +
            "audiField002=" + audiField002 + ", " +
            "audiField003=" + audiField003 + ", " +
            "audiField004=" + audiField004 + ", " +
            "}";
    }
}
