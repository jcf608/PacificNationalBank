package com.pnb.compliance;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * ComplianceDto058 — Data Transfer Object for compliance operations.
 * Variant 58 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ComplianceDto058 {

    @DecimalMin(value = "0.00")
    @JsonProperty("compField000")
    private BigDecimal compField000;

    @Size(max = 60)
    @JsonProperty("compField001")
    private String compField001;

    @JsonProperty("compField002")
    private LocalDate compField002;

    @JsonProperty("compField003")
    private LocalDate compField003;

    @JsonProperty("compField004")
    private Boolean compField004;

    @JsonProperty("compField005")
    private Long compField005;

    @JsonProperty("compField006")
    private Integer compField006;

    @JsonProperty("compField007")
    private Long compField007;

    @DecimalMin(value = "0.00")
    @JsonProperty("compField008")
    private BigDecimal compField008;

    @JsonProperty("compField009")
    private Integer compField009;

    @Size(max = 60)
    @JsonProperty("compField010")
    private String compField010;

    @JsonProperty("compField011")
    private Integer compField011;

    @JsonProperty("compField012")
    private Integer compField012;

    @JsonProperty("compField013")
    private Long compField013;

    @JsonProperty("compField014")
    private LocalDate compField014;

    @JsonProperty("compField015")
    private LocalDate compField015;

    @Size(max = 60)
    @JsonProperty("compField016")
    private String compField016;

    @Size(max = 40)
    @JsonProperty("compField017")
    private String compField017;

    public ComplianceDto058() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final ComplianceDto058 instance = new ComplianceDto058();

        public Builder compField000(BigDecimal val) { instance.compField000 = val; return this; }
        public Builder compField001(String val) { instance.compField001 = val; return this; }
        public Builder compField002(LocalDate val) { instance.compField002 = val; return this; }
        public Builder compField003(LocalDate val) { instance.compField003 = val; return this; }
        public Builder compField004(Boolean val) { instance.compField004 = val; return this; }
        public Builder compField005(Long val) { instance.compField005 = val; return this; }
        public Builder compField006(Integer val) { instance.compField006 = val; return this; }
        public Builder compField007(Long val) { instance.compField007 = val; return this; }
        public Builder compField008(BigDecimal val) { instance.compField008 = val; return this; }
        public Builder compField009(Integer val) { instance.compField009 = val; return this; }
        public Builder compField010(String val) { instance.compField010 = val; return this; }
        public Builder compField011(Integer val) { instance.compField011 = val; return this; }
        public Builder compField012(Integer val) { instance.compField012 = val; return this; }
        public Builder compField013(Long val) { instance.compField013 = val; return this; }
        public Builder compField014(LocalDate val) { instance.compField014 = val; return this; }
        public Builder compField015(LocalDate val) { instance.compField015 = val; return this; }
        public Builder compField016(String val) { instance.compField016 = val; return this; }
        public Builder compField017(String val) { instance.compField017 = val; return this; }
        public ComplianceDto058 build() { return instance; }
    }

    public BigDecimal getCompField000() { return compField000; }
    public void setCompField000(BigDecimal compField000) { this.compField000 = compField000; }

    public String getCompField001() { return compField001; }
    public void setCompField001(String compField001) { this.compField001 = compField001; }

    public LocalDate getCompField002() { return compField002; }
    public void setCompField002(LocalDate compField002) { this.compField002 = compField002; }

    public LocalDate getCompField003() { return compField003; }
    public void setCompField003(LocalDate compField003) { this.compField003 = compField003; }

    public Boolean getCompField004() { return compField004; }
    public void setCompField004(Boolean compField004) { this.compField004 = compField004; }

    public Long getCompField005() { return compField005; }
    public void setCompField005(Long compField005) { this.compField005 = compField005; }

    public Integer getCompField006() { return compField006; }
    public void setCompField006(Integer compField006) { this.compField006 = compField006; }

    public Long getCompField007() { return compField007; }
    public void setCompField007(Long compField007) { this.compField007 = compField007; }

    public BigDecimal getCompField008() { return compField008; }
    public void setCompField008(BigDecimal compField008) { this.compField008 = compField008; }

    public Integer getCompField009() { return compField009; }
    public void setCompField009(Integer compField009) { this.compField009 = compField009; }

    public String getCompField010() { return compField010; }
    public void setCompField010(String compField010) { this.compField010 = compField010; }

    public Integer getCompField011() { return compField011; }
    public void setCompField011(Integer compField011) { this.compField011 = compField011; }

    public Integer getCompField012() { return compField012; }
    public void setCompField012(Integer compField012) { this.compField012 = compField012; }

    public Long getCompField013() { return compField013; }
    public void setCompField013(Long compField013) { this.compField013 = compField013; }

    public LocalDate getCompField014() { return compField014; }
    public void setCompField014(LocalDate compField014) { this.compField014 = compField014; }

    public LocalDate getCompField015() { return compField015; }
    public void setCompField015(LocalDate compField015) { this.compField015 = compField015; }

    public String getCompField016() { return compField016; }
    public void setCompField016(String compField016) { this.compField016 = compField016; }

    public String getCompField017() { return compField017; }
    public void setCompField017(String compField017) { this.compField017 = compField017; }

    @Override
    public String toString() {
        return "ComplianceDto058{" +
            "compField000=" + compField000 + ", " +
            "compField001=" + compField001 + ", " +
            "compField002=" + compField002 + ", " +
            "compField003=" + compField003 + ", " +
            "compField004=" + compField004 + ", " +
            "}";
    }
}
