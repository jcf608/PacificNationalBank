package com.pnb.compliance;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * ComplianceDto027 — Data Transfer Object for compliance operations.
 * Variant 27 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ComplianceDto027 {

    @JsonProperty("compField000")
    private Integer compField000;

    @JsonProperty("compField001")
    private Double compField001;

    @JsonProperty("compField002")
    private Boolean compField002;

    @DecimalMin(value = "0.00")
    @JsonProperty("compField003")
    private BigDecimal compField003;

    @JsonProperty("compField004")
    private LocalDate compField004;

    @JsonProperty("compField005")
    private Long compField005;

    @JsonProperty("compField006")
    private LocalDate compField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("compField007")
    private BigDecimal compField007;

    @JsonProperty("compField008")
    private Double compField008;

    @JsonProperty("compField009")
    private Double compField009;

    @JsonProperty("compField010")
    private LocalDate compField010;

    public ComplianceDto027() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final ComplianceDto027 instance = new ComplianceDto027();

        public Builder compField000(Integer val) { instance.compField000 = val; return this; }
        public Builder compField001(Double val) { instance.compField001 = val; return this; }
        public Builder compField002(Boolean val) { instance.compField002 = val; return this; }
        public Builder compField003(BigDecimal val) { instance.compField003 = val; return this; }
        public Builder compField004(LocalDate val) { instance.compField004 = val; return this; }
        public Builder compField005(Long val) { instance.compField005 = val; return this; }
        public Builder compField006(LocalDate val) { instance.compField006 = val; return this; }
        public Builder compField007(BigDecimal val) { instance.compField007 = val; return this; }
        public Builder compField008(Double val) { instance.compField008 = val; return this; }
        public Builder compField009(Double val) { instance.compField009 = val; return this; }
        public Builder compField010(LocalDate val) { instance.compField010 = val; return this; }
        public ComplianceDto027 build() { return instance; }
    }

    public Integer getCompField000() { return compField000; }
    public void setCompField000(Integer compField000) { this.compField000 = compField000; }

    public Double getCompField001() { return compField001; }
    public void setCompField001(Double compField001) { this.compField001 = compField001; }

    public Boolean getCompField002() { return compField002; }
    public void setCompField002(Boolean compField002) { this.compField002 = compField002; }

    public BigDecimal getCompField003() { return compField003; }
    public void setCompField003(BigDecimal compField003) { this.compField003 = compField003; }

    public LocalDate getCompField004() { return compField004; }
    public void setCompField004(LocalDate compField004) { this.compField004 = compField004; }

    public Long getCompField005() { return compField005; }
    public void setCompField005(Long compField005) { this.compField005 = compField005; }

    public LocalDate getCompField006() { return compField006; }
    public void setCompField006(LocalDate compField006) { this.compField006 = compField006; }

    public BigDecimal getCompField007() { return compField007; }
    public void setCompField007(BigDecimal compField007) { this.compField007 = compField007; }

    public Double getCompField008() { return compField008; }
    public void setCompField008(Double compField008) { this.compField008 = compField008; }

    public Double getCompField009() { return compField009; }
    public void setCompField009(Double compField009) { this.compField009 = compField009; }

    public LocalDate getCompField010() { return compField010; }
    public void setCompField010(LocalDate compField010) { this.compField010 = compField010; }

    @Override
    public String toString() {
        return "ComplianceDto027{" +
            "compField000=" + compField000 + ", " +
            "compField001=" + compField001 + ", " +
            "compField002=" + compField002 + ", " +
            "compField003=" + compField003 + ", " +
            "compField004=" + compField004 + ", " +
            "}";
    }
}
