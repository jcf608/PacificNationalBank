package com.pnb.channel.mobile;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * MobilePaymentV005 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "MOBILEPAYMENTV005")
public class MobilePaymentV005 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "PMT_ID", unique = true)
    private String paymentId;

    @Column(name = "SENDER_ACCT")
    private String senderAccount;

    @Column(name = "RECIP_ACCT")
    private String recipientAccount;

    @Column(name = "AMOUNT", precision = 13, scale = 2)
    private BigDecimal amount;

    @Column(name = "MEMO")
    private String memo;

    @Column(name = "DEVICE_FP")
    private String deviceFingerprint;

    @Column(name = "FLD_005_00")
    private BigDecimal field005_00;

    @Column(name = "FLD_005_01")
    private BigDecimal field005_01;

    @Column(name = "FLD_005_02")
    private BigDecimal field005_02;

    @Column(name = "FLD_005_03")
    private BigDecimal field005_03;

    @Column(name = "FLD_005_04")
    private String field005_04;

    @Column(name = "FLD_005_05")
    private String field005_05;

    @Column(name = "FLD_005_06")
    private Boolean field005_06;

    @Column(name = "FLD_005_07")
    private String field005_07;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public MobilePaymentV005() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getPaymentId() { return paymentId; }
    public void setPaymentId(String paymentId) { this.paymentId = paymentId; }

    public String getSenderAccount() { return senderAccount; }
    public void setSenderAccount(String senderAccount) { this.senderAccount = senderAccount; }

    public String getRecipientAccount() { return recipientAccount; }
    public void setRecipientAccount(String recipientAccount) { this.recipientAccount = recipientAccount; }

    public BigDecimal getAmount() { return amount; }
    public void setAmount(BigDecimal amount) { this.amount = amount; }

    public String getMemo() { return memo; }
    public void setMemo(String memo) { this.memo = memo; }

    public String getDeviceFingerprint() { return deviceFingerprint; }
    public void setDeviceFingerprint(String deviceFingerprint) { this.deviceFingerprint = deviceFingerprint; }

    public BigDecimal getField005_00() { return field005_00; }
    public void setField005_00(BigDecimal field005_00) { this.field005_00 = field005_00; }

    public BigDecimal getField005_01() { return field005_01; }
    public void setField005_01(BigDecimal field005_01) { this.field005_01 = field005_01; }

    public BigDecimal getField005_02() { return field005_02; }
    public void setField005_02(BigDecimal field005_02) { this.field005_02 = field005_02; }

    public BigDecimal getField005_03() { return field005_03; }
    public void setField005_03(BigDecimal field005_03) { this.field005_03 = field005_03; }

    public String getField005_04() { return field005_04; }
    public void setField005_04(String field005_04) { this.field005_04 = field005_04; }

    public String getField005_05() { return field005_05; }
    public void setField005_05(String field005_05) { this.field005_05 = field005_05; }

    public Boolean getField005_06() { return field005_06; }
    public void setField005_06(Boolean field005_06) { this.field005_06 = field005_06; }

    public String getField005_07() { return field005_07; }
    public void setField005_07(String field005_07) { this.field005_07 = field005_07; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MobilePaymentV005)) return false;
        MobilePaymentV005 that = (MobilePaymentV005) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "MobilePaymentV005{" +
            "id=" + id +
            ", paymentId=" + paymentId +
            ", senderAccount=" + senderAccount +
            ", recipientAccount=" + recipientAccount +
            ", amount=" + amount +
            ", memo=" + memo +
            '}';
    }
}
