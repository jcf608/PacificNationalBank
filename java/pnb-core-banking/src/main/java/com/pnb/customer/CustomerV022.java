package com.pnb.customer;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * CustomerV022 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "CUSTOMERV022")
public class CustomerV022 {

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

    @Column(name = "FLD_022_00")
    private Boolean field022_00;

    @Column(name = "FLD_022_01")
    private LocalDate field022_01;

    @Column(name = "FLD_022_02")
    private Boolean field022_02;

    @Column(name = "FLD_022_03")
    private BigDecimal field022_03;

    @Column(name = "FLD_022_04")
    private BigDecimal field022_04;

    @Column(name = "FLD_022_05")
    private BigDecimal field022_05;

    @Column(name = "FLD_022_06")
    private BigDecimal field022_06;

    @Column(name = "FLD_022_07")
    private LocalDate field022_07;

    @Column(name = "FLD_022_08")
    private String field022_08;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public CustomerV022() {}

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

    public Boolean getField022_00() { return field022_00; }
    public void setField022_00(Boolean field022_00) { this.field022_00 = field022_00; }

    public LocalDate getField022_01() { return field022_01; }
    public void setField022_01(LocalDate field022_01) { this.field022_01 = field022_01; }

    public Boolean getField022_02() { return field022_02; }
    public void setField022_02(Boolean field022_02) { this.field022_02 = field022_02; }

    public BigDecimal getField022_03() { return field022_03; }
    public void setField022_03(BigDecimal field022_03) { this.field022_03 = field022_03; }

    public BigDecimal getField022_04() { return field022_04; }
    public void setField022_04(BigDecimal field022_04) { this.field022_04 = field022_04; }

    public BigDecimal getField022_05() { return field022_05; }
    public void setField022_05(BigDecimal field022_05) { this.field022_05 = field022_05; }

    public BigDecimal getField022_06() { return field022_06; }
    public void setField022_06(BigDecimal field022_06) { this.field022_06 = field022_06; }

    public LocalDate getField022_07() { return field022_07; }
    public void setField022_07(LocalDate field022_07) { this.field022_07 = field022_07; }

    public String getField022_08() { return field022_08; }
    public void setField022_08(String field022_08) { this.field022_08 = field022_08; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CustomerV022)) return false;
        CustomerV022 that = (CustomerV022) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "CustomerV022{" +
            "id=" + id +
            ", customerId=" + customerId +
            ", firstName=" + firstName +
            ", lastName=" + lastName +
            ", dateOfBirth=" + dateOfBirth +
            ", ssn=" + ssn +
            '}';
    }
}
