package com.pnb.customer;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * CustomerDto022 — Data Transfer Object for customer operations.
 * Variant 22 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomerDto022 {

    @JsonProperty("custField000")
    private Integer custField000;

    @Size(max = 200)
    @JsonProperty("custField001")
    private String custField001;

    @JsonProperty("custField002")
    private Boolean custField002;

    @JsonProperty("custField003")
    private LocalDate custField003;

    @JsonProperty("custField004")
    private Boolean custField004;

    @Size(max = 20)
    @JsonProperty("custField005")
    private String custField005;

    @JsonProperty("custField006")
    private Double custField006;

    @JsonProperty("custField007")
    private LocalDate custField007;

    @JsonProperty("custField008")
    private Long custField008;

    @JsonProperty("custField009")
    private Boolean custField009;

    @JsonProperty("custField010")
    private Boolean custField010;

    @DecimalMin(value = "0.00")
    @JsonProperty("custField011")
    private BigDecimal custField011;

    @JsonProperty("custField012")
    private LocalDate custField012;

    @JsonProperty("custField013")
    private Boolean custField013;

    @DecimalMin(value = "0.00")
    @JsonProperty("custField014")
    private BigDecimal custField014;

    @DecimalMin(value = "0.00")
    @JsonProperty("custField015")
    private BigDecimal custField015;

    @JsonProperty("custField016")
    private Double custField016;

    @JsonProperty("custField017")
    private Boolean custField017;

    public CustomerDto022() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final CustomerDto022 instance = new CustomerDto022();

        public Builder custField000(Integer val) { instance.custField000 = val; return this; }
        public Builder custField001(String val) { instance.custField001 = val; return this; }
        public Builder custField002(Boolean val) { instance.custField002 = val; return this; }
        public Builder custField003(LocalDate val) { instance.custField003 = val; return this; }
        public Builder custField004(Boolean val) { instance.custField004 = val; return this; }
        public Builder custField005(String val) { instance.custField005 = val; return this; }
        public Builder custField006(Double val) { instance.custField006 = val; return this; }
        public Builder custField007(LocalDate val) { instance.custField007 = val; return this; }
        public Builder custField008(Long val) { instance.custField008 = val; return this; }
        public Builder custField009(Boolean val) { instance.custField009 = val; return this; }
        public Builder custField010(Boolean val) { instance.custField010 = val; return this; }
        public Builder custField011(BigDecimal val) { instance.custField011 = val; return this; }
        public Builder custField012(LocalDate val) { instance.custField012 = val; return this; }
        public Builder custField013(Boolean val) { instance.custField013 = val; return this; }
        public Builder custField014(BigDecimal val) { instance.custField014 = val; return this; }
        public Builder custField015(BigDecimal val) { instance.custField015 = val; return this; }
        public Builder custField016(Double val) { instance.custField016 = val; return this; }
        public Builder custField017(Boolean val) { instance.custField017 = val; return this; }
        public CustomerDto022 build() { return instance; }
    }

    public Integer getCustField000() { return custField000; }
    public void setCustField000(Integer custField000) { this.custField000 = custField000; }

    public String getCustField001() { return custField001; }
    public void setCustField001(String custField001) { this.custField001 = custField001; }

    public Boolean getCustField002() { return custField002; }
    public void setCustField002(Boolean custField002) { this.custField002 = custField002; }

    public LocalDate getCustField003() { return custField003; }
    public void setCustField003(LocalDate custField003) { this.custField003 = custField003; }

    public Boolean getCustField004() { return custField004; }
    public void setCustField004(Boolean custField004) { this.custField004 = custField004; }

    public String getCustField005() { return custField005; }
    public void setCustField005(String custField005) { this.custField005 = custField005; }

    public Double getCustField006() { return custField006; }
    public void setCustField006(Double custField006) { this.custField006 = custField006; }

    public LocalDate getCustField007() { return custField007; }
    public void setCustField007(LocalDate custField007) { this.custField007 = custField007; }

    public Long getCustField008() { return custField008; }
    public void setCustField008(Long custField008) { this.custField008 = custField008; }

    public Boolean getCustField009() { return custField009; }
    public void setCustField009(Boolean custField009) { this.custField009 = custField009; }

    public Boolean getCustField010() { return custField010; }
    public void setCustField010(Boolean custField010) { this.custField010 = custField010; }

    public BigDecimal getCustField011() { return custField011; }
    public void setCustField011(BigDecimal custField011) { this.custField011 = custField011; }

    public LocalDate getCustField012() { return custField012; }
    public void setCustField012(LocalDate custField012) { this.custField012 = custField012; }

    public Boolean getCustField013() { return custField013; }
    public void setCustField013(Boolean custField013) { this.custField013 = custField013; }

    public BigDecimal getCustField014() { return custField014; }
    public void setCustField014(BigDecimal custField014) { this.custField014 = custField014; }

    public BigDecimal getCustField015() { return custField015; }
    public void setCustField015(BigDecimal custField015) { this.custField015 = custField015; }

    public Double getCustField016() { return custField016; }
    public void setCustField016(Double custField016) { this.custField016 = custField016; }

    public Boolean getCustField017() { return custField017; }
    public void setCustField017(Boolean custField017) { this.custField017 = custField017; }

    @Override
    public String toString() {
        return "CustomerDto022{" +
            "custField000=" + custField000 + ", " +
            "custField001=" + custField001 + ", " +
            "custField002=" + custField002 + ", " +
            "custField003=" + custField003 + ", " +
            "custField004=" + custField004 + ", " +
            "}";
    }
}
