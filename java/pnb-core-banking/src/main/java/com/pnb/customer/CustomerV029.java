package com.pnb.customer;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * CustomerV029 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "CUSTOMERV029")
public class CustomerV029 {

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

    @Column(name = "FLD_029_00")
    private String field029_00;

    @Column(name = "FLD_029_01")
    private String field029_01;

    @Column(name = "FLD_029_02")
    private Boolean field029_02;

    @Column(name = "FLD_029_03")
    private LocalDate field029_03;

    @Column(name = "FLD_029_04")
    private Integer field029_04;

    @Column(name = "FLD_029_05")
    private Integer field029_05;

    @Column(name = "FLD_029_06")
    private LocalDate field029_06;

    @Column(name = "FLD_029_07")
    private Boolean field029_07;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public CustomerV029() {}

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

    public String getField029_00() { return field029_00; }
    public void setField029_00(String field029_00) { this.field029_00 = field029_00; }

    public String getField029_01() { return field029_01; }
    public void setField029_01(String field029_01) { this.field029_01 = field029_01; }

    public Boolean getField029_02() { return field029_02; }
    public void setField029_02(Boolean field029_02) { this.field029_02 = field029_02; }

    public LocalDate getField029_03() { return field029_03; }
    public void setField029_03(LocalDate field029_03) { this.field029_03 = field029_03; }

    public Integer getField029_04() { return field029_04; }
    public void setField029_04(Integer field029_04) { this.field029_04 = field029_04; }

    public Integer getField029_05() { return field029_05; }
    public void setField029_05(Integer field029_05) { this.field029_05 = field029_05; }

    public LocalDate getField029_06() { return field029_06; }
    public void setField029_06(LocalDate field029_06) { this.field029_06 = field029_06; }

    public Boolean getField029_07() { return field029_07; }
    public void setField029_07(Boolean field029_07) { this.field029_07 = field029_07; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CustomerV029)) return false;
        CustomerV029 that = (CustomerV029) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "CustomerV029{" +
            "id=" + id +
            ", customerId=" + customerId +
            ", firstName=" + firstName +
            ", lastName=" + lastName +
            ", dateOfBirth=" + dateOfBirth +
            ", ssn=" + ssn +
            '}';
    }
}
