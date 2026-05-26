package com.pnb.deposit;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * DepositV016 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "DEPOSITV016")
public class DepositV016 {

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

    @Column(name = "FLD_016_00")
    private LocalDate field016_00;

    @Column(name = "FLD_016_01")
    private Integer field016_01;

    @Column(name = "FLD_016_02")
    private String field016_02;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public DepositV016() {}

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

    public LocalDate getField016_00() { return field016_00; }
    public void setField016_00(LocalDate field016_00) { this.field016_00 = field016_00; }

    public Integer getField016_01() { return field016_01; }
    public void setField016_01(Integer field016_01) { this.field016_01 = field016_01; }

    public String getField016_02() { return field016_02; }
    public void setField016_02(String field016_02) { this.field016_02 = field016_02; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DepositV016)) return false;
        DepositV016 that = (DepositV016) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "DepositV016{" +
            "id=" + id +
            ", depositId=" + depositId +
            ", accountNumber=" + accountNumber +
            ", depositType=" + depositType +
            ", amount=" + amount +
            ", term=" + term +
            '}';
    }
}
