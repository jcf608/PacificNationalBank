package com.pnb.channel.atm;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * AtmTransactionV022 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "ATMTRANSACTIONV022")
public class AtmTransactionV022 {

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

    @Column(name = "FLD_022_00")
    private BigDecimal field022_00;

    @Column(name = "FLD_022_01")
    private LocalDate field022_01;

    @Column(name = "FLD_022_02")
    private Integer field022_02;

    @Column(name = "FLD_022_03")
    private Integer field022_03;

    @Column(name = "FLD_022_04")
    private BigDecimal field022_04;

    @Column(name = "FLD_022_05")
    private Boolean field022_05;

    @Column(name = "FLD_022_06")
    private Boolean field022_06;

    @Column(name = "FLD_022_07")
    private String field022_07;

    @Column(name = "FLD_022_08")
    private BigDecimal field022_08;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public AtmTransactionV022() {}

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

    public BigDecimal getField022_00() { return field022_00; }
    public void setField022_00(BigDecimal field022_00) { this.field022_00 = field022_00; }

    public LocalDate getField022_01() { return field022_01; }
    public void setField022_01(LocalDate field022_01) { this.field022_01 = field022_01; }

    public Integer getField022_02() { return field022_02; }
    public void setField022_02(Integer field022_02) { this.field022_02 = field022_02; }

    public Integer getField022_03() { return field022_03; }
    public void setField022_03(Integer field022_03) { this.field022_03 = field022_03; }

    public BigDecimal getField022_04() { return field022_04; }
    public void setField022_04(BigDecimal field022_04) { this.field022_04 = field022_04; }

    public Boolean getField022_05() { return field022_05; }
    public void setField022_05(Boolean field022_05) { this.field022_05 = field022_05; }

    public Boolean getField022_06() { return field022_06; }
    public void setField022_06(Boolean field022_06) { this.field022_06 = field022_06; }

    public String getField022_07() { return field022_07; }
    public void setField022_07(String field022_07) { this.field022_07 = field022_07; }

    public BigDecimal getField022_08() { return field022_08; }
    public void setField022_08(BigDecimal field022_08) { this.field022_08 = field022_08; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AtmTransactionV022)) return false;
        AtmTransactionV022 that = (AtmTransactionV022) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "AtmTransactionV022{" +
            "id=" + id +
            ", terminalId=" + terminalId +
            ", cardNumber=" + cardNumber +
            ", transactionType=" + transactionType +
            ", amount=" + amount +
            ", surcharge=" + surcharge +
            '}';
    }
}
