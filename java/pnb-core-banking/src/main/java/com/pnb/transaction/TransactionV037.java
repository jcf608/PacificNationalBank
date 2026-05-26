package com.pnb.transaction;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * TransactionV037 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "TRANSACTIONV037")
public class TransactionV037 {

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

    @Column(name = "FLD_037_00")
    private Boolean field037_00;

    @Column(name = "FLD_037_01")
    private Integer field037_01;

    @Column(name = "FLD_037_02")
    private LocalDate field037_02;

    @Column(name = "FLD_037_03")
    private Boolean field037_03;

    @Column(name = "FLD_037_04")
    private Boolean field037_04;

    @Column(name = "FLD_037_05")
    private Integer field037_05;

    @Column(name = "FLD_037_06")
    private LocalDate field037_06;

    @Column(name = "FLD_037_07")
    private Boolean field037_07;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public TransactionV037() {}

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

    public Boolean getField037_00() { return field037_00; }
    public void setField037_00(Boolean field037_00) { this.field037_00 = field037_00; }

    public Integer getField037_01() { return field037_01; }
    public void setField037_01(Integer field037_01) { this.field037_01 = field037_01; }

    public LocalDate getField037_02() { return field037_02; }
    public void setField037_02(LocalDate field037_02) { this.field037_02 = field037_02; }

    public Boolean getField037_03() { return field037_03; }
    public void setField037_03(Boolean field037_03) { this.field037_03 = field037_03; }

    public Boolean getField037_04() { return field037_04; }
    public void setField037_04(Boolean field037_04) { this.field037_04 = field037_04; }

    public Integer getField037_05() { return field037_05; }
    public void setField037_05(Integer field037_05) { this.field037_05 = field037_05; }

    public LocalDate getField037_06() { return field037_06; }
    public void setField037_06(LocalDate field037_06) { this.field037_06 = field037_06; }

    public Boolean getField037_07() { return field037_07; }
    public void setField037_07(Boolean field037_07) { this.field037_07 = field037_07; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TransactionV037)) return false;
        TransactionV037 that = (TransactionV037) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "TransactionV037{" +
            "id=" + id +
            ", transactionId=" + transactionId +
            ", transactionType=" + transactionType +
            ", accountNumber=" + accountNumber +
            ", amount=" + amount +
            ", currency=" + currency +
            '}';
    }
}
