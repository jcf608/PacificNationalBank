package com.pnb.integration.payments;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * WireTransferV017 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "WIRETRANSFERV017")
public class WireTransferV017 {

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

    @Column(name = "INT_FLD_017_00")
    private String intField017_00;

    @Column(name = "INT_FLD_017_01")
    private BigDecimal intField017_01;

    @Column(name = "INT_FLD_017_02")
    private Integer intField017_02;

    @Column(name = "INT_FLD_017_03")
    private BigDecimal intField017_03;

    @Column(name = "INT_FLD_017_04")
    private LocalDate intField017_04;

    @Column(name = "INT_FLD_017_05")
    private LocalDate intField017_05;

    @Column(name = "INT_FLD_017_06")
    private LocalDate intField017_06;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public WireTransferV017() {}

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

    public String getIntField017_00() { return intField017_00; }
    public void setIntField017_00(String intField017_00) { this.intField017_00 = intField017_00; }

    public BigDecimal getIntField017_01() { return intField017_01; }
    public void setIntField017_01(BigDecimal intField017_01) { this.intField017_01 = intField017_01; }

    public Integer getIntField017_02() { return intField017_02; }
    public void setIntField017_02(Integer intField017_02) { this.intField017_02 = intField017_02; }

    public BigDecimal getIntField017_03() { return intField017_03; }
    public void setIntField017_03(BigDecimal intField017_03) { this.intField017_03 = intField017_03; }

    public LocalDate getIntField017_04() { return intField017_04; }
    public void setIntField017_04(LocalDate intField017_04) { this.intField017_04 = intField017_04; }

    public LocalDate getIntField017_05() { return intField017_05; }
    public void setIntField017_05(LocalDate intField017_05) { this.intField017_05 = intField017_05; }

    public LocalDate getIntField017_06() { return intField017_06; }
    public void setIntField017_06(LocalDate intField017_06) { this.intField017_06 = intField017_06; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof WireTransferV017)) return false;
        WireTransferV017 that = (WireTransferV017) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "WireTransferV017{" +
            "id=" + id +
            ", wireId=" + wireId +
            ", originatorName=" + originatorName +
            ", originatorAccount=" + originatorAccount +
            ", beneficiaryName=" + beneficiaryName +
            ", beneficiaryAccount=" + beneficiaryAccount +
            '}';
    }
}
