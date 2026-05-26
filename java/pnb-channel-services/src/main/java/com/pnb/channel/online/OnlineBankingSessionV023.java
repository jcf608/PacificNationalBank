package com.pnb.channel.online;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * OnlineBankingSessionV023 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "ONLINEBANKINGSESSIONV023")
public class OnlineBankingSessionV023 {

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

    @Column(name = "FLD_023_00")
    private Boolean field023_00;

    @Column(name = "FLD_023_01")
    private BigDecimal field023_01;

    @Column(name = "FLD_023_02")
    private BigDecimal field023_02;

    @Column(name = "FLD_023_03")
    private Integer field023_03;

    @Column(name = "FLD_023_04")
    private BigDecimal field023_04;

    @Column(name = "FLD_023_05")
    private Boolean field023_05;

    @Column(name = "FLD_023_06")
    private Boolean field023_06;

    @Column(name = "FLD_023_07")
    private String field023_07;

    @Column(name = "FLD_023_08")
    private Boolean field023_08;

    @Column(name = "FLD_023_09")
    private Integer field023_09;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public OnlineBankingSessionV023() {}

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

    public Boolean getField023_00() { return field023_00; }
    public void setField023_00(Boolean field023_00) { this.field023_00 = field023_00; }

    public BigDecimal getField023_01() { return field023_01; }
    public void setField023_01(BigDecimal field023_01) { this.field023_01 = field023_01; }

    public BigDecimal getField023_02() { return field023_02; }
    public void setField023_02(BigDecimal field023_02) { this.field023_02 = field023_02; }

    public Integer getField023_03() { return field023_03; }
    public void setField023_03(Integer field023_03) { this.field023_03 = field023_03; }

    public BigDecimal getField023_04() { return field023_04; }
    public void setField023_04(BigDecimal field023_04) { this.field023_04 = field023_04; }

    public Boolean getField023_05() { return field023_05; }
    public void setField023_05(Boolean field023_05) { this.field023_05 = field023_05; }

    public Boolean getField023_06() { return field023_06; }
    public void setField023_06(Boolean field023_06) { this.field023_06 = field023_06; }

    public String getField023_07() { return field023_07; }
    public void setField023_07(String field023_07) { this.field023_07 = field023_07; }

    public Boolean getField023_08() { return field023_08; }
    public void setField023_08(Boolean field023_08) { this.field023_08 = field023_08; }

    public Integer getField023_09() { return field023_09; }
    public void setField023_09(Integer field023_09) { this.field023_09 = field023_09; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OnlineBankingSessionV023)) return false;
        OnlineBankingSessionV023 that = (OnlineBankingSessionV023) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "OnlineBankingSessionV023{" +
            "id=" + id +
            ", sessionId=" + sessionId +
            ", customerId=" + customerId +
            ", ipAddress=" + ipAddress +
            ", userAgent=" + userAgent +
            ", loginTime=" + loginTime +
            '}';
    }
}
