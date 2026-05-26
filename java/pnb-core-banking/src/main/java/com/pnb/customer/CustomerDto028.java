package com.pnb.customer;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * CustomerDto028 — Data Transfer Object for customer operations.
 * Variant 28 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomerDto028 {

    @Size(max = 40)
    @JsonProperty("custField000")
    private String custField000;

    @Size(max = 200)
    @JsonProperty("custField001")
    private String custField001;

    @JsonProperty("custField002")
    private LocalDate custField002;

    @JsonProperty("custField003")
    private Integer custField003;

    @JsonProperty("custField004")
    private Integer custField004;

    @JsonProperty("custField005")
    private Boolean custField005;

    @JsonProperty("custField006")
    private Long custField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("custField007")
    private BigDecimal custField007;

    @Size(max = 60)
    @JsonProperty("custField008")
    private String custField008;

    @Size(max = 40)
    @JsonProperty("custField009")
    private String custField009;

    @Size(max = 100)
    @JsonProperty("custField010")
    private String custField010;

    @JsonProperty("custField011")
    private Boolean custField011;

    public CustomerDto028() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final CustomerDto028 instance = new CustomerDto028();

        public Builder custField000(String val) { instance.custField000 = val; return this; }
        public Builder custField001(String val) { instance.custField001 = val; return this; }
        public Builder custField002(LocalDate val) { instance.custField002 = val; return this; }
        public Builder custField003(Integer val) { instance.custField003 = val; return this; }
        public Builder custField004(Integer val) { instance.custField004 = val; return this; }
        public Builder custField005(Boolean val) { instance.custField005 = val; return this; }
        public Builder custField006(Long val) { instance.custField006 = val; return this; }
        public Builder custField007(BigDecimal val) { instance.custField007 = val; return this; }
        public Builder custField008(String val) { instance.custField008 = val; return this; }
        public Builder custField009(String val) { instance.custField009 = val; return this; }
        public Builder custField010(String val) { instance.custField010 = val; return this; }
        public Builder custField011(Boolean val) { instance.custField011 = val; return this; }
        public CustomerDto028 build() { return instance; }
    }

    public String getCustField000() { return custField000; }
    public void setCustField000(String custField000) { this.custField000 = custField000; }

    public String getCustField001() { return custField001; }
    public void setCustField001(String custField001) { this.custField001 = custField001; }

    public LocalDate getCustField002() { return custField002; }
    public void setCustField002(LocalDate custField002) { this.custField002 = custField002; }

    public Integer getCustField003() { return custField003; }
    public void setCustField003(Integer custField003) { this.custField003 = custField003; }

    public Integer getCustField004() { return custField004; }
    public void setCustField004(Integer custField004) { this.custField004 = custField004; }

    public Boolean getCustField005() { return custField005; }
    public void setCustField005(Boolean custField005) { this.custField005 = custField005; }

    public Long getCustField006() { return custField006; }
    public void setCustField006(Long custField006) { this.custField006 = custField006; }

    public BigDecimal getCustField007() { return custField007; }
    public void setCustField007(BigDecimal custField007) { this.custField007 = custField007; }

    public String getCustField008() { return custField008; }
    public void setCustField008(String custField008) { this.custField008 = custField008; }

    public String getCustField009() { return custField009; }
    public void setCustField009(String custField009) { this.custField009 = custField009; }

    public String getCustField010() { return custField010; }
    public void setCustField010(String custField010) { this.custField010 = custField010; }

    public Boolean getCustField011() { return custField011; }
    public void setCustField011(Boolean custField011) { this.custField011 = custField011; }

    @Override
    public String toString() {
        return "CustomerDto028{" +
            "custField000=" + custField000 + ", " +
            "custField001=" + custField001 + ", " +
            "custField002=" + custField002 + ", " +
            "custField003=" + custField003 + ", " +
            "custField004=" + custField004 + ", " +
            "}";
    }
}
