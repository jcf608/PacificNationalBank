package com.pnb.loan;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * LoanV006 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "LOANV006")
public class LoanV006 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "LOAN_NUM", unique = true)
    private String loanNumber;

    @Column(name = "LOAN_TYPE")
    private String loanType;

    @Column(name = "ORIG_AMT", precision = 15, scale = 2)
    private BigDecimal originalAmount;

    @Column(name = "CURR_BAL", precision = 15, scale = 2)
    private BigDecimal currentBalance;

    @Column(name = "INT_RATE", precision = 9, scale = 6)
    private BigDecimal interestRate;

    @Column(name = "MONTHLY_PMT", precision = 13, scale = 2)
    private BigDecimal monthlyPayment;

    @Column(name = "MATURITY_DATE")
    private LocalDate maturityDate;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "DPD")
    private Integer daysDelinquent;

    @Column(name = "FLD_006_00")
    private BigDecimal field006_00;

    @Column(name = "FLD_006_01")
    private Integer field006_01;

    @Column(name = "FLD_006_02")
    private String field006_02;

    @Column(name = "FLD_006_03")
    private String field006_03;

    @Column(name = "FLD_006_04")
    private LocalDate field006_04;

    @Column(name = "FLD_006_05")
    private String field006_05;

    @Column(name = "FLD_006_06")
    private Integer field006_06;

    @Column(name = "FLD_006_07")
    private Integer field006_07;

    @Column(name = "FLD_006_08")
    private Boolean field006_08;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public LoanV006() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getLoanNumber() { return loanNumber; }
    public void setLoanNumber(String loanNumber) { this.loanNumber = loanNumber; }

    public String getLoanType() { return loanType; }
    public void setLoanType(String loanType) { this.loanType = loanType; }

    public BigDecimal getOriginalAmount() { return originalAmount; }
    public void setOriginalAmount(BigDecimal originalAmount) { this.originalAmount = originalAmount; }

    public BigDecimal getCurrentBalance() { return currentBalance; }
    public void setCurrentBalance(BigDecimal currentBalance) { this.currentBalance = currentBalance; }

    public BigDecimal getInterestRate() { return interestRate; }
    public void setInterestRate(BigDecimal interestRate) { this.interestRate = interestRate; }

    public BigDecimal getMonthlyPayment() { return monthlyPayment; }
    public void setMonthlyPayment(BigDecimal monthlyPayment) { this.monthlyPayment = monthlyPayment; }

    public LocalDate getMaturityDate() { return maturityDate; }
    public void setMaturityDate(LocalDate maturityDate) { this.maturityDate = maturityDate; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public Integer getDaysDelinquent() { return daysDelinquent; }
    public void setDaysDelinquent(Integer daysDelinquent) { this.daysDelinquent = daysDelinquent; }

    public BigDecimal getField006_00() { return field006_00; }
    public void setField006_00(BigDecimal field006_00) { this.field006_00 = field006_00; }

    public Integer getField006_01() { return field006_01; }
    public void setField006_01(Integer field006_01) { this.field006_01 = field006_01; }

    public String getField006_02() { return field006_02; }
    public void setField006_02(String field006_02) { this.field006_02 = field006_02; }

    public String getField006_03() { return field006_03; }
    public void setField006_03(String field006_03) { this.field006_03 = field006_03; }

    public LocalDate getField006_04() { return field006_04; }
    public void setField006_04(LocalDate field006_04) { this.field006_04 = field006_04; }

    public String getField006_05() { return field006_05; }
    public void setField006_05(String field006_05) { this.field006_05 = field006_05; }

    public Integer getField006_06() { return field006_06; }
    public void setField006_06(Integer field006_06) { this.field006_06 = field006_06; }

    public Integer getField006_07() { return field006_07; }
    public void setField006_07(Integer field006_07) { this.field006_07 = field006_07; }

    public Boolean getField006_08() { return field006_08; }
    public void setField006_08(Boolean field006_08) { this.field006_08 = field006_08; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LoanV006)) return false;
        LoanV006 that = (LoanV006) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "LoanV006{" +
            "id=" + id +
            ", loanNumber=" + loanNumber +
            ", loanType=" + loanType +
            ", originalAmount=" + originalAmount +
            ", currentBalance=" + currentBalance +
            ", interestRate=" + interestRate +
            '}';
    }
}
