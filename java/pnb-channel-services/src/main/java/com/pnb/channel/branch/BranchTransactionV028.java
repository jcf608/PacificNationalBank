package com.pnb.channel.branch;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * BranchTransactionV028 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "BRANCHTRANSACTIONV028")
public class BranchTransactionV028 {

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

    @Column(name = "FLD_028_00")
    private Boolean field028_00;

    @Column(name = "FLD_028_01")
    private Integer field028_01;

    @Column(name = "FLD_028_02")
    private BigDecimal field028_02;

    @Column(name = "FLD_028_03")
    private LocalDate field028_03;

    @Column(name = "FLD_028_04")
    private LocalDate field028_04;

    @Column(name = "FLD_028_05")
    private BigDecimal field028_05;

    @Column(name = "FLD_028_06")
    private BigDecimal field028_06;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public BranchTransactionV028() {}

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

    public Boolean getField028_00() { return field028_00; }
    public void setField028_00(Boolean field028_00) { this.field028_00 = field028_00; }

    public Integer getField028_01() { return field028_01; }
    public void setField028_01(Integer field028_01) { this.field028_01 = field028_01; }

    public BigDecimal getField028_02() { return field028_02; }
    public void setField028_02(BigDecimal field028_02) { this.field028_02 = field028_02; }

    public LocalDate getField028_03() { return field028_03; }
    public void setField028_03(LocalDate field028_03) { this.field028_03 = field028_03; }

    public LocalDate getField028_04() { return field028_04; }
    public void setField028_04(LocalDate field028_04) { this.field028_04 = field028_04; }

    public BigDecimal getField028_05() { return field028_05; }
    public void setField028_05(BigDecimal field028_05) { this.field028_05 = field028_05; }

    public BigDecimal getField028_06() { return field028_06; }
    public void setField028_06(BigDecimal field028_06) { this.field028_06 = field028_06; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BranchTransactionV028)) return false;
        BranchTransactionV028 that = (BranchTransactionV028) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "BranchTransactionV028{" +
            "id=" + id +
            ", branchCode=" + branchCode +
            ", tellerId=" + tellerId +
            ", accountNumber=" + accountNumber +
            ", transactionType=" + transactionType +
            ", amount=" + amount +
            '}';
    }
}
