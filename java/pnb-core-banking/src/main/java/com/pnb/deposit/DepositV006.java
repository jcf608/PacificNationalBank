package com.pnb.deposit;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * DepositV006 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "DEPOSITV006")
public class DepositV006 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "DEP_ID", unique = true)
    private String depositId;

    @Column(name = "ACCT_NUM")
    private String accountNumber;

    @Column(name = "DEP_TYPE")
    private String depositType;

    @Column(name = "AMOUNT", precision = 15, scale = 2)
    private BigDecimal amount;

    @Column(name = "TERM_MONTHS")
    private Integer term;

    @Column(name = "INT_RATE", precision = 9, scale = 6)
    private BigDecimal interestRate;

    @Column(name = "MATURITY_DATE")
    private LocalDate maturityDate;

    @Column(name = "AUTO_RENEW")
    private Boolean autoRenew;

    @Column(name = "FLD_006_00")
    private String field006_00;

    @Column(name = "FLD_006_01")
    private BigDecimal field006_01;

    @Column(name = "FLD_006_02")
    private LocalDate field006_02;

    @Column(name = "FLD_006_03")
    private String field006_03;

    @Column(name = "FLD_006_04")
    private Boolean field006_04;

    @Column(name = "FLD_006_05")
    private BigDecimal field006_05;

    @Column(name = "FLD_006_06")
    private Boolean field006_06;

    @Column(name = "FLD_006_07")
    private Boolean field006_07;

    @Column(name = "FLD_006_08")
    private String field006_08;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public DepositV006() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getDepositId() { return depositId; }
    public void setDepositId(String depositId) { this.depositId = depositId; }

    public String getAccountNumber() { return accountNumber; }
    public void setAccountNumber(String accountNumber) { this.accountNumber = accountNumber; }

    public String getDepositType() { return depositType; }
    public void setDepositType(String depositType) { this.depositType = depositType; }

    public BigDecimal getAmount() { return amount; }
    public void setAmount(BigDecimal amount) { this.amount = amount; }

    public Integer getTerm() { return term; }
    public void setTerm(Integer term) { this.term = term; }

    public BigDecimal getInterestRate() { return interestRate; }
    public void setInterestRate(BigDecimal interestRate) { this.interestRate = interestRate; }

    public LocalDate getMaturityDate() { return maturityDate; }
    public void setMaturityDate(LocalDate maturityDate) { this.maturityDate = maturityDate; }

    public Boolean getAutoRenew() { return autoRenew; }
    public void setAutoRenew(Boolean autoRenew) { this.autoRenew = autoRenew; }

    public String getField006_00() { return field006_00; }
    public void setField006_00(String field006_00) { this.field006_00 = field006_00; }

    public BigDecimal getField006_01() { return field006_01; }
    public void setField006_01(BigDecimal field006_01) { this.field006_01 = field006_01; }

    public LocalDate getField006_02() { return field006_02; }
    public void setField006_02(LocalDate field006_02) { this.field006_02 = field006_02; }

    public String getField006_03() { return field006_03; }
    public void setField006_03(String field006_03) { this.field006_03 = field006_03; }

    public Boolean getField006_04() { return field006_04; }
    public void setField006_04(Boolean field006_04) { this.field006_04 = field006_04; }

    public BigDecimal getField006_05() { return field006_05; }
    public void setField006_05(BigDecimal field006_05) { this.field006_05 = field006_05; }

    public Boolean getField006_06() { return field006_06; }
    public void setField006_06(Boolean field006_06) { this.field006_06 = field006_06; }

    public Boolean getField006_07() { return field006_07; }
    public void setField006_07(Boolean field006_07) { this.field006_07 = field006_07; }

    public String getField006_08() { return field006_08; }
    public void setField006_08(String field006_08) { this.field006_08 = field006_08; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DepositV006)) return false;
        DepositV006 that = (DepositV006) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "DepositV006{" +
            "id=" + id +
            ", depositId=" + depositId +
            ", accountNumber=" + accountNumber +
            ", depositType=" + depositType +
            ", amount=" + amount +
            ", term=" + term +
            '}';
    }
}
