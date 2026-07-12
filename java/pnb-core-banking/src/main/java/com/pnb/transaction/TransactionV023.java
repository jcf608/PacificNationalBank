package com.pnb.transaction;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * TransactionV023 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "TRANSACTIONV023")
public class TransactionV023 {

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

    @Column(name = "FLD_023_00")
    private String field023_00;

    @Column(name = "FLD_023_01")
    private LocalDate field023_01;

    @Column(name = "FLD_023_02")
    private BigDecimal field023_02;

    @Column(name = "FLD_023_03")
    private LocalDate field023_03;

    @Column(name = "FLD_023_04")
    private Boolean field023_04;

    @Column(name = "FLD_023_05")
    private BigDecimal field023_05;

    @Column(name = "FLD_023_06")
    private Boolean field023_06;

    @Column(name = "FLD_023_07")
    private Integer field023_07;

    @Column(name = "FLD_023_08")
    private String field023_08;

    @Column(name = "FLD_023_09")
    private Boolean field023_09;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public TransactionV023() {}

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

    public String getField023_00() { return field023_00; }
    public void setField023_00(String field023_00) { this.field023_00 = field023_00; }

    public LocalDate getField023_01() { return field023_01; }
    public void setField023_01(LocalDate field023_01) { this.field023_01 = field023_01; }

    public BigDecimal getField023_02() { return field023_02; }
    public void setField023_02(BigDecimal field023_02) { this.field023_02 = field023_02; }

    public LocalDate getField023_03() { return field023_03; }
    public void setField023_03(LocalDate field023_03) { this.field023_03 = field023_03; }

    public Boolean getField023_04() { return field023_04; }
    public void setField023_04(Boolean field023_04) { this.field023_04 = field023_04; }

    public BigDecimal getField023_05() { return field023_05; }
    public void setField023_05(BigDecimal field023_05) { this.field023_05 = field023_05; }

    public Boolean getField023_06() { return field023_06; }
    public void setField023_06(Boolean field023_06) { this.field023_06 = field023_06; }

    public Integer getField023_07() { return field023_07; }
    public void setField023_07(Integer field023_07) { this.field023_07 = field023_07; }

    public String getField023_08() { return field023_08; }
    public void setField023_08(String field023_08) { this.field023_08 = field023_08; }

    public Boolean getField023_09() { return field023_09; }
    public void setField023_09(Boolean field023_09) { this.field023_09 = field023_09; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TransactionV023)) return false;
        TransactionV023 that = (TransactionV023) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "TransactionV023{" +
            "id=" + id +
            ", transactionId=" + transactionId +
            ", transactionType=" + transactionType +
            ", accountNumber=" + accountNumber +
            ", amount=" + amount +
            ", currency=" + currency +
            '}';
    }
}
