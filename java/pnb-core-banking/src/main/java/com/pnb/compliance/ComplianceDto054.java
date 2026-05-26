package com.pnb.compliance;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * ComplianceDto054 — Data Transfer Object for compliance operations.
 * Variant 54 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ComplianceDto054 {

    @JsonProperty("compField000")
    private LocalDate compField000;

    @JsonProperty("compField001")
    private LocalDate compField001;

    @JsonProperty("compField002")
    private Double compField002;

    @JsonProperty("compField003")
    private LocalDate compField003;

    @JsonProperty("compField004")
    private Long compField004;

    @JsonProperty("compField005")
    private Boolean compField005;

    @JsonProperty("compField006")
    private Double compField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("compField007")
    private BigDecimal compField007;

    @JsonProperty("compField008")
    private Long compField008;

    @DecimalMin(value = "0.00")
    @JsonProperty("compField009")
    private BigDecimal compField009;

    @JsonProperty("compField010")
    private Double compField010;

    @JsonProperty("compField011")
    private Integer compField011;

    @JsonProperty("compField012")
    private Double compField012;

    @DecimalMin(value = "0.00")
    @JsonProperty("compField013")
    private BigDecimal compField013;

    public ComplianceDto054() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final ComplianceDto054 instance = new ComplianceDto054();

        public Builder compField000(LocalDate val) { instance.compField000 = val; return this; }
        public Builder compField001(LocalDate val) { instance.compField001 = val; return this; }
        public Builder compField002(Double val) { instance.compField002 = val; return this; }
        public Builder compField003(LocalDate val) { instance.compField003 = val; return this; }
        public Builder compField004(Long val) { instance.compField004 = val; return this; }
        public Builder compField005(Boolean val) { instance.compField005 = val; return this; }
        public Builder compField006(Double val) { instance.compField006 = val; return this; }
        public Builder compField007(BigDecimal val) { instance.compField007 = val; return this; }
        public Builder compField008(Long val) { instance.compField008 = val; return this; }
        public Builder compField009(BigDecimal val) { instance.compField009 = val; return this; }
        public Builder compField010(Double val) { instance.compField010 = val; return this; }
        public Builder compField011(Integer val) { instance.compField011 = val; return this; }
        public Builder compField012(Double val) { instance.compField012 = val; return this; }
        public Builder compField013(BigDecimal val) { instance.compField013 = val; return this; }
        public ComplianceDto054 build() { return instance; }
    }

    public LocalDate getCompField000() { return compField000; }
    public void setCompField000(LocalDate compField000) { this.compField000 = compField000; }

    public LocalDate getCompField001() { return compField001; }
    public void setCompField001(LocalDate compField001) { this.compField001 = compField001; }

    public Double getCompField002() { return compField002; }
    public void setCompField002(Double compField002) { this.compField002 = compField002; }

    public LocalDate getCompField003() { return compField003; }
    public void setCompField003(LocalDate compField003) { this.compField003 = compField003; }

    public Long getCompField004() { return compField004; }
    public void setCompField004(Long compField004) { this.compField004 = compField004; }

    public Boolean getCompField005() { return compField005; }
    public void setCompField005(Boolean compField005) { this.compField005 = compField005; }

    public Double getCompField006() { return compField006; }
    public void setCompField006(Double compField006) { this.compField006 = compField006; }

    public BigDecimal getCompField007() { return compField007; }
    public void setCompField007(BigDecimal compField007) { this.compField007 = compField007; }

    public Long getCompField008() { return compField008; }
    public void setCompField008(Long compField008) { this.compField008 = compField008; }

    public BigDecimal getCompField009() { return compField009; }
    public void setCompField009(BigDecimal compField009) { this.compField009 = compField009; }

    public Double getCompField010() { return compField010; }
    public void setCompField010(Double compField010) { this.compField010 = compField010; }

    public Integer getCompField011() { return compField011; }
    public void setCompField011(Integer compField011) { this.compField011 = compField011; }

    public Double getCompField012() { return compField012; }
    public void setCompField012(Double compField012) { this.compField012 = compField012; }

    public BigDecimal getCompField013() { return compField013; }
    public void setCompField013(BigDecimal compField013) { this.compField013 = compField013; }

    @Override
    public String toString() {
        return "ComplianceDto054{" +
            "compField000=" + compField000 + ", " +
            "compField001=" + compField001 + ", " +
            "compField002=" + compField002 + ", " +
            "compField003=" + compField003 + ", " +
            "compField004=" + compField004 + ", " +
            "}";
    }
}
