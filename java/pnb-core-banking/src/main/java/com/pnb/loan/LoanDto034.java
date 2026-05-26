package com.pnb.loan;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * LoanDto034 — Data Transfer Object for loan operations.
 * Variant 34 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LoanDto034 {

    @JsonProperty("loanField000")
    private Double loanField000;

    @Size(max = 20)
    @JsonProperty("loanField001")
    private String loanField001;

    @JsonProperty("loanField002")
    private Integer loanField002;

    @JsonProperty("loanField003")
    private Integer loanField003;

    @JsonProperty("loanField004")
    private Integer loanField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("loanField005")
    private BigDecimal loanField005;

    @JsonProperty("loanField006")
    private LocalDate loanField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("loanField007")
    private BigDecimal loanField007;

    @JsonProperty("loanField008")
    private Long loanField008;

    @JsonProperty("loanField009")
    private Boolean loanField009;

    @JsonProperty("loanField010")
    private LocalDate loanField010;

    @JsonProperty("loanField011")
    private Integer loanField011;

    @DecimalMin(value = "0.00")
    @JsonProperty("loanField012")
    private BigDecimal loanField012;

    @JsonProperty("loanField013")
    private Double loanField013;

    @Size(max = 40)
    @JsonProperty("loanField014")
    private String loanField014;

    @JsonProperty("loanField015")
    private LocalDate loanField015;

    @DecimalMin(value = "0.00")
    @JsonProperty("loanField016")
    private BigDecimal loanField016;

    @JsonProperty("loanField017")
    private Long loanField017;

    public LoanDto034() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final LoanDto034 instance = new LoanDto034();

        public Builder loanField000(Double val) { instance.loanField000 = val; return this; }
        public Builder loanField001(String val) { instance.loanField001 = val; return this; }
        public Builder loanField002(Integer val) { instance.loanField002 = val; return this; }
        public Builder loanField003(Integer val) { instance.loanField003 = val; return this; }
        public Builder loanField004(Integer val) { instance.loanField004 = val; return this; }
        public Builder loanField005(BigDecimal val) { instance.loanField005 = val; return this; }
        public Builder loanField006(LocalDate val) { instance.loanField006 = val; return this; }
        public Builder loanField007(BigDecimal val) { instance.loanField007 = val; return this; }
        public Builder loanField008(Long val) { instance.loanField008 = val; return this; }
        public Builder loanField009(Boolean val) { instance.loanField009 = val; return this; }
        public Builder loanField010(LocalDate val) { instance.loanField010 = val; return this; }
        public Builder loanField011(Integer val) { instance.loanField011 = val; return this; }
        public Builder loanField012(BigDecimal val) { instance.loanField012 = val; return this; }
        public Builder loanField013(Double val) { instance.loanField013 = val; return this; }
        public Builder loanField014(String val) { instance.loanField014 = val; return this; }
        public Builder loanField015(LocalDate val) { instance.loanField015 = val; return this; }
        public Builder loanField016(BigDecimal val) { instance.loanField016 = val; return this; }
        public Builder loanField017(Long val) { instance.loanField017 = val; return this; }
        public LoanDto034 build() { return instance; }
    }

    public Double getLoanField000() { return loanField000; }
    public void setLoanField000(Double loanField000) { this.loanField000 = loanField000; }

    public String getLoanField001() { return loanField001; }
    public void setLoanField001(String loanField001) { this.loanField001 = loanField001; }

    public Integer getLoanField002() { return loanField002; }
    public void setLoanField002(Integer loanField002) { this.loanField002 = loanField002; }

    public Integer getLoanField003() { return loanField003; }
    public void setLoanField003(Integer loanField003) { this.loanField003 = loanField003; }

    public Integer getLoanField004() { return loanField004; }
    public void setLoanField004(Integer loanField004) { this.loanField004 = loanField004; }

    public BigDecimal getLoanField005() { return loanField005; }
    public void setLoanField005(BigDecimal loanField005) { this.loanField005 = loanField005; }

    public LocalDate getLoanField006() { return loanField006; }
    public void setLoanField006(LocalDate loanField006) { this.loanField006 = loanField006; }

    public BigDecimal getLoanField007() { return loanField007; }
    public void setLoanField007(BigDecimal loanField007) { this.loanField007 = loanField007; }

    public Long getLoanField008() { return loanField008; }
    public void setLoanField008(Long loanField008) { this.loanField008 = loanField008; }

    public Boolean getLoanField009() { return loanField009; }
    public void setLoanField009(Boolean loanField009) { this.loanField009 = loanField009; }

    public LocalDate getLoanField010() { return loanField010; }
    public void setLoanField010(LocalDate loanField010) { this.loanField010 = loanField010; }

    public Integer getLoanField011() { return loanField011; }
    public void setLoanField011(Integer loanField011) { this.loanField011 = loanField011; }

    public BigDecimal getLoanField012() { return loanField012; }
    public void setLoanField012(BigDecimal loanField012) { this.loanField012 = loanField012; }

    public Double getLoanField013() { return loanField013; }
    public void setLoanField013(Double loanField013) { this.loanField013 = loanField013; }

    public String getLoanField014() { return loanField014; }
    public void setLoanField014(String loanField014) { this.loanField014 = loanField014; }

    public LocalDate getLoanField015() { return loanField015; }
    public void setLoanField015(LocalDate loanField015) { this.loanField015 = loanField015; }

    public BigDecimal getLoanField016() { return loanField016; }
    public void setLoanField016(BigDecimal loanField016) { this.loanField016 = loanField016; }

    public Long getLoanField017() { return loanField017; }
    public void setLoanField017(Long loanField017) { this.loanField017 = loanField017; }

    @Override
    public String toString() {
        return "LoanDto034{" +
            "loanField000=" + loanField000 + ", " +
            "loanField001=" + loanField001 + ", " +
            "loanField002=" + loanField002 + ", " +
            "loanField003=" + loanField003 + ", " +
            "loanField004=" + loanField004 + ", " +
            "}";
    }
}
