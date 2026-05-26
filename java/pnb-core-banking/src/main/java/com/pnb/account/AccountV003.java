package com.pnb.account;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * AccountV003 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "ACCOUNTV003")
public class AccountV003 {

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

    public AccountV003() {}

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
        if (!(o instanceof AccountV003)) return false;
        AccountV003 that = (AccountV003) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "AccountV003{" +
            "id=" + id +
            ", accountNumber=" + accountNumber +
            ", accountType=" + accountType +
            ", status=" + status +
            ", currentBalance=" + currentBalance +
            ", availableBalance=" + availableBalance +
            '}';
    }
}
