package com.pnb.loan;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * LoanV022 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "LOANV022")
public class LoanV022 {

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

    @Column(name = "FLD_022_00")
    private LocalDate field022_00;

    @Column(name = "FLD_022_01")
    private String field022_01;

    @Column(name = "FLD_022_02")
    private Integer field022_02;

    @Column(name = "FLD_022_03")
    private Boolean field022_03;

    @Column(name = "FLD_022_04")
    private BigDecimal field022_04;

    @Column(name = "FLD_022_05")
    private Boolean field022_05;

    @Column(name = "FLD_022_06")
    private String field022_06;

    @Column(name = "FLD_022_07")
    private Integer field022_07;

    @Column(name = "FLD_022_08")
    private Boolean field022_08;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public LoanV022() {}

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

    public LocalDate getField022_00() { return field022_00; }
    public void setField022_00(LocalDate field022_00) { this.field022_00 = field022_00; }

    public String getField022_01() { return field022_01; }
    public void setField022_01(String field022_01) { this.field022_01 = field022_01; }

    public Integer getField022_02() { return field022_02; }
    public void setField022_02(Integer field022_02) { this.field022_02 = field022_02; }

    public Boolean getField022_03() { return field022_03; }
    public void setField022_03(Boolean field022_03) { this.field022_03 = field022_03; }

    public BigDecimal getField022_04() { return field022_04; }
    public void setField022_04(BigDecimal field022_04) { this.field022_04 = field022_04; }

    public Boolean getField022_05() { return field022_05; }
    public void setField022_05(Boolean field022_05) { this.field022_05 = field022_05; }

    public String getField022_06() { return field022_06; }
    public void setField022_06(String field022_06) { this.field022_06 = field022_06; }

    public Integer getField022_07() { return field022_07; }
    public void setField022_07(Integer field022_07) { this.field022_07 = field022_07; }

    public Boolean getField022_08() { return field022_08; }
    public void setField022_08(Boolean field022_08) { this.field022_08 = field022_08; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LoanV022)) return false;
        LoanV022 that = (LoanV022) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "LoanV022{" +
            "id=" + id +
            ", loanNumber=" + loanNumber +
            ", loanType=" + loanType +
            ", originalAmount=" + originalAmount +
            ", currentBalance=" + currentBalance +
            ", interestRate=" + interestRate +
            '}';
    }
}
