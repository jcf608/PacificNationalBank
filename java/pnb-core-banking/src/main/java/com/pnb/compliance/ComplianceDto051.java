package com.pnb.compliance;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * ComplianceDto051 — Data Transfer Object for compliance operations.
 * Variant 51 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ComplianceDto051 {

    @JsonProperty("compField000")
    private Long compField000;

    @JsonProperty("compField001")
    private Integer compField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("compField002")
    private BigDecimal compField002;

    @JsonProperty("compField003")
    private Boolean compField003;

    @JsonProperty("compField004")
    private LocalDate compField004;

    @JsonProperty("compField005")
    private LocalDate compField005;

    @JsonProperty("compField006")
    private Boolean compField006;

    @JsonProperty("compField007")
    private Long compField007;

    @JsonProperty("compField008")
    private LocalDate compField008;

    @Size(max = 200)
    @JsonProperty("compField009")
    private String compField009;

    @JsonProperty("compField010")
    private Double compField010;

    public ComplianceDto051() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final ComplianceDto051 instance = new ComplianceDto051();

        public Builder compField000(Long val) { instance.compField000 = val; return this; }
        public Builder compField001(Integer val) { instance.compField001 = val; return this; }
        public Builder compField002(BigDecimal val) { instance.compField002 = val; return this; }
        public Builder compField003(Boolean val) { instance.compField003 = val; return this; }
        public Builder compField004(LocalDate val) { instance.compField004 = val; return this; }
        public Builder compField005(LocalDate val) { instance.compField005 = val; return this; }
        public Builder compField006(Boolean val) { instance.compField006 = val; return this; }
        public Builder compField007(Long val) { instance.compField007 = val; return this; }
        public Builder compField008(LocalDate val) { instance.compField008 = val; return this; }
        public Builder compField009(String val) { instance.compField009 = val; return this; }
        public Builder compField010(Double val) { instance.compField010 = val; return this; }
        public ComplianceDto051 build() { return instance; }
    }

    public Long getCompField000() { return compField000; }
    public void setCompField000(Long compField000) { this.compField000 = compField000; }

    public Integer getCompField001() { return compField001; }
    public void setCompField001(Integer compField001) { this.compField001 = compField001; }

    public BigDecimal getCompField002() { return compField002; }
    public void setCompField002(BigDecimal compField002) { this.compField002 = compField002; }

    public Boolean getCompField003() { return compField003; }
    public void setCompField003(Boolean compField003) { this.compField003 = compField003; }

    public LocalDate getCompField004() { return compField004; }
    public void setCompField004(LocalDate compField004) { this.compField004 = compField004; }

    public LocalDate getCompField005() { return compField005; }
    public void setCompField005(LocalDate compField005) { this.compField005 = compField005; }

    public Boolean getCompField006() { return compField006; }
    public void setCompField006(Boolean compField006) { this.compField006 = compField006; }

    public Long getCompField007() { return compField007; }
    public void setCompField007(Long compField007) { this.compField007 = compField007; }

    public LocalDate getCompField008() { return compField008; }
    public void setCompField008(LocalDate compField008) { this.compField008 = compField008; }

    public String getCompField009() { return compField009; }
    public void setCompField009(String compField009) { this.compField009 = compField009; }

    public Double getCompField010() { return compField010; }
    public void setCompField010(Double compField010) { this.compField010 = compField010; }

    @Override
    public String toString() {
        return "ComplianceDto051{" +
            "compField000=" + compField000 + ", " +
            "compField001=" + compField001 + ", " +
            "compField002=" + compField002 + ", " +
            "compField003=" + compField003 + ", " +
            "compField004=" + compField004 + ", " +
            "}";
    }
}
