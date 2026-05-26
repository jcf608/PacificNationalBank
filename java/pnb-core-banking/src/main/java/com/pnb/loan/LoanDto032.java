package com.pnb.loan;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * LoanDto032 — Data Transfer Object for loan operations.
 * Variant 32 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LoanDto032 {

    @JsonProperty("loanField000")
    private Boolean loanField000;

    @Size(max = 40)
    @JsonProperty("loanField001")
    private String loanField001;

    @JsonProperty("loanField002")
    private Double loanField002;

    @JsonProperty("loanField003")
    private Double loanField003;

    @JsonProperty("loanField004")
    private Long loanField004;

    @JsonProperty("loanField005")
    private Boolean loanField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("loanField006")
    private BigDecimal loanField006;

    @JsonProperty("loanField007")
    private Boolean loanField007;

    @JsonProperty("loanField008")
    private Long loanField008;

    @JsonProperty("loanField009")
    private Long loanField009;

    @JsonProperty("loanField010")
    private Double loanField010;

    @JsonProperty("loanField011")
    private Integer loanField011;

    @JsonProperty("loanField012")
    private Boolean loanField012;

    @Size(max = 60)
    @JsonProperty("loanField013")
    private String loanField013;

    @JsonProperty("loanField014")
    private LocalDate loanField014;

    @DecimalMin(value = "0.00")
    @JsonProperty("loanField015")
    private BigDecimal loanField015;

    public LoanDto032() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final LoanDto032 instance = new LoanDto032();

        public Builder loanField000(Boolean val) { instance.loanField000 = val; return this; }
        public Builder loanField001(String val) { instance.loanField001 = val; return this; }
        public Builder loanField002(Double val) { instance.loanField002 = val; return this; }
        public Builder loanField003(Double val) { instance.loanField003 = val; return this; }
        public Builder loanField004(Long val) { instance.loanField004 = val; return this; }
        public Builder loanField005(Boolean val) { instance.loanField005 = val; return this; }
        public Builder loanField006(BigDecimal val) { instance.loanField006 = val; return this; }
        public Builder loanField007(Boolean val) { instance.loanField007 = val; return this; }
        public Builder loanField008(Long val) { instance.loanField008 = val; return this; }
        public Builder loanField009(Long val) { instance.loanField009 = val; return this; }
        public Builder loanField010(Double val) { instance.loanField010 = val; return this; }
        public Builder loanField011(Integer val) { instance.loanField011 = val; return this; }
        public Builder loanField012(Boolean val) { instance.loanField012 = val; return this; }
        public Builder loanField013(String val) { instance.loanField013 = val; return this; }
        public Builder loanField014(LocalDate val) { instance.loanField014 = val; return this; }
        public Builder loanField015(BigDecimal val) { instance.loanField015 = val; return this; }
        public LoanDto032 build() { return instance; }
    }

    public Boolean getLoanField000() { return loanField000; }
    public void setLoanField000(Boolean loanField000) { this.loanField000 = loanField000; }

    public String getLoanField001() { return loanField001; }
    public void setLoanField001(String loanField001) { this.loanField001 = loanField001; }

    public Double getLoanField002() { return loanField002; }
    public void setLoanField002(Double loanField002) { this.loanField002 = loanField002; }

    public Double getLoanField003() { return loanField003; }
    public void setLoanField003(Double loanField003) { this.loanField003 = loanField003; }

    public Long getLoanField004() { return loanField004; }
    public void setLoanField004(Long loanField004) { this.loanField004 = loanField004; }

    public Boolean getLoanField005() { return loanField005; }
    public void setLoanField005(Boolean loanField005) { this.loanField005 = loanField005; }

    public BigDecimal getLoanField006() { return loanField006; }
    public void setLoanField006(BigDecimal loanField006) { this.loanField006 = loanField006; }

    public Boolean getLoanField007() { return loanField007; }
    public void setLoanField007(Boolean loanField007) { this.loanField007 = loanField007; }

    public Long getLoanField008() { return loanField008; }
    public void setLoanField008(Long loanField008) { this.loanField008 = loanField008; }

    public Long getLoanField009() { return loanField009; }
    public void setLoanField009(Long loanField009) { this.loanField009 = loanField009; }

    public Double getLoanField010() { return loanField010; }
    public void setLoanField010(Double loanField010) { this.loanField010 = loanField010; }

    public Integer getLoanField011() { return loanField011; }
    public void setLoanField011(Integer loanField011) { this.loanField011 = loanField011; }

    public Boolean getLoanField012() { return loanField012; }
    public void setLoanField012(Boolean loanField012) { this.loanField012 = loanField012; }

    public String getLoanField013() { return loanField013; }
    public void setLoanField013(String loanField013) { this.loanField013 = loanField013; }

    public LocalDate getLoanField014() { return loanField014; }
    public void setLoanField014(LocalDate loanField014) { this.loanField014 = loanField014; }

    public BigDecimal getLoanField015() { return loanField015; }
    public void setLoanField015(BigDecimal loanField015) { this.loanField015 = loanField015; }

    @Override
    public String toString() {
        return "LoanDto032{" +
            "loanField000=" + loanField000 + ", " +
            "loanField001=" + loanField001 + ", " +
            "loanField002=" + loanField002 + ", " +
            "loanField003=" + loanField003 + ", " +
            "loanField004=" + loanField004 + ", " +
            "}";
    }
}
