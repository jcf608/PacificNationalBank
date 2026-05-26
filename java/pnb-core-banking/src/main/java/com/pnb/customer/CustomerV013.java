package com.pnb.customer;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * CustomerV013 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "CUSTOMERV013")
public class CustomerV013 {

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

    @Column(name = "FLD_013_00")
    private LocalDate field013_00;

    @Column(name = "FLD_013_01")
    private Boolean field013_01;

    @Column(name = "FLD_013_02")
    private Integer field013_02;

    @Column(name = "FLD_013_03")
    private Boolean field013_03;

    @Column(name = "FLD_013_04")
    private Boolean field013_04;

    @Column(name = "FLD_013_05")
    private String field013_05;

    @Column(name = "FLD_013_06")
    private Boolean field013_06;

    @Column(name = "FLD_013_07")
    private Integer field013_07;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public CustomerV013() {}

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

    public LocalDate getField013_00() { return field013_00; }
    public void setField013_00(LocalDate field013_00) { this.field013_00 = field013_00; }

    public Boolean getField013_01() { return field013_01; }
    public void setField013_01(Boolean field013_01) { this.field013_01 = field013_01; }

    public Integer getField013_02() { return field013_02; }
    public void setField013_02(Integer field013_02) { this.field013_02 = field013_02; }

    public Boolean getField013_03() { return field013_03; }
    public void setField013_03(Boolean field013_03) { this.field013_03 = field013_03; }

    public Boolean getField013_04() { return field013_04; }
    public void setField013_04(Boolean field013_04) { this.field013_04 = field013_04; }

    public String getField013_05() { return field013_05; }
    public void setField013_05(String field013_05) { this.field013_05 = field013_05; }

    public Boolean getField013_06() { return field013_06; }
    public void setField013_06(Boolean field013_06) { this.field013_06 = field013_06; }

    public Integer getField013_07() { return field013_07; }
    public void setField013_07(Integer field013_07) { this.field013_07 = field013_07; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CustomerV013)) return false;
        CustomerV013 that = (CustomerV013) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "CustomerV013{" +
            "id=" + id +
            ", customerId=" + customerId +
            ", firstName=" + firstName +
            ", lastName=" + lastName +
            ", dateOfBirth=" + dateOfBirth +
            ", ssn=" + ssn +
            '}';
    }
}
