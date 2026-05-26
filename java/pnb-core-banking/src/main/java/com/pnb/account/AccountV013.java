package com.pnb.account;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * AccountV013 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "ACCOUNTV013")
public class AccountV013 {

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

    @Column(name = "FLD_013_00")
    private LocalDate field013_00;

    @Column(name = "FLD_013_01")
    private LocalDate field013_01;

    @Column(name = "FLD_013_02")
    private Integer field013_02;

    @Column(name = "FLD_013_03")
    private Boolean field013_03;

    @Column(name = "FLD_013_04")
    private BigDecimal field013_04;

    @Column(name = "FLD_013_05")
    private Integer field013_05;

    @Column(name = "FLD_013_06")
    private String field013_06;

    @Column(name = "FLD_013_07")
    private BigDecimal field013_07;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public AccountV013() {}

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

    public LocalDate getField013_00() { return field013_00; }
    public void setField013_00(LocalDate field013_00) { this.field013_00 = field013_00; }

    public LocalDate getField013_01() { return field013_01; }
    public void setField013_01(LocalDate field013_01) { this.field013_01 = field013_01; }

    public Integer getField013_02() { return field013_02; }
    public void setField013_02(Integer field013_02) { this.field013_02 = field013_02; }

    public Boolean getField013_03() { return field013_03; }
    public void setField013_03(Boolean field013_03) { this.field013_03 = field013_03; }

    public BigDecimal getField013_04() { return field013_04; }
    public void setField013_04(BigDecimal field013_04) { this.field013_04 = field013_04; }

    public Integer getField013_05() { return field013_05; }
    public void setField013_05(Integer field013_05) { this.field013_05 = field013_05; }

    public String getField013_06() { return field013_06; }
    public void setField013_06(String field013_06) { this.field013_06 = field013_06; }

    public BigDecimal getField013_07() { return field013_07; }
    public void setField013_07(BigDecimal field013_07) { this.field013_07 = field013_07; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AccountV013)) return false;
        AccountV013 that = (AccountV013) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "AccountV013{" +
            "id=" + id +
            ", accountNumber=" + accountNumber +
            ", accountType=" + accountType +
            ", status=" + status +
            ", currentBalance=" + currentBalance +
            ", availableBalance=" + availableBalance +
            '}';
    }
}
