package com.pnb.loan;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * LoanDto031 — Data Transfer Object for loan operations.
 * Variant 31 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LoanDto031 {

    @JsonProperty("loanField000")
    private Long loanField000;

    @JsonProperty("loanField001")
    private LocalDate loanField001;

    @JsonProperty("loanField002")
    private Long loanField002;

    @DecimalMin(value = "0.00")
    @JsonProperty("loanField003")
    private BigDecimal loanField003;

    @JsonProperty("loanField004")
    private Long loanField004;

    @JsonProperty("loanField005")
    private Double loanField005;

    @JsonProperty("loanField006")
    private Double loanField006;

    @JsonProperty("loanField007")
    private Double loanField007;

    @JsonProperty("loanField008")
    private LocalDate loanField008;

    @JsonProperty("loanField009")
    private Boolean loanField009;

    @JsonProperty("loanField010")
    private Long loanField010;

    @JsonProperty("loanField011")
    private Integer loanField011;

    @JsonProperty("loanField012")
    private Double loanField012;

    @JsonProperty("loanField013")
    private Integer loanField013;

    @JsonProperty("loanField014")
    private Long loanField014;

    public LoanDto031() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final LoanDto031 instance = new LoanDto031();

        public Builder loanField000(Long val) { instance.loanField000 = val; return this; }
        public Builder loanField001(LocalDate val) { instance.loanField001 = val; return this; }
        public Builder loanField002(Long val) { instance.loanField002 = val; return this; }
        public Builder loanField003(BigDecimal val) { instance.loanField003 = val; return this; }
        public Builder loanField004(Long val) { instance.loanField004 = val; return this; }
        public Builder loanField005(Double val) { instance.loanField005 = val; return this; }
        public Builder loanField006(Double val) { instance.loanField006 = val; return this; }
        public Builder loanField007(Double val) { instance.loanField007 = val; return this; }
        public Builder loanField008(LocalDate val) { instance.loanField008 = val; return this; }
        public Builder loanField009(Boolean val) { instance.loanField009 = val; return this; }
        public Builder loanField010(Long val) { instance.loanField010 = val; return this; }
        public Builder loanField011(Integer val) { instance.loanField011 = val; return this; }
        public Builder loanField012(Double val) { instance.loanField012 = val; return this; }
        public Builder loanField013(Integer val) { instance.loanField013 = val; return this; }
        public Builder loanField014(Long val) { instance.loanField014 = val; return this; }
        public LoanDto031 build() { return instance; }
    }

    public Long getLoanField000() { return loanField000; }
    public void setLoanField000(Long loanField000) { this.loanField000 = loanField000; }

    public LocalDate getLoanField001() { return loanField001; }
    public void setLoanField001(LocalDate loanField001) { this.loanField001 = loanField001; }

    public Long getLoanField002() { return loanField002; }
    public void setLoanField002(Long loanField002) { this.loanField002 = loanField002; }

    public BigDecimal getLoanField003() { return loanField003; }
    public void setLoanField003(BigDecimal loanField003) { this.loanField003 = loanField003; }

    public Long getLoanField004() { return loanField004; }
    public void setLoanField004(Long loanField004) { this.loanField004 = loanField004; }

    public Double getLoanField005() { return loanField005; }
    public void setLoanField005(Double loanField005) { this.loanField005 = loanField005; }

    public Double getLoanField006() { return loanField006; }
    public void setLoanField006(Double loanField006) { this.loanField006 = loanField006; }

    public Double getLoanField007() { return loanField007; }
    public void setLoanField007(Double loanField007) { this.loanField007 = loanField007; }

    public LocalDate getLoanField008() { return loanField008; }
    public void setLoanField008(LocalDate loanField008) { this.loanField008 = loanField008; }

    public Boolean getLoanField009() { return loanField009; }
    public void setLoanField009(Boolean loanField009) { this.loanField009 = loanField009; }

    public Long getLoanField010() { return loanField010; }
    public void setLoanField010(Long loanField010) { this.loanField010 = loanField010; }

    public Integer getLoanField011() { return loanField011; }
    public void setLoanField011(Integer loanField011) { this.loanField011 = loanField011; }

    public Double getLoanField012() { return loanField012; }
    public void setLoanField012(Double loanField012) { this.loanField012 = loanField012; }

    public Integer getLoanField013() { return loanField013; }
    public void setLoanField013(Integer loanField013) { this.loanField013 = loanField013; }

    public Long getLoanField014() { return loanField014; }
    public void setLoanField014(Long loanField014) { this.loanField014 = loanField014; }

    @Override
    public String toString() {
        return "LoanDto031{" +
            "loanField000=" + loanField000 + ", " +
            "loanField001=" + loanField001 + ", " +
            "loanField002=" + loanField002 + ", " +
            "loanField003=" + loanField003 + ", " +
            "loanField004=" + loanField004 + ", " +
            "}";
    }
}
