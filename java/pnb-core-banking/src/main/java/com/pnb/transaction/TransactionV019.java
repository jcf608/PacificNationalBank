package com.pnb.transaction;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * TransactionV019 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "TRANSACTIONV019")
public class TransactionV019 {

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

    @Column(name = "FLD_019_00")
    private Integer field019_00;

    @Column(name = "FLD_019_01")
    private String field019_01;

    @Column(name = "FLD_019_02")
    private LocalDate field019_02;

    @Column(name = "FLD_019_03")
    private String field019_03;

    @Column(name = "FLD_019_04")
    private Boolean field019_04;

    @Column(name = "FLD_019_05")
    private String field019_05;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public TransactionV019() {}

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

    public Integer getField019_00() { return field019_00; }
    public void setField019_00(Integer field019_00) { this.field019_00 = field019_00; }

    public String getField019_01() { return field019_01; }
    public void setField019_01(String field019_01) { this.field019_01 = field019_01; }

    public LocalDate getField019_02() { return field019_02; }
    public void setField019_02(LocalDate field019_02) { this.field019_02 = field019_02; }

    public String getField019_03() { return field019_03; }
    public void setField019_03(String field019_03) { this.field019_03 = field019_03; }

    public Boolean getField019_04() { return field019_04; }
    public void setField019_04(Boolean field019_04) { this.field019_04 = field019_04; }

    public String getField019_05() { return field019_05; }
    public void setField019_05(String field019_05) { this.field019_05 = field019_05; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TransactionV019)) return false;
        TransactionV019 that = (TransactionV019) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "TransactionV019{" +
            "id=" + id +
            ", transactionId=" + transactionId +
            ", transactionType=" + transactionType +
            ", accountNumber=" + accountNumber +
            ", amount=" + amount +
            ", currency=" + currency +
            '}';
    }
}
