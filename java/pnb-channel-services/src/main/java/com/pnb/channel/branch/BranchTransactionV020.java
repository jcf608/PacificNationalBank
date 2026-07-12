package com.pnb.channel.branch;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * BranchTransactionV020 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "BRANCHTRANSACTIONV020")
public class BranchTransactionV020 {

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

    @Column(name = "FLD_020_00")
    private Integer field020_00;

    @Column(name = "FLD_020_01")
    private Boolean field020_01;

    @Column(name = "FLD_020_02")
    private Integer field020_02;

    @Column(name = "FLD_020_03")
    private Integer field020_03;

    @Column(name = "FLD_020_04")
    private Boolean field020_04;

    @Column(name = "FLD_020_05")
    private Integer field020_05;

    @Column(name = "FLD_020_06")
    private Boolean field020_06;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public BranchTransactionV020() {}

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

    public Integer getField020_00() { return field020_00; }
    public void setField020_00(Integer field020_00) { this.field020_00 = field020_00; }

    public Boolean getField020_01() { return field020_01; }
    public void setField020_01(Boolean field020_01) { this.field020_01 = field020_01; }

    public Integer getField020_02() { return field020_02; }
    public void setField020_02(Integer field020_02) { this.field020_02 = field020_02; }

    public Integer getField020_03() { return field020_03; }
    public void setField020_03(Integer field020_03) { this.field020_03 = field020_03; }

    public Boolean getField020_04() { return field020_04; }
    public void setField020_04(Boolean field020_04) { this.field020_04 = field020_04; }

    public Integer getField020_05() { return field020_05; }
    public void setField020_05(Integer field020_05) { this.field020_05 = field020_05; }

    public Boolean getField020_06() { return field020_06; }
    public void setField020_06(Boolean field020_06) { this.field020_06 = field020_06; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BranchTransactionV020)) return false;
        BranchTransactionV020 that = (BranchTransactionV020) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "BranchTransactionV020{" +
            "id=" + id +
            ", branchCode=" + branchCode +
            ", tellerId=" + tellerId +
            ", accountNumber=" + accountNumber +
            ", transactionType=" + transactionType +
            ", amount=" + amount +
            '}';
    }
}
