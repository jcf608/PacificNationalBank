package com.pnb.customer;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * CustomerDto048 — Data Transfer Object for customer operations.
 * Variant 48 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomerDto048 {

    @JsonProperty("custField000")
    private Boolean custField000;

    @JsonProperty("custField001")
    private Double custField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("custField002")
    private BigDecimal custField002;

    @JsonProperty("custField003")
    private LocalDate custField003;

    @JsonProperty("custField004")
    private Long custField004;

    @JsonProperty("custField005")
    private Integer custField005;

    @JsonProperty("custField006")
    private Double custField006;

    @JsonProperty("custField007")
    private LocalDate custField007;

    public CustomerDto048() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final CustomerDto048 instance = new CustomerDto048();

        public Builder custField000(Boolean val) { instance.custField000 = val; return this; }
        public Builder custField001(Double val) { instance.custField001 = val; return this; }
        public Builder custField002(BigDecimal val) { instance.custField002 = val; return this; }
        public Builder custField003(LocalDate val) { instance.custField003 = val; return this; }
        public Builder custField004(Long val) { instance.custField004 = val; return this; }
        public Builder custField005(Integer val) { instance.custField005 = val; return this; }
        public Builder custField006(Double val) { instance.custField006 = val; return this; }
        public Builder custField007(LocalDate val) { instance.custField007 = val; return this; }
        public CustomerDto048 build() { return instance; }
    }

    public Boolean getCustField000() { return custField000; }
    public void setCustField000(Boolean custField000) { this.custField000 = custField000; }

    public Double getCustField001() { return custField001; }
    public void setCustField001(Double custField001) { this.custField001 = custField001; }

    public BigDecimal getCustField002() { return custField002; }
    public void setCustField002(BigDecimal custField002) { this.custField002 = custField002; }

    public LocalDate getCustField003() { return custField003; }
    public void setCustField003(LocalDate custField003) { this.custField003 = custField003; }

    public Long getCustField004() { return custField004; }
    public void setCustField004(Long custField004) { this.custField004 = custField004; }

    public Integer getCustField005() { return custField005; }
    public void setCustField005(Integer custField005) { this.custField005 = custField005; }

    public Double getCustField006() { return custField006; }
    public void setCustField006(Double custField006) { this.custField006 = custField006; }

    public LocalDate getCustField007() { return custField007; }
    public void setCustField007(LocalDate custField007) { this.custField007 = custField007; }

    @Override
    public String toString() {
        return "CustomerDto048{" +
            "custField000=" + custField000 + ", " +
            "custField001=" + custField001 + ", " +
            "custField002=" + custField002 + ", " +
            "custField003=" + custField003 + ", " +
            "custField004=" + custField004 + ", " +
            "}";
    }
}
