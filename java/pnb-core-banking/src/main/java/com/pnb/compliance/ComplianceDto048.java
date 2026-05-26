package com.pnb.compliance;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * ComplianceDto048 — Data Transfer Object for compliance operations.
 * Variant 48 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ComplianceDto048 {

    @JsonProperty("compField000")
    private Long compField000;

    @JsonProperty("compField001")
    private Long compField001;

    @JsonProperty("compField002")
    private Boolean compField002;

    @Size(max = 20)
    @JsonProperty("compField003")
    private String compField003;

    @DecimalMin(value = "0.00")
    @JsonProperty("compField004")
    private BigDecimal compField004;

    @JsonProperty("compField005")
    private Double compField005;

    @JsonProperty("compField006")
    private Integer compField006;

    @JsonProperty("compField007")
    private Boolean compField007;

    public ComplianceDto048() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final ComplianceDto048 instance = new ComplianceDto048();

        public Builder compField000(Long val) { instance.compField000 = val; return this; }
        public Builder compField001(Long val) { instance.compField001 = val; return this; }
        public Builder compField002(Boolean val) { instance.compField002 = val; return this; }
        public Builder compField003(String val) { instance.compField003 = val; return this; }
        public Builder compField004(BigDecimal val) { instance.compField004 = val; return this; }
        public Builder compField005(Double val) { instance.compField005 = val; return this; }
        public Builder compField006(Integer val) { instance.compField006 = val; return this; }
        public Builder compField007(Boolean val) { instance.compField007 = val; return this; }
        public ComplianceDto048 build() { return instance; }
    }

    public Long getCompField000() { return compField000; }
    public void setCompField000(Long compField000) { this.compField000 = compField000; }

    public Long getCompField001() { return compField001; }
    public void setCompField001(Long compField001) { this.compField001 = compField001; }

    public Boolean getCompField002() { return compField002; }
    public void setCompField002(Boolean compField002) { this.compField002 = compField002; }

    public String getCompField003() { return compField003; }
    public void setCompField003(String compField003) { this.compField003 = compField003; }

    public BigDecimal getCompField004() { return compField004; }
    public void setCompField004(BigDecimal compField004) { this.compField004 = compField004; }

    public Double getCompField005() { return compField005; }
    public void setCompField005(Double compField005) { this.compField005 = compField005; }

    public Integer getCompField006() { return compField006; }
    public void setCompField006(Integer compField006) { this.compField006 = compField006; }

    public Boolean getCompField007() { return compField007; }
    public void setCompField007(Boolean compField007) { this.compField007 = compField007; }

    @Override
    public String toString() {
        return "ComplianceDto048{" +
            "compField000=" + compField000 + ", " +
            "compField001=" + compField001 + ", " +
            "compField002=" + compField002 + ", " +
            "compField003=" + compField003 + ", " +
            "compField004=" + compField004 + ", " +
            "}";
    }
}
