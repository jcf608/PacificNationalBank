package com.pnb.integration.payments;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * WireTransferV035 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "WIRETRANSFERV035")
public class WireTransferV035 {

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

    @Column(name = "INT_FLD_035_00")
    private BigDecimal intField035_00;

    @Column(name = "INT_FLD_035_01")
    private String intField035_01;

    @Column(name = "INT_FLD_035_02")
    private String intField035_02;

    @Column(name = "INT_FLD_035_03")
    private String intField035_03;

    @Column(name = "INT_FLD_035_04")
    private BigDecimal intField035_04;

    @Column(name = "INT_FLD_035_05")
    private String intField035_05;

    @Column(name = "INT_FLD_035_06")
    private String intField035_06;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public WireTransferV035() {}

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

    public BigDecimal getIntField035_00() { return intField035_00; }
    public void setIntField035_00(BigDecimal intField035_00) { this.intField035_00 = intField035_00; }

    public String getIntField035_01() { return intField035_01; }
    public void setIntField035_01(String intField035_01) { this.intField035_01 = intField035_01; }

    public String getIntField035_02() { return intField035_02; }
    public void setIntField035_02(String intField035_02) { this.intField035_02 = intField035_02; }

    public String getIntField035_03() { return intField035_03; }
    public void setIntField035_03(String intField035_03) { this.intField035_03 = intField035_03; }

    public BigDecimal getIntField035_04() { return intField035_04; }
    public void setIntField035_04(BigDecimal intField035_04) { this.intField035_04 = intField035_04; }

    public String getIntField035_05() { return intField035_05; }
    public void setIntField035_05(String intField035_05) { this.intField035_05 = intField035_05; }

    public String getIntField035_06() { return intField035_06; }
    public void setIntField035_06(String intField035_06) { this.intField035_06 = intField035_06; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof WireTransferV035)) return false;
        WireTransferV035 that = (WireTransferV035) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "WireTransferV035{" +
            "id=" + id +
            ", wireId=" + wireId +
            ", originatorName=" + originatorName +
            ", originatorAccount=" + originatorAccount +
            ", beneficiaryName=" + beneficiaryName +
            ", beneficiaryAccount=" + beneficiaryAccount +
            '}';
    }
}
