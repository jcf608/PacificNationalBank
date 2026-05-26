package com.pnb.account;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * AccountV031 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "ACCOUNTV031")
public class AccountV031 {

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

    @Column(name = "FLD_031_00")
    private BigDecimal field031_00;

    @Column(name = "FLD_031_01")
    private String field031_01;

    @Column(name = "FLD_031_02")
    private String field031_02;

    @Column(name = "FLD_031_03")
    private String field031_03;

    @Column(name = "FLD_031_04")
    private BigDecimal field031_04;

    @Column(name = "FLD_031_05")
    private String field031_05;

    @Column(name = "FLD_031_06")
    private String field031_06;

    @Column(name = "FLD_031_07")
    private Integer field031_07;

    @Column(name = "FLD_031_08")
    private String field031_08;

    @Column(name = "FLD_031_09")
    private Boolean field031_09;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public AccountV031() {}

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

    public BigDecimal getField031_00() { return field031_00; }
    public void setField031_00(BigDecimal field031_00) { this.field031_00 = field031_00; }

    public String getField031_01() { return field031_01; }
    public void setField031_01(String field031_01) { this.field031_01 = field031_01; }

    public String getField031_02() { return field031_02; }
    public void setField031_02(String field031_02) { this.field031_02 = field031_02; }

    public String getField031_03() { return field031_03; }
    public void setField031_03(String field031_03) { this.field031_03 = field031_03; }

    public BigDecimal getField031_04() { return field031_04; }
    public void setField031_04(BigDecimal field031_04) { this.field031_04 = field031_04; }

    public String getField031_05() { return field031_05; }
    public void setField031_05(String field031_05) { this.field031_05 = field031_05; }

    public String getField031_06() { return field031_06; }
    public void setField031_06(String field031_06) { this.field031_06 = field031_06; }

    public Integer getField031_07() { return field031_07; }
    public void setField031_07(Integer field031_07) { this.field031_07 = field031_07; }

    public String getField031_08() { return field031_08; }
    public void setField031_08(String field031_08) { this.field031_08 = field031_08; }

    public Boolean getField031_09() { return field031_09; }
    public void setField031_09(Boolean field031_09) { this.field031_09 = field031_09; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AccountV031)) return false;
        AccountV031 that = (AccountV031) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "AccountV031{" +
            "id=" + id +
            ", accountNumber=" + accountNumber +
            ", accountType=" + accountType +
            ", status=" + status +
            ", currentBalance=" + currentBalance +
            ", availableBalance=" + availableBalance +
            '}';
    }
}
