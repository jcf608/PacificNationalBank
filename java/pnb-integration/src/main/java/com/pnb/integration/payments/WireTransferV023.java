package com.pnb.integration.payments;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * WireTransferV023 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "WIRETRANSFERV023")
public class WireTransferV023 {

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

    @Column(name = "INT_FLD_023_00")
    private LocalDate intField023_00;

    @Column(name = "INT_FLD_023_01")
    private Integer intField023_01;

    @Column(name = "INT_FLD_023_02")
    private String intField023_02;

    @Column(name = "INT_FLD_023_03")
    private String intField023_03;

    @Column(name = "INT_FLD_023_04")
    private Integer intField023_04;

    @Column(name = "INT_FLD_023_05")
    private Integer intField023_05;

    @Column(name = "INT_FLD_023_06")
    private String intField023_06;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public WireTransferV023() {}

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

    public LocalDate getIntField023_00() { return intField023_00; }
    public void setIntField023_00(LocalDate intField023_00) { this.intField023_00 = intField023_00; }

    public Integer getIntField023_01() { return intField023_01; }
    public void setIntField023_01(Integer intField023_01) { this.intField023_01 = intField023_01; }

    public String getIntField023_02() { return intField023_02; }
    public void setIntField023_02(String intField023_02) { this.intField023_02 = intField023_02; }

    public String getIntField023_03() { return intField023_03; }
    public void setIntField023_03(String intField023_03) { this.intField023_03 = intField023_03; }

    public Integer getIntField023_04() { return intField023_04; }
    public void setIntField023_04(Integer intField023_04) { this.intField023_04 = intField023_04; }

    public Integer getIntField023_05() { return intField023_05; }
    public void setIntField023_05(Integer intField023_05) { this.intField023_05 = intField023_05; }

    public String getIntField023_06() { return intField023_06; }
    public void setIntField023_06(String intField023_06) { this.intField023_06 = intField023_06; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof WireTransferV023)) return false;
        WireTransferV023 that = (WireTransferV023) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "WireTransferV023{" +
            "id=" + id +
            ", wireId=" + wireId +
            ", originatorName=" + originatorName +
            ", originatorAccount=" + originatorAccount +
            ", beneficiaryName=" + beneficiaryName +
            ", beneficiaryAccount=" + beneficiaryAccount +
            '}';
    }
}
