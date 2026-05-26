package com.pnb.loan;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * LoanDto029 — Data Transfer Object for loan operations.
 * Variant 29 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LoanDto029 {

    @JsonProperty("loanField000")
    private Boolean loanField000;

    @JsonProperty("loanField001")
    private Long loanField001;

    @Size(max = 60)
    @JsonProperty("loanField002")
    private String loanField002;

    @JsonProperty("loanField003")
    private Double loanField003;

    @JsonProperty("loanField004")
    private Integer loanField004;

    @Size(max = 60)
    @JsonProperty("loanField005")
    private String loanField005;

    @JsonProperty("loanField006")
    private Double loanField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("loanField007")
    private BigDecimal loanField007;

    @JsonProperty("loanField008")
    private Integer loanField008;

    @JsonProperty("loanField009")
    private Boolean loanField009;

    @JsonProperty("loanField010")
    private Boolean loanField010;

    @JsonProperty("loanField011")
    private Double loanField011;

    @DecimalMin(value = "0.00")
    @JsonProperty("loanField012")
    private BigDecimal loanField012;

    public LoanDto029() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final LoanDto029 instance = new LoanDto029();

        public Builder loanField000(Boolean val) { instance.loanField000 = val; return this; }
        public Builder loanField001(Long val) { instance.loanField001 = val; return this; }
        public Builder loanField002(String val) { instance.loanField002 = val; return this; }
        public Builder loanField003(Double val) { instance.loanField003 = val; return this; }
        public Builder loanField004(Integer val) { instance.loanField004 = val; return this; }
        public Builder loanField005(String val) { instance.loanField005 = val; return this; }
        public Builder loanField006(Double val) { instance.loanField006 = val; return this; }
        public Builder loanField007(BigDecimal val) { instance.loanField007 = val; return this; }
        public Builder loanField008(Integer val) { instance.loanField008 = val; return this; }
        public Builder loanField009(Boolean val) { instance.loanField009 = val; return this; }
        public Builder loanField010(Boolean val) { instance.loanField010 = val; return this; }
        public Builder loanField011(Double val) { instance.loanField011 = val; return this; }
        public Builder loanField012(BigDecimal val) { instance.loanField012 = val; return this; }
        public LoanDto029 build() { return instance; }
    }

    public Boolean getLoanField000() { return loanField000; }
    public void setLoanField000(Boolean loanField000) { this.loanField000 = loanField000; }

    public Long getLoanField001() { return loanField001; }
    public void setLoanField001(Long loanField001) { this.loanField001 = loanField001; }

    public String getLoanField002() { return loanField002; }
    public void setLoanField002(String loanField002) { this.loanField002 = loanField002; }

    public Double getLoanField003() { return loanField003; }
    public void setLoanField003(Double loanField003) { this.loanField003 = loanField003; }

    public Integer getLoanField004() { return loanField004; }
    public void setLoanField004(Integer loanField004) { this.loanField004 = loanField004; }

    public String getLoanField005() { return loanField005; }
    public void setLoanField005(String loanField005) { this.loanField005 = loanField005; }

    public Double getLoanField006() { return loanField006; }
    public void setLoanField006(Double loanField006) { this.loanField006 = loanField006; }

    public BigDecimal getLoanField007() { return loanField007; }
    public void setLoanField007(BigDecimal loanField007) { this.loanField007 = loanField007; }

    public Integer getLoanField008() { return loanField008; }
    public void setLoanField008(Integer loanField008) { this.loanField008 = loanField008; }

    public Boolean getLoanField009() { return loanField009; }
    public void setLoanField009(Boolean loanField009) { this.loanField009 = loanField009; }

    public Boolean getLoanField010() { return loanField010; }
    public void setLoanField010(Boolean loanField010) { this.loanField010 = loanField010; }

    public Double getLoanField011() { return loanField011; }
    public void setLoanField011(Double loanField011) { this.loanField011 = loanField011; }

    public BigDecimal getLoanField012() { return loanField012; }
    public void setLoanField012(BigDecimal loanField012) { this.loanField012 = loanField012; }

    @Override
    public String toString() {
        return "LoanDto029{" +
            "loanField000=" + loanField000 + ", " +
            "loanField001=" + loanField001 + ", " +
            "loanField002=" + loanField002 + ", " +
            "loanField003=" + loanField003 + ", " +
            "loanField004=" + loanField004 + ", " +
            "}";
    }
}
