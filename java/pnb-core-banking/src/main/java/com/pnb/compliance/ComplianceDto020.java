package com.pnb.compliance;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * ComplianceDto020 — Data Transfer Object for compliance operations.
 * Variant 20 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ComplianceDto020 {

    @JsonProperty("compField000")
    private Double compField000;

    @JsonProperty("compField001")
    private Integer compField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("compField002")
    private BigDecimal compField002;

    @JsonProperty("compField003")
    private Integer compField003;

    @JsonProperty("compField004")
    private Boolean compField004;

    @JsonProperty("compField005")
    private Boolean compField005;

    @JsonProperty("compField006")
    private Double compField006;

    @JsonProperty("compField007")
    private Long compField007;

    @JsonProperty("compField008")
    private Double compField008;

    @JsonProperty("compField009")
    private Boolean compField009;

    @JsonProperty("compField010")
    private Long compField010;

    @JsonProperty("compField011")
    private Integer compField011;

    @JsonProperty("compField012")
    private Double compField012;

    @JsonProperty("compField013")
    private Boolean compField013;

    @Size(max = 100)
    @JsonProperty("compField014")
    private String compField014;

    @JsonProperty("compField015")
    private Boolean compField015;

    public ComplianceDto020() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final ComplianceDto020 instance = new ComplianceDto020();

        public Builder compField000(Double val) { instance.compField000 = val; return this; }
        public Builder compField001(Integer val) { instance.compField001 = val; return this; }
        public Builder compField002(BigDecimal val) { instance.compField002 = val; return this; }
        public Builder compField003(Integer val) { instance.compField003 = val; return this; }
        public Builder compField004(Boolean val) { instance.compField004 = val; return this; }
        public Builder compField005(Boolean val) { instance.compField005 = val; return this; }
        public Builder compField006(Double val) { instance.compField006 = val; return this; }
        public Builder compField007(Long val) { instance.compField007 = val; return this; }
        public Builder compField008(Double val) { instance.compField008 = val; return this; }
        public Builder compField009(Boolean val) { instance.compField009 = val; return this; }
        public Builder compField010(Long val) { instance.compField010 = val; return this; }
        public Builder compField011(Integer val) { instance.compField011 = val; return this; }
        public Builder compField012(Double val) { instance.compField012 = val; return this; }
        public Builder compField013(Boolean val) { instance.compField013 = val; return this; }
        public Builder compField014(String val) { instance.compField014 = val; return this; }
        public Builder compField015(Boolean val) { instance.compField015 = val; return this; }
        public ComplianceDto020 build() { return instance; }
    }

    public Double getCompField000() { return compField000; }
    public void setCompField000(Double compField000) { this.compField000 = compField000; }

    public Integer getCompField001() { return compField001; }
    public void setCompField001(Integer compField001) { this.compField001 = compField001; }

    public BigDecimal getCompField002() { return compField002; }
    public void setCompField002(BigDecimal compField002) { this.compField002 = compField002; }

    public Integer getCompField003() { return compField003; }
    public void setCompField003(Integer compField003) { this.compField003 = compField003; }

    public Boolean getCompField004() { return compField004; }
    public void setCompField004(Boolean compField004) { this.compField004 = compField004; }

    public Boolean getCompField005() { return compField005; }
    public void setCompField005(Boolean compField005) { this.compField005 = compField005; }

    public Double getCompField006() { return compField006; }
    public void setCompField006(Double compField006) { this.compField006 = compField006; }

    public Long getCompField007() { return compField007; }
    public void setCompField007(Long compField007) { this.compField007 = compField007; }

    public Double getCompField008() { return compField008; }
    public void setCompField008(Double compField008) { this.compField008 = compField008; }

    public Boolean getCompField009() { return compField009; }
    public void setCompField009(Boolean compField009) { this.compField009 = compField009; }

    public Long getCompField010() { return compField010; }
    public void setCompField010(Long compField010) { this.compField010 = compField010; }

    public Integer getCompField011() { return compField011; }
    public void setCompField011(Integer compField011) { this.compField011 = compField011; }

    public Double getCompField012() { return compField012; }
    public void setCompField012(Double compField012) { this.compField012 = compField012; }

    public Boolean getCompField013() { return compField013; }
    public void setCompField013(Boolean compField013) { this.compField013 = compField013; }

    public String getCompField014() { return compField014; }
    public void setCompField014(String compField014) { this.compField014 = compField014; }

    public Boolean getCompField015() { return compField015; }
    public void setCompField015(Boolean compField015) { this.compField015 = compField015; }

    @Override
    public String toString() {
        return "ComplianceDto020{" +
            "compField000=" + compField000 + ", " +
            "compField001=" + compField001 + ", " +
            "compField002=" + compField002 + ", " +
            "compField003=" + compField003 + ", " +
            "compField004=" + compField004 + ", " +
            "}";
    }
}
