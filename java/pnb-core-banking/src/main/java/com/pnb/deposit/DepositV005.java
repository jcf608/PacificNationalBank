package com.pnb.deposit;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * DepositV005 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "DEPOSITV005")
public class DepositV005 {

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

    @Column(name = "FLD_005_00")
    private Boolean field005_00;

    @Column(name = "FLD_005_01")
    private BigDecimal field005_01;

    @Column(name = "FLD_005_02")
    private String field005_02;

    @Column(name = "FLD_005_03")
    private Boolean field005_03;

    @Column(name = "FLD_005_04")
    private String field005_04;

    @Column(name = "FLD_005_05")
    private BigDecimal field005_05;

    @Column(name = "FLD_005_06")
    private String field005_06;

    @Column(name = "FLD_005_07")
    private Boolean field005_07;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public DepositV005() {}

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

    public Boolean getField005_00() { return field005_00; }
    public void setField005_00(Boolean field005_00) { this.field005_00 = field005_00; }

    public BigDecimal getField005_01() { return field005_01; }
    public void setField005_01(BigDecimal field005_01) { this.field005_01 = field005_01; }

    public String getField005_02() { return field005_02; }
    public void setField005_02(String field005_02) { this.field005_02 = field005_02; }

    public Boolean getField005_03() { return field005_03; }
    public void setField005_03(Boolean field005_03) { this.field005_03 = field005_03; }

    public String getField005_04() { return field005_04; }
    public void setField005_04(String field005_04) { this.field005_04 = field005_04; }

    public BigDecimal getField005_05() { return field005_05; }
    public void setField005_05(BigDecimal field005_05) { this.field005_05 = field005_05; }

    public String getField005_06() { return field005_06; }
    public void setField005_06(String field005_06) { this.field005_06 = field005_06; }

    public Boolean getField005_07() { return field005_07; }
    public void setField005_07(Boolean field005_07) { this.field005_07 = field005_07; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DepositV005)) return false;
        DepositV005 that = (DepositV005) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "DepositV005{" +
            "id=" + id +
            ", depositId=" + depositId +
            ", accountNumber=" + accountNumber +
            ", depositType=" + depositType +
            ", amount=" + amount +
            ", term=" + term +
            '}';
    }
}
