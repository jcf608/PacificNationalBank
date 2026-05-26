package com.pnb.customer;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * CustomerDto029 — Data Transfer Object for customer operations.
 * Variant 29 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomerDto029 {

    @JsonProperty("custField000")
    private Long custField000;

    @JsonProperty("custField001")
    private Double custField001;

    @JsonProperty("custField002")
    private Long custField002;

    @JsonProperty("custField003")
    private LocalDate custField003;

    @JsonProperty("custField004")
    private Integer custField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("custField005")
    private BigDecimal custField005;

    @Size(max = 200)
    @JsonProperty("custField006")
    private String custField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("custField007")
    private BigDecimal custField007;

    @JsonProperty("custField008")
    private Integer custField008;

    @JsonProperty("custField009")
    private LocalDate custField009;

    @JsonProperty("custField010")
    private Long custField010;

    @JsonProperty("custField011")
    private LocalDate custField011;

    @JsonProperty("custField012")
    private Integer custField012;

    public CustomerDto029() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final CustomerDto029 instance = new CustomerDto029();

        public Builder custField000(Long val) { instance.custField000 = val; return this; }
        public Builder custField001(Double val) { instance.custField001 = val; return this; }
        public Builder custField002(Long val) { instance.custField002 = val; return this; }
        public Builder custField003(LocalDate val) { instance.custField003 = val; return this; }
        public Builder custField004(Integer val) { instance.custField004 = val; return this; }
        public Builder custField005(BigDecimal val) { instance.custField005 = val; return this; }
        public Builder custField006(String val) { instance.custField006 = val; return this; }
        public Builder custField007(BigDecimal val) { instance.custField007 = val; return this; }
        public Builder custField008(Integer val) { instance.custField008 = val; return this; }
        public Builder custField009(LocalDate val) { instance.custField009 = val; return this; }
        public Builder custField010(Long val) { instance.custField010 = val; return this; }
        public Builder custField011(LocalDate val) { instance.custField011 = val; return this; }
        public Builder custField012(Integer val) { instance.custField012 = val; return this; }
        public CustomerDto029 build() { return instance; }
    }

    public Long getCustField000() { return custField000; }
    public void setCustField000(Long custField000) { this.custField000 = custField000; }

    public Double getCustField001() { return custField001; }
    public void setCustField001(Double custField001) { this.custField001 = custField001; }

    public Long getCustField002() { return custField002; }
    public void setCustField002(Long custField002) { this.custField002 = custField002; }

    public LocalDate getCustField003() { return custField003; }
    public void setCustField003(LocalDate custField003) { this.custField003 = custField003; }

    public Integer getCustField004() { return custField004; }
    public void setCustField004(Integer custField004) { this.custField004 = custField004; }

    public BigDecimal getCustField005() { return custField005; }
    public void setCustField005(BigDecimal custField005) { this.custField005 = custField005; }

    public String getCustField006() { return custField006; }
    public void setCustField006(String custField006) { this.custField006 = custField006; }

    public BigDecimal getCustField007() { return custField007; }
    public void setCustField007(BigDecimal custField007) { this.custField007 = custField007; }

    public Integer getCustField008() { return custField008; }
    public void setCustField008(Integer custField008) { this.custField008 = custField008; }

    public LocalDate getCustField009() { return custField009; }
    public void setCustField009(LocalDate custField009) { this.custField009 = custField009; }

    public Long getCustField010() { return custField010; }
    public void setCustField010(Long custField010) { this.custField010 = custField010; }

    public LocalDate getCustField011() { return custField011; }
    public void setCustField011(LocalDate custField011) { this.custField011 = custField011; }

    public Integer getCustField012() { return custField012; }
    public void setCustField012(Integer custField012) { this.custField012 = custField012; }

    @Override
    public String toString() {
        return "CustomerDto029{" +
            "custField000=" + custField000 + ", " +
            "custField001=" + custField001 + ", " +
            "custField002=" + custField002 + ", " +
            "custField003=" + custField003 + ", " +
            "custField004=" + custField004 + ", " +
            "}";
    }
}
