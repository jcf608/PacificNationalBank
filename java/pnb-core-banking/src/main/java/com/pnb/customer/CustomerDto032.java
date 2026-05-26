package com.pnb.customer;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * CustomerDto032 — Data Transfer Object for customer operations.
 * Variant 32 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomerDto032 {

    @JsonProperty("custField000")
    private Double custField000;

    @Size(max = 200)
    @JsonProperty("custField001")
    private String custField001;

    @JsonProperty("custField002")
    private Long custField002;

    @Size(max = 40)
    @JsonProperty("custField003")
    private String custField003;

    @JsonProperty("custField004")
    private Double custField004;

    @JsonProperty("custField005")
    private LocalDate custField005;

    @JsonProperty("custField006")
    private Integer custField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("custField007")
    private BigDecimal custField007;

    @JsonProperty("custField008")
    private Double custField008;

    @JsonProperty("custField009")
    private Long custField009;

    @JsonProperty("custField010")
    private Boolean custField010;

    @Size(max = 40)
    @JsonProperty("custField011")
    private String custField011;

    @JsonProperty("custField012")
    private Boolean custField012;

    @Size(max = 100)
    @JsonProperty("custField013")
    private String custField013;

    @JsonProperty("custField014")
    private LocalDate custField014;

    @JsonProperty("custField015")
    private Double custField015;

    public CustomerDto032() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final CustomerDto032 instance = new CustomerDto032();

        public Builder custField000(Double val) { instance.custField000 = val; return this; }
        public Builder custField001(String val) { instance.custField001 = val; return this; }
        public Builder custField002(Long val) { instance.custField002 = val; return this; }
        public Builder custField003(String val) { instance.custField003 = val; return this; }
        public Builder custField004(Double val) { instance.custField004 = val; return this; }
        public Builder custField005(LocalDate val) { instance.custField005 = val; return this; }
        public Builder custField006(Integer val) { instance.custField006 = val; return this; }
        public Builder custField007(BigDecimal val) { instance.custField007 = val; return this; }
        public Builder custField008(Double val) { instance.custField008 = val; return this; }
        public Builder custField009(Long val) { instance.custField009 = val; return this; }
        public Builder custField010(Boolean val) { instance.custField010 = val; return this; }
        public Builder custField011(String val) { instance.custField011 = val; return this; }
        public Builder custField012(Boolean val) { instance.custField012 = val; return this; }
        public Builder custField013(String val) { instance.custField013 = val; return this; }
        public Builder custField014(LocalDate val) { instance.custField014 = val; return this; }
        public Builder custField015(Double val) { instance.custField015 = val; return this; }
        public CustomerDto032 build() { return instance; }
    }

    public Double getCustField000() { return custField000; }
    public void setCustField000(Double custField000) { this.custField000 = custField000; }

    public String getCustField001() { return custField001; }
    public void setCustField001(String custField001) { this.custField001 = custField001; }

    public Long getCustField002() { return custField002; }
    public void setCustField002(Long custField002) { this.custField002 = custField002; }

    public String getCustField003() { return custField003; }
    public void setCustField003(String custField003) { this.custField003 = custField003; }

    public Double getCustField004() { return custField004; }
    public void setCustField004(Double custField004) { this.custField004 = custField004; }

    public LocalDate getCustField005() { return custField005; }
    public void setCustField005(LocalDate custField005) { this.custField005 = custField005; }

    public Integer getCustField006() { return custField006; }
    public void setCustField006(Integer custField006) { this.custField006 = custField006; }

    public BigDecimal getCustField007() { return custField007; }
    public void setCustField007(BigDecimal custField007) { this.custField007 = custField007; }

    public Double getCustField008() { return custField008; }
    public void setCustField008(Double custField008) { this.custField008 = custField008; }

    public Long getCustField009() { return custField009; }
    public void setCustField009(Long custField009) { this.custField009 = custField009; }

    public Boolean getCustField010() { return custField010; }
    public void setCustField010(Boolean custField010) { this.custField010 = custField010; }

    public String getCustField011() { return custField011; }
    public void setCustField011(String custField011) { this.custField011 = custField011; }

    public Boolean getCustField012() { return custField012; }
    public void setCustField012(Boolean custField012) { this.custField012 = custField012; }

    public String getCustField013() { return custField013; }
    public void setCustField013(String custField013) { this.custField013 = custField013; }

    public LocalDate getCustField014() { return custField014; }
    public void setCustField014(LocalDate custField014) { this.custField014 = custField014; }

    public Double getCustField015() { return custField015; }
    public void setCustField015(Double custField015) { this.custField015 = custField015; }

    @Override
    public String toString() {
        return "CustomerDto032{" +
            "custField000=" + custField000 + ", " +
            "custField001=" + custField001 + ", " +
            "custField002=" + custField002 + ", " +
            "custField003=" + custField003 + ", " +
            "custField004=" + custField004 + ", " +
            "}";
    }
}
