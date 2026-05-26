package com.pnb.channel.branch;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * BranchTransactionV018 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "BRANCHTRANSACTIONV018")
public class BranchTransactionV018 {

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

    @Column(name = "FLD_018_00")
    private Integer field018_00;

    @Column(name = "FLD_018_01")
    private Integer field018_01;

    @Column(name = "FLD_018_02")
    private LocalDate field018_02;

    @Column(name = "FLD_018_03")
    private Integer field018_03;

    @Column(name = "FLD_018_04")
    private LocalDate field018_04;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public BranchTransactionV018() {}

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

    public Integer getField018_00() { return field018_00; }
    public void setField018_00(Integer field018_00) { this.field018_00 = field018_00; }

    public Integer getField018_01() { return field018_01; }
    public void setField018_01(Integer field018_01) { this.field018_01 = field018_01; }

    public LocalDate getField018_02() { return field018_02; }
    public void setField018_02(LocalDate field018_02) { this.field018_02 = field018_02; }

    public Integer getField018_03() { return field018_03; }
    public void setField018_03(Integer field018_03) { this.field018_03 = field018_03; }

    public LocalDate getField018_04() { return field018_04; }
    public void setField018_04(LocalDate field018_04) { this.field018_04 = field018_04; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BranchTransactionV018)) return false;
        BranchTransactionV018 that = (BranchTransactionV018) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "BranchTransactionV018{" +
            "id=" + id +
            ", branchCode=" + branchCode +
            ", tellerId=" + tellerId +
            ", accountNumber=" + accountNumber +
            ", transactionType=" + transactionType +
            ", amount=" + amount +
            '}';
    }
}
