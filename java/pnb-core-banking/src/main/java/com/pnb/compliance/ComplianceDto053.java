package com.pnb.compliance;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * ComplianceDto053 — Data Transfer Object for compliance operations.
 * Variant 53 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ComplianceDto053 {

    @Size(max = 60)
    @JsonProperty("compField000")
    private String compField000;

    @DecimalMin(value = "0.00")
    @JsonProperty("compField001")
    private BigDecimal compField001;

    @JsonProperty("compField002")
    private Double compField002;

    @JsonProperty("compField003")
    private Double compField003;

    @JsonProperty("compField004")
    private LocalDate compField004;

    @JsonProperty("compField005")
    private Double compField005;

    @JsonProperty("compField006")
    private Double compField006;

    @JsonProperty("compField007")
    private LocalDate compField007;

    @JsonProperty("compField008")
    private LocalDate compField008;

    @JsonProperty("compField009")
    private Boolean compField009;

    @JsonProperty("compField010")
    private LocalDate compField010;

    @JsonProperty("compField011")
    private Double compField011;

    @JsonProperty("compField012")
    private LocalDate compField012;

    public ComplianceDto053() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final ComplianceDto053 instance = new ComplianceDto053();

        public Builder compField000(String val) { instance.compField000 = val; return this; }
        public Builder compField001(BigDecimal val) { instance.compField001 = val; return this; }
        public Builder compField002(Double val) { instance.compField002 = val; return this; }
        public Builder compField003(Double val) { instance.compField003 = val; return this; }
        public Builder compField004(LocalDate val) { instance.compField004 = val; return this; }
        public Builder compField005(Double val) { instance.compField005 = val; return this; }
        public Builder compField006(Double val) { instance.compField006 = val; return this; }
        public Builder compField007(LocalDate val) { instance.compField007 = val; return this; }
        public Builder compField008(LocalDate val) { instance.compField008 = val; return this; }
        public Builder compField009(Boolean val) { instance.compField009 = val; return this; }
        public Builder compField010(LocalDate val) { instance.compField010 = val; return this; }
        public Builder compField011(Double val) { instance.compField011 = val; return this; }
        public Builder compField012(LocalDate val) { instance.compField012 = val; return this; }
        public ComplianceDto053 build() { return instance; }
    }

    public String getCompField000() { return compField000; }
    public void setCompField000(String compField000) { this.compField000 = compField000; }

    public BigDecimal getCompField001() { return compField001; }
    public void setCompField001(BigDecimal compField001) { this.compField001 = compField001; }

    public Double getCompField002() { return compField002; }
    public void setCompField002(Double compField002) { this.compField002 = compField002; }

    public Double getCompField003() { return compField003; }
    public void setCompField003(Double compField003) { this.compField003 = compField003; }

    public LocalDate getCompField004() { return compField004; }
    public void setCompField004(LocalDate compField004) { this.compField004 = compField004; }

    public Double getCompField005() { return compField005; }
    public void setCompField005(Double compField005) { this.compField005 = compField005; }

    public Double getCompField006() { return compField006; }
    public void setCompField006(Double compField006) { this.compField006 = compField006; }

    public LocalDate getCompField007() { return compField007; }
    public void setCompField007(LocalDate compField007) { this.compField007 = compField007; }

    public LocalDate getCompField008() { return compField008; }
    public void setCompField008(LocalDate compField008) { this.compField008 = compField008; }

    public Boolean getCompField009() { return compField009; }
    public void setCompField009(Boolean compField009) { this.compField009 = compField009; }

    public LocalDate getCompField010() { return compField010; }
    public void setCompField010(LocalDate compField010) { this.compField010 = compField010; }

    public Double getCompField011() { return compField011; }
    public void setCompField011(Double compField011) { this.compField011 = compField011; }

    public LocalDate getCompField012() { return compField012; }
    public void setCompField012(LocalDate compField012) { this.compField012 = compField012; }

    @Override
    public String toString() {
        return "ComplianceDto053{" +
            "compField000=" + compField000 + ", " +
            "compField001=" + compField001 + ", " +
            "compField002=" + compField002 + ", " +
            "compField003=" + compField003 + ", " +
            "compField004=" + compField004 + ", " +
            "}";
    }
}
