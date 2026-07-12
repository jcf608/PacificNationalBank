package com.pnb.customer;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * CustomerV030 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "CUSTOMERV030")
public class CustomerV030 {

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

    @Column(name = "FLD_030_00")
    private Integer field030_00;

    @Column(name = "FLD_030_01")
    private Boolean field030_01;

    @Column(name = "FLD_030_02")
    private Boolean field030_02;

    @Column(name = "FLD_030_03")
    private Integer field030_03;

    @Column(name = "FLD_030_04")
    private LocalDate field030_04;

    @Column(name = "FLD_030_05")
    private Boolean field030_05;

    @Column(name = "FLD_030_06")
    private LocalDate field030_06;

    @Column(name = "FLD_030_07")
    private LocalDate field030_07;

    @Column(name = "FLD_030_08")
    private Boolean field030_08;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public CustomerV030() {}

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

    public Integer getField030_00() { return field030_00; }
    public void setField030_00(Integer field030_00) { this.field030_00 = field030_00; }

    public Boolean getField030_01() { return field030_01; }
    public void setField030_01(Boolean field030_01) { this.field030_01 = field030_01; }

    public Boolean getField030_02() { return field030_02; }
    public void setField030_02(Boolean field030_02) { this.field030_02 = field030_02; }

    public Integer getField030_03() { return field030_03; }
    public void setField030_03(Integer field030_03) { this.field030_03 = field030_03; }

    public LocalDate getField030_04() { return field030_04; }
    public void setField030_04(LocalDate field030_04) { this.field030_04 = field030_04; }

    public Boolean getField030_05() { return field030_05; }
    public void setField030_05(Boolean field030_05) { this.field030_05 = field030_05; }

    public LocalDate getField030_06() { return field030_06; }
    public void setField030_06(LocalDate field030_06) { this.field030_06 = field030_06; }

    public LocalDate getField030_07() { return field030_07; }
    public void setField030_07(LocalDate field030_07) { this.field030_07 = field030_07; }

    public Boolean getField030_08() { return field030_08; }
    public void setField030_08(Boolean field030_08) { this.field030_08 = field030_08; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CustomerV030)) return false;
        CustomerV030 that = (CustomerV030) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "CustomerV030{" +
            "id=" + id +
            ", customerId=" + customerId +
            ", firstName=" + firstName +
            ", lastName=" + lastName +
            ", dateOfBirth=" + dateOfBirth +
            ", ssn=" + ssn +
            '}';
    }
}
