package com.pnb.channel.mobile;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * MobilePaymentV021 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "MOBILEPAYMENTV021")
public class MobilePaymentV021 {

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

    @Column(name = "FLD_021_00")
    private Integer field021_00;

    @Column(name = "FLD_021_01")
    private Integer field021_01;

    @Column(name = "FLD_021_02")
    private String field021_02;

    @Column(name = "FLD_021_03")
    private Integer field021_03;

    @Column(name = "FLD_021_04")
    private BigDecimal field021_04;

    @Column(name = "FLD_021_05")
    private BigDecimal field021_05;

    @Column(name = "FLD_021_06")
    private String field021_06;

    @Column(name = "FLD_021_07")
    private Integer field021_07;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public MobilePaymentV021() {}

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

    public Integer getField021_00() { return field021_00; }
    public void setField021_00(Integer field021_00) { this.field021_00 = field021_00; }

    public Integer getField021_01() { return field021_01; }
    public void setField021_01(Integer field021_01) { this.field021_01 = field021_01; }

    public String getField021_02() { return field021_02; }
    public void setField021_02(String field021_02) { this.field021_02 = field021_02; }

    public Integer getField021_03() { return field021_03; }
    public void setField021_03(Integer field021_03) { this.field021_03 = field021_03; }

    public BigDecimal getField021_04() { return field021_04; }
    public void setField021_04(BigDecimal field021_04) { this.field021_04 = field021_04; }

    public BigDecimal getField021_05() { return field021_05; }
    public void setField021_05(BigDecimal field021_05) { this.field021_05 = field021_05; }

    public String getField021_06() { return field021_06; }
    public void setField021_06(String field021_06) { this.field021_06 = field021_06; }

    public Integer getField021_07() { return field021_07; }
    public void setField021_07(Integer field021_07) { this.field021_07 = field021_07; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MobilePaymentV021)) return false;
        MobilePaymentV021 that = (MobilePaymentV021) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "MobilePaymentV021{" +
            "id=" + id +
            ", paymentId=" + paymentId +
            ", senderAccount=" + senderAccount +
            ", recipientAccount=" + recipientAccount +
            ", amount=" + amount +
            ", memo=" + memo +
            '}';
    }
}
