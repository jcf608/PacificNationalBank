package com.pnb.customer;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * CustomerV012 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "CUSTOMERV012")
public class CustomerV012 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "CUST_ID", unique = true)
    private String customerId;

    @Column(name = "FIRST_NAME")
    @NotBlank
    private String firstName;

    @Column(name = "LAST_NAME")
    @NotBlank
    private String lastName;

    @Column(name = "DOB")
    private LocalDate dateOfBirth;

    @Column(name = "SSN")
    private String ssn;

    @Column(name = "EMAIL")
    @Email
    private String email;

    @Column(name = "PHONE")
    private String phone;

    @Column(name = "ADDR_LINE1")
    private String addressLine1;

    @Column(name = "CITY")
    private String city;

    @Column(name = "STATE")
    private String state;

    @Column(name = "ZIP")
    private String zipCode;

    @Column(name = "KYC_STATUS")
    private String kycStatus;

    @Column(name = "RISK_RATING")
    private Integer riskRating;

    @Column(name = "FLD_012_00")
    private BigDecimal field012_00;

    @Column(name = "FLD_012_01")
    private Integer field012_01;

    @Column(name = "FLD_012_02")
    private String field012_02;

    @Column(name = "FLD_012_03")
    private BigDecimal field012_03;

    @Column(name = "FLD_012_04")
    private Integer field012_04;

    @Column(name = "FLD_012_05")
    private Integer field012_05;

    @Column(name = "FLD_012_06")
    private BigDecimal field012_06;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public CustomerV012() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getCustomerId() { return customerId; }
    public void setCustomerId(String customerId) { this.customerId = customerId; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public LocalDate getDateOfBirth() { return dateOfBirth; }
    public void setDateOfBirth(LocalDate dateOfBirth) { this.dateOfBirth = dateOfBirth; }

    public String getSsn() { return ssn; }
    public void setSsn(String ssn) { this.ssn = ssn; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getAddressLine1() { return addressLine1; }
    public void setAddressLine1(String addressLine1) { this.addressLine1 = addressLine1; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public String getState() { return state; }
    public void setState(String state) { this.state = state; }

    public String getZipCode() { return zipCode; }
    public void setZipCode(String zipCode) { this.zipCode = zipCode; }

    public String getKycStatus() { return kycStatus; }
    public void setKycStatus(String kycStatus) { this.kycStatus = kycStatus; }

    public Integer getRiskRating() { return riskRating; }
    public void setRiskRating(Integer riskRating) { this.riskRating = riskRating; }

    public BigDecimal getField012_00() { return field012_00; }
    public void setField012_00(BigDecimal field012_00) { this.field012_00 = field012_00; }

    public Integer getField012_01() { return field012_01; }
    public void setField012_01(Integer field012_01) { this.field012_01 = field012_01; }

    public String getField012_02() { return field012_02; }
    public void setField012_02(String field012_02) { this.field012_02 = field012_02; }

    public BigDecimal getField012_03() { return field012_03; }
    public void setField012_03(BigDecimal field012_03) { this.field012_03 = field012_03; }

    public Integer getField012_04() { return field012_04; }
    public void setField012_04(Integer field012_04) { this.field012_04 = field012_04; }

    public Integer getField012_05() { return field012_05; }
    public void setField012_05(Integer field012_05) { this.field012_05 = field012_05; }

    public BigDecimal getField012_06() { return field012_06; }
    public void setField012_06(BigDecimal field012_06) { this.field012_06 = field012_06; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CustomerV012)) return false;
        CustomerV012 that = (CustomerV012) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "CustomerV012{" +
            "id=" + id +
            ", customerId=" + customerId +
            ", firstName=" + firstName +
            ", lastName=" + lastName +
            ", dateOfBirth=" + dateOfBirth +
            ", ssn=" + ssn +
            '}';
    }
}
