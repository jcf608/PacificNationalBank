package com.pnb.customer;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * CustomerV023 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "CUSTOMERV023")
public class CustomerV023 {

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

    @Column(name = "FLD_023_00")
    private String field023_00;

    @Column(name = "FLD_023_01")
    private LocalDate field023_01;

    @Column(name = "FLD_023_02")
    private String field023_02;

    @Column(name = "FLD_023_03")
    private Integer field023_03;

    @Column(name = "FLD_023_04")
    private Boolean field023_04;

    @Column(name = "FLD_023_05")
    private LocalDate field023_05;

    @Column(name = "FLD_023_06")
    private LocalDate field023_06;

    @Column(name = "FLD_023_07")
    private Integer field023_07;

    @Column(name = "FLD_023_08")
    private String field023_08;

    @Column(name = "FLD_023_09")
    private LocalDate field023_09;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public CustomerV023() {}

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

    public String getField023_00() { return field023_00; }
    public void setField023_00(String field023_00) { this.field023_00 = field023_00; }

    public LocalDate getField023_01() { return field023_01; }
    public void setField023_01(LocalDate field023_01) { this.field023_01 = field023_01; }

    public String getField023_02() { return field023_02; }
    public void setField023_02(String field023_02) { this.field023_02 = field023_02; }

    public Integer getField023_03() { return field023_03; }
    public void setField023_03(Integer field023_03) { this.field023_03 = field023_03; }

    public Boolean getField023_04() { return field023_04; }
    public void setField023_04(Boolean field023_04) { this.field023_04 = field023_04; }

    public LocalDate getField023_05() { return field023_05; }
    public void setField023_05(LocalDate field023_05) { this.field023_05 = field023_05; }

    public LocalDate getField023_06() { return field023_06; }
    public void setField023_06(LocalDate field023_06) { this.field023_06 = field023_06; }

    public Integer getField023_07() { return field023_07; }
    public void setField023_07(Integer field023_07) { this.field023_07 = field023_07; }

    public String getField023_08() { return field023_08; }
    public void setField023_08(String field023_08) { this.field023_08 = field023_08; }

    public LocalDate getField023_09() { return field023_09; }
    public void setField023_09(LocalDate field023_09) { this.field023_09 = field023_09; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CustomerV023)) return false;
        CustomerV023 that = (CustomerV023) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "CustomerV023{" +
            "id=" + id +
            ", customerId=" + customerId +
            ", firstName=" + firstName +
            ", lastName=" + lastName +
            ", dateOfBirth=" + dateOfBirth +
            ", ssn=" + ssn +
            '}';
    }
}
