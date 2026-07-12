package com.pnb.channel.mobile;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * MobilePaymentV037 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "MOBILEPAYMENTV037")
public class MobilePaymentV037 {

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

    @Column(name = "FLD_037_00")
    private Boolean field037_00;

    @Column(name = "FLD_037_01")
    private Boolean field037_01;

    @Column(name = "FLD_037_02")
    private String field037_02;

    @Column(name = "FLD_037_03")
    private LocalDate field037_03;

    @Column(name = "FLD_037_04")
    private Boolean field037_04;

    @Column(name = "FLD_037_05")
    private LocalDate field037_05;

    @Column(name = "FLD_037_06")
    private String field037_06;

    @Column(name = "FLD_037_07")
    private BigDecimal field037_07;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public MobilePaymentV037() {}

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

    public Boolean getField037_00() { return field037_00; }
    public void setField037_00(Boolean field037_00) { this.field037_00 = field037_00; }

    public Boolean getField037_01() { return field037_01; }
    public void setField037_01(Boolean field037_01) { this.field037_01 = field037_01; }

    public String getField037_02() { return field037_02; }
    public void setField037_02(String field037_02) { this.field037_02 = field037_02; }

    public LocalDate getField037_03() { return field037_03; }
    public void setField037_03(LocalDate field037_03) { this.field037_03 = field037_03; }

    public Boolean getField037_04() { return field037_04; }
    public void setField037_04(Boolean field037_04) { this.field037_04 = field037_04; }

    public LocalDate getField037_05() { return field037_05; }
    public void setField037_05(LocalDate field037_05) { this.field037_05 = field037_05; }

    public String getField037_06() { return field037_06; }
    public void setField037_06(String field037_06) { this.field037_06 = field037_06; }

    public BigDecimal getField037_07() { return field037_07; }
    public void setField037_07(BigDecimal field037_07) { this.field037_07 = field037_07; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MobilePaymentV037)) return false;
        MobilePaymentV037 that = (MobilePaymentV037) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "MobilePaymentV037{" +
            "id=" + id +
            ", paymentId=" + paymentId +
            ", senderAccount=" + senderAccount +
            ", recipientAccount=" + recipientAccount +
            ", amount=" + amount +
            ", memo=" + memo +
            '}';
    }
}
