package com.pnb.loan;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * LoanDto052 — Data Transfer Object for loan operations.
 * Variant 52 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LoanDto052 {

    @Size(max = 20)
    @JsonProperty("loanField000")
    private String loanField000;

    @DecimalMin(value = "0.00")
    @JsonProperty("loanField001")
    private BigDecimal loanField001;

    @JsonProperty("loanField002")
    private Boolean loanField002;

    @JsonProperty("loanField003")
    private Integer loanField003;

    @JsonProperty("loanField004")
    private LocalDate loanField004;

    @JsonProperty("loanField005")
    private Integer loanField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("loanField006")
    private BigDecimal loanField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("loanField007")
    private BigDecimal loanField007;

    @JsonProperty("loanField008")
    private Double loanField008;

    @JsonProperty("loanField009")
    private Long loanField009;

    @DecimalMin(value = "0.00")
    @JsonProperty("loanField010")
    private BigDecimal loanField010;

    @JsonProperty("loanField011")
    private Double loanField011;

    public LoanDto052() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final LoanDto052 instance = new LoanDto052();

        public Builder loanField000(String val) { instance.loanField000 = val; return this; }
        public Builder loanField001(BigDecimal val) { instance.loanField001 = val; return this; }
        public Builder loanField002(Boolean val) { instance.loanField002 = val; return this; }
        public Builder loanField003(Integer val) { instance.loanField003 = val; return this; }
        public Builder loanField004(LocalDate val) { instance.loanField004 = val; return this; }
        public Builder loanField005(Integer val) { instance.loanField005 = val; return this; }
        public Builder loanField006(BigDecimal val) { instance.loanField006 = val; return this; }
        public Builder loanField007(BigDecimal val) { instance.loanField007 = val; return this; }
        public Builder loanField008(Double val) { instance.loanField008 = val; return this; }
        public Builder loanField009(Long val) { instance.loanField009 = val; return this; }
        public Builder loanField010(BigDecimal val) { instance.loanField010 = val; return this; }
        public Builder loanField011(Double val) { instance.loanField011 = val; return this; }
        public LoanDto052 build() { return instance; }
    }

    public String getLoanField000() { return loanField000; }
    public void setLoanField000(String loanField000) { this.loanField000 = loanField000; }

    public BigDecimal getLoanField001() { return loanField001; }
    public void setLoanField001(BigDecimal loanField001) { this.loanField001 = loanField001; }

    public Boolean getLoanField002() { return loanField002; }
    public void setLoanField002(Boolean loanField002) { this.loanField002 = loanField002; }

    public Integer getLoanField003() { return loanField003; }
    public void setLoanField003(Integer loanField003) { this.loanField003 = loanField003; }

    public LocalDate getLoanField004() { return loanField004; }
    public void setLoanField004(LocalDate loanField004) { this.loanField004 = loanField004; }

    public Integer getLoanField005() { return loanField005; }
    public void setLoanField005(Integer loanField005) { this.loanField005 = loanField005; }

    public BigDecimal getLoanField006() { return loanField006; }
    public void setLoanField006(BigDecimal loanField006) { this.loanField006 = loanField006; }

    public BigDecimal getLoanField007() { return loanField007; }
    public void setLoanField007(BigDecimal loanField007) { this.loanField007 = loanField007; }

    public Double getLoanField008() { return loanField008; }
    public void setLoanField008(Double loanField008) { this.loanField008 = loanField008; }

    public Long getLoanField009() { return loanField009; }
    public void setLoanField009(Long loanField009) { this.loanField009 = loanField009; }

    public BigDecimal getLoanField010() { return loanField010; }
    public void setLoanField010(BigDecimal loanField010) { this.loanField010 = loanField010; }

    public Double getLoanField011() { return loanField011; }
    public void setLoanField011(Double loanField011) { this.loanField011 = loanField011; }

    @Override
    public String toString() {
        return "LoanDto052{" +
            "loanField000=" + loanField000 + ", " +
            "loanField001=" + loanField001 + ", " +
            "loanField002=" + loanField002 + ", " +
            "loanField003=" + loanField003 + ", " +
            "loanField004=" + loanField004 + ", " +
            "}";
    }
}
