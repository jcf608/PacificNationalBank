package com.pnb.customer;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * CustomerDto030 — Data Transfer Object for customer operations.
 * Variant 30 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomerDto030 {

    @JsonProperty("custField000")
    private Integer custField000;

    @JsonProperty("custField001")
    private Boolean custField001;

    @Size(max = 20)
    @JsonProperty("custField002")
    private String custField002;

    @JsonProperty("custField003")
    private Boolean custField003;

    @JsonProperty("custField004")
    private Double custField004;

    @JsonProperty("custField005")
    private Boolean custField005;

    @JsonProperty("custField006")
    private Integer custField006;

    @JsonProperty("custField007")
    private Long custField007;

    @JsonProperty("custField008")
    private Boolean custField008;

    @Size(max = 20)
    @JsonProperty("custField009")
    private String custField009;

    @JsonProperty("custField010")
    private Long custField010;

    @Size(max = 100)
    @JsonProperty("custField011")
    private String custField011;

    @JsonProperty("custField012")
    private Double custField012;

    @DecimalMin(value = "0.00")
    @JsonProperty("custField013")
    private BigDecimal custField013;

    public CustomerDto030() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final CustomerDto030 instance = new CustomerDto030();

        public Builder custField000(Integer val) { instance.custField000 = val; return this; }
        public Builder custField001(Boolean val) { instance.custField001 = val; return this; }
        public Builder custField002(String val) { instance.custField002 = val; return this; }
        public Builder custField003(Boolean val) { instance.custField003 = val; return this; }
        public Builder custField004(Double val) { instance.custField004 = val; return this; }
        public Builder custField005(Boolean val) { instance.custField005 = val; return this; }
        public Builder custField006(Integer val) { instance.custField006 = val; return this; }
        public Builder custField007(Long val) { instance.custField007 = val; return this; }
        public Builder custField008(Boolean val) { instance.custField008 = val; return this; }
        public Builder custField009(String val) { instance.custField009 = val; return this; }
        public Builder custField010(Long val) { instance.custField010 = val; return this; }
        public Builder custField011(String val) { instance.custField011 = val; return this; }
        public Builder custField012(Double val) { instance.custField012 = val; return this; }
        public Builder custField013(BigDecimal val) { instance.custField013 = val; return this; }
        public CustomerDto030 build() { return instance; }
    }

    public Integer getCustField000() { return custField000; }
    public void setCustField000(Integer custField000) { this.custField000 = custField000; }

    public Boolean getCustField001() { return custField001; }
    public void setCustField001(Boolean custField001) { this.custField001 = custField001; }

    public String getCustField002() { return custField002; }
    public void setCustField002(String custField002) { this.custField002 = custField002; }

    public Boolean getCustField003() { return custField003; }
    public void setCustField003(Boolean custField003) { this.custField003 = custField003; }

    public Double getCustField004() { return custField004; }
    public void setCustField004(Double custField004) { this.custField004 = custField004; }

    public Boolean getCustField005() { return custField005; }
    public void setCustField005(Boolean custField005) { this.custField005 = custField005; }

    public Integer getCustField006() { return custField006; }
    public void setCustField006(Integer custField006) { this.custField006 = custField006; }

    public Long getCustField007() { return custField007; }
    public void setCustField007(Long custField007) { this.custField007 = custField007; }

    public Boolean getCustField008() { return custField008; }
    public void setCustField008(Boolean custField008) { this.custField008 = custField008; }

    public String getCustField009() { return custField009; }
    public void setCustField009(String custField009) { this.custField009 = custField009; }

    public Long getCustField010() { return custField010; }
    public void setCustField010(Long custField010) { this.custField010 = custField010; }

    public String getCustField011() { return custField011; }
    public void setCustField011(String custField011) { this.custField011 = custField011; }

    public Double getCustField012() { return custField012; }
    public void setCustField012(Double custField012) { this.custField012 = custField012; }

    public BigDecimal getCustField013() { return custField013; }
    public void setCustField013(BigDecimal custField013) { this.custField013 = custField013; }

    @Override
    public String toString() {
        return "CustomerDto030{" +
            "custField000=" + custField000 + ", " +
            "custField001=" + custField001 + ", " +
            "custField002=" + custField002 + ", " +
            "custField003=" + custField003 + ", " +
            "custField004=" + custField004 + ", " +
            "}";
    }
}
