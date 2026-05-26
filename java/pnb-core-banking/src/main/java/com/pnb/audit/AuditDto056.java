package com.pnb.audit;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AuditDto056 — Data Transfer Object for audit operations.
 * Variant 56 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuditDto056 {

    @JsonProperty("audiField000")
    private Boolean audiField000;

    @JsonProperty("audiField001")
    private Long audiField001;

    @JsonProperty("audiField002")
    private Long audiField002;

    @JsonProperty("audiField003")
    private Long audiField003;

    @JsonProperty("audiField004")
    private Integer audiField004;

    @JsonProperty("audiField005")
    private Long audiField005;

    @JsonProperty("audiField006")
    private Double audiField006;

    @JsonProperty("audiField007")
    private LocalDate audiField007;

    @Size(max = 200)
    @JsonProperty("audiField008")
    private String audiField008;

    @JsonProperty("audiField009")
    private Long audiField009;

    @JsonProperty("audiField010")
    private Integer audiField010;

    @Size(max = 200)
    @JsonProperty("audiField011")
    private String audiField011;

    @JsonProperty("audiField012")
    private Boolean audiField012;

    @JsonProperty("audiField013")
    private Double audiField013;

    @JsonProperty("audiField014")
    private LocalDate audiField014;

    @DecimalMin(value = "0.00")
    @JsonProperty("audiField015")
    private BigDecimal audiField015;

    public AuditDto056() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AuditDto056 instance = new AuditDto056();

        public Builder audiField000(Boolean val) { instance.audiField000 = val; return this; }
        public Builder audiField001(Long val) { instance.audiField001 = val; return this; }
        public Builder audiField002(Long val) { instance.audiField002 = val; return this; }
        public Builder audiField003(Long val) { instance.audiField003 = val; return this; }
        public Builder audiField004(Integer val) { instance.audiField004 = val; return this; }
        public Builder audiField005(Long val) { instance.audiField005 = val; return this; }
        public Builder audiField006(Double val) { instance.audiField006 = val; return this; }
        public Builder audiField007(LocalDate val) { instance.audiField007 = val; return this; }
        public Builder audiField008(String val) { instance.audiField008 = val; return this; }
        public Builder audiField009(Long val) { instance.audiField009 = val; return this; }
        public Builder audiField010(Integer val) { instance.audiField010 = val; return this; }
        public Builder audiField011(String val) { instance.audiField011 = val; return this; }
        public Builder audiField012(Boolean val) { instance.audiField012 = val; return this; }
        public Builder audiField013(Double val) { instance.audiField013 = val; return this; }
        public Builder audiField014(LocalDate val) { instance.audiField014 = val; return this; }
        public Builder audiField015(BigDecimal val) { instance.audiField015 = val; return this; }
        public AuditDto056 build() { return instance; }
    }

    public Boolean getAudiField000() { return audiField000; }
    public void setAudiField000(Boolean audiField000) { this.audiField000 = audiField000; }

    public Long getAudiField001() { return audiField001; }
    public void setAudiField001(Long audiField001) { this.audiField001 = audiField001; }

    public Long getAudiField002() { return audiField002; }
    public void setAudiField002(Long audiField002) { this.audiField002 = audiField002; }

    public Long getAudiField003() { return audiField003; }
    public void setAudiField003(Long audiField003) { this.audiField003 = audiField003; }

    public Integer getAudiField004() { return audiField004; }
    public void setAudiField004(Integer audiField004) { this.audiField004 = audiField004; }

    public Long getAudiField005() { return audiField005; }
    public void setAudiField005(Long audiField005) { this.audiField005 = audiField005; }

    public Double getAudiField006() { return audiField006; }
    public void setAudiField006(Double audiField006) { this.audiField006 = audiField006; }

    public LocalDate getAudiField007() { return audiField007; }
    public void setAudiField007(LocalDate audiField007) { this.audiField007 = audiField007; }

    public String getAudiField008() { return audiField008; }
    public void setAudiField008(String audiField008) { this.audiField008 = audiField008; }

    public Long getAudiField009() { return audiField009; }
    public void setAudiField009(Long audiField009) { this.audiField009 = audiField009; }

    public Integer getAudiField010() { return audiField010; }
    public void setAudiField010(Integer audiField010) { this.audiField010 = audiField010; }

    public String getAudiField011() { return audiField011; }
    public void setAudiField011(String audiField011) { this.audiField011 = audiField011; }

    public Boolean getAudiField012() { return audiField012; }
    public void setAudiField012(Boolean audiField012) { this.audiField012 = audiField012; }

    public Double getAudiField013() { return audiField013; }
    public void setAudiField013(Double audiField013) { this.audiField013 = audiField013; }

    public LocalDate getAudiField014() { return audiField014; }
    public void setAudiField014(LocalDate audiField014) { this.audiField014 = audiField014; }

    public BigDecimal getAudiField015() { return audiField015; }
    public void setAudiField015(BigDecimal audiField015) { this.audiField015 = audiField015; }

    @Override
    public String toString() {
        return "AuditDto056{" +
            "audiField000=" + audiField000 + ", " +
            "audiField001=" + audiField001 + ", " +
            "audiField002=" + audiField002 + ", " +
            "audiField003=" + audiField003 + ", " +
            "audiField004=" + audiField004 + ", " +
            "}";
    }
}
