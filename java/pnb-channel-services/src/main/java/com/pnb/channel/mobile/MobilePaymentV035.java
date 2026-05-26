package com.pnb.channel.mobile;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * MobilePaymentV035 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "MOBILEPAYMENTV035")
public class MobilePaymentV035 {

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

    @Column(name = "FLD_035_00")
    private BigDecimal field035_00;

    @Column(name = "FLD_035_01")
    private Boolean field035_01;

    @Column(name = "FLD_035_02")
    private Boolean field035_02;

    @Column(name = "FLD_035_03")
    private Integer field035_03;

    @Column(name = "FLD_035_04")
    private LocalDate field035_04;

    @Column(name = "FLD_035_05")
    private Boolean field035_05;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public MobilePaymentV035() {}

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

    public BigDecimal getField035_00() { return field035_00; }
    public void setField035_00(BigDecimal field035_00) { this.field035_00 = field035_00; }

    public Boolean getField035_01() { return field035_01; }
    public void setField035_01(Boolean field035_01) { this.field035_01 = field035_01; }

    public Boolean getField035_02() { return field035_02; }
    public void setField035_02(Boolean field035_02) { this.field035_02 = field035_02; }

    public Integer getField035_03() { return field035_03; }
    public void setField035_03(Integer field035_03) { this.field035_03 = field035_03; }

    public LocalDate getField035_04() { return field035_04; }
    public void setField035_04(LocalDate field035_04) { this.field035_04 = field035_04; }

    public Boolean getField035_05() { return field035_05; }
    public void setField035_05(Boolean field035_05) { this.field035_05 = field035_05; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MobilePaymentV035)) return false;
        MobilePaymentV035 that = (MobilePaymentV035) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "MobilePaymentV035{" +
            "id=" + id +
            ", paymentId=" + paymentId +
            ", senderAccount=" + senderAccount +
            ", recipientAccount=" + recipientAccount +
            ", amount=" + amount +
            ", memo=" + memo +
            '}';
    }
}
