package com.pnb.channel.online;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * OnlineBankingSessionV006 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "ONLINEBANKINGSESSIONV006")
public class OnlineBankingSessionV006 {

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

    @Column(name = "FLD_006_00")
    private BigDecimal field006_00;

    @Column(name = "FLD_006_01")
    private Integer field006_01;

    @Column(name = "FLD_006_02")
    private String field006_02;

    @Column(name = "FLD_006_03")
    private String field006_03;

    @Column(name = "FLD_006_04")
    private LocalDate field006_04;

    @Column(name = "FLD_006_05")
    private String field006_05;

    @Column(name = "FLD_006_06")
    private Integer field006_06;

    @Column(name = "FLD_006_07")
    private Integer field006_07;

    @Column(name = "FLD_006_08")
    private Boolean field006_08;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public OnlineBankingSessionV006() {}

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

    public BigDecimal getField006_00() { return field006_00; }
    public void setField006_00(BigDecimal field006_00) { this.field006_00 = field006_00; }

    public Integer getField006_01() { return field006_01; }
    public void setField006_01(Integer field006_01) { this.field006_01 = field006_01; }

    public String getField006_02() { return field006_02; }
    public void setField006_02(String field006_02) { this.field006_02 = field006_02; }

    public String getField006_03() { return field006_03; }
    public void setField006_03(String field006_03) { this.field006_03 = field006_03; }

    public LocalDate getField006_04() { return field006_04; }
    public void setField006_04(LocalDate field006_04) { this.field006_04 = field006_04; }

    public String getField006_05() { return field006_05; }
    public void setField006_05(String field006_05) { this.field006_05 = field006_05; }

    public Integer getField006_06() { return field006_06; }
    public void setField006_06(Integer field006_06) { this.field006_06 = field006_06; }

    public Integer getField006_07() { return field006_07; }
    public void setField006_07(Integer field006_07) { this.field006_07 = field006_07; }

    public Boolean getField006_08() { return field006_08; }
    public void setField006_08(Boolean field006_08) { this.field006_08 = field006_08; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OnlineBankingSessionV006)) return false;
        OnlineBankingSessionV006 that = (OnlineBankingSessionV006) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "OnlineBankingSessionV006{" +
            "id=" + id +
            ", sessionId=" + sessionId +
            ", customerId=" + customerId +
            ", ipAddress=" + ipAddress +
            ", userAgent=" + userAgent +
            ", loginTime=" + loginTime +
            '}';
    }
}
