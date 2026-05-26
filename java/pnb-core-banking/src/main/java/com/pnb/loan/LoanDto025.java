package com.pnb.loan;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * LoanDto025 — Data Transfer Object for loan operations.
 * Variant 25 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LoanDto025 {

    @JsonProperty("loanField000")
    private LocalDate loanField000;

    @JsonProperty("loanField001")
    private Integer loanField001;

    @JsonProperty("loanField002")
    private Double loanField002;

    @DecimalMin(value = "0.00")
    @JsonProperty("loanField003")
    private BigDecimal loanField003;

    @JsonProperty("loanField004")
    private Long loanField004;

    @JsonProperty("loanField005")
    private Boolean loanField005;

    @JsonProperty("loanField006")
    private Boolean loanField006;

    @JsonProperty("loanField007")
    private Boolean loanField007;

    @Size(max = 100)
    @JsonProperty("loanField008")
    private String loanField008;

    public LoanDto025() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final LoanDto025 instance = new LoanDto025();

        public Builder loanField000(LocalDate val) { instance.loanField000 = val; return this; }
        public Builder loanField001(Integer val) { instance.loanField001 = val; return this; }
        public Builder loanField002(Double val) { instance.loanField002 = val; return this; }
        public Builder loanField003(BigDecimal val) { instance.loanField003 = val; return this; }
        public Builder loanField004(Long val) { instance.loanField004 = val; return this; }
        public Builder loanField005(Boolean val) { instance.loanField005 = val; return this; }
        public Builder loanField006(Boolean val) { instance.loanField006 = val; return this; }
        public Builder loanField007(Boolean val) { instance.loanField007 = val; return this; }
        public Builder loanField008(String val) { instance.loanField008 = val; return this; }
        public LoanDto025 build() { return instance; }
    }

    public LocalDate getLoanField000() { return loanField000; }
    public void setLoanField000(LocalDate loanField000) { this.loanField000 = loanField000; }

    public Integer getLoanField001() { return loanField001; }
    public void setLoanField001(Integer loanField001) { this.loanField001 = loanField001; }

    public Double getLoanField002() { return loanField002; }
    public void setLoanField002(Double loanField002) { this.loanField002 = loanField002; }

    public BigDecimal getLoanField003() { return loanField003; }
    public void setLoanField003(BigDecimal loanField003) { this.loanField003 = loanField003; }

    public Long getLoanField004() { return loanField004; }
    public void setLoanField004(Long loanField004) { this.loanField004 = loanField004; }

    public Boolean getLoanField005() { return loanField005; }
    public void setLoanField005(Boolean loanField005) { this.loanField005 = loanField005; }

    public Boolean getLoanField006() { return loanField006; }
    public void setLoanField006(Boolean loanField006) { this.loanField006 = loanField006; }

    public Boolean getLoanField007() { return loanField007; }
    public void setLoanField007(Boolean loanField007) { this.loanField007 = loanField007; }

    public String getLoanField008() { return loanField008; }
    public void setLoanField008(String loanField008) { this.loanField008 = loanField008; }

    @Override
    public String toString() {
        return "LoanDto025{" +
            "loanField000=" + loanField000 + ", " +
            "loanField001=" + loanField001 + ", " +
            "loanField002=" + loanField002 + ", " +
            "loanField003=" + loanField003 + ", " +
            "loanField004=" + loanField004 + ", " +
            "}";
    }
}
