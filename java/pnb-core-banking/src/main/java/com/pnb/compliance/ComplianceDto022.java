package com.pnb.compliance;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * ComplianceDto022 — Data Transfer Object for compliance operations.
 * Variant 22 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ComplianceDto022 {

    @DecimalMin(value = "0.00")
    @JsonProperty("compField000")
    private BigDecimal compField000;

    @JsonProperty("compField001")
    private Long compField001;

    @JsonProperty("compField002")
    private LocalDate compField002;

    @JsonProperty("compField003")
    private Double compField003;

    @JsonProperty("compField004")
    private Double compField004;

    @JsonProperty("compField005")
    private LocalDate compField005;

    @Size(max = 100)
    @JsonProperty("compField006")
    private String compField006;

    @JsonProperty("compField007")
    private Double compField007;

    @JsonProperty("compField008")
    private Integer compField008;

    @DecimalMin(value = "0.00")
    @JsonProperty("compField009")
    private BigDecimal compField009;

    @JsonProperty("compField010")
    private Double compField010;

    @JsonProperty("compField011")
    private Integer compField011;

    @JsonProperty("compField012")
    private Integer compField012;

    @JsonProperty("compField013")
    private LocalDate compField013;

    @JsonProperty("compField014")
    private LocalDate compField014;

    @Size(max = 200)
    @JsonProperty("compField015")
    private String compField015;

    @JsonProperty("compField016")
    private Double compField016;

    @JsonProperty("compField017")
    private LocalDate compField017;

    public ComplianceDto022() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final ComplianceDto022 instance = new ComplianceDto022();

        public Builder compField000(BigDecimal val) { instance.compField000 = val; return this; }
        public Builder compField001(Long val) { instance.compField001 = val; return this; }
        public Builder compField002(LocalDate val) { instance.compField002 = val; return this; }
        public Builder compField003(Double val) { instance.compField003 = val; return this; }
        public Builder compField004(Double val) { instance.compField004 = val; return this; }
        public Builder compField005(LocalDate val) { instance.compField005 = val; return this; }
        public Builder compField006(String val) { instance.compField006 = val; return this; }
        public Builder compField007(Double val) { instance.compField007 = val; return this; }
        public Builder compField008(Integer val) { instance.compField008 = val; return this; }
        public Builder compField009(BigDecimal val) { instance.compField009 = val; return this; }
        public Builder compField010(Double val) { instance.compField010 = val; return this; }
        public Builder compField011(Integer val) { instance.compField011 = val; return this; }
        public Builder compField012(Integer val) { instance.compField012 = val; return this; }
        public Builder compField013(LocalDate val) { instance.compField013 = val; return this; }
        public Builder compField014(LocalDate val) { instance.compField014 = val; return this; }
        public Builder compField015(String val) { instance.compField015 = val; return this; }
        public Builder compField016(Double val) { instance.compField016 = val; return this; }
        public Builder compField017(LocalDate val) { instance.compField017 = val; return this; }
        public ComplianceDto022 build() { return instance; }
    }

    public BigDecimal getCompField000() { return compField000; }
    public void setCompField000(BigDecimal compField000) { this.compField000 = compField000; }

    public Long getCompField001() { return compField001; }
    public void setCompField001(Long compField001) { this.compField001 = compField001; }

    public LocalDate getCompField002() { return compField002; }
    public void setCompField002(LocalDate compField002) { this.compField002 = compField002; }

    public Double getCompField003() { return compField003; }
    public void setCompField003(Double compField003) { this.compField003 = compField003; }

    public Double getCompField004() { return compField004; }
    public void setCompField004(Double compField004) { this.compField004 = compField004; }

    public LocalDate getCompField005() { return compField005; }
    public void setCompField005(LocalDate compField005) { this.compField005 = compField005; }

    public String getCompField006() { return compField006; }
    public void setCompField006(String compField006) { this.compField006 = compField006; }

    public Double getCompField007() { return compField007; }
    public void setCompField007(Double compField007) { this.compField007 = compField007; }

    public Integer getCompField008() { return compField008; }
    public void setCompField008(Integer compField008) { this.compField008 = compField008; }

    public BigDecimal getCompField009() { return compField009; }
    public void setCompField009(BigDecimal compField009) { this.compField009 = compField009; }

    public Double getCompField010() { return compField010; }
    public void setCompField010(Double compField010) { this.compField010 = compField010; }

    public Integer getCompField011() { return compField011; }
    public void setCompField011(Integer compField011) { this.compField011 = compField011; }

    public Integer getCompField012() { return compField012; }
    public void setCompField012(Integer compField012) { this.compField012 = compField012; }

    public LocalDate getCompField013() { return compField013; }
    public void setCompField013(LocalDate compField013) { this.compField013 = compField013; }

    public LocalDate getCompField014() { return compField014; }
    public void setCompField014(LocalDate compField014) { this.compField014 = compField014; }

    public String getCompField015() { return compField015; }
    public void setCompField015(String compField015) { this.compField015 = compField015; }

    public Double getCompField016() { return compField016; }
    public void setCompField016(Double compField016) { this.compField016 = compField016; }

    public LocalDate getCompField017() { return compField017; }
    public void setCompField017(LocalDate compField017) { this.compField017 = compField017; }

    @Override
    public String toString() {
        return "ComplianceDto022{" +
            "compField000=" + compField000 + ", " +
            "compField001=" + compField001 + ", " +
            "compField002=" + compField002 + ", " +
            "compField003=" + compField003 + ", " +
            "compField004=" + compField004 + ", " +
            "}";
    }
}
