package com.pnb.compliance;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * ComplianceDto057 — Data Transfer Object for compliance operations.
 * Variant 57 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ComplianceDto057 {

    @JsonProperty("compField000")
    private Boolean compField000;

    @DecimalMin(value = "0.00")
    @JsonProperty("compField001")
    private BigDecimal compField001;

    @JsonProperty("compField002")
    private Boolean compField002;

    @JsonProperty("compField003")
    private LocalDate compField003;

    @JsonProperty("compField004")
    private Double compField004;

    @JsonProperty("compField005")
    private Double compField005;

    @JsonProperty("compField006")
    private Double compField006;

    @JsonProperty("compField007")
    private LocalDate compField007;

    @JsonProperty("compField008")
    private Long compField008;

    @Size(max = 20)
    @JsonProperty("compField009")
    private String compField009;

    @JsonProperty("compField010")
    private LocalDate compField010;

    @DecimalMin(value = "0.00")
    @JsonProperty("compField011")
    private BigDecimal compField011;

    @JsonProperty("compField012")
    private Boolean compField012;

    @DecimalMin(value = "0.00")
    @JsonProperty("compField013")
    private BigDecimal compField013;

    @JsonProperty("compField014")
    private Integer compField014;

    @JsonProperty("compField015")
    private Boolean compField015;

    @JsonProperty("compField016")
    private Boolean compField016;

    public ComplianceDto057() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final ComplianceDto057 instance = new ComplianceDto057();

        public Builder compField000(Boolean val) { instance.compField000 = val; return this; }
        public Builder compField001(BigDecimal val) { instance.compField001 = val; return this; }
        public Builder compField002(Boolean val) { instance.compField002 = val; return this; }
        public Builder compField003(LocalDate val) { instance.compField003 = val; return this; }
        public Builder compField004(Double val) { instance.compField004 = val; return this; }
        public Builder compField005(Double val) { instance.compField005 = val; return this; }
        public Builder compField006(Double val) { instance.compField006 = val; return this; }
        public Builder compField007(LocalDate val) { instance.compField007 = val; return this; }
        public Builder compField008(Long val) { instance.compField008 = val; return this; }
        public Builder compField009(String val) { instance.compField009 = val; return this; }
        public Builder compField010(LocalDate val) { instance.compField010 = val; return this; }
        public Builder compField011(BigDecimal val) { instance.compField011 = val; return this; }
        public Builder compField012(Boolean val) { instance.compField012 = val; return this; }
        public Builder compField013(BigDecimal val) { instance.compField013 = val; return this; }
        public Builder compField014(Integer val) { instance.compField014 = val; return this; }
        public Builder compField015(Boolean val) { instance.compField015 = val; return this; }
        public Builder compField016(Boolean val) { instance.compField016 = val; return this; }
        public ComplianceDto057 build() { return instance; }
    }

    public Boolean getCompField000() { return compField000; }
    public void setCompField000(Boolean compField000) { this.compField000 = compField000; }

    public BigDecimal getCompField001() { return compField001; }
    public void setCompField001(BigDecimal compField001) { this.compField001 = compField001; }

    public Boolean getCompField002() { return compField002; }
    public void setCompField002(Boolean compField002) { this.compField002 = compField002; }

    public LocalDate getCompField003() { return compField003; }
    public void setCompField003(LocalDate compField003) { this.compField003 = compField003; }

    public Double getCompField004() { return compField004; }
    public void setCompField004(Double compField004) { this.compField004 = compField004; }

    public Double getCompField005() { return compField005; }
    public void setCompField005(Double compField005) { this.compField005 = compField005; }

    public Double getCompField006() { return compField006; }
    public void setCompField006(Double compField006) { this.compField006 = compField006; }

    public LocalDate getCompField007() { return compField007; }
    public void setCompField007(LocalDate compField007) { this.compField007 = compField007; }

    public Long getCompField008() { return compField008; }
    public void setCompField008(Long compField008) { this.compField008 = compField008; }

    public String getCompField009() { return compField009; }
    public void setCompField009(String compField009) { this.compField009 = compField009; }

    public LocalDate getCompField010() { return compField010; }
    public void setCompField010(LocalDate compField010) { this.compField010 = compField010; }

    public BigDecimal getCompField011() { return compField011; }
    public void setCompField011(BigDecimal compField011) { this.compField011 = compField011; }

    public Boolean getCompField012() { return compField012; }
    public void setCompField012(Boolean compField012) { this.compField012 = compField012; }

    public BigDecimal getCompField013() { return compField013; }
    public void setCompField013(BigDecimal compField013) { this.compField013 = compField013; }

    public Integer getCompField014() { return compField014; }
    public void setCompField014(Integer compField014) { this.compField014 = compField014; }

    public Boolean getCompField015() { return compField015; }
    public void setCompField015(Boolean compField015) { this.compField015 = compField015; }

    public Boolean getCompField016() { return compField016; }
    public void setCompField016(Boolean compField016) { this.compField016 = compField016; }

    @Override
    public String toString() {
        return "ComplianceDto057{" +
            "compField000=" + compField000 + ", " +
            "compField001=" + compField001 + ", " +
            "compField002=" + compField002 + ", " +
            "compField003=" + compField003 + ", " +
            "compField004=" + compField004 + ", " +
            "}";
    }
}
