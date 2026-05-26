package com.pnb.compliance;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * ComplianceDto055 — Data Transfer Object for compliance operations.
 * Variant 55 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ComplianceDto055 {

    @JsonProperty("compField000")
    private Integer compField000;

    @JsonProperty("compField001")
    private LocalDate compField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("compField002")
    private BigDecimal compField002;

    @JsonProperty("compField003")
    private Long compField003;

    @JsonProperty("compField004")
    private Double compField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("compField005")
    private BigDecimal compField005;

    @JsonProperty("compField006")
    private Double compField006;

    @JsonProperty("compField007")
    private Boolean compField007;

    @JsonProperty("compField008")
    private Boolean compField008;

    @JsonProperty("compField009")
    private LocalDate compField009;

    @Size(max = 60)
    @JsonProperty("compField010")
    private String compField010;

    @JsonProperty("compField011")
    private Boolean compField011;

    @JsonProperty("compField012")
    private Integer compField012;

    @JsonProperty("compField013")
    private LocalDate compField013;

    @JsonProperty("compField014")
    private Integer compField014;

    public ComplianceDto055() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final ComplianceDto055 instance = new ComplianceDto055();

        public Builder compField000(Integer val) { instance.compField000 = val; return this; }
        public Builder compField001(LocalDate val) { instance.compField001 = val; return this; }
        public Builder compField002(BigDecimal val) { instance.compField002 = val; return this; }
        public Builder compField003(Long val) { instance.compField003 = val; return this; }
        public Builder compField004(Double val) { instance.compField004 = val; return this; }
        public Builder compField005(BigDecimal val) { instance.compField005 = val; return this; }
        public Builder compField006(Double val) { instance.compField006 = val; return this; }
        public Builder compField007(Boolean val) { instance.compField007 = val; return this; }
        public Builder compField008(Boolean val) { instance.compField008 = val; return this; }
        public Builder compField009(LocalDate val) { instance.compField009 = val; return this; }
        public Builder compField010(String val) { instance.compField010 = val; return this; }
        public Builder compField011(Boolean val) { instance.compField011 = val; return this; }
        public Builder compField012(Integer val) { instance.compField012 = val; return this; }
        public Builder compField013(LocalDate val) { instance.compField013 = val; return this; }
        public Builder compField014(Integer val) { instance.compField014 = val; return this; }
        public ComplianceDto055 build() { return instance; }
    }

    public Integer getCompField000() { return compField000; }
    public void setCompField000(Integer compField000) { this.compField000 = compField000; }

    public LocalDate getCompField001() { return compField001; }
    public void setCompField001(LocalDate compField001) { this.compField001 = compField001; }

    public BigDecimal getCompField002() { return compField002; }
    public void setCompField002(BigDecimal compField002) { this.compField002 = compField002; }

    public Long getCompField003() { return compField003; }
    public void setCompField003(Long compField003) { this.compField003 = compField003; }

    public Double getCompField004() { return compField004; }
    public void setCompField004(Double compField004) { this.compField004 = compField004; }

    public BigDecimal getCompField005() { return compField005; }
    public void setCompField005(BigDecimal compField005) { this.compField005 = compField005; }

    public Double getCompField006() { return compField006; }
    public void setCompField006(Double compField006) { this.compField006 = compField006; }

    public Boolean getCompField007() { return compField007; }
    public void setCompField007(Boolean compField007) { this.compField007 = compField007; }

    public Boolean getCompField008() { return compField008; }
    public void setCompField008(Boolean compField008) { this.compField008 = compField008; }

    public LocalDate getCompField009() { return compField009; }
    public void setCompField009(LocalDate compField009) { this.compField009 = compField009; }

    public String getCompField010() { return compField010; }
    public void setCompField010(String compField010) { this.compField010 = compField010; }

    public Boolean getCompField011() { return compField011; }
    public void setCompField011(Boolean compField011) { this.compField011 = compField011; }

    public Integer getCompField012() { return compField012; }
    public void setCompField012(Integer compField012) { this.compField012 = compField012; }

    public LocalDate getCompField013() { return compField013; }
    public void setCompField013(LocalDate compField013) { this.compField013 = compField013; }

    public Integer getCompField014() { return compField014; }
    public void setCompField014(Integer compField014) { this.compField014 = compField014; }

    @Override
    public String toString() {
        return "ComplianceDto055{" +
            "compField000=" + compField000 + ", " +
            "compField001=" + compField001 + ", " +
            "compField002=" + compField002 + ", " +
            "compField003=" + compField003 + ", " +
            "compField004=" + compField004 + ", " +
            "}";
    }
}
