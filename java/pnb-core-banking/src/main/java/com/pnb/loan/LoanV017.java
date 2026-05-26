package com.pnb.loan;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * LoanV017 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "LOANV017")
public class LoanV017 {

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

    @Column(name = "FLD_017_00")
    private LocalDate field017_00;

    @Column(name = "FLD_017_01")
    private Integer field017_01;

    @Column(name = "FLD_017_02")
    private BigDecimal field017_02;

    @Column(name = "FLD_017_03")
    private BigDecimal field017_03;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public LoanV017() {}

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

    public LocalDate getField017_00() { return field017_00; }
    public void setField017_00(LocalDate field017_00) { this.field017_00 = field017_00; }

    public Integer getField017_01() { return field017_01; }
    public void setField017_01(Integer field017_01) { this.field017_01 = field017_01; }

    public BigDecimal getField017_02() { return field017_02; }
    public void setField017_02(BigDecimal field017_02) { this.field017_02 = field017_02; }

    public BigDecimal getField017_03() { return field017_03; }
    public void setField017_03(BigDecimal field017_03) { this.field017_03 = field017_03; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LoanV017)) return false;
        LoanV017 that = (LoanV017) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "LoanV017{" +
            "id=" + id +
            ", loanNumber=" + loanNumber +
            ", loanType=" + loanType +
            ", originalAmount=" + originalAmount +
            ", currentBalance=" + currentBalance +
            ", interestRate=" + interestRate +
            '}';
    }
}
