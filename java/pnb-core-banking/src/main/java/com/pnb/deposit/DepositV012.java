package com.pnb.deposit;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * DepositV012 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "DEPOSITV012")
public class DepositV012 {

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

    @Column(name = "FLD_012_00")
    private BigDecimal field012_00;

    @Column(name = "FLD_012_01")
    private Integer field012_01;

    @Column(name = "FLD_012_02")
    private String field012_02;

    @Column(name = "FLD_012_03")
    private BigDecimal field012_03;

    @Column(name = "FLD_012_04")
    private Integer field012_04;

    @Column(name = "FLD_012_05")
    private Integer field012_05;

    @Column(name = "FLD_012_06")
    private BigDecimal field012_06;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public DepositV012() {}

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

    public BigDecimal getField012_00() { return field012_00; }
    public void setField012_00(BigDecimal field012_00) { this.field012_00 = field012_00; }

    public Integer getField012_01() { return field012_01; }
    public void setField012_01(Integer field012_01) { this.field012_01 = field012_01; }

    public String getField012_02() { return field012_02; }
    public void setField012_02(String field012_02) { this.field012_02 = field012_02; }

    public BigDecimal getField012_03() { return field012_03; }
    public void setField012_03(BigDecimal field012_03) { this.field012_03 = field012_03; }

    public Integer getField012_04() { return field012_04; }
    public void setField012_04(Integer field012_04) { this.field012_04 = field012_04; }

    public Integer getField012_05() { return field012_05; }
    public void setField012_05(Integer field012_05) { this.field012_05 = field012_05; }

    public BigDecimal getField012_06() { return field012_06; }
    public void setField012_06(BigDecimal field012_06) { this.field012_06 = field012_06; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DepositV012)) return false;
        DepositV012 that = (DepositV012) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "DepositV012{" +
            "id=" + id +
            ", depositId=" + depositId +
            ", accountNumber=" + accountNumber +
            ", depositType=" + depositType +
            ", amount=" + amount +
            ", term=" + term +
            '}';
    }
}
