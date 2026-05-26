package com.pnb.loan;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * LoanDto022 — Data Transfer Object for loan operations.
 * Variant 22 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LoanDto022 {

    @JsonProperty("loanField000")
    private Integer loanField000;

    @JsonProperty("loanField001")
    private LocalDate loanField001;

    @JsonProperty("loanField002")
    private Double loanField002;

    @JsonProperty("loanField003")
    private Double loanField003;

    @JsonProperty("loanField004")
    private Long loanField004;

    @JsonProperty("loanField005")
    private LocalDate loanField005;

    @JsonProperty("loanField006")
    private Double loanField006;

    @JsonProperty("loanField007")
    private Boolean loanField007;

    @JsonProperty("loanField008")
    private LocalDate loanField008;

    @DecimalMin(value = "0.00")
    @JsonProperty("loanField009")
    private BigDecimal loanField009;

    @DecimalMin(value = "0.00")
    @JsonProperty("loanField010")
    private BigDecimal loanField010;

    @Size(max = 60)
    @JsonProperty("loanField011")
    private String loanField011;

    @Size(max = 100)
    @JsonProperty("loanField012")
    private String loanField012;

    @JsonProperty("loanField013")
    private Boolean loanField013;

    @JsonProperty("loanField014")
    private Double loanField014;

    @JsonProperty("loanField015")
    private LocalDate loanField015;

    @JsonProperty("loanField016")
    private Integer loanField016;

    @DecimalMin(value = "0.00")
    @JsonProperty("loanField017")
    private BigDecimal loanField017;

    public LoanDto022() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final LoanDto022 instance = new LoanDto022();

        public Builder loanField000(Integer val) { instance.loanField000 = val; return this; }
        public Builder loanField001(LocalDate val) { instance.loanField001 = val; return this; }
        public Builder loanField002(Double val) { instance.loanField002 = val; return this; }
        public Builder loanField003(Double val) { instance.loanField003 = val; return this; }
        public Builder loanField004(Long val) { instance.loanField004 = val; return this; }
        public Builder loanField005(LocalDate val) { instance.loanField005 = val; return this; }
        public Builder loanField006(Double val) { instance.loanField006 = val; return this; }
        public Builder loanField007(Boolean val) { instance.loanField007 = val; return this; }
        public Builder loanField008(LocalDate val) { instance.loanField008 = val; return this; }
        public Builder loanField009(BigDecimal val) { instance.loanField009 = val; return this; }
        public Builder loanField010(BigDecimal val) { instance.loanField010 = val; return this; }
        public Builder loanField011(String val) { instance.loanField011 = val; return this; }
        public Builder loanField012(String val) { instance.loanField012 = val; return this; }
        public Builder loanField013(Boolean val) { instance.loanField013 = val; return this; }
        public Builder loanField014(Double val) { instance.loanField014 = val; return this; }
        public Builder loanField015(LocalDate val) { instance.loanField015 = val; return this; }
        public Builder loanField016(Integer val) { instance.loanField016 = val; return this; }
        public Builder loanField017(BigDecimal val) { instance.loanField017 = val; return this; }
        public LoanDto022 build() { return instance; }
    }

    public Integer getLoanField000() { return loanField000; }
    public void setLoanField000(Integer loanField000) { this.loanField000 = loanField000; }

    public LocalDate getLoanField001() { return loanField001; }
    public void setLoanField001(LocalDate loanField001) { this.loanField001 = loanField001; }

    public Double getLoanField002() { return loanField002; }
    public void setLoanField002(Double loanField002) { this.loanField002 = loanField002; }

    public Double getLoanField003() { return loanField003; }
    public void setLoanField003(Double loanField003) { this.loanField003 = loanField003; }

    public Long getLoanField004() { return loanField004; }
    public void setLoanField004(Long loanField004) { this.loanField004 = loanField004; }

    public LocalDate getLoanField005() { return loanField005; }
    public void setLoanField005(LocalDate loanField005) { this.loanField005 = loanField005; }

    public Double getLoanField006() { return loanField006; }
    public void setLoanField006(Double loanField006) { this.loanField006 = loanField006; }

    public Boolean getLoanField007() { return loanField007; }
    public void setLoanField007(Boolean loanField007) { this.loanField007 = loanField007; }

    public LocalDate getLoanField008() { return loanField008; }
    public void setLoanField008(LocalDate loanField008) { this.loanField008 = loanField008; }

    public BigDecimal getLoanField009() { return loanField009; }
    public void setLoanField009(BigDecimal loanField009) { this.loanField009 = loanField009; }

    public BigDecimal getLoanField010() { return loanField010; }
    public void setLoanField010(BigDecimal loanField010) { this.loanField010 = loanField010; }

    public String getLoanField011() { return loanField011; }
    public void setLoanField011(String loanField011) { this.loanField011 = loanField011; }

    public String getLoanField012() { return loanField012; }
    public void setLoanField012(String loanField012) { this.loanField012 = loanField012; }

    public Boolean getLoanField013() { return loanField013; }
    public void setLoanField013(Boolean loanField013) { this.loanField013 = loanField013; }

    public Double getLoanField014() { return loanField014; }
    public void setLoanField014(Double loanField014) { this.loanField014 = loanField014; }

    public LocalDate getLoanField015() { return loanField015; }
    public void setLoanField015(LocalDate loanField015) { this.loanField015 = loanField015; }

    public Integer getLoanField016() { return loanField016; }
    public void setLoanField016(Integer loanField016) { this.loanField016 = loanField016; }

    public BigDecimal getLoanField017() { return loanField017; }
    public void setLoanField017(BigDecimal loanField017) { this.loanField017 = loanField017; }

    @Override
    public String toString() {
        return "LoanDto022{" +
            "loanField000=" + loanField000 + ", " +
            "loanField001=" + loanField001 + ", " +
            "loanField002=" + loanField002 + ", " +
            "loanField003=" + loanField003 + ", " +
            "loanField004=" + loanField004 + ", " +
            "}";
    }
}
