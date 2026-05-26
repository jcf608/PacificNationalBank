package com.pnb.compliance;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * ComplianceDto045 — Data Transfer Object for compliance operations.
 * Variant 45 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ComplianceDto045 {

    @JsonProperty("compField000")
    private Long compField000;

    @DecimalMin(value = "0.00")
    @JsonProperty("compField001")
    private BigDecimal compField001;

    @Size(max = 20)
    @JsonProperty("compField002")
    private String compField002;

    @JsonProperty("compField003")
    private Boolean compField003;

    @JsonProperty("compField004")
    private Double compField004;

    @JsonProperty("compField005")
    private Boolean compField005;

    @Size(max = 20)
    @JsonProperty("compField006")
    private String compField006;

    @Size(max = 200)
    @JsonProperty("compField007")
    private String compField007;

    @JsonProperty("compField008")
    private Boolean compField008;

    @JsonProperty("compField009")
    private Double compField009;

    @JsonProperty("compField010")
    private Integer compField010;

    @JsonProperty("compField011")
    private Double compField011;

    @JsonProperty("compField012")
    private LocalDate compField012;

    @JsonProperty("compField013")
    private Double compField013;

    @JsonProperty("compField014")
    private Boolean compField014;

    @JsonProperty("compField015")
    private Long compField015;

    @JsonProperty("compField016")
    private Long compField016;

    public ComplianceDto045() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final ComplianceDto045 instance = new ComplianceDto045();

        public Builder compField000(Long val) { instance.compField000 = val; return this; }
        public Builder compField001(BigDecimal val) { instance.compField001 = val; return this; }
        public Builder compField002(String val) { instance.compField002 = val; return this; }
        public Builder compField003(Boolean val) { instance.compField003 = val; return this; }
        public Builder compField004(Double val) { instance.compField004 = val; return this; }
        public Builder compField005(Boolean val) { instance.compField005 = val; return this; }
        public Builder compField006(String val) { instance.compField006 = val; return this; }
        public Builder compField007(String val) { instance.compField007 = val; return this; }
        public Builder compField008(Boolean val) { instance.compField008 = val; return this; }
        public Builder compField009(Double val) { instance.compField009 = val; return this; }
        public Builder compField010(Integer val) { instance.compField010 = val; return this; }
        public Builder compField011(Double val) { instance.compField011 = val; return this; }
        public Builder compField012(LocalDate val) { instance.compField012 = val; return this; }
        public Builder compField013(Double val) { instance.compField013 = val; return this; }
        public Builder compField014(Boolean val) { instance.compField014 = val; return this; }
        public Builder compField015(Long val) { instance.compField015 = val; return this; }
        public Builder compField016(Long val) { instance.compField016 = val; return this; }
        public ComplianceDto045 build() { return instance; }
    }

    public Long getCompField000() { return compField000; }
    public void setCompField000(Long compField000) { this.compField000 = compField000; }

    public BigDecimal getCompField001() { return compField001; }
    public void setCompField001(BigDecimal compField001) { this.compField001 = compField001; }

    public String getCompField002() { return compField002; }
    public void setCompField002(String compField002) { this.compField002 = compField002; }

    public Boolean getCompField003() { return compField003; }
    public void setCompField003(Boolean compField003) { this.compField003 = compField003; }

    public Double getCompField004() { return compField004; }
    public void setCompField004(Double compField004) { this.compField004 = compField004; }

    public Boolean getCompField005() { return compField005; }
    public void setCompField005(Boolean compField005) { this.compField005 = compField005; }

    public String getCompField006() { return compField006; }
    public void setCompField006(String compField006) { this.compField006 = compField006; }

    public String getCompField007() { return compField007; }
    public void setCompField007(String compField007) { this.compField007 = compField007; }

    public Boolean getCompField008() { return compField008; }
    public void setCompField008(Boolean compField008) { this.compField008 = compField008; }

    public Double getCompField009() { return compField009; }
    public void setCompField009(Double compField009) { this.compField009 = compField009; }

    public Integer getCompField010() { return compField010; }
    public void setCompField010(Integer compField010) { this.compField010 = compField010; }

    public Double getCompField011() { return compField011; }
    public void setCompField011(Double compField011) { this.compField011 = compField011; }

    public LocalDate getCompField012() { return compField012; }
    public void setCompField012(LocalDate compField012) { this.compField012 = compField012; }

    public Double getCompField013() { return compField013; }
    public void setCompField013(Double compField013) { this.compField013 = compField013; }

    public Boolean getCompField014() { return compField014; }
    public void setCompField014(Boolean compField014) { this.compField014 = compField014; }

    public Long getCompField015() { return compField015; }
    public void setCompField015(Long compField015) { this.compField015 = compField015; }

    public Long getCompField016() { return compField016; }
    public void setCompField016(Long compField016) { this.compField016 = compField016; }

    @Override
    public String toString() {
        return "ComplianceDto045{" +
            "compField000=" + compField000 + ", " +
            "compField001=" + compField001 + ", " +
            "compField002=" + compField002 + ", " +
            "compField003=" + compField003 + ", " +
            "compField004=" + compField004 + ", " +
            "}";
    }
}
