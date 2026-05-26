package com.pnb.account;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * AccountV008 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "ACCOUNTV008")
public class AccountV008 {

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

    @Column(name = "FLD_008_00")
    private Integer field008_00;

    @Column(name = "FLD_008_01")
    private Boolean field008_01;

    @Column(name = "FLD_008_02")
    private BigDecimal field008_02;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public AccountV008() {}

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

    public Integer getField008_00() { return field008_00; }
    public void setField008_00(Integer field008_00) { this.field008_00 = field008_00; }

    public Boolean getField008_01() { return field008_01; }
    public void setField008_01(Boolean field008_01) { this.field008_01 = field008_01; }

    public BigDecimal getField008_02() { return field008_02; }
    public void setField008_02(BigDecimal field008_02) { this.field008_02 = field008_02; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AccountV008)) return false;
        AccountV008 that = (AccountV008) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "AccountV008{" +
            "id=" + id +
            ", accountNumber=" + accountNumber +
            ", accountType=" + accountType +
            ", status=" + status +
            ", currentBalance=" + currentBalance +
            ", availableBalance=" + availableBalance +
            '}';
    }
}
