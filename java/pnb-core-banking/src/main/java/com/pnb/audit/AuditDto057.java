package com.pnb.audit;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AuditDto057 — Data Transfer Object for audit operations.
 * Variant 57 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuditDto057 {

    @JsonProperty("audiField000")
    private Long audiField000;

    @JsonProperty("audiField001")
    private Long audiField001;

    @Size(max = 20)
    @JsonProperty("audiField002")
    private String audiField002;

    @JsonProperty("audiField003")
    private LocalDate audiField003;

    @JsonProperty("audiField004")
    private Long audiField004;

    @JsonProperty("audiField005")
    private Integer audiField005;

    @JsonProperty("audiField006")
    private Integer audiField006;

    @JsonProperty("audiField007")
    private Long audiField007;

    @JsonProperty("audiField008")
    private Boolean audiField008;

    @DecimalMin(value = "0.00")
    @JsonProperty("audiField009")
    private BigDecimal audiField009;

    @DecimalMin(value = "0.00")
    @JsonProperty("audiField010")
    private BigDecimal audiField010;

    @JsonProperty("audiField011")
    private Boolean audiField011;

    @JsonProperty("audiField012")
    private Integer audiField012;

    @JsonProperty("audiField013")
    private Double audiField013;

    @JsonProperty("audiField014")
    private Double audiField014;

    @Size(max = 40)
    @JsonProperty("audiField015")
    private String audiField015;

    @JsonProperty("audiField016")
    private LocalDate audiField016;

    public AuditDto057() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AuditDto057 instance = new AuditDto057();

        public Builder audiField000(Long val) { instance.audiField000 = val; return this; }
        public Builder audiField001(Long val) { instance.audiField001 = val; return this; }
        public Builder audiField002(String val) { instance.audiField002 = val; return this; }
        public Builder audiField003(LocalDate val) { instance.audiField003 = val; return this; }
        public Builder audiField004(Long val) { instance.audiField004 = val; return this; }
        public Builder audiField005(Integer val) { instance.audiField005 = val; return this; }
        public Builder audiField006(Integer val) { instance.audiField006 = val; return this; }
        public Builder audiField007(Long val) { instance.audiField007 = val; return this; }
        public Builder audiField008(Boolean val) { instance.audiField008 = val; return this; }
        public Builder audiField009(BigDecimal val) { instance.audiField009 = val; return this; }
        public Builder audiField010(BigDecimal val) { instance.audiField010 = val; return this; }
        public Builder audiField011(Boolean val) { instance.audiField011 = val; return this; }
        public Builder audiField012(Integer val) { instance.audiField012 = val; return this; }
        public Builder audiField013(Double val) { instance.audiField013 = val; return this; }
        public Builder audiField014(Double val) { instance.audiField014 = val; return this; }
        public Builder audiField015(String val) { instance.audiField015 = val; return this; }
        public Builder audiField016(LocalDate val) { instance.audiField016 = val; return this; }
        public AuditDto057 build() { return instance; }
    }

    public Long getAudiField000() { return audiField000; }
    public void setAudiField000(Long audiField000) { this.audiField000 = audiField000; }

    public Long getAudiField001() { return audiField001; }
    public void setAudiField001(Long audiField001) { this.audiField001 = audiField001; }

    public String getAudiField002() { return audiField002; }
    public void setAudiField002(String audiField002) { this.audiField002 = audiField002; }

    public LocalDate getAudiField003() { return audiField003; }
    public void setAudiField003(LocalDate audiField003) { this.audiField003 = audiField003; }

    public Long getAudiField004() { return audiField004; }
    public void setAudiField004(Long audiField004) { this.audiField004 = audiField004; }

    public Integer getAudiField005() { return audiField005; }
    public void setAudiField005(Integer audiField005) { this.audiField005 = audiField005; }

    public Integer getAudiField006() { return audiField006; }
    public void setAudiField006(Integer audiField006) { this.audiField006 = audiField006; }

    public Long getAudiField007() { return audiField007; }
    public void setAudiField007(Long audiField007) { this.audiField007 = audiField007; }

    public Boolean getAudiField008() { return audiField008; }
    public void setAudiField008(Boolean audiField008) { this.audiField008 = audiField008; }

    public BigDecimal getAudiField009() { return audiField009; }
    public void setAudiField009(BigDecimal audiField009) { this.audiField009 = audiField009; }

    public BigDecimal getAudiField010() { return audiField010; }
    public void setAudiField010(BigDecimal audiField010) { this.audiField010 = audiField010; }

    public Boolean getAudiField011() { return audiField011; }
    public void setAudiField011(Boolean audiField011) { this.audiField011 = audiField011; }

    public Integer getAudiField012() { return audiField012; }
    public void setAudiField012(Integer audiField012) { this.audiField012 = audiField012; }

    public Double getAudiField013() { return audiField013; }
    public void setAudiField013(Double audiField013) { this.audiField013 = audiField013; }

    public Double getAudiField014() { return audiField014; }
    public void setAudiField014(Double audiField014) { this.audiField014 = audiField014; }

    public String getAudiField015() { return audiField015; }
    public void setAudiField015(String audiField015) { this.audiField015 = audiField015; }

    public LocalDate getAudiField016() { return audiField016; }
    public void setAudiField016(LocalDate audiField016) { this.audiField016 = audiField016; }

    @Override
    public String toString() {
        return "AuditDto057{" +
            "audiField000=" + audiField000 + ", " +
            "audiField001=" + audiField001 + ", " +
            "audiField002=" + audiField002 + ", " +
            "audiField003=" + audiField003 + ", " +
            "audiField004=" + audiField004 + ", " +
            "}";
    }
}
