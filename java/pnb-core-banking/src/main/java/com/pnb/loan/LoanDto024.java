package com.pnb.loan;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * LoanDto024 — Data Transfer Object for loan operations.
 * Variant 24 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LoanDto024 {

    @Size(max = 100)
    @JsonProperty("loanField000")
    private String loanField000;

    @JsonProperty("loanField001")
    private Double loanField001;

    @JsonProperty("loanField002")
    private LocalDate loanField002;

    @Size(max = 60)
    @JsonProperty("loanField003")
    private String loanField003;

    @JsonProperty("loanField004")
    private Long loanField004;

    @JsonProperty("loanField005")
    private Boolean loanField005;

    @JsonProperty("loanField006")
    private Double loanField006;

    @JsonProperty("loanField007")
    private Long loanField007;

    public LoanDto024() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final LoanDto024 instance = new LoanDto024();

        public Builder loanField000(String val) { instance.loanField000 = val; return this; }
        public Builder loanField001(Double val) { instance.loanField001 = val; return this; }
        public Builder loanField002(LocalDate val) { instance.loanField002 = val; return this; }
        public Builder loanField003(String val) { instance.loanField003 = val; return this; }
        public Builder loanField004(Long val) { instance.loanField004 = val; return this; }
        public Builder loanField005(Boolean val) { instance.loanField005 = val; return this; }
        public Builder loanField006(Double val) { instance.loanField006 = val; return this; }
        public Builder loanField007(Long val) { instance.loanField007 = val; return this; }
        public LoanDto024 build() { return instance; }
    }

    public String getLoanField000() { return loanField000; }
    public void setLoanField000(String loanField000) { this.loanField000 = loanField000; }

    public Double getLoanField001() { return loanField001; }
    public void setLoanField001(Double loanField001) { this.loanField001 = loanField001; }

    public LocalDate getLoanField002() { return loanField002; }
    public void setLoanField002(LocalDate loanField002) { this.loanField002 = loanField002; }

    public String getLoanField003() { return loanField003; }
    public void setLoanField003(String loanField003) { this.loanField003 = loanField003; }

    public Long getLoanField004() { return loanField004; }
    public void setLoanField004(Long loanField004) { this.loanField004 = loanField004; }

    public Boolean getLoanField005() { return loanField005; }
    public void setLoanField005(Boolean loanField005) { this.loanField005 = loanField005; }

    public Double getLoanField006() { return loanField006; }
    public void setLoanField006(Double loanField006) { this.loanField006 = loanField006; }

    public Long getLoanField007() { return loanField007; }
    public void setLoanField007(Long loanField007) { this.loanField007 = loanField007; }

    @Override
    public String toString() {
        return "LoanDto024{" +
            "loanField000=" + loanField000 + ", " +
            "loanField001=" + loanField001 + ", " +
            "loanField002=" + loanField002 + ", " +
            "loanField003=" + loanField003 + ", " +
            "loanField004=" + loanField004 + ", " +
            "}";
    }
}
