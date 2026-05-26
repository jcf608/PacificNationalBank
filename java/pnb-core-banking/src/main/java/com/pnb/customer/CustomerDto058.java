package com.pnb.customer;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * CustomerDto058 — Data Transfer Object for customer operations.
 * Variant 58 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomerDto058 {

    @JsonProperty("custField000")
    private Long custField000;

    @JsonProperty("custField001")
    private Double custField001;

    @Size(max = 60)
    @JsonProperty("custField002")
    private String custField002;

    @Size(max = 200)
    @JsonProperty("custField003")
    private String custField003;

    @JsonProperty("custField004")
    private Double custField004;

    @JsonProperty("custField005")
    private Boolean custField005;

    @JsonProperty("custField006")
    private Long custField006;

    @Size(max = 60)
    @JsonProperty("custField007")
    private String custField007;

    @JsonProperty("custField008")
    private Double custField008;

    @Size(max = 40)
    @JsonProperty("custField009")
    private String custField009;

    @JsonProperty("custField010")
    private LocalDate custField010;

    @Size(max = 20)
    @JsonProperty("custField011")
    private String custField011;

    @JsonProperty("custField012")
    private Boolean custField012;

    @JsonProperty("custField013")
    private Double custField013;

    @JsonProperty("custField014")
    private Integer custField014;

    @Size(max = 20)
    @JsonProperty("custField015")
    private String custField015;

    @DecimalMin(value = "0.00")
    @JsonProperty("custField016")
    private BigDecimal custField016;

    @DecimalMin(value = "0.00")
    @JsonProperty("custField017")
    private BigDecimal custField017;

    public CustomerDto058() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final CustomerDto058 instance = new CustomerDto058();

        public Builder custField000(Long val) { instance.custField000 = val; return this; }
        public Builder custField001(Double val) { instance.custField001 = val; return this; }
        public Builder custField002(String val) { instance.custField002 = val; return this; }
        public Builder custField003(String val) { instance.custField003 = val; return this; }
        public Builder custField004(Double val) { instance.custField004 = val; return this; }
        public Builder custField005(Boolean val) { instance.custField005 = val; return this; }
        public Builder custField006(Long val) { instance.custField006 = val; return this; }
        public Builder custField007(String val) { instance.custField007 = val; return this; }
        public Builder custField008(Double val) { instance.custField008 = val; return this; }
        public Builder custField009(String val) { instance.custField009 = val; return this; }
        public Builder custField010(LocalDate val) { instance.custField010 = val; return this; }
        public Builder custField011(String val) { instance.custField011 = val; return this; }
        public Builder custField012(Boolean val) { instance.custField012 = val; return this; }
        public Builder custField013(Double val) { instance.custField013 = val; return this; }
        public Builder custField014(Integer val) { instance.custField014 = val; return this; }
        public Builder custField015(String val) { instance.custField015 = val; return this; }
        public Builder custField016(BigDecimal val) { instance.custField016 = val; return this; }
        public Builder custField017(BigDecimal val) { instance.custField017 = val; return this; }
        public CustomerDto058 build() { return instance; }
    }

    public Long getCustField000() { return custField000; }
    public void setCustField000(Long custField000) { this.custField000 = custField000; }

    public Double getCustField001() { return custField001; }
    public void setCustField001(Double custField001) { this.custField001 = custField001; }

    public String getCustField002() { return custField002; }
    public void setCustField002(String custField002) { this.custField002 = custField002; }

    public String getCustField003() { return custField003; }
    public void setCustField003(String custField003) { this.custField003 = custField003; }

    public Double getCustField004() { return custField004; }
    public void setCustField004(Double custField004) { this.custField004 = custField004; }

    public Boolean getCustField005() { return custField005; }
    public void setCustField005(Boolean custField005) { this.custField005 = custField005; }

    public Long getCustField006() { return custField006; }
    public void setCustField006(Long custField006) { this.custField006 = custField006; }

    public String getCustField007() { return custField007; }
    public void setCustField007(String custField007) { this.custField007 = custField007; }

    public Double getCustField008() { return custField008; }
    public void setCustField008(Double custField008) { this.custField008 = custField008; }

    public String getCustField009() { return custField009; }
    public void setCustField009(String custField009) { this.custField009 = custField009; }

    public LocalDate getCustField010() { return custField010; }
    public void setCustField010(LocalDate custField010) { this.custField010 = custField010; }

    public String getCustField011() { return custField011; }
    public void setCustField011(String custField011) { this.custField011 = custField011; }

    public Boolean getCustField012() { return custField012; }
    public void setCustField012(Boolean custField012) { this.custField012 = custField012; }

    public Double getCustField013() { return custField013; }
    public void setCustField013(Double custField013) { this.custField013 = custField013; }

    public Integer getCustField014() { return custField014; }
    public void setCustField014(Integer custField014) { this.custField014 = custField014; }

    public String getCustField015() { return custField015; }
    public void setCustField015(String custField015) { this.custField015 = custField015; }

    public BigDecimal getCustField016() { return custField016; }
    public void setCustField016(BigDecimal custField016) { this.custField016 = custField016; }

    public BigDecimal getCustField017() { return custField017; }
    public void setCustField017(BigDecimal custField017) { this.custField017 = custField017; }

    @Override
    public String toString() {
        return "CustomerDto058{" +
            "custField000=" + custField000 + ", " +
            "custField001=" + custField001 + ", " +
            "custField002=" + custField002 + ", " +
            "custField003=" + custField003 + ", " +
            "custField004=" + custField004 + ", " +
            "}";
    }
}
