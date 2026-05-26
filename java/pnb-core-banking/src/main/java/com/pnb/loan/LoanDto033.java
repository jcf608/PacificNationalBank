package com.pnb.loan;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * LoanDto033 — Data Transfer Object for loan operations.
 * Variant 33 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LoanDto033 {

    @JsonProperty("loanField000")
    private LocalDate loanField000;

    @DecimalMin(value = "0.00")
    @JsonProperty("loanField001")
    private BigDecimal loanField001;

    @JsonProperty("loanField002")
    private LocalDate loanField002;

    @DecimalMin(value = "0.00")
    @JsonProperty("loanField003")
    private BigDecimal loanField003;

    @JsonProperty("loanField004")
    private Boolean loanField004;

    @JsonProperty("loanField005")
    private Long loanField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("loanField006")
    private BigDecimal loanField006;

    @JsonProperty("loanField007")
    private Boolean loanField007;

    @JsonProperty("loanField008")
    private Double loanField008;

    @DecimalMin(value = "0.00")
    @JsonProperty("loanField009")
    private BigDecimal loanField009;

    @JsonProperty("loanField010")
    private LocalDate loanField010;

    @DecimalMin(value = "0.00")
    @JsonProperty("loanField011")
    private BigDecimal loanField011;

    @JsonProperty("loanField012")
    private Integer loanField012;

    @JsonProperty("loanField013")
    private Double loanField013;

    @JsonProperty("loanField014")
    private Boolean loanField014;

    @DecimalMin(value = "0.00")
    @JsonProperty("loanField015")
    private BigDecimal loanField015;

    @Size(max = 20)
    @JsonProperty("loanField016")
    private String loanField016;

    public LoanDto033() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final LoanDto033 instance = new LoanDto033();

        public Builder loanField000(LocalDate val) { instance.loanField000 = val; return this; }
        public Builder loanField001(BigDecimal val) { instance.loanField001 = val; return this; }
        public Builder loanField002(LocalDate val) { instance.loanField002 = val; return this; }
        public Builder loanField003(BigDecimal val) { instance.loanField003 = val; return this; }
        public Builder loanField004(Boolean val) { instance.loanField004 = val; return this; }
        public Builder loanField005(Long val) { instance.loanField005 = val; return this; }
        public Builder loanField006(BigDecimal val) { instance.loanField006 = val; return this; }
        public Builder loanField007(Boolean val) { instance.loanField007 = val; return this; }
        public Builder loanField008(Double val) { instance.loanField008 = val; return this; }
        public Builder loanField009(BigDecimal val) { instance.loanField009 = val; return this; }
        public Builder loanField010(LocalDate val) { instance.loanField010 = val; return this; }
        public Builder loanField011(BigDecimal val) { instance.loanField011 = val; return this; }
        public Builder loanField012(Integer val) { instance.loanField012 = val; return this; }
        public Builder loanField013(Double val) { instance.loanField013 = val; return this; }
        public Builder loanField014(Boolean val) { instance.loanField014 = val; return this; }
        public Builder loanField015(BigDecimal val) { instance.loanField015 = val; return this; }
        public Builder loanField016(String val) { instance.loanField016 = val; return this; }
        public LoanDto033 build() { return instance; }
    }

    public LocalDate getLoanField000() { return loanField000; }
    public void setLoanField000(LocalDate loanField000) { this.loanField000 = loanField000; }

    public BigDecimal getLoanField001() { return loanField001; }
    public void setLoanField001(BigDecimal loanField001) { this.loanField001 = loanField001; }

    public LocalDate getLoanField002() { return loanField002; }
    public void setLoanField002(LocalDate loanField002) { this.loanField002 = loanField002; }

    public BigDecimal getLoanField003() { return loanField003; }
    public void setLoanField003(BigDecimal loanField003) { this.loanField003 = loanField003; }

    public Boolean getLoanField004() { return loanField004; }
    public void setLoanField004(Boolean loanField004) { this.loanField004 = loanField004; }

    public Long getLoanField005() { return loanField005; }
    public void setLoanField005(Long loanField005) { this.loanField005 = loanField005; }

    public BigDecimal getLoanField006() { return loanField006; }
    public void setLoanField006(BigDecimal loanField006) { this.loanField006 = loanField006; }

    public Boolean getLoanField007() { return loanField007; }
    public void setLoanField007(Boolean loanField007) { this.loanField007 = loanField007; }

    public Double getLoanField008() { return loanField008; }
    public void setLoanField008(Double loanField008) { this.loanField008 = loanField008; }

    public BigDecimal getLoanField009() { return loanField009; }
    public void setLoanField009(BigDecimal loanField009) { this.loanField009 = loanField009; }

    public LocalDate getLoanField010() { return loanField010; }
    public void setLoanField010(LocalDate loanField010) { this.loanField010 = loanField010; }

    public BigDecimal getLoanField011() { return loanField011; }
    public void setLoanField011(BigDecimal loanField011) { this.loanField011 = loanField011; }

    public Integer getLoanField012() { return loanField012; }
    public void setLoanField012(Integer loanField012) { this.loanField012 = loanField012; }

    public Double getLoanField013() { return loanField013; }
    public void setLoanField013(Double loanField013) { this.loanField013 = loanField013; }

    public Boolean getLoanField014() { return loanField014; }
    public void setLoanField014(Boolean loanField014) { this.loanField014 = loanField014; }

    public BigDecimal getLoanField015() { return loanField015; }
    public void setLoanField015(BigDecimal loanField015) { this.loanField015 = loanField015; }

    public String getLoanField016() { return loanField016; }
    public void setLoanField016(String loanField016) { this.loanField016 = loanField016; }

    @Override
    public String toString() {
        return "LoanDto033{" +
            "loanField000=" + loanField000 + ", " +
            "loanField001=" + loanField001 + ", " +
            "loanField002=" + loanField002 + ", " +
            "loanField003=" + loanField003 + ", " +
            "loanField004=" + loanField004 + ", " +
            "}";
    }
}
