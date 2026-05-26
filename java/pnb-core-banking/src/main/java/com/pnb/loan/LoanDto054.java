package com.pnb.loan;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * LoanDto054 — Data Transfer Object for loan operations.
 * Variant 54 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LoanDto054 {

    @Size(max = 60)
    @JsonProperty("loanField000")
    private String loanField000;

    @JsonProperty("loanField001")
    private Long loanField001;

    @JsonProperty("loanField002")
    private Boolean loanField002;

    @JsonProperty("loanField003")
    private Long loanField003;

    @JsonProperty("loanField004")
    private LocalDate loanField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("loanField005")
    private BigDecimal loanField005;

    @JsonProperty("loanField006")
    private Double loanField006;

    @JsonProperty("loanField007")
    private Long loanField007;

    @JsonProperty("loanField008")
    private LocalDate loanField008;

    @JsonProperty("loanField009")
    private Double loanField009;

    @JsonProperty("loanField010")
    private Boolean loanField010;

    @JsonProperty("loanField011")
    private Integer loanField011;

    @DecimalMin(value = "0.00")
    @JsonProperty("loanField012")
    private BigDecimal loanField012;

    @JsonProperty("loanField013")
    private Boolean loanField013;

    public LoanDto054() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final LoanDto054 instance = new LoanDto054();

        public Builder loanField000(String val) { instance.loanField000 = val; return this; }
        public Builder loanField001(Long val) { instance.loanField001 = val; return this; }
        public Builder loanField002(Boolean val) { instance.loanField002 = val; return this; }
        public Builder loanField003(Long val) { instance.loanField003 = val; return this; }
        public Builder loanField004(LocalDate val) { instance.loanField004 = val; return this; }
        public Builder loanField005(BigDecimal val) { instance.loanField005 = val; return this; }
        public Builder loanField006(Double val) { instance.loanField006 = val; return this; }
        public Builder loanField007(Long val) { instance.loanField007 = val; return this; }
        public Builder loanField008(LocalDate val) { instance.loanField008 = val; return this; }
        public Builder loanField009(Double val) { instance.loanField009 = val; return this; }
        public Builder loanField010(Boolean val) { instance.loanField010 = val; return this; }
        public Builder loanField011(Integer val) { instance.loanField011 = val; return this; }
        public Builder loanField012(BigDecimal val) { instance.loanField012 = val; return this; }
        public Builder loanField013(Boolean val) { instance.loanField013 = val; return this; }
        public LoanDto054 build() { return instance; }
    }

    public String getLoanField000() { return loanField000; }
    public void setLoanField000(String loanField000) { this.loanField000 = loanField000; }

    public Long getLoanField001() { return loanField001; }
    public void setLoanField001(Long loanField001) { this.loanField001 = loanField001; }

    public Boolean getLoanField002() { return loanField002; }
    public void setLoanField002(Boolean loanField002) { this.loanField002 = loanField002; }

    public Long getLoanField003() { return loanField003; }
    public void setLoanField003(Long loanField003) { this.loanField003 = loanField003; }

    public LocalDate getLoanField004() { return loanField004; }
    public void setLoanField004(LocalDate loanField004) { this.loanField004 = loanField004; }

    public BigDecimal getLoanField005() { return loanField005; }
    public void setLoanField005(BigDecimal loanField005) { this.loanField005 = loanField005; }

    public Double getLoanField006() { return loanField006; }
    public void setLoanField006(Double loanField006) { this.loanField006 = loanField006; }

    public Long getLoanField007() { return loanField007; }
    public void setLoanField007(Long loanField007) { this.loanField007 = loanField007; }

    public LocalDate getLoanField008() { return loanField008; }
    public void setLoanField008(LocalDate loanField008) { this.loanField008 = loanField008; }

    public Double getLoanField009() { return loanField009; }
    public void setLoanField009(Double loanField009) { this.loanField009 = loanField009; }

    public Boolean getLoanField010() { return loanField010; }
    public void setLoanField010(Boolean loanField010) { this.loanField010 = loanField010; }

    public Integer getLoanField011() { return loanField011; }
    public void setLoanField011(Integer loanField011) { this.loanField011 = loanField011; }

    public BigDecimal getLoanField012() { return loanField012; }
    public void setLoanField012(BigDecimal loanField012) { this.loanField012 = loanField012; }

    public Boolean getLoanField013() { return loanField013; }
    public void setLoanField013(Boolean loanField013) { this.loanField013 = loanField013; }

    @Override
    public String toString() {
        return "LoanDto054{" +
            "loanField000=" + loanField000 + ", " +
            "loanField001=" + loanField001 + ", " +
            "loanField002=" + loanField002 + ", " +
            "loanField003=" + loanField003 + ", " +
            "loanField004=" + loanField004 + ", " +
            "}";
    }
}
