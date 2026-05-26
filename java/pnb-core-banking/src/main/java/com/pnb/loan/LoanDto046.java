package com.pnb.loan;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * LoanDto046 — Data Transfer Object for loan operations.
 * Variant 46 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LoanDto046 {

    @JsonProperty("loanField000")
    private LocalDate loanField000;

    @Size(max = 60)
    @JsonProperty("loanField001")
    private String loanField001;

    @JsonProperty("loanField002")
    private Boolean loanField002;

    @JsonProperty("loanField003")
    private Double loanField003;

    @JsonProperty("loanField004")
    private LocalDate loanField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("loanField005")
    private BigDecimal loanField005;

    @JsonProperty("loanField006")
    private Double loanField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("loanField007")
    private BigDecimal loanField007;

    @DecimalMin(value = "0.00")
    @JsonProperty("loanField008")
    private BigDecimal loanField008;

    @JsonProperty("loanField009")
    private Integer loanField009;

    @JsonProperty("loanField010")
    private LocalDate loanField010;

    @Size(max = 20)
    @JsonProperty("loanField011")
    private String loanField011;

    @JsonProperty("loanField012")
    private Long loanField012;

    @DecimalMin(value = "0.00")
    @JsonProperty("loanField013")
    private BigDecimal loanField013;

    @JsonProperty("loanField014")
    private Double loanField014;

    @JsonProperty("loanField015")
    private Integer loanField015;

    @JsonProperty("loanField016")
    private Double loanField016;

    @JsonProperty("loanField017")
    private Boolean loanField017;

    public LoanDto046() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final LoanDto046 instance = new LoanDto046();

        public Builder loanField000(LocalDate val) { instance.loanField000 = val; return this; }
        public Builder loanField001(String val) { instance.loanField001 = val; return this; }
        public Builder loanField002(Boolean val) { instance.loanField002 = val; return this; }
        public Builder loanField003(Double val) { instance.loanField003 = val; return this; }
        public Builder loanField004(LocalDate val) { instance.loanField004 = val; return this; }
        public Builder loanField005(BigDecimal val) { instance.loanField005 = val; return this; }
        public Builder loanField006(Double val) { instance.loanField006 = val; return this; }
        public Builder loanField007(BigDecimal val) { instance.loanField007 = val; return this; }
        public Builder loanField008(BigDecimal val) { instance.loanField008 = val; return this; }
        public Builder loanField009(Integer val) { instance.loanField009 = val; return this; }
        public Builder loanField010(LocalDate val) { instance.loanField010 = val; return this; }
        public Builder loanField011(String val) { instance.loanField011 = val; return this; }
        public Builder loanField012(Long val) { instance.loanField012 = val; return this; }
        public Builder loanField013(BigDecimal val) { instance.loanField013 = val; return this; }
        public Builder loanField014(Double val) { instance.loanField014 = val; return this; }
        public Builder loanField015(Integer val) { instance.loanField015 = val; return this; }
        public Builder loanField016(Double val) { instance.loanField016 = val; return this; }
        public Builder loanField017(Boolean val) { instance.loanField017 = val; return this; }
        public LoanDto046 build() { return instance; }
    }

    public LocalDate getLoanField000() { return loanField000; }
    public void setLoanField000(LocalDate loanField000) { this.loanField000 = loanField000; }

    public String getLoanField001() { return loanField001; }
    public void setLoanField001(String loanField001) { this.loanField001 = loanField001; }

    public Boolean getLoanField002() { return loanField002; }
    public void setLoanField002(Boolean loanField002) { this.loanField002 = loanField002; }

    public Double getLoanField003() { return loanField003; }
    public void setLoanField003(Double loanField003) { this.loanField003 = loanField003; }

    public LocalDate getLoanField004() { return loanField004; }
    public void setLoanField004(LocalDate loanField004) { this.loanField004 = loanField004; }

    public BigDecimal getLoanField005() { return loanField005; }
    public void setLoanField005(BigDecimal loanField005) { this.loanField005 = loanField005; }

    public Double getLoanField006() { return loanField006; }
    public void setLoanField006(Double loanField006) { this.loanField006 = loanField006; }

    public BigDecimal getLoanField007() { return loanField007; }
    public void setLoanField007(BigDecimal loanField007) { this.loanField007 = loanField007; }

    public BigDecimal getLoanField008() { return loanField008; }
    public void setLoanField008(BigDecimal loanField008) { this.loanField008 = loanField008; }

    public Integer getLoanField009() { return loanField009; }
    public void setLoanField009(Integer loanField009) { this.loanField009 = loanField009; }

    public LocalDate getLoanField010() { return loanField010; }
    public void setLoanField010(LocalDate loanField010) { this.loanField010 = loanField010; }

    public String getLoanField011() { return loanField011; }
    public void setLoanField011(String loanField011) { this.loanField011 = loanField011; }

    public Long getLoanField012() { return loanField012; }
    public void setLoanField012(Long loanField012) { this.loanField012 = loanField012; }

    public BigDecimal getLoanField013() { return loanField013; }
    public void setLoanField013(BigDecimal loanField013) { this.loanField013 = loanField013; }

    public Double getLoanField014() { return loanField014; }
    public void setLoanField014(Double loanField014) { this.loanField014 = loanField014; }

    public Integer getLoanField015() { return loanField015; }
    public void setLoanField015(Integer loanField015) { this.loanField015 = loanField015; }

    public Double getLoanField016() { return loanField016; }
    public void setLoanField016(Double loanField016) { this.loanField016 = loanField016; }

    public Boolean getLoanField017() { return loanField017; }
    public void setLoanField017(Boolean loanField017) { this.loanField017 = loanField017; }

    @Override
    public String toString() {
        return "LoanDto046{" +
            "loanField000=" + loanField000 + ", " +
            "loanField001=" + loanField001 + ", " +
            "loanField002=" + loanField002 + ", " +
            "loanField003=" + loanField003 + ", " +
            "loanField004=" + loanField004 + ", " +
            "}";
    }
}
