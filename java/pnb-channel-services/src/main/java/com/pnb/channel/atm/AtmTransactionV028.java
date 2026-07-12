package com.pnb.channel.atm;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * AtmTransactionV028 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "ATMTRANSACTIONV028")
public class AtmTransactionV028 {

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

    @Column(name = "FLD_028_00")
    private BigDecimal field028_00;

    @Column(name = "FLD_028_01")
    private Integer field028_01;

    @Column(name = "FLD_028_02")
    private BigDecimal field028_02;

    @Column(name = "FLD_028_03")
    private Boolean field028_03;

    @Column(name = "FLD_028_04")
    private LocalDate field028_04;

    @Column(name = "FLD_028_05")
    private LocalDate field028_05;

    @Column(name = "FLD_028_06")
    private String field028_06;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public AtmTransactionV028() {}

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

    public BigDecimal getField028_00() { return field028_00; }
    public void setField028_00(BigDecimal field028_00) { this.field028_00 = field028_00; }

    public Integer getField028_01() { return field028_01; }
    public void setField028_01(Integer field028_01) { this.field028_01 = field028_01; }

    public BigDecimal getField028_02() { return field028_02; }
    public void setField028_02(BigDecimal field028_02) { this.field028_02 = field028_02; }

    public Boolean getField028_03() { return field028_03; }
    public void setField028_03(Boolean field028_03) { this.field028_03 = field028_03; }

    public LocalDate getField028_04() { return field028_04; }
    public void setField028_04(LocalDate field028_04) { this.field028_04 = field028_04; }

    public LocalDate getField028_05() { return field028_05; }
    public void setField028_05(LocalDate field028_05) { this.field028_05 = field028_05; }

    public String getField028_06() { return field028_06; }
    public void setField028_06(String field028_06) { this.field028_06 = field028_06; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AtmTransactionV028)) return false;
        AtmTransactionV028 that = (AtmTransactionV028) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "AtmTransactionV028{" +
            "id=" + id +
            ", terminalId=" + terminalId +
            ", cardNumber=" + cardNumber +
            ", transactionType=" + transactionType +
            ", amount=" + amount +
            ", surcharge=" + surcharge +
            '}';
    }
}
