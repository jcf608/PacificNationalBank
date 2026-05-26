package com.pnb.compliance;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * ComplianceDto032 — Data Transfer Object for compliance operations.
 * Variant 32 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ComplianceDto032 {

    @JsonProperty("compField000")
    private Boolean compField000;

    @JsonProperty("compField001")
    private Integer compField001;

    @JsonProperty("compField002")
    private Long compField002;

    @JsonProperty("compField003")
    private Boolean compField003;

    @JsonProperty("compField004")
    private Double compField004;

    @JsonProperty("compField005")
    private Long compField005;

    @JsonProperty("compField006")
    private LocalDate compField006;

    @JsonProperty("compField007")
    private LocalDate compField007;

    @JsonProperty("compField008")
    private Integer compField008;

    @JsonProperty("compField009")
    private LocalDate compField009;

    @DecimalMin(value = "0.00")
    @JsonProperty("compField010")
    private BigDecimal compField010;

    @JsonProperty("compField011")
    private LocalDate compField011;

    @JsonProperty("compField012")
    private LocalDate compField012;

    @JsonProperty("compField013")
    private Double compField013;

    @JsonProperty("compField014")
    private Long compField014;

    @JsonProperty("compField015")
    private Double compField015;

    public ComplianceDto032() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final ComplianceDto032 instance = new ComplianceDto032();

        public Builder compField000(Boolean val) { instance.compField000 = val; return this; }
        public Builder compField001(Integer val) { instance.compField001 = val; return this; }
        public Builder compField002(Long val) { instance.compField002 = val; return this; }
        public Builder compField003(Boolean val) { instance.compField003 = val; return this; }
        public Builder compField004(Double val) { instance.compField004 = val; return this; }
        public Builder compField005(Long val) { instance.compField005 = val; return this; }
        public Builder compField006(LocalDate val) { instance.compField006 = val; return this; }
        public Builder compField007(LocalDate val) { instance.compField007 = val; return this; }
        public Builder compField008(Integer val) { instance.compField008 = val; return this; }
        public Builder compField009(LocalDate val) { instance.compField009 = val; return this; }
        public Builder compField010(BigDecimal val) { instance.compField010 = val; return this; }
        public Builder compField011(LocalDate val) { instance.compField011 = val; return this; }
        public Builder compField012(LocalDate val) { instance.compField012 = val; return this; }
        public Builder compField013(Double val) { instance.compField013 = val; return this; }
        public Builder compField014(Long val) { instance.compField014 = val; return this; }
        public Builder compField015(Double val) { instance.compField015 = val; return this; }
        public ComplianceDto032 build() { return instance; }
    }

    public Boolean getCompField000() { return compField000; }
    public void setCompField000(Boolean compField000) { this.compField000 = compField000; }

    public Integer getCompField001() { return compField001; }
    public void setCompField001(Integer compField001) { this.compField001 = compField001; }

    public Long getCompField002() { return compField002; }
    public void setCompField002(Long compField002) { this.compField002 = compField002; }

    public Boolean getCompField003() { return compField003; }
    public void setCompField003(Boolean compField003) { this.compField003 = compField003; }

    public Double getCompField004() { return compField004; }
    public void setCompField004(Double compField004) { this.compField004 = compField004; }

    public Long getCompField005() { return compField005; }
    public void setCompField005(Long compField005) { this.compField005 = compField005; }

    public LocalDate getCompField006() { return compField006; }
    public void setCompField006(LocalDate compField006) { this.compField006 = compField006; }

    public LocalDate getCompField007() { return compField007; }
    public void setCompField007(LocalDate compField007) { this.compField007 = compField007; }

    public Integer getCompField008() { return compField008; }
    public void setCompField008(Integer compField008) { this.compField008 = compField008; }

    public LocalDate getCompField009() { return compField009; }
    public void setCompField009(LocalDate compField009) { this.compField009 = compField009; }

    public BigDecimal getCompField010() { return compField010; }
    public void setCompField010(BigDecimal compField010) { this.compField010 = compField010; }

    public LocalDate getCompField011() { return compField011; }
    public void setCompField011(LocalDate compField011) { this.compField011 = compField011; }

    public LocalDate getCompField012() { return compField012; }
    public void setCompField012(LocalDate compField012) { this.compField012 = compField012; }

    public Double getCompField013() { return compField013; }
    public void setCompField013(Double compField013) { this.compField013 = compField013; }

    public Long getCompField014() { return compField014; }
    public void setCompField014(Long compField014) { this.compField014 = compField014; }

    public Double getCompField015() { return compField015; }
    public void setCompField015(Double compField015) { this.compField015 = compField015; }

    @Override
    public String toString() {
        return "ComplianceDto032{" +
            "compField000=" + compField000 + ", " +
            "compField001=" + compField001 + ", " +
            "compField002=" + compField002 + ", " +
            "compField003=" + compField003 + ", " +
            "compField004=" + compField004 + ", " +
            "}";
    }
}
