package com.pnb.loan;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * LoanV038 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "LOANV038")
public class LoanV038 {

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

    @Column(name = "FLD_038_00")
    private BigDecimal field038_00;

    @Column(name = "FLD_038_01")
    private Integer field038_01;

    @Column(name = "FLD_038_02")
    private LocalDate field038_02;

    @Column(name = "FLD_038_03")
    private BigDecimal field038_03;

    @Column(name = "FLD_038_04")
    private String field038_04;

    @Column(name = "FLD_038_05")
    private LocalDate field038_05;

    @Column(name = "FLD_038_06")
    private Boolean field038_06;

    @Column(name = "FLD_038_07")
    private String field038_07;

    @Column(name = "FLD_038_08")
    private String field038_08;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public LoanV038() {}

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

    public BigDecimal getField038_00() { return field038_00; }
    public void setField038_00(BigDecimal field038_00) { this.field038_00 = field038_00; }

    public Integer getField038_01() { return field038_01; }
    public void setField038_01(Integer field038_01) { this.field038_01 = field038_01; }

    public LocalDate getField038_02() { return field038_02; }
    public void setField038_02(LocalDate field038_02) { this.field038_02 = field038_02; }

    public BigDecimal getField038_03() { return field038_03; }
    public void setField038_03(BigDecimal field038_03) { this.field038_03 = field038_03; }

    public String getField038_04() { return field038_04; }
    public void setField038_04(String field038_04) { this.field038_04 = field038_04; }

    public LocalDate getField038_05() { return field038_05; }
    public void setField038_05(LocalDate field038_05) { this.field038_05 = field038_05; }

    public Boolean getField038_06() { return field038_06; }
    public void setField038_06(Boolean field038_06) { this.field038_06 = field038_06; }

    public String getField038_07() { return field038_07; }
    public void setField038_07(String field038_07) { this.field038_07 = field038_07; }

    public String getField038_08() { return field038_08; }
    public void setField038_08(String field038_08) { this.field038_08 = field038_08; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LoanV038)) return false;
        LoanV038 that = (LoanV038) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "LoanV038{" +
            "id=" + id +
            ", loanNumber=" + loanNumber +
            ", loanType=" + loanType +
            ", originalAmount=" + originalAmount +
            ", currentBalance=" + currentBalance +
            ", interestRate=" + interestRate +
            '}';
    }
}
