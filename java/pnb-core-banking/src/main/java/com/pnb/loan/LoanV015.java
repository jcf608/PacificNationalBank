package com.pnb.loan;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * LoanV015 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "LOANV015")
public class LoanV015 {

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

    @Column(name = "FLD_015_00")
    private LocalDate field015_00;

    @Column(name = "FLD_015_01")
    private LocalDate field015_01;

    @Column(name = "FLD_015_02")
    private LocalDate field015_02;

    @Column(name = "FLD_015_03")
    private BigDecimal field015_03;

    @Column(name = "FLD_015_04")
    private Integer field015_04;

    @Column(name = "FLD_015_05")
    private BigDecimal field015_05;

    @Column(name = "FLD_015_06")
    private BigDecimal field015_06;

    @Column(name = "FLD_015_07")
    private Boolean field015_07;

    @Column(name = "FLD_015_08")
    private Boolean field015_08;

    @Column(name = "FLD_015_09")
    private Integer field015_09;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public LoanV015() {}

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

    public LocalDate getField015_00() { return field015_00; }
    public void setField015_00(LocalDate field015_00) { this.field015_00 = field015_00; }

    public LocalDate getField015_01() { return field015_01; }
    public void setField015_01(LocalDate field015_01) { this.field015_01 = field015_01; }

    public LocalDate getField015_02() { return field015_02; }
    public void setField015_02(LocalDate field015_02) { this.field015_02 = field015_02; }

    public BigDecimal getField015_03() { return field015_03; }
    public void setField015_03(BigDecimal field015_03) { this.field015_03 = field015_03; }

    public Integer getField015_04() { return field015_04; }
    public void setField015_04(Integer field015_04) { this.field015_04 = field015_04; }

    public BigDecimal getField015_05() { return field015_05; }
    public void setField015_05(BigDecimal field015_05) { this.field015_05 = field015_05; }

    public BigDecimal getField015_06() { return field015_06; }
    public void setField015_06(BigDecimal field015_06) { this.field015_06 = field015_06; }

    public Boolean getField015_07() { return field015_07; }
    public void setField015_07(Boolean field015_07) { this.field015_07 = field015_07; }

    public Boolean getField015_08() { return field015_08; }
    public void setField015_08(Boolean field015_08) { this.field015_08 = field015_08; }

    public Integer getField015_09() { return field015_09; }
    public void setField015_09(Integer field015_09) { this.field015_09 = field015_09; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LoanV015)) return false;
        LoanV015 that = (LoanV015) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "LoanV015{" +
            "id=" + id +
            ", loanNumber=" + loanNumber +
            ", loanType=" + loanType +
            ", originalAmount=" + originalAmount +
            ", currentBalance=" + currentBalance +
            ", interestRate=" + interestRate +
            '}';
    }
}
