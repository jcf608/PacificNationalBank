package com.pnb.loan;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * LoanV014 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "LOANV014")
public class LoanV014 {

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

    @Column(name = "FLD_014_00")
    private String field014_00;

    @Column(name = "FLD_014_01")
    private Integer field014_01;

    @Column(name = "FLD_014_02")
    private LocalDate field014_02;

    @Column(name = "FLD_014_03")
    private Integer field014_03;

    @Column(name = "FLD_014_04")
    private String field014_04;

    @Column(name = "FLD_014_05")
    private BigDecimal field014_05;

    @Column(name = "FLD_014_06")
    private Boolean field014_06;

    @Column(name = "FLD_014_07")
    private Integer field014_07;

    @Column(name = "FLD_014_08")
    private BigDecimal field014_08;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public LoanV014() {}

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

    public String getField014_00() { return field014_00; }
    public void setField014_00(String field014_00) { this.field014_00 = field014_00; }

    public Integer getField014_01() { return field014_01; }
    public void setField014_01(Integer field014_01) { this.field014_01 = field014_01; }

    public LocalDate getField014_02() { return field014_02; }
    public void setField014_02(LocalDate field014_02) { this.field014_02 = field014_02; }

    public Integer getField014_03() { return field014_03; }
    public void setField014_03(Integer field014_03) { this.field014_03 = field014_03; }

    public String getField014_04() { return field014_04; }
    public void setField014_04(String field014_04) { this.field014_04 = field014_04; }

    public BigDecimal getField014_05() { return field014_05; }
    public void setField014_05(BigDecimal field014_05) { this.field014_05 = field014_05; }

    public Boolean getField014_06() { return field014_06; }
    public void setField014_06(Boolean field014_06) { this.field014_06 = field014_06; }

    public Integer getField014_07() { return field014_07; }
    public void setField014_07(Integer field014_07) { this.field014_07 = field014_07; }

    public BigDecimal getField014_08() { return field014_08; }
    public void setField014_08(BigDecimal field014_08) { this.field014_08 = field014_08; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LoanV014)) return false;
        LoanV014 that = (LoanV014) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "LoanV014{" +
            "id=" + id +
            ", loanNumber=" + loanNumber +
            ", loanType=" + loanType +
            ", originalAmount=" + originalAmount +
            ", currentBalance=" + currentBalance +
            ", interestRate=" + interestRate +
            '}';
    }
}
