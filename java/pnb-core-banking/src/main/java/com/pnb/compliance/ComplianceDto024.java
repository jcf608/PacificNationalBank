package com.pnb.compliance;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * ComplianceDto024 — Data Transfer Object for compliance operations.
 * Variant 24 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ComplianceDto024 {

    @JsonProperty("compField000")
    private Boolean compField000;

    @Size(max = 40)
    @JsonProperty("compField001")
    private String compField001;

    @JsonProperty("compField002")
    private Boolean compField002;

    @JsonProperty("compField003")
    private Boolean compField003;

    @JsonProperty("compField004")
    private Boolean compField004;

    @JsonProperty("compField005")
    private Long compField005;

    @JsonProperty("compField006")
    private Integer compField006;

    @JsonProperty("compField007")
    private Long compField007;

    public ComplianceDto024() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final ComplianceDto024 instance = new ComplianceDto024();

        public Builder compField000(Boolean val) { instance.compField000 = val; return this; }
        public Builder compField001(String val) { instance.compField001 = val; return this; }
        public Builder compField002(Boolean val) { instance.compField002 = val; return this; }
        public Builder compField003(Boolean val) { instance.compField003 = val; return this; }
        public Builder compField004(Boolean val) { instance.compField004 = val; return this; }
        public Builder compField005(Long val) { instance.compField005 = val; return this; }
        public Builder compField006(Integer val) { instance.compField006 = val; return this; }
        public Builder compField007(Long val) { instance.compField007 = val; return this; }
        public ComplianceDto024 build() { return instance; }
    }

    public Boolean getCompField000() { return compField000; }
    public void setCompField000(Boolean compField000) { this.compField000 = compField000; }

    public String getCompField001() { return compField001; }
    public void setCompField001(String compField001) { this.compField001 = compField001; }

    public Boolean getCompField002() { return compField002; }
    public void setCompField002(Boolean compField002) { this.compField002 = compField002; }

    public Boolean getCompField003() { return compField003; }
    public void setCompField003(Boolean compField003) { this.compField003 = compField003; }

    public Boolean getCompField004() { return compField004; }
    public void setCompField004(Boolean compField004) { this.compField004 = compField004; }

    public Long getCompField005() { return compField005; }
    public void setCompField005(Long compField005) { this.compField005 = compField005; }

    public Integer getCompField006() { return compField006; }
    public void setCompField006(Integer compField006) { this.compField006 = compField006; }

    public Long getCompField007() { return compField007; }
    public void setCompField007(Long compField007) { this.compField007 = compField007; }

    @Override
    public String toString() {
        return "ComplianceDto024{" +
            "compField000=" + compField000 + ", " +
            "compField001=" + compField001 + ", " +
            "compField002=" + compField002 + ", " +
            "compField003=" + compField003 + ", " +
            "compField004=" + compField004 + ", " +
            "}";
    }
}
