package com.pnb.loan;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * LoanDto051 — Data Transfer Object for loan operations.
 * Variant 51 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LoanDto051 {

    @JsonProperty("loanField000")
    private Boolean loanField000;

    @JsonProperty("loanField001")
    private Integer loanField001;

    @JsonProperty("loanField002")
    private Double loanField002;

    @JsonProperty("loanField003")
    private Integer loanField003;

    @JsonProperty("loanField004")
    private Long loanField004;

    @Size(max = 60)
    @JsonProperty("loanField005")
    private String loanField005;

    @JsonProperty("loanField006")
    private Long loanField006;

    @JsonProperty("loanField007")
    private LocalDate loanField007;

    @JsonProperty("loanField008")
    private Long loanField008;

    @JsonProperty("loanField009")
    private Double loanField009;

    @Size(max = 20)
    @JsonProperty("loanField010")
    private String loanField010;

    public LoanDto051() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final LoanDto051 instance = new LoanDto051();

        public Builder loanField000(Boolean val) { instance.loanField000 = val; return this; }
        public Builder loanField001(Integer val) { instance.loanField001 = val; return this; }
        public Builder loanField002(Double val) { instance.loanField002 = val; return this; }
        public Builder loanField003(Integer val) { instance.loanField003 = val; return this; }
        public Builder loanField004(Long val) { instance.loanField004 = val; return this; }
        public Builder loanField005(String val) { instance.loanField005 = val; return this; }
        public Builder loanField006(Long val) { instance.loanField006 = val; return this; }
        public Builder loanField007(LocalDate val) { instance.loanField007 = val; return this; }
        public Builder loanField008(Long val) { instance.loanField008 = val; return this; }
        public Builder loanField009(Double val) { instance.loanField009 = val; return this; }
        public Builder loanField010(String val) { instance.loanField010 = val; return this; }
        public LoanDto051 build() { return instance; }
    }

    public Boolean getLoanField000() { return loanField000; }
    public void setLoanField000(Boolean loanField000) { this.loanField000 = loanField000; }

    public Integer getLoanField001() { return loanField001; }
    public void setLoanField001(Integer loanField001) { this.loanField001 = loanField001; }

    public Double getLoanField002() { return loanField002; }
    public void setLoanField002(Double loanField002) { this.loanField002 = loanField002; }

    public Integer getLoanField003() { return loanField003; }
    public void setLoanField003(Integer loanField003) { this.loanField003 = loanField003; }

    public Long getLoanField004() { return loanField004; }
    public void setLoanField004(Long loanField004) { this.loanField004 = loanField004; }

    public String getLoanField005() { return loanField005; }
    public void setLoanField005(String loanField005) { this.loanField005 = loanField005; }

    public Long getLoanField006() { return loanField006; }
    public void setLoanField006(Long loanField006) { this.loanField006 = loanField006; }

    public LocalDate getLoanField007() { return loanField007; }
    public void setLoanField007(LocalDate loanField007) { this.loanField007 = loanField007; }

    public Long getLoanField008() { return loanField008; }
    public void setLoanField008(Long loanField008) { this.loanField008 = loanField008; }

    public Double getLoanField009() { return loanField009; }
    public void setLoanField009(Double loanField009) { this.loanField009 = loanField009; }

    public String getLoanField010() { return loanField010; }
    public void setLoanField010(String loanField010) { this.loanField010 = loanField010; }

    @Override
    public String toString() {
        return "LoanDto051{" +
            "loanField000=" + loanField000 + ", " +
            "loanField001=" + loanField001 + ", " +
            "loanField002=" + loanField002 + ", " +
            "loanField003=" + loanField003 + ", " +
            "loanField004=" + loanField004 + ", " +
            "}";
    }
}
