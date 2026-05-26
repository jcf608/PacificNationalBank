package com.pnb.compliance;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * ComplianceDto036 — Data Transfer Object for compliance operations.
 * Variant 36 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ComplianceDto036 {

    @JsonProperty("compField000")
    private Integer compField000;

    @JsonProperty("compField001")
    private Boolean compField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("compField002")
    private BigDecimal compField002;

    @JsonProperty("compField003")
    private Double compField003;

    @JsonProperty("compField004")
    private Double compField004;

    @JsonProperty("compField005")
    private Boolean compField005;

    @JsonProperty("compField006")
    private Integer compField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("compField007")
    private BigDecimal compField007;

    public ComplianceDto036() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final ComplianceDto036 instance = new ComplianceDto036();

        public Builder compField000(Integer val) { instance.compField000 = val; return this; }
        public Builder compField001(Boolean val) { instance.compField001 = val; return this; }
        public Builder compField002(BigDecimal val) { instance.compField002 = val; return this; }
        public Builder compField003(Double val) { instance.compField003 = val; return this; }
        public Builder compField004(Double val) { instance.compField004 = val; return this; }
        public Builder compField005(Boolean val) { instance.compField005 = val; return this; }
        public Builder compField006(Integer val) { instance.compField006 = val; return this; }
        public Builder compField007(BigDecimal val) { instance.compField007 = val; return this; }
        public ComplianceDto036 build() { return instance; }
    }

    public Integer getCompField000() { return compField000; }
    public void setCompField000(Integer compField000) { this.compField000 = compField000; }

    public Boolean getCompField001() { return compField001; }
    public void setCompField001(Boolean compField001) { this.compField001 = compField001; }

    public BigDecimal getCompField002() { return compField002; }
    public void setCompField002(BigDecimal compField002) { this.compField002 = compField002; }

    public Double getCompField003() { return compField003; }
    public void setCompField003(Double compField003) { this.compField003 = compField003; }

    public Double getCompField004() { return compField004; }
    public void setCompField004(Double compField004) { this.compField004 = compField004; }

    public Boolean getCompField005() { return compField005; }
    public void setCompField005(Boolean compField005) { this.compField005 = compField005; }

    public Integer getCompField006() { return compField006; }
    public void setCompField006(Integer compField006) { this.compField006 = compField006; }

    public BigDecimal getCompField007() { return compField007; }
    public void setCompField007(BigDecimal compField007) { this.compField007 = compField007; }

    @Override
    public String toString() {
        return "ComplianceDto036{" +
            "compField000=" + compField000 + ", " +
            "compField001=" + compField001 + ", " +
            "compField002=" + compField002 + ", " +
            "compField003=" + compField003 + ", " +
            "compField004=" + compField004 + ", " +
            "}";
    }
}
