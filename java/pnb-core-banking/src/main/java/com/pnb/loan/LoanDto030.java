package com.pnb.loan;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * LoanDto030 — Data Transfer Object for loan operations.
 * Variant 30 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LoanDto030 {

    @DecimalMin(value = "0.00")
    @JsonProperty("loanField000")
    private BigDecimal loanField000;

    @JsonProperty("loanField001")
    private Integer loanField001;

    @JsonProperty("loanField002")
    private Long loanField002;

    @JsonProperty("loanField003")
    private LocalDate loanField003;

    @JsonProperty("loanField004")
    private Boolean loanField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("loanField005")
    private BigDecimal loanField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("loanField006")
    private BigDecimal loanField006;

    @JsonProperty("loanField007")
    private Boolean loanField007;

    @JsonProperty("loanField008")
    private Double loanField008;

    @JsonProperty("loanField009")
    private LocalDate loanField009;

    @JsonProperty("loanField010")
    private LocalDate loanField010;

    @JsonProperty("loanField011")
    private Integer loanField011;

    @JsonProperty("loanField012")
    private Boolean loanField012;

    @JsonProperty("loanField013")
    private Double loanField013;

    public LoanDto030() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final LoanDto030 instance = new LoanDto030();

        public Builder loanField000(BigDecimal val) { instance.loanField000 = val; return this; }
        public Builder loanField001(Integer val) { instance.loanField001 = val; return this; }
        public Builder loanField002(Long val) { instance.loanField002 = val; return this; }
        public Builder loanField003(LocalDate val) { instance.loanField003 = val; return this; }
        public Builder loanField004(Boolean val) { instance.loanField004 = val; return this; }
        public Builder loanField005(BigDecimal val) { instance.loanField005 = val; return this; }
        public Builder loanField006(BigDecimal val) { instance.loanField006 = val; return this; }
        public Builder loanField007(Boolean val) { instance.loanField007 = val; return this; }
        public Builder loanField008(Double val) { instance.loanField008 = val; return this; }
        public Builder loanField009(LocalDate val) { instance.loanField009 = val; return this; }
        public Builder loanField010(LocalDate val) { instance.loanField010 = val; return this; }
        public Builder loanField011(Integer val) { instance.loanField011 = val; return this; }
        public Builder loanField012(Boolean val) { instance.loanField012 = val; return this; }
        public Builder loanField013(Double val) { instance.loanField013 = val; return this; }
        public LoanDto030 build() { return instance; }
    }

    public BigDecimal getLoanField000() { return loanField000; }
    public void setLoanField000(BigDecimal loanField000) { this.loanField000 = loanField000; }

    public Integer getLoanField001() { return loanField001; }
    public void setLoanField001(Integer loanField001) { this.loanField001 = loanField001; }

    public Long getLoanField002() { return loanField002; }
    public void setLoanField002(Long loanField002) { this.loanField002 = loanField002; }

    public LocalDate getLoanField003() { return loanField003; }
    public void setLoanField003(LocalDate loanField003) { this.loanField003 = loanField003; }

    public Boolean getLoanField004() { return loanField004; }
    public void setLoanField004(Boolean loanField004) { this.loanField004 = loanField004; }

    public BigDecimal getLoanField005() { return loanField005; }
    public void setLoanField005(BigDecimal loanField005) { this.loanField005 = loanField005; }

    public BigDecimal getLoanField006() { return loanField006; }
    public void setLoanField006(BigDecimal loanField006) { this.loanField006 = loanField006; }

    public Boolean getLoanField007() { return loanField007; }
    public void setLoanField007(Boolean loanField007) { this.loanField007 = loanField007; }

    public Double getLoanField008() { return loanField008; }
    public void setLoanField008(Double loanField008) { this.loanField008 = loanField008; }

    public LocalDate getLoanField009() { return loanField009; }
    public void setLoanField009(LocalDate loanField009) { this.loanField009 = loanField009; }

    public LocalDate getLoanField010() { return loanField010; }
    public void setLoanField010(LocalDate loanField010) { this.loanField010 = loanField010; }

    public Integer getLoanField011() { return loanField011; }
    public void setLoanField011(Integer loanField011) { this.loanField011 = loanField011; }

    public Boolean getLoanField012() { return loanField012; }
    public void setLoanField012(Boolean loanField012) { this.loanField012 = loanField012; }

    public Double getLoanField013() { return loanField013; }
    public void setLoanField013(Double loanField013) { this.loanField013 = loanField013; }

    @Override
    public String toString() {
        return "LoanDto030{" +
            "loanField000=" + loanField000 + ", " +
            "loanField001=" + loanField001 + ", " +
            "loanField002=" + loanField002 + ", " +
            "loanField003=" + loanField003 + ", " +
            "loanField004=" + loanField004 + ", " +
            "}";
    }
}
