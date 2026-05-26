package com.pnb.loan;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * LoanDto027 — Data Transfer Object for loan operations.
 * Variant 27 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LoanDto027 {

    @JsonProperty("loanField000")
    private LocalDate loanField000;

    @JsonProperty("loanField001")
    private Integer loanField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("loanField002")
    private BigDecimal loanField002;

    @JsonProperty("loanField003")
    private Double loanField003;

    @Size(max = 40)
    @JsonProperty("loanField004")
    private String loanField004;

    @JsonProperty("loanField005")
    private Long loanField005;

    @JsonProperty("loanField006")
    private Boolean loanField006;

    @JsonProperty("loanField007")
    private Long loanField007;

    @JsonProperty("loanField008")
    private LocalDate loanField008;

    @JsonProperty("loanField009")
    private Boolean loanField009;

    @JsonProperty("loanField010")
    private Integer loanField010;

    public LoanDto027() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final LoanDto027 instance = new LoanDto027();

        public Builder loanField000(LocalDate val) { instance.loanField000 = val; return this; }
        public Builder loanField001(Integer val) { instance.loanField001 = val; return this; }
        public Builder loanField002(BigDecimal val) { instance.loanField002 = val; return this; }
        public Builder loanField003(Double val) { instance.loanField003 = val; return this; }
        public Builder loanField004(String val) { instance.loanField004 = val; return this; }
        public Builder loanField005(Long val) { instance.loanField005 = val; return this; }
        public Builder loanField006(Boolean val) { instance.loanField006 = val; return this; }
        public Builder loanField007(Long val) { instance.loanField007 = val; return this; }
        public Builder loanField008(LocalDate val) { instance.loanField008 = val; return this; }
        public Builder loanField009(Boolean val) { instance.loanField009 = val; return this; }
        public Builder loanField010(Integer val) { instance.loanField010 = val; return this; }
        public LoanDto027 build() { return instance; }
    }

    public LocalDate getLoanField000() { return loanField000; }
    public void setLoanField000(LocalDate loanField000) { this.loanField000 = loanField000; }

    public Integer getLoanField001() { return loanField001; }
    public void setLoanField001(Integer loanField001) { this.loanField001 = loanField001; }

    public BigDecimal getLoanField002() { return loanField002; }
    public void setLoanField002(BigDecimal loanField002) { this.loanField002 = loanField002; }

    public Double getLoanField003() { return loanField003; }
    public void setLoanField003(Double loanField003) { this.loanField003 = loanField003; }

    public String getLoanField004() { return loanField004; }
    public void setLoanField004(String loanField004) { this.loanField004 = loanField004; }

    public Long getLoanField005() { return loanField005; }
    public void setLoanField005(Long loanField005) { this.loanField005 = loanField005; }

    public Boolean getLoanField006() { return loanField006; }
    public void setLoanField006(Boolean loanField006) { this.loanField006 = loanField006; }

    public Long getLoanField007() { return loanField007; }
    public void setLoanField007(Long loanField007) { this.loanField007 = loanField007; }

    public LocalDate getLoanField008() { return loanField008; }
    public void setLoanField008(LocalDate loanField008) { this.loanField008 = loanField008; }

    public Boolean getLoanField009() { return loanField009; }
    public void setLoanField009(Boolean loanField009) { this.loanField009 = loanField009; }

    public Integer getLoanField010() { return loanField010; }
    public void setLoanField010(Integer loanField010) { this.loanField010 = loanField010; }

    @Override
    public String toString() {
        return "LoanDto027{" +
            "loanField000=" + loanField000 + ", " +
            "loanField001=" + loanField001 + ", " +
            "loanField002=" + loanField002 + ", " +
            "loanField003=" + loanField003 + ", " +
            "loanField004=" + loanField004 + ", " +
            "}";
    }
}
