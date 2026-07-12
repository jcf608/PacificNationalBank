package com.pnb.channel.branch;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * BranchTransactionV003 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "BRANCHTRANSACTIONV003")
public class BranchTransactionV003 {

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

    @Column(name = "FLD_003_00")
    private String field003_00;

    @Column(name = "FLD_003_01")
    private Integer field003_01;

    @Column(name = "FLD_003_02")
    private LocalDate field003_02;

    @Column(name = "FLD_003_03")
    private BigDecimal field003_03;

    @Column(name = "FLD_003_04")
    private String field003_04;

    @Column(name = "FLD_003_05")
    private Integer field003_05;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public BranchTransactionV003() {}

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

    public String getField003_00() { return field003_00; }
    public void setField003_00(String field003_00) { this.field003_00 = field003_00; }

    public Integer getField003_01() { return field003_01; }
    public void setField003_01(Integer field003_01) { this.field003_01 = field003_01; }

    public LocalDate getField003_02() { return field003_02; }
    public void setField003_02(LocalDate field003_02) { this.field003_02 = field003_02; }

    public BigDecimal getField003_03() { return field003_03; }
    public void setField003_03(BigDecimal field003_03) { this.field003_03 = field003_03; }

    public String getField003_04() { return field003_04; }
    public void setField003_04(String field003_04) { this.field003_04 = field003_04; }

    public Integer getField003_05() { return field003_05; }
    public void setField003_05(Integer field003_05) { this.field003_05 = field003_05; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BranchTransactionV003)) return false;
        BranchTransactionV003 that = (BranchTransactionV003) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "BranchTransactionV003{" +
            "id=" + id +
            ", branchCode=" + branchCode +
            ", tellerId=" + tellerId +
            ", accountNumber=" + accountNumber +
            ", transactionType=" + transactionType +
            ", amount=" + amount +
            '}';
    }
}
