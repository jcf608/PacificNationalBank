package com.pnb.customer;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * CustomerDto026 — Data Transfer Object for customer operations.
 * Variant 26 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomerDto026 {

    @DecimalMin(value = "0.00")
    @JsonProperty("custField000")
    private BigDecimal custField000;

    @JsonProperty("custField001")
    private Boolean custField001;

    @JsonProperty("custField002")
    private Integer custField002;

    @DecimalMin(value = "0.00")
    @JsonProperty("custField003")
    private BigDecimal custField003;

    @JsonProperty("custField004")
    private Boolean custField004;

    @JsonProperty("custField005")
    private Double custField005;

    @JsonProperty("custField006")
    private Integer custField006;

    @JsonProperty("custField007")
    private Double custField007;

    @Size(max = 60)
    @JsonProperty("custField008")
    private String custField008;

    @JsonProperty("custField009")
    private Double custField009;

    public CustomerDto026() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final CustomerDto026 instance = new CustomerDto026();

        public Builder custField000(BigDecimal val) { instance.custField000 = val; return this; }
        public Builder custField001(Boolean val) { instance.custField001 = val; return this; }
        public Builder custField002(Integer val) { instance.custField002 = val; return this; }
        public Builder custField003(BigDecimal val) { instance.custField003 = val; return this; }
        public Builder custField004(Boolean val) { instance.custField004 = val; return this; }
        public Builder custField005(Double val) { instance.custField005 = val; return this; }
        public Builder custField006(Integer val) { instance.custField006 = val; return this; }
        public Builder custField007(Double val) { instance.custField007 = val; return this; }
        public Builder custField008(String val) { instance.custField008 = val; return this; }
        public Builder custField009(Double val) { instance.custField009 = val; return this; }
        public CustomerDto026 build() { return instance; }
    }

    public BigDecimal getCustField000() { return custField000; }
    public void setCustField000(BigDecimal custField000) { this.custField000 = custField000; }

    public Boolean getCustField001() { return custField001; }
    public void setCustField001(Boolean custField001) { this.custField001 = custField001; }

    public Integer getCustField002() { return custField002; }
    public void setCustField002(Integer custField002) { this.custField002 = custField002; }

    public BigDecimal getCustField003() { return custField003; }
    public void setCustField003(BigDecimal custField003) { this.custField003 = custField003; }

    public Boolean getCustField004() { return custField004; }
    public void setCustField004(Boolean custField004) { this.custField004 = custField004; }

    public Double getCustField005() { return custField005; }
    public void setCustField005(Double custField005) { this.custField005 = custField005; }

    public Integer getCustField006() { return custField006; }
    public void setCustField006(Integer custField006) { this.custField006 = custField006; }

    public Double getCustField007() { return custField007; }
    public void setCustField007(Double custField007) { this.custField007 = custField007; }

    public String getCustField008() { return custField008; }
    public void setCustField008(String custField008) { this.custField008 = custField008; }

    public Double getCustField009() { return custField009; }
    public void setCustField009(Double custField009) { this.custField009 = custField009; }

    @Override
    public String toString() {
        return "CustomerDto026{" +
            "custField000=" + custField000 + ", " +
            "custField001=" + custField001 + ", " +
            "custField002=" + custField002 + ", " +
            "custField003=" + custField003 + ", " +
            "custField004=" + custField004 + ", " +
            "}";
    }
}
