package com.pnb.loan;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * LoanDto039 — Data Transfer Object for loan operations.
 * Variant 39 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LoanDto039 {

    @JsonProperty("loanField000")
    private LocalDate loanField000;

    @Size(max = 40)
    @JsonProperty("loanField001")
    private String loanField001;

    @JsonProperty("loanField002")
    private LocalDate loanField002;

    @JsonProperty("loanField003")
    private LocalDate loanField003;

    @JsonProperty("loanField004")
    private Boolean loanField004;

    @JsonProperty("loanField005")
    private Boolean loanField005;

    @Size(max = 20)
    @JsonProperty("loanField006")
    private String loanField006;

    @JsonProperty("loanField007")
    private Double loanField007;

    @JsonProperty("loanField008")
    private Long loanField008;

    @JsonProperty("loanField009")
    private Boolean loanField009;

    @JsonProperty("loanField010")
    private Integer loanField010;

    public LoanDto039() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final LoanDto039 instance = new LoanDto039();

        public Builder loanField000(LocalDate val) { instance.loanField000 = val; return this; }
        public Builder loanField001(String val) { instance.loanField001 = val; return this; }
        public Builder loanField002(LocalDate val) { instance.loanField002 = val; return this; }
        public Builder loanField003(LocalDate val) { instance.loanField003 = val; return this; }
        public Builder loanField004(Boolean val) { instance.loanField004 = val; return this; }
        public Builder loanField005(Boolean val) { instance.loanField005 = val; return this; }
        public Builder loanField006(String val) { instance.loanField006 = val; return this; }
        public Builder loanField007(Double val) { instance.loanField007 = val; return this; }
        public Builder loanField008(Long val) { instance.loanField008 = val; return this; }
        public Builder loanField009(Boolean val) { instance.loanField009 = val; return this; }
        public Builder loanField010(Integer val) { instance.loanField010 = val; return this; }
        public LoanDto039 build() { return instance; }
    }

    public LocalDate getLoanField000() { return loanField000; }
    public void setLoanField000(LocalDate loanField000) { this.loanField000 = loanField000; }

    public String getLoanField001() { return loanField001; }
    public void setLoanField001(String loanField001) { this.loanField001 = loanField001; }

    public LocalDate getLoanField002() { return loanField002; }
    public void setLoanField002(LocalDate loanField002) { this.loanField002 = loanField002; }

    public LocalDate getLoanField003() { return loanField003; }
    public void setLoanField003(LocalDate loanField003) { this.loanField003 = loanField003; }

    public Boolean getLoanField004() { return loanField004; }
    public void setLoanField004(Boolean loanField004) { this.loanField004 = loanField004; }

    public Boolean getLoanField005() { return loanField005; }
    public void setLoanField005(Boolean loanField005) { this.loanField005 = loanField005; }

    public String getLoanField006() { return loanField006; }
    public void setLoanField006(String loanField006) { this.loanField006 = loanField006; }

    public Double getLoanField007() { return loanField007; }
    public void setLoanField007(Double loanField007) { this.loanField007 = loanField007; }

    public Long getLoanField008() { return loanField008; }
    public void setLoanField008(Long loanField008) { this.loanField008 = loanField008; }

    public Boolean getLoanField009() { return loanField009; }
    public void setLoanField009(Boolean loanField009) { this.loanField009 = loanField009; }

    public Integer getLoanField010() { return loanField010; }
    public void setLoanField010(Integer loanField010) { this.loanField010 = loanField010; }

    @Override
    public String toString() {
        return "LoanDto039{" +
            "loanField000=" + loanField000 + ", " +
            "loanField001=" + loanField001 + ", " +
            "loanField002=" + loanField002 + ", " +
            "loanField003=" + loanField003 + ", " +
            "loanField004=" + loanField004 + ", " +
            "}";
    }
}
