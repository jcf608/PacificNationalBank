package com.pnb.account;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * AccountV006 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "ACCOUNTV006")
public class AccountV006 {

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

    @Column(name = "FLD_006_00")
    private BigDecimal field006_00;

    @Column(name = "FLD_006_01")
    private BigDecimal field006_01;

    @Column(name = "FLD_006_02")
    private Boolean field006_02;

    @Column(name = "FLD_006_03")
    private Integer field006_03;

    @Column(name = "FLD_006_04")
    private LocalDate field006_04;

    @Column(name = "FLD_006_05")
    private String field006_05;

    @Column(name = "FLD_006_06")
    private Integer field006_06;

    @Column(name = "FLD_006_07")
    private BigDecimal field006_07;

    @Column(name = "FLD_006_08")
    private Integer field006_08;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public AccountV006() {}

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

    public BigDecimal getField006_00() { return field006_00; }
    public void setField006_00(BigDecimal field006_00) { this.field006_00 = field006_00; }

    public BigDecimal getField006_01() { return field006_01; }
    public void setField006_01(BigDecimal field006_01) { this.field006_01 = field006_01; }

    public Boolean getField006_02() { return field006_02; }
    public void setField006_02(Boolean field006_02) { this.field006_02 = field006_02; }

    public Integer getField006_03() { return field006_03; }
    public void setField006_03(Integer field006_03) { this.field006_03 = field006_03; }

    public LocalDate getField006_04() { return field006_04; }
    public void setField006_04(LocalDate field006_04) { this.field006_04 = field006_04; }

    public String getField006_05() { return field006_05; }
    public void setField006_05(String field006_05) { this.field006_05 = field006_05; }

    public Integer getField006_06() { return field006_06; }
    public void setField006_06(Integer field006_06) { this.field006_06 = field006_06; }

    public BigDecimal getField006_07() { return field006_07; }
    public void setField006_07(BigDecimal field006_07) { this.field006_07 = field006_07; }

    public Integer getField006_08() { return field006_08; }
    public void setField006_08(Integer field006_08) { this.field006_08 = field006_08; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AccountV006)) return false;
        AccountV006 that = (AccountV006) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "AccountV006{" +
            "id=" + id +
            ", accountNumber=" + accountNumber +
            ", accountType=" + accountType +
            ", status=" + status +
            ", currentBalance=" + currentBalance +
            ", availableBalance=" + availableBalance +
            '}';
    }
}
