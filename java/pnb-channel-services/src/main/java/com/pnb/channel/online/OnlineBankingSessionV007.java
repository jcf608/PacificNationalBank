package com.pnb.channel.online;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * OnlineBankingSessionV007 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "ONLINEBANKINGSESSIONV007")
public class OnlineBankingSessionV007 {

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

    @Column(name = "FLD_007_00")
    private LocalDate field007_00;

    @Column(name = "FLD_007_01")
    private String field007_01;

    @Column(name = "FLD_007_02")
    private BigDecimal field007_02;

    @Column(name = "FLD_007_03")
    private String field007_03;

    @Column(name = "FLD_007_04")
    private String field007_04;

    @Column(name = "FLD_007_05")
    private Boolean field007_05;

    @Column(name = "FLD_007_06")
    private LocalDate field007_06;

    @Column(name = "FLD_007_07")
    private String field007_07;

    @Column(name = "FLD_007_08")
    private String field007_08;

    @Column(name = "FLD_007_09")
    private Boolean field007_09;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public OnlineBankingSessionV007() {}

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

    public LocalDate getField007_00() { return field007_00; }
    public void setField007_00(LocalDate field007_00) { this.field007_00 = field007_00; }

    public String getField007_01() { return field007_01; }
    public void setField007_01(String field007_01) { this.field007_01 = field007_01; }

    public BigDecimal getField007_02() { return field007_02; }
    public void setField007_02(BigDecimal field007_02) { this.field007_02 = field007_02; }

    public String getField007_03() { return field007_03; }
    public void setField007_03(String field007_03) { this.field007_03 = field007_03; }

    public String getField007_04() { return field007_04; }
    public void setField007_04(String field007_04) { this.field007_04 = field007_04; }

    public Boolean getField007_05() { return field007_05; }
    public void setField007_05(Boolean field007_05) { this.field007_05 = field007_05; }

    public LocalDate getField007_06() { return field007_06; }
    public void setField007_06(LocalDate field007_06) { this.field007_06 = field007_06; }

    public String getField007_07() { return field007_07; }
    public void setField007_07(String field007_07) { this.field007_07 = field007_07; }

    public String getField007_08() { return field007_08; }
    public void setField007_08(String field007_08) { this.field007_08 = field007_08; }

    public Boolean getField007_09() { return field007_09; }
    public void setField007_09(Boolean field007_09) { this.field007_09 = field007_09; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OnlineBankingSessionV007)) return false;
        OnlineBankingSessionV007 that = (OnlineBankingSessionV007) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "OnlineBankingSessionV007{" +
            "id=" + id +
            ", sessionId=" + sessionId +
            ", customerId=" + customerId +
            ", ipAddress=" + ipAddress +
            ", userAgent=" + userAgent +
            ", loginTime=" + loginTime +
            '}';
    }
}
