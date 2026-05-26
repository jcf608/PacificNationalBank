package com.pnb.channel.mobile;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * MobilePaymentV012 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "MOBILEPAYMENTV012")
public class MobilePaymentV012 {

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

    @Column(name = "FLD_012_00")
    private BigDecimal field012_00;

    @Column(name = "FLD_012_01")
    private Integer field012_01;

    @Column(name = "FLD_012_02")
    private String field012_02;

    @Column(name = "FLD_012_03")
    private BigDecimal field012_03;

    @Column(name = "FLD_012_04")
    private Integer field012_04;

    @Column(name = "FLD_012_05")
    private Integer field012_05;

    @Column(name = "FLD_012_06")
    private BigDecimal field012_06;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public MobilePaymentV012() {}

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

    public BigDecimal getField012_00() { return field012_00; }
    public void setField012_00(BigDecimal field012_00) { this.field012_00 = field012_00; }

    public Integer getField012_01() { return field012_01; }
    public void setField012_01(Integer field012_01) { this.field012_01 = field012_01; }

    public String getField012_02() { return field012_02; }
    public void setField012_02(String field012_02) { this.field012_02 = field012_02; }

    public BigDecimal getField012_03() { return field012_03; }
    public void setField012_03(BigDecimal field012_03) { this.field012_03 = field012_03; }

    public Integer getField012_04() { return field012_04; }
    public void setField012_04(Integer field012_04) { this.field012_04 = field012_04; }

    public Integer getField012_05() { return field012_05; }
    public void setField012_05(Integer field012_05) { this.field012_05 = field012_05; }

    public BigDecimal getField012_06() { return field012_06; }
    public void setField012_06(BigDecimal field012_06) { this.field012_06 = field012_06; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MobilePaymentV012)) return false;
        MobilePaymentV012 that = (MobilePaymentV012) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "MobilePaymentV012{" +
            "id=" + id +
            ", paymentId=" + paymentId +
            ", senderAccount=" + senderAccount +
            ", recipientAccount=" + recipientAccount +
            ", amount=" + amount +
            ", memo=" + memo +
            '}';
    }
}
