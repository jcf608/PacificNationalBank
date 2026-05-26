package com.pnb.customer;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * CustomerDto027 — Data Transfer Object for customer operations.
 * Variant 27 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomerDto027 {

    @DecimalMin(value = "0.00")
    @JsonProperty("custField000")
    private BigDecimal custField000;

    @JsonProperty("custField001")
    private Integer custField001;

    @JsonProperty("custField002")
    private Integer custField002;

    @Size(max = 200)
    @JsonProperty("custField003")
    private String custField003;

    @JsonProperty("custField004")
    private Long custField004;

    @JsonProperty("custField005")
    private LocalDate custField005;

    @JsonProperty("custField006")
    private Boolean custField006;

    @JsonProperty("custField007")
    private Boolean custField007;

    @JsonProperty("custField008")
    private LocalDate custField008;

    @JsonProperty("custField009")
    private Double custField009;

    @JsonProperty("custField010")
    private Long custField010;

    public CustomerDto027() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final CustomerDto027 instance = new CustomerDto027();

        public Builder custField000(BigDecimal val) { instance.custField000 = val; return this; }
        public Builder custField001(Integer val) { instance.custField001 = val; return this; }
        public Builder custField002(Integer val) { instance.custField002 = val; return this; }
        public Builder custField003(String val) { instance.custField003 = val; return this; }
        public Builder custField004(Long val) { instance.custField004 = val; return this; }
        public Builder custField005(LocalDate val) { instance.custField005 = val; return this; }
        public Builder custField006(Boolean val) { instance.custField006 = val; return this; }
        public Builder custField007(Boolean val) { instance.custField007 = val; return this; }
        public Builder custField008(LocalDate val) { instance.custField008 = val; return this; }
        public Builder custField009(Double val) { instance.custField009 = val; return this; }
        public Builder custField010(Long val) { instance.custField010 = val; return this; }
        public CustomerDto027 build() { return instance; }
    }

    public BigDecimal getCustField000() { return custField000; }
    public void setCustField000(BigDecimal custField000) { this.custField000 = custField000; }

    public Integer getCustField001() { return custField001; }
    public void setCustField001(Integer custField001) { this.custField001 = custField001; }

    public Integer getCustField002() { return custField002; }
    public void setCustField002(Integer custField002) { this.custField002 = custField002; }

    public String getCustField003() { return custField003; }
    public void setCustField003(String custField003) { this.custField003 = custField003; }

    public Long getCustField004() { return custField004; }
    public void setCustField004(Long custField004) { this.custField004 = custField004; }

    public LocalDate getCustField005() { return custField005; }
    public void setCustField005(LocalDate custField005) { this.custField005 = custField005; }

    public Boolean getCustField006() { return custField006; }
    public void setCustField006(Boolean custField006) { this.custField006 = custField006; }

    public Boolean getCustField007() { return custField007; }
    public void setCustField007(Boolean custField007) { this.custField007 = custField007; }

    public LocalDate getCustField008() { return custField008; }
    public void setCustField008(LocalDate custField008) { this.custField008 = custField008; }

    public Double getCustField009() { return custField009; }
    public void setCustField009(Double custField009) { this.custField009 = custField009; }

    public Long getCustField010() { return custField010; }
    public void setCustField010(Long custField010) { this.custField010 = custField010; }

    @Override
    public String toString() {
        return "CustomerDto027{" +
            "custField000=" + custField000 + ", " +
            "custField001=" + custField001 + ", " +
            "custField002=" + custField002 + ", " +
            "custField003=" + custField003 + ", " +
            "custField004=" + custField004 + ", " +
            "}";
    }
}
