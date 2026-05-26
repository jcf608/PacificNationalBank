package com.pnb.channel.mobile;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * MobilePaymentV028 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "MOBILEPAYMENTV028")
public class MobilePaymentV028 {

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

    @Column(name = "FLD_028_00")
    private Integer field028_00;

    @Column(name = "FLD_028_01")
    private String field028_01;

    @Column(name = "FLD_028_02")
    private String field028_02;

    @Column(name = "FLD_028_03")
    private Integer field028_03;

    @Column(name = "FLD_028_04")
    private BigDecimal field028_04;

    @Column(name = "FLD_028_05")
    private Boolean field028_05;

    @Column(name = "FLD_028_06")
    private Integer field028_06;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public MobilePaymentV028() {}

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

    public Integer getField028_00() { return field028_00; }
    public void setField028_00(Integer field028_00) { this.field028_00 = field028_00; }

    public String getField028_01() { return field028_01; }
    public void setField028_01(String field028_01) { this.field028_01 = field028_01; }

    public String getField028_02() { return field028_02; }
    public void setField028_02(String field028_02) { this.field028_02 = field028_02; }

    public Integer getField028_03() { return field028_03; }
    public void setField028_03(Integer field028_03) { this.field028_03 = field028_03; }

    public BigDecimal getField028_04() { return field028_04; }
    public void setField028_04(BigDecimal field028_04) { this.field028_04 = field028_04; }

    public Boolean getField028_05() { return field028_05; }
    public void setField028_05(Boolean field028_05) { this.field028_05 = field028_05; }

    public Integer getField028_06() { return field028_06; }
    public void setField028_06(Integer field028_06) { this.field028_06 = field028_06; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MobilePaymentV028)) return false;
        MobilePaymentV028 that = (MobilePaymentV028) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "MobilePaymentV028{" +
            "id=" + id +
            ", paymentId=" + paymentId +
            ", senderAccount=" + senderAccount +
            ", recipientAccount=" + recipientAccount +
            ", amount=" + amount +
            ", memo=" + memo +
            '}';
    }
}
