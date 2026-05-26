package com.pnb.audit;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AuditDto040 — Data Transfer Object for audit operations.
 * Variant 40 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuditDto040 {

    @Size(max = 100)
    @JsonProperty("audiField000")
    private String audiField000;

    @JsonProperty("audiField001")
    private Double audiField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("audiField002")
    private BigDecimal audiField002;

    @JsonProperty("audiField003")
    private LocalDate audiField003;

    @JsonProperty("audiField004")
    private LocalDate audiField004;

    @JsonProperty("audiField005")
    private Long audiField005;

    @Size(max = 40)
    @JsonProperty("audiField006")
    private String audiField006;

    @JsonProperty("audiField007")
    private Double audiField007;

    @JsonProperty("audiField008")
    private Integer audiField008;

    @JsonProperty("audiField009")
    private Integer audiField009;

    @JsonProperty("audiField010")
    private Long audiField010;

    @DecimalMin(value = "0.00")
    @JsonProperty("audiField011")
    private BigDecimal audiField011;

    public AuditDto040() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AuditDto040 instance = new AuditDto040();

        public Builder audiField000(String val) { instance.audiField000 = val; return this; }
        public Builder audiField001(Double val) { instance.audiField001 = val; return this; }
        public Builder audiField002(BigDecimal val) { instance.audiField002 = val; return this; }
        public Builder audiField003(LocalDate val) { instance.audiField003 = val; return this; }
        public Builder audiField004(LocalDate val) { instance.audiField004 = val; return this; }
        public Builder audiField005(Long val) { instance.audiField005 = val; return this; }
        public Builder audiField006(String val) { instance.audiField006 = val; return this; }
        public Builder audiField007(Double val) { instance.audiField007 = val; return this; }
        public Builder audiField008(Integer val) { instance.audiField008 = val; return this; }
        public Builder audiField009(Integer val) { instance.audiField009 = val; return this; }
        public Builder audiField010(Long val) { instance.audiField010 = val; return this; }
        public Builder audiField011(BigDecimal val) { instance.audiField011 = val; return this; }
        public AuditDto040 build() { return instance; }
    }

    public String getAudiField000() { return audiField000; }
    public void setAudiField000(String audiField000) { this.audiField000 = audiField000; }

    public Double getAudiField001() { return audiField001; }
    public void setAudiField001(Double audiField001) { this.audiField001 = audiField001; }

    public BigDecimal getAudiField002() { return audiField002; }
    public void setAudiField002(BigDecimal audiField002) { this.audiField002 = audiField002; }

    public LocalDate getAudiField003() { return audiField003; }
    public void setAudiField003(LocalDate audiField003) { this.audiField003 = audiField003; }

    public LocalDate getAudiField004() { return audiField004; }
    public void setAudiField004(LocalDate audiField004) { this.audiField004 = audiField004; }

    public Long getAudiField005() { return audiField005; }
    public void setAudiField005(Long audiField005) { this.audiField005 = audiField005; }

    public String getAudiField006() { return audiField006; }
    public void setAudiField006(String audiField006) { this.audiField006 = audiField006; }

    public Double getAudiField007() { return audiField007; }
    public void setAudiField007(Double audiField007) { this.audiField007 = audiField007; }

    public Integer getAudiField008() { return audiField008; }
    public void setAudiField008(Integer audiField008) { this.audiField008 = audiField008; }

    public Integer getAudiField009() { return audiField009; }
    public void setAudiField009(Integer audiField009) { this.audiField009 = audiField009; }

    public Long getAudiField010() { return audiField010; }
    public void setAudiField010(Long audiField010) { this.audiField010 = audiField010; }

    public BigDecimal getAudiField011() { return audiField011; }
    public void setAudiField011(BigDecimal audiField011) { this.audiField011 = audiField011; }

    @Override
    public String toString() {
        return "AuditDto040{" +
            "audiField000=" + audiField000 + ", " +
            "audiField001=" + audiField001 + ", " +
            "audiField002=" + audiField002 + ", " +
            "audiField003=" + audiField003 + ", " +
            "audiField004=" + audiField004 + ", " +
            "}";
    }
}
