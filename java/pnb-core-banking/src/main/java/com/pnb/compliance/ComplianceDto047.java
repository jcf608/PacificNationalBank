package com.pnb.compliance;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * ComplianceDto047 — Data Transfer Object for compliance operations.
 * Variant 47 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ComplianceDto047 {

    @Size(max = 200)
    @JsonProperty("compField000")
    private String compField000;

    @JsonProperty("compField001")
    private Long compField001;

    @JsonProperty("compField002")
    private Double compField002;

    @JsonProperty("compField003")
    private Integer compField003;

    @JsonProperty("compField004")
    private Long compField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("compField005")
    private BigDecimal compField005;

    @JsonProperty("compField006")
    private Boolean compField006;

    @JsonProperty("compField007")
    private Boolean compField007;

    @JsonProperty("compField008")
    private Long compField008;

    @JsonProperty("compField009")
    private Integer compField009;

    @JsonProperty("compField010")
    private Boolean compField010;

    @JsonProperty("compField011")
    private Integer compField011;

    @JsonProperty("compField012")
    private LocalDate compField012;

    @JsonProperty("compField013")
    private LocalDate compField013;

    @JsonProperty("compField014")
    private Long compField014;

    @JsonProperty("compField015")
    private LocalDate compField015;

    @JsonProperty("compField016")
    private LocalDate compField016;

    @DecimalMin(value = "0.00")
    @JsonProperty("compField017")
    private BigDecimal compField017;

    @Size(max = 200)
    @JsonProperty("compField018")
    private String compField018;

    public ComplianceDto047() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final ComplianceDto047 instance = new ComplianceDto047();

        public Builder compField000(String val) { instance.compField000 = val; return this; }
        public Builder compField001(Long val) { instance.compField001 = val; return this; }
        public Builder compField002(Double val) { instance.compField002 = val; return this; }
        public Builder compField003(Integer val) { instance.compField003 = val; return this; }
        public Builder compField004(Long val) { instance.compField004 = val; return this; }
        public Builder compField005(BigDecimal val) { instance.compField005 = val; return this; }
        public Builder compField006(Boolean val) { instance.compField006 = val; return this; }
        public Builder compField007(Boolean val) { instance.compField007 = val; return this; }
        public Builder compField008(Long val) { instance.compField008 = val; return this; }
        public Builder compField009(Integer val) { instance.compField009 = val; return this; }
        public Builder compField010(Boolean val) { instance.compField010 = val; return this; }
        public Builder compField011(Integer val) { instance.compField011 = val; return this; }
        public Builder compField012(LocalDate val) { instance.compField012 = val; return this; }
        public Builder compField013(LocalDate val) { instance.compField013 = val; return this; }
        public Builder compField014(Long val) { instance.compField014 = val; return this; }
        public Builder compField015(LocalDate val) { instance.compField015 = val; return this; }
        public Builder compField016(LocalDate val) { instance.compField016 = val; return this; }
        public Builder compField017(BigDecimal val) { instance.compField017 = val; return this; }
        public Builder compField018(String val) { instance.compField018 = val; return this; }
        public ComplianceDto047 build() { return instance; }
    }

    public String getCompField000() { return compField000; }
    public void setCompField000(String compField000) { this.compField000 = compField000; }

    public Long getCompField001() { return compField001; }
    public void setCompField001(Long compField001) { this.compField001 = compField001; }

    public Double getCompField002() { return compField002; }
    public void setCompField002(Double compField002) { this.compField002 = compField002; }

    public Integer getCompField003() { return compField003; }
    public void setCompField003(Integer compField003) { this.compField003 = compField003; }

    public Long getCompField004() { return compField004; }
    public void setCompField004(Long compField004) { this.compField004 = compField004; }

    public BigDecimal getCompField005() { return compField005; }
    public void setCompField005(BigDecimal compField005) { this.compField005 = compField005; }

    public Boolean getCompField006() { return compField006; }
    public void setCompField006(Boolean compField006) { this.compField006 = compField006; }

    public Boolean getCompField007() { return compField007; }
    public void setCompField007(Boolean compField007) { this.compField007 = compField007; }

    public Long getCompField008() { return compField008; }
    public void setCompField008(Long compField008) { this.compField008 = compField008; }

    public Integer getCompField009() { return compField009; }
    public void setCompField009(Integer compField009) { this.compField009 = compField009; }

    public Boolean getCompField010() { return compField010; }
    public void setCompField010(Boolean compField010) { this.compField010 = compField010; }

    public Integer getCompField011() { return compField011; }
    public void setCompField011(Integer compField011) { this.compField011 = compField011; }

    public LocalDate getCompField012() { return compField012; }
    public void setCompField012(LocalDate compField012) { this.compField012 = compField012; }

    public LocalDate getCompField013() { return compField013; }
    public void setCompField013(LocalDate compField013) { this.compField013 = compField013; }

    public Long getCompField014() { return compField014; }
    public void setCompField014(Long compField014) { this.compField014 = compField014; }

    public LocalDate getCompField015() { return compField015; }
    public void setCompField015(LocalDate compField015) { this.compField015 = compField015; }

    public LocalDate getCompField016() { return compField016; }
    public void setCompField016(LocalDate compField016) { this.compField016 = compField016; }

    public BigDecimal getCompField017() { return compField017; }
    public void setCompField017(BigDecimal compField017) { this.compField017 = compField017; }

    public String getCompField018() { return compField018; }
    public void setCompField018(String compField018) { this.compField018 = compField018; }

    @Override
    public String toString() {
        return "ComplianceDto047{" +
            "compField000=" + compField000 + ", " +
            "compField001=" + compField001 + ", " +
            "compField002=" + compField002 + ", " +
            "compField003=" + compField003 + ", " +
            "compField004=" + compField004 + ", " +
            "}";
    }
}
