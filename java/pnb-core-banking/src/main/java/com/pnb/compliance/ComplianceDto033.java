package com.pnb.compliance;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * ComplianceDto033 — Data Transfer Object for compliance operations.
 * Variant 33 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ComplianceDto033 {

    @Size(max = 200)
    @JsonProperty("compField000")
    private String compField000;

    @DecimalMin(value = "0.00")
    @JsonProperty("compField001")
    private BigDecimal compField001;

    @JsonProperty("compField002")
    private Long compField002;

    @DecimalMin(value = "0.00")
    @JsonProperty("compField003")
    private BigDecimal compField003;

    @JsonProperty("compField004")
    private Boolean compField004;

    @JsonProperty("compField005")
    private Long compField005;

    @JsonProperty("compField006")
    private Double compField006;

    @JsonProperty("compField007")
    private LocalDate compField007;

    @JsonProperty("compField008")
    private LocalDate compField008;

    @JsonProperty("compField009")
    private Long compField009;

    @DecimalMin(value = "0.00")
    @JsonProperty("compField010")
    private BigDecimal compField010;

    @JsonProperty("compField011")
    private Boolean compField011;

    @JsonProperty("compField012")
    private Boolean compField012;

    @DecimalMin(value = "0.00")
    @JsonProperty("compField013")
    private BigDecimal compField013;

    @JsonProperty("compField014")
    private Integer compField014;

    @JsonProperty("compField015")
    private LocalDate compField015;

    @DecimalMin(value = "0.00")
    @JsonProperty("compField016")
    private BigDecimal compField016;

    public ComplianceDto033() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final ComplianceDto033 instance = new ComplianceDto033();

        public Builder compField000(String val) { instance.compField000 = val; return this; }
        public Builder compField001(BigDecimal val) { instance.compField001 = val; return this; }
        public Builder compField002(Long val) { instance.compField002 = val; return this; }
        public Builder compField003(BigDecimal val) { instance.compField003 = val; return this; }
        public Builder compField004(Boolean val) { instance.compField004 = val; return this; }
        public Builder compField005(Long val) { instance.compField005 = val; return this; }
        public Builder compField006(Double val) { instance.compField006 = val; return this; }
        public Builder compField007(LocalDate val) { instance.compField007 = val; return this; }
        public Builder compField008(LocalDate val) { instance.compField008 = val; return this; }
        public Builder compField009(Long val) { instance.compField009 = val; return this; }
        public Builder compField010(BigDecimal val) { instance.compField010 = val; return this; }
        public Builder compField011(Boolean val) { instance.compField011 = val; return this; }
        public Builder compField012(Boolean val) { instance.compField012 = val; return this; }
        public Builder compField013(BigDecimal val) { instance.compField013 = val; return this; }
        public Builder compField014(Integer val) { instance.compField014 = val; return this; }
        public Builder compField015(LocalDate val) { instance.compField015 = val; return this; }
        public Builder compField016(BigDecimal val) { instance.compField016 = val; return this; }
        public ComplianceDto033 build() { return instance; }
    }

    public String getCompField000() { return compField000; }
    public void setCompField000(String compField000) { this.compField000 = compField000; }

    public BigDecimal getCompField001() { return compField001; }
    public void setCompField001(BigDecimal compField001) { this.compField001 = compField001; }

    public Long getCompField002() { return compField002; }
    public void setCompField002(Long compField002) { this.compField002 = compField002; }

    public BigDecimal getCompField003() { return compField003; }
    public void setCompField003(BigDecimal compField003) { this.compField003 = compField003; }

    public Boolean getCompField004() { return compField004; }
    public void setCompField004(Boolean compField004) { this.compField004 = compField004; }

    public Long getCompField005() { return compField005; }
    public void setCompField005(Long compField005) { this.compField005 = compField005; }

    public Double getCompField006() { return compField006; }
    public void setCompField006(Double compField006) { this.compField006 = compField006; }

    public LocalDate getCompField007() { return compField007; }
    public void setCompField007(LocalDate compField007) { this.compField007 = compField007; }

    public LocalDate getCompField008() { return compField008; }
    public void setCompField008(LocalDate compField008) { this.compField008 = compField008; }

    public Long getCompField009() { return compField009; }
    public void setCompField009(Long compField009) { this.compField009 = compField009; }

    public BigDecimal getCompField010() { return compField010; }
    public void setCompField010(BigDecimal compField010) { this.compField010 = compField010; }

    public Boolean getCompField011() { return compField011; }
    public void setCompField011(Boolean compField011) { this.compField011 = compField011; }

    public Boolean getCompField012() { return compField012; }
    public void setCompField012(Boolean compField012) { this.compField012 = compField012; }

    public BigDecimal getCompField013() { return compField013; }
    public void setCompField013(BigDecimal compField013) { this.compField013 = compField013; }

    public Integer getCompField014() { return compField014; }
    public void setCompField014(Integer compField014) { this.compField014 = compField014; }

    public LocalDate getCompField015() { return compField015; }
    public void setCompField015(LocalDate compField015) { this.compField015 = compField015; }

    public BigDecimal getCompField016() { return compField016; }
    public void setCompField016(BigDecimal compField016) { this.compField016 = compField016; }

    @Override
    public String toString() {
        return "ComplianceDto033{" +
            "compField000=" + compField000 + ", " +
            "compField001=" + compField001 + ", " +
            "compField002=" + compField002 + ", " +
            "compField003=" + compField003 + ", " +
            "compField004=" + compField004 + ", " +
            "}";
    }
}
