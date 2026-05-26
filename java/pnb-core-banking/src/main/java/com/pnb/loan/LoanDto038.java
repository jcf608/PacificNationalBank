package com.pnb.loan;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * LoanDto038 — Data Transfer Object for loan operations.
 * Variant 38 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LoanDto038 {

    @JsonProperty("loanField000")
    private Double loanField000;

    @DecimalMin(value = "0.00")
    @JsonProperty("loanField001")
    private BigDecimal loanField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("loanField002")
    private BigDecimal loanField002;

    @JsonProperty("loanField003")
    private Boolean loanField003;

    @JsonProperty("loanField004")
    private Long loanField004;

    @JsonProperty("loanField005")
    private Boolean loanField005;

    @JsonProperty("loanField006")
    private LocalDate loanField006;

    @JsonProperty("loanField007")
    private Boolean loanField007;

    @Size(max = 40)
    @JsonProperty("loanField008")
    private String loanField008;

    @JsonProperty("loanField009")
    private Long loanField009;

    public LoanDto038() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final LoanDto038 instance = new LoanDto038();

        public Builder loanField000(Double val) { instance.loanField000 = val; return this; }
        public Builder loanField001(BigDecimal val) { instance.loanField001 = val; return this; }
        public Builder loanField002(BigDecimal val) { instance.loanField002 = val; return this; }
        public Builder loanField003(Boolean val) { instance.loanField003 = val; return this; }
        public Builder loanField004(Long val) { instance.loanField004 = val; return this; }
        public Builder loanField005(Boolean val) { instance.loanField005 = val; return this; }
        public Builder loanField006(LocalDate val) { instance.loanField006 = val; return this; }
        public Builder loanField007(Boolean val) { instance.loanField007 = val; return this; }
        public Builder loanField008(String val) { instance.loanField008 = val; return this; }
        public Builder loanField009(Long val) { instance.loanField009 = val; return this; }
        public LoanDto038 build() { return instance; }
    }

    public Double getLoanField000() { return loanField000; }
    public void setLoanField000(Double loanField000) { this.loanField000 = loanField000; }

    public BigDecimal getLoanField001() { return loanField001; }
    public void setLoanField001(BigDecimal loanField001) { this.loanField001 = loanField001; }

    public BigDecimal getLoanField002() { return loanField002; }
    public void setLoanField002(BigDecimal loanField002) { this.loanField002 = loanField002; }

    public Boolean getLoanField003() { return loanField003; }
    public void setLoanField003(Boolean loanField003) { this.loanField003 = loanField003; }

    public Long getLoanField004() { return loanField004; }
    public void setLoanField004(Long loanField004) { this.loanField004 = loanField004; }

    public Boolean getLoanField005() { return loanField005; }
    public void setLoanField005(Boolean loanField005) { this.loanField005 = loanField005; }

    public LocalDate getLoanField006() { return loanField006; }
    public void setLoanField006(LocalDate loanField006) { this.loanField006 = loanField006; }

    public Boolean getLoanField007() { return loanField007; }
    public void setLoanField007(Boolean loanField007) { this.loanField007 = loanField007; }

    public String getLoanField008() { return loanField008; }
    public void setLoanField008(String loanField008) { this.loanField008 = loanField008; }

    public Long getLoanField009() { return loanField009; }
    public void setLoanField009(Long loanField009) { this.loanField009 = loanField009; }

    @Override
    public String toString() {
        return "LoanDto038{" +
            "loanField000=" + loanField000 + ", " +
            "loanField001=" + loanField001 + ", " +
            "loanField002=" + loanField002 + ", " +
            "loanField003=" + loanField003 + ", " +
            "loanField004=" + loanField004 + ", " +
            "}";
    }
}
