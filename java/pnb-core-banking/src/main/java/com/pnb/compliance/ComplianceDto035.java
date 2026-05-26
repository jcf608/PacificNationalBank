package com.pnb.compliance;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * ComplianceDto035 — Data Transfer Object for compliance operations.
 * Variant 35 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ComplianceDto035 {

    @JsonProperty("compField000")
    private Integer compField000;

    @JsonProperty("compField001")
    private Integer compField001;

    @JsonProperty("compField002")
    private Integer compField002;

    @JsonProperty("compField003")
    private Integer compField003;

    @JsonProperty("compField004")
    private LocalDate compField004;

    @JsonProperty("compField005")
    private Integer compField005;

    @Size(max = 60)
    @JsonProperty("compField006")
    private String compField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("compField007")
    private BigDecimal compField007;

    @JsonProperty("compField008")
    private Integer compField008;

    @JsonProperty("compField009")
    private Boolean compField009;

    @Size(max = 60)
    @JsonProperty("compField010")
    private String compField010;

    @JsonProperty("compField011")
    private LocalDate compField011;

    @Size(max = 200)
    @JsonProperty("compField012")
    private String compField012;

    @JsonProperty("compField013")
    private LocalDate compField013;

    @JsonProperty("compField014")
    private Boolean compField014;

    @JsonProperty("compField015")
    private Double compField015;

    @JsonProperty("compField016")
    private Boolean compField016;

    @JsonProperty("compField017")
    private Integer compField017;

    @JsonProperty("compField018")
    private Boolean compField018;

    public ComplianceDto035() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final ComplianceDto035 instance = new ComplianceDto035();

        public Builder compField000(Integer val) { instance.compField000 = val; return this; }
        public Builder compField001(Integer val) { instance.compField001 = val; return this; }
        public Builder compField002(Integer val) { instance.compField002 = val; return this; }
        public Builder compField003(Integer val) { instance.compField003 = val; return this; }
        public Builder compField004(LocalDate val) { instance.compField004 = val; return this; }
        public Builder compField005(Integer val) { instance.compField005 = val; return this; }
        public Builder compField006(String val) { instance.compField006 = val; return this; }
        public Builder compField007(BigDecimal val) { instance.compField007 = val; return this; }
        public Builder compField008(Integer val) { instance.compField008 = val; return this; }
        public Builder compField009(Boolean val) { instance.compField009 = val; return this; }
        public Builder compField010(String val) { instance.compField010 = val; return this; }
        public Builder compField011(LocalDate val) { instance.compField011 = val; return this; }
        public Builder compField012(String val) { instance.compField012 = val; return this; }
        public Builder compField013(LocalDate val) { instance.compField013 = val; return this; }
        public Builder compField014(Boolean val) { instance.compField014 = val; return this; }
        public Builder compField015(Double val) { instance.compField015 = val; return this; }
        public Builder compField016(Boolean val) { instance.compField016 = val; return this; }
        public Builder compField017(Integer val) { instance.compField017 = val; return this; }
        public Builder compField018(Boolean val) { instance.compField018 = val; return this; }
        public ComplianceDto035 build() { return instance; }
    }

    public Integer getCompField000() { return compField000; }
    public void setCompField000(Integer compField000) { this.compField000 = compField000; }

    public Integer getCompField001() { return compField001; }
    public void setCompField001(Integer compField001) { this.compField001 = compField001; }

    public Integer getCompField002() { return compField002; }
    public void setCompField002(Integer compField002) { this.compField002 = compField002; }

    public Integer getCompField003() { return compField003; }
    public void setCompField003(Integer compField003) { this.compField003 = compField003; }

    public LocalDate getCompField004() { return compField004; }
    public void setCompField004(LocalDate compField004) { this.compField004 = compField004; }

    public Integer getCompField005() { return compField005; }
    public void setCompField005(Integer compField005) { this.compField005 = compField005; }

    public String getCompField006() { return compField006; }
    public void setCompField006(String compField006) { this.compField006 = compField006; }

    public BigDecimal getCompField007() { return compField007; }
    public void setCompField007(BigDecimal compField007) { this.compField007 = compField007; }

    public Integer getCompField008() { return compField008; }
    public void setCompField008(Integer compField008) { this.compField008 = compField008; }

    public Boolean getCompField009() { return compField009; }
    public void setCompField009(Boolean compField009) { this.compField009 = compField009; }

    public String getCompField010() { return compField010; }
    public void setCompField010(String compField010) { this.compField010 = compField010; }

    public LocalDate getCompField011() { return compField011; }
    public void setCompField011(LocalDate compField011) { this.compField011 = compField011; }

    public String getCompField012() { return compField012; }
    public void setCompField012(String compField012) { this.compField012 = compField012; }

    public LocalDate getCompField013() { return compField013; }
    public void setCompField013(LocalDate compField013) { this.compField013 = compField013; }

    public Boolean getCompField014() { return compField014; }
    public void setCompField014(Boolean compField014) { this.compField014 = compField014; }

    public Double getCompField015() { return compField015; }
    public void setCompField015(Double compField015) { this.compField015 = compField015; }

    public Boolean getCompField016() { return compField016; }
    public void setCompField016(Boolean compField016) { this.compField016 = compField016; }

    public Integer getCompField017() { return compField017; }
    public void setCompField017(Integer compField017) { this.compField017 = compField017; }

    public Boolean getCompField018() { return compField018; }
    public void setCompField018(Boolean compField018) { this.compField018 = compField018; }

    @Override
    public String toString() {
        return "ComplianceDto035{" +
            "compField000=" + compField000 + ", " +
            "compField001=" + compField001 + ", " +
            "compField002=" + compField002 + ", " +
            "compField003=" + compField003 + ", " +
            "compField004=" + compField004 + ", " +
            "}";
    }
}
