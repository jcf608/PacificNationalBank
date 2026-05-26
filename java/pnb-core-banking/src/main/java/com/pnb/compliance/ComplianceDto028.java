package com.pnb.compliance;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * ComplianceDto028 — Data Transfer Object for compliance operations.
 * Variant 28 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ComplianceDto028 {

    @DecimalMin(value = "0.00")
    @JsonProperty("compField000")
    private BigDecimal compField000;

    @DecimalMin(value = "0.00")
    @JsonProperty("compField001")
    private BigDecimal compField001;

    @JsonProperty("compField002")
    private Double compField002;

    @DecimalMin(value = "0.00")
    @JsonProperty("compField003")
    private BigDecimal compField003;

    @JsonProperty("compField004")
    private Boolean compField004;

    @JsonProperty("compField005")
    private Double compField005;

    @JsonProperty("compField006")
    private Integer compField006;

    @JsonProperty("compField007")
    private Boolean compField007;

    @Size(max = 200)
    @JsonProperty("compField008")
    private String compField008;

    @DecimalMin(value = "0.00")
    @JsonProperty("compField009")
    private BigDecimal compField009;

    @JsonProperty("compField010")
    private Integer compField010;

    @DecimalMin(value = "0.00")
    @JsonProperty("compField011")
    private BigDecimal compField011;

    public ComplianceDto028() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final ComplianceDto028 instance = new ComplianceDto028();

        public Builder compField000(BigDecimal val) { instance.compField000 = val; return this; }
        public Builder compField001(BigDecimal val) { instance.compField001 = val; return this; }
        public Builder compField002(Double val) { instance.compField002 = val; return this; }
        public Builder compField003(BigDecimal val) { instance.compField003 = val; return this; }
        public Builder compField004(Boolean val) { instance.compField004 = val; return this; }
        public Builder compField005(Double val) { instance.compField005 = val; return this; }
        public Builder compField006(Integer val) { instance.compField006 = val; return this; }
        public Builder compField007(Boolean val) { instance.compField007 = val; return this; }
        public Builder compField008(String val) { instance.compField008 = val; return this; }
        public Builder compField009(BigDecimal val) { instance.compField009 = val; return this; }
        public Builder compField010(Integer val) { instance.compField010 = val; return this; }
        public Builder compField011(BigDecimal val) { instance.compField011 = val; return this; }
        public ComplianceDto028 build() { return instance; }
    }

    public BigDecimal getCompField000() { return compField000; }
    public void setCompField000(BigDecimal compField000) { this.compField000 = compField000; }

    public BigDecimal getCompField001() { return compField001; }
    public void setCompField001(BigDecimal compField001) { this.compField001 = compField001; }

    public Double getCompField002() { return compField002; }
    public void setCompField002(Double compField002) { this.compField002 = compField002; }

    public BigDecimal getCompField003() { return compField003; }
    public void setCompField003(BigDecimal compField003) { this.compField003 = compField003; }

    public Boolean getCompField004() { return compField004; }
    public void setCompField004(Boolean compField004) { this.compField004 = compField004; }

    public Double getCompField005() { return compField005; }
    public void setCompField005(Double compField005) { this.compField005 = compField005; }

    public Integer getCompField006() { return compField006; }
    public void setCompField006(Integer compField006) { this.compField006 = compField006; }

    public Boolean getCompField007() { return compField007; }
    public void setCompField007(Boolean compField007) { this.compField007 = compField007; }

    public String getCompField008() { return compField008; }
    public void setCompField008(String compField008) { this.compField008 = compField008; }

    public BigDecimal getCompField009() { return compField009; }
    public void setCompField009(BigDecimal compField009) { this.compField009 = compField009; }

    public Integer getCompField010() { return compField010; }
    public void setCompField010(Integer compField010) { this.compField010 = compField010; }

    public BigDecimal getCompField011() { return compField011; }
    public void setCompField011(BigDecimal compField011) { this.compField011 = compField011; }

    @Override
    public String toString() {
        return "ComplianceDto028{" +
            "compField000=" + compField000 + ", " +
            "compField001=" + compField001 + ", " +
            "compField002=" + compField002 + ", " +
            "compField003=" + compField003 + ", " +
            "compField004=" + compField004 + ", " +
            "}";
    }
}
