package com.pnb.transaction;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * TransactionV007 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "TRANSACTIONV007")
public class TransactionV007 {

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

    @Column(name = "FLD_007_00")
    private String field007_00;

    @Column(name = "FLD_007_01")
    private Integer field007_01;

    @Column(name = "FLD_007_02")
    private BigDecimal field007_02;

    @Column(name = "FLD_007_03")
    private Integer field007_03;

    @Column(name = "FLD_007_04")
    private Integer field007_04;

    @Column(name = "FLD_007_05")
    private Integer field007_05;

    @Column(name = "FLD_007_06")
    private Boolean field007_06;

    @Column(name = "FLD_007_07")
    private String field007_07;

    @Column(name = "FLD_007_08")
    private BigDecimal field007_08;

    @Column(name = "FLD_007_09")
    private BigDecimal field007_09;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public TransactionV007() {}

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

    public String getField007_00() { return field007_00; }
    public void setField007_00(String field007_00) { this.field007_00 = field007_00; }

    public Integer getField007_01() { return field007_01; }
    public void setField007_01(Integer field007_01) { this.field007_01 = field007_01; }

    public BigDecimal getField007_02() { return field007_02; }
    public void setField007_02(BigDecimal field007_02) { this.field007_02 = field007_02; }

    public Integer getField007_03() { return field007_03; }
    public void setField007_03(Integer field007_03) { this.field007_03 = field007_03; }

    public Integer getField007_04() { return field007_04; }
    public void setField007_04(Integer field007_04) { this.field007_04 = field007_04; }

    public Integer getField007_05() { return field007_05; }
    public void setField007_05(Integer field007_05) { this.field007_05 = field007_05; }

    public Boolean getField007_06() { return field007_06; }
    public void setField007_06(Boolean field007_06) { this.field007_06 = field007_06; }

    public String getField007_07() { return field007_07; }
    public void setField007_07(String field007_07) { this.field007_07 = field007_07; }

    public BigDecimal getField007_08() { return field007_08; }
    public void setField007_08(BigDecimal field007_08) { this.field007_08 = field007_08; }

    public BigDecimal getField007_09() { return field007_09; }
    public void setField007_09(BigDecimal field007_09) { this.field007_09 = field007_09; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TransactionV007)) return false;
        TransactionV007 that = (TransactionV007) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "TransactionV007{" +
            "id=" + id +
            ", transactionId=" + transactionId +
            ", transactionType=" + transactionType +
            ", accountNumber=" + accountNumber +
            ", amount=" + amount +
            ", currency=" + currency +
            '}';
    }
}
