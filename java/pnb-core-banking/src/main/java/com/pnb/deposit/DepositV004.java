package com.pnb.deposit;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * DepositV004 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "DEPOSITV004")
public class DepositV004 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "DEP_ID", unique = true)
    private String depositId;

    @Column(name = "ACCT_NUM")
    private String accountNumber;

    @Column(name = "DEP_TYPE")
    private String depositType;

    @Column(name = "AMOUNT", precision = 15, scale = 2)
    private BigDecimal amount;

    @Column(name = "TERM_MONTHS")
    private Integer term;

    @Column(name = "INT_RATE", precision = 9, scale = 6)
    private BigDecimal interestRate;

    @Column(name = "MATURITY_DATE")
    private LocalDate maturityDate;

    @Column(name = "AUTO_RENEW")
    private Boolean autoRenew;

    @Column(name = "FLD_004_00")
    private BigDecimal field004_00;

    @Column(name = "FLD_004_01")
    private LocalDate field004_01;

    @Column(name = "FLD_004_02")
    private BigDecimal field004_02;

    @Column(name = "FLD_004_03")
    private BigDecimal field004_03;

    @Column(name = "FLD_004_04")
    private LocalDate field004_04;

    @Column(name = "FLD_004_05")
    private BigDecimal field004_05;

    @Column(name = "FLD_004_06")
    private BigDecimal field004_06;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public DepositV004() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getDepositId() { return depositId; }
    public void setDepositId(String depositId) { this.depositId = depositId; }

    public String getAccountNumber() { return accountNumber; }
    public void setAccountNumber(String accountNumber) { this.accountNumber = accountNumber; }

    public String getDepositType() { return depositType; }
    public void setDepositType(String depositType) { this.depositType = depositType; }

    public BigDecimal getAmount() { return amount; }
    public void setAmount(BigDecimal amount) { this.amount = amount; }

    public Integer getTerm() { return term; }
    public void setTerm(Integer term) { this.term = term; }

    public BigDecimal getInterestRate() { return interestRate; }
    public void setInterestRate(BigDecimal interestRate) { this.interestRate = interestRate; }

    public LocalDate getMaturityDate() { return maturityDate; }
    public void setMaturityDate(LocalDate maturityDate) { this.maturityDate = maturityDate; }

    public Boolean getAutoRenew() { return autoRenew; }
    public void setAutoRenew(Boolean autoRenew) { this.autoRenew = autoRenew; }

    public BigDecimal getField004_00() { return field004_00; }
    public void setField004_00(BigDecimal field004_00) { this.field004_00 = field004_00; }

    public LocalDate getField004_01() { return field004_01; }
    public void setField004_01(LocalDate field004_01) { this.field004_01 = field004_01; }

    public BigDecimal getField004_02() { return field004_02; }
    public void setField004_02(BigDecimal field004_02) { this.field004_02 = field004_02; }

    public BigDecimal getField004_03() { return field004_03; }
    public void setField004_03(BigDecimal field004_03) { this.field004_03 = field004_03; }

    public LocalDate getField004_04() { return field004_04; }
    public void setField004_04(LocalDate field004_04) { this.field004_04 = field004_04; }

    public BigDecimal getField004_05() { return field004_05; }
    public void setField004_05(BigDecimal field004_05) { this.field004_05 = field004_05; }

    public BigDecimal getField004_06() { return field004_06; }
    public void setField004_06(BigDecimal field004_06) { this.field004_06 = field004_06; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DepositV004)) return false;
        DepositV004 that = (DepositV004) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "DepositV004{" +
            "id=" + id +
            ", depositId=" + depositId +
            ", accountNumber=" + accountNumber +
            ", depositType=" + depositType +
            ", amount=" + amount +
            ", term=" + term +
            '}';
    }
}
