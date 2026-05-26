package com.pnb.customer;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * CustomerDto021 — Data Transfer Object for customer operations.
 * Variant 21 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomerDto021 {

    @JsonProperty("custField000")
    private LocalDate custField000;

    @JsonProperty("custField001")
    private Boolean custField001;

    @JsonProperty("custField002")
    private LocalDate custField002;

    @DecimalMin(value = "0.00")
    @JsonProperty("custField003")
    private BigDecimal custField003;

    @JsonProperty("custField004")
    private Double custField004;

    @JsonProperty("custField005")
    private Boolean custField005;

    @JsonProperty("custField006")
    private Integer custField006;

    @JsonProperty("custField007")
    private Integer custField007;

    @JsonProperty("custField008")
    private Long custField008;

    @JsonProperty("custField009")
    private LocalDate custField009;

    @Size(max = 20)
    @JsonProperty("custField010")
    private String custField010;

    @Size(max = 20)
    @JsonProperty("custField011")
    private String custField011;

    @Size(max = 60)
    @JsonProperty("custField012")
    private String custField012;

    @JsonProperty("custField013")
    private Integer custField013;

    @JsonProperty("custField014")
    private Boolean custField014;

    @JsonProperty("custField015")
    private Long custField015;

    @JsonProperty("custField016")
    private LocalDate custField016;

    public CustomerDto021() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final CustomerDto021 instance = new CustomerDto021();

        public Builder custField000(LocalDate val) { instance.custField000 = val; return this; }
        public Builder custField001(Boolean val) { instance.custField001 = val; return this; }
        public Builder custField002(LocalDate val) { instance.custField002 = val; return this; }
        public Builder custField003(BigDecimal val) { instance.custField003 = val; return this; }
        public Builder custField004(Double val) { instance.custField004 = val; return this; }
        public Builder custField005(Boolean val) { instance.custField005 = val; return this; }
        public Builder custField006(Integer val) { instance.custField006 = val; return this; }
        public Builder custField007(Integer val) { instance.custField007 = val; return this; }
        public Builder custField008(Long val) { instance.custField008 = val; return this; }
        public Builder custField009(LocalDate val) { instance.custField009 = val; return this; }
        public Builder custField010(String val) { instance.custField010 = val; return this; }
        public Builder custField011(String val) { instance.custField011 = val; return this; }
        public Builder custField012(String val) { instance.custField012 = val; return this; }
        public Builder custField013(Integer val) { instance.custField013 = val; return this; }
        public Builder custField014(Boolean val) { instance.custField014 = val; return this; }
        public Builder custField015(Long val) { instance.custField015 = val; return this; }
        public Builder custField016(LocalDate val) { instance.custField016 = val; return this; }
        public CustomerDto021 build() { return instance; }
    }

    public LocalDate getCustField000() { return custField000; }
    public void setCustField000(LocalDate custField000) { this.custField000 = custField000; }

    public Boolean getCustField001() { return custField001; }
    public void setCustField001(Boolean custField001) { this.custField001 = custField001; }

    public LocalDate getCustField002() { return custField002; }
    public void setCustField002(LocalDate custField002) { this.custField002 = custField002; }

    public BigDecimal getCustField003() { return custField003; }
    public void setCustField003(BigDecimal custField003) { this.custField003 = custField003; }

    public Double getCustField004() { return custField004; }
    public void setCustField004(Double custField004) { this.custField004 = custField004; }

    public Boolean getCustField005() { return custField005; }
    public void setCustField005(Boolean custField005) { this.custField005 = custField005; }

    public Integer getCustField006() { return custField006; }
    public void setCustField006(Integer custField006) { this.custField006 = custField006; }

    public Integer getCustField007() { return custField007; }
    public void setCustField007(Integer custField007) { this.custField007 = custField007; }

    public Long getCustField008() { return custField008; }
    public void setCustField008(Long custField008) { this.custField008 = custField008; }

    public LocalDate getCustField009() { return custField009; }
    public void setCustField009(LocalDate custField009) { this.custField009 = custField009; }

    public String getCustField010() { return custField010; }
    public void setCustField010(String custField010) { this.custField010 = custField010; }

    public String getCustField011() { return custField011; }
    public void setCustField011(String custField011) { this.custField011 = custField011; }

    public String getCustField012() { return custField012; }
    public void setCustField012(String custField012) { this.custField012 = custField012; }

    public Integer getCustField013() { return custField013; }
    public void setCustField013(Integer custField013) { this.custField013 = custField013; }

    public Boolean getCustField014() { return custField014; }
    public void setCustField014(Boolean custField014) { this.custField014 = custField014; }

    public Long getCustField015() { return custField015; }
    public void setCustField015(Long custField015) { this.custField015 = custField015; }

    public LocalDate getCustField016() { return custField016; }
    public void setCustField016(LocalDate custField016) { this.custField016 = custField016; }

    @Override
    public String toString() {
        return "CustomerDto021{" +
            "custField000=" + custField000 + ", " +
            "custField001=" + custField001 + ", " +
            "custField002=" + custField002 + ", " +
            "custField003=" + custField003 + ", " +
            "custField004=" + custField004 + ", " +
            "}";
    }
}
