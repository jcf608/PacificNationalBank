package com.pnb.loan;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * LoanV013 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "LOANV013")
public class LoanV013 {

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

    @Column(name = "FLD_013_00")
    private BigDecimal field013_00;

    @Column(name = "FLD_013_01")
    private Boolean field013_01;

    @Column(name = "FLD_013_02")
    private Boolean field013_02;

    @Column(name = "FLD_013_03")
    private Integer field013_03;

    @Column(name = "FLD_013_04")
    private BigDecimal field013_04;

    @Column(name = "FLD_013_05")
    private BigDecimal field013_05;

    @Column(name = "FLD_013_06")
    private LocalDate field013_06;

    @Column(name = "FLD_013_07")
    private LocalDate field013_07;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public LoanV013() {}

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

    public BigDecimal getField013_00() { return field013_00; }
    public void setField013_00(BigDecimal field013_00) { this.field013_00 = field013_00; }

    public Boolean getField013_01() { return field013_01; }
    public void setField013_01(Boolean field013_01) { this.field013_01 = field013_01; }

    public Boolean getField013_02() { return field013_02; }
    public void setField013_02(Boolean field013_02) { this.field013_02 = field013_02; }

    public Integer getField013_03() { return field013_03; }
    public void setField013_03(Integer field013_03) { this.field013_03 = field013_03; }

    public BigDecimal getField013_04() { return field013_04; }
    public void setField013_04(BigDecimal field013_04) { this.field013_04 = field013_04; }

    public BigDecimal getField013_05() { return field013_05; }
    public void setField013_05(BigDecimal field013_05) { this.field013_05 = field013_05; }

    public LocalDate getField013_06() { return field013_06; }
    public void setField013_06(LocalDate field013_06) { this.field013_06 = field013_06; }

    public LocalDate getField013_07() { return field013_07; }
    public void setField013_07(LocalDate field013_07) { this.field013_07 = field013_07; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LoanV013)) return false;
        LoanV013 that = (LoanV013) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "LoanV013{" +
            "id=" + id +
            ", loanNumber=" + loanNumber +
            ", loanType=" + loanType +
            ", originalAmount=" + originalAmount +
            ", currentBalance=" + currentBalance +
            ", interestRate=" + interestRate +
            '}';
    }
}
