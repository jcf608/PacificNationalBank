package com.pnb.customer;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * CustomerV039 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "CUSTOMERV039")
public class CustomerV039 {

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

    @Column(name = "FLD_039_00")
    private Integer field039_00;

    @Column(name = "FLD_039_01")
    private Boolean field039_01;

    @Column(name = "FLD_039_02")
    private Integer field039_02;

    @Column(name = "FLD_039_03")
    private Integer field039_03;

    @Column(name = "FLD_039_04")
    private Integer field039_04;

    @Column(name = "FLD_039_05")
    private Integer field039_05;

    @Column(name = "FLD_039_06")
    private String field039_06;

    @Column(name = "FLD_039_07")
    private BigDecimal field039_07;

    @Column(name = "FLD_039_08")
    private Boolean field039_08;

    @Column(name = "FLD_039_09")
    private String field039_09;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public CustomerV039() {}

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

    public Integer getField039_00() { return field039_00; }
    public void setField039_00(Integer field039_00) { this.field039_00 = field039_00; }

    public Boolean getField039_01() { return field039_01; }
    public void setField039_01(Boolean field039_01) { this.field039_01 = field039_01; }

    public Integer getField039_02() { return field039_02; }
    public void setField039_02(Integer field039_02) { this.field039_02 = field039_02; }

    public Integer getField039_03() { return field039_03; }
    public void setField039_03(Integer field039_03) { this.field039_03 = field039_03; }

    public Integer getField039_04() { return field039_04; }
    public void setField039_04(Integer field039_04) { this.field039_04 = field039_04; }

    public Integer getField039_05() { return field039_05; }
    public void setField039_05(Integer field039_05) { this.field039_05 = field039_05; }

    public String getField039_06() { return field039_06; }
    public void setField039_06(String field039_06) { this.field039_06 = field039_06; }

    public BigDecimal getField039_07() { return field039_07; }
    public void setField039_07(BigDecimal field039_07) { this.field039_07 = field039_07; }

    public Boolean getField039_08() { return field039_08; }
    public void setField039_08(Boolean field039_08) { this.field039_08 = field039_08; }

    public String getField039_09() { return field039_09; }
    public void setField039_09(String field039_09) { this.field039_09 = field039_09; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CustomerV039)) return false;
        CustomerV039 that = (CustomerV039) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "CustomerV039{" +
            "id=" + id +
            ", customerId=" + customerId +
            ", firstName=" + firstName +
            ", lastName=" + lastName +
            ", dateOfBirth=" + dateOfBirth +
            ", ssn=" + ssn +
            '}';
    }
}
