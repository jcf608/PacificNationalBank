package com.pnb.deposit;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * DepositV013 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "DEPOSITV013")
public class DepositV013 {

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

    @Column(name = "FLD_013_00")
    private Boolean field013_00;

    @Column(name = "FLD_013_01")
    private String field013_01;

    @Column(name = "FLD_013_02")
    private LocalDate field013_02;

    @Column(name = "FLD_013_03")
    private Integer field013_03;

    @Column(name = "FLD_013_04")
    private Integer field013_04;

    @Column(name = "FLD_013_05")
    private Integer field013_05;

    @Column(name = "FLD_013_06")
    private Integer field013_06;

    @Column(name = "FLD_013_07")
    private Integer field013_07;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public DepositV013() {}

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

    public Boolean getField013_00() { return field013_00; }
    public void setField013_00(Boolean field013_00) { this.field013_00 = field013_00; }

    public String getField013_01() { return field013_01; }
    public void setField013_01(String field013_01) { this.field013_01 = field013_01; }

    public LocalDate getField013_02() { return field013_02; }
    public void setField013_02(LocalDate field013_02) { this.field013_02 = field013_02; }

    public Integer getField013_03() { return field013_03; }
    public void setField013_03(Integer field013_03) { this.field013_03 = field013_03; }

    public Integer getField013_04() { return field013_04; }
    public void setField013_04(Integer field013_04) { this.field013_04 = field013_04; }

    public Integer getField013_05() { return field013_05; }
    public void setField013_05(Integer field013_05) { this.field013_05 = field013_05; }

    public Integer getField013_06() { return field013_06; }
    public void setField013_06(Integer field013_06) { this.field013_06 = field013_06; }

    public Integer getField013_07() { return field013_07; }
    public void setField013_07(Integer field013_07) { this.field013_07 = field013_07; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DepositV013)) return false;
        DepositV013 that = (DepositV013) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "DepositV013{" +
            "id=" + id +
            ", depositId=" + depositId +
            ", accountNumber=" + accountNumber +
            ", depositType=" + depositType +
            ", amount=" + amount +
            ", term=" + term +
            '}';
    }
}
