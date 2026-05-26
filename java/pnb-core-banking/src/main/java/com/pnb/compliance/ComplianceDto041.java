package com.pnb.compliance;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * ComplianceDto041 — Data Transfer Object for compliance operations.
 * Variant 41 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ComplianceDto041 {

    @JsonProperty("compField000")
    private LocalDate compField000;

    @JsonProperty("compField001")
    private Double compField001;

    @JsonProperty("compField002")
    private Double compField002;

    @JsonProperty("compField003")
    private Boolean compField003;

    @Size(max = 100)
    @JsonProperty("compField004")
    private String compField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("compField005")
    private BigDecimal compField005;

    @JsonProperty("compField006")
    private Integer compField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("compField007")
    private BigDecimal compField007;

    @DecimalMin(value = "0.00")
    @JsonProperty("compField008")
    private BigDecimal compField008;

    @JsonProperty("compField009")
    private LocalDate compField009;

    @JsonProperty("compField010")
    private Long compField010;

    @JsonProperty("compField011")
    private Integer compField011;

    @Size(max = 60)
    @JsonProperty("compField012")
    private String compField012;

    public ComplianceDto041() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final ComplianceDto041 instance = new ComplianceDto041();

        public Builder compField000(LocalDate val) { instance.compField000 = val; return this; }
        public Builder compField001(Double val) { instance.compField001 = val; return this; }
        public Builder compField002(Double val) { instance.compField002 = val; return this; }
        public Builder compField003(Boolean val) { instance.compField003 = val; return this; }
        public Builder compField004(String val) { instance.compField004 = val; return this; }
        public Builder compField005(BigDecimal val) { instance.compField005 = val; return this; }
        public Builder compField006(Integer val) { instance.compField006 = val; return this; }
        public Builder compField007(BigDecimal val) { instance.compField007 = val; return this; }
        public Builder compField008(BigDecimal val) { instance.compField008 = val; return this; }
        public Builder compField009(LocalDate val) { instance.compField009 = val; return this; }
        public Builder compField010(Long val) { instance.compField010 = val; return this; }
        public Builder compField011(Integer val) { instance.compField011 = val; return this; }
        public Builder compField012(String val) { instance.compField012 = val; return this; }
        public ComplianceDto041 build() { return instance; }
    }

    public LocalDate getCompField000() { return compField000; }
    public void setCompField000(LocalDate compField000) { this.compField000 = compField000; }

    public Double getCompField001() { return compField001; }
    public void setCompField001(Double compField001) { this.compField001 = compField001; }

    public Double getCompField002() { return compField002; }
    public void setCompField002(Double compField002) { this.compField002 = compField002; }

    public Boolean getCompField003() { return compField003; }
    public void setCompField003(Boolean compField003) { this.compField003 = compField003; }

    public String getCompField004() { return compField004; }
    public void setCompField004(String compField004) { this.compField004 = compField004; }

    public BigDecimal getCompField005() { return compField005; }
    public void setCompField005(BigDecimal compField005) { this.compField005 = compField005; }

    public Integer getCompField006() { return compField006; }
    public void setCompField006(Integer compField006) { this.compField006 = compField006; }

    public BigDecimal getCompField007() { return compField007; }
    public void setCompField007(BigDecimal compField007) { this.compField007 = compField007; }

    public BigDecimal getCompField008() { return compField008; }
    public void setCompField008(BigDecimal compField008) { this.compField008 = compField008; }

    public LocalDate getCompField009() { return compField009; }
    public void setCompField009(LocalDate compField009) { this.compField009 = compField009; }

    public Long getCompField010() { return compField010; }
    public void setCompField010(Long compField010) { this.compField010 = compField010; }

    public Integer getCompField011() { return compField011; }
    public void setCompField011(Integer compField011) { this.compField011 = compField011; }

    public String getCompField012() { return compField012; }
    public void setCompField012(String compField012) { this.compField012 = compField012; }

    @Override
    public String toString() {
        return "ComplianceDto041{" +
            "compField000=" + compField000 + ", " +
            "compField001=" + compField001 + ", " +
            "compField002=" + compField002 + ", " +
            "compField003=" + compField003 + ", " +
            "compField004=" + compField004 + ", " +
            "}";
    }
}
