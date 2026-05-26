package com.pnb.integration.payments;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * WireTransferV039 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "WIRETRANSFERV039")
public class WireTransferV039 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "WIRE_ID", unique = true)
    private String wireId;

    @Column(name = "ORIG_NAME")
    private String originatorName;

    @Column(name = "ORIG_ACCT")
    private String originatorAccount;

    @Column(name = "BENE_NAME")
    private String beneficiaryName;

    @Column(name = "BENE_ACCT")
    private String beneficiaryAccount;

    @Column(name = "BENE_BANK")
    private String beneficiaryBank;

    @Column(name = "ROUTING_NUM")
    private String routingNumber;

    @Column(name = "AMOUNT", precision = 15, scale = 2)
    private BigDecimal amount;

    @Column(name = "CURRENCY")
    private String currency;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "INT_FLD_039_00")
    private LocalDate intField039_00;

    @Column(name = "INT_FLD_039_01")
    private LocalDate intField039_01;

    @Column(name = "INT_FLD_039_02")
    private BigDecimal intField039_02;

    @Column(name = "INT_FLD_039_03")
    private String intField039_03;

    @Column(name = "INT_FLD_039_04")
    private String intField039_04;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public WireTransferV039() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getWireId() { return wireId; }
    public void setWireId(String wireId) { this.wireId = wireId; }

    public String getOriginatorName() { return originatorName; }
    public void setOriginatorName(String originatorName) { this.originatorName = originatorName; }

    public String getOriginatorAccount() { return originatorAccount; }
    public void setOriginatorAccount(String originatorAccount) { this.originatorAccount = originatorAccount; }

    public String getBeneficiaryName() { return beneficiaryName; }
    public void setBeneficiaryName(String beneficiaryName) { this.beneficiaryName = beneficiaryName; }

    public String getBeneficiaryAccount() { return beneficiaryAccount; }
    public void setBeneficiaryAccount(String beneficiaryAccount) { this.beneficiaryAccount = beneficiaryAccount; }

    public String getBeneficiaryBank() { return beneficiaryBank; }
    public void setBeneficiaryBank(String beneficiaryBank) { this.beneficiaryBank = beneficiaryBank; }

    public String getRoutingNumber() { return routingNumber; }
    public void setRoutingNumber(String routingNumber) { this.routingNumber = routingNumber; }

    public BigDecimal getAmount() { return amount; }
    public void setAmount(BigDecimal amount) { this.amount = amount; }

    public String getCurrency() { return currency; }
    public void setCurrency(String currency) { this.currency = currency; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public LocalDate getIntField039_00() { return intField039_00; }
    public void setIntField039_00(LocalDate intField039_00) { this.intField039_00 = intField039_00; }

    public LocalDate getIntField039_01() { return intField039_01; }
    public void setIntField039_01(LocalDate intField039_01) { this.intField039_01 = intField039_01; }

    public BigDecimal getIntField039_02() { return intField039_02; }
    public void setIntField039_02(BigDecimal intField039_02) { this.intField039_02 = intField039_02; }

    public String getIntField039_03() { return intField039_03; }
    public void setIntField039_03(String intField039_03) { this.intField039_03 = intField039_03; }

    public String getIntField039_04() { return intField039_04; }
    public void setIntField039_04(String intField039_04) { this.intField039_04 = intField039_04; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof WireTransferV039)) return false;
        WireTransferV039 that = (WireTransferV039) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "WireTransferV039{" +
            "id=" + id +
            ", wireId=" + wireId +
            ", originatorName=" + originatorName +
            ", originatorAccount=" + originatorAccount +
            ", beneficiaryName=" + beneficiaryName +
            ", beneficiaryAccount=" + beneficiaryAccount +
            '}';
    }
}
