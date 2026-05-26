package com.pnb.customer;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * CustomerV007 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "CUSTOMERV007")
public class CustomerV007 {

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

    @Column(name = "FLD_007_00")
    private Boolean field007_00;

    @Column(name = "FLD_007_01")
    private String field007_01;

    @Column(name = "FLD_007_02")
    private LocalDate field007_02;

    @Column(name = "FLD_007_03")
    private Boolean field007_03;

    @Column(name = "FLD_007_04")
    private Boolean field007_04;

    @Column(name = "FLD_007_05")
    private Boolean field007_05;

    @Column(name = "FLD_007_06")
    private Integer field007_06;

    @Column(name = "FLD_007_07")
    private Integer field007_07;

    @Column(name = "FLD_007_08")
    private BigDecimal field007_08;

    @Column(name = "FLD_007_09")
    private Integer field007_09;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public CustomerV007() {}

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

    public Boolean getField007_00() { return field007_00; }
    public void setField007_00(Boolean field007_00) { this.field007_00 = field007_00; }

    public String getField007_01() { return field007_01; }
    public void setField007_01(String field007_01) { this.field007_01 = field007_01; }

    public LocalDate getField007_02() { return field007_02; }
    public void setField007_02(LocalDate field007_02) { this.field007_02 = field007_02; }

    public Boolean getField007_03() { return field007_03; }
    public void setField007_03(Boolean field007_03) { this.field007_03 = field007_03; }

    public Boolean getField007_04() { return field007_04; }
    public void setField007_04(Boolean field007_04) { this.field007_04 = field007_04; }

    public Boolean getField007_05() { return field007_05; }
    public void setField007_05(Boolean field007_05) { this.field007_05 = field007_05; }

    public Integer getField007_06() { return field007_06; }
    public void setField007_06(Integer field007_06) { this.field007_06 = field007_06; }

    public Integer getField007_07() { return field007_07; }
    public void setField007_07(Integer field007_07) { this.field007_07 = field007_07; }

    public BigDecimal getField007_08() { return field007_08; }
    public void setField007_08(BigDecimal field007_08) { this.field007_08 = field007_08; }

    public Integer getField007_09() { return field007_09; }
    public void setField007_09(Integer field007_09) { this.field007_09 = field007_09; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CustomerV007)) return false;
        CustomerV007 that = (CustomerV007) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "CustomerV007{" +
            "id=" + id +
            ", customerId=" + customerId +
            ", firstName=" + firstName +
            ", lastName=" + lastName +
            ", dateOfBirth=" + dateOfBirth +
            ", ssn=" + ssn +
            '}';
    }
}
