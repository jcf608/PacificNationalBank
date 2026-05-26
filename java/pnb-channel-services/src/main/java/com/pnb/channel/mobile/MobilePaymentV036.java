package com.pnb.channel.mobile;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * MobilePaymentV036 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "MOBILEPAYMENTV036")
public class MobilePaymentV036 {

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

    @Column(name = "FLD_036_00")
    private String field036_00;

    @Column(name = "FLD_036_01")
    private Integer field036_01;

    @Column(name = "FLD_036_02")
    private Integer field036_02;

    @Column(name = "FLD_036_03")
    private BigDecimal field036_03;

    @Column(name = "FLD_036_04")
    private LocalDate field036_04;

    @Column(name = "FLD_036_05")
    private Boolean field036_05;

    @Column(name = "FLD_036_06")
    private Boolean field036_06;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public MobilePaymentV036() {}

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

    public String getField036_00() { return field036_00; }
    public void setField036_00(String field036_00) { this.field036_00 = field036_00; }

    public Integer getField036_01() { return field036_01; }
    public void setField036_01(Integer field036_01) { this.field036_01 = field036_01; }

    public Integer getField036_02() { return field036_02; }
    public void setField036_02(Integer field036_02) { this.field036_02 = field036_02; }

    public BigDecimal getField036_03() { return field036_03; }
    public void setField036_03(BigDecimal field036_03) { this.field036_03 = field036_03; }

    public LocalDate getField036_04() { return field036_04; }
    public void setField036_04(LocalDate field036_04) { this.field036_04 = field036_04; }

    public Boolean getField036_05() { return field036_05; }
    public void setField036_05(Boolean field036_05) { this.field036_05 = field036_05; }

    public Boolean getField036_06() { return field036_06; }
    public void setField036_06(Boolean field036_06) { this.field036_06 = field036_06; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MobilePaymentV036)) return false;
        MobilePaymentV036 that = (MobilePaymentV036) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "MobilePaymentV036{" +
            "id=" + id +
            ", paymentId=" + paymentId +
            ", senderAccount=" + senderAccount +
            ", recipientAccount=" + recipientAccount +
            ", amount=" + amount +
            ", memo=" + memo +
            '}';
    }
}
