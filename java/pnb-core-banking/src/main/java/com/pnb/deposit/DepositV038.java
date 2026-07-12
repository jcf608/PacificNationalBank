package com.pnb.deposit;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * DepositV038 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "DEPOSITV038")
public class DepositV038 {

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

    @Column(name = "FLD_038_00")
    private BigDecimal field038_00;

    @Column(name = "FLD_038_01")
    private Boolean field038_01;

    @Column(name = "FLD_038_02")
    private String field038_02;

    @Column(name = "FLD_038_03")
    private LocalDate field038_03;

    @Column(name = "FLD_038_04")
    private LocalDate field038_04;

    @Column(name = "FLD_038_05")
    private String field038_05;

    @Column(name = "FLD_038_06")
    private String field038_06;

    @Column(name = "FLD_038_07")
    private Boolean field038_07;

    @Column(name = "FLD_038_08")
    private String field038_08;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public DepositV038() {}

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

    public BigDecimal getField038_00() { return field038_00; }
    public void setField038_00(BigDecimal field038_00) { this.field038_00 = field038_00; }

    public Boolean getField038_01() { return field038_01; }
    public void setField038_01(Boolean field038_01) { this.field038_01 = field038_01; }

    public String getField038_02() { return field038_02; }
    public void setField038_02(String field038_02) { this.field038_02 = field038_02; }

    public LocalDate getField038_03() { return field038_03; }
    public void setField038_03(LocalDate field038_03) { this.field038_03 = field038_03; }

    public LocalDate getField038_04() { return field038_04; }
    public void setField038_04(LocalDate field038_04) { this.field038_04 = field038_04; }

    public String getField038_05() { return field038_05; }
    public void setField038_05(String field038_05) { this.field038_05 = field038_05; }

    public String getField038_06() { return field038_06; }
    public void setField038_06(String field038_06) { this.field038_06 = field038_06; }

    public Boolean getField038_07() { return field038_07; }
    public void setField038_07(Boolean field038_07) { this.field038_07 = field038_07; }

    public String getField038_08() { return field038_08; }
    public void setField038_08(String field038_08) { this.field038_08 = field038_08; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DepositV038)) return false;
        DepositV038 that = (DepositV038) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "DepositV038{" +
            "id=" + id +
            ", depositId=" + depositId +
            ", accountNumber=" + accountNumber +
            ", depositType=" + depositType +
            ", amount=" + amount +
            ", term=" + term +
            '}';
    }
}
