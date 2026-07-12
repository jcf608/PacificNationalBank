package com.pnb.deposit;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * DepositV029 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "DEPOSITV029")
public class DepositV029 {

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

    @Column(name = "FLD_029_00")
    private Integer field029_00;

    @Column(name = "FLD_029_01")
    private Integer field029_01;

    @Column(name = "FLD_029_02")
    private Boolean field029_02;

    @Column(name = "FLD_029_03")
    private LocalDate field029_03;

    @Column(name = "FLD_029_04")
    private BigDecimal field029_04;

    @Column(name = "FLD_029_05")
    private LocalDate field029_05;

    @Column(name = "FLD_029_06")
    private Integer field029_06;

    @Column(name = "FLD_029_07")
    private BigDecimal field029_07;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public DepositV029() {}

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

    public Integer getField029_00() { return field029_00; }
    public void setField029_00(Integer field029_00) { this.field029_00 = field029_00; }

    public Integer getField029_01() { return field029_01; }
    public void setField029_01(Integer field029_01) { this.field029_01 = field029_01; }

    public Boolean getField029_02() { return field029_02; }
    public void setField029_02(Boolean field029_02) { this.field029_02 = field029_02; }

    public LocalDate getField029_03() { return field029_03; }
    public void setField029_03(LocalDate field029_03) { this.field029_03 = field029_03; }

    public BigDecimal getField029_04() { return field029_04; }
    public void setField029_04(BigDecimal field029_04) { this.field029_04 = field029_04; }

    public LocalDate getField029_05() { return field029_05; }
    public void setField029_05(LocalDate field029_05) { this.field029_05 = field029_05; }

    public Integer getField029_06() { return field029_06; }
    public void setField029_06(Integer field029_06) { this.field029_06 = field029_06; }

    public BigDecimal getField029_07() { return field029_07; }
    public void setField029_07(BigDecimal field029_07) { this.field029_07 = field029_07; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DepositV029)) return false;
        DepositV029 that = (DepositV029) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "DepositV029{" +
            "id=" + id +
            ", depositId=" + depositId +
            ", accountNumber=" + accountNumber +
            ", depositType=" + depositType +
            ", amount=" + amount +
            ", term=" + term +
            '}';
    }
}
