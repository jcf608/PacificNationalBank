package com.pnb.channel.atm;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * AtmTransactionV013 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "ATMTRANSACTIONV013")
public class AtmTransactionV013 {

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

    @Column(name = "FLD_013_00")
    private Boolean field013_00;

    @Column(name = "FLD_013_01")
    private LocalDate field013_01;

    @Column(name = "FLD_013_02")
    private Boolean field013_02;

    @Column(name = "FLD_013_03")
    private Integer field013_03;

    @Column(name = "FLD_013_04")
    private Boolean field013_04;

    @Column(name = "FLD_013_05")
    private BigDecimal field013_05;

    @Column(name = "FLD_013_06")
    private Boolean field013_06;

    @Column(name = "FLD_013_07")
    private String field013_07;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public AtmTransactionV013() {}

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

    public Boolean getField013_00() { return field013_00; }
    public void setField013_00(Boolean field013_00) { this.field013_00 = field013_00; }

    public LocalDate getField013_01() { return field013_01; }
    public void setField013_01(LocalDate field013_01) { this.field013_01 = field013_01; }

    public Boolean getField013_02() { return field013_02; }
    public void setField013_02(Boolean field013_02) { this.field013_02 = field013_02; }

    public Integer getField013_03() { return field013_03; }
    public void setField013_03(Integer field013_03) { this.field013_03 = field013_03; }

    public Boolean getField013_04() { return field013_04; }
    public void setField013_04(Boolean field013_04) { this.field013_04 = field013_04; }

    public BigDecimal getField013_05() { return field013_05; }
    public void setField013_05(BigDecimal field013_05) { this.field013_05 = field013_05; }

    public Boolean getField013_06() { return field013_06; }
    public void setField013_06(Boolean field013_06) { this.field013_06 = field013_06; }

    public String getField013_07() { return field013_07; }
    public void setField013_07(String field013_07) { this.field013_07 = field013_07; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AtmTransactionV013)) return false;
        AtmTransactionV013 that = (AtmTransactionV013) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "AtmTransactionV013{" +
            "id=" + id +
            ", terminalId=" + terminalId +
            ", cardNumber=" + cardNumber +
            ", transactionType=" + transactionType +
            ", amount=" + amount +
            ", surcharge=" + surcharge +
            '}';
    }
}
