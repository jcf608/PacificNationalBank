package com.pnb.loan;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * LoanV003 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "LOANV003")
public class LoanV003 {

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

    @Column(name = "FLD_003_00")
    private String field003_00;

    @Column(name = "FLD_003_01")
    private String field003_01;

    @Column(name = "FLD_003_02")
    private BigDecimal field003_02;

    @Column(name = "FLD_003_03")
    private BigDecimal field003_03;

    @Column(name = "FLD_003_04")
    private Boolean field003_04;

    @Column(name = "FLD_003_05")
    private Boolean field003_05;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public LoanV003() {}

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

    public String getField003_00() { return field003_00; }
    public void setField003_00(String field003_00) { this.field003_00 = field003_00; }

    public String getField003_01() { return field003_01; }
    public void setField003_01(String field003_01) { this.field003_01 = field003_01; }

    public BigDecimal getField003_02() { return field003_02; }
    public void setField003_02(BigDecimal field003_02) { this.field003_02 = field003_02; }

    public BigDecimal getField003_03() { return field003_03; }
    public void setField003_03(BigDecimal field003_03) { this.field003_03 = field003_03; }

    public Boolean getField003_04() { return field003_04; }
    public void setField003_04(Boolean field003_04) { this.field003_04 = field003_04; }

    public Boolean getField003_05() { return field003_05; }
    public void setField003_05(Boolean field003_05) { this.field003_05 = field003_05; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LoanV003)) return false;
        LoanV003 that = (LoanV003) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "LoanV003{" +
            "id=" + id +
            ", loanNumber=" + loanNumber +
            ", loanType=" + loanType +
            ", originalAmount=" + originalAmount +
            ", currentBalance=" + currentBalance +
            ", interestRate=" + interestRate +
            '}';
    }
}
