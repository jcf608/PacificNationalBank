package com.pnb.customer;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * CustomerV037 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "CUSTOMERV037")
public class CustomerV037 {

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

    @Column(name = "FLD_037_00")
    private Integer field037_00;

    @Column(name = "FLD_037_01")
    private LocalDate field037_01;

    @Column(name = "FLD_037_02")
    private LocalDate field037_02;

    @Column(name = "FLD_037_03")
    private LocalDate field037_03;

    @Column(name = "FLD_037_04")
    private BigDecimal field037_04;

    @Column(name = "FLD_037_05")
    private Boolean field037_05;

    @Column(name = "FLD_037_06")
    private LocalDate field037_06;

    @Column(name = "FLD_037_07")
    private BigDecimal field037_07;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public CustomerV037() {}

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

    public Integer getField037_00() { return field037_00; }
    public void setField037_00(Integer field037_00) { this.field037_00 = field037_00; }

    public LocalDate getField037_01() { return field037_01; }
    public void setField037_01(LocalDate field037_01) { this.field037_01 = field037_01; }

    public LocalDate getField037_02() { return field037_02; }
    public void setField037_02(LocalDate field037_02) { this.field037_02 = field037_02; }

    public LocalDate getField037_03() { return field037_03; }
    public void setField037_03(LocalDate field037_03) { this.field037_03 = field037_03; }

    public BigDecimal getField037_04() { return field037_04; }
    public void setField037_04(BigDecimal field037_04) { this.field037_04 = field037_04; }

    public Boolean getField037_05() { return field037_05; }
    public void setField037_05(Boolean field037_05) { this.field037_05 = field037_05; }

    public LocalDate getField037_06() { return field037_06; }
    public void setField037_06(LocalDate field037_06) { this.field037_06 = field037_06; }

    public BigDecimal getField037_07() { return field037_07; }
    public void setField037_07(BigDecimal field037_07) { this.field037_07 = field037_07; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CustomerV037)) return false;
        CustomerV037 that = (CustomerV037) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "CustomerV037{" +
            "id=" + id +
            ", customerId=" + customerId +
            ", firstName=" + firstName +
            ", lastName=" + lastName +
            ", dateOfBirth=" + dateOfBirth +
            ", ssn=" + ssn +
            '}';
    }
}
