package com.pnb.channel.branch;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * BranchTransactionV005 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "BRANCHTRANSACTIONV005")
public class BranchTransactionV005 {

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

    @Column(name = "FLD_005_00")
    private LocalDate field005_00;

    @Column(name = "FLD_005_01")
    private LocalDate field005_01;

    @Column(name = "FLD_005_02")
    private Integer field005_02;

    @Column(name = "FLD_005_03")
    private String field005_03;

    @Column(name = "FLD_005_04")
    private LocalDate field005_04;

    @Column(name = "FLD_005_05")
    private String field005_05;

    @Column(name = "FLD_005_06")
    private BigDecimal field005_06;

    @Column(name = "FLD_005_07")
    private LocalDate field005_07;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public BranchTransactionV005() {}

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

    public LocalDate getField005_00() { return field005_00; }
    public void setField005_00(LocalDate field005_00) { this.field005_00 = field005_00; }

    public LocalDate getField005_01() { return field005_01; }
    public void setField005_01(LocalDate field005_01) { this.field005_01 = field005_01; }

    public Integer getField005_02() { return field005_02; }
    public void setField005_02(Integer field005_02) { this.field005_02 = field005_02; }

    public String getField005_03() { return field005_03; }
    public void setField005_03(String field005_03) { this.field005_03 = field005_03; }

    public LocalDate getField005_04() { return field005_04; }
    public void setField005_04(LocalDate field005_04) { this.field005_04 = field005_04; }

    public String getField005_05() { return field005_05; }
    public void setField005_05(String field005_05) { this.field005_05 = field005_05; }

    public BigDecimal getField005_06() { return field005_06; }
    public void setField005_06(BigDecimal field005_06) { this.field005_06 = field005_06; }

    public LocalDate getField005_07() { return field005_07; }
    public void setField005_07(LocalDate field005_07) { this.field005_07 = field005_07; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BranchTransactionV005)) return false;
        BranchTransactionV005 that = (BranchTransactionV005) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "BranchTransactionV005{" +
            "id=" + id +
            ", branchCode=" + branchCode +
            ", tellerId=" + tellerId +
            ", accountNumber=" + accountNumber +
            ", transactionType=" + transactionType +
            ", amount=" + amount +
            '}';
    }
}
