package com.pnb.account;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * AccountV037 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "ACCOUNTV037")
public class AccountV037 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ACCT_NUM", unique = true)
    @NotBlank
    private String accountNumber;

    @Column(name = "ACCT_TYPE")
    private String accountType;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "CURR_BAL", precision = 15, scale = 2)
    private BigDecimal currentBalance;

    @Column(name = "AVAIL_BAL", precision = 15, scale = 2)
    private BigDecimal availableBalance;

    @Column(name = "INT_RATE", precision = 9, scale = 6)
    private BigDecimal interestRate;

    @Column(name = "OPEN_DATE")
    private LocalDate openDate;

    @Column(name = "BRANCH_CODE")
    private String branchCode;

    @Column(name = "CURRENCY")
    private String currencyCode;

    @Column(name = "FLD_037_00")
    private String field037_00;

    @Column(name = "FLD_037_01")
    private BigDecimal field037_01;

    @Column(name = "FLD_037_02")
    private BigDecimal field037_02;

    @Column(name = "FLD_037_03")
    private BigDecimal field037_03;

    @Column(name = "FLD_037_04")
    private Boolean field037_04;

    @Column(name = "FLD_037_05")
    private LocalDate field037_05;

    @Column(name = "FLD_037_06")
    private BigDecimal field037_06;

    @Column(name = "FLD_037_07")
    private LocalDate field037_07;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public AccountV037() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getAccountNumber() { return accountNumber; }
    public void setAccountNumber(String accountNumber) { this.accountNumber = accountNumber; }

    public String getAccountType() { return accountType; }
    public void setAccountType(String accountType) { this.accountType = accountType; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public BigDecimal getCurrentBalance() { return currentBalance; }
    public void setCurrentBalance(BigDecimal currentBalance) { this.currentBalance = currentBalance; }

    public BigDecimal getAvailableBalance() { return availableBalance; }
    public void setAvailableBalance(BigDecimal availableBalance) { this.availableBalance = availableBalance; }

    public BigDecimal getInterestRate() { return interestRate; }
    public void setInterestRate(BigDecimal interestRate) { this.interestRate = interestRate; }

    public LocalDate getOpenDate() { return openDate; }
    public void setOpenDate(LocalDate openDate) { this.openDate = openDate; }

    public String getBranchCode() { return branchCode; }
    public void setBranchCode(String branchCode) { this.branchCode = branchCode; }

    public String getCurrencyCode() { return currencyCode; }
    public void setCurrencyCode(String currencyCode) { this.currencyCode = currencyCode; }

    public String getField037_00() { return field037_00; }
    public void setField037_00(String field037_00) { this.field037_00 = field037_00; }

    public BigDecimal getField037_01() { return field037_01; }
    public void setField037_01(BigDecimal field037_01) { this.field037_01 = field037_01; }

    public BigDecimal getField037_02() { return field037_02; }
    public void setField037_02(BigDecimal field037_02) { this.field037_02 = field037_02; }

    public BigDecimal getField037_03() { return field037_03; }
    public void setField037_03(BigDecimal field037_03) { this.field037_03 = field037_03; }

    public Boolean getField037_04() { return field037_04; }
    public void setField037_04(Boolean field037_04) { this.field037_04 = field037_04; }

    public LocalDate getField037_05() { return field037_05; }
    public void setField037_05(LocalDate field037_05) { this.field037_05 = field037_05; }

    public BigDecimal getField037_06() { return field037_06; }
    public void setField037_06(BigDecimal field037_06) { this.field037_06 = field037_06; }

    public LocalDate getField037_07() { return field037_07; }
    public void setField037_07(LocalDate field037_07) { this.field037_07 = field037_07; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AccountV037)) return false;
        AccountV037 that = (AccountV037) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "AccountV037{" +
            "id=" + id +
            ", accountNumber=" + accountNumber +
            ", accountType=" + accountType +
            ", status=" + status +
            ", currentBalance=" + currentBalance +
            ", availableBalance=" + availableBalance +
            '}';
    }
}
