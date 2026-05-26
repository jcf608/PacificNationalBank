package com.pnb.loan;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * LoanDto057 — Data Transfer Object for loan operations.
 * Variant 57 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LoanDto057 {

    @JsonProperty("loanField000")
    private Integer loanField000;

    @DecimalMin(value = "0.00")
    @JsonProperty("loanField001")
    private BigDecimal loanField001;

    @Size(max = 40)
    @JsonProperty("loanField002")
    private String loanField002;

    @JsonProperty("loanField003")
    private Boolean loanField003;

    @JsonProperty("loanField004")
    private Double loanField004;

    @JsonProperty("loanField005")
    private Long loanField005;

    @JsonProperty("loanField006")
    private LocalDate loanField006;

    @JsonProperty("loanField007")
    private Long loanField007;

    @Size(max = 200)
    @JsonProperty("loanField008")
    private String loanField008;

    @JsonProperty("loanField009")
    private Integer loanField009;

    @DecimalMin(value = "0.00")
    @JsonProperty("loanField010")
    private BigDecimal loanField010;

    @JsonProperty("loanField011")
    private Boolean loanField011;

    @JsonProperty("loanField012")
    private LocalDate loanField012;

    @DecimalMin(value = "0.00")
    @JsonProperty("loanField013")
    private BigDecimal loanField013;

    @JsonProperty("loanField014")
    private Integer loanField014;

    @JsonProperty("loanField015")
    private Boolean loanField015;

    @DecimalMin(value = "0.00")
    @JsonProperty("loanField016")
    private BigDecimal loanField016;

    public LoanDto057() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final LoanDto057 instance = new LoanDto057();

        public Builder loanField000(Integer val) { instance.loanField000 = val; return this; }
        public Builder loanField001(BigDecimal val) { instance.loanField001 = val; return this; }
        public Builder loanField002(String val) { instance.loanField002 = val; return this; }
        public Builder loanField003(Boolean val) { instance.loanField003 = val; return this; }
        public Builder loanField004(Double val) { instance.loanField004 = val; return this; }
        public Builder loanField005(Long val) { instance.loanField005 = val; return this; }
        public Builder loanField006(LocalDate val) { instance.loanField006 = val; return this; }
        public Builder loanField007(Long val) { instance.loanField007 = val; return this; }
        public Builder loanField008(String val) { instance.loanField008 = val; return this; }
        public Builder loanField009(Integer val) { instance.loanField009 = val; return this; }
        public Builder loanField010(BigDecimal val) { instance.loanField010 = val; return this; }
        public Builder loanField011(Boolean val) { instance.loanField011 = val; return this; }
        public Builder loanField012(LocalDate val) { instance.loanField012 = val; return this; }
        public Builder loanField013(BigDecimal val) { instance.loanField013 = val; return this; }
        public Builder loanField014(Integer val) { instance.loanField014 = val; return this; }
        public Builder loanField015(Boolean val) { instance.loanField015 = val; return this; }
        public Builder loanField016(BigDecimal val) { instance.loanField016 = val; return this; }
        public LoanDto057 build() { return instance; }
    }

    public Integer getLoanField000() { return loanField000; }
    public void setLoanField000(Integer loanField000) { this.loanField000 = loanField000; }

    public BigDecimal getLoanField001() { return loanField001; }
    public void setLoanField001(BigDecimal loanField001) { this.loanField001 = loanField001; }

    public String getLoanField002() { return loanField002; }
    public void setLoanField002(String loanField002) { this.loanField002 = loanField002; }

    public Boolean getLoanField003() { return loanField003; }
    public void setLoanField003(Boolean loanField003) { this.loanField003 = loanField003; }

    public Double getLoanField004() { return loanField004; }
    public void setLoanField004(Double loanField004) { this.loanField004 = loanField004; }

    public Long getLoanField005() { return loanField005; }
    public void setLoanField005(Long loanField005) { this.loanField005 = loanField005; }

    public LocalDate getLoanField006() { return loanField006; }
    public void setLoanField006(LocalDate loanField006) { this.loanField006 = loanField006; }

    public Long getLoanField007() { return loanField007; }
    public void setLoanField007(Long loanField007) { this.loanField007 = loanField007; }

    public String getLoanField008() { return loanField008; }
    public void setLoanField008(String loanField008) { this.loanField008 = loanField008; }

    public Integer getLoanField009() { return loanField009; }
    public void setLoanField009(Integer loanField009) { this.loanField009 = loanField009; }

    public BigDecimal getLoanField010() { return loanField010; }
    public void setLoanField010(BigDecimal loanField010) { this.loanField010 = loanField010; }

    public Boolean getLoanField011() { return loanField011; }
    public void setLoanField011(Boolean loanField011) { this.loanField011 = loanField011; }

    public LocalDate getLoanField012() { return loanField012; }
    public void setLoanField012(LocalDate loanField012) { this.loanField012 = loanField012; }

    public BigDecimal getLoanField013() { return loanField013; }
    public void setLoanField013(BigDecimal loanField013) { this.loanField013 = loanField013; }

    public Integer getLoanField014() { return loanField014; }
    public void setLoanField014(Integer loanField014) { this.loanField014 = loanField014; }

    public Boolean getLoanField015() { return loanField015; }
    public void setLoanField015(Boolean loanField015) { this.loanField015 = loanField015; }

    public BigDecimal getLoanField016() { return loanField016; }
    public void setLoanField016(BigDecimal loanField016) { this.loanField016 = loanField016; }

    @Override
    public String toString() {
        return "LoanDto057{" +
            "loanField000=" + loanField000 + ", " +
            "loanField001=" + loanField001 + ", " +
            "loanField002=" + loanField002 + ", " +
            "loanField003=" + loanField003 + ", " +
            "loanField004=" + loanField004 + ", " +
            "}";
    }
}
