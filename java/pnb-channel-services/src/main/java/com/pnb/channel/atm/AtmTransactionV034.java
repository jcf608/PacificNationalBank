package com.pnb.channel.atm;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * AtmTransactionV034 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "ATMTRANSACTIONV034")
public class AtmTransactionV034 {

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

    @Column(name = "FLD_034_00")
    private Boolean field034_00;

    @Column(name = "FLD_034_01")
    private BigDecimal field034_01;

    @Column(name = "FLD_034_02")
    private String field034_02;

    @Column(name = "FLD_034_03")
    private BigDecimal field034_03;

    @Column(name = "FLD_034_04")
    private LocalDate field034_04;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public AtmTransactionV034() {}

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

    public Boolean getField034_00() { return field034_00; }
    public void setField034_00(Boolean field034_00) { this.field034_00 = field034_00; }

    public BigDecimal getField034_01() { return field034_01; }
    public void setField034_01(BigDecimal field034_01) { this.field034_01 = field034_01; }

    public String getField034_02() { return field034_02; }
    public void setField034_02(String field034_02) { this.field034_02 = field034_02; }

    public BigDecimal getField034_03() { return field034_03; }
    public void setField034_03(BigDecimal field034_03) { this.field034_03 = field034_03; }

    public LocalDate getField034_04() { return field034_04; }
    public void setField034_04(LocalDate field034_04) { this.field034_04 = field034_04; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AtmTransactionV034)) return false;
        AtmTransactionV034 that = (AtmTransactionV034) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "AtmTransactionV034{" +
            "id=" + id +
            ", terminalId=" + terminalId +
            ", cardNumber=" + cardNumber +
            ", transactionType=" + transactionType +
            ", amount=" + amount +
            ", surcharge=" + surcharge +
            '}';
    }
}
