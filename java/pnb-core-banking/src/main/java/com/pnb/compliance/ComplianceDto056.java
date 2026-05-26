package com.pnb.compliance;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * ComplianceDto056 — Data Transfer Object for compliance operations.
 * Variant 56 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ComplianceDto056 {

    @JsonProperty("compField000")
    private Boolean compField000;

    @JsonProperty("compField001")
    private Long compField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("compField002")
    private BigDecimal compField002;

    @Size(max = 100)
    @JsonProperty("compField003")
    private String compField003;

    @DecimalMin(value = "0.00")
    @JsonProperty("compField004")
    private BigDecimal compField004;

    @Size(max = 60)
    @JsonProperty("compField005")
    private String compField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("compField006")
    private BigDecimal compField006;

    @JsonProperty("compField007")
    private Integer compField007;

    @JsonProperty("compField008")
    private Double compField008;

    @JsonProperty("compField009")
    private Long compField009;

    @Size(max = 20)
    @JsonProperty("compField010")
    private String compField010;

    @JsonProperty("compField011")
    private Long compField011;

    @JsonProperty("compField012")
    private Integer compField012;

    @DecimalMin(value = "0.00")
    @JsonProperty("compField013")
    private BigDecimal compField013;

    @JsonProperty("compField014")
    private Integer compField014;

    @JsonProperty("compField015")
    private Double compField015;

    public ComplianceDto056() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final ComplianceDto056 instance = new ComplianceDto056();

        public Builder compField000(Boolean val) { instance.compField000 = val; return this; }
        public Builder compField001(Long val) { instance.compField001 = val; return this; }
        public Builder compField002(BigDecimal val) { instance.compField002 = val; return this; }
        public Builder compField003(String val) { instance.compField003 = val; return this; }
        public Builder compField004(BigDecimal val) { instance.compField004 = val; return this; }
        public Builder compField005(String val) { instance.compField005 = val; return this; }
        public Builder compField006(BigDecimal val) { instance.compField006 = val; return this; }
        public Builder compField007(Integer val) { instance.compField007 = val; return this; }
        public Builder compField008(Double val) { instance.compField008 = val; return this; }
        public Builder compField009(Long val) { instance.compField009 = val; return this; }
        public Builder compField010(String val) { instance.compField010 = val; return this; }
        public Builder compField011(Long val) { instance.compField011 = val; return this; }
        public Builder compField012(Integer val) { instance.compField012 = val; return this; }
        public Builder compField013(BigDecimal val) { instance.compField013 = val; return this; }
        public Builder compField014(Integer val) { instance.compField014 = val; return this; }
        public Builder compField015(Double val) { instance.compField015 = val; return this; }
        public ComplianceDto056 build() { return instance; }
    }

    public Boolean getCompField000() { return compField000; }
    public void setCompField000(Boolean compField000) { this.compField000 = compField000; }

    public Long getCompField001() { return compField001; }
    public void setCompField001(Long compField001) { this.compField001 = compField001; }

    public BigDecimal getCompField002() { return compField002; }
    public void setCompField002(BigDecimal compField002) { this.compField002 = compField002; }

    public String getCompField003() { return compField003; }
    public void setCompField003(String compField003) { this.compField003 = compField003; }

    public BigDecimal getCompField004() { return compField004; }
    public void setCompField004(BigDecimal compField004) { this.compField004 = compField004; }

    public String getCompField005() { return compField005; }
    public void setCompField005(String compField005) { this.compField005 = compField005; }

    public BigDecimal getCompField006() { return compField006; }
    public void setCompField006(BigDecimal compField006) { this.compField006 = compField006; }

    public Integer getCompField007() { return compField007; }
    public void setCompField007(Integer compField007) { this.compField007 = compField007; }

    public Double getCompField008() { return compField008; }
    public void setCompField008(Double compField008) { this.compField008 = compField008; }

    public Long getCompField009() { return compField009; }
    public void setCompField009(Long compField009) { this.compField009 = compField009; }

    public String getCompField010() { return compField010; }
    public void setCompField010(String compField010) { this.compField010 = compField010; }

    public Long getCompField011() { return compField011; }
    public void setCompField011(Long compField011) { this.compField011 = compField011; }

    public Integer getCompField012() { return compField012; }
    public void setCompField012(Integer compField012) { this.compField012 = compField012; }

    public BigDecimal getCompField013() { return compField013; }
    public void setCompField013(BigDecimal compField013) { this.compField013 = compField013; }

    public Integer getCompField014() { return compField014; }
    public void setCompField014(Integer compField014) { this.compField014 = compField014; }

    public Double getCompField015() { return compField015; }
    public void setCompField015(Double compField015) { this.compField015 = compField015; }

    @Override
    public String toString() {
        return "ComplianceDto056{" +
            "compField000=" + compField000 + ", " +
            "compField001=" + compField001 + ", " +
            "compField002=" + compField002 + ", " +
            "compField003=" + compField003 + ", " +
            "compField004=" + compField004 + ", " +
            "}";
    }
}
