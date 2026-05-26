package com.pnb.compliance;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * ComplianceDto021 — Data Transfer Object for compliance operations.
 * Variant 21 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ComplianceDto021 {

    @DecimalMin(value = "0.00")
    @JsonProperty("compField000")
    private BigDecimal compField000;

    @JsonProperty("compField001")
    private LocalDate compField001;

    @JsonProperty("compField002")
    private Boolean compField002;

    @DecimalMin(value = "0.00")
    @JsonProperty("compField003")
    private BigDecimal compField003;

    @Size(max = 200)
    @JsonProperty("compField004")
    private String compField004;

    @JsonProperty("compField005")
    private Double compField005;

    @Size(max = 20)
    @JsonProperty("compField006")
    private String compField006;

    @Size(max = 60)
    @JsonProperty("compField007")
    private String compField007;

    @JsonProperty("compField008")
    private Integer compField008;

    @JsonProperty("compField009")
    private LocalDate compField009;

    @JsonProperty("compField010")
    private Integer compField010;

    @JsonProperty("compField011")
    private Long compField011;

    @JsonProperty("compField012")
    private Integer compField012;

    @JsonProperty("compField013")
    private Boolean compField013;

    @JsonProperty("compField014")
    private Long compField014;

    @JsonProperty("compField015")
    private LocalDate compField015;

    @JsonProperty("compField016")
    private Long compField016;

    public ComplianceDto021() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final ComplianceDto021 instance = new ComplianceDto021();

        public Builder compField000(BigDecimal val) { instance.compField000 = val; return this; }
        public Builder compField001(LocalDate val) { instance.compField001 = val; return this; }
        public Builder compField002(Boolean val) { instance.compField002 = val; return this; }
        public Builder compField003(BigDecimal val) { instance.compField003 = val; return this; }
        public Builder compField004(String val) { instance.compField004 = val; return this; }
        public Builder compField005(Double val) { instance.compField005 = val; return this; }
        public Builder compField006(String val) { instance.compField006 = val; return this; }
        public Builder compField007(String val) { instance.compField007 = val; return this; }
        public Builder compField008(Integer val) { instance.compField008 = val; return this; }
        public Builder compField009(LocalDate val) { instance.compField009 = val; return this; }
        public Builder compField010(Integer val) { instance.compField010 = val; return this; }
        public Builder compField011(Long val) { instance.compField011 = val; return this; }
        public Builder compField012(Integer val) { instance.compField012 = val; return this; }
        public Builder compField013(Boolean val) { instance.compField013 = val; return this; }
        public Builder compField014(Long val) { instance.compField014 = val; return this; }
        public Builder compField015(LocalDate val) { instance.compField015 = val; return this; }
        public Builder compField016(Long val) { instance.compField016 = val; return this; }
        public ComplianceDto021 build() { return instance; }
    }

    public BigDecimal getCompField000() { return compField000; }
    public void setCompField000(BigDecimal compField000) { this.compField000 = compField000; }

    public LocalDate getCompField001() { return compField001; }
    public void setCompField001(LocalDate compField001) { this.compField001 = compField001; }

    public Boolean getCompField002() { return compField002; }
    public void setCompField002(Boolean compField002) { this.compField002 = compField002; }

    public BigDecimal getCompField003() { return compField003; }
    public void setCompField003(BigDecimal compField003) { this.compField003 = compField003; }

    public String getCompField004() { return compField004; }
    public void setCompField004(String compField004) { this.compField004 = compField004; }

    public Double getCompField005() { return compField005; }
    public void setCompField005(Double compField005) { this.compField005 = compField005; }

    public String getCompField006() { return compField006; }
    public void setCompField006(String compField006) { this.compField006 = compField006; }

    public String getCompField007() { return compField007; }
    public void setCompField007(String compField007) { this.compField007 = compField007; }

    public Integer getCompField008() { return compField008; }
    public void setCompField008(Integer compField008) { this.compField008 = compField008; }

    public LocalDate getCompField009() { return compField009; }
    public void setCompField009(LocalDate compField009) { this.compField009 = compField009; }

    public Integer getCompField010() { return compField010; }
    public void setCompField010(Integer compField010) { this.compField010 = compField010; }

    public Long getCompField011() { return compField011; }
    public void setCompField011(Long compField011) { this.compField011 = compField011; }

    public Integer getCompField012() { return compField012; }
    public void setCompField012(Integer compField012) { this.compField012 = compField012; }

    public Boolean getCompField013() { return compField013; }
    public void setCompField013(Boolean compField013) { this.compField013 = compField013; }

    public Long getCompField014() { return compField014; }
    public void setCompField014(Long compField014) { this.compField014 = compField014; }

    public LocalDate getCompField015() { return compField015; }
    public void setCompField015(LocalDate compField015) { this.compField015 = compField015; }

    public Long getCompField016() { return compField016; }
    public void setCompField016(Long compField016) { this.compField016 = compField016; }

    @Override
    public String toString() {
        return "ComplianceDto021{" +
            "compField000=" + compField000 + ", " +
            "compField001=" + compField001 + ", " +
            "compField002=" + compField002 + ", " +
            "compField003=" + compField003 + ", " +
            "compField004=" + compField004 + ", " +
            "}";
    }
}
