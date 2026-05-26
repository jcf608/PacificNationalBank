package com.pnb.customer;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * CustomerDto049 — Data Transfer Object for customer operations.
 * Variant 49 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomerDto049 {

    @DecimalMin(value = "0.00")
    @JsonProperty("custField000")
    private BigDecimal custField000;

    @Size(max = 40)
    @JsonProperty("custField001")
    private String custField001;

    @JsonProperty("custField002")
    private LocalDate custField002;

    @JsonProperty("custField003")
    private LocalDate custField003;

    @JsonProperty("custField004")
    private Integer custField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("custField005")
    private BigDecimal custField005;

    @JsonProperty("custField006")
    private Integer custField006;

    @JsonProperty("custField007")
    private Double custField007;

    @JsonProperty("custField008")
    private Boolean custField008;

    public CustomerDto049() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final CustomerDto049 instance = new CustomerDto049();

        public Builder custField000(BigDecimal val) { instance.custField000 = val; return this; }
        public Builder custField001(String val) { instance.custField001 = val; return this; }
        public Builder custField002(LocalDate val) { instance.custField002 = val; return this; }
        public Builder custField003(LocalDate val) { instance.custField003 = val; return this; }
        public Builder custField004(Integer val) { instance.custField004 = val; return this; }
        public Builder custField005(BigDecimal val) { instance.custField005 = val; return this; }
        public Builder custField006(Integer val) { instance.custField006 = val; return this; }
        public Builder custField007(Double val) { instance.custField007 = val; return this; }
        public Builder custField008(Boolean val) { instance.custField008 = val; return this; }
        public CustomerDto049 build() { return instance; }
    }

    public BigDecimal getCustField000() { return custField000; }
    public void setCustField000(BigDecimal custField000) { this.custField000 = custField000; }

    public String getCustField001() { return custField001; }
    public void setCustField001(String custField001) { this.custField001 = custField001; }

    public LocalDate getCustField002() { return custField002; }
    public void setCustField002(LocalDate custField002) { this.custField002 = custField002; }

    public LocalDate getCustField003() { return custField003; }
    public void setCustField003(LocalDate custField003) { this.custField003 = custField003; }

    public Integer getCustField004() { return custField004; }
    public void setCustField004(Integer custField004) { this.custField004 = custField004; }

    public BigDecimal getCustField005() { return custField005; }
    public void setCustField005(BigDecimal custField005) { this.custField005 = custField005; }

    public Integer getCustField006() { return custField006; }
    public void setCustField006(Integer custField006) { this.custField006 = custField006; }

    public Double getCustField007() { return custField007; }
    public void setCustField007(Double custField007) { this.custField007 = custField007; }

    public Boolean getCustField008() { return custField008; }
    public void setCustField008(Boolean custField008) { this.custField008 = custField008; }

    @Override
    public String toString() {
        return "CustomerDto049{" +
            "custField000=" + custField000 + ", " +
            "custField001=" + custField001 + ", " +
            "custField002=" + custField002 + ", " +
            "custField003=" + custField003 + ", " +
            "custField004=" + custField004 + ", " +
            "}";
    }
}
