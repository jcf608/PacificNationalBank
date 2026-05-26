package com.pnb.compliance;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * ComplianceDto025 — Data Transfer Object for compliance operations.
 * Variant 25 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ComplianceDto025 {

    @JsonProperty("compField000")
    private LocalDate compField000;

    @JsonProperty("compField001")
    private Integer compField001;

    @JsonProperty("compField002")
    private Double compField002;

    @JsonProperty("compField003")
    private Long compField003;

    @Size(max = 100)
    @JsonProperty("compField004")
    private String compField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("compField005")
    private BigDecimal compField005;

    @Size(max = 20)
    @JsonProperty("compField006")
    private String compField006;

    @JsonProperty("compField007")
    private LocalDate compField007;

    @JsonProperty("compField008")
    private LocalDate compField008;

    public ComplianceDto025() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final ComplianceDto025 instance = new ComplianceDto025();

        public Builder compField000(LocalDate val) { instance.compField000 = val; return this; }
        public Builder compField001(Integer val) { instance.compField001 = val; return this; }
        public Builder compField002(Double val) { instance.compField002 = val; return this; }
        public Builder compField003(Long val) { instance.compField003 = val; return this; }
        public Builder compField004(String val) { instance.compField004 = val; return this; }
        public Builder compField005(BigDecimal val) { instance.compField005 = val; return this; }
        public Builder compField006(String val) { instance.compField006 = val; return this; }
        public Builder compField007(LocalDate val) { instance.compField007 = val; return this; }
        public Builder compField008(LocalDate val) { instance.compField008 = val; return this; }
        public ComplianceDto025 build() { return instance; }
    }

    public LocalDate getCompField000() { return compField000; }
    public void setCompField000(LocalDate compField000) { this.compField000 = compField000; }

    public Integer getCompField001() { return compField001; }
    public void setCompField001(Integer compField001) { this.compField001 = compField001; }

    public Double getCompField002() { return compField002; }
    public void setCompField002(Double compField002) { this.compField002 = compField002; }

    public Long getCompField003() { return compField003; }
    public void setCompField003(Long compField003) { this.compField003 = compField003; }

    public String getCompField004() { return compField004; }
    public void setCompField004(String compField004) { this.compField004 = compField004; }

    public BigDecimal getCompField005() { return compField005; }
    public void setCompField005(BigDecimal compField005) { this.compField005 = compField005; }

    public String getCompField006() { return compField006; }
    public void setCompField006(String compField006) { this.compField006 = compField006; }

    public LocalDate getCompField007() { return compField007; }
    public void setCompField007(LocalDate compField007) { this.compField007 = compField007; }

    public LocalDate getCompField008() { return compField008; }
    public void setCompField008(LocalDate compField008) { this.compField008 = compField008; }

    @Override
    public String toString() {
        return "ComplianceDto025{" +
            "compField000=" + compField000 + ", " +
            "compField001=" + compField001 + ", " +
            "compField002=" + compField002 + ", " +
            "compField003=" + compField003 + ", " +
            "compField004=" + compField004 + ", " +
            "}";
    }
}
