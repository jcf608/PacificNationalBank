package com.pnb.channel.online;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * OnlineBankingSessionV037 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "ONLINEBANKINGSESSIONV037")
public class OnlineBankingSessionV037 {

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

    @Column(name = "FLD_037_00")
    private BigDecimal field037_00;

    @Column(name = "FLD_037_01")
    private String field037_01;

    @Column(name = "FLD_037_02")
    private Integer field037_02;

    @Column(name = "FLD_037_03")
    private LocalDate field037_03;

    @Column(name = "FLD_037_04")
    private BigDecimal field037_04;

    @Column(name = "FLD_037_05")
    private BigDecimal field037_05;

    @Column(name = "FLD_037_06")
    private String field037_06;

    @Column(name = "FLD_037_07")
    private BigDecimal field037_07;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public OnlineBankingSessionV037() {}

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

    public BigDecimal getField037_00() { return field037_00; }
    public void setField037_00(BigDecimal field037_00) { this.field037_00 = field037_00; }

    public String getField037_01() { return field037_01; }
    public void setField037_01(String field037_01) { this.field037_01 = field037_01; }

    public Integer getField037_02() { return field037_02; }
    public void setField037_02(Integer field037_02) { this.field037_02 = field037_02; }

    public LocalDate getField037_03() { return field037_03; }
    public void setField037_03(LocalDate field037_03) { this.field037_03 = field037_03; }

    public BigDecimal getField037_04() { return field037_04; }
    public void setField037_04(BigDecimal field037_04) { this.field037_04 = field037_04; }

    public BigDecimal getField037_05() { return field037_05; }
    public void setField037_05(BigDecimal field037_05) { this.field037_05 = field037_05; }

    public String getField037_06() { return field037_06; }
    public void setField037_06(String field037_06) { this.field037_06 = field037_06; }

    public BigDecimal getField037_07() { return field037_07; }
    public void setField037_07(BigDecimal field037_07) { this.field037_07 = field037_07; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OnlineBankingSessionV037)) return false;
        OnlineBankingSessionV037 that = (OnlineBankingSessionV037) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "OnlineBankingSessionV037{" +
            "id=" + id +
            ", sessionId=" + sessionId +
            ", customerId=" + customerId +
            ", ipAddress=" + ipAddress +
            ", userAgent=" + userAgent +
            ", loginTime=" + loginTime +
            '}';
    }
}
