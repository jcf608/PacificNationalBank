package com.pnb.customer;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * CustomerDto025 — Data Transfer Object for customer operations.
 * Variant 25 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomerDto025 {

    @JsonProperty("custField000")
    private LocalDate custField000;

    @JsonProperty("custField001")
    private LocalDate custField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("custField002")
    private BigDecimal custField002;

    @JsonProperty("custField003")
    private Long custField003;

    @JsonProperty("custField004")
    private Long custField004;

    @JsonProperty("custField005")
    private Double custField005;

    @JsonProperty("custField006")
    private LocalDate custField006;

    @Size(max = 20)
    @JsonProperty("custField007")
    private String custField007;

    @JsonProperty("custField008")
    private Long custField008;

    public CustomerDto025() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final CustomerDto025 instance = new CustomerDto025();

        public Builder custField000(LocalDate val) { instance.custField000 = val; return this; }
        public Builder custField001(LocalDate val) { instance.custField001 = val; return this; }
        public Builder custField002(BigDecimal val) { instance.custField002 = val; return this; }
        public Builder custField003(Long val) { instance.custField003 = val; return this; }
        public Builder custField004(Long val) { instance.custField004 = val; return this; }
        public Builder custField005(Double val) { instance.custField005 = val; return this; }
        public Builder custField006(LocalDate val) { instance.custField006 = val; return this; }
        public Builder custField007(String val) { instance.custField007 = val; return this; }
        public Builder custField008(Long val) { instance.custField008 = val; return this; }
        public CustomerDto025 build() { return instance; }
    }

    public LocalDate getCustField000() { return custField000; }
    public void setCustField000(LocalDate custField000) { this.custField000 = custField000; }

    public LocalDate getCustField001() { return custField001; }
    public void setCustField001(LocalDate custField001) { this.custField001 = custField001; }

    public BigDecimal getCustField002() { return custField002; }
    public void setCustField002(BigDecimal custField002) { this.custField002 = custField002; }

    public Long getCustField003() { return custField003; }
    public void setCustField003(Long custField003) { this.custField003 = custField003; }

    public Long getCustField004() { return custField004; }
    public void setCustField004(Long custField004) { this.custField004 = custField004; }

    public Double getCustField005() { return custField005; }
    public void setCustField005(Double custField005) { this.custField005 = custField005; }

    public LocalDate getCustField006() { return custField006; }
    public void setCustField006(LocalDate custField006) { this.custField006 = custField006; }

    public String getCustField007() { return custField007; }
    public void setCustField007(String custField007) { this.custField007 = custField007; }

    public Long getCustField008() { return custField008; }
    public void setCustField008(Long custField008) { this.custField008 = custField008; }

    @Override
    public String toString() {
        return "CustomerDto025{" +
            "custField000=" + custField000 + ", " +
            "custField001=" + custField001 + ", " +
            "custField002=" + custField002 + ", " +
            "custField003=" + custField003 + ", " +
            "custField004=" + custField004 + ", " +
            "}";
    }
}
