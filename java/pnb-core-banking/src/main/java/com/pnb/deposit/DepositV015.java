package com.pnb.deposit;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * DepositV015 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "DEPOSITV015")
public class DepositV015 {

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

    @Column(name = "FLD_015_00")
    private Boolean field015_00;

    @Column(name = "FLD_015_01")
    private BigDecimal field015_01;

    @Column(name = "FLD_015_02")
    private Integer field015_02;

    @Column(name = "FLD_015_03")
    private BigDecimal field015_03;

    @Column(name = "FLD_015_04")
    private Integer field015_04;

    @Column(name = "FLD_015_05")
    private Boolean field015_05;

    @Column(name = "FLD_015_06")
    private LocalDate field015_06;

    @Column(name = "FLD_015_07")
    private Integer field015_07;

    @Column(name = "FLD_015_08")
    private String field015_08;

    @Column(name = "FLD_015_09")
    private String field015_09;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public DepositV015() {}

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

    public Boolean getField015_00() { return field015_00; }
    public void setField015_00(Boolean field015_00) { this.field015_00 = field015_00; }

    public BigDecimal getField015_01() { return field015_01; }
    public void setField015_01(BigDecimal field015_01) { this.field015_01 = field015_01; }

    public Integer getField015_02() { return field015_02; }
    public void setField015_02(Integer field015_02) { this.field015_02 = field015_02; }

    public BigDecimal getField015_03() { return field015_03; }
    public void setField015_03(BigDecimal field015_03) { this.field015_03 = field015_03; }

    public Integer getField015_04() { return field015_04; }
    public void setField015_04(Integer field015_04) { this.field015_04 = field015_04; }

    public Boolean getField015_05() { return field015_05; }
    public void setField015_05(Boolean field015_05) { this.field015_05 = field015_05; }

    public LocalDate getField015_06() { return field015_06; }
    public void setField015_06(LocalDate field015_06) { this.field015_06 = field015_06; }

    public Integer getField015_07() { return field015_07; }
    public void setField015_07(Integer field015_07) { this.field015_07 = field015_07; }

    public String getField015_08() { return field015_08; }
    public void setField015_08(String field015_08) { this.field015_08 = field015_08; }

    public String getField015_09() { return field015_09; }
    public void setField015_09(String field015_09) { this.field015_09 = field015_09; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DepositV015)) return false;
        DepositV015 that = (DepositV015) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "DepositV015{" +
            "id=" + id +
            ", depositId=" + depositId +
            ", accountNumber=" + accountNumber +
            ", depositType=" + depositType +
            ", amount=" + amount +
            ", term=" + term +
            '}';
    }
}
