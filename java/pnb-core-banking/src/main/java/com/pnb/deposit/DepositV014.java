package com.pnb.deposit;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * DepositV014 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "DEPOSITV014")
public class DepositV014 {

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

    @Column(name = "FLD_014_00")
    private String field014_00;

    @Column(name = "FLD_014_01")
    private BigDecimal field014_01;

    @Column(name = "FLD_014_02")
    private Integer field014_02;

    @Column(name = "FLD_014_03")
    private String field014_03;

    @Column(name = "FLD_014_04")
    private String field014_04;

    @Column(name = "FLD_014_05")
    private Boolean field014_05;

    @Column(name = "FLD_014_06")
    private BigDecimal field014_06;

    @Column(name = "FLD_014_07")
    private Integer field014_07;

    @Column(name = "FLD_014_08")
    private Integer field014_08;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public DepositV014() {}

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

    public String getField014_00() { return field014_00; }
    public void setField014_00(String field014_00) { this.field014_00 = field014_00; }

    public BigDecimal getField014_01() { return field014_01; }
    public void setField014_01(BigDecimal field014_01) { this.field014_01 = field014_01; }

    public Integer getField014_02() { return field014_02; }
    public void setField014_02(Integer field014_02) { this.field014_02 = field014_02; }

    public String getField014_03() { return field014_03; }
    public void setField014_03(String field014_03) { this.field014_03 = field014_03; }

    public String getField014_04() { return field014_04; }
    public void setField014_04(String field014_04) { this.field014_04 = field014_04; }

    public Boolean getField014_05() { return field014_05; }
    public void setField014_05(Boolean field014_05) { this.field014_05 = field014_05; }

    public BigDecimal getField014_06() { return field014_06; }
    public void setField014_06(BigDecimal field014_06) { this.field014_06 = field014_06; }

    public Integer getField014_07() { return field014_07; }
    public void setField014_07(Integer field014_07) { this.field014_07 = field014_07; }

    public Integer getField014_08() { return field014_08; }
    public void setField014_08(Integer field014_08) { this.field014_08 = field014_08; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DepositV014)) return false;
        DepositV014 that = (DepositV014) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "DepositV014{" +
            "id=" + id +
            ", depositId=" + depositId +
            ", accountNumber=" + accountNumber +
            ", depositType=" + depositType +
            ", amount=" + amount +
            ", term=" + term +
            '}';
    }
}
