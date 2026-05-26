package com.pnb.compliance;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * ComplianceDto034 — Data Transfer Object for compliance operations.
 * Variant 34 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ComplianceDto034 {

    @JsonProperty("compField000")
    private Integer compField000;

    @JsonProperty("compField001")
    private Double compField001;

    @Size(max = 40)
    @JsonProperty("compField002")
    private String compField002;

    @Size(max = 40)
    @JsonProperty("compField003")
    private String compField003;

    @DecimalMin(value = "0.00")
    @JsonProperty("compField004")
    private BigDecimal compField004;

    @JsonProperty("compField005")
    private Boolean compField005;

    @JsonProperty("compField006")
    private Boolean compField006;

    @JsonProperty("compField007")
    private LocalDate compField007;

    @Size(max = 60)
    @JsonProperty("compField008")
    private String compField008;

    @JsonProperty("compField009")
    private Boolean compField009;

    @JsonProperty("compField010")
    private LocalDate compField010;

    @JsonProperty("compField011")
    private Integer compField011;

    @JsonProperty("compField012")
    private Integer compField012;

    @JsonProperty("compField013")
    private Double compField013;

    @JsonProperty("compField014")
    private LocalDate compField014;

    @DecimalMin(value = "0.00")
    @JsonProperty("compField015")
    private BigDecimal compField015;

    @JsonProperty("compField016")
    private Long compField016;

    @JsonProperty("compField017")
    private Long compField017;

    public ComplianceDto034() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final ComplianceDto034 instance = new ComplianceDto034();

        public Builder compField000(Integer val) { instance.compField000 = val; return this; }
        public Builder compField001(Double val) { instance.compField001 = val; return this; }
        public Builder compField002(String val) { instance.compField002 = val; return this; }
        public Builder compField003(String val) { instance.compField003 = val; return this; }
        public Builder compField004(BigDecimal val) { instance.compField004 = val; return this; }
        public Builder compField005(Boolean val) { instance.compField005 = val; return this; }
        public Builder compField006(Boolean val) { instance.compField006 = val; return this; }
        public Builder compField007(LocalDate val) { instance.compField007 = val; return this; }
        public Builder compField008(String val) { instance.compField008 = val; return this; }
        public Builder compField009(Boolean val) { instance.compField009 = val; return this; }
        public Builder compField010(LocalDate val) { instance.compField010 = val; return this; }
        public Builder compField011(Integer val) { instance.compField011 = val; return this; }
        public Builder compField012(Integer val) { instance.compField012 = val; return this; }
        public Builder compField013(Double val) { instance.compField013 = val; return this; }
        public Builder compField014(LocalDate val) { instance.compField014 = val; return this; }
        public Builder compField015(BigDecimal val) { instance.compField015 = val; return this; }
        public Builder compField016(Long val) { instance.compField016 = val; return this; }
        public Builder compField017(Long val) { instance.compField017 = val; return this; }
        public ComplianceDto034 build() { return instance; }
    }

    public Integer getCompField000() { return compField000; }
    public void setCompField000(Integer compField000) { this.compField000 = compField000; }

    public Double getCompField001() { return compField001; }
    public void setCompField001(Double compField001) { this.compField001 = compField001; }

    public String getCompField002() { return compField002; }
    public void setCompField002(String compField002) { this.compField002 = compField002; }

    public String getCompField003() { return compField003; }
    public void setCompField003(String compField003) { this.compField003 = compField003; }

    public BigDecimal getCompField004() { return compField004; }
    public void setCompField004(BigDecimal compField004) { this.compField004 = compField004; }

    public Boolean getCompField005() { return compField005; }
    public void setCompField005(Boolean compField005) { this.compField005 = compField005; }

    public Boolean getCompField006() { return compField006; }
    public void setCompField006(Boolean compField006) { this.compField006 = compField006; }

    public LocalDate getCompField007() { return compField007; }
    public void setCompField007(LocalDate compField007) { this.compField007 = compField007; }

    public String getCompField008() { return compField008; }
    public void setCompField008(String compField008) { this.compField008 = compField008; }

    public Boolean getCompField009() { return compField009; }
    public void setCompField009(Boolean compField009) { this.compField009 = compField009; }

    public LocalDate getCompField010() { return compField010; }
    public void setCompField010(LocalDate compField010) { this.compField010 = compField010; }

    public Integer getCompField011() { return compField011; }
    public void setCompField011(Integer compField011) { this.compField011 = compField011; }

    public Integer getCompField012() { return compField012; }
    public void setCompField012(Integer compField012) { this.compField012 = compField012; }

    public Double getCompField013() { return compField013; }
    public void setCompField013(Double compField013) { this.compField013 = compField013; }

    public LocalDate getCompField014() { return compField014; }
    public void setCompField014(LocalDate compField014) { this.compField014 = compField014; }

    public BigDecimal getCompField015() { return compField015; }
    public void setCompField015(BigDecimal compField015) { this.compField015 = compField015; }

    public Long getCompField016() { return compField016; }
    public void setCompField016(Long compField016) { this.compField016 = compField016; }

    public Long getCompField017() { return compField017; }
    public void setCompField017(Long compField017) { this.compField017 = compField017; }

    @Override
    public String toString() {
        return "ComplianceDto034{" +
            "compField000=" + compField000 + ", " +
            "compField001=" + compField001 + ", " +
            "compField002=" + compField002 + ", " +
            "compField003=" + compField003 + ", " +
            "compField004=" + compField004 + ", " +
            "}";
    }
}
