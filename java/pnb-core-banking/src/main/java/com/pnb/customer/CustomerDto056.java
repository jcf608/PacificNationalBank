package com.pnb.customer;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * CustomerDto056 — Data Transfer Object for customer operations.
 * Variant 56 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomerDto056 {

    @DecimalMin(value = "0.00")
    @JsonProperty("custField000")
    private BigDecimal custField000;

    @Size(max = 200)
    @JsonProperty("custField001")
    private String custField001;

    @JsonProperty("custField002")
    private Double custField002;

    @JsonProperty("custField003")
    private Double custField003;

    @JsonProperty("custField004")
    private Double custField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("custField005")
    private BigDecimal custField005;

    @JsonProperty("custField006")
    private Double custField006;

    @JsonProperty("custField007")
    private Integer custField007;

    @JsonProperty("custField008")
    private Integer custField008;

    @JsonProperty("custField009")
    private LocalDate custField009;

    @JsonProperty("custField010")
    private LocalDate custField010;

    @JsonProperty("custField011")
    private Integer custField011;

    @JsonProperty("custField012")
    private Long custField012;

    @Size(max = 60)
    @JsonProperty("custField013")
    private String custField013;

    @JsonProperty("custField014")
    private Long custField014;

    @JsonProperty("custField015")
    private Boolean custField015;

    public CustomerDto056() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final CustomerDto056 instance = new CustomerDto056();

        public Builder custField000(BigDecimal val) { instance.custField000 = val; return this; }
        public Builder custField001(String val) { instance.custField001 = val; return this; }
        public Builder custField002(Double val) { instance.custField002 = val; return this; }
        public Builder custField003(Double val) { instance.custField003 = val; return this; }
        public Builder custField004(Double val) { instance.custField004 = val; return this; }
        public Builder custField005(BigDecimal val) { instance.custField005 = val; return this; }
        public Builder custField006(Double val) { instance.custField006 = val; return this; }
        public Builder custField007(Integer val) { instance.custField007 = val; return this; }
        public Builder custField008(Integer val) { instance.custField008 = val; return this; }
        public Builder custField009(LocalDate val) { instance.custField009 = val; return this; }
        public Builder custField010(LocalDate val) { instance.custField010 = val; return this; }
        public Builder custField011(Integer val) { instance.custField011 = val; return this; }
        public Builder custField012(Long val) { instance.custField012 = val; return this; }
        public Builder custField013(String val) { instance.custField013 = val; return this; }
        public Builder custField014(Long val) { instance.custField014 = val; return this; }
        public Builder custField015(Boolean val) { instance.custField015 = val; return this; }
        public CustomerDto056 build() { return instance; }
    }

    public BigDecimal getCustField000() { return custField000; }
    public void setCustField000(BigDecimal custField000) { this.custField000 = custField000; }

    public String getCustField001() { return custField001; }
    public void setCustField001(String custField001) { this.custField001 = custField001; }

    public Double getCustField002() { return custField002; }
    public void setCustField002(Double custField002) { this.custField002 = custField002; }

    public Double getCustField003() { return custField003; }
    public void setCustField003(Double custField003) { this.custField003 = custField003; }

    public Double getCustField004() { return custField004; }
    public void setCustField004(Double custField004) { this.custField004 = custField004; }

    public BigDecimal getCustField005() { return custField005; }
    public void setCustField005(BigDecimal custField005) { this.custField005 = custField005; }

    public Double getCustField006() { return custField006; }
    public void setCustField006(Double custField006) { this.custField006 = custField006; }

    public Integer getCustField007() { return custField007; }
    public void setCustField007(Integer custField007) { this.custField007 = custField007; }

    public Integer getCustField008() { return custField008; }
    public void setCustField008(Integer custField008) { this.custField008 = custField008; }

    public LocalDate getCustField009() { return custField009; }
    public void setCustField009(LocalDate custField009) { this.custField009 = custField009; }

    public LocalDate getCustField010() { return custField010; }
    public void setCustField010(LocalDate custField010) { this.custField010 = custField010; }

    public Integer getCustField011() { return custField011; }
    public void setCustField011(Integer custField011) { this.custField011 = custField011; }

    public Long getCustField012() { return custField012; }
    public void setCustField012(Long custField012) { this.custField012 = custField012; }

    public String getCustField013() { return custField013; }
    public void setCustField013(String custField013) { this.custField013 = custField013; }

    public Long getCustField014() { return custField014; }
    public void setCustField014(Long custField014) { this.custField014 = custField014; }

    public Boolean getCustField015() { return custField015; }
    public void setCustField015(Boolean custField015) { this.custField015 = custField015; }

    @Override
    public String toString() {
        return "CustomerDto056{" +
            "custField000=" + custField000 + ", " +
            "custField001=" + custField001 + ", " +
            "custField002=" + custField002 + ", " +
            "custField003=" + custField003 + ", " +
            "custField004=" + custField004 + ", " +
            "}";
    }
}
