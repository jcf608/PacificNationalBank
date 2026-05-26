package com.pnb.loan;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * LoanDto035 — Data Transfer Object for loan operations.
 * Variant 35 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LoanDto035 {

    @JsonProperty("loanField000")
    private Boolean loanField000;

    @Size(max = 40)
    @JsonProperty("loanField001")
    private String loanField001;

    @JsonProperty("loanField002")
    private Double loanField002;

    @JsonProperty("loanField003")
    private Boolean loanField003;

    @DecimalMin(value = "0.00")
    @JsonProperty("loanField004")
    private BigDecimal loanField004;

    @JsonProperty("loanField005")
    private Double loanField005;

    @JsonProperty("loanField006")
    private Integer loanField006;

    @JsonProperty("loanField007")
    private Long loanField007;

    @JsonProperty("loanField008")
    private Double loanField008;

    @Size(max = 100)
    @JsonProperty("loanField009")
    private String loanField009;

    @JsonProperty("loanField010")
    private Integer loanField010;

    @JsonProperty("loanField011")
    private Boolean loanField011;

    @JsonProperty("loanField012")
    private Boolean loanField012;

    @JsonProperty("loanField013")
    private LocalDate loanField013;

    @DecimalMin(value = "0.00")
    @JsonProperty("loanField014")
    private BigDecimal loanField014;

    @DecimalMin(value = "0.00")
    @JsonProperty("loanField015")
    private BigDecimal loanField015;

    @JsonProperty("loanField016")
    private Integer loanField016;

    @Size(max = 20)
    @JsonProperty("loanField017")
    private String loanField017;

    @DecimalMin(value = "0.00")
    @JsonProperty("loanField018")
    private BigDecimal loanField018;

    public LoanDto035() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final LoanDto035 instance = new LoanDto035();

        public Builder loanField000(Boolean val) { instance.loanField000 = val; return this; }
        public Builder loanField001(String val) { instance.loanField001 = val; return this; }
        public Builder loanField002(Double val) { instance.loanField002 = val; return this; }
        public Builder loanField003(Boolean val) { instance.loanField003 = val; return this; }
        public Builder loanField004(BigDecimal val) { instance.loanField004 = val; return this; }
        public Builder loanField005(Double val) { instance.loanField005 = val; return this; }
        public Builder loanField006(Integer val) { instance.loanField006 = val; return this; }
        public Builder loanField007(Long val) { instance.loanField007 = val; return this; }
        public Builder loanField008(Double val) { instance.loanField008 = val; return this; }
        public Builder loanField009(String val) { instance.loanField009 = val; return this; }
        public Builder loanField010(Integer val) { instance.loanField010 = val; return this; }
        public Builder loanField011(Boolean val) { instance.loanField011 = val; return this; }
        public Builder loanField012(Boolean val) { instance.loanField012 = val; return this; }
        public Builder loanField013(LocalDate val) { instance.loanField013 = val; return this; }
        public Builder loanField014(BigDecimal val) { instance.loanField014 = val; return this; }
        public Builder loanField015(BigDecimal val) { instance.loanField015 = val; return this; }
        public Builder loanField016(Integer val) { instance.loanField016 = val; return this; }
        public Builder loanField017(String val) { instance.loanField017 = val; return this; }
        public Builder loanField018(BigDecimal val) { instance.loanField018 = val; return this; }
        public LoanDto035 build() { return instance; }
    }

    public Boolean getLoanField000() { return loanField000; }
    public void setLoanField000(Boolean loanField000) { this.loanField000 = loanField000; }

    public String getLoanField001() { return loanField001; }
    public void setLoanField001(String loanField001) { this.loanField001 = loanField001; }

    public Double getLoanField002() { return loanField002; }
    public void setLoanField002(Double loanField002) { this.loanField002 = loanField002; }

    public Boolean getLoanField003() { return loanField003; }
    public void setLoanField003(Boolean loanField003) { this.loanField003 = loanField003; }

    public BigDecimal getLoanField004() { return loanField004; }
    public void setLoanField004(BigDecimal loanField004) { this.loanField004 = loanField004; }

    public Double getLoanField005() { return loanField005; }
    public void setLoanField005(Double loanField005) { this.loanField005 = loanField005; }

    public Integer getLoanField006() { return loanField006; }
    public void setLoanField006(Integer loanField006) { this.loanField006 = loanField006; }

    public Long getLoanField007() { return loanField007; }
    public void setLoanField007(Long loanField007) { this.loanField007 = loanField007; }

    public Double getLoanField008() { return loanField008; }
    public void setLoanField008(Double loanField008) { this.loanField008 = loanField008; }

    public String getLoanField009() { return loanField009; }
    public void setLoanField009(String loanField009) { this.loanField009 = loanField009; }

    public Integer getLoanField010() { return loanField010; }
    public void setLoanField010(Integer loanField010) { this.loanField010 = loanField010; }

    public Boolean getLoanField011() { return loanField011; }
    public void setLoanField011(Boolean loanField011) { this.loanField011 = loanField011; }

    public Boolean getLoanField012() { return loanField012; }
    public void setLoanField012(Boolean loanField012) { this.loanField012 = loanField012; }

    public LocalDate getLoanField013() { return loanField013; }
    public void setLoanField013(LocalDate loanField013) { this.loanField013 = loanField013; }

    public BigDecimal getLoanField014() { return loanField014; }
    public void setLoanField014(BigDecimal loanField014) { this.loanField014 = loanField014; }

    public BigDecimal getLoanField015() { return loanField015; }
    public void setLoanField015(BigDecimal loanField015) { this.loanField015 = loanField015; }

    public Integer getLoanField016() { return loanField016; }
    public void setLoanField016(Integer loanField016) { this.loanField016 = loanField016; }

    public String getLoanField017() { return loanField017; }
    public void setLoanField017(String loanField017) { this.loanField017 = loanField017; }

    public BigDecimal getLoanField018() { return loanField018; }
    public void setLoanField018(BigDecimal loanField018) { this.loanField018 = loanField018; }

    @Override
    public String toString() {
        return "LoanDto035{" +
            "loanField000=" + loanField000 + ", " +
            "loanField001=" + loanField001 + ", " +
            "loanField002=" + loanField002 + ", " +
            "loanField003=" + loanField003 + ", " +
            "loanField004=" + loanField004 + ", " +
            "}";
    }
}
