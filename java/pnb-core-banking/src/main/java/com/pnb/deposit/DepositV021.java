package com.pnb.deposit;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * DepositV021 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "DEPOSITV021")
public class DepositV021 {

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

    @Column(name = "FLD_021_00")
    private BigDecimal field021_00;

    @Column(name = "FLD_021_01")
    private String field021_01;

    @Column(name = "FLD_021_02")
    private Boolean field021_02;

    @Column(name = "FLD_021_03")
    private Boolean field021_03;

    @Column(name = "FLD_021_04")
    private Integer field021_04;

    @Column(name = "FLD_021_05")
    private Boolean field021_05;

    @Column(name = "FLD_021_06")
    private LocalDate field021_06;

    @Column(name = "FLD_021_07")
    private Integer field021_07;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public DepositV021() {}

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

    public BigDecimal getField021_00() { return field021_00; }
    public void setField021_00(BigDecimal field021_00) { this.field021_00 = field021_00; }

    public String getField021_01() { return field021_01; }
    public void setField021_01(String field021_01) { this.field021_01 = field021_01; }

    public Boolean getField021_02() { return field021_02; }
    public void setField021_02(Boolean field021_02) { this.field021_02 = field021_02; }

    public Boolean getField021_03() { return field021_03; }
    public void setField021_03(Boolean field021_03) { this.field021_03 = field021_03; }

    public Integer getField021_04() { return field021_04; }
    public void setField021_04(Integer field021_04) { this.field021_04 = field021_04; }

    public Boolean getField021_05() { return field021_05; }
    public void setField021_05(Boolean field021_05) { this.field021_05 = field021_05; }

    public LocalDate getField021_06() { return field021_06; }
    public void setField021_06(LocalDate field021_06) { this.field021_06 = field021_06; }

    public Integer getField021_07() { return field021_07; }
    public void setField021_07(Integer field021_07) { this.field021_07 = field021_07; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DepositV021)) return false;
        DepositV021 that = (DepositV021) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "DepositV021{" +
            "id=" + id +
            ", depositId=" + depositId +
            ", accountNumber=" + accountNumber +
            ", depositType=" + depositType +
            ", amount=" + amount +
            ", term=" + term +
            '}';
    }
}
