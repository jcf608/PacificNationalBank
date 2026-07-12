package com.pnb.transaction;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * TransactionV014 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "TRANSACTIONV014")
public class TransactionV014 {

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

    @Column(name = "FLD_014_00")
    private Integer field014_00;

    @Column(name = "FLD_014_01")
    private LocalDate field014_01;

    @Column(name = "FLD_014_02")
    private String field014_02;

    @Column(name = "FLD_014_03")
    private BigDecimal field014_03;

    @Column(name = "FLD_014_04")
    private LocalDate field014_04;

    @Column(name = "FLD_014_05")
    private String field014_05;

    @Column(name = "FLD_014_06")
    private String field014_06;

    @Column(name = "FLD_014_07")
    private Boolean field014_07;

    @Column(name = "FLD_014_08")
    private Boolean field014_08;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public TransactionV014() {}

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

    public Integer getField014_00() { return field014_00; }
    public void setField014_00(Integer field014_00) { this.field014_00 = field014_00; }

    public LocalDate getField014_01() { return field014_01; }
    public void setField014_01(LocalDate field014_01) { this.field014_01 = field014_01; }

    public String getField014_02() { return field014_02; }
    public void setField014_02(String field014_02) { this.field014_02 = field014_02; }

    public BigDecimal getField014_03() { return field014_03; }
    public void setField014_03(BigDecimal field014_03) { this.field014_03 = field014_03; }

    public LocalDate getField014_04() { return field014_04; }
    public void setField014_04(LocalDate field014_04) { this.field014_04 = field014_04; }

    public String getField014_05() { return field014_05; }
    public void setField014_05(String field014_05) { this.field014_05 = field014_05; }

    public String getField014_06() { return field014_06; }
    public void setField014_06(String field014_06) { this.field014_06 = field014_06; }

    public Boolean getField014_07() { return field014_07; }
    public void setField014_07(Boolean field014_07) { this.field014_07 = field014_07; }

    public Boolean getField014_08() { return field014_08; }
    public void setField014_08(Boolean field014_08) { this.field014_08 = field014_08; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TransactionV014)) return false;
        TransactionV014 that = (TransactionV014) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "TransactionV014{" +
            "id=" + id +
            ", transactionId=" + transactionId +
            ", transactionType=" + transactionType +
            ", accountNumber=" + accountNumber +
            ", amount=" + amount +
            ", currency=" + currency +
            '}';
    }
}
