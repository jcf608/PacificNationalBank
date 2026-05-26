package com.pnb.channel.atm;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * AtmTransactionV003 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "ATMTRANSACTIONV003")
public class AtmTransactionV003 {

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

    @Column(name = "FLD_003_00")
    private Boolean field003_00;

    @Column(name = "FLD_003_01")
    private LocalDate field003_01;

    @Column(name = "FLD_003_02")
    private String field003_02;

    @Column(name = "FLD_003_03")
    private Boolean field003_03;

    @Column(name = "FLD_003_04")
    private BigDecimal field003_04;

    @Column(name = "FLD_003_05")
    private String field003_05;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public AtmTransactionV003() {}

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

    public Boolean getField003_00() { return field003_00; }
    public void setField003_00(Boolean field003_00) { this.field003_00 = field003_00; }

    public LocalDate getField003_01() { return field003_01; }
    public void setField003_01(LocalDate field003_01) { this.field003_01 = field003_01; }

    public String getField003_02() { return field003_02; }
    public void setField003_02(String field003_02) { this.field003_02 = field003_02; }

    public Boolean getField003_03() { return field003_03; }
    public void setField003_03(Boolean field003_03) { this.field003_03 = field003_03; }

    public BigDecimal getField003_04() { return field003_04; }
    public void setField003_04(BigDecimal field003_04) { this.field003_04 = field003_04; }

    public String getField003_05() { return field003_05; }
    public void setField003_05(String field003_05) { this.field003_05 = field003_05; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AtmTransactionV003)) return false;
        AtmTransactionV003 that = (AtmTransactionV003) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "AtmTransactionV003{" +
            "id=" + id +
            ", terminalId=" + terminalId +
            ", cardNumber=" + cardNumber +
            ", transactionType=" + transactionType +
            ", amount=" + amount +
            ", surcharge=" + surcharge +
            '}';
    }
}
