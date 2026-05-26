package com.pnb.loan;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * LoanDto026 — Data Transfer Object for loan operations.
 * Variant 26 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LoanDto026 {

    @JsonProperty("loanField000")
    private Boolean loanField000;

    @DecimalMin(value = "0.00")
    @JsonProperty("loanField001")
    private BigDecimal loanField001;

    @JsonProperty("loanField002")
    private LocalDate loanField002;

    @JsonProperty("loanField003")
    private Double loanField003;

    @JsonProperty("loanField004")
    private LocalDate loanField004;

    @JsonProperty("loanField005")
    private Integer loanField005;

    @JsonProperty("loanField006")
    private Integer loanField006;

    @JsonProperty("loanField007")
    private Long loanField007;

    @Size(max = 20)
    @JsonProperty("loanField008")
    private String loanField008;

    @DecimalMin(value = "0.00")
    @JsonProperty("loanField009")
    private BigDecimal loanField009;

    public LoanDto026() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final LoanDto026 instance = new LoanDto026();

        public Builder loanField000(Boolean val) { instance.loanField000 = val; return this; }
        public Builder loanField001(BigDecimal val) { instance.loanField001 = val; return this; }
        public Builder loanField002(LocalDate val) { instance.loanField002 = val; return this; }
        public Builder loanField003(Double val) { instance.loanField003 = val; return this; }
        public Builder loanField004(LocalDate val) { instance.loanField004 = val; return this; }
        public Builder loanField005(Integer val) { instance.loanField005 = val; return this; }
        public Builder loanField006(Integer val) { instance.loanField006 = val; return this; }
        public Builder loanField007(Long val) { instance.loanField007 = val; return this; }
        public Builder loanField008(String val) { instance.loanField008 = val; return this; }
        public Builder loanField009(BigDecimal val) { instance.loanField009 = val; return this; }
        public LoanDto026 build() { return instance; }
    }

    public Boolean getLoanField000() { return loanField000; }
    public void setLoanField000(Boolean loanField000) { this.loanField000 = loanField000; }

    public BigDecimal getLoanField001() { return loanField001; }
    public void setLoanField001(BigDecimal loanField001) { this.loanField001 = loanField001; }

    public LocalDate getLoanField002() { return loanField002; }
    public void setLoanField002(LocalDate loanField002) { this.loanField002 = loanField002; }

    public Double getLoanField003() { return loanField003; }
    public void setLoanField003(Double loanField003) { this.loanField003 = loanField003; }

    public LocalDate getLoanField004() { return loanField004; }
    public void setLoanField004(LocalDate loanField004) { this.loanField004 = loanField004; }

    public Integer getLoanField005() { return loanField005; }
    public void setLoanField005(Integer loanField005) { this.loanField005 = loanField005; }

    public Integer getLoanField006() { return loanField006; }
    public void setLoanField006(Integer loanField006) { this.loanField006 = loanField006; }

    public Long getLoanField007() { return loanField007; }
    public void setLoanField007(Long loanField007) { this.loanField007 = loanField007; }

    public String getLoanField008() { return loanField008; }
    public void setLoanField008(String loanField008) { this.loanField008 = loanField008; }

    public BigDecimal getLoanField009() { return loanField009; }
    public void setLoanField009(BigDecimal loanField009) { this.loanField009 = loanField009; }

    @Override
    public String toString() {
        return "LoanDto026{" +
            "loanField000=" + loanField000 + ", " +
            "loanField001=" + loanField001 + ", " +
            "loanField002=" + loanField002 + ", " +
            "loanField003=" + loanField003 + ", " +
            "loanField004=" + loanField004 + ", " +
            "}";
    }
}
