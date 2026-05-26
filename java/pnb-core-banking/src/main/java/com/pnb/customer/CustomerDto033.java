package com.pnb.customer;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * CustomerDto033 — Data Transfer Object for customer operations.
 * Variant 33 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomerDto033 {

    @JsonProperty("custField000")
    private Long custField000;

    @JsonProperty("custField001")
    private LocalDate custField001;

    @JsonProperty("custField002")
    private Integer custField002;

    @Size(max = 20)
    @JsonProperty("custField003")
    private String custField003;

    @JsonProperty("custField004")
    private Long custField004;

    @JsonProperty("custField005")
    private Boolean custField005;

    @JsonProperty("custField006")
    private LocalDate custField006;

    @Size(max = 60)
    @JsonProperty("custField007")
    private String custField007;

    @JsonProperty("custField008")
    private Boolean custField008;

    @Size(max = 40)
    @JsonProperty("custField009")
    private String custField009;

    @JsonProperty("custField010")
    private Long custField010;

    @JsonProperty("custField011")
    private Boolean custField011;

    @JsonProperty("custField012")
    private Long custField012;

    @Size(max = 20)
    @JsonProperty("custField013")
    private String custField013;

    @JsonProperty("custField014")
    private Integer custField014;

    @JsonProperty("custField015")
    private Double custField015;

    @JsonProperty("custField016")
    private LocalDate custField016;

    public CustomerDto033() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final CustomerDto033 instance = new CustomerDto033();

        public Builder custField000(Long val) { instance.custField000 = val; return this; }
        public Builder custField001(LocalDate val) { instance.custField001 = val; return this; }
        public Builder custField002(Integer val) { instance.custField002 = val; return this; }
        public Builder custField003(String val) { instance.custField003 = val; return this; }
        public Builder custField004(Long val) { instance.custField004 = val; return this; }
        public Builder custField005(Boolean val) { instance.custField005 = val; return this; }
        public Builder custField006(LocalDate val) { instance.custField006 = val; return this; }
        public Builder custField007(String val) { instance.custField007 = val; return this; }
        public Builder custField008(Boolean val) { instance.custField008 = val; return this; }
        public Builder custField009(String val) { instance.custField009 = val; return this; }
        public Builder custField010(Long val) { instance.custField010 = val; return this; }
        public Builder custField011(Boolean val) { instance.custField011 = val; return this; }
        public Builder custField012(Long val) { instance.custField012 = val; return this; }
        public Builder custField013(String val) { instance.custField013 = val; return this; }
        public Builder custField014(Integer val) { instance.custField014 = val; return this; }
        public Builder custField015(Double val) { instance.custField015 = val; return this; }
        public Builder custField016(LocalDate val) { instance.custField016 = val; return this; }
        public CustomerDto033 build() { return instance; }
    }

    public Long getCustField000() { return custField000; }
    public void setCustField000(Long custField000) { this.custField000 = custField000; }

    public LocalDate getCustField001() { return custField001; }
    public void setCustField001(LocalDate custField001) { this.custField001 = custField001; }

    public Integer getCustField002() { return custField002; }
    public void setCustField002(Integer custField002) { this.custField002 = custField002; }

    public String getCustField003() { return custField003; }
    public void setCustField003(String custField003) { this.custField003 = custField003; }

    public Long getCustField004() { return custField004; }
    public void setCustField004(Long custField004) { this.custField004 = custField004; }

    public Boolean getCustField005() { return custField005; }
    public void setCustField005(Boolean custField005) { this.custField005 = custField005; }

    public LocalDate getCustField006() { return custField006; }
    public void setCustField006(LocalDate custField006) { this.custField006 = custField006; }

    public String getCustField007() { return custField007; }
    public void setCustField007(String custField007) { this.custField007 = custField007; }

    public Boolean getCustField008() { return custField008; }
    public void setCustField008(Boolean custField008) { this.custField008 = custField008; }

    public String getCustField009() { return custField009; }
    public void setCustField009(String custField009) { this.custField009 = custField009; }

    public Long getCustField010() { return custField010; }
    public void setCustField010(Long custField010) { this.custField010 = custField010; }

    public Boolean getCustField011() { return custField011; }
    public void setCustField011(Boolean custField011) { this.custField011 = custField011; }

    public Long getCustField012() { return custField012; }
    public void setCustField012(Long custField012) { this.custField012 = custField012; }

    public String getCustField013() { return custField013; }
    public void setCustField013(String custField013) { this.custField013 = custField013; }

    public Integer getCustField014() { return custField014; }
    public void setCustField014(Integer custField014) { this.custField014 = custField014; }

    public Double getCustField015() { return custField015; }
    public void setCustField015(Double custField015) { this.custField015 = custField015; }

    public LocalDate getCustField016() { return custField016; }
    public void setCustField016(LocalDate custField016) { this.custField016 = custField016; }

    @Override
    public String toString() {
        return "CustomerDto033{" +
            "custField000=" + custField000 + ", " +
            "custField001=" + custField001 + ", " +
            "custField002=" + custField002 + ", " +
            "custField003=" + custField003 + ", " +
            "custField004=" + custField004 + ", " +
            "}";
    }
}
