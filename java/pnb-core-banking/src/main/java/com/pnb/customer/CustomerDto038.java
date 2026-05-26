package com.pnb.customer;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * CustomerDto038 — Data Transfer Object for customer operations.
 * Variant 38 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomerDto038 {

    @JsonProperty("custField000")
    private Boolean custField000;

    @Size(max = 60)
    @JsonProperty("custField001")
    private String custField001;

    @Size(max = 40)
    @JsonProperty("custField002")
    private String custField002;

    @JsonProperty("custField003")
    private Long custField003;

    @JsonProperty("custField004")
    private Double custField004;

    @Size(max = 20)
    @JsonProperty("custField005")
    private String custField005;

    @JsonProperty("custField006")
    private Long custField006;

    @JsonProperty("custField007")
    private Long custField007;

    @JsonProperty("custField008")
    private Double custField008;

    @JsonProperty("custField009")
    private LocalDate custField009;

    public CustomerDto038() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final CustomerDto038 instance = new CustomerDto038();

        public Builder custField000(Boolean val) { instance.custField000 = val; return this; }
        public Builder custField001(String val) { instance.custField001 = val; return this; }
        public Builder custField002(String val) { instance.custField002 = val; return this; }
        public Builder custField003(Long val) { instance.custField003 = val; return this; }
        public Builder custField004(Double val) { instance.custField004 = val; return this; }
        public Builder custField005(String val) { instance.custField005 = val; return this; }
        public Builder custField006(Long val) { instance.custField006 = val; return this; }
        public Builder custField007(Long val) { instance.custField007 = val; return this; }
        public Builder custField008(Double val) { instance.custField008 = val; return this; }
        public Builder custField009(LocalDate val) { instance.custField009 = val; return this; }
        public CustomerDto038 build() { return instance; }
    }

    public Boolean getCustField000() { return custField000; }
    public void setCustField000(Boolean custField000) { this.custField000 = custField000; }

    public String getCustField001() { return custField001; }
    public void setCustField001(String custField001) { this.custField001 = custField001; }

    public String getCustField002() { return custField002; }
    public void setCustField002(String custField002) { this.custField002 = custField002; }

    public Long getCustField003() { return custField003; }
    public void setCustField003(Long custField003) { this.custField003 = custField003; }

    public Double getCustField004() { return custField004; }
    public void setCustField004(Double custField004) { this.custField004 = custField004; }

    public String getCustField005() { return custField005; }
    public void setCustField005(String custField005) { this.custField005 = custField005; }

    public Long getCustField006() { return custField006; }
    public void setCustField006(Long custField006) { this.custField006 = custField006; }

    public Long getCustField007() { return custField007; }
    public void setCustField007(Long custField007) { this.custField007 = custField007; }

    public Double getCustField008() { return custField008; }
    public void setCustField008(Double custField008) { this.custField008 = custField008; }

    public LocalDate getCustField009() { return custField009; }
    public void setCustField009(LocalDate custField009) { this.custField009 = custField009; }

    @Override
    public String toString() {
        return "CustomerDto038{" +
            "custField000=" + custField000 + ", " +
            "custField001=" + custField001 + ", " +
            "custField002=" + custField002 + ", " +
            "custField003=" + custField003 + ", " +
            "custField004=" + custField004 + ", " +
            "}";
    }
}
