package com.pnb.customer;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * CustomerV014 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "CUSTOMERV014")
public class CustomerV014 {

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

    @Column(name = "FLD_014_00")
    private Boolean field014_00;

    @Column(name = "FLD_014_01")
    private Boolean field014_01;

    @Column(name = "FLD_014_02")
    private String field014_02;

    @Column(name = "FLD_014_03")
    private Boolean field014_03;

    @Column(name = "FLD_014_04")
    private LocalDate field014_04;

    @Column(name = "FLD_014_05")
    private LocalDate field014_05;

    @Column(name = "FLD_014_06")
    private Integer field014_06;

    @Column(name = "FLD_014_07")
    private Integer field014_07;

    @Column(name = "FLD_014_08")
    private BigDecimal field014_08;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public CustomerV014() {}

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

    public Boolean getField014_00() { return field014_00; }
    public void setField014_00(Boolean field014_00) { this.field014_00 = field014_00; }

    public Boolean getField014_01() { return field014_01; }
    public void setField014_01(Boolean field014_01) { this.field014_01 = field014_01; }

    public String getField014_02() { return field014_02; }
    public void setField014_02(String field014_02) { this.field014_02 = field014_02; }

    public Boolean getField014_03() { return field014_03; }
    public void setField014_03(Boolean field014_03) { this.field014_03 = field014_03; }

    public LocalDate getField014_04() { return field014_04; }
    public void setField014_04(LocalDate field014_04) { this.field014_04 = field014_04; }

    public LocalDate getField014_05() { return field014_05; }
    public void setField014_05(LocalDate field014_05) { this.field014_05 = field014_05; }

    public Integer getField014_06() { return field014_06; }
    public void setField014_06(Integer field014_06) { this.field014_06 = field014_06; }

    public Integer getField014_07() { return field014_07; }
    public void setField014_07(Integer field014_07) { this.field014_07 = field014_07; }

    public BigDecimal getField014_08() { return field014_08; }
    public void setField014_08(BigDecimal field014_08) { this.field014_08 = field014_08; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CustomerV014)) return false;
        CustomerV014 that = (CustomerV014) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "CustomerV014{" +
            "id=" + id +
            ", customerId=" + customerId +
            ", firstName=" + firstName +
            ", lastName=" + lastName +
            ", dateOfBirth=" + dateOfBirth +
            ", ssn=" + ssn +
            '}';
    }
}
