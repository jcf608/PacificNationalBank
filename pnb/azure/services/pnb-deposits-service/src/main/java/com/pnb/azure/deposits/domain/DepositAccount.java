package com.pnb.azure.deposits.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Table(name = "pnb_deposit_account", schema = "deposits")
public class DepositAccount {

    @Id
    @Column(length = 16, nullable = false)
    private String accountNumber;

    @Column(length = 12, nullable = false)
    private String customerId;

    @Column(length = 2, nullable = false)
    private String accountType;

    @Column(length = 3, nullable = false)
    private String currency;

    @Column(precision = 19, scale = 4, nullable = false)
    private BigDecimal ledgerBalance;

    @Column(precision = 19, scale = 4, nullable = false)
    private BigDecimal availableBalance;

    @Column(length = 1, nullable = false)
    private String status;

    @Column(length = 6)
    private String branchCode;

    @Column(length = 32)
    private String legacyPnbAccountKey;

    @Column(length = 32)
    private String reconciledAcbAccountKey;

    private Instant openedAt;
    private Instant lastPostedAt;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public BigDecimal getLedgerBalance() {
        return ledgerBalance;
    }

    public void setLedgerBalance(BigDecimal ledgerBalance) {
        this.ledgerBalance = ledgerBalance;
    }

    public BigDecimal getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(BigDecimal availableBalance) {
        this.availableBalance = availableBalance;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public String getLegacyPnbAccountKey() {
        return legacyPnbAccountKey;
    }

    public void setLegacyPnbAccountKey(String legacyPnbAccountKey) {
        this.legacyPnbAccountKey = legacyPnbAccountKey;
    }

    public String getReconciledAcbAccountKey() {
        return reconciledAcbAccountKey;
    }

    public void setReconciledAcbAccountKey(String reconciledAcbAccountKey) {
        this.reconciledAcbAccountKey = reconciledAcbAccountKey;
    }

    public Instant getOpenedAt() {
        return openedAt;
    }

    public void setOpenedAt(Instant openedAt) {
        this.openedAt = openedAt;
    }

    public Instant getLastPostedAt() {
        return lastPostedAt;
    }

    public void setLastPostedAt(Instant lastPostedAt) {
        this.lastPostedAt = lastPostedAt;
    }
}
