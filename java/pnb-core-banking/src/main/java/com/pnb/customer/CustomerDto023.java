package com.pnb.customer;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * CustomerDto023 — Data Transfer Object for customer operations.
 * Variant 23 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomerDto023 {

    @JsonProperty("custField000")
    private Integer custField000;

    @DecimalMin(value = "0.00")
    @JsonProperty("custField001")
    private BigDecimal custField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("custField002")
    private BigDecimal custField002;

    @JsonProperty("custField003")
    private LocalDate custField003;

    @JsonProperty("custField004")
    private Long custField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("custField005")
    private BigDecimal custField005;

    @JsonProperty("custField006")
    private Boolean custField006;

    @Size(max = 40)
    @JsonProperty("custField007")
    private String custField007;

    @JsonProperty("custField008")
    private Integer custField008;

    @DecimalMin(value = "0.00")
    @JsonProperty("custField009")
    private BigDecimal custField009;

    @DecimalMin(value = "0.00")
    @JsonProperty("custField010")
    private BigDecimal custField010;

    @JsonProperty("custField011")
    private Long custField011;

    @JsonProperty("custField012")
    private Double custField012;

    @JsonProperty("custField013")
    private Double custField013;

    @JsonProperty("custField014")
    private LocalDate custField014;

    @Size(max = 200)
    @JsonProperty("custField015")
    private String custField015;

    @JsonProperty("custField016")
    private Boolean custField016;

    @DecimalMin(value = "0.00")
    @JsonProperty("custField017")
    private BigDecimal custField017;

    @JsonProperty("custField018")
    private Long custField018;

    public CustomerDto023() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final CustomerDto023 instance = new CustomerDto023();

        public Builder custField000(Integer val) { instance.custField000 = val; return this; }
        public Builder custField001(BigDecimal val) { instance.custField001 = val; return this; }
        public Builder custField002(BigDecimal val) { instance.custField002 = val; return this; }
        public Builder custField003(LocalDate val) { instance.custField003 = val; return this; }
        public Builder custField004(Long val) { instance.custField004 = val; return this; }
        public Builder custField005(BigDecimal val) { instance.custField005 = val; return this; }
        public Builder custField006(Boolean val) { instance.custField006 = val; return this; }
        public Builder custField007(String val) { instance.custField007 = val; return this; }
        public Builder custField008(Integer val) { instance.custField008 = val; return this; }
        public Builder custField009(BigDecimal val) { instance.custField009 = val; return this; }
        public Builder custField010(BigDecimal val) { instance.custField010 = val; return this; }
        public Builder custField011(Long val) { instance.custField011 = val; return this; }
        public Builder custField012(Double val) { instance.custField012 = val; return this; }
        public Builder custField013(Double val) { instance.custField013 = val; return this; }
        public Builder custField014(LocalDate val) { instance.custField014 = val; return this; }
        public Builder custField015(String val) { instance.custField015 = val; return this; }
        public Builder custField016(Boolean val) { instance.custField016 = val; return this; }
        public Builder custField017(BigDecimal val) { instance.custField017 = val; return this; }
        public Builder custField018(Long val) { instance.custField018 = val; return this; }
        public CustomerDto023 build() { return instance; }
    }

    public Integer getCustField000() { return custField000; }
    public void setCustField000(Integer custField000) { this.custField000 = custField000; }

    public BigDecimal getCustField001() { return custField001; }
    public void setCustField001(BigDecimal custField001) { this.custField001 = custField001; }

    public BigDecimal getCustField002() { return custField002; }
    public void setCustField002(BigDecimal custField002) { this.custField002 = custField002; }

    public LocalDate getCustField003() { return custField003; }
    public void setCustField003(LocalDate custField003) { this.custField003 = custField003; }

    public Long getCustField004() { return custField004; }
    public void setCustField004(Long custField004) { this.custField004 = custField004; }

    public BigDecimal getCustField005() { return custField005; }
    public void setCustField005(BigDecimal custField005) { this.custField005 = custField005; }

    public Boolean getCustField006() { return custField006; }
    public void setCustField006(Boolean custField006) { this.custField006 = custField006; }

    public String getCustField007() { return custField007; }
    public void setCustField007(String custField007) { this.custField007 = custField007; }

    public Integer getCustField008() { return custField008; }
    public void setCustField008(Integer custField008) { this.custField008 = custField008; }

    public BigDecimal getCustField009() { return custField009; }
    public void setCustField009(BigDecimal custField009) { this.custField009 = custField009; }

    public BigDecimal getCustField010() { return custField010; }
    public void setCustField010(BigDecimal custField010) { this.custField010 = custField010; }

    public Long getCustField011() { return custField011; }
    public void setCustField011(Long custField011) { this.custField011 = custField011; }

    public Double getCustField012() { return custField012; }
    public void setCustField012(Double custField012) { this.custField012 = custField012; }

    public Double getCustField013() { return custField013; }
    public void setCustField013(Double custField013) { this.custField013 = custField013; }

    public LocalDate getCustField014() { return custField014; }
    public void setCustField014(LocalDate custField014) { this.custField014 = custField014; }

    public String getCustField015() { return custField015; }
    public void setCustField015(String custField015) { this.custField015 = custField015; }

    public Boolean getCustField016() { return custField016; }
    public void setCustField016(Boolean custField016) { this.custField016 = custField016; }

    public BigDecimal getCustField017() { return custField017; }
    public void setCustField017(BigDecimal custField017) { this.custField017 = custField017; }

    public Long getCustField018() { return custField018; }
    public void setCustField018(Long custField018) { this.custField018 = custField018; }

    @Override
    public String toString() {
        return "CustomerDto023{" +
            "custField000=" + custField000 + ", " +
            "custField001=" + custField001 + ", " +
            "custField002=" + custField002 + ", " +
            "custField003=" + custField003 + ", " +
            "custField004=" + custField004 + ", " +
            "}";
    }
}
