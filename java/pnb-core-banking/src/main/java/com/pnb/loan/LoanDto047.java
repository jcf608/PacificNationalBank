package com.pnb.loan;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * LoanDto047 — Data Transfer Object for loan operations.
 * Variant 47 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LoanDto047 {

    @Size(max = 60)
    @JsonProperty("loanField000")
    private String loanField000;

    @JsonProperty("loanField001")
    private Integer loanField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("loanField002")
    private BigDecimal loanField002;

    @JsonProperty("loanField003")
    private Double loanField003;

    @JsonProperty("loanField004")
    private Double loanField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("loanField005")
    private BigDecimal loanField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("loanField006")
    private BigDecimal loanField006;

    @Size(max = 200)
    @JsonProperty("loanField007")
    private String loanField007;

    @JsonProperty("loanField008")
    private Boolean loanField008;

    @JsonProperty("loanField009")
    private Double loanField009;

    @JsonProperty("loanField010")
    private Long loanField010;

    @JsonProperty("loanField011")
    private Double loanField011;

    @JsonProperty("loanField012")
    private Integer loanField012;

    @DecimalMin(value = "0.00")
    @JsonProperty("loanField013")
    private BigDecimal loanField013;

    @JsonProperty("loanField014")
    private Integer loanField014;

    @JsonProperty("loanField015")
    private LocalDate loanField015;

    @JsonProperty("loanField016")
    private LocalDate loanField016;

    @DecimalMin(value = "0.00")
    @JsonProperty("loanField017")
    private BigDecimal loanField017;

    @JsonProperty("loanField018")
    private Integer loanField018;

    public LoanDto047() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final LoanDto047 instance = new LoanDto047();

        public Builder loanField000(String val) { instance.loanField000 = val; return this; }
        public Builder loanField001(Integer val) { instance.loanField001 = val; return this; }
        public Builder loanField002(BigDecimal val) { instance.loanField002 = val; return this; }
        public Builder loanField003(Double val) { instance.loanField003 = val; return this; }
        public Builder loanField004(Double val) { instance.loanField004 = val; return this; }
        public Builder loanField005(BigDecimal val) { instance.loanField005 = val; return this; }
        public Builder loanField006(BigDecimal val) { instance.loanField006 = val; return this; }
        public Builder loanField007(String val) { instance.loanField007 = val; return this; }
        public Builder loanField008(Boolean val) { instance.loanField008 = val; return this; }
        public Builder loanField009(Double val) { instance.loanField009 = val; return this; }
        public Builder loanField010(Long val) { instance.loanField010 = val; return this; }
        public Builder loanField011(Double val) { instance.loanField011 = val; return this; }
        public Builder loanField012(Integer val) { instance.loanField012 = val; return this; }
        public Builder loanField013(BigDecimal val) { instance.loanField013 = val; return this; }
        public Builder loanField014(Integer val) { instance.loanField014 = val; return this; }
        public Builder loanField015(LocalDate val) { instance.loanField015 = val; return this; }
        public Builder loanField016(LocalDate val) { instance.loanField016 = val; return this; }
        public Builder loanField017(BigDecimal val) { instance.loanField017 = val; return this; }
        public Builder loanField018(Integer val) { instance.loanField018 = val; return this; }
        public LoanDto047 build() { return instance; }
    }

    public String getLoanField000() { return loanField000; }
    public void setLoanField000(String loanField000) { this.loanField000 = loanField000; }

    public Integer getLoanField001() { return loanField001; }
    public void setLoanField001(Integer loanField001) { this.loanField001 = loanField001; }

    public BigDecimal getLoanField002() { return loanField002; }
    public void setLoanField002(BigDecimal loanField002) { this.loanField002 = loanField002; }

    public Double getLoanField003() { return loanField003; }
    public void setLoanField003(Double loanField003) { this.loanField003 = loanField003; }

    public Double getLoanField004() { return loanField004; }
    public void setLoanField004(Double loanField004) { this.loanField004 = loanField004; }

    public BigDecimal getLoanField005() { return loanField005; }
    public void setLoanField005(BigDecimal loanField005) { this.loanField005 = loanField005; }

    public BigDecimal getLoanField006() { return loanField006; }
    public void setLoanField006(BigDecimal loanField006) { this.loanField006 = loanField006; }

    public String getLoanField007() { return loanField007; }
    public void setLoanField007(String loanField007) { this.loanField007 = loanField007; }

    public Boolean getLoanField008() { return loanField008; }
    public void setLoanField008(Boolean loanField008) { this.loanField008 = loanField008; }

    public Double getLoanField009() { return loanField009; }
    public void setLoanField009(Double loanField009) { this.loanField009 = loanField009; }

    public Long getLoanField010() { return loanField010; }
    public void setLoanField010(Long loanField010) { this.loanField010 = loanField010; }

    public Double getLoanField011() { return loanField011; }
    public void setLoanField011(Double loanField011) { this.loanField011 = loanField011; }

    public Integer getLoanField012() { return loanField012; }
    public void setLoanField012(Integer loanField012) { this.loanField012 = loanField012; }

    public BigDecimal getLoanField013() { return loanField013; }
    public void setLoanField013(BigDecimal loanField013) { this.loanField013 = loanField013; }

    public Integer getLoanField014() { return loanField014; }
    public void setLoanField014(Integer loanField014) { this.loanField014 = loanField014; }

    public LocalDate getLoanField015() { return loanField015; }
    public void setLoanField015(LocalDate loanField015) { this.loanField015 = loanField015; }

    public LocalDate getLoanField016() { return loanField016; }
    public void setLoanField016(LocalDate loanField016) { this.loanField016 = loanField016; }

    public BigDecimal getLoanField017() { return loanField017; }
    public void setLoanField017(BigDecimal loanField017) { this.loanField017 = loanField017; }

    public Integer getLoanField018() { return loanField018; }
    public void setLoanField018(Integer loanField018) { this.loanField018 = loanField018; }

    @Override
    public String toString() {
        return "LoanDto047{" +
            "loanField000=" + loanField000 + ", " +
            "loanField001=" + loanField001 + ", " +
            "loanField002=" + loanField002 + ", " +
            "loanField003=" + loanField003 + ", " +
            "loanField004=" + loanField004 + ", " +
            "}";
    }
}
