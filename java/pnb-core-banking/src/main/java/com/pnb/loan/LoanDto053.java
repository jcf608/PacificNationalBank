package com.pnb.loan;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * LoanDto053 — Data Transfer Object for loan operations.
 * Variant 53 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LoanDto053 {

    @JsonProperty("loanField000")
    private LocalDate loanField000;

    @JsonProperty("loanField001")
    private Double loanField001;

    @JsonProperty("loanField002")
    private Boolean loanField002;

    @JsonProperty("loanField003")
    private Integer loanField003;

    @DecimalMin(value = "0.00")
    @JsonProperty("loanField004")
    private BigDecimal loanField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("loanField005")
    private BigDecimal loanField005;

    @JsonProperty("loanField006")
    private LocalDate loanField006;

    @JsonProperty("loanField007")
    private Integer loanField007;

    @JsonProperty("loanField008")
    private Double loanField008;

    @JsonProperty("loanField009")
    private LocalDate loanField009;

    @JsonProperty("loanField010")
    private Boolean loanField010;

    @JsonProperty("loanField011")
    private Double loanField011;

    @DecimalMin(value = "0.00")
    @JsonProperty("loanField012")
    private BigDecimal loanField012;

    public LoanDto053() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final LoanDto053 instance = new LoanDto053();

        public Builder loanField000(LocalDate val) { instance.loanField000 = val; return this; }
        public Builder loanField001(Double val) { instance.loanField001 = val; return this; }
        public Builder loanField002(Boolean val) { instance.loanField002 = val; return this; }
        public Builder loanField003(Integer val) { instance.loanField003 = val; return this; }
        public Builder loanField004(BigDecimal val) { instance.loanField004 = val; return this; }
        public Builder loanField005(BigDecimal val) { instance.loanField005 = val; return this; }
        public Builder loanField006(LocalDate val) { instance.loanField006 = val; return this; }
        public Builder loanField007(Integer val) { instance.loanField007 = val; return this; }
        public Builder loanField008(Double val) { instance.loanField008 = val; return this; }
        public Builder loanField009(LocalDate val) { instance.loanField009 = val; return this; }
        public Builder loanField010(Boolean val) { instance.loanField010 = val; return this; }
        public Builder loanField011(Double val) { instance.loanField011 = val; return this; }
        public Builder loanField012(BigDecimal val) { instance.loanField012 = val; return this; }
        public LoanDto053 build() { return instance; }
    }

    public LocalDate getLoanField000() { return loanField000; }
    public void setLoanField000(LocalDate loanField000) { this.loanField000 = loanField000; }

    public Double getLoanField001() { return loanField001; }
    public void setLoanField001(Double loanField001) { this.loanField001 = loanField001; }

    public Boolean getLoanField002() { return loanField002; }
    public void setLoanField002(Boolean loanField002) { this.loanField002 = loanField002; }

    public Integer getLoanField003() { return loanField003; }
    public void setLoanField003(Integer loanField003) { this.loanField003 = loanField003; }

    public BigDecimal getLoanField004() { return loanField004; }
    public void setLoanField004(BigDecimal loanField004) { this.loanField004 = loanField004; }

    public BigDecimal getLoanField005() { return loanField005; }
    public void setLoanField005(BigDecimal loanField005) { this.loanField005 = loanField005; }

    public LocalDate getLoanField006() { return loanField006; }
    public void setLoanField006(LocalDate loanField006) { this.loanField006 = loanField006; }

    public Integer getLoanField007() { return loanField007; }
    public void setLoanField007(Integer loanField007) { this.loanField007 = loanField007; }

    public Double getLoanField008() { return loanField008; }
    public void setLoanField008(Double loanField008) { this.loanField008 = loanField008; }

    public LocalDate getLoanField009() { return loanField009; }
    public void setLoanField009(LocalDate loanField009) { this.loanField009 = loanField009; }

    public Boolean getLoanField010() { return loanField010; }
    public void setLoanField010(Boolean loanField010) { this.loanField010 = loanField010; }

    public Double getLoanField011() { return loanField011; }
    public void setLoanField011(Double loanField011) { this.loanField011 = loanField011; }

    public BigDecimal getLoanField012() { return loanField012; }
    public void setLoanField012(BigDecimal loanField012) { this.loanField012 = loanField012; }

    @Override
    public String toString() {
        return "LoanDto053{" +
            "loanField000=" + loanField000 + ", " +
            "loanField001=" + loanField001 + ", " +
            "loanField002=" + loanField002 + ", " +
            "loanField003=" + loanField003 + ", " +
            "loanField004=" + loanField004 + ", " +
            "}";
    }
}
