package com.pnb.loan;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * LoanDto037 — Data Transfer Object for loan operations.
 * Variant 37 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LoanDto037 {

    @JsonProperty("loanField000")
    private Double loanField000;

    @JsonProperty("loanField001")
    private Double loanField001;

    @JsonProperty("loanField002")
    private Boolean loanField002;

    @Size(max = 20)
    @JsonProperty("loanField003")
    private String loanField003;

    @JsonProperty("loanField004")
    private Integer loanField004;

    @Size(max = 40)
    @JsonProperty("loanField005")
    private String loanField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("loanField006")
    private BigDecimal loanField006;

    @JsonProperty("loanField007")
    private LocalDate loanField007;

    @JsonProperty("loanField008")
    private LocalDate loanField008;

    public LoanDto037() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final LoanDto037 instance = new LoanDto037();

        public Builder loanField000(Double val) { instance.loanField000 = val; return this; }
        public Builder loanField001(Double val) { instance.loanField001 = val; return this; }
        public Builder loanField002(Boolean val) { instance.loanField002 = val; return this; }
        public Builder loanField003(String val) { instance.loanField003 = val; return this; }
        public Builder loanField004(Integer val) { instance.loanField004 = val; return this; }
        public Builder loanField005(String val) { instance.loanField005 = val; return this; }
        public Builder loanField006(BigDecimal val) { instance.loanField006 = val; return this; }
        public Builder loanField007(LocalDate val) { instance.loanField007 = val; return this; }
        public Builder loanField008(LocalDate val) { instance.loanField008 = val; return this; }
        public LoanDto037 build() { return instance; }
    }

    public Double getLoanField000() { return loanField000; }
    public void setLoanField000(Double loanField000) { this.loanField000 = loanField000; }

    public Double getLoanField001() { return loanField001; }
    public void setLoanField001(Double loanField001) { this.loanField001 = loanField001; }

    public Boolean getLoanField002() { return loanField002; }
    public void setLoanField002(Boolean loanField002) { this.loanField002 = loanField002; }

    public String getLoanField003() { return loanField003; }
    public void setLoanField003(String loanField003) { this.loanField003 = loanField003; }

    public Integer getLoanField004() { return loanField004; }
    public void setLoanField004(Integer loanField004) { this.loanField004 = loanField004; }

    public String getLoanField005() { return loanField005; }
    public void setLoanField005(String loanField005) { this.loanField005 = loanField005; }

    public BigDecimal getLoanField006() { return loanField006; }
    public void setLoanField006(BigDecimal loanField006) { this.loanField006 = loanField006; }

    public LocalDate getLoanField007() { return loanField007; }
    public void setLoanField007(LocalDate loanField007) { this.loanField007 = loanField007; }

    public LocalDate getLoanField008() { return loanField008; }
    public void setLoanField008(LocalDate loanField008) { this.loanField008 = loanField008; }

    @Override
    public String toString() {
        return "LoanDto037{" +
            "loanField000=" + loanField000 + ", " +
            "loanField001=" + loanField001 + ", " +
            "loanField002=" + loanField002 + ", " +
            "loanField003=" + loanField003 + ", " +
            "loanField004=" + loanField004 + ", " +
            "}";
    }
}
