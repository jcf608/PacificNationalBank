package com.pnb.compliance;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * ComplianceDto038 — Data Transfer Object for compliance operations.
 * Variant 38 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ComplianceDto038 {

    @Size(max = 20)
    @JsonProperty("compField000")
    private String compField000;

    @JsonProperty("compField001")
    private Boolean compField001;

    @JsonProperty("compField002")
    private LocalDate compField002;

    @DecimalMin(value = "0.00")
    @JsonProperty("compField003")
    private BigDecimal compField003;

    @JsonProperty("compField004")
    private Boolean compField004;

    @JsonProperty("compField005")
    private LocalDate compField005;

    @JsonProperty("compField006")
    private LocalDate compField006;

    @JsonProperty("compField007")
    private Long compField007;

    @JsonProperty("compField008")
    private Double compField008;

    @JsonProperty("compField009")
    private Integer compField009;

    public ComplianceDto038() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final ComplianceDto038 instance = new ComplianceDto038();

        public Builder compField000(String val) { instance.compField000 = val; return this; }
        public Builder compField001(Boolean val) { instance.compField001 = val; return this; }
        public Builder compField002(LocalDate val) { instance.compField002 = val; return this; }
        public Builder compField003(BigDecimal val) { instance.compField003 = val; return this; }
        public Builder compField004(Boolean val) { instance.compField004 = val; return this; }
        public Builder compField005(LocalDate val) { instance.compField005 = val; return this; }
        public Builder compField006(LocalDate val) { instance.compField006 = val; return this; }
        public Builder compField007(Long val) { instance.compField007 = val; return this; }
        public Builder compField008(Double val) { instance.compField008 = val; return this; }
        public Builder compField009(Integer val) { instance.compField009 = val; return this; }
        public ComplianceDto038 build() { return instance; }
    }

    public String getCompField000() { return compField000; }
    public void setCompField000(String compField000) { this.compField000 = compField000; }

    public Boolean getCompField001() { return compField001; }
    public void setCompField001(Boolean compField001) { this.compField001 = compField001; }

    public LocalDate getCompField002() { return compField002; }
    public void setCompField002(LocalDate compField002) { this.compField002 = compField002; }

    public BigDecimal getCompField003() { return compField003; }
    public void setCompField003(BigDecimal compField003) { this.compField003 = compField003; }

    public Boolean getCompField004() { return compField004; }
    public void setCompField004(Boolean compField004) { this.compField004 = compField004; }

    public LocalDate getCompField005() { return compField005; }
    public void setCompField005(LocalDate compField005) { this.compField005 = compField005; }

    public LocalDate getCompField006() { return compField006; }
    public void setCompField006(LocalDate compField006) { this.compField006 = compField006; }

    public Long getCompField007() { return compField007; }
    public void setCompField007(Long compField007) { this.compField007 = compField007; }

    public Double getCompField008() { return compField008; }
    public void setCompField008(Double compField008) { this.compField008 = compField008; }

    public Integer getCompField009() { return compField009; }
    public void setCompField009(Integer compField009) { this.compField009 = compField009; }

    @Override
    public String toString() {
        return "ComplianceDto038{" +
            "compField000=" + compField000 + ", " +
            "compField001=" + compField001 + ", " +
            "compField002=" + compField002 + ", " +
            "compField003=" + compField003 + ", " +
            "compField004=" + compField004 + ", " +
            "}";
    }
}
