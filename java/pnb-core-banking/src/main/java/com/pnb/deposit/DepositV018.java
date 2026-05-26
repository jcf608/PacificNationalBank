package com.pnb.deposit;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * DepositV018 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "DEPOSITV018")
public class DepositV018 {

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

    @Column(name = "FLD_018_00")
    private BigDecimal field018_00;

    @Column(name = "FLD_018_01")
    private LocalDate field018_01;

    @Column(name = "FLD_018_02")
    private Boolean field018_02;

    @Column(name = "FLD_018_03")
    private LocalDate field018_03;

    @Column(name = "FLD_018_04")
    private Boolean field018_04;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public DepositV018() {}

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

    public BigDecimal getField018_00() { return field018_00; }
    public void setField018_00(BigDecimal field018_00) { this.field018_00 = field018_00; }

    public LocalDate getField018_01() { return field018_01; }
    public void setField018_01(LocalDate field018_01) { this.field018_01 = field018_01; }

    public Boolean getField018_02() { return field018_02; }
    public void setField018_02(Boolean field018_02) { this.field018_02 = field018_02; }

    public LocalDate getField018_03() { return field018_03; }
    public void setField018_03(LocalDate field018_03) { this.field018_03 = field018_03; }

    public Boolean getField018_04() { return field018_04; }
    public void setField018_04(Boolean field018_04) { this.field018_04 = field018_04; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DepositV018)) return false;
        DepositV018 that = (DepositV018) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "DepositV018{" +
            "id=" + id +
            ", depositId=" + depositId +
            ", accountNumber=" + accountNumber +
            ", depositType=" + depositType +
            ", amount=" + amount +
            ", term=" + term +
            '}';
    }
}
