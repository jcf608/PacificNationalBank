package com.pnb.transaction;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * TransactionV012 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "TRANSACTIONV012")
public class TransactionV012 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "TXN_ID", unique = true)
    private String transactionId;

    @Column(name = "TXN_TYPE")
    private String transactionType;

    @Column(name = "ACCT_NUM")
    private String accountNumber;

    @Column(name = "AMOUNT", precision = 15, scale = 2)
    private BigDecimal amount;

    @Column(name = "CURRENCY")
    private String currency;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "CHANNEL")
    private String channel;

    @Column(name = "REF_NUM")
    private String referenceNumber;

    @Column(name = "FLD_012_00")
    private LocalDate field012_00;

    @Column(name = "FLD_012_01")
    private LocalDate field012_01;

    @Column(name = "FLD_012_02")
    private String field012_02;

    @Column(name = "FLD_012_03")
    private Integer field012_03;

    @Column(name = "FLD_012_04")
    private Integer field012_04;

    @Column(name = "FLD_012_05")
    private LocalDate field012_05;

    @Column(name = "FLD_012_06")
    private LocalDate field012_06;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public TransactionV012() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTransactionId() { return transactionId; }
    public void setTransactionId(String transactionId) { this.transactionId = transactionId; }

    public String getTransactionType() { return transactionType; }
    public void setTransactionType(String transactionType) { this.transactionType = transactionType; }

    public String getAccountNumber() { return accountNumber; }
    public void setAccountNumber(String accountNumber) { this.accountNumber = accountNumber; }

    public BigDecimal getAmount() { return amount; }
    public void setAmount(BigDecimal amount) { this.amount = amount; }

    public String getCurrency() { return currency; }
    public void setCurrency(String currency) { this.currency = currency; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getChannel() { return channel; }
    public void setChannel(String channel) { this.channel = channel; }

    public String getReferenceNumber() { return referenceNumber; }
    public void setReferenceNumber(String referenceNumber) { this.referenceNumber = referenceNumber; }

    public LocalDate getField012_00() { return field012_00; }
    public void setField012_00(LocalDate field012_00) { this.field012_00 = field012_00; }

    public LocalDate getField012_01() { return field012_01; }
    public void setField012_01(LocalDate field012_01) { this.field012_01 = field012_01; }

    public String getField012_02() { return field012_02; }
    public void setField012_02(String field012_02) { this.field012_02 = field012_02; }

    public Integer getField012_03() { return field012_03; }
    public void setField012_03(Integer field012_03) { this.field012_03 = field012_03; }

    public Integer getField012_04() { return field012_04; }
    public void setField012_04(Integer field012_04) { this.field012_04 = field012_04; }

    public LocalDate getField012_05() { return field012_05; }
    public void setField012_05(LocalDate field012_05) { this.field012_05 = field012_05; }

    public LocalDate getField012_06() { return field012_06; }
    public void setField012_06(LocalDate field012_06) { this.field012_06 = field012_06; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TransactionV012)) return false;
        TransactionV012 that = (TransactionV012) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "TransactionV012{" +
            "id=" + id +
            ", transactionId=" + transactionId +
            ", transactionType=" + transactionType +
            ", accountNumber=" + accountNumber +
            ", amount=" + amount +
            ", currency=" + currency +
            '}';
    }
}
