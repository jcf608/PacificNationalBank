package com.pnb.channel.atm;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * AtmTransactionV020 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "ATMTRANSACTIONV020")
public class AtmTransactionV020 {

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

    @Column(name = "FLD_020_00")
    private Boolean field020_00;

    @Column(name = "FLD_020_01")
    private Boolean field020_01;

    @Column(name = "FLD_020_02")
    private String field020_02;

    @Column(name = "FLD_020_03")
    private BigDecimal field020_03;

    @Column(name = "FLD_020_04")
    private Integer field020_04;

    @Column(name = "FLD_020_05")
    private Integer field020_05;

    @Column(name = "FLD_020_06")
    private LocalDate field020_06;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public AtmTransactionV020() {}

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

    public Boolean getField020_00() { return field020_00; }
    public void setField020_00(Boolean field020_00) { this.field020_00 = field020_00; }

    public Boolean getField020_01() { return field020_01; }
    public void setField020_01(Boolean field020_01) { this.field020_01 = field020_01; }

    public String getField020_02() { return field020_02; }
    public void setField020_02(String field020_02) { this.field020_02 = field020_02; }

    public BigDecimal getField020_03() { return field020_03; }
    public void setField020_03(BigDecimal field020_03) { this.field020_03 = field020_03; }

    public Integer getField020_04() { return field020_04; }
    public void setField020_04(Integer field020_04) { this.field020_04 = field020_04; }

    public Integer getField020_05() { return field020_05; }
    public void setField020_05(Integer field020_05) { this.field020_05 = field020_05; }

    public LocalDate getField020_06() { return field020_06; }
    public void setField020_06(LocalDate field020_06) { this.field020_06 = field020_06; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AtmTransactionV020)) return false;
        AtmTransactionV020 that = (AtmTransactionV020) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "AtmTransactionV020{" +
            "id=" + id +
            ", terminalId=" + terminalId +
            ", cardNumber=" + cardNumber +
            ", transactionType=" + transactionType +
            ", amount=" + amount +
            ", surcharge=" + surcharge +
            '}';
    }
}
