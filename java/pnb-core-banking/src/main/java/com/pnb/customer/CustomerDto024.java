package com.pnb.customer;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * CustomerDto024 — Data Transfer Object for customer operations.
 * Variant 24 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomerDto024 {

    @DecimalMin(value = "0.00")
    @JsonProperty("custField000")
    private BigDecimal custField000;

    @JsonProperty("custField001")
    private Long custField001;

    @JsonProperty("custField002")
    private Integer custField002;

    @JsonProperty("custField003")
    private Boolean custField003;

    @JsonProperty("custField004")
    private Double custField004;

    @JsonProperty("custField005")
    private Double custField005;

    @JsonProperty("custField006")
    private LocalDate custField006;

    @Size(max = 60)
    @JsonProperty("custField007")
    private String custField007;

    public CustomerDto024() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final CustomerDto024 instance = new CustomerDto024();

        public Builder custField000(BigDecimal val) { instance.custField000 = val; return this; }
        public Builder custField001(Long val) { instance.custField001 = val; return this; }
        public Builder custField002(Integer val) { instance.custField002 = val; return this; }
        public Builder custField003(Boolean val) { instance.custField003 = val; return this; }
        public Builder custField004(Double val) { instance.custField004 = val; return this; }
        public Builder custField005(Double val) { instance.custField005 = val; return this; }
        public Builder custField006(LocalDate val) { instance.custField006 = val; return this; }
        public Builder custField007(String val) { instance.custField007 = val; return this; }
        public CustomerDto024 build() { return instance; }
    }

    public BigDecimal getCustField000() { return custField000; }
    public void setCustField000(BigDecimal custField000) { this.custField000 = custField000; }

    public Long getCustField001() { return custField001; }
    public void setCustField001(Long custField001) { this.custField001 = custField001; }

    public Integer getCustField002() { return custField002; }
    public void setCustField002(Integer custField002) { this.custField002 = custField002; }

    public Boolean getCustField003() { return custField003; }
    public void setCustField003(Boolean custField003) { this.custField003 = custField003; }

    public Double getCustField004() { return custField004; }
    public void setCustField004(Double custField004) { this.custField004 = custField004; }

    public Double getCustField005() { return custField005; }
    public void setCustField005(Double custField005) { this.custField005 = custField005; }

    public LocalDate getCustField006() { return custField006; }
    public void setCustField006(LocalDate custField006) { this.custField006 = custField006; }

    public String getCustField007() { return custField007; }
    public void setCustField007(String custField007) { this.custField007 = custField007; }

    @Override
    public String toString() {
        return "CustomerDto024{" +
            "custField000=" + custField000 + ", " +
            "custField001=" + custField001 + ", " +
            "custField002=" + custField002 + ", " +
            "custField003=" + custField003 + ", " +
            "custField004=" + custField004 + ", " +
            "}";
    }
}
