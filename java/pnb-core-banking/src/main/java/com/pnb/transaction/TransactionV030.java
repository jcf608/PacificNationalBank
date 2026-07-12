package com.pnb.transaction;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * TransactionV030 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "TRANSACTIONV030")
public class TransactionV030 {

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

    @Column(name = "FLD_030_00")
    private LocalDate field030_00;

    @Column(name = "FLD_030_01")
    private Boolean field030_01;

    @Column(name = "FLD_030_02")
    private Integer field030_02;

    @Column(name = "FLD_030_03")
    private Boolean field030_03;

    @Column(name = "FLD_030_04")
    private Integer field030_04;

    @Column(name = "FLD_030_05")
    private String field030_05;

    @Column(name = "FLD_030_06")
    private Integer field030_06;

    @Column(name = "FLD_030_07")
    private BigDecimal field030_07;

    @Column(name = "FLD_030_08")
    private Boolean field030_08;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public TransactionV030() {}

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

    public LocalDate getField030_00() { return field030_00; }
    public void setField030_00(LocalDate field030_00) { this.field030_00 = field030_00; }

    public Boolean getField030_01() { return field030_01; }
    public void setField030_01(Boolean field030_01) { this.field030_01 = field030_01; }

    public Integer getField030_02() { return field030_02; }
    public void setField030_02(Integer field030_02) { this.field030_02 = field030_02; }

    public Boolean getField030_03() { return field030_03; }
    public void setField030_03(Boolean field030_03) { this.field030_03 = field030_03; }

    public Integer getField030_04() { return field030_04; }
    public void setField030_04(Integer field030_04) { this.field030_04 = field030_04; }

    public String getField030_05() { return field030_05; }
    public void setField030_05(String field030_05) { this.field030_05 = field030_05; }

    public Integer getField030_06() { return field030_06; }
    public void setField030_06(Integer field030_06) { this.field030_06 = field030_06; }

    public BigDecimal getField030_07() { return field030_07; }
    public void setField030_07(BigDecimal field030_07) { this.field030_07 = field030_07; }

    public Boolean getField030_08() { return field030_08; }
    public void setField030_08(Boolean field030_08) { this.field030_08 = field030_08; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TransactionV030)) return false;
        TransactionV030 that = (TransactionV030) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "TransactionV030{" +
            "id=" + id +
            ", transactionId=" + transactionId +
            ", transactionType=" + transactionType +
            ", accountNumber=" + accountNumber +
            ", amount=" + amount +
            ", currency=" + currency +
            '}';
    }
}
