package com.pnb.loan;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * LoanDto021 — Data Transfer Object for loan operations.
 * Variant 21 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LoanDto021 {

    @Size(max = 200)
    @JsonProperty("loanField000")
    private String loanField000;

    @JsonProperty("loanField001")
    private Integer loanField001;

    @JsonProperty("loanField002")
    private LocalDate loanField002;

    @DecimalMin(value = "0.00")
    @JsonProperty("loanField003")
    private BigDecimal loanField003;

    @JsonProperty("loanField004")
    private Integer loanField004;

    @JsonProperty("loanField005")
    private Long loanField005;

    @JsonProperty("loanField006")
    private Integer loanField006;

    @JsonProperty("loanField007")
    private Double loanField007;

    @JsonProperty("loanField008")
    private Boolean loanField008;

    @Size(max = 20)
    @JsonProperty("loanField009")
    private String loanField009;

    @JsonProperty("loanField010")
    private LocalDate loanField010;

    @JsonProperty("loanField011")
    private Long loanField011;

    @JsonProperty("loanField012")
    private Boolean loanField012;

    @JsonProperty("loanField013")
    private Integer loanField013;

    @Size(max = 200)
    @JsonProperty("loanField014")
    private String loanField014;

    @DecimalMin(value = "0.00")
    @JsonProperty("loanField015")
    private BigDecimal loanField015;

    @Size(max = 100)
    @JsonProperty("loanField016")
    private String loanField016;

    public LoanDto021() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final LoanDto021 instance = new LoanDto021();

        public Builder loanField000(String val) { instance.loanField000 = val; return this; }
        public Builder loanField001(Integer val) { instance.loanField001 = val; return this; }
        public Builder loanField002(LocalDate val) { instance.loanField002 = val; return this; }
        public Builder loanField003(BigDecimal val) { instance.loanField003 = val; return this; }
        public Builder loanField004(Integer val) { instance.loanField004 = val; return this; }
        public Builder loanField005(Long val) { instance.loanField005 = val; return this; }
        public Builder loanField006(Integer val) { instance.loanField006 = val; return this; }
        public Builder loanField007(Double val) { instance.loanField007 = val; return this; }
        public Builder loanField008(Boolean val) { instance.loanField008 = val; return this; }
        public Builder loanField009(String val) { instance.loanField009 = val; return this; }
        public Builder loanField010(LocalDate val) { instance.loanField010 = val; return this; }
        public Builder loanField011(Long val) { instance.loanField011 = val; return this; }
        public Builder loanField012(Boolean val) { instance.loanField012 = val; return this; }
        public Builder loanField013(Integer val) { instance.loanField013 = val; return this; }
        public Builder loanField014(String val) { instance.loanField014 = val; return this; }
        public Builder loanField015(BigDecimal val) { instance.loanField015 = val; return this; }
        public Builder loanField016(String val) { instance.loanField016 = val; return this; }
        public LoanDto021 build() { return instance; }
    }

    public String getLoanField000() { return loanField000; }
    public void setLoanField000(String loanField000) { this.loanField000 = loanField000; }

    public Integer getLoanField001() { return loanField001; }
    public void setLoanField001(Integer loanField001) { this.loanField001 = loanField001; }

    public LocalDate getLoanField002() { return loanField002; }
    public void setLoanField002(LocalDate loanField002) { this.loanField002 = loanField002; }

    public BigDecimal getLoanField003() { return loanField003; }
    public void setLoanField003(BigDecimal loanField003) { this.loanField003 = loanField003; }

    public Integer getLoanField004() { return loanField004; }
    public void setLoanField004(Integer loanField004) { this.loanField004 = loanField004; }

    public Long getLoanField005() { return loanField005; }
    public void setLoanField005(Long loanField005) { this.loanField005 = loanField005; }

    public Integer getLoanField006() { return loanField006; }
    public void setLoanField006(Integer loanField006) { this.loanField006 = loanField006; }

    public Double getLoanField007() { return loanField007; }
    public void setLoanField007(Double loanField007) { this.loanField007 = loanField007; }

    public Boolean getLoanField008() { return loanField008; }
    public void setLoanField008(Boolean loanField008) { this.loanField008 = loanField008; }

    public String getLoanField009() { return loanField009; }
    public void setLoanField009(String loanField009) { this.loanField009 = loanField009; }

    public LocalDate getLoanField010() { return loanField010; }
    public void setLoanField010(LocalDate loanField010) { this.loanField010 = loanField010; }

    public Long getLoanField011() { return loanField011; }
    public void setLoanField011(Long loanField011) { this.loanField011 = loanField011; }

    public Boolean getLoanField012() { return loanField012; }
    public void setLoanField012(Boolean loanField012) { this.loanField012 = loanField012; }

    public Integer getLoanField013() { return loanField013; }
    public void setLoanField013(Integer loanField013) { this.loanField013 = loanField013; }

    public String getLoanField014() { return loanField014; }
    public void setLoanField014(String loanField014) { this.loanField014 = loanField014; }

    public BigDecimal getLoanField015() { return loanField015; }
    public void setLoanField015(BigDecimal loanField015) { this.loanField015 = loanField015; }

    public String getLoanField016() { return loanField016; }
    public void setLoanField016(String loanField016) { this.loanField016 = loanField016; }

    @Override
    public String toString() {
        return "LoanDto021{" +
            "loanField000=" + loanField000 + ", " +
            "loanField001=" + loanField001 + ", " +
            "loanField002=" + loanField002 + ", " +
            "loanField003=" + loanField003 + ", " +
            "loanField004=" + loanField004 + ", " +
            "}";
    }
}
