package com.pnb.customer;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * CustomerDto036 — Data Transfer Object for customer operations.
 * Variant 36 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomerDto036 {

    @JsonProperty("custField000")
    private Boolean custField000;

    @JsonProperty("custField001")
    private Double custField001;

    @JsonProperty("custField002")
    private Integer custField002;

    @JsonProperty("custField003")
    private Long custField003;

    @JsonProperty("custField004")
    private Boolean custField004;

    @JsonProperty("custField005")
    private Boolean custField005;

    @JsonProperty("custField006")
    private LocalDate custField006;

    @Size(max = 200)
    @JsonProperty("custField007")
    private String custField007;

    public CustomerDto036() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final CustomerDto036 instance = new CustomerDto036();

        public Builder custField000(Boolean val) { instance.custField000 = val; return this; }
        public Builder custField001(Double val) { instance.custField001 = val; return this; }
        public Builder custField002(Integer val) { instance.custField002 = val; return this; }
        public Builder custField003(Long val) { instance.custField003 = val; return this; }
        public Builder custField004(Boolean val) { instance.custField004 = val; return this; }
        public Builder custField005(Boolean val) { instance.custField005 = val; return this; }
        public Builder custField006(LocalDate val) { instance.custField006 = val; return this; }
        public Builder custField007(String val) { instance.custField007 = val; return this; }
        public CustomerDto036 build() { return instance; }
    }

    public Boolean getCustField000() { return custField000; }
    public void setCustField000(Boolean custField000) { this.custField000 = custField000; }

    public Double getCustField001() { return custField001; }
    public void setCustField001(Double custField001) { this.custField001 = custField001; }

    public Integer getCustField002() { return custField002; }
    public void setCustField002(Integer custField002) { this.custField002 = custField002; }

    public Long getCustField003() { return custField003; }
    public void setCustField003(Long custField003) { this.custField003 = custField003; }

    public Boolean getCustField004() { return custField004; }
    public void setCustField004(Boolean custField004) { this.custField004 = custField004; }

    public Boolean getCustField005() { return custField005; }
    public void setCustField005(Boolean custField005) { this.custField005 = custField005; }

    public LocalDate getCustField006() { return custField006; }
    public void setCustField006(LocalDate custField006) { this.custField006 = custField006; }

    public String getCustField007() { return custField007; }
    public void setCustField007(String custField007) { this.custField007 = custField007; }

    @Override
    public String toString() {
        return "CustomerDto036{" +
            "custField000=" + custField000 + ", " +
            "custField001=" + custField001 + ", " +
            "custField002=" + custField002 + ", " +
            "custField003=" + custField003 + ", " +
            "custField004=" + custField004 + ", " +
            "}";
    }
}
