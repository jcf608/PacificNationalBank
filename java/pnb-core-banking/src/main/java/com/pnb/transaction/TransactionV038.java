package com.pnb.transaction;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * TransactionV038 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "TRANSACTIONV038")
public class TransactionV038 {

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

    @Column(name = "FLD_038_00")
    private Integer field038_00;

    @Column(name = "FLD_038_01")
    private Boolean field038_01;

    @Column(name = "FLD_038_02")
    private Boolean field038_02;

    @Column(name = "FLD_038_03")
    private LocalDate field038_03;

    @Column(name = "FLD_038_04")
    private String field038_04;

    @Column(name = "FLD_038_05")
    private String field038_05;

    @Column(name = "FLD_038_06")
    private String field038_06;

    @Column(name = "FLD_038_07")
    private String field038_07;

    @Column(name = "FLD_038_08")
    private LocalDate field038_08;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public TransactionV038() {}

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

    public Integer getField038_00() { return field038_00; }
    public void setField038_00(Integer field038_00) { this.field038_00 = field038_00; }

    public Boolean getField038_01() { return field038_01; }
    public void setField038_01(Boolean field038_01) { this.field038_01 = field038_01; }

    public Boolean getField038_02() { return field038_02; }
    public void setField038_02(Boolean field038_02) { this.field038_02 = field038_02; }

    public LocalDate getField038_03() { return field038_03; }
    public void setField038_03(LocalDate field038_03) { this.field038_03 = field038_03; }

    public String getField038_04() { return field038_04; }
    public void setField038_04(String field038_04) { this.field038_04 = field038_04; }

    public String getField038_05() { return field038_05; }
    public void setField038_05(String field038_05) { this.field038_05 = field038_05; }

    public String getField038_06() { return field038_06; }
    public void setField038_06(String field038_06) { this.field038_06 = field038_06; }

    public String getField038_07() { return field038_07; }
    public void setField038_07(String field038_07) { this.field038_07 = field038_07; }

    public LocalDate getField038_08() { return field038_08; }
    public void setField038_08(LocalDate field038_08) { this.field038_08 = field038_08; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TransactionV038)) return false;
        TransactionV038 that = (TransactionV038) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "TransactionV038{" +
            "id=" + id +
            ", transactionId=" + transactionId +
            ", transactionType=" + transactionType +
            ", accountNumber=" + accountNumber +
            ", amount=" + amount +
            ", currency=" + currency +
            '}';
    }
}
