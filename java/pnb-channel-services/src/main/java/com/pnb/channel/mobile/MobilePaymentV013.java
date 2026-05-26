package com.pnb.channel.mobile;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * MobilePaymentV013 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "MOBILEPAYMENTV013")
public class MobilePaymentV013 {

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

    @Column(name = "FLD_013_00")
    private LocalDate field013_00;

    @Column(name = "FLD_013_01")
    private Boolean field013_01;

    @Column(name = "FLD_013_02")
    private Integer field013_02;

    @Column(name = "FLD_013_03")
    private Boolean field013_03;

    @Column(name = "FLD_013_04")
    private Boolean field013_04;

    @Column(name = "FLD_013_05")
    private String field013_05;

    @Column(name = "FLD_013_06")
    private Boolean field013_06;

    @Column(name = "FLD_013_07")
    private Integer field013_07;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public MobilePaymentV013() {}

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

    public LocalDate getField013_00() { return field013_00; }
    public void setField013_00(LocalDate field013_00) { this.field013_00 = field013_00; }

    public Boolean getField013_01() { return field013_01; }
    public void setField013_01(Boolean field013_01) { this.field013_01 = field013_01; }

    public Integer getField013_02() { return field013_02; }
    public void setField013_02(Integer field013_02) { this.field013_02 = field013_02; }

    public Boolean getField013_03() { return field013_03; }
    public void setField013_03(Boolean field013_03) { this.field013_03 = field013_03; }

    public Boolean getField013_04() { return field013_04; }
    public void setField013_04(Boolean field013_04) { this.field013_04 = field013_04; }

    public String getField013_05() { return field013_05; }
    public void setField013_05(String field013_05) { this.field013_05 = field013_05; }

    public Boolean getField013_06() { return field013_06; }
    public void setField013_06(Boolean field013_06) { this.field013_06 = field013_06; }

    public Integer getField013_07() { return field013_07; }
    public void setField013_07(Integer field013_07) { this.field013_07 = field013_07; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MobilePaymentV013)) return false;
        MobilePaymentV013 that = (MobilePaymentV013) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "MobilePaymentV013{" +
            "id=" + id +
            ", paymentId=" + paymentId +
            ", senderAccount=" + senderAccount +
            ", recipientAccount=" + recipientAccount +
            ", amount=" + amount +
            ", memo=" + memo +
            '}';
    }
}
