package com.pnb.loan;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * LoanV029 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "LOANV029")
public class LoanV029 {

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

    @Column(name = "FLD_029_00")
    private BigDecimal field029_00;

    @Column(name = "FLD_029_01")
    private Integer field029_01;

    @Column(name = "FLD_029_02")
    private LocalDate field029_02;

    @Column(name = "FLD_029_03")
    private Integer field029_03;

    @Column(name = "FLD_029_04")
    private LocalDate field029_04;

    @Column(name = "FLD_029_05")
    private Boolean field029_05;

    @Column(name = "FLD_029_06")
    private LocalDate field029_06;

    @Column(name = "FLD_029_07")
    private String field029_07;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public LoanV029() {}

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

    public BigDecimal getField029_00() { return field029_00; }
    public void setField029_00(BigDecimal field029_00) { this.field029_00 = field029_00; }

    public Integer getField029_01() { return field029_01; }
    public void setField029_01(Integer field029_01) { this.field029_01 = field029_01; }

    public LocalDate getField029_02() { return field029_02; }
    public void setField029_02(LocalDate field029_02) { this.field029_02 = field029_02; }

    public Integer getField029_03() { return field029_03; }
    public void setField029_03(Integer field029_03) { this.field029_03 = field029_03; }

    public LocalDate getField029_04() { return field029_04; }
    public void setField029_04(LocalDate field029_04) { this.field029_04 = field029_04; }

    public Boolean getField029_05() { return field029_05; }
    public void setField029_05(Boolean field029_05) { this.field029_05 = field029_05; }

    public LocalDate getField029_06() { return field029_06; }
    public void setField029_06(LocalDate field029_06) { this.field029_06 = field029_06; }

    public String getField029_07() { return field029_07; }
    public void setField029_07(String field029_07) { this.field029_07 = field029_07; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LoanV029)) return false;
        LoanV029 that = (LoanV029) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "LoanV029{" +
            "id=" + id +
            ", loanNumber=" + loanNumber +
            ", loanType=" + loanType +
            ", originalAmount=" + originalAmount +
            ", currentBalance=" + currentBalance +
            ", interestRate=" + interestRate +
            '}';
    }
}
