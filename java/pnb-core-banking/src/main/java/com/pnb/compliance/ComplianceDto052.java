package com.pnb.compliance;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * ComplianceDto052 — Data Transfer Object for compliance operations.
 * Variant 52 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ComplianceDto052 {

    @JsonProperty("compField000")
    private Double compField000;

    @JsonProperty("compField001")
    private LocalDate compField001;

    @JsonProperty("compField002")
    private Boolean compField002;

    @JsonProperty("compField003")
    private Integer compField003;

    @JsonProperty("compField004")
    private LocalDate compField004;

    @JsonProperty("compField005")
    private Double compField005;

    @JsonProperty("compField006")
    private Boolean compField006;

    @Size(max = 20)
    @JsonProperty("compField007")
    private String compField007;

    @JsonProperty("compField008")
    private LocalDate compField008;

    @JsonProperty("compField009")
    private Boolean compField009;

    @Size(max = 200)
    @JsonProperty("compField010")
    private String compField010;

    @DecimalMin(value = "0.00")
    @JsonProperty("compField011")
    private BigDecimal compField011;

    public ComplianceDto052() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final ComplianceDto052 instance = new ComplianceDto052();

        public Builder compField000(Double val) { instance.compField000 = val; return this; }
        public Builder compField001(LocalDate val) { instance.compField001 = val; return this; }
        public Builder compField002(Boolean val) { instance.compField002 = val; return this; }
        public Builder compField003(Integer val) { instance.compField003 = val; return this; }
        public Builder compField004(LocalDate val) { instance.compField004 = val; return this; }
        public Builder compField005(Double val) { instance.compField005 = val; return this; }
        public Builder compField006(Boolean val) { instance.compField006 = val; return this; }
        public Builder compField007(String val) { instance.compField007 = val; return this; }
        public Builder compField008(LocalDate val) { instance.compField008 = val; return this; }
        public Builder compField009(Boolean val) { instance.compField009 = val; return this; }
        public Builder compField010(String val) { instance.compField010 = val; return this; }
        public Builder compField011(BigDecimal val) { instance.compField011 = val; return this; }
        public ComplianceDto052 build() { return instance; }
    }

    public Double getCompField000() { return compField000; }
    public void setCompField000(Double compField000) { this.compField000 = compField000; }

    public LocalDate getCompField001() { return compField001; }
    public void setCompField001(LocalDate compField001) { this.compField001 = compField001; }

    public Boolean getCompField002() { return compField002; }
    public void setCompField002(Boolean compField002) { this.compField002 = compField002; }

    public Integer getCompField003() { return compField003; }
    public void setCompField003(Integer compField003) { this.compField003 = compField003; }

    public LocalDate getCompField004() { return compField004; }
    public void setCompField004(LocalDate compField004) { this.compField004 = compField004; }

    public Double getCompField005() { return compField005; }
    public void setCompField005(Double compField005) { this.compField005 = compField005; }

    public Boolean getCompField006() { return compField006; }
    public void setCompField006(Boolean compField006) { this.compField006 = compField006; }

    public String getCompField007() { return compField007; }
    public void setCompField007(String compField007) { this.compField007 = compField007; }

    public LocalDate getCompField008() { return compField008; }
    public void setCompField008(LocalDate compField008) { this.compField008 = compField008; }

    public Boolean getCompField009() { return compField009; }
    public void setCompField009(Boolean compField009) { this.compField009 = compField009; }

    public String getCompField010() { return compField010; }
    public void setCompField010(String compField010) { this.compField010 = compField010; }

    public BigDecimal getCompField011() { return compField011; }
    public void setCompField011(BigDecimal compField011) { this.compField011 = compField011; }

    @Override
    public String toString() {
        return "ComplianceDto052{" +
            "compField000=" + compField000 + ", " +
            "compField001=" + compField001 + ", " +
            "compField002=" + compField002 + ", " +
            "compField003=" + compField003 + ", " +
            "compField004=" + compField004 + ", " +
            "}";
    }
}
