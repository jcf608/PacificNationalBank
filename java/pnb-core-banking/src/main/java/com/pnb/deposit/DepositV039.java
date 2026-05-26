package com.pnb.deposit;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * DepositV039 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "DEPOSITV039")
public class DepositV039 {

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

    @Column(name = "FLD_039_00")
    private BigDecimal field039_00;

    @Column(name = "FLD_039_01")
    private BigDecimal field039_01;

    @Column(name = "FLD_039_02")
    private String field039_02;

    @Column(name = "FLD_039_03")
    private String field039_03;

    @Column(name = "FLD_039_04")
    private BigDecimal field039_04;

    @Column(name = "FLD_039_05")
    private LocalDate field039_05;

    @Column(name = "FLD_039_06")
    private Boolean field039_06;

    @Column(name = "FLD_039_07")
    private String field039_07;

    @Column(name = "FLD_039_08")
    private LocalDate field039_08;

    @Column(name = "FLD_039_09")
    private LocalDate field039_09;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public DepositV039() {}

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

    public BigDecimal getField039_00() { return field039_00; }
    public void setField039_00(BigDecimal field039_00) { this.field039_00 = field039_00; }

    public BigDecimal getField039_01() { return field039_01; }
    public void setField039_01(BigDecimal field039_01) { this.field039_01 = field039_01; }

    public String getField039_02() { return field039_02; }
    public void setField039_02(String field039_02) { this.field039_02 = field039_02; }

    public String getField039_03() { return field039_03; }
    public void setField039_03(String field039_03) { this.field039_03 = field039_03; }

    public BigDecimal getField039_04() { return field039_04; }
    public void setField039_04(BigDecimal field039_04) { this.field039_04 = field039_04; }

    public LocalDate getField039_05() { return field039_05; }
    public void setField039_05(LocalDate field039_05) { this.field039_05 = field039_05; }

    public Boolean getField039_06() { return field039_06; }
    public void setField039_06(Boolean field039_06) { this.field039_06 = field039_06; }

    public String getField039_07() { return field039_07; }
    public void setField039_07(String field039_07) { this.field039_07 = field039_07; }

    public LocalDate getField039_08() { return field039_08; }
    public void setField039_08(LocalDate field039_08) { this.field039_08 = field039_08; }

    public LocalDate getField039_09() { return field039_09; }
    public void setField039_09(LocalDate field039_09) { this.field039_09 = field039_09; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DepositV039)) return false;
        DepositV039 that = (DepositV039) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "DepositV039{" +
            "id=" + id +
            ", depositId=" + depositId +
            ", accountNumber=" + accountNumber +
            ", depositType=" + depositType +
            ", amount=" + amount +
            ", term=" + term +
            '}';
    }
}
