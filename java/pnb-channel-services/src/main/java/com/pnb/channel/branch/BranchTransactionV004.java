package com.pnb.channel.branch;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * BranchTransactionV004 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "BRANCHTRANSACTIONV004")
public class BranchTransactionV004 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "BRANCH_CODE")
    private String branchCode;

    @Column(name = "TELLER_ID")
    private String tellerId;

    @Column(name = "ACCT_NUM")
    private String accountNumber;

    @Column(name = "TXN_TYPE")
    private String transactionType;

    @Column(name = "AMOUNT", precision = 15, scale = 2)
    private BigDecimal amount;

    @Column(name = "CASH_AMT", precision = 13, scale = 2)
    private BigDecimal cashAmount;

    @Column(name = "CHECK_AMT", precision = 13, scale = 2)
    private BigDecimal checkAmount;

    @Column(name = "FLD_004_00")
    private Boolean field004_00;

    @Column(name = "FLD_004_01")
    private BigDecimal field004_01;

    @Column(name = "FLD_004_02")
    private LocalDate field004_02;

    @Column(name = "FLD_004_03")
    private Boolean field004_03;

    @Column(name = "FLD_004_04")
    private LocalDate field004_04;

    @Column(name = "FLD_004_05")
    private Integer field004_05;

    @Column(name = "FLD_004_06")
    private LocalDate field004_06;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public BranchTransactionV004() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getBranchCode() { return branchCode; }
    public void setBranchCode(String branchCode) { this.branchCode = branchCode; }

    public String getTellerId() { return tellerId; }
    public void setTellerId(String tellerId) { this.tellerId = tellerId; }

    public String getAccountNumber() { return accountNumber; }
    public void setAccountNumber(String accountNumber) { this.accountNumber = accountNumber; }

    public String getTransactionType() { return transactionType; }
    public void setTransactionType(String transactionType) { this.transactionType = transactionType; }

    public BigDecimal getAmount() { return amount; }
    public void setAmount(BigDecimal amount) { this.amount = amount; }

    public BigDecimal getCashAmount() { return cashAmount; }
    public void setCashAmount(BigDecimal cashAmount) { this.cashAmount = cashAmount; }

    public BigDecimal getCheckAmount() { return checkAmount; }
    public void setCheckAmount(BigDecimal checkAmount) { this.checkAmount = checkAmount; }

    public Boolean getField004_00() { return field004_00; }
    public void setField004_00(Boolean field004_00) { this.field004_00 = field004_00; }

    public BigDecimal getField004_01() { return field004_01; }
    public void setField004_01(BigDecimal field004_01) { this.field004_01 = field004_01; }

    public LocalDate getField004_02() { return field004_02; }
    public void setField004_02(LocalDate field004_02) { this.field004_02 = field004_02; }

    public Boolean getField004_03() { return field004_03; }
    public void setField004_03(Boolean field004_03) { this.field004_03 = field004_03; }

    public LocalDate getField004_04() { return field004_04; }
    public void setField004_04(LocalDate field004_04) { this.field004_04 = field004_04; }

    public Integer getField004_05() { return field004_05; }
    public void setField004_05(Integer field004_05) { this.field004_05 = field004_05; }

    public LocalDate getField004_06() { return field004_06; }
    public void setField004_06(LocalDate field004_06) { this.field004_06 = field004_06; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BranchTransactionV004)) return false;
        BranchTransactionV004 that = (BranchTransactionV004) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "BranchTransactionV004{" +
            "id=" + id +
            ", branchCode=" + branchCode +
            ", tellerId=" + tellerId +
            ", accountNumber=" + accountNumber +
            ", transactionType=" + transactionType +
            ", amount=" + amount +
            '}';
    }
}
