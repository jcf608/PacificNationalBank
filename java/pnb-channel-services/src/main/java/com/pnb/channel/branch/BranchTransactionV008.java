package com.pnb.channel.branch;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * BranchTransactionV008 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "BRANCHTRANSACTIONV008")
public class BranchTransactionV008 {

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

    @Column(name = "FLD_008_00")
    private BigDecimal field008_00;

    @Column(name = "FLD_008_01")
    private LocalDate field008_01;

    @Column(name = "FLD_008_02")
    private BigDecimal field008_02;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public BranchTransactionV008() {}

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

    public BigDecimal getField008_00() { return field008_00; }
    public void setField008_00(BigDecimal field008_00) { this.field008_00 = field008_00; }

    public LocalDate getField008_01() { return field008_01; }
    public void setField008_01(LocalDate field008_01) { this.field008_01 = field008_01; }

    public BigDecimal getField008_02() { return field008_02; }
    public void setField008_02(BigDecimal field008_02) { this.field008_02 = field008_02; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BranchTransactionV008)) return false;
        BranchTransactionV008 that = (BranchTransactionV008) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "BranchTransactionV008{" +
            "id=" + id +
            ", branchCode=" + branchCode +
            ", tellerId=" + tellerId +
            ", accountNumber=" + accountNumber +
            ", transactionType=" + transactionType +
            ", amount=" + amount +
            '}';
    }
}
