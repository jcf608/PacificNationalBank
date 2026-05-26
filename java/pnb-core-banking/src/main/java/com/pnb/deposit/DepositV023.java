package com.pnb.deposit;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * DepositV023 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "DEPOSITV023")
public class DepositV023 {

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

    @Column(name = "FLD_023_00")
    private BigDecimal field023_00;

    @Column(name = "FLD_023_01")
    private Integer field023_01;

    @Column(name = "FLD_023_02")
    private LocalDate field023_02;

    @Column(name = "FLD_023_03")
    private BigDecimal field023_03;

    @Column(name = "FLD_023_04")
    private Integer field023_04;

    @Column(name = "FLD_023_05")
    private BigDecimal field023_05;

    @Column(name = "FLD_023_06")
    private String field023_06;

    @Column(name = "FLD_023_07")
    private LocalDate field023_07;

    @Column(name = "FLD_023_08")
    private String field023_08;

    @Column(name = "FLD_023_09")
    private LocalDate field023_09;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public DepositV023() {}

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

    public BigDecimal getField023_00() { return field023_00; }
    public void setField023_00(BigDecimal field023_00) { this.field023_00 = field023_00; }

    public Integer getField023_01() { return field023_01; }
    public void setField023_01(Integer field023_01) { this.field023_01 = field023_01; }

    public LocalDate getField023_02() { return field023_02; }
    public void setField023_02(LocalDate field023_02) { this.field023_02 = field023_02; }

    public BigDecimal getField023_03() { return field023_03; }
    public void setField023_03(BigDecimal field023_03) { this.field023_03 = field023_03; }

    public Integer getField023_04() { return field023_04; }
    public void setField023_04(Integer field023_04) { this.field023_04 = field023_04; }

    public BigDecimal getField023_05() { return field023_05; }
    public void setField023_05(BigDecimal field023_05) { this.field023_05 = field023_05; }

    public String getField023_06() { return field023_06; }
    public void setField023_06(String field023_06) { this.field023_06 = field023_06; }

    public LocalDate getField023_07() { return field023_07; }
    public void setField023_07(LocalDate field023_07) { this.field023_07 = field023_07; }

    public String getField023_08() { return field023_08; }
    public void setField023_08(String field023_08) { this.field023_08 = field023_08; }

    public LocalDate getField023_09() { return field023_09; }
    public void setField023_09(LocalDate field023_09) { this.field023_09 = field023_09; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DepositV023)) return false;
        DepositV023 that = (DepositV023) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "DepositV023{" +
            "id=" + id +
            ", depositId=" + depositId +
            ", accountNumber=" + accountNumber +
            ", depositType=" + depositType +
            ", amount=" + amount +
            ", term=" + term +
            '}';
    }
}
