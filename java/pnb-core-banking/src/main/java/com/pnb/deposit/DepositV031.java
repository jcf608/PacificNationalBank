package com.pnb.deposit;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * DepositV031 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "DEPOSITV031")
public class DepositV031 {

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

    @Column(name = "FLD_031_00")
    private Boolean field031_00;

    @Column(name = "FLD_031_01")
    private Boolean field031_01;

    @Column(name = "FLD_031_02")
    private BigDecimal field031_02;

    @Column(name = "FLD_031_03")
    private Integer field031_03;

    @Column(name = "FLD_031_04")
    private LocalDate field031_04;

    @Column(name = "FLD_031_05")
    private String field031_05;

    @Column(name = "FLD_031_06")
    private Integer field031_06;

    @Column(name = "FLD_031_07")
    private Boolean field031_07;

    @Column(name = "FLD_031_08")
    private Integer field031_08;

    @Column(name = "FLD_031_09")
    private String field031_09;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public DepositV031() {}

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

    public Boolean getField031_00() { return field031_00; }
    public void setField031_00(Boolean field031_00) { this.field031_00 = field031_00; }

    public Boolean getField031_01() { return field031_01; }
    public void setField031_01(Boolean field031_01) { this.field031_01 = field031_01; }

    public BigDecimal getField031_02() { return field031_02; }
    public void setField031_02(BigDecimal field031_02) { this.field031_02 = field031_02; }

    public Integer getField031_03() { return field031_03; }
    public void setField031_03(Integer field031_03) { this.field031_03 = field031_03; }

    public LocalDate getField031_04() { return field031_04; }
    public void setField031_04(LocalDate field031_04) { this.field031_04 = field031_04; }

    public String getField031_05() { return field031_05; }
    public void setField031_05(String field031_05) { this.field031_05 = field031_05; }

    public Integer getField031_06() { return field031_06; }
    public void setField031_06(Integer field031_06) { this.field031_06 = field031_06; }

    public Boolean getField031_07() { return field031_07; }
    public void setField031_07(Boolean field031_07) { this.field031_07 = field031_07; }

    public Integer getField031_08() { return field031_08; }
    public void setField031_08(Integer field031_08) { this.field031_08 = field031_08; }

    public String getField031_09() { return field031_09; }
    public void setField031_09(String field031_09) { this.field031_09 = field031_09; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DepositV031)) return false;
        DepositV031 that = (DepositV031) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "DepositV031{" +
            "id=" + id +
            ", depositId=" + depositId +
            ", accountNumber=" + accountNumber +
            ", depositType=" + depositType +
            ", amount=" + amount +
            ", term=" + term +
            '}';
    }
}
