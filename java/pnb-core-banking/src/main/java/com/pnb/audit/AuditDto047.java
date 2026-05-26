package com.pnb.audit;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AuditDto047 — Data Transfer Object for audit operations.
 * Variant 47 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuditDto047 {

    @JsonProperty("audiField000")
    private LocalDate audiField000;

    @JsonProperty("audiField001")
    private Integer audiField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("audiField002")
    private BigDecimal audiField002;

    @Size(max = 60)
    @JsonProperty("audiField003")
    private String audiField003;

    @JsonProperty("audiField004")
    private Boolean audiField004;

    @JsonProperty("audiField005")
    private Long audiField005;

    @JsonProperty("audiField006")
    private Integer audiField006;

    @JsonProperty("audiField007")
    private Long audiField007;

    @JsonProperty("audiField008")
    private Long audiField008;

    @JsonProperty("audiField009")
    private Long audiField009;

    @Size(max = 200)
    @JsonProperty("audiField010")
    private String audiField010;

    @JsonProperty("audiField011")
    private LocalDate audiField011;

    @JsonProperty("audiField012")
    private Double audiField012;

    @JsonProperty("audiField013")
    private Double audiField013;

    @JsonProperty("audiField014")
    private Integer audiField014;

    @JsonProperty("audiField015")
    private LocalDate audiField015;

    @JsonProperty("audiField016")
    private Integer audiField016;

    @JsonProperty("audiField017")
    private Double audiField017;

    @DecimalMin(value = "0.00")
    @JsonProperty("audiField018")
    private BigDecimal audiField018;

    public AuditDto047() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AuditDto047 instance = new AuditDto047();

        public Builder audiField000(LocalDate val) { instance.audiField000 = val; return this; }
        public Builder audiField001(Integer val) { instance.audiField001 = val; return this; }
        public Builder audiField002(BigDecimal val) { instance.audiField002 = val; return this; }
        public Builder audiField003(String val) { instance.audiField003 = val; return this; }
        public Builder audiField004(Boolean val) { instance.audiField004 = val; return this; }
        public Builder audiField005(Long val) { instance.audiField005 = val; return this; }
        public Builder audiField006(Integer val) { instance.audiField006 = val; return this; }
        public Builder audiField007(Long val) { instance.audiField007 = val; return this; }
        public Builder audiField008(Long val) { instance.audiField008 = val; return this; }
        public Builder audiField009(Long val) { instance.audiField009 = val; return this; }
        public Builder audiField010(String val) { instance.audiField010 = val; return this; }
        public Builder audiField011(LocalDate val) { instance.audiField011 = val; return this; }
        public Builder audiField012(Double val) { instance.audiField012 = val; return this; }
        public Builder audiField013(Double val) { instance.audiField013 = val; return this; }
        public Builder audiField014(Integer val) { instance.audiField014 = val; return this; }
        public Builder audiField015(LocalDate val) { instance.audiField015 = val; return this; }
        public Builder audiField016(Integer val) { instance.audiField016 = val; return this; }
        public Builder audiField017(Double val) { instance.audiField017 = val; return this; }
        public Builder audiField018(BigDecimal val) { instance.audiField018 = val; return this; }
        public AuditDto047 build() { return instance; }
    }

    public LocalDate getAudiField000() { return audiField000; }
    public void setAudiField000(LocalDate audiField000) { this.audiField000 = audiField000; }

    public Integer getAudiField001() { return audiField001; }
    public void setAudiField001(Integer audiField001) { this.audiField001 = audiField001; }

    public BigDecimal getAudiField002() { return audiField002; }
    public void setAudiField002(BigDecimal audiField002) { this.audiField002 = audiField002; }

    public String getAudiField003() { return audiField003; }
    public void setAudiField003(String audiField003) { this.audiField003 = audiField003; }

    public Boolean getAudiField004() { return audiField004; }
    public void setAudiField004(Boolean audiField004) { this.audiField004 = audiField004; }

    public Long getAudiField005() { return audiField005; }
    public void setAudiField005(Long audiField005) { this.audiField005 = audiField005; }

    public Integer getAudiField006() { return audiField006; }
    public void setAudiField006(Integer audiField006) { this.audiField006 = audiField006; }

    public Long getAudiField007() { return audiField007; }
    public void setAudiField007(Long audiField007) { this.audiField007 = audiField007; }

    public Long getAudiField008() { return audiField008; }
    public void setAudiField008(Long audiField008) { this.audiField008 = audiField008; }

    public Long getAudiField009() { return audiField009; }
    public void setAudiField009(Long audiField009) { this.audiField009 = audiField009; }

    public String getAudiField010() { return audiField010; }
    public void setAudiField010(String audiField010) { this.audiField010 = audiField010; }

    public LocalDate getAudiField011() { return audiField011; }
    public void setAudiField011(LocalDate audiField011) { this.audiField011 = audiField011; }

    public Double getAudiField012() { return audiField012; }
    public void setAudiField012(Double audiField012) { this.audiField012 = audiField012; }

    public Double getAudiField013() { return audiField013; }
    public void setAudiField013(Double audiField013) { this.audiField013 = audiField013; }

    public Integer getAudiField014() { return audiField014; }
    public void setAudiField014(Integer audiField014) { this.audiField014 = audiField014; }

    public LocalDate getAudiField015() { return audiField015; }
    public void setAudiField015(LocalDate audiField015) { this.audiField015 = audiField015; }

    public Integer getAudiField016() { return audiField016; }
    public void setAudiField016(Integer audiField016) { this.audiField016 = audiField016; }

    public Double getAudiField017() { return audiField017; }
    public void setAudiField017(Double audiField017) { this.audiField017 = audiField017; }

    public BigDecimal getAudiField018() { return audiField018; }
    public void setAudiField018(BigDecimal audiField018) { this.audiField018 = audiField018; }

    @Override
    public String toString() {
        return "AuditDto047{" +
            "audiField000=" + audiField000 + ", " +
            "audiField001=" + audiField001 + ", " +
            "audiField002=" + audiField002 + ", " +
            "audiField003=" + audiField003 + ", " +
            "audiField004=" + audiField004 + ", " +
            "}";
    }
}
