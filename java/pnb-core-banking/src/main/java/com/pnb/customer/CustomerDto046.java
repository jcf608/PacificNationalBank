package com.pnb.customer;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * CustomerDto046 — Data Transfer Object for customer operations.
 * Variant 46 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomerDto046 {

    @JsonProperty("custField000")
    private Boolean custField000;

    @JsonProperty("custField001")
    private Double custField001;

    @JsonProperty("custField002")
    private Double custField002;

    @JsonProperty("custField003")
    private Long custField003;

    @Size(max = 60)
    @JsonProperty("custField004")
    private String custField004;

    @JsonProperty("custField005")
    private Integer custField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("custField006")
    private BigDecimal custField006;

    @Size(max = 200)
    @JsonProperty("custField007")
    private String custField007;

    @JsonProperty("custField008")
    private Boolean custField008;

    @JsonProperty("custField009")
    private LocalDate custField009;

    @JsonProperty("custField010")
    private Long custField010;

    @JsonProperty("custField011")
    private LocalDate custField011;

    @JsonProperty("custField012")
    private Long custField012;

    @JsonProperty("custField013")
    private Double custField013;

    @JsonProperty("custField014")
    private Integer custField014;

    @JsonProperty("custField015")
    private Long custField015;

    @JsonProperty("custField016")
    private Long custField016;

    @Size(max = 200)
    @JsonProperty("custField017")
    private String custField017;

    public CustomerDto046() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final CustomerDto046 instance = new CustomerDto046();

        public Builder custField000(Boolean val) { instance.custField000 = val; return this; }
        public Builder custField001(Double val) { instance.custField001 = val; return this; }
        public Builder custField002(Double val) { instance.custField002 = val; return this; }
        public Builder custField003(Long val) { instance.custField003 = val; return this; }
        public Builder custField004(String val) { instance.custField004 = val; return this; }
        public Builder custField005(Integer val) { instance.custField005 = val; return this; }
        public Builder custField006(BigDecimal val) { instance.custField006 = val; return this; }
        public Builder custField007(String val) { instance.custField007 = val; return this; }
        public Builder custField008(Boolean val) { instance.custField008 = val; return this; }
        public Builder custField009(LocalDate val) { instance.custField009 = val; return this; }
        public Builder custField010(Long val) { instance.custField010 = val; return this; }
        public Builder custField011(LocalDate val) { instance.custField011 = val; return this; }
        public Builder custField012(Long val) { instance.custField012 = val; return this; }
        public Builder custField013(Double val) { instance.custField013 = val; return this; }
        public Builder custField014(Integer val) { instance.custField014 = val; return this; }
        public Builder custField015(Long val) { instance.custField015 = val; return this; }
        public Builder custField016(Long val) { instance.custField016 = val; return this; }
        public Builder custField017(String val) { instance.custField017 = val; return this; }
        public CustomerDto046 build() { return instance; }
    }

    public Boolean getCustField000() { return custField000; }
    public void setCustField000(Boolean custField000) { this.custField000 = custField000; }

    public Double getCustField001() { return custField001; }
    public void setCustField001(Double custField001) { this.custField001 = custField001; }

    public Double getCustField002() { return custField002; }
    public void setCustField002(Double custField002) { this.custField002 = custField002; }

    public Long getCustField003() { return custField003; }
    public void setCustField003(Long custField003) { this.custField003 = custField003; }

    public String getCustField004() { return custField004; }
    public void setCustField004(String custField004) { this.custField004 = custField004; }

    public Integer getCustField005() { return custField005; }
    public void setCustField005(Integer custField005) { this.custField005 = custField005; }

    public BigDecimal getCustField006() { return custField006; }
    public void setCustField006(BigDecimal custField006) { this.custField006 = custField006; }

    public String getCustField007() { return custField007; }
    public void setCustField007(String custField007) { this.custField007 = custField007; }

    public Boolean getCustField008() { return custField008; }
    public void setCustField008(Boolean custField008) { this.custField008 = custField008; }

    public LocalDate getCustField009() { return custField009; }
    public void setCustField009(LocalDate custField009) { this.custField009 = custField009; }

    public Long getCustField010() { return custField010; }
    public void setCustField010(Long custField010) { this.custField010 = custField010; }

    public LocalDate getCustField011() { return custField011; }
    public void setCustField011(LocalDate custField011) { this.custField011 = custField011; }

    public Long getCustField012() { return custField012; }
    public void setCustField012(Long custField012) { this.custField012 = custField012; }

    public Double getCustField013() { return custField013; }
    public void setCustField013(Double custField013) { this.custField013 = custField013; }

    public Integer getCustField014() { return custField014; }
    public void setCustField014(Integer custField014) { this.custField014 = custField014; }

    public Long getCustField015() { return custField015; }
    public void setCustField015(Long custField015) { this.custField015 = custField015; }

    public Long getCustField016() { return custField016; }
    public void setCustField016(Long custField016) { this.custField016 = custField016; }

    public String getCustField017() { return custField017; }
    public void setCustField017(String custField017) { this.custField017 = custField017; }

    @Override
    public String toString() {
        return "CustomerDto046{" +
            "custField000=" + custField000 + ", " +
            "custField001=" + custField001 + ", " +
            "custField002=" + custField002 + ", " +
            "custField003=" + custField003 + ", " +
            "custField004=" + custField004 + ", " +
            "}";
    }
}
