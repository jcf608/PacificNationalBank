package com.pnb.loan;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * LoanDto040 — Data Transfer Object for loan operations.
 * Variant 40 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LoanDto040 {

    @JsonProperty("loanField000")
    private LocalDate loanField000;

    @JsonProperty("loanField001")
    private LocalDate loanField001;

    @JsonProperty("loanField002")
    private Long loanField002;

    @JsonProperty("loanField003")
    private LocalDate loanField003;

    @Size(max = 200)
    @JsonProperty("loanField004")
    private String loanField004;

    @Size(max = 100)
    @JsonProperty("loanField005")
    private String loanField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("loanField006")
    private BigDecimal loanField006;

    @JsonProperty("loanField007")
    private Long loanField007;

    @JsonProperty("loanField008")
    private Long loanField008;

    @JsonProperty("loanField009")
    private Long loanField009;

    @JsonProperty("loanField010")
    private Long loanField010;

    @DecimalMin(value = "0.00")
    @JsonProperty("loanField011")
    private BigDecimal loanField011;

    public LoanDto040() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final LoanDto040 instance = new LoanDto040();

        public Builder loanField000(LocalDate val) { instance.loanField000 = val; return this; }
        public Builder loanField001(LocalDate val) { instance.loanField001 = val; return this; }
        public Builder loanField002(Long val) { instance.loanField002 = val; return this; }
        public Builder loanField003(LocalDate val) { instance.loanField003 = val; return this; }
        public Builder loanField004(String val) { instance.loanField004 = val; return this; }
        public Builder loanField005(String val) { instance.loanField005 = val; return this; }
        public Builder loanField006(BigDecimal val) { instance.loanField006 = val; return this; }
        public Builder loanField007(Long val) { instance.loanField007 = val; return this; }
        public Builder loanField008(Long val) { instance.loanField008 = val; return this; }
        public Builder loanField009(Long val) { instance.loanField009 = val; return this; }
        public Builder loanField010(Long val) { instance.loanField010 = val; return this; }
        public Builder loanField011(BigDecimal val) { instance.loanField011 = val; return this; }
        public LoanDto040 build() { return instance; }
    }

    public LocalDate getLoanField000() { return loanField000; }
    public void setLoanField000(LocalDate loanField000) { this.loanField000 = loanField000; }

    public LocalDate getLoanField001() { return loanField001; }
    public void setLoanField001(LocalDate loanField001) { this.loanField001 = loanField001; }

    public Long getLoanField002() { return loanField002; }
    public void setLoanField002(Long loanField002) { this.loanField002 = loanField002; }

    public LocalDate getLoanField003() { return loanField003; }
    public void setLoanField003(LocalDate loanField003) { this.loanField003 = loanField003; }

    public String getLoanField004() { return loanField004; }
    public void setLoanField004(String loanField004) { this.loanField004 = loanField004; }

    public String getLoanField005() { return loanField005; }
    public void setLoanField005(String loanField005) { this.loanField005 = loanField005; }

    public BigDecimal getLoanField006() { return loanField006; }
    public void setLoanField006(BigDecimal loanField006) { this.loanField006 = loanField006; }

    public Long getLoanField007() { return loanField007; }
    public void setLoanField007(Long loanField007) { this.loanField007 = loanField007; }

    public Long getLoanField008() { return loanField008; }
    public void setLoanField008(Long loanField008) { this.loanField008 = loanField008; }

    public Long getLoanField009() { return loanField009; }
    public void setLoanField009(Long loanField009) { this.loanField009 = loanField009; }

    public Long getLoanField010() { return loanField010; }
    public void setLoanField010(Long loanField010) { this.loanField010 = loanField010; }

    public BigDecimal getLoanField011() { return loanField011; }
    public void setLoanField011(BigDecimal loanField011) { this.loanField011 = loanField011; }

    @Override
    public String toString() {
        return "LoanDto040{" +
            "loanField000=" + loanField000 + ", " +
            "loanField001=" + loanField001 + ", " +
            "loanField002=" + loanField002 + ", " +
            "loanField003=" + loanField003 + ", " +
            "loanField004=" + loanField004 + ", " +
            "}";
    }
}
