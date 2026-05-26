package com.pnb.compliance;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * ComplianceDto026 — Data Transfer Object for compliance operations.
 * Variant 26 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ComplianceDto026 {

    @JsonProperty("compField000")
    private LocalDate compField000;

    @JsonProperty("compField001")
    private Long compField001;

    @JsonProperty("compField002")
    private Long compField002;

    @JsonProperty("compField003")
    private LocalDate compField003;

    @JsonProperty("compField004")
    private Integer compField004;

    @JsonProperty("compField005")
    private Double compField005;

    @JsonProperty("compField006")
    private Boolean compField006;

    @Size(max = 40)
    @JsonProperty("compField007")
    private String compField007;

    @JsonProperty("compField008")
    private Integer compField008;

    @JsonProperty("compField009")
    private Boolean compField009;

    public ComplianceDto026() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final ComplianceDto026 instance = new ComplianceDto026();

        public Builder compField000(LocalDate val) { instance.compField000 = val; return this; }
        public Builder compField001(Long val) { instance.compField001 = val; return this; }
        public Builder compField002(Long val) { instance.compField002 = val; return this; }
        public Builder compField003(LocalDate val) { instance.compField003 = val; return this; }
        public Builder compField004(Integer val) { instance.compField004 = val; return this; }
        public Builder compField005(Double val) { instance.compField005 = val; return this; }
        public Builder compField006(Boolean val) { instance.compField006 = val; return this; }
        public Builder compField007(String val) { instance.compField007 = val; return this; }
        public Builder compField008(Integer val) { instance.compField008 = val; return this; }
        public Builder compField009(Boolean val) { instance.compField009 = val; return this; }
        public ComplianceDto026 build() { return instance; }
    }

    public LocalDate getCompField000() { return compField000; }
    public void setCompField000(LocalDate compField000) { this.compField000 = compField000; }

    public Long getCompField001() { return compField001; }
    public void setCompField001(Long compField001) { this.compField001 = compField001; }

    public Long getCompField002() { return compField002; }
    public void setCompField002(Long compField002) { this.compField002 = compField002; }

    public LocalDate getCompField003() { return compField003; }
    public void setCompField003(LocalDate compField003) { this.compField003 = compField003; }

    public Integer getCompField004() { return compField004; }
    public void setCompField004(Integer compField004) { this.compField004 = compField004; }

    public Double getCompField005() { return compField005; }
    public void setCompField005(Double compField005) { this.compField005 = compField005; }

    public Boolean getCompField006() { return compField006; }
    public void setCompField006(Boolean compField006) { this.compField006 = compField006; }

    public String getCompField007() { return compField007; }
    public void setCompField007(String compField007) { this.compField007 = compField007; }

    public Integer getCompField008() { return compField008; }
    public void setCompField008(Integer compField008) { this.compField008 = compField008; }

    public Boolean getCompField009() { return compField009; }
    public void setCompField009(Boolean compField009) { this.compField009 = compField009; }

    @Override
    public String toString() {
        return "ComplianceDto026{" +
            "compField000=" + compField000 + ", " +
            "compField001=" + compField001 + ", " +
            "compField002=" + compField002 + ", " +
            "compField003=" + compField003 + ", " +
            "compField004=" + compField004 + ", " +
            "}";
    }
}
