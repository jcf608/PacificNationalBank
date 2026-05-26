package com.pnb.compliance;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * ComplianceDto046 — Data Transfer Object for compliance operations.
 * Variant 46 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ComplianceDto046 {

    @JsonProperty("compField000")
    private Integer compField000;

    @JsonProperty("compField001")
    private Long compField001;

    @JsonProperty("compField002")
    private Boolean compField002;

    @JsonProperty("compField003")
    private Integer compField003;

    @JsonProperty("compField004")
    private Double compField004;

    @JsonProperty("compField005")
    private Boolean compField005;

    @JsonProperty("compField006")
    private Boolean compField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("compField007")
    private BigDecimal compField007;

    @JsonProperty("compField008")
    private Integer compField008;

    @JsonProperty("compField009")
    private LocalDate compField009;

    @DecimalMin(value = "0.00")
    @JsonProperty("compField010")
    private BigDecimal compField010;

    @JsonProperty("compField011")
    private Double compField011;

    @JsonProperty("compField012")
    private Double compField012;

    @JsonProperty("compField013")
    private Integer compField013;

    @JsonProperty("compField014")
    private LocalDate compField014;

    @DecimalMin(value = "0.00")
    @JsonProperty("compField015")
    private BigDecimal compField015;

    @DecimalMin(value = "0.00")
    @JsonProperty("compField016")
    private BigDecimal compField016;

    @JsonProperty("compField017")
    private LocalDate compField017;

    public ComplianceDto046() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final ComplianceDto046 instance = new ComplianceDto046();

        public Builder compField000(Integer val) { instance.compField000 = val; return this; }
        public Builder compField001(Long val) { instance.compField001 = val; return this; }
        public Builder compField002(Boolean val) { instance.compField002 = val; return this; }
        public Builder compField003(Integer val) { instance.compField003 = val; return this; }
        public Builder compField004(Double val) { instance.compField004 = val; return this; }
        public Builder compField005(Boolean val) { instance.compField005 = val; return this; }
        public Builder compField006(Boolean val) { instance.compField006 = val; return this; }
        public Builder compField007(BigDecimal val) { instance.compField007 = val; return this; }
        public Builder compField008(Integer val) { instance.compField008 = val; return this; }
        public Builder compField009(LocalDate val) { instance.compField009 = val; return this; }
        public Builder compField010(BigDecimal val) { instance.compField010 = val; return this; }
        public Builder compField011(Double val) { instance.compField011 = val; return this; }
        public Builder compField012(Double val) { instance.compField012 = val; return this; }
        public Builder compField013(Integer val) { instance.compField013 = val; return this; }
        public Builder compField014(LocalDate val) { instance.compField014 = val; return this; }
        public Builder compField015(BigDecimal val) { instance.compField015 = val; return this; }
        public Builder compField016(BigDecimal val) { instance.compField016 = val; return this; }
        public Builder compField017(LocalDate val) { instance.compField017 = val; return this; }
        public ComplianceDto046 build() { return instance; }
    }

    public Integer getCompField000() { return compField000; }
    public void setCompField000(Integer compField000) { this.compField000 = compField000; }

    public Long getCompField001() { return compField001; }
    public void setCompField001(Long compField001) { this.compField001 = compField001; }

    public Boolean getCompField002() { return compField002; }
    public void setCompField002(Boolean compField002) { this.compField002 = compField002; }

    public Integer getCompField003() { return compField003; }
    public void setCompField003(Integer compField003) { this.compField003 = compField003; }

    public Double getCompField004() { return compField004; }
    public void setCompField004(Double compField004) { this.compField004 = compField004; }

    public Boolean getCompField005() { return compField005; }
    public void setCompField005(Boolean compField005) { this.compField005 = compField005; }

    public Boolean getCompField006() { return compField006; }
    public void setCompField006(Boolean compField006) { this.compField006 = compField006; }

    public BigDecimal getCompField007() { return compField007; }
    public void setCompField007(BigDecimal compField007) { this.compField007 = compField007; }

    public Integer getCompField008() { return compField008; }
    public void setCompField008(Integer compField008) { this.compField008 = compField008; }

    public LocalDate getCompField009() { return compField009; }
    public void setCompField009(LocalDate compField009) { this.compField009 = compField009; }

    public BigDecimal getCompField010() { return compField010; }
    public void setCompField010(BigDecimal compField010) { this.compField010 = compField010; }

    public Double getCompField011() { return compField011; }
    public void setCompField011(Double compField011) { this.compField011 = compField011; }

    public Double getCompField012() { return compField012; }
    public void setCompField012(Double compField012) { this.compField012 = compField012; }

    public Integer getCompField013() { return compField013; }
    public void setCompField013(Integer compField013) { this.compField013 = compField013; }

    public LocalDate getCompField014() { return compField014; }
    public void setCompField014(LocalDate compField014) { this.compField014 = compField014; }

    public BigDecimal getCompField015() { return compField015; }
    public void setCompField015(BigDecimal compField015) { this.compField015 = compField015; }

    public BigDecimal getCompField016() { return compField016; }
    public void setCompField016(BigDecimal compField016) { this.compField016 = compField016; }

    public LocalDate getCompField017() { return compField017; }
    public void setCompField017(LocalDate compField017) { this.compField017 = compField017; }

    @Override
    public String toString() {
        return "ComplianceDto046{" +
            "compField000=" + compField000 + ", " +
            "compField001=" + compField001 + ", " +
            "compField002=" + compField002 + ", " +
            "compField003=" + compField003 + ", " +
            "compField004=" + compField004 + ", " +
            "}";
    }
}
