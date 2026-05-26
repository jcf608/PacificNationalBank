package com.pnb.loan;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * LoanDto058 — Data Transfer Object for loan operations.
 * Variant 58 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LoanDto058 {

    @JsonProperty("loanField000")
    private Long loanField000;

    @JsonProperty("loanField001")
    private Integer loanField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("loanField002")
    private BigDecimal loanField002;

    @JsonProperty("loanField003")
    private Integer loanField003;

    @DecimalMin(value = "0.00")
    @JsonProperty("loanField004")
    private BigDecimal loanField004;

    @JsonProperty("loanField005")
    private Double loanField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("loanField006")
    private BigDecimal loanField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("loanField007")
    private BigDecimal loanField007;

    @JsonProperty("loanField008")
    private Long loanField008;

    @DecimalMin(value = "0.00")
    @JsonProperty("loanField009")
    private BigDecimal loanField009;

    @JsonProperty("loanField010")
    private Long loanField010;

    @JsonProperty("loanField011")
    private Long loanField011;

    @JsonProperty("loanField012")
    private Integer loanField012;

    @JsonProperty("loanField013")
    private Double loanField013;

    @JsonProperty("loanField014")
    private Boolean loanField014;

    @JsonProperty("loanField015")
    private Double loanField015;

    @JsonProperty("loanField016")
    private Boolean loanField016;

    @JsonProperty("loanField017")
    private LocalDate loanField017;

    public LoanDto058() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final LoanDto058 instance = new LoanDto058();

        public Builder loanField000(Long val) { instance.loanField000 = val; return this; }
        public Builder loanField001(Integer val) { instance.loanField001 = val; return this; }
        public Builder loanField002(BigDecimal val) { instance.loanField002 = val; return this; }
        public Builder loanField003(Integer val) { instance.loanField003 = val; return this; }
        public Builder loanField004(BigDecimal val) { instance.loanField004 = val; return this; }
        public Builder loanField005(Double val) { instance.loanField005 = val; return this; }
        public Builder loanField006(BigDecimal val) { instance.loanField006 = val; return this; }
        public Builder loanField007(BigDecimal val) { instance.loanField007 = val; return this; }
        public Builder loanField008(Long val) { instance.loanField008 = val; return this; }
        public Builder loanField009(BigDecimal val) { instance.loanField009 = val; return this; }
        public Builder loanField010(Long val) { instance.loanField010 = val; return this; }
        public Builder loanField011(Long val) { instance.loanField011 = val; return this; }
        public Builder loanField012(Integer val) { instance.loanField012 = val; return this; }
        public Builder loanField013(Double val) { instance.loanField013 = val; return this; }
        public Builder loanField014(Boolean val) { instance.loanField014 = val; return this; }
        public Builder loanField015(Double val) { instance.loanField015 = val; return this; }
        public Builder loanField016(Boolean val) { instance.loanField016 = val; return this; }
        public Builder loanField017(LocalDate val) { instance.loanField017 = val; return this; }
        public LoanDto058 build() { return instance; }
    }

    public Long getLoanField000() { return loanField000; }
    public void setLoanField000(Long loanField000) { this.loanField000 = loanField000; }

    public Integer getLoanField001() { return loanField001; }
    public void setLoanField001(Integer loanField001) { this.loanField001 = loanField001; }

    public BigDecimal getLoanField002() { return loanField002; }
    public void setLoanField002(BigDecimal loanField002) { this.loanField002 = loanField002; }

    public Integer getLoanField003() { return loanField003; }
    public void setLoanField003(Integer loanField003) { this.loanField003 = loanField003; }

    public BigDecimal getLoanField004() { return loanField004; }
    public void setLoanField004(BigDecimal loanField004) { this.loanField004 = loanField004; }

    public Double getLoanField005() { return loanField005; }
    public void setLoanField005(Double loanField005) { this.loanField005 = loanField005; }

    public BigDecimal getLoanField006() { return loanField006; }
    public void setLoanField006(BigDecimal loanField006) { this.loanField006 = loanField006; }

    public BigDecimal getLoanField007() { return loanField007; }
    public void setLoanField007(BigDecimal loanField007) { this.loanField007 = loanField007; }

    public Long getLoanField008() { return loanField008; }
    public void setLoanField008(Long loanField008) { this.loanField008 = loanField008; }

    public BigDecimal getLoanField009() { return loanField009; }
    public void setLoanField009(BigDecimal loanField009) { this.loanField009 = loanField009; }

    public Long getLoanField010() { return loanField010; }
    public void setLoanField010(Long loanField010) { this.loanField010 = loanField010; }

    public Long getLoanField011() { return loanField011; }
    public void setLoanField011(Long loanField011) { this.loanField011 = loanField011; }

    public Integer getLoanField012() { return loanField012; }
    public void setLoanField012(Integer loanField012) { this.loanField012 = loanField012; }

    public Double getLoanField013() { return loanField013; }
    public void setLoanField013(Double loanField013) { this.loanField013 = loanField013; }

    public Boolean getLoanField014() { return loanField014; }
    public void setLoanField014(Boolean loanField014) { this.loanField014 = loanField014; }

    public Double getLoanField015() { return loanField015; }
    public void setLoanField015(Double loanField015) { this.loanField015 = loanField015; }

    public Boolean getLoanField016() { return loanField016; }
    public void setLoanField016(Boolean loanField016) { this.loanField016 = loanField016; }

    public LocalDate getLoanField017() { return loanField017; }
    public void setLoanField017(LocalDate loanField017) { this.loanField017 = loanField017; }

    @Override
    public String toString() {
        return "LoanDto058{" +
            "loanField000=" + loanField000 + ", " +
            "loanField001=" + loanField001 + ", " +
            "loanField002=" + loanField002 + ", " +
            "loanField003=" + loanField003 + ", " +
            "loanField004=" + loanField004 + ", " +
            "}";
    }
}
