package com.pnb.customer;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * CustomerDto055 — Data Transfer Object for customer operations.
 * Variant 55 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomerDto055 {

    @JsonProperty("custField000")
    private Boolean custField000;

    @JsonProperty("custField001")
    private LocalDate custField001;

    @JsonProperty("custField002")
    private Double custField002;

    @DecimalMin(value = "0.00")
    @JsonProperty("custField003")
    private BigDecimal custField003;

    @JsonProperty("custField004")
    private LocalDate custField004;

    @Size(max = 60)
    @JsonProperty("custField005")
    private String custField005;

    @Size(max = 200)
    @JsonProperty("custField006")
    private String custField006;

    @JsonProperty("custField007")
    private Long custField007;

    @JsonProperty("custField008")
    private Integer custField008;

    @JsonProperty("custField009")
    private Long custField009;

    @JsonProperty("custField010")
    private Boolean custField010;

    @JsonProperty("custField011")
    private Boolean custField011;

    @JsonProperty("custField012")
    private Double custField012;

    @JsonProperty("custField013")
    private Boolean custField013;

    @JsonProperty("custField014")
    private Double custField014;

    public CustomerDto055() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final CustomerDto055 instance = new CustomerDto055();

        public Builder custField000(Boolean val) { instance.custField000 = val; return this; }
        public Builder custField001(LocalDate val) { instance.custField001 = val; return this; }
        public Builder custField002(Double val) { instance.custField002 = val; return this; }
        public Builder custField003(BigDecimal val) { instance.custField003 = val; return this; }
        public Builder custField004(LocalDate val) { instance.custField004 = val; return this; }
        public Builder custField005(String val) { instance.custField005 = val; return this; }
        public Builder custField006(String val) { instance.custField006 = val; return this; }
        public Builder custField007(Long val) { instance.custField007 = val; return this; }
        public Builder custField008(Integer val) { instance.custField008 = val; return this; }
        public Builder custField009(Long val) { instance.custField009 = val; return this; }
        public Builder custField010(Boolean val) { instance.custField010 = val; return this; }
        public Builder custField011(Boolean val) { instance.custField011 = val; return this; }
        public Builder custField012(Double val) { instance.custField012 = val; return this; }
        public Builder custField013(Boolean val) { instance.custField013 = val; return this; }
        public Builder custField014(Double val) { instance.custField014 = val; return this; }
        public CustomerDto055 build() { return instance; }
    }

    public Boolean getCustField000() { return custField000; }
    public void setCustField000(Boolean custField000) { this.custField000 = custField000; }

    public LocalDate getCustField001() { return custField001; }
    public void setCustField001(LocalDate custField001) { this.custField001 = custField001; }

    public Double getCustField002() { return custField002; }
    public void setCustField002(Double custField002) { this.custField002 = custField002; }

    public BigDecimal getCustField003() { return custField003; }
    public void setCustField003(BigDecimal custField003) { this.custField003 = custField003; }

    public LocalDate getCustField004() { return custField004; }
    public void setCustField004(LocalDate custField004) { this.custField004 = custField004; }

    public String getCustField005() { return custField005; }
    public void setCustField005(String custField005) { this.custField005 = custField005; }

    public String getCustField006() { return custField006; }
    public void setCustField006(String custField006) { this.custField006 = custField006; }

    public Long getCustField007() { return custField007; }
    public void setCustField007(Long custField007) { this.custField007 = custField007; }

    public Integer getCustField008() { return custField008; }
    public void setCustField008(Integer custField008) { this.custField008 = custField008; }

    public Long getCustField009() { return custField009; }
    public void setCustField009(Long custField009) { this.custField009 = custField009; }

    public Boolean getCustField010() { return custField010; }
    public void setCustField010(Boolean custField010) { this.custField010 = custField010; }

    public Boolean getCustField011() { return custField011; }
    public void setCustField011(Boolean custField011) { this.custField011 = custField011; }

    public Double getCustField012() { return custField012; }
    public void setCustField012(Double custField012) { this.custField012 = custField012; }

    public Boolean getCustField013() { return custField013; }
    public void setCustField013(Boolean custField013) { this.custField013 = custField013; }

    public Double getCustField014() { return custField014; }
    public void setCustField014(Double custField014) { this.custField014 = custField014; }

    @Override
    public String toString() {
        return "CustomerDto055{" +
            "custField000=" + custField000 + ", " +
            "custField001=" + custField001 + ", " +
            "custField002=" + custField002 + ", " +
            "custField003=" + custField003 + ", " +
            "custField004=" + custField004 + ", " +
            "}";
    }
}
