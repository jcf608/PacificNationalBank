package com.pnb.loan;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * LoanDto042 — Data Transfer Object for loan operations.
 * Variant 42 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LoanDto042 {

    @Size(max = 200)
    @JsonProperty("loanField000")
    private String loanField000;

    @JsonProperty("loanField001")
    private Long loanField001;

    @JsonProperty("loanField002")
    private LocalDate loanField002;

    @JsonProperty("loanField003")
    private Long loanField003;

    @JsonProperty("loanField004")
    private LocalDate loanField004;

    @JsonProperty("loanField005")
    private LocalDate loanField005;

    @Size(max = 200)
    @JsonProperty("loanField006")
    private String loanField006;

    @JsonProperty("loanField007")
    private Integer loanField007;

    @Size(max = 20)
    @JsonProperty("loanField008")
    private String loanField008;

    @JsonProperty("loanField009")
    private LocalDate loanField009;

    @JsonProperty("loanField010")
    private Long loanField010;

    @Size(max = 40)
    @JsonProperty("loanField011")
    private String loanField011;

    @JsonProperty("loanField012")
    private Integer loanField012;

    @JsonProperty("loanField013")
    private Boolean loanField013;

    public LoanDto042() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final LoanDto042 instance = new LoanDto042();

        public Builder loanField000(String val) { instance.loanField000 = val; return this; }
        public Builder loanField001(Long val) { instance.loanField001 = val; return this; }
        public Builder loanField002(LocalDate val) { instance.loanField002 = val; return this; }
        public Builder loanField003(Long val) { instance.loanField003 = val; return this; }
        public Builder loanField004(LocalDate val) { instance.loanField004 = val; return this; }
        public Builder loanField005(LocalDate val) { instance.loanField005 = val; return this; }
        public Builder loanField006(String val) { instance.loanField006 = val; return this; }
        public Builder loanField007(Integer val) { instance.loanField007 = val; return this; }
        public Builder loanField008(String val) { instance.loanField008 = val; return this; }
        public Builder loanField009(LocalDate val) { instance.loanField009 = val; return this; }
        public Builder loanField010(Long val) { instance.loanField010 = val; return this; }
        public Builder loanField011(String val) { instance.loanField011 = val; return this; }
        public Builder loanField012(Integer val) { instance.loanField012 = val; return this; }
        public Builder loanField013(Boolean val) { instance.loanField013 = val; return this; }
        public LoanDto042 build() { return instance; }
    }

    public String getLoanField000() { return loanField000; }
    public void setLoanField000(String loanField000) { this.loanField000 = loanField000; }

    public Long getLoanField001() { return loanField001; }
    public void setLoanField001(Long loanField001) { this.loanField001 = loanField001; }

    public LocalDate getLoanField002() { return loanField002; }
    public void setLoanField002(LocalDate loanField002) { this.loanField002 = loanField002; }

    public Long getLoanField003() { return loanField003; }
    public void setLoanField003(Long loanField003) { this.loanField003 = loanField003; }

    public LocalDate getLoanField004() { return loanField004; }
    public void setLoanField004(LocalDate loanField004) { this.loanField004 = loanField004; }

    public LocalDate getLoanField005() { return loanField005; }
    public void setLoanField005(LocalDate loanField005) { this.loanField005 = loanField005; }

    public String getLoanField006() { return loanField006; }
    public void setLoanField006(String loanField006) { this.loanField006 = loanField006; }

    public Integer getLoanField007() { return loanField007; }
    public void setLoanField007(Integer loanField007) { this.loanField007 = loanField007; }

    public String getLoanField008() { return loanField008; }
    public void setLoanField008(String loanField008) { this.loanField008 = loanField008; }

    public LocalDate getLoanField009() { return loanField009; }
    public void setLoanField009(LocalDate loanField009) { this.loanField009 = loanField009; }

    public Long getLoanField010() { return loanField010; }
    public void setLoanField010(Long loanField010) { this.loanField010 = loanField010; }

    public String getLoanField011() { return loanField011; }
    public void setLoanField011(String loanField011) { this.loanField011 = loanField011; }

    public Integer getLoanField012() { return loanField012; }
    public void setLoanField012(Integer loanField012) { this.loanField012 = loanField012; }

    public Boolean getLoanField013() { return loanField013; }
    public void setLoanField013(Boolean loanField013) { this.loanField013 = loanField013; }

    @Override
    public String toString() {
        return "LoanDto042{" +
            "loanField000=" + loanField000 + ", " +
            "loanField001=" + loanField001 + ", " +
            "loanField002=" + loanField002 + ", " +
            "loanField003=" + loanField003 + ", " +
            "loanField004=" + loanField004 + ", " +
            "}";
    }
}
