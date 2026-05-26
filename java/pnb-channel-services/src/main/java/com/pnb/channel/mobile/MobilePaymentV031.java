package com.pnb.channel.mobile;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * MobilePaymentV031 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "MOBILEPAYMENTV031")
public class MobilePaymentV031 {

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

    @Column(name = "FLD_031_00")
    private Boolean field031_00;

    @Column(name = "FLD_031_01")
    private Boolean field031_01;

    @Column(name = "FLD_031_02")
    private BigDecimal field031_02;

    @Column(name = "FLD_031_03")
    private Integer field031_03;

    @Column(name = "FLD_031_04")
    private LocalDate field031_04;

    @Column(name = "FLD_031_05")
    private String field031_05;

    @Column(name = "FLD_031_06")
    private Integer field031_06;

    @Column(name = "FLD_031_07")
    private Boolean field031_07;

    @Column(name = "FLD_031_08")
    private Integer field031_08;

    @Column(name = "FLD_031_09")
    private String field031_09;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public MobilePaymentV031() {}

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

    public Boolean getField031_00() { return field031_00; }
    public void setField031_00(Boolean field031_00) { this.field031_00 = field031_00; }

    public Boolean getField031_01() { return field031_01; }
    public void setField031_01(Boolean field031_01) { this.field031_01 = field031_01; }

    public BigDecimal getField031_02() { return field031_02; }
    public void setField031_02(BigDecimal field031_02) { this.field031_02 = field031_02; }

    public Integer getField031_03() { return field031_03; }
    public void setField031_03(Integer field031_03) { this.field031_03 = field031_03; }

    public LocalDate getField031_04() { return field031_04; }
    public void setField031_04(LocalDate field031_04) { this.field031_04 = field031_04; }

    public String getField031_05() { return field031_05; }
    public void setField031_05(String field031_05) { this.field031_05 = field031_05; }

    public Integer getField031_06() { return field031_06; }
    public void setField031_06(Integer field031_06) { this.field031_06 = field031_06; }

    public Boolean getField031_07() { return field031_07; }
    public void setField031_07(Boolean field031_07) { this.field031_07 = field031_07; }

    public Integer getField031_08() { return field031_08; }
    public void setField031_08(Integer field031_08) { this.field031_08 = field031_08; }

    public String getField031_09() { return field031_09; }
    public void setField031_09(String field031_09) { this.field031_09 = field031_09; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MobilePaymentV031)) return false;
        MobilePaymentV031 that = (MobilePaymentV031) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "MobilePaymentV031{" +
            "id=" + id +
            ", paymentId=" + paymentId +
            ", senderAccount=" + senderAccount +
            ", recipientAccount=" + recipientAccount +
            ", amount=" + amount +
            ", memo=" + memo +
            '}';
    }
}
