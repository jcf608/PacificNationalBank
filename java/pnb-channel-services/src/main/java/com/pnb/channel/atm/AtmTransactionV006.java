package com.pnb.channel.atm;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * AtmTransactionV006 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "ATMTRANSACTIONV006")
public class AtmTransactionV006 {

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

    @Column(name = "FLD_006_00")
    private LocalDate field006_00;

    @Column(name = "FLD_006_01")
    private BigDecimal field006_01;

    @Column(name = "FLD_006_02")
    private Integer field006_02;

    @Column(name = "FLD_006_03")
    private LocalDate field006_03;

    @Column(name = "FLD_006_04")
    private LocalDate field006_04;

    @Column(name = "FLD_006_05")
    private Boolean field006_05;

    @Column(name = "FLD_006_06")
    private Integer field006_06;

    @Column(name = "FLD_006_07")
    private Integer field006_07;

    @Column(name = "FLD_006_08")
    private LocalDate field006_08;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public AtmTransactionV006() {}

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

    public LocalDate getField006_00() { return field006_00; }
    public void setField006_00(LocalDate field006_00) { this.field006_00 = field006_00; }

    public BigDecimal getField006_01() { return field006_01; }
    public void setField006_01(BigDecimal field006_01) { this.field006_01 = field006_01; }

    public Integer getField006_02() { return field006_02; }
    public void setField006_02(Integer field006_02) { this.field006_02 = field006_02; }

    public LocalDate getField006_03() { return field006_03; }
    public void setField006_03(LocalDate field006_03) { this.field006_03 = field006_03; }

    public LocalDate getField006_04() { return field006_04; }
    public void setField006_04(LocalDate field006_04) { this.field006_04 = field006_04; }

    public Boolean getField006_05() { return field006_05; }
    public void setField006_05(Boolean field006_05) { this.field006_05 = field006_05; }

    public Integer getField006_06() { return field006_06; }
    public void setField006_06(Integer field006_06) { this.field006_06 = field006_06; }

    public Integer getField006_07() { return field006_07; }
    public void setField006_07(Integer field006_07) { this.field006_07 = field006_07; }

    public LocalDate getField006_08() { return field006_08; }
    public void setField006_08(LocalDate field006_08) { this.field006_08 = field006_08; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AtmTransactionV006)) return false;
        AtmTransactionV006 that = (AtmTransactionV006) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "AtmTransactionV006{" +
            "id=" + id +
            ", terminalId=" + terminalId +
            ", cardNumber=" + cardNumber +
            ", transactionType=" + transactionType +
            ", amount=" + amount +
            ", surcharge=" + surcharge +
            '}';
    }
}
