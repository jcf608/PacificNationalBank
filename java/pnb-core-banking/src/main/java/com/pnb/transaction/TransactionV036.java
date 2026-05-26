package com.pnb.transaction;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * TransactionV036 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "TRANSACTIONV036")
public class TransactionV036 {

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

    @Column(name = "FLD_036_00")
    private String field036_00;

    @Column(name = "FLD_036_01")
    private String field036_01;

    @Column(name = "FLD_036_02")
    private Integer field036_02;

    @Column(name = "FLD_036_03")
    private BigDecimal field036_03;

    @Column(name = "FLD_036_04")
    private LocalDate field036_04;

    @Column(name = "FLD_036_05")
    private BigDecimal field036_05;

    @Column(name = "FLD_036_06")
    private Integer field036_06;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public TransactionV036() {}

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

    public String getField036_00() { return field036_00; }
    public void setField036_00(String field036_00) { this.field036_00 = field036_00; }

    public String getField036_01() { return field036_01; }
    public void setField036_01(String field036_01) { this.field036_01 = field036_01; }

    public Integer getField036_02() { return field036_02; }
    public void setField036_02(Integer field036_02) { this.field036_02 = field036_02; }

    public BigDecimal getField036_03() { return field036_03; }
    public void setField036_03(BigDecimal field036_03) { this.field036_03 = field036_03; }

    public LocalDate getField036_04() { return field036_04; }
    public void setField036_04(LocalDate field036_04) { this.field036_04 = field036_04; }

    public BigDecimal getField036_05() { return field036_05; }
    public void setField036_05(BigDecimal field036_05) { this.field036_05 = field036_05; }

    public Integer getField036_06() { return field036_06; }
    public void setField036_06(Integer field036_06) { this.field036_06 = field036_06; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TransactionV036)) return false;
        TransactionV036 that = (TransactionV036) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "TransactionV036{" +
            "id=" + id +
            ", transactionId=" + transactionId +
            ", transactionType=" + transactionType +
            ", accountNumber=" + accountNumber +
            ", amount=" + amount +
            ", currency=" + currency +
            '}';
    }
}
