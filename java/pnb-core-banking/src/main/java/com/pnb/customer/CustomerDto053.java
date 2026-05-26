package com.pnb.customer;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * CustomerDto053 — Data Transfer Object for customer operations.
 * Variant 53 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomerDto053 {

    @JsonProperty("custField000")
    private LocalDate custField000;

    @JsonProperty("custField001")
    private Double custField001;

    @JsonProperty("custField002")
    private Double custField002;

    @JsonProperty("custField003")
    private Long custField003;

    @JsonProperty("custField004")
    private LocalDate custField004;

    @Size(max = 200)
    @JsonProperty("custField005")
    private String custField005;

    @JsonProperty("custField006")
    private Double custField006;

    @Size(max = 60)
    @JsonProperty("custField007")
    private String custField007;

    @JsonProperty("custField008")
    private Long custField008;

    @JsonProperty("custField009")
    private Boolean custField009;

    @Size(max = 40)
    @JsonProperty("custField010")
    private String custField010;

    @JsonProperty("custField011")
    private Boolean custField011;

    @JsonProperty("custField012")
    private Long custField012;

    public CustomerDto053() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final CustomerDto053 instance = new CustomerDto053();

        public Builder custField000(LocalDate val) { instance.custField000 = val; return this; }
        public Builder custField001(Double val) { instance.custField001 = val; return this; }
        public Builder custField002(Double val) { instance.custField002 = val; return this; }
        public Builder custField003(Long val) { instance.custField003 = val; return this; }
        public Builder custField004(LocalDate val) { instance.custField004 = val; return this; }
        public Builder custField005(String val) { instance.custField005 = val; return this; }
        public Builder custField006(Double val) { instance.custField006 = val; return this; }
        public Builder custField007(String val) { instance.custField007 = val; return this; }
        public Builder custField008(Long val) { instance.custField008 = val; return this; }
        public Builder custField009(Boolean val) { instance.custField009 = val; return this; }
        public Builder custField010(String val) { instance.custField010 = val; return this; }
        public Builder custField011(Boolean val) { instance.custField011 = val; return this; }
        public Builder custField012(Long val) { instance.custField012 = val; return this; }
        public CustomerDto053 build() { return instance; }
    }

    public LocalDate getCustField000() { return custField000; }
    public void setCustField000(LocalDate custField000) { this.custField000 = custField000; }

    public Double getCustField001() { return custField001; }
    public void setCustField001(Double custField001) { this.custField001 = custField001; }

    public Double getCustField002() { return custField002; }
    public void setCustField002(Double custField002) { this.custField002 = custField002; }

    public Long getCustField003() { return custField003; }
    public void setCustField003(Long custField003) { this.custField003 = custField003; }

    public LocalDate getCustField004() { return custField004; }
    public void setCustField004(LocalDate custField004) { this.custField004 = custField004; }

    public String getCustField005() { return custField005; }
    public void setCustField005(String custField005) { this.custField005 = custField005; }

    public Double getCustField006() { return custField006; }
    public void setCustField006(Double custField006) { this.custField006 = custField006; }

    public String getCustField007() { return custField007; }
    public void setCustField007(String custField007) { this.custField007 = custField007; }

    public Long getCustField008() { return custField008; }
    public void setCustField008(Long custField008) { this.custField008 = custField008; }

    public Boolean getCustField009() { return custField009; }
    public void setCustField009(Boolean custField009) { this.custField009 = custField009; }

    public String getCustField010() { return custField010; }
    public void setCustField010(String custField010) { this.custField010 = custField010; }

    public Boolean getCustField011() { return custField011; }
    public void setCustField011(Boolean custField011) { this.custField011 = custField011; }

    public Long getCustField012() { return custField012; }
    public void setCustField012(Long custField012) { this.custField012 = custField012; }

    @Override
    public String toString() {
        return "CustomerDto053{" +
            "custField000=" + custField000 + ", " +
            "custField001=" + custField001 + ", " +
            "custField002=" + custField002 + ", " +
            "custField003=" + custField003 + ", " +
            "custField004=" + custField004 + ", " +
            "}";
    }
}
