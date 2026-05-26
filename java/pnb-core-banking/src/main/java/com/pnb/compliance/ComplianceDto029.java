package com.pnb.compliance;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * ComplianceDto029 — Data Transfer Object for compliance operations.
 * Variant 29 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ComplianceDto029 {

    @DecimalMin(value = "0.00")
    @JsonProperty("compField000")
    private BigDecimal compField000;

    @JsonProperty("compField001")
    private Boolean compField001;

    @JsonProperty("compField002")
    private LocalDate compField002;

    @JsonProperty("compField003")
    private Long compField003;

    @JsonProperty("compField004")
    private LocalDate compField004;

    @JsonProperty("compField005")
    private Double compField005;

    @JsonProperty("compField006")
    private Boolean compField006;

    @Size(max = 200)
    @JsonProperty("compField007")
    private String compField007;

    @Size(max = 60)
    @JsonProperty("compField008")
    private String compField008;

    @JsonProperty("compField009")
    private Double compField009;

    @JsonProperty("compField010")
    private Long compField010;

    @Size(max = 20)
    @JsonProperty("compField011")
    private String compField011;

    @JsonProperty("compField012")
    private Double compField012;

    public ComplianceDto029() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final ComplianceDto029 instance = new ComplianceDto029();

        public Builder compField000(BigDecimal val) { instance.compField000 = val; return this; }
        public Builder compField001(Boolean val) { instance.compField001 = val; return this; }
        public Builder compField002(LocalDate val) { instance.compField002 = val; return this; }
        public Builder compField003(Long val) { instance.compField003 = val; return this; }
        public Builder compField004(LocalDate val) { instance.compField004 = val; return this; }
        public Builder compField005(Double val) { instance.compField005 = val; return this; }
        public Builder compField006(Boolean val) { instance.compField006 = val; return this; }
        public Builder compField007(String val) { instance.compField007 = val; return this; }
        public Builder compField008(String val) { instance.compField008 = val; return this; }
        public Builder compField009(Double val) { instance.compField009 = val; return this; }
        public Builder compField010(Long val) { instance.compField010 = val; return this; }
        public Builder compField011(String val) { instance.compField011 = val; return this; }
        public Builder compField012(Double val) { instance.compField012 = val; return this; }
        public ComplianceDto029 build() { return instance; }
    }

    public BigDecimal getCompField000() { return compField000; }
    public void setCompField000(BigDecimal compField000) { this.compField000 = compField000; }

    public Boolean getCompField001() { return compField001; }
    public void setCompField001(Boolean compField001) { this.compField001 = compField001; }

    public LocalDate getCompField002() { return compField002; }
    public void setCompField002(LocalDate compField002) { this.compField002 = compField002; }

    public Long getCompField003() { return compField003; }
    public void setCompField003(Long compField003) { this.compField003 = compField003; }

    public LocalDate getCompField004() { return compField004; }
    public void setCompField004(LocalDate compField004) { this.compField004 = compField004; }

    public Double getCompField005() { return compField005; }
    public void setCompField005(Double compField005) { this.compField005 = compField005; }

    public Boolean getCompField006() { return compField006; }
    public void setCompField006(Boolean compField006) { this.compField006 = compField006; }

    public String getCompField007() { return compField007; }
    public void setCompField007(String compField007) { this.compField007 = compField007; }

    public String getCompField008() { return compField008; }
    public void setCompField008(String compField008) { this.compField008 = compField008; }

    public Double getCompField009() { return compField009; }
    public void setCompField009(Double compField009) { this.compField009 = compField009; }

    public Long getCompField010() { return compField010; }
    public void setCompField010(Long compField010) { this.compField010 = compField010; }

    public String getCompField011() { return compField011; }
    public void setCompField011(String compField011) { this.compField011 = compField011; }

    public Double getCompField012() { return compField012; }
    public void setCompField012(Double compField012) { this.compField012 = compField012; }

    @Override
    public String toString() {
        return "ComplianceDto029{" +
            "compField000=" + compField000 + ", " +
            "compField001=" + compField001 + ", " +
            "compField002=" + compField002 + ", " +
            "compField003=" + compField003 + ", " +
            "compField004=" + compField004 + ", " +
            "}";
    }
}
