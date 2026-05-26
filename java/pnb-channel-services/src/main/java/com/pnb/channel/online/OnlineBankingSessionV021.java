package com.pnb.channel.online;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * OnlineBankingSessionV021 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "ONLINEBANKINGSESSIONV021")
public class OnlineBankingSessionV021 {

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

    @Column(name = "FLD_021_00")
    private String field021_00;

    @Column(name = "FLD_021_01")
    private Boolean field021_01;

    @Column(name = "FLD_021_02")
    private Integer field021_02;

    @Column(name = "FLD_021_03")
    private Integer field021_03;

    @Column(name = "FLD_021_04")
    private String field021_04;

    @Column(name = "FLD_021_05")
    private Integer field021_05;

    @Column(name = "FLD_021_06")
    private LocalDate field021_06;

    @Column(name = "FLD_021_07")
    private BigDecimal field021_07;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public OnlineBankingSessionV021() {}

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

    public String getField021_00() { return field021_00; }
    public void setField021_00(String field021_00) { this.field021_00 = field021_00; }

    public Boolean getField021_01() { return field021_01; }
    public void setField021_01(Boolean field021_01) { this.field021_01 = field021_01; }

    public Integer getField021_02() { return field021_02; }
    public void setField021_02(Integer field021_02) { this.field021_02 = field021_02; }

    public Integer getField021_03() { return field021_03; }
    public void setField021_03(Integer field021_03) { this.field021_03 = field021_03; }

    public String getField021_04() { return field021_04; }
    public void setField021_04(String field021_04) { this.field021_04 = field021_04; }

    public Integer getField021_05() { return field021_05; }
    public void setField021_05(Integer field021_05) { this.field021_05 = field021_05; }

    public LocalDate getField021_06() { return field021_06; }
    public void setField021_06(LocalDate field021_06) { this.field021_06 = field021_06; }

    public BigDecimal getField021_07() { return field021_07; }
    public void setField021_07(BigDecimal field021_07) { this.field021_07 = field021_07; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OnlineBankingSessionV021)) return false;
        OnlineBankingSessionV021 that = (OnlineBankingSessionV021) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "OnlineBankingSessionV021{" +
            "id=" + id +
            ", sessionId=" + sessionId +
            ", customerId=" + customerId +
            ", ipAddress=" + ipAddress +
            ", userAgent=" + userAgent +
            ", loginTime=" + loginTime +
            '}';
    }
}
