package com.pnb.loan;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * LoanDto043 — Data Transfer Object for loan operations.
 * Variant 43 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LoanDto043 {

    @DecimalMin(value = "0.00")
    @JsonProperty("loanField000")
    private BigDecimal loanField000;

    @Size(max = 20)
    @JsonProperty("loanField001")
    private String loanField001;

    @JsonProperty("loanField002")
    private Boolean loanField002;

    @Size(max = 200)
    @JsonProperty("loanField003")
    private String loanField003;

    @DecimalMin(value = "0.00")
    @JsonProperty("loanField004")
    private BigDecimal loanField004;

    @Size(max = 200)
    @JsonProperty("loanField005")
    private String loanField005;

    @JsonProperty("loanField006")
    private LocalDate loanField006;

    @Size(max = 200)
    @JsonProperty("loanField007")
    private String loanField007;

    @DecimalMin(value = "0.00")
    @JsonProperty("loanField008")
    private BigDecimal loanField008;

    @JsonProperty("loanField009")
    private Integer loanField009;

    @JsonProperty("loanField010")
    private Double loanField010;

    @JsonProperty("loanField011")
    private Integer loanField011;

    @DecimalMin(value = "0.00")
    @JsonProperty("loanField012")
    private BigDecimal loanField012;

    @Size(max = 40)
    @JsonProperty("loanField013")
    private String loanField013;

    @JsonProperty("loanField014")
    private Integer loanField014;

    public LoanDto043() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final LoanDto043 instance = new LoanDto043();

        public Builder loanField000(BigDecimal val) { instance.loanField000 = val; return this; }
        public Builder loanField001(String val) { instance.loanField001 = val; return this; }
        public Builder loanField002(Boolean val) { instance.loanField002 = val; return this; }
        public Builder loanField003(String val) { instance.loanField003 = val; return this; }
        public Builder loanField004(BigDecimal val) { instance.loanField004 = val; return this; }
        public Builder loanField005(String val) { instance.loanField005 = val; return this; }
        public Builder loanField006(LocalDate val) { instance.loanField006 = val; return this; }
        public Builder loanField007(String val) { instance.loanField007 = val; return this; }
        public Builder loanField008(BigDecimal val) { instance.loanField008 = val; return this; }
        public Builder loanField009(Integer val) { instance.loanField009 = val; return this; }
        public Builder loanField010(Double val) { instance.loanField010 = val; return this; }
        public Builder loanField011(Integer val) { instance.loanField011 = val; return this; }
        public Builder loanField012(BigDecimal val) { instance.loanField012 = val; return this; }
        public Builder loanField013(String val) { instance.loanField013 = val; return this; }
        public Builder loanField014(Integer val) { instance.loanField014 = val; return this; }
        public LoanDto043 build() { return instance; }
    }

    public BigDecimal getLoanField000() { return loanField000; }
    public void setLoanField000(BigDecimal loanField000) { this.loanField000 = loanField000; }

    public String getLoanField001() { return loanField001; }
    public void setLoanField001(String loanField001) { this.loanField001 = loanField001; }

    public Boolean getLoanField002() { return loanField002; }
    public void setLoanField002(Boolean loanField002) { this.loanField002 = loanField002; }

    public String getLoanField003() { return loanField003; }
    public void setLoanField003(String loanField003) { this.loanField003 = loanField003; }

    public BigDecimal getLoanField004() { return loanField004; }
    public void setLoanField004(BigDecimal loanField004) { this.loanField004 = loanField004; }

    public String getLoanField005() { return loanField005; }
    public void setLoanField005(String loanField005) { this.loanField005 = loanField005; }

    public LocalDate getLoanField006() { return loanField006; }
    public void setLoanField006(LocalDate loanField006) { this.loanField006 = loanField006; }

    public String getLoanField007() { return loanField007; }
    public void setLoanField007(String loanField007) { this.loanField007 = loanField007; }

    public BigDecimal getLoanField008() { return loanField008; }
    public void setLoanField008(BigDecimal loanField008) { this.loanField008 = loanField008; }

    public Integer getLoanField009() { return loanField009; }
    public void setLoanField009(Integer loanField009) { this.loanField009 = loanField009; }

    public Double getLoanField010() { return loanField010; }
    public void setLoanField010(Double loanField010) { this.loanField010 = loanField010; }

    public Integer getLoanField011() { return loanField011; }
    public void setLoanField011(Integer loanField011) { this.loanField011 = loanField011; }

    public BigDecimal getLoanField012() { return loanField012; }
    public void setLoanField012(BigDecimal loanField012) { this.loanField012 = loanField012; }

    public String getLoanField013() { return loanField013; }
    public void setLoanField013(String loanField013) { this.loanField013 = loanField013; }

    public Integer getLoanField014() { return loanField014; }
    public void setLoanField014(Integer loanField014) { this.loanField014 = loanField014; }

    @Override
    public String toString() {
        return "LoanDto043{" +
            "loanField000=" + loanField000 + ", " +
            "loanField001=" + loanField001 + ", " +
            "loanField002=" + loanField002 + ", " +
            "loanField003=" + loanField003 + ", " +
            "loanField004=" + loanField004 + ", " +
            "}";
    }
}
