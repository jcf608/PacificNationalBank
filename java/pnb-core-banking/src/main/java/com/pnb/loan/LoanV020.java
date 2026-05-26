package com.pnb.loan;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * LoanV020 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "LOANV020")
public class LoanV020 {

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

    @Column(name = "FLD_020_00")
    private LocalDate field020_00;

    @Column(name = "FLD_020_01")
    private Boolean field020_01;

    @Column(name = "FLD_020_02")
    private LocalDate field020_02;

    @Column(name = "FLD_020_03")
    private Boolean field020_03;

    @Column(name = "FLD_020_04")
    private Integer field020_04;

    @Column(name = "FLD_020_05")
    private Boolean field020_05;

    @Column(name = "FLD_020_06")
    private String field020_06;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public LoanV020() {}

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

    public LocalDate getField020_00() { return field020_00; }
    public void setField020_00(LocalDate field020_00) { this.field020_00 = field020_00; }

    public Boolean getField020_01() { return field020_01; }
    public void setField020_01(Boolean field020_01) { this.field020_01 = field020_01; }

    public LocalDate getField020_02() { return field020_02; }
    public void setField020_02(LocalDate field020_02) { this.field020_02 = field020_02; }

    public Boolean getField020_03() { return field020_03; }
    public void setField020_03(Boolean field020_03) { this.field020_03 = field020_03; }

    public Integer getField020_04() { return field020_04; }
    public void setField020_04(Integer field020_04) { this.field020_04 = field020_04; }

    public Boolean getField020_05() { return field020_05; }
    public void setField020_05(Boolean field020_05) { this.field020_05 = field020_05; }

    public String getField020_06() { return field020_06; }
    public void setField020_06(String field020_06) { this.field020_06 = field020_06; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LoanV020)) return false;
        LoanV020 that = (LoanV020) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "LoanV020{" +
            "id=" + id +
            ", loanNumber=" + loanNumber +
            ", loanType=" + loanType +
            ", originalAmount=" + originalAmount +
            ", currentBalance=" + currentBalance +
            ", interestRate=" + interestRate +
            '}';
    }
}
