package com.pnb.channel.mobile;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * MobilePaymentV022 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "MOBILEPAYMENTV022")
public class MobilePaymentV022 {

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

    @Column(name = "FLD_022_00")
    private LocalDate field022_00;

    @Column(name = "FLD_022_01")
    private LocalDate field022_01;

    @Column(name = "FLD_022_02")
    private LocalDate field022_02;

    @Column(name = "FLD_022_03")
    private LocalDate field022_03;

    @Column(name = "FLD_022_04")
    private String field022_04;

    @Column(name = "FLD_022_05")
    private Boolean field022_05;

    @Column(name = "FLD_022_06")
    private BigDecimal field022_06;

    @Column(name = "FLD_022_07")
    private Boolean field022_07;

    @Column(name = "FLD_022_08")
    private Boolean field022_08;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public MobilePaymentV022() {}

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

    public LocalDate getField022_00() { return field022_00; }
    public void setField022_00(LocalDate field022_00) { this.field022_00 = field022_00; }

    public LocalDate getField022_01() { return field022_01; }
    public void setField022_01(LocalDate field022_01) { this.field022_01 = field022_01; }

    public LocalDate getField022_02() { return field022_02; }
    public void setField022_02(LocalDate field022_02) { this.field022_02 = field022_02; }

    public LocalDate getField022_03() { return field022_03; }
    public void setField022_03(LocalDate field022_03) { this.field022_03 = field022_03; }

    public String getField022_04() { return field022_04; }
    public void setField022_04(String field022_04) { this.field022_04 = field022_04; }

    public Boolean getField022_05() { return field022_05; }
    public void setField022_05(Boolean field022_05) { this.field022_05 = field022_05; }

    public BigDecimal getField022_06() { return field022_06; }
    public void setField022_06(BigDecimal field022_06) { this.field022_06 = field022_06; }

    public Boolean getField022_07() { return field022_07; }
    public void setField022_07(Boolean field022_07) { this.field022_07 = field022_07; }

    public Boolean getField022_08() { return field022_08; }
    public void setField022_08(Boolean field022_08) { this.field022_08 = field022_08; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MobilePaymentV022)) return false;
        MobilePaymentV022 that = (MobilePaymentV022) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "MobilePaymentV022{" +
            "id=" + id +
            ", paymentId=" + paymentId +
            ", senderAccount=" + senderAccount +
            ", recipientAccount=" + recipientAccount +
            ", amount=" + amount +
            ", memo=" + memo +
            '}';
    }
}
