package com.pnb.channel.online;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * OnlineBankingSessionV012 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "ONLINEBANKINGSESSIONV012")
public class OnlineBankingSessionV012 {

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

    @Column(name = "FLD_012_00")
    private LocalDate field012_00;

    @Column(name = "FLD_012_01")
    private BigDecimal field012_01;

    @Column(name = "FLD_012_02")
    private BigDecimal field012_02;

    @Column(name = "FLD_012_03")
    private String field012_03;

    @Column(name = "FLD_012_04")
    private Integer field012_04;

    @Column(name = "FLD_012_05")
    private Integer field012_05;

    @Column(name = "FLD_012_06")
    private Boolean field012_06;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public OnlineBankingSessionV012() {}

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

    public LocalDate getField012_00() { return field012_00; }
    public void setField012_00(LocalDate field012_00) { this.field012_00 = field012_00; }

    public BigDecimal getField012_01() { return field012_01; }
    public void setField012_01(BigDecimal field012_01) { this.field012_01 = field012_01; }

    public BigDecimal getField012_02() { return field012_02; }
    public void setField012_02(BigDecimal field012_02) { this.field012_02 = field012_02; }

    public String getField012_03() { return field012_03; }
    public void setField012_03(String field012_03) { this.field012_03 = field012_03; }

    public Integer getField012_04() { return field012_04; }
    public void setField012_04(Integer field012_04) { this.field012_04 = field012_04; }

    public Integer getField012_05() { return field012_05; }
    public void setField012_05(Integer field012_05) { this.field012_05 = field012_05; }

    public Boolean getField012_06() { return field012_06; }
    public void setField012_06(Boolean field012_06) { this.field012_06 = field012_06; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OnlineBankingSessionV012)) return false;
        OnlineBankingSessionV012 that = (OnlineBankingSessionV012) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "OnlineBankingSessionV012{" +
            "id=" + id +
            ", sessionId=" + sessionId +
            ", customerId=" + customerId +
            ", ipAddress=" + ipAddress +
            ", userAgent=" + userAgent +
            ", loginTime=" + loginTime +
            '}';
    }
}
