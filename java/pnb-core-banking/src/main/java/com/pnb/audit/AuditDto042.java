package com.pnb.audit;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AuditDto042 — Data Transfer Object for audit operations.
 * Variant 42 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuditDto042 {

    @JsonProperty("audiField000")
    private Long audiField000;

    @JsonProperty("audiField001")
    private Double audiField001;

    @JsonProperty("audiField002")
    private Double audiField002;

    @JsonProperty("audiField003")
    private Long audiField003;

    @Size(max = 20)
    @JsonProperty("audiField004")
    private String audiField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("audiField005")
    private BigDecimal audiField005;

    @JsonProperty("audiField006")
    private Double audiField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("audiField007")
    private BigDecimal audiField007;

    @Size(max = 40)
    @JsonProperty("audiField008")
    private String audiField008;

    @JsonProperty("audiField009")
    private Integer audiField009;

    @JsonProperty("audiField010")
    private Long audiField010;

    @JsonProperty("audiField011")
    private Double audiField011;

    @Size(max = 200)
    @JsonProperty("audiField012")
    private String audiField012;

    @JsonProperty("audiField013")
    private Double audiField013;

    public AuditDto042() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AuditDto042 instance = new AuditDto042();

        public Builder audiField000(Long val) { instance.audiField000 = val; return this; }
        public Builder audiField001(Double val) { instance.audiField001 = val; return this; }
        public Builder audiField002(Double val) { instance.audiField002 = val; return this; }
        public Builder audiField003(Long val) { instance.audiField003 = val; return this; }
        public Builder audiField004(String val) { instance.audiField004 = val; return this; }
        public Builder audiField005(BigDecimal val) { instance.audiField005 = val; return this; }
        public Builder audiField006(Double val) { instance.audiField006 = val; return this; }
        public Builder audiField007(BigDecimal val) { instance.audiField007 = val; return this; }
        public Builder audiField008(String val) { instance.audiField008 = val; return this; }
        public Builder audiField009(Integer val) { instance.audiField009 = val; return this; }
        public Builder audiField010(Long val) { instance.audiField010 = val; return this; }
        public Builder audiField011(Double val) { instance.audiField011 = val; return this; }
        public Builder audiField012(String val) { instance.audiField012 = val; return this; }
        public Builder audiField013(Double val) { instance.audiField013 = val; return this; }
        public AuditDto042 build() { return instance; }
    }

    public Long getAudiField000() { return audiField000; }
    public void setAudiField000(Long audiField000) { this.audiField000 = audiField000; }

    public Double getAudiField001() { return audiField001; }
    public void setAudiField001(Double audiField001) { this.audiField001 = audiField001; }

    public Double getAudiField002() { return audiField002; }
    public void setAudiField002(Double audiField002) { this.audiField002 = audiField002; }

    public Long getAudiField003() { return audiField003; }
    public void setAudiField003(Long audiField003) { this.audiField003 = audiField003; }

    public String getAudiField004() { return audiField004; }
    public void setAudiField004(String audiField004) { this.audiField004 = audiField004; }

    public BigDecimal getAudiField005() { return audiField005; }
    public void setAudiField005(BigDecimal audiField005) { this.audiField005 = audiField005; }

    public Double getAudiField006() { return audiField006; }
    public void setAudiField006(Double audiField006) { this.audiField006 = audiField006; }

    public BigDecimal getAudiField007() { return audiField007; }
    public void setAudiField007(BigDecimal audiField007) { this.audiField007 = audiField007; }

    public String getAudiField008() { return audiField008; }
    public void setAudiField008(String audiField008) { this.audiField008 = audiField008; }

    public Integer getAudiField009() { return audiField009; }
    public void setAudiField009(Integer audiField009) { this.audiField009 = audiField009; }

    public Long getAudiField010() { return audiField010; }
    public void setAudiField010(Long audiField010) { this.audiField010 = audiField010; }

    public Double getAudiField011() { return audiField011; }
    public void setAudiField011(Double audiField011) { this.audiField011 = audiField011; }

    public String getAudiField012() { return audiField012; }
    public void setAudiField012(String audiField012) { this.audiField012 = audiField012; }

    public Double getAudiField013() { return audiField013; }
    public void setAudiField013(Double audiField013) { this.audiField013 = audiField013; }

    @Override
    public String toString() {
        return "AuditDto042{" +
            "audiField000=" + audiField000 + ", " +
            "audiField001=" + audiField001 + ", " +
            "audiField002=" + audiField002 + ", " +
            "audiField003=" + audiField003 + ", " +
            "audiField004=" + audiField004 + ", " +
            "}";
    }
}
