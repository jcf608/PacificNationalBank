package com.pnb.channel.branch;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * BranchTransactionV013 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "BRANCHTRANSACTIONV013")
public class BranchTransactionV013 {

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

    @Column(name = "FLD_013_00")
    private LocalDate field013_00;

    @Column(name = "FLD_013_01")
    private String field013_01;

    @Column(name = "FLD_013_02")
    private Integer field013_02;

    @Column(name = "FLD_013_03")
    private Boolean field013_03;

    @Column(name = "FLD_013_04")
    private Integer field013_04;

    @Column(name = "FLD_013_05")
    private BigDecimal field013_05;

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

    public BranchTransactionV013() {}

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

    public LocalDate getField013_00() { return field013_00; }
    public void setField013_00(LocalDate field013_00) { this.field013_00 = field013_00; }

    public String getField013_01() { return field013_01; }
    public void setField013_01(String field013_01) { this.field013_01 = field013_01; }

    public Integer getField013_02() { return field013_02; }
    public void setField013_02(Integer field013_02) { this.field013_02 = field013_02; }

    public Boolean getField013_03() { return field013_03; }
    public void setField013_03(Boolean field013_03) { this.field013_03 = field013_03; }

    public Integer getField013_04() { return field013_04; }
    public void setField013_04(Integer field013_04) { this.field013_04 = field013_04; }

    public BigDecimal getField013_05() { return field013_05; }
    public void setField013_05(BigDecimal field013_05) { this.field013_05 = field013_05; }

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
        if (!(o instanceof BranchTransactionV013)) return false;
        BranchTransactionV013 that = (BranchTransactionV013) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "BranchTransactionV013{" +
            "id=" + id +
            ", branchCode=" + branchCode +
            ", tellerId=" + tellerId +
            ", accountNumber=" + accountNumber +
            ", transactionType=" + transactionType +
            ", amount=" + amount +
            '}';
    }
}
