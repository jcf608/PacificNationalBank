package com.pnb.compliance;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * ComplianceDto023 — Data Transfer Object for compliance operations.
 * Variant 23 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ComplianceDto023 {

    @JsonProperty("compField000")
    private Double compField000;

    @JsonProperty("compField001")
    private Double compField001;

    @Size(max = 100)
    @JsonProperty("compField002")
    private String compField002;

    @Size(max = 200)
    @JsonProperty("compField003")
    private String compField003;

    @JsonProperty("compField004")
    private Boolean compField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("compField005")
    private BigDecimal compField005;

    @JsonProperty("compField006")
    private LocalDate compField006;

    @JsonProperty("compField007")
    private Long compField007;

    @JsonProperty("compField008")
    private Boolean compField008;

    @JsonProperty("compField009")
    private LocalDate compField009;

    @Size(max = 200)
    @JsonProperty("compField010")
    private String compField010;

    @JsonProperty("compField011")
    private Double compField011;

    @JsonProperty("compField012")
    private LocalDate compField012;

    @JsonProperty("compField013")
    private Boolean compField013;

    @JsonProperty("compField014")
    private Boolean compField014;

    @Size(max = 40)
    @JsonProperty("compField015")
    private String compField015;

    @JsonProperty("compField016")
    private LocalDate compField016;

    @JsonProperty("compField017")
    private Long compField017;

    @JsonProperty("compField018")
    private Integer compField018;

    public ComplianceDto023() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final ComplianceDto023 instance = new ComplianceDto023();

        public Builder compField000(Double val) { instance.compField000 = val; return this; }
        public Builder compField001(Double val) { instance.compField001 = val; return this; }
        public Builder compField002(String val) { instance.compField002 = val; return this; }
        public Builder compField003(String val) { instance.compField003 = val; return this; }
        public Builder compField004(Boolean val) { instance.compField004 = val; return this; }
        public Builder compField005(BigDecimal val) { instance.compField005 = val; return this; }
        public Builder compField006(LocalDate val) { instance.compField006 = val; return this; }
        public Builder compField007(Long val) { instance.compField007 = val; return this; }
        public Builder compField008(Boolean val) { instance.compField008 = val; return this; }
        public Builder compField009(LocalDate val) { instance.compField009 = val; return this; }
        public Builder compField010(String val) { instance.compField010 = val; return this; }
        public Builder compField011(Double val) { instance.compField011 = val; return this; }
        public Builder compField012(LocalDate val) { instance.compField012 = val; return this; }
        public Builder compField013(Boolean val) { instance.compField013 = val; return this; }
        public Builder compField014(Boolean val) { instance.compField014 = val; return this; }
        public Builder compField015(String val) { instance.compField015 = val; return this; }
        public Builder compField016(LocalDate val) { instance.compField016 = val; return this; }
        public Builder compField017(Long val) { instance.compField017 = val; return this; }
        public Builder compField018(Integer val) { instance.compField018 = val; return this; }
        public ComplianceDto023 build() { return instance; }
    }

    public Double getCompField000() { return compField000; }
    public void setCompField000(Double compField000) { this.compField000 = compField000; }

    public Double getCompField001() { return compField001; }
    public void setCompField001(Double compField001) { this.compField001 = compField001; }

    public String getCompField002() { return compField002; }
    public void setCompField002(String compField002) { this.compField002 = compField002; }

    public String getCompField003() { return compField003; }
    public void setCompField003(String compField003) { this.compField003 = compField003; }

    public Boolean getCompField004() { return compField004; }
    public void setCompField004(Boolean compField004) { this.compField004 = compField004; }

    public BigDecimal getCompField005() { return compField005; }
    public void setCompField005(BigDecimal compField005) { this.compField005 = compField005; }

    public LocalDate getCompField006() { return compField006; }
    public void setCompField006(LocalDate compField006) { this.compField006 = compField006; }

    public Long getCompField007() { return compField007; }
    public void setCompField007(Long compField007) { this.compField007 = compField007; }

    public Boolean getCompField008() { return compField008; }
    public void setCompField008(Boolean compField008) { this.compField008 = compField008; }

    public LocalDate getCompField009() { return compField009; }
    public void setCompField009(LocalDate compField009) { this.compField009 = compField009; }

    public String getCompField010() { return compField010; }
    public void setCompField010(String compField010) { this.compField010 = compField010; }

    public Double getCompField011() { return compField011; }
    public void setCompField011(Double compField011) { this.compField011 = compField011; }

    public LocalDate getCompField012() { return compField012; }
    public void setCompField012(LocalDate compField012) { this.compField012 = compField012; }

    public Boolean getCompField013() { return compField013; }
    public void setCompField013(Boolean compField013) { this.compField013 = compField013; }

    public Boolean getCompField014() { return compField014; }
    public void setCompField014(Boolean compField014) { this.compField014 = compField014; }

    public String getCompField015() { return compField015; }
    public void setCompField015(String compField015) { this.compField015 = compField015; }

    public LocalDate getCompField016() { return compField016; }
    public void setCompField016(LocalDate compField016) { this.compField016 = compField016; }

    public Long getCompField017() { return compField017; }
    public void setCompField017(Long compField017) { this.compField017 = compField017; }

    public Integer getCompField018() { return compField018; }
    public void setCompField018(Integer compField018) { this.compField018 = compField018; }

    @Override
    public String toString() {
        return "ComplianceDto023{" +
            "compField000=" + compField000 + ", " +
            "compField001=" + compField001 + ", " +
            "compField002=" + compField002 + ", " +
            "compField003=" + compField003 + ", " +
            "compField004=" + compField004 + ", " +
            "}";
    }
}
