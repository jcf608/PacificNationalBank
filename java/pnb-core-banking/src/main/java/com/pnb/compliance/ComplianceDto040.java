package com.pnb.compliance;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * ComplianceDto040 — Data Transfer Object for compliance operations.
 * Variant 40 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ComplianceDto040 {

    @Size(max = 100)
    @JsonProperty("compField000")
    private String compField000;

    @JsonProperty("compField001")
    private Boolean compField001;

    @Size(max = 60)
    @JsonProperty("compField002")
    private String compField002;

    @JsonProperty("compField003")
    private Long compField003;

    @Size(max = 60)
    @JsonProperty("compField004")
    private String compField004;

    @JsonProperty("compField005")
    private Integer compField005;

    @JsonProperty("compField006")
    private Double compField006;

    @JsonProperty("compField007")
    private Integer compField007;

    @JsonProperty("compField008")
    private LocalDate compField008;

    @JsonProperty("compField009")
    private Long compField009;

    @JsonProperty("compField010")
    private Boolean compField010;

    @JsonProperty("compField011")
    private LocalDate compField011;

    public ComplianceDto040() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final ComplianceDto040 instance = new ComplianceDto040();

        public Builder compField000(String val) { instance.compField000 = val; return this; }
        public Builder compField001(Boolean val) { instance.compField001 = val; return this; }
        public Builder compField002(String val) { instance.compField002 = val; return this; }
        public Builder compField003(Long val) { instance.compField003 = val; return this; }
        public Builder compField004(String val) { instance.compField004 = val; return this; }
        public Builder compField005(Integer val) { instance.compField005 = val; return this; }
        public Builder compField006(Double val) { instance.compField006 = val; return this; }
        public Builder compField007(Integer val) { instance.compField007 = val; return this; }
        public Builder compField008(LocalDate val) { instance.compField008 = val; return this; }
        public Builder compField009(Long val) { instance.compField009 = val; return this; }
        public Builder compField010(Boolean val) { instance.compField010 = val; return this; }
        public Builder compField011(LocalDate val) { instance.compField011 = val; return this; }
        public ComplianceDto040 build() { return instance; }
    }

    public String getCompField000() { return compField000; }
    public void setCompField000(String compField000) { this.compField000 = compField000; }

    public Boolean getCompField001() { return compField001; }
    public void setCompField001(Boolean compField001) { this.compField001 = compField001; }

    public String getCompField002() { return compField002; }
    public void setCompField002(String compField002) { this.compField002 = compField002; }

    public Long getCompField003() { return compField003; }
    public void setCompField003(Long compField003) { this.compField003 = compField003; }

    public String getCompField004() { return compField004; }
    public void setCompField004(String compField004) { this.compField004 = compField004; }

    public Integer getCompField005() { return compField005; }
    public void setCompField005(Integer compField005) { this.compField005 = compField005; }

    public Double getCompField006() { return compField006; }
    public void setCompField006(Double compField006) { this.compField006 = compField006; }

    public Integer getCompField007() { return compField007; }
    public void setCompField007(Integer compField007) { this.compField007 = compField007; }

    public LocalDate getCompField008() { return compField008; }
    public void setCompField008(LocalDate compField008) { this.compField008 = compField008; }

    public Long getCompField009() { return compField009; }
    public void setCompField009(Long compField009) { this.compField009 = compField009; }

    public Boolean getCompField010() { return compField010; }
    public void setCompField010(Boolean compField010) { this.compField010 = compField010; }

    public LocalDate getCompField011() { return compField011; }
    public void setCompField011(LocalDate compField011) { this.compField011 = compField011; }

    @Override
    public String toString() {
        return "ComplianceDto040{" +
            "compField000=" + compField000 + ", " +
            "compField001=" + compField001 + ", " +
            "compField002=" + compField002 + ", " +
            "compField003=" + compField003 + ", " +
            "compField004=" + compField004 + ", " +
            "}";
    }
}
