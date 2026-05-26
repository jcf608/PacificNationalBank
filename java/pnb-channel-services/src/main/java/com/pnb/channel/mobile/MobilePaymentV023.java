package com.pnb.channel.mobile;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * MobilePaymentV023 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "MOBILEPAYMENTV023")
public class MobilePaymentV023 {

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

    @Column(name = "FLD_023_00")
    private BigDecimal field023_00;

    @Column(name = "FLD_023_01")
    private Integer field023_01;

    @Column(name = "FLD_023_02")
    private LocalDate field023_02;

    @Column(name = "FLD_023_03")
    private BigDecimal field023_03;

    @Column(name = "FLD_023_04")
    private Integer field023_04;

    @Column(name = "FLD_023_05")
    private BigDecimal field023_05;

    @Column(name = "FLD_023_06")
    private String field023_06;

    @Column(name = "FLD_023_07")
    private LocalDate field023_07;

    @Column(name = "FLD_023_08")
    private String field023_08;

    @Column(name = "FLD_023_09")
    private LocalDate field023_09;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public MobilePaymentV023() {}

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

    public BigDecimal getField023_00() { return field023_00; }
    public void setField023_00(BigDecimal field023_00) { this.field023_00 = field023_00; }

    public Integer getField023_01() { return field023_01; }
    public void setField023_01(Integer field023_01) { this.field023_01 = field023_01; }

    public LocalDate getField023_02() { return field023_02; }
    public void setField023_02(LocalDate field023_02) { this.field023_02 = field023_02; }

    public BigDecimal getField023_03() { return field023_03; }
    public void setField023_03(BigDecimal field023_03) { this.field023_03 = field023_03; }

    public Integer getField023_04() { return field023_04; }
    public void setField023_04(Integer field023_04) { this.field023_04 = field023_04; }

    public BigDecimal getField023_05() { return field023_05; }
    public void setField023_05(BigDecimal field023_05) { this.field023_05 = field023_05; }

    public String getField023_06() { return field023_06; }
    public void setField023_06(String field023_06) { this.field023_06 = field023_06; }

    public LocalDate getField023_07() { return field023_07; }
    public void setField023_07(LocalDate field023_07) { this.field023_07 = field023_07; }

    public String getField023_08() { return field023_08; }
    public void setField023_08(String field023_08) { this.field023_08 = field023_08; }

    public LocalDate getField023_09() { return field023_09; }
    public void setField023_09(LocalDate field023_09) { this.field023_09 = field023_09; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MobilePaymentV023)) return false;
        MobilePaymentV023 that = (MobilePaymentV023) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "MobilePaymentV023{" +
            "id=" + id +
            ", paymentId=" + paymentId +
            ", senderAccount=" + senderAccount +
            ", recipientAccount=" + recipientAccount +
            ", amount=" + amount +
            ", memo=" + memo +
            '}';
    }
}
