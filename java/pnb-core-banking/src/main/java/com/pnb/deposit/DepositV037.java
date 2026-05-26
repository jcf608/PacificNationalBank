package com.pnb.deposit;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * DepositV037 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "DEPOSITV037")
public class DepositV037 {

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

    @Column(name = "FLD_037_00")
    private Integer field037_00;

    @Column(name = "FLD_037_01")
    private LocalDate field037_01;

    @Column(name = "FLD_037_02")
    private LocalDate field037_02;

    @Column(name = "FLD_037_03")
    private LocalDate field037_03;

    @Column(name = "FLD_037_04")
    private BigDecimal field037_04;

    @Column(name = "FLD_037_05")
    private Boolean field037_05;

    @Column(name = "FLD_037_06")
    private LocalDate field037_06;

    @Column(name = "FLD_037_07")
    private BigDecimal field037_07;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public DepositV037() {}

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

    public Integer getField037_00() { return field037_00; }
    public void setField037_00(Integer field037_00) { this.field037_00 = field037_00; }

    public LocalDate getField037_01() { return field037_01; }
    public void setField037_01(LocalDate field037_01) { this.field037_01 = field037_01; }

    public LocalDate getField037_02() { return field037_02; }
    public void setField037_02(LocalDate field037_02) { this.field037_02 = field037_02; }

    public LocalDate getField037_03() { return field037_03; }
    public void setField037_03(LocalDate field037_03) { this.field037_03 = field037_03; }

    public BigDecimal getField037_04() { return field037_04; }
    public void setField037_04(BigDecimal field037_04) { this.field037_04 = field037_04; }

    public Boolean getField037_05() { return field037_05; }
    public void setField037_05(Boolean field037_05) { this.field037_05 = field037_05; }

    public LocalDate getField037_06() { return field037_06; }
    public void setField037_06(LocalDate field037_06) { this.field037_06 = field037_06; }

    public BigDecimal getField037_07() { return field037_07; }
    public void setField037_07(BigDecimal field037_07) { this.field037_07 = field037_07; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DepositV037)) return false;
        DepositV037 that = (DepositV037) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "DepositV037{" +
            "id=" + id +
            ", depositId=" + depositId +
            ", accountNumber=" + accountNumber +
            ", depositType=" + depositType +
            ", amount=" + amount +
            ", term=" + term +
            '}';
    }
}
