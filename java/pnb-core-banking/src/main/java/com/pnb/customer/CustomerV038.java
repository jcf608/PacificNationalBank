package com.pnb.customer;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * CustomerV038 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "CUSTOMERV038")
public class CustomerV038 {

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

    @Column(name = "FLD_038_00")
    private String field038_00;

    @Column(name = "FLD_038_01")
    private Integer field038_01;

    @Column(name = "FLD_038_02")
    private Boolean field038_02;

    @Column(name = "FLD_038_03")
    private Boolean field038_03;

    @Column(name = "FLD_038_04")
    private Integer field038_04;

    @Column(name = "FLD_038_05")
    private String field038_05;

    @Column(name = "FLD_038_06")
    private BigDecimal field038_06;

    @Column(name = "FLD_038_07")
    private Integer field038_07;

    @Column(name = "FLD_038_08")
    private BigDecimal field038_08;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public CustomerV038() {}

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

    public String getField038_00() { return field038_00; }
    public void setField038_00(String field038_00) { this.field038_00 = field038_00; }

    public Integer getField038_01() { return field038_01; }
    public void setField038_01(Integer field038_01) { this.field038_01 = field038_01; }

    public Boolean getField038_02() { return field038_02; }
    public void setField038_02(Boolean field038_02) { this.field038_02 = field038_02; }

    public Boolean getField038_03() { return field038_03; }
    public void setField038_03(Boolean field038_03) { this.field038_03 = field038_03; }

    public Integer getField038_04() { return field038_04; }
    public void setField038_04(Integer field038_04) { this.field038_04 = field038_04; }

    public String getField038_05() { return field038_05; }
    public void setField038_05(String field038_05) { this.field038_05 = field038_05; }

    public BigDecimal getField038_06() { return field038_06; }
    public void setField038_06(BigDecimal field038_06) { this.field038_06 = field038_06; }

    public Integer getField038_07() { return field038_07; }
    public void setField038_07(Integer field038_07) { this.field038_07 = field038_07; }

    public BigDecimal getField038_08() { return field038_08; }
    public void setField038_08(BigDecimal field038_08) { this.field038_08 = field038_08; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CustomerV038)) return false;
        CustomerV038 that = (CustomerV038) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "CustomerV038{" +
            "id=" + id +
            ", customerId=" + customerId +
            ", firstName=" + firstName +
            ", lastName=" + lastName +
            ", dateOfBirth=" + dateOfBirth +
            ", ssn=" + ssn +
            '}';
    }
}
