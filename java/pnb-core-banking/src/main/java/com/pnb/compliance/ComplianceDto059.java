package com.pnb.compliance;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * ComplianceDto059 — Data Transfer Object for compliance operations.
 * Variant 59 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ComplianceDto059 {

    @JsonProperty("compField000")
    private Long compField000;

    @JsonProperty("compField001")
    private Double compField001;

    @JsonProperty("compField002")
    private Boolean compField002;

    @JsonProperty("compField003")
    private Long compField003;

    @JsonProperty("compField004")
    private Integer compField004;

    @JsonProperty("compField005")
    private Long compField005;

    @Size(max = 100)
    @JsonProperty("compField006")
    private String compField006;

    @Size(max = 200)
    @JsonProperty("compField007")
    private String compField007;

    @JsonProperty("compField008")
    private Double compField008;

    @JsonProperty("compField009")
    private LocalDate compField009;

    @JsonProperty("compField010")
    private Integer compField010;

    @JsonProperty("compField011")
    private Double compField011;

    @JsonProperty("compField012")
    private Boolean compField012;

    @JsonProperty("compField013")
    private LocalDate compField013;

    @JsonProperty("compField014")
    private Double compField014;

    @JsonProperty("compField015")
    private Double compField015;

    @Size(max = 60)
    @JsonProperty("compField016")
    private String compField016;

    @JsonProperty("compField017")
    private Long compField017;

    @JsonProperty("compField018")
    private Long compField018;

    public ComplianceDto059() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final ComplianceDto059 instance = new ComplianceDto059();

        public Builder compField000(Long val) { instance.compField000 = val; return this; }
        public Builder compField001(Double val) { instance.compField001 = val; return this; }
        public Builder compField002(Boolean val) { instance.compField002 = val; return this; }
        public Builder compField003(Long val) { instance.compField003 = val; return this; }
        public Builder compField004(Integer val) { instance.compField004 = val; return this; }
        public Builder compField005(Long val) { instance.compField005 = val; return this; }
        public Builder compField006(String val) { instance.compField006 = val; return this; }
        public Builder compField007(String val) { instance.compField007 = val; return this; }
        public Builder compField008(Double val) { instance.compField008 = val; return this; }
        public Builder compField009(LocalDate val) { instance.compField009 = val; return this; }
        public Builder compField010(Integer val) { instance.compField010 = val; return this; }
        public Builder compField011(Double val) { instance.compField011 = val; return this; }
        public Builder compField012(Boolean val) { instance.compField012 = val; return this; }
        public Builder compField013(LocalDate val) { instance.compField013 = val; return this; }
        public Builder compField014(Double val) { instance.compField014 = val; return this; }
        public Builder compField015(Double val) { instance.compField015 = val; return this; }
        public Builder compField016(String val) { instance.compField016 = val; return this; }
        public Builder compField017(Long val) { instance.compField017 = val; return this; }
        public Builder compField018(Long val) { instance.compField018 = val; return this; }
        public ComplianceDto059 build() { return instance; }
    }

    public Long getCompField000() { return compField000; }
    public void setCompField000(Long compField000) { this.compField000 = compField000; }

    public Double getCompField001() { return compField001; }
    public void setCompField001(Double compField001) { this.compField001 = compField001; }

    public Boolean getCompField002() { return compField002; }
    public void setCompField002(Boolean compField002) { this.compField002 = compField002; }

    public Long getCompField003() { return compField003; }
    public void setCompField003(Long compField003) { this.compField003 = compField003; }

    public Integer getCompField004() { return compField004; }
    public void setCompField004(Integer compField004) { this.compField004 = compField004; }

    public Long getCompField005() { return compField005; }
    public void setCompField005(Long compField005) { this.compField005 = compField005; }

    public String getCompField006() { return compField006; }
    public void setCompField006(String compField006) { this.compField006 = compField006; }

    public String getCompField007() { return compField007; }
    public void setCompField007(String compField007) { this.compField007 = compField007; }

    public Double getCompField008() { return compField008; }
    public void setCompField008(Double compField008) { this.compField008 = compField008; }

    public LocalDate getCompField009() { return compField009; }
    public void setCompField009(LocalDate compField009) { this.compField009 = compField009; }

    public Integer getCompField010() { return compField010; }
    public void setCompField010(Integer compField010) { this.compField010 = compField010; }

    public Double getCompField011() { return compField011; }
    public void setCompField011(Double compField011) { this.compField011 = compField011; }

    public Boolean getCompField012() { return compField012; }
    public void setCompField012(Boolean compField012) { this.compField012 = compField012; }

    public LocalDate getCompField013() { return compField013; }
    public void setCompField013(LocalDate compField013) { this.compField013 = compField013; }

    public Double getCompField014() { return compField014; }
    public void setCompField014(Double compField014) { this.compField014 = compField014; }

    public Double getCompField015() { return compField015; }
    public void setCompField015(Double compField015) { this.compField015 = compField015; }

    public String getCompField016() { return compField016; }
    public void setCompField016(String compField016) { this.compField016 = compField016; }

    public Long getCompField017() { return compField017; }
    public void setCompField017(Long compField017) { this.compField017 = compField017; }

    public Long getCompField018() { return compField018; }
    public void setCompField018(Long compField018) { this.compField018 = compField018; }

    @Override
    public String toString() {
        return "ComplianceDto059{" +
            "compField000=" + compField000 + ", " +
            "compField001=" + compField001 + ", " +
            "compField002=" + compField002 + ", " +
            "compField003=" + compField003 + ", " +
            "compField004=" + compField004 + ", " +
            "}";
    }
}
