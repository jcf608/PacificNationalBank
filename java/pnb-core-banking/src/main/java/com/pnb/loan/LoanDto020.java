package com.pnb.loan;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * LoanDto020 — Data Transfer Object for loan operations.
 * Variant 20 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LoanDto020 {

    @JsonProperty("loanField000")
    private Long loanField000;

    @Size(max = 100)
    @JsonProperty("loanField001")
    private String loanField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("loanField002")
    private BigDecimal loanField002;

    @DecimalMin(value = "0.00")
    @JsonProperty("loanField003")
    private BigDecimal loanField003;

    @JsonProperty("loanField004")
    private LocalDate loanField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("loanField005")
    private BigDecimal loanField005;

    @Size(max = 60)
    @JsonProperty("loanField006")
    private String loanField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("loanField007")
    private BigDecimal loanField007;

    @JsonProperty("loanField008")
    private LocalDate loanField008;

    @JsonProperty("loanField009")
    private Boolean loanField009;

    @JsonProperty("loanField010")
    private Long loanField010;

    @Size(max = 40)
    @JsonProperty("loanField011")
    private String loanField011;

    @JsonProperty("loanField012")
    private Boolean loanField012;

    @JsonProperty("loanField013")
    private Integer loanField013;

    @JsonProperty("loanField014")
    private Boolean loanField014;

    @JsonProperty("loanField015")
    private Long loanField015;

    public LoanDto020() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final LoanDto020 instance = new LoanDto020();

        public Builder loanField000(Long val) { instance.loanField000 = val; return this; }
        public Builder loanField001(String val) { instance.loanField001 = val; return this; }
        public Builder loanField002(BigDecimal val) { instance.loanField002 = val; return this; }
        public Builder loanField003(BigDecimal val) { instance.loanField003 = val; return this; }
        public Builder loanField004(LocalDate val) { instance.loanField004 = val; return this; }
        public Builder loanField005(BigDecimal val) { instance.loanField005 = val; return this; }
        public Builder loanField006(String val) { instance.loanField006 = val; return this; }
        public Builder loanField007(BigDecimal val) { instance.loanField007 = val; return this; }
        public Builder loanField008(LocalDate val) { instance.loanField008 = val; return this; }
        public Builder loanField009(Boolean val) { instance.loanField009 = val; return this; }
        public Builder loanField010(Long val) { instance.loanField010 = val; return this; }
        public Builder loanField011(String val) { instance.loanField011 = val; return this; }
        public Builder loanField012(Boolean val) { instance.loanField012 = val; return this; }
        public Builder loanField013(Integer val) { instance.loanField013 = val; return this; }
        public Builder loanField014(Boolean val) { instance.loanField014 = val; return this; }
        public Builder loanField015(Long val) { instance.loanField015 = val; return this; }
        public LoanDto020 build() { return instance; }
    }

    public Long getLoanField000() { return loanField000; }
    public void setLoanField000(Long loanField000) { this.loanField000 = loanField000; }

    public String getLoanField001() { return loanField001; }
    public void setLoanField001(String loanField001) { this.loanField001 = loanField001; }

    public BigDecimal getLoanField002() { return loanField002; }
    public void setLoanField002(BigDecimal loanField002) { this.loanField002 = loanField002; }

    public BigDecimal getLoanField003() { return loanField003; }
    public void setLoanField003(BigDecimal loanField003) { this.loanField003 = loanField003; }

    public LocalDate getLoanField004() { return loanField004; }
    public void setLoanField004(LocalDate loanField004) { this.loanField004 = loanField004; }

    public BigDecimal getLoanField005() { return loanField005; }
    public void setLoanField005(BigDecimal loanField005) { this.loanField005 = loanField005; }

    public String getLoanField006() { return loanField006; }
    public void setLoanField006(String loanField006) { this.loanField006 = loanField006; }

    public BigDecimal getLoanField007() { return loanField007; }
    public void setLoanField007(BigDecimal loanField007) { this.loanField007 = loanField007; }

    public LocalDate getLoanField008() { return loanField008; }
    public void setLoanField008(LocalDate loanField008) { this.loanField008 = loanField008; }

    public Boolean getLoanField009() { return loanField009; }
    public void setLoanField009(Boolean loanField009) { this.loanField009 = loanField009; }

    public Long getLoanField010() { return loanField010; }
    public void setLoanField010(Long loanField010) { this.loanField010 = loanField010; }

    public String getLoanField011() { return loanField011; }
    public void setLoanField011(String loanField011) { this.loanField011 = loanField011; }

    public Boolean getLoanField012() { return loanField012; }
    public void setLoanField012(Boolean loanField012) { this.loanField012 = loanField012; }

    public Integer getLoanField013() { return loanField013; }
    public void setLoanField013(Integer loanField013) { this.loanField013 = loanField013; }

    public Boolean getLoanField014() { return loanField014; }
    public void setLoanField014(Boolean loanField014) { this.loanField014 = loanField014; }

    public Long getLoanField015() { return loanField015; }
    public void setLoanField015(Long loanField015) { this.loanField015 = loanField015; }

    @Override
    public String toString() {
        return "LoanDto020{" +
            "loanField000=" + loanField000 + ", " +
            "loanField001=" + loanField001 + ", " +
            "loanField002=" + loanField002 + ", " +
            "loanField003=" + loanField003 + ", " +
            "loanField004=" + loanField004 + ", " +
            "}";
    }
}
