package com.pnb.loan;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * LoanDto059 — Data Transfer Object for loan operations.
 * Variant 59 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LoanDto059 {

    @JsonProperty("loanField000")
    private Long loanField000;

    @JsonProperty("loanField001")
    private Long loanField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("loanField002")
    private BigDecimal loanField002;

    @JsonProperty("loanField003")
    private Boolean loanField003;

    @JsonProperty("loanField004")
    private Integer loanField004;

    @JsonProperty("loanField005")
    private Long loanField005;

    @JsonProperty("loanField006")
    private Double loanField006;

    @JsonProperty("loanField007")
    private Integer loanField007;

    @JsonProperty("loanField008")
    private Long loanField008;

    @Size(max = 40)
    @JsonProperty("loanField009")
    private String loanField009;

    @JsonProperty("loanField010")
    private Integer loanField010;

    @JsonProperty("loanField011")
    private Long loanField011;

    @JsonProperty("loanField012")
    private Boolean loanField012;

    @JsonProperty("loanField013")
    private Double loanField013;

    @JsonProperty("loanField014")
    private LocalDate loanField014;

    @JsonProperty("loanField015")
    private LocalDate loanField015;

    @JsonProperty("loanField016")
    private Long loanField016;

    @JsonProperty("loanField017")
    private Boolean loanField017;

    @JsonProperty("loanField018")
    private Double loanField018;

    public LoanDto059() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final LoanDto059 instance = new LoanDto059();

        public Builder loanField000(Long val) { instance.loanField000 = val; return this; }
        public Builder loanField001(Long val) { instance.loanField001 = val; return this; }
        public Builder loanField002(BigDecimal val) { instance.loanField002 = val; return this; }
        public Builder loanField003(Boolean val) { instance.loanField003 = val; return this; }
        public Builder loanField004(Integer val) { instance.loanField004 = val; return this; }
        public Builder loanField005(Long val) { instance.loanField005 = val; return this; }
        public Builder loanField006(Double val) { instance.loanField006 = val; return this; }
        public Builder loanField007(Integer val) { instance.loanField007 = val; return this; }
        public Builder loanField008(Long val) { instance.loanField008 = val; return this; }
        public Builder loanField009(String val) { instance.loanField009 = val; return this; }
        public Builder loanField010(Integer val) { instance.loanField010 = val; return this; }
        public Builder loanField011(Long val) { instance.loanField011 = val; return this; }
        public Builder loanField012(Boolean val) { instance.loanField012 = val; return this; }
        public Builder loanField013(Double val) { instance.loanField013 = val; return this; }
        public Builder loanField014(LocalDate val) { instance.loanField014 = val; return this; }
        public Builder loanField015(LocalDate val) { instance.loanField015 = val; return this; }
        public Builder loanField016(Long val) { instance.loanField016 = val; return this; }
        public Builder loanField017(Boolean val) { instance.loanField017 = val; return this; }
        public Builder loanField018(Double val) { instance.loanField018 = val; return this; }
        public LoanDto059 build() { return instance; }
    }

    public Long getLoanField000() { return loanField000; }
    public void setLoanField000(Long loanField000) { this.loanField000 = loanField000; }

    public Long getLoanField001() { return loanField001; }
    public void setLoanField001(Long loanField001) { this.loanField001 = loanField001; }

    public BigDecimal getLoanField002() { return loanField002; }
    public void setLoanField002(BigDecimal loanField002) { this.loanField002 = loanField002; }

    public Boolean getLoanField003() { return loanField003; }
    public void setLoanField003(Boolean loanField003) { this.loanField003 = loanField003; }

    public Integer getLoanField004() { return loanField004; }
    public void setLoanField004(Integer loanField004) { this.loanField004 = loanField004; }

    public Long getLoanField005() { return loanField005; }
    public void setLoanField005(Long loanField005) { this.loanField005 = loanField005; }

    public Double getLoanField006() { return loanField006; }
    public void setLoanField006(Double loanField006) { this.loanField006 = loanField006; }

    public Integer getLoanField007() { return loanField007; }
    public void setLoanField007(Integer loanField007) { this.loanField007 = loanField007; }

    public Long getLoanField008() { return loanField008; }
    public void setLoanField008(Long loanField008) { this.loanField008 = loanField008; }

    public String getLoanField009() { return loanField009; }
    public void setLoanField009(String loanField009) { this.loanField009 = loanField009; }

    public Integer getLoanField010() { return loanField010; }
    public void setLoanField010(Integer loanField010) { this.loanField010 = loanField010; }

    public Long getLoanField011() { return loanField011; }
    public void setLoanField011(Long loanField011) { this.loanField011 = loanField011; }

    public Boolean getLoanField012() { return loanField012; }
    public void setLoanField012(Boolean loanField012) { this.loanField012 = loanField012; }

    public Double getLoanField013() { return loanField013; }
    public void setLoanField013(Double loanField013) { this.loanField013 = loanField013; }

    public LocalDate getLoanField014() { return loanField014; }
    public void setLoanField014(LocalDate loanField014) { this.loanField014 = loanField014; }

    public LocalDate getLoanField015() { return loanField015; }
    public void setLoanField015(LocalDate loanField015) { this.loanField015 = loanField015; }

    public Long getLoanField016() { return loanField016; }
    public void setLoanField016(Long loanField016) { this.loanField016 = loanField016; }

    public Boolean getLoanField017() { return loanField017; }
    public void setLoanField017(Boolean loanField017) { this.loanField017 = loanField017; }

    public Double getLoanField018() { return loanField018; }
    public void setLoanField018(Double loanField018) { this.loanField018 = loanField018; }

    @Override
    public String toString() {
        return "LoanDto059{" +
            "loanField000=" + loanField000 + ", " +
            "loanField001=" + loanField001 + ", " +
            "loanField002=" + loanField002 + ", " +
            "loanField003=" + loanField003 + ", " +
            "loanField004=" + loanField004 + ", " +
            "}";
    }
}
