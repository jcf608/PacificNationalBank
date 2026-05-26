package com.pnb.channel.atm;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * AtmTransactionV002 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "ATMTRANSACTIONV002")
public class AtmTransactionV002 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "TERMINAL_ID")
    private String terminalId;

    @Column(name = "CARD_NUM")
    private String cardNumber;

    @Column(name = "TXN_TYPE")
    private String transactionType;

    @Column(name = "AMOUNT", precision = 13, scale = 2)
    private BigDecimal amount;

    @Column(name = "SURCHARGE", precision = 7, scale = 2)
    private BigDecimal surcharge;

    @Column(name = "APPROVED")
    private Boolean approved;

    @Column(name = "FLD_002_00")
    private String field002_00;

    @Column(name = "FLD_002_01")
    private String field002_01;

    @Column(name = "FLD_002_02")
    private LocalDate field002_02;

    @Column(name = "FLD_002_03")
    private BigDecimal field002_03;

    @Column(name = "FLD_002_04")
    private BigDecimal field002_04;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public AtmTransactionV002() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTerminalId() { return terminalId; }
    public void setTerminalId(String terminalId) { this.terminalId = terminalId; }

    public String getCardNumber() { return cardNumber; }
    public void setCardNumber(String cardNumber) { this.cardNumber = cardNumber; }

    public String getTransactionType() { return transactionType; }
    public void setTransactionType(String transactionType) { this.transactionType = transactionType; }

    public BigDecimal getAmount() { return amount; }
    public void setAmount(BigDecimal amount) { this.amount = amount; }

    public BigDecimal getSurcharge() { return surcharge; }
    public void setSurcharge(BigDecimal surcharge) { this.surcharge = surcharge; }

    public Boolean getApproved() { return approved; }
    public void setApproved(Boolean approved) { this.approved = approved; }

    public String getField002_00() { return field002_00; }
    public void setField002_00(String field002_00) { this.field002_00 = field002_00; }

    public String getField002_01() { return field002_01; }
    public void setField002_01(String field002_01) { this.field002_01 = field002_01; }

    public LocalDate getField002_02() { return field002_02; }
    public void setField002_02(LocalDate field002_02) { this.field002_02 = field002_02; }

    public BigDecimal getField002_03() { return field002_03; }
    public void setField002_03(BigDecimal field002_03) { this.field002_03 = field002_03; }

    public BigDecimal getField002_04() { return field002_04; }
    public void setField002_04(BigDecimal field002_04) { this.field002_04 = field002_04; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AtmTransactionV002)) return false;
        AtmTransactionV002 that = (AtmTransactionV002) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "AtmTransactionV002{" +
            "id=" + id +
            ", terminalId=" + terminalId +
            ", cardNumber=" + cardNumber +
            ", transactionType=" + transactionType +
            ", amount=" + amount +
            ", surcharge=" + surcharge +
            '}';
    }
}
