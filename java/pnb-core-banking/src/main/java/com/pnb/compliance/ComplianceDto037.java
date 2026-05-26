package com.pnb.compliance;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * ComplianceDto037 — Data Transfer Object for compliance operations.
 * Variant 37 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ComplianceDto037 {

    @JsonProperty("compField000")
    private Integer compField000;

    @JsonProperty("compField001")
    private LocalDate compField001;

    @JsonProperty("compField002")
    private Double compField002;

    @JsonProperty("compField003")
    private Double compField003;

    @JsonProperty("compField004")
    private Integer compField004;

    @JsonProperty("compField005")
    private Integer compField005;

    @JsonProperty("compField006")
    private Boolean compField006;

    @JsonProperty("compField007")
    private Long compField007;

    @JsonProperty("compField008")
    private Boolean compField008;

    public ComplianceDto037() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final ComplianceDto037 instance = new ComplianceDto037();

        public Builder compField000(Integer val) { instance.compField000 = val; return this; }
        public Builder compField001(LocalDate val) { instance.compField001 = val; return this; }
        public Builder compField002(Double val) { instance.compField002 = val; return this; }
        public Builder compField003(Double val) { instance.compField003 = val; return this; }
        public Builder compField004(Integer val) { instance.compField004 = val; return this; }
        public Builder compField005(Integer val) { instance.compField005 = val; return this; }
        public Builder compField006(Boolean val) { instance.compField006 = val; return this; }
        public Builder compField007(Long val) { instance.compField007 = val; return this; }
        public Builder compField008(Boolean val) { instance.compField008 = val; return this; }
        public ComplianceDto037 build() { return instance; }
    }

    public Integer getCompField000() { return compField000; }
    public void setCompField000(Integer compField000) { this.compField000 = compField000; }

    public LocalDate getCompField001() { return compField001; }
    public void setCompField001(LocalDate compField001) { this.compField001 = compField001; }

    public Double getCompField002() { return compField002; }
    public void setCompField002(Double compField002) { this.compField002 = compField002; }

    public Double getCompField003() { return compField003; }
    public void setCompField003(Double compField003) { this.compField003 = compField003; }

    public Integer getCompField004() { return compField004; }
    public void setCompField004(Integer compField004) { this.compField004 = compField004; }

    public Integer getCompField005() { return compField005; }
    public void setCompField005(Integer compField005) { this.compField005 = compField005; }

    public Boolean getCompField006() { return compField006; }
    public void setCompField006(Boolean compField006) { this.compField006 = compField006; }

    public Long getCompField007() { return compField007; }
    public void setCompField007(Long compField007) { this.compField007 = compField007; }

    public Boolean getCompField008() { return compField008; }
    public void setCompField008(Boolean compField008) { this.compField008 = compField008; }

    @Override
    public String toString() {
        return "ComplianceDto037{" +
            "compField000=" + compField000 + ", " +
            "compField001=" + compField001 + ", " +
            "compField002=" + compField002 + ", " +
            "compField003=" + compField003 + ", " +
            "compField004=" + compField004 + ", " +
            "}";
    }
}
