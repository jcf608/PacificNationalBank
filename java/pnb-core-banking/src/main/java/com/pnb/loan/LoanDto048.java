package com.pnb.loan;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * LoanDto048 — Data Transfer Object for loan operations.
 * Variant 48 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LoanDto048 {

    @JsonProperty("loanField000")
    private Boolean loanField000;

    @JsonProperty("loanField001")
    private LocalDate loanField001;

    @JsonProperty("loanField002")
    private Double loanField002;

    @DecimalMin(value = "0.00")
    @JsonProperty("loanField003")
    private BigDecimal loanField003;

    @JsonProperty("loanField004")
    private LocalDate loanField004;

    @JsonProperty("loanField005")
    private Boolean loanField005;

    @Size(max = 200)
    @JsonProperty("loanField006")
    private String loanField006;

    @JsonProperty("loanField007")
    private Double loanField007;

    public LoanDto048() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final LoanDto048 instance = new LoanDto048();

        public Builder loanField000(Boolean val) { instance.loanField000 = val; return this; }
        public Builder loanField001(LocalDate val) { instance.loanField001 = val; return this; }
        public Builder loanField002(Double val) { instance.loanField002 = val; return this; }
        public Builder loanField003(BigDecimal val) { instance.loanField003 = val; return this; }
        public Builder loanField004(LocalDate val) { instance.loanField004 = val; return this; }
        public Builder loanField005(Boolean val) { instance.loanField005 = val; return this; }
        public Builder loanField006(String val) { instance.loanField006 = val; return this; }
        public Builder loanField007(Double val) { instance.loanField007 = val; return this; }
        public LoanDto048 build() { return instance; }
    }

    public Boolean getLoanField000() { return loanField000; }
    public void setLoanField000(Boolean loanField000) { this.loanField000 = loanField000; }

    public LocalDate getLoanField001() { return loanField001; }
    public void setLoanField001(LocalDate loanField001) { this.loanField001 = loanField001; }

    public Double getLoanField002() { return loanField002; }
    public void setLoanField002(Double loanField002) { this.loanField002 = loanField002; }

    public BigDecimal getLoanField003() { return loanField003; }
    public void setLoanField003(BigDecimal loanField003) { this.loanField003 = loanField003; }

    public LocalDate getLoanField004() { return loanField004; }
    public void setLoanField004(LocalDate loanField004) { this.loanField004 = loanField004; }

    public Boolean getLoanField005() { return loanField005; }
    public void setLoanField005(Boolean loanField005) { this.loanField005 = loanField005; }

    public String getLoanField006() { return loanField006; }
    public void setLoanField006(String loanField006) { this.loanField006 = loanField006; }

    public Double getLoanField007() { return loanField007; }
    public void setLoanField007(Double loanField007) { this.loanField007 = loanField007; }

    @Override
    public String toString() {
        return "LoanDto048{" +
            "loanField000=" + loanField000 + ", " +
            "loanField001=" + loanField001 + ", " +
            "loanField002=" + loanField002 + ", " +
            "loanField003=" + loanField003 + ", " +
            "loanField004=" + loanField004 + ", " +
            "}";
    }
}
