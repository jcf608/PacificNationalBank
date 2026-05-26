package com.pnb.loan;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * LoanDto049 — Data Transfer Object for loan operations.
 * Variant 49 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LoanDto049 {

    @JsonProperty("loanField000")
    private Long loanField000;

    @DecimalMin(value = "0.00")
    @JsonProperty("loanField001")
    private BigDecimal loanField001;

    @JsonProperty("loanField002")
    private Long loanField002;

    @JsonProperty("loanField003")
    private LocalDate loanField003;

    @Size(max = 40)
    @JsonProperty("loanField004")
    private String loanField004;

    @JsonProperty("loanField005")
    private Integer loanField005;

    @JsonProperty("loanField006")
    private LocalDate loanField006;

    @JsonProperty("loanField007")
    private Long loanField007;

    @JsonProperty("loanField008")
    private Long loanField008;

    public LoanDto049() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final LoanDto049 instance = new LoanDto049();

        public Builder loanField000(Long val) { instance.loanField000 = val; return this; }
        public Builder loanField001(BigDecimal val) { instance.loanField001 = val; return this; }
        public Builder loanField002(Long val) { instance.loanField002 = val; return this; }
        public Builder loanField003(LocalDate val) { instance.loanField003 = val; return this; }
        public Builder loanField004(String val) { instance.loanField004 = val; return this; }
        public Builder loanField005(Integer val) { instance.loanField005 = val; return this; }
        public Builder loanField006(LocalDate val) { instance.loanField006 = val; return this; }
        public Builder loanField007(Long val) { instance.loanField007 = val; return this; }
        public Builder loanField008(Long val) { instance.loanField008 = val; return this; }
        public LoanDto049 build() { return instance; }
    }

    public Long getLoanField000() { return loanField000; }
    public void setLoanField000(Long loanField000) { this.loanField000 = loanField000; }

    public BigDecimal getLoanField001() { return loanField001; }
    public void setLoanField001(BigDecimal loanField001) { this.loanField001 = loanField001; }

    public Long getLoanField002() { return loanField002; }
    public void setLoanField002(Long loanField002) { this.loanField002 = loanField002; }

    public LocalDate getLoanField003() { return loanField003; }
    public void setLoanField003(LocalDate loanField003) { this.loanField003 = loanField003; }

    public String getLoanField004() { return loanField004; }
    public void setLoanField004(String loanField004) { this.loanField004 = loanField004; }

    public Integer getLoanField005() { return loanField005; }
    public void setLoanField005(Integer loanField005) { this.loanField005 = loanField005; }

    public LocalDate getLoanField006() { return loanField006; }
    public void setLoanField006(LocalDate loanField006) { this.loanField006 = loanField006; }

    public Long getLoanField007() { return loanField007; }
    public void setLoanField007(Long loanField007) { this.loanField007 = loanField007; }

    public Long getLoanField008() { return loanField008; }
    public void setLoanField008(Long loanField008) { this.loanField008 = loanField008; }

    @Override
    public String toString() {
        return "LoanDto049{" +
            "loanField000=" + loanField000 + ", " +
            "loanField001=" + loanField001 + ", " +
            "loanField002=" + loanField002 + ", " +
            "loanField003=" + loanField003 + ", " +
            "loanField004=" + loanField004 + ", " +
            "}";
    }
}
