package com.pnb.compliance;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * ComplianceDto043 — Data Transfer Object for compliance operations.
 * Variant 43 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ComplianceDto043 {

    @JsonProperty("compField000")
    private Boolean compField000;

    @JsonProperty("compField001")
    private LocalDate compField001;

    @Size(max = 60)
    @JsonProperty("compField002")
    private String compField002;

    @JsonProperty("compField003")
    private LocalDate compField003;

    @JsonProperty("compField004")
    private Double compField004;

    @JsonProperty("compField005")
    private Boolean compField005;

    @JsonProperty("compField006")
    private Integer compField006;

    @JsonProperty("compField007")
    private Integer compField007;

    @DecimalMin(value = "0.00")
    @JsonProperty("compField008")
    private BigDecimal compField008;

    @JsonProperty("compField009")
    private Integer compField009;

    @JsonProperty("compField010")
    private LocalDate compField010;

    @DecimalMin(value = "0.00")
    @JsonProperty("compField011")
    private BigDecimal compField011;

    @Size(max = 60)
    @JsonProperty("compField012")
    private String compField012;

    @Size(max = 60)
    @JsonProperty("compField013")
    private String compField013;

    @Size(max = 200)
    @JsonProperty("compField014")
    private String compField014;

    public ComplianceDto043() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final ComplianceDto043 instance = new ComplianceDto043();

        public Builder compField000(Boolean val) { instance.compField000 = val; return this; }
        public Builder compField001(LocalDate val) { instance.compField001 = val; return this; }
        public Builder compField002(String val) { instance.compField002 = val; return this; }
        public Builder compField003(LocalDate val) { instance.compField003 = val; return this; }
        public Builder compField004(Double val) { instance.compField004 = val; return this; }
        public Builder compField005(Boolean val) { instance.compField005 = val; return this; }
        public Builder compField006(Integer val) { instance.compField006 = val; return this; }
        public Builder compField007(Integer val) { instance.compField007 = val; return this; }
        public Builder compField008(BigDecimal val) { instance.compField008 = val; return this; }
        public Builder compField009(Integer val) { instance.compField009 = val; return this; }
        public Builder compField010(LocalDate val) { instance.compField010 = val; return this; }
        public Builder compField011(BigDecimal val) { instance.compField011 = val; return this; }
        public Builder compField012(String val) { instance.compField012 = val; return this; }
        public Builder compField013(String val) { instance.compField013 = val; return this; }
        public Builder compField014(String val) { instance.compField014 = val; return this; }
        public ComplianceDto043 build() { return instance; }
    }

    public Boolean getCompField000() { return compField000; }
    public void setCompField000(Boolean compField000) { this.compField000 = compField000; }

    public LocalDate getCompField001() { return compField001; }
    public void setCompField001(LocalDate compField001) { this.compField001 = compField001; }

    public String getCompField002() { return compField002; }
    public void setCompField002(String compField002) { this.compField002 = compField002; }

    public LocalDate getCompField003() { return compField003; }
    public void setCompField003(LocalDate compField003) { this.compField003 = compField003; }

    public Double getCompField004() { return compField004; }
    public void setCompField004(Double compField004) { this.compField004 = compField004; }

    public Boolean getCompField005() { return compField005; }
    public void setCompField005(Boolean compField005) { this.compField005 = compField005; }

    public Integer getCompField006() { return compField006; }
    public void setCompField006(Integer compField006) { this.compField006 = compField006; }

    public Integer getCompField007() { return compField007; }
    public void setCompField007(Integer compField007) { this.compField007 = compField007; }

    public BigDecimal getCompField008() { return compField008; }
    public void setCompField008(BigDecimal compField008) { this.compField008 = compField008; }

    public Integer getCompField009() { return compField009; }
    public void setCompField009(Integer compField009) { this.compField009 = compField009; }

    public LocalDate getCompField010() { return compField010; }
    public void setCompField010(LocalDate compField010) { this.compField010 = compField010; }

    public BigDecimal getCompField011() { return compField011; }
    public void setCompField011(BigDecimal compField011) { this.compField011 = compField011; }

    public String getCompField012() { return compField012; }
    public void setCompField012(String compField012) { this.compField012 = compField012; }

    public String getCompField013() { return compField013; }
    public void setCompField013(String compField013) { this.compField013 = compField013; }

    public String getCompField014() { return compField014; }
    public void setCompField014(String compField014) { this.compField014 = compField014; }

    @Override
    public String toString() {
        return "ComplianceDto043{" +
            "compField000=" + compField000 + ", " +
            "compField001=" + compField001 + ", " +
            "compField002=" + compField002 + ", " +
            "compField003=" + compField003 + ", " +
            "compField004=" + compField004 + ", " +
            "}";
    }
}
