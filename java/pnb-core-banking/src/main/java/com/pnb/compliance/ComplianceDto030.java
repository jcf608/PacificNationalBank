package com.pnb.compliance;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * ComplianceDto030 — Data Transfer Object for compliance operations.
 * Variant 30 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ComplianceDto030 {

    @JsonProperty("compField000")
    private Boolean compField000;

    @Size(max = 60)
    @JsonProperty("compField001")
    private String compField001;

    @JsonProperty("compField002")
    private Boolean compField002;

    @Size(max = 100)
    @JsonProperty("compField003")
    private String compField003;

    @JsonProperty("compField004")
    private Long compField004;

    @JsonProperty("compField005")
    private Double compField005;

    @JsonProperty("compField006")
    private Boolean compField006;

    @JsonProperty("compField007")
    private LocalDate compField007;

    @JsonProperty("compField008")
    private LocalDate compField008;

    @JsonProperty("compField009")
    private LocalDate compField009;

    @DecimalMin(value = "0.00")
    @JsonProperty("compField010")
    private BigDecimal compField010;

    @JsonProperty("compField011")
    private Integer compField011;

    @DecimalMin(value = "0.00")
    @JsonProperty("compField012")
    private BigDecimal compField012;

    @JsonProperty("compField013")
    private Boolean compField013;

    public ComplianceDto030() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final ComplianceDto030 instance = new ComplianceDto030();

        public Builder compField000(Boolean val) { instance.compField000 = val; return this; }
        public Builder compField001(String val) { instance.compField001 = val; return this; }
        public Builder compField002(Boolean val) { instance.compField002 = val; return this; }
        public Builder compField003(String val) { instance.compField003 = val; return this; }
        public Builder compField004(Long val) { instance.compField004 = val; return this; }
        public Builder compField005(Double val) { instance.compField005 = val; return this; }
        public Builder compField006(Boolean val) { instance.compField006 = val; return this; }
        public Builder compField007(LocalDate val) { instance.compField007 = val; return this; }
        public Builder compField008(LocalDate val) { instance.compField008 = val; return this; }
        public Builder compField009(LocalDate val) { instance.compField009 = val; return this; }
        public Builder compField010(BigDecimal val) { instance.compField010 = val; return this; }
        public Builder compField011(Integer val) { instance.compField011 = val; return this; }
        public Builder compField012(BigDecimal val) { instance.compField012 = val; return this; }
        public Builder compField013(Boolean val) { instance.compField013 = val; return this; }
        public ComplianceDto030 build() { return instance; }
    }

    public Boolean getCompField000() { return compField000; }
    public void setCompField000(Boolean compField000) { this.compField000 = compField000; }

    public String getCompField001() { return compField001; }
    public void setCompField001(String compField001) { this.compField001 = compField001; }

    public Boolean getCompField002() { return compField002; }
    public void setCompField002(Boolean compField002) { this.compField002 = compField002; }

    public String getCompField003() { return compField003; }
    public void setCompField003(String compField003) { this.compField003 = compField003; }

    public Long getCompField004() { return compField004; }
    public void setCompField004(Long compField004) { this.compField004 = compField004; }

    public Double getCompField005() { return compField005; }
    public void setCompField005(Double compField005) { this.compField005 = compField005; }

    public Boolean getCompField006() { return compField006; }
    public void setCompField006(Boolean compField006) { this.compField006 = compField006; }

    public LocalDate getCompField007() { return compField007; }
    public void setCompField007(LocalDate compField007) { this.compField007 = compField007; }

    public LocalDate getCompField008() { return compField008; }
    public void setCompField008(LocalDate compField008) { this.compField008 = compField008; }

    public LocalDate getCompField009() { return compField009; }
    public void setCompField009(LocalDate compField009) { this.compField009 = compField009; }

    public BigDecimal getCompField010() { return compField010; }
    public void setCompField010(BigDecimal compField010) { this.compField010 = compField010; }

    public Integer getCompField011() { return compField011; }
    public void setCompField011(Integer compField011) { this.compField011 = compField011; }

    public BigDecimal getCompField012() { return compField012; }
    public void setCompField012(BigDecimal compField012) { this.compField012 = compField012; }

    public Boolean getCompField013() { return compField013; }
    public void setCompField013(Boolean compField013) { this.compField013 = compField013; }

    @Override
    public String toString() {
        return "ComplianceDto030{" +
            "compField000=" + compField000 + ", " +
            "compField001=" + compField001 + ", " +
            "compField002=" + compField002 + ", " +
            "compField003=" + compField003 + ", " +
            "compField004=" + compField004 + ", " +
            "}";
    }
}
