package com.pnb.channel.branch;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * BranchTransactionV023 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "BRANCHTRANSACTIONV023")
public class BranchTransactionV023 {

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

    @Column(name = "FLD_023_00")
    private Integer field023_00;

    @Column(name = "FLD_023_01")
    private String field023_01;

    @Column(name = "FLD_023_02")
    private Boolean field023_02;

    @Column(name = "FLD_023_03")
    private String field023_03;

    @Column(name = "FLD_023_04")
    private Integer field023_04;

    @Column(name = "FLD_023_05")
    private Boolean field023_05;

    @Column(name = "FLD_023_06")
    private LocalDate field023_06;

    @Column(name = "FLD_023_07")
    private LocalDate field023_07;

    @Column(name = "FLD_023_08")
    private BigDecimal field023_08;

    @Column(name = "FLD_023_09")
    private String field023_09;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public BranchTransactionV023() {}

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

    public Integer getField023_00() { return field023_00; }
    public void setField023_00(Integer field023_00) { this.field023_00 = field023_00; }

    public String getField023_01() { return field023_01; }
    public void setField023_01(String field023_01) { this.field023_01 = field023_01; }

    public Boolean getField023_02() { return field023_02; }
    public void setField023_02(Boolean field023_02) { this.field023_02 = field023_02; }

    public String getField023_03() { return field023_03; }
    public void setField023_03(String field023_03) { this.field023_03 = field023_03; }

    public Integer getField023_04() { return field023_04; }
    public void setField023_04(Integer field023_04) { this.field023_04 = field023_04; }

    public Boolean getField023_05() { return field023_05; }
    public void setField023_05(Boolean field023_05) { this.field023_05 = field023_05; }

    public LocalDate getField023_06() { return field023_06; }
    public void setField023_06(LocalDate field023_06) { this.field023_06 = field023_06; }

    public LocalDate getField023_07() { return field023_07; }
    public void setField023_07(LocalDate field023_07) { this.field023_07 = field023_07; }

    public BigDecimal getField023_08() { return field023_08; }
    public void setField023_08(BigDecimal field023_08) { this.field023_08 = field023_08; }

    public String getField023_09() { return field023_09; }
    public void setField023_09(String field023_09) { this.field023_09 = field023_09; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BranchTransactionV023)) return false;
        BranchTransactionV023 that = (BranchTransactionV023) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "BranchTransactionV023{" +
            "id=" + id +
            ", branchCode=" + branchCode +
            ", tellerId=" + tellerId +
            ", accountNumber=" + accountNumber +
            ", transactionType=" + transactionType +
            ", amount=" + amount +
            '}';
    }
}
