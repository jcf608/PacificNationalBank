package com.pnb.customer;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * CustomerV015 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "CUSTOMERV015")
public class CustomerV015 {

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

    @Column(name = "FLD_015_00")
    private BigDecimal field015_00;

    @Column(name = "FLD_015_01")
    private String field015_01;

    @Column(name = "FLD_015_02")
    private Boolean field015_02;

    @Column(name = "FLD_015_03")
    private String field015_03;

    @Column(name = "FLD_015_04")
    private Boolean field015_04;

    @Column(name = "FLD_015_05")
    private Boolean field015_05;

    @Column(name = "FLD_015_06")
    private String field015_06;

    @Column(name = "FLD_015_07")
    private Boolean field015_07;

    @Column(name = "FLD_015_08")
    private BigDecimal field015_08;

    @Column(name = "FLD_015_09")
    private String field015_09;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public CustomerV015() {}

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

    public BigDecimal getField015_00() { return field015_00; }
    public void setField015_00(BigDecimal field015_00) { this.field015_00 = field015_00; }

    public String getField015_01() { return field015_01; }
    public void setField015_01(String field015_01) { this.field015_01 = field015_01; }

    public Boolean getField015_02() { return field015_02; }
    public void setField015_02(Boolean field015_02) { this.field015_02 = field015_02; }

    public String getField015_03() { return field015_03; }
    public void setField015_03(String field015_03) { this.field015_03 = field015_03; }

    public Boolean getField015_04() { return field015_04; }
    public void setField015_04(Boolean field015_04) { this.field015_04 = field015_04; }

    public Boolean getField015_05() { return field015_05; }
    public void setField015_05(Boolean field015_05) { this.field015_05 = field015_05; }

    public String getField015_06() { return field015_06; }
    public void setField015_06(String field015_06) { this.field015_06 = field015_06; }

    public Boolean getField015_07() { return field015_07; }
    public void setField015_07(Boolean field015_07) { this.field015_07 = field015_07; }

    public BigDecimal getField015_08() { return field015_08; }
    public void setField015_08(BigDecimal field015_08) { this.field015_08 = field015_08; }

    public String getField015_09() { return field015_09; }
    public void setField015_09(String field015_09) { this.field015_09 = field015_09; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CustomerV015)) return false;
        CustomerV015 that = (CustomerV015) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "CustomerV015{" +
            "id=" + id +
            ", customerId=" + customerId +
            ", firstName=" + firstName +
            ", lastName=" + lastName +
            ", dateOfBirth=" + dateOfBirth +
            ", ssn=" + ssn +
            '}';
    }
}
