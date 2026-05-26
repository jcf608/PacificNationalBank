package com.pnb.channel.online;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * OnlineBankingSessionV004 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "ONLINEBANKINGSESSIONV004")
public class OnlineBankingSessionV004 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "SESSION_ID", unique = true)
    private String sessionId;

    @Column(name = "CUST_ID")
    private String customerId;

    @Column(name = "IP_ADDR")
    private String ipAddress;

    @Column(name = "USER_AGENT")
    private String userAgent;

    @Column(name = "LOGIN_TIME")
    private LocalDateTime loginTime;

    @Column(name = "LOGOUT_TIME")
    private LocalDateTime logoutTime;

    @Column(name = "MFA_VERIFIED")
    private Boolean mfaVerified;

    @Column(name = "FLD_004_00")
    private String field004_00;

    @Column(name = "FLD_004_01")
    private Boolean field004_01;

    @Column(name = "FLD_004_02")
    private BigDecimal field004_02;

    @Column(name = "FLD_004_03")
    private Boolean field004_03;

    @Column(name = "FLD_004_04")
    private LocalDate field004_04;

    @Column(name = "FLD_004_05")
    private BigDecimal field004_05;

    @Column(name = "FLD_004_06")
    private LocalDate field004_06;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public OnlineBankingSessionV004() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getSessionId() { return sessionId; }
    public void setSessionId(String sessionId) { this.sessionId = sessionId; }

    public String getCustomerId() { return customerId; }
    public void setCustomerId(String customerId) { this.customerId = customerId; }

    public String getIpAddress() { return ipAddress; }
    public void setIpAddress(String ipAddress) { this.ipAddress = ipAddress; }

    public String getUserAgent() { return userAgent; }
    public void setUserAgent(String userAgent) { this.userAgent = userAgent; }

    public LocalDateTime getLoginTime() { return loginTime; }
    public void setLoginTime(LocalDateTime loginTime) { this.loginTime = loginTime; }

    public LocalDateTime getLogoutTime() { return logoutTime; }
    public void setLogoutTime(LocalDateTime logoutTime) { this.logoutTime = logoutTime; }

    public Boolean getMfaVerified() { return mfaVerified; }
    public void setMfaVerified(Boolean mfaVerified) { this.mfaVerified = mfaVerified; }

    public String getField004_00() { return field004_00; }
    public void setField004_00(String field004_00) { this.field004_00 = field004_00; }

    public Boolean getField004_01() { return field004_01; }
    public void setField004_01(Boolean field004_01) { this.field004_01 = field004_01; }

    public BigDecimal getField004_02() { return field004_02; }
    public void setField004_02(BigDecimal field004_02) { this.field004_02 = field004_02; }

    public Boolean getField004_03() { return field004_03; }
    public void setField004_03(Boolean field004_03) { this.field004_03 = field004_03; }

    public LocalDate getField004_04() { return field004_04; }
    public void setField004_04(LocalDate field004_04) { this.field004_04 = field004_04; }

    public BigDecimal getField004_05() { return field004_05; }
    public void setField004_05(BigDecimal field004_05) { this.field004_05 = field004_05; }

    public LocalDate getField004_06() { return field004_06; }
    public void setField004_06(LocalDate field004_06) { this.field004_06 = field004_06; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OnlineBankingSessionV004)) return false;
        OnlineBankingSessionV004 that = (OnlineBankingSessionV004) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "OnlineBankingSessionV004{" +
            "id=" + id +
            ", sessionId=" + sessionId +
            ", customerId=" + customerId +
            ", ipAddress=" + ipAddress +
            ", userAgent=" + userAgent +
            ", loginTime=" + loginTime +
            '}';
    }
}
