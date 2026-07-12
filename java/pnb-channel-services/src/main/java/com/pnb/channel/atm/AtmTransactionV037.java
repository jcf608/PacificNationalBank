package com.pnb.channel.atm;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * AtmTransactionV037 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "ATMTRANSACTIONV037")
public class AtmTransactionV037 {

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

    @Column(name = "FLD_037_00")
    private LocalDate field037_00;

    @Column(name = "FLD_037_01")
    private LocalDate field037_01;

    @Column(name = "FLD_037_02")
    private String field037_02;

    @Column(name = "FLD_037_03")
    private LocalDate field037_03;

    @Column(name = "FLD_037_04")
    private String field037_04;

    @Column(name = "FLD_037_05")
    private Boolean field037_05;

    @Column(name = "FLD_037_06")
    private String field037_06;

    @Column(name = "FLD_037_07")
    private Integer field037_07;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public AtmTransactionV037() {}

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

    public LocalDate getField037_00() { return field037_00; }
    public void setField037_00(LocalDate field037_00) { this.field037_00 = field037_00; }

    public LocalDate getField037_01() { return field037_01; }
    public void setField037_01(LocalDate field037_01) { this.field037_01 = field037_01; }

    public String getField037_02() { return field037_02; }
    public void setField037_02(String field037_02) { this.field037_02 = field037_02; }

    public LocalDate getField037_03() { return field037_03; }
    public void setField037_03(LocalDate field037_03) { this.field037_03 = field037_03; }

    public String getField037_04() { return field037_04; }
    public void setField037_04(String field037_04) { this.field037_04 = field037_04; }

    public Boolean getField037_05() { return field037_05; }
    public void setField037_05(Boolean field037_05) { this.field037_05 = field037_05; }

    public String getField037_06() { return field037_06; }
    public void setField037_06(String field037_06) { this.field037_06 = field037_06; }

    public Integer getField037_07() { return field037_07; }
    public void setField037_07(Integer field037_07) { this.field037_07 = field037_07; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AtmTransactionV037)) return false;
        AtmTransactionV037 that = (AtmTransactionV037) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "AtmTransactionV037{" +
            "id=" + id +
            ", terminalId=" + terminalId +
            ", cardNumber=" + cardNumber +
            ", transactionType=" + transactionType +
            ", amount=" + amount +
            ", surcharge=" + surcharge +
            '}';
    }
}
