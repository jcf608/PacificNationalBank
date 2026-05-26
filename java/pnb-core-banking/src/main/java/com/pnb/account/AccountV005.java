package com.pnb.account;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * AccountV005 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "ACCOUNTV005")
public class AccountV005 {

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

    @Column(name = "FLD_005_00")
    private Boolean field005_00;

    @Column(name = "FLD_005_01")
    private Integer field005_01;

    @Column(name = "FLD_005_02")
    private String field005_02;

    @Column(name = "FLD_005_03")
    private BigDecimal field005_03;

    @Column(name = "FLD_005_04")
    private LocalDate field005_04;

    @Column(name = "FLD_005_05")
    private Integer field005_05;

    @Column(name = "FLD_005_06")
    private Integer field005_06;

    @Column(name = "FLD_005_07")
    private BigDecimal field005_07;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public AccountV005() {}

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

    public Boolean getField005_00() { return field005_00; }
    public void setField005_00(Boolean field005_00) { this.field005_00 = field005_00; }

    public Integer getField005_01() { return field005_01; }
    public void setField005_01(Integer field005_01) { this.field005_01 = field005_01; }

    public String getField005_02() { return field005_02; }
    public void setField005_02(String field005_02) { this.field005_02 = field005_02; }

    public BigDecimal getField005_03() { return field005_03; }
    public void setField005_03(BigDecimal field005_03) { this.field005_03 = field005_03; }

    public LocalDate getField005_04() { return field005_04; }
    public void setField005_04(LocalDate field005_04) { this.field005_04 = field005_04; }

    public Integer getField005_05() { return field005_05; }
    public void setField005_05(Integer field005_05) { this.field005_05 = field005_05; }

    public Integer getField005_06() { return field005_06; }
    public void setField005_06(Integer field005_06) { this.field005_06 = field005_06; }

    public BigDecimal getField005_07() { return field005_07; }
    public void setField005_07(BigDecimal field005_07) { this.field005_07 = field005_07; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AccountV005)) return false;
        AccountV005 that = (AccountV005) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "AccountV005{" +
            "id=" + id +
            ", accountNumber=" + accountNumber +
            ", accountType=" + accountType +
            ", status=" + status +
            ", currentBalance=" + currentBalance +
            ", availableBalance=" + availableBalance +
            '}';
    }
}
