package com.pnb.customer;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * CustomerDto031 — Data Transfer Object for customer operations.
 * Variant 31 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomerDto031 {

    @DecimalMin(value = "0.00")
    @JsonProperty("custField000")
    private BigDecimal custField000;

    @JsonProperty("custField001")
    private Integer custField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("custField002")
    private BigDecimal custField002;

    @JsonProperty("custField003")
    private Long custField003;

    @JsonProperty("custField004")
    private Boolean custField004;

    @JsonProperty("custField005")
    private LocalDate custField005;

    @JsonProperty("custField006")
    private Boolean custField006;

    @JsonProperty("custField007")
    private Integer custField007;

    @Size(max = 200)
    @JsonProperty("custField008")
    private String custField008;

    @DecimalMin(value = "0.00")
    @JsonProperty("custField009")
    private BigDecimal custField009;

    @JsonProperty("custField010")
    private Integer custField010;

    @JsonProperty("custField011")
    private Boolean custField011;

    @JsonProperty("custField012")
    private Integer custField012;

    @JsonProperty("custField013")
    private Boolean custField013;

    @Size(max = 40)
    @JsonProperty("custField014")
    private String custField014;

    public CustomerDto031() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final CustomerDto031 instance = new CustomerDto031();

        public Builder custField000(BigDecimal val) { instance.custField000 = val; return this; }
        public Builder custField001(Integer val) { instance.custField001 = val; return this; }
        public Builder custField002(BigDecimal val) { instance.custField002 = val; return this; }
        public Builder custField003(Long val) { instance.custField003 = val; return this; }
        public Builder custField004(Boolean val) { instance.custField004 = val; return this; }
        public Builder custField005(LocalDate val) { instance.custField005 = val; return this; }
        public Builder custField006(Boolean val) { instance.custField006 = val; return this; }
        public Builder custField007(Integer val) { instance.custField007 = val; return this; }
        public Builder custField008(String val) { instance.custField008 = val; return this; }
        public Builder custField009(BigDecimal val) { instance.custField009 = val; return this; }
        public Builder custField010(Integer val) { instance.custField010 = val; return this; }
        public Builder custField011(Boolean val) { instance.custField011 = val; return this; }
        public Builder custField012(Integer val) { instance.custField012 = val; return this; }
        public Builder custField013(Boolean val) { instance.custField013 = val; return this; }
        public Builder custField014(String val) { instance.custField014 = val; return this; }
        public CustomerDto031 build() { return instance; }
    }

    public BigDecimal getCustField000() { return custField000; }
    public void setCustField000(BigDecimal custField000) { this.custField000 = custField000; }

    public Integer getCustField001() { return custField001; }
    public void setCustField001(Integer custField001) { this.custField001 = custField001; }

    public BigDecimal getCustField002() { return custField002; }
    public void setCustField002(BigDecimal custField002) { this.custField002 = custField002; }

    public Long getCustField003() { return custField003; }
    public void setCustField003(Long custField003) { this.custField003 = custField003; }

    public Boolean getCustField004() { return custField004; }
    public void setCustField004(Boolean custField004) { this.custField004 = custField004; }

    public LocalDate getCustField005() { return custField005; }
    public void setCustField005(LocalDate custField005) { this.custField005 = custField005; }

    public Boolean getCustField006() { return custField006; }
    public void setCustField006(Boolean custField006) { this.custField006 = custField006; }

    public Integer getCustField007() { return custField007; }
    public void setCustField007(Integer custField007) { this.custField007 = custField007; }

    public String getCustField008() { return custField008; }
    public void setCustField008(String custField008) { this.custField008 = custField008; }

    public BigDecimal getCustField009() { return custField009; }
    public void setCustField009(BigDecimal custField009) { this.custField009 = custField009; }

    public Integer getCustField010() { return custField010; }
    public void setCustField010(Integer custField010) { this.custField010 = custField010; }

    public Boolean getCustField011() { return custField011; }
    public void setCustField011(Boolean custField011) { this.custField011 = custField011; }

    public Integer getCustField012() { return custField012; }
    public void setCustField012(Integer custField012) { this.custField012 = custField012; }

    public Boolean getCustField013() { return custField013; }
    public void setCustField013(Boolean custField013) { this.custField013 = custField013; }

    public String getCustField014() { return custField014; }
    public void setCustField014(String custField014) { this.custField014 = custField014; }

    @Override
    public String toString() {
        return "CustomerDto031{" +
            "custField000=" + custField000 + ", " +
            "custField001=" + custField001 + ", " +
            "custField002=" + custField002 + ", " +
            "custField003=" + custField003 + ", " +
            "custField004=" + custField004 + ", " +
            "}";
    }
}
