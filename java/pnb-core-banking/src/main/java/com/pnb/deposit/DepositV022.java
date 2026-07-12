package com.pnb.deposit;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * DepositV022 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "DEPOSITV022")
public class DepositV022 {

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

    @Column(name = "FLD_022_00")
    private Integer field022_00;

    @Column(name = "FLD_022_01")
    private String field022_01;

    @Column(name = "FLD_022_02")
    private String field022_02;

    @Column(name = "FLD_022_03")
    private BigDecimal field022_03;

    @Column(name = "FLD_022_04")
    private Integer field022_04;

    @Column(name = "FLD_022_05")
    private String field022_05;

    @Column(name = "FLD_022_06")
    private LocalDate field022_06;

    @Column(name = "FLD_022_07")
    private LocalDate field022_07;

    @Column(name = "FLD_022_08")
    private LocalDate field022_08;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public DepositV022() {}

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

    public Integer getField022_00() { return field022_00; }
    public void setField022_00(Integer field022_00) { this.field022_00 = field022_00; }

    public String getField022_01() { return field022_01; }
    public void setField022_01(String field022_01) { this.field022_01 = field022_01; }

    public String getField022_02() { return field022_02; }
    public void setField022_02(String field022_02) { this.field022_02 = field022_02; }

    public BigDecimal getField022_03() { return field022_03; }
    public void setField022_03(BigDecimal field022_03) { this.field022_03 = field022_03; }

    public Integer getField022_04() { return field022_04; }
    public void setField022_04(Integer field022_04) { this.field022_04 = field022_04; }

    public String getField022_05() { return field022_05; }
    public void setField022_05(String field022_05) { this.field022_05 = field022_05; }

    public LocalDate getField022_06() { return field022_06; }
    public void setField022_06(LocalDate field022_06) { this.field022_06 = field022_06; }

    public LocalDate getField022_07() { return field022_07; }
    public void setField022_07(LocalDate field022_07) { this.field022_07 = field022_07; }

    public LocalDate getField022_08() { return field022_08; }
    public void setField022_08(LocalDate field022_08) { this.field022_08 = field022_08; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DepositV022)) return false;
        DepositV022 that = (DepositV022) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "DepositV022{" +
            "id=" + id +
            ", depositId=" + depositId +
            ", accountNumber=" + accountNumber +
            ", depositType=" + depositType +
            ", amount=" + amount +
            ", term=" + term +
            '}';
    }
}
