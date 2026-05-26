package com.pnb.product;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * ProductDto056 — Data Transfer Object for product operations.
 * Variant 56 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductDto056 {

    @Size(max = 200)
    @JsonProperty("prodField000")
    private String prodField000;

    @JsonProperty("prodField001")
    private Double prodField001;

    @JsonProperty("prodField002")
    private Integer prodField002;

    @JsonProperty("prodField003")
    private Long prodField003;

    @JsonProperty("prodField004")
    private Integer prodField004;

    @JsonProperty("prodField005")
    private LocalDate prodField005;

    @JsonProperty("prodField006")
    private Double prodField006;

    @JsonProperty("prodField007")
    private Integer prodField007;

    @Size(max = 40)
    @JsonProperty("prodField008")
    private String prodField008;

    @JsonProperty("prodField009")
    private Integer prodField009;

    @JsonProperty("prodField010")
    private Long prodField010;

    @JsonProperty("prodField011")
    private Integer prodField011;

    @DecimalMin(value = "0.00")
    @JsonProperty("prodField012")
    private BigDecimal prodField012;

    @DecimalMin(value = "0.00")
    @JsonProperty("prodField013")
    private BigDecimal prodField013;

    @JsonProperty("prodField014")
    private LocalDate prodField014;

    @JsonProperty("prodField015")
    private Integer prodField015;

    public ProductDto056() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final ProductDto056 instance = new ProductDto056();

        public Builder prodField000(String val) { instance.prodField000 = val; return this; }
        public Builder prodField001(Double val) { instance.prodField001 = val; return this; }
        public Builder prodField002(Integer val) { instance.prodField002 = val; return this; }
        public Builder prodField003(Long val) { instance.prodField003 = val; return this; }
        public Builder prodField004(Integer val) { instance.prodField004 = val; return this; }
        public Builder prodField005(LocalDate val) { instance.prodField005 = val; return this; }
        public Builder prodField006(Double val) { instance.prodField006 = val; return this; }
        public Builder prodField007(Integer val) { instance.prodField007 = val; return this; }
        public Builder prodField008(String val) { instance.prodField008 = val; return this; }
        public Builder prodField009(Integer val) { instance.prodField009 = val; return this; }
        public Builder prodField010(Long val) { instance.prodField010 = val; return this; }
        public Builder prodField011(Integer val) { instance.prodField011 = val; return this; }
        public Builder prodField012(BigDecimal val) { instance.prodField012 = val; return this; }
        public Builder prodField013(BigDecimal val) { instance.prodField013 = val; return this; }
        public Builder prodField014(LocalDate val) { instance.prodField014 = val; return this; }
        public Builder prodField015(Integer val) { instance.prodField015 = val; return this; }
        public ProductDto056 build() { return instance; }
    }

    public String getProdField000() { return prodField000; }
    public void setProdField000(String prodField000) { this.prodField000 = prodField000; }

    public Double getProdField001() { return prodField001; }
    public void setProdField001(Double prodField001) { this.prodField001 = prodField001; }

    public Integer getProdField002() { return prodField002; }
    public void setProdField002(Integer prodField002) { this.prodField002 = prodField002; }

    public Long getProdField003() { return prodField003; }
    public void setProdField003(Long prodField003) { this.prodField003 = prodField003; }

    public Integer getProdField004() { return prodField004; }
    public void setProdField004(Integer prodField004) { this.prodField004 = prodField004; }

    public LocalDate getProdField005() { return prodField005; }
    public void setProdField005(LocalDate prodField005) { this.prodField005 = prodField005; }

    public Double getProdField006() { return prodField006; }
    public void setProdField006(Double prodField006) { this.prodField006 = prodField006; }

    public Integer getProdField007() { return prodField007; }
    public void setProdField007(Integer prodField007) { this.prodField007 = prodField007; }

    public String getProdField008() { return prodField008; }
    public void setProdField008(String prodField008) { this.prodField008 = prodField008; }

    public Integer getProdField009() { return prodField009; }
    public void setProdField009(Integer prodField009) { this.prodField009 = prodField009; }

    public Long getProdField010() { return prodField010; }
    public void setProdField010(Long prodField010) { this.prodField010 = prodField010; }

    public Integer getProdField011() { return prodField011; }
    public void setProdField011(Integer prodField011) { this.prodField011 = prodField011; }

    public BigDecimal getProdField012() { return prodField012; }
    public void setProdField012(BigDecimal prodField012) { this.prodField012 = prodField012; }

    public BigDecimal getProdField013() { return prodField013; }
    public void setProdField013(BigDecimal prodField013) { this.prodField013 = prodField013; }

    public LocalDate getProdField014() { return prodField014; }
    public void setProdField014(LocalDate prodField014) { this.prodField014 = prodField014; }

    public Integer getProdField015() { return prodField015; }
    public void setProdField015(Integer prodField015) { this.prodField015 = prodField015; }

    @Override
    public String toString() {
        return "ProductDto056{" +
            "prodField000=" + prodField000 + ", " +
            "prodField001=" + prodField001 + ", " +
            "prodField002=" + prodField002 + ", " +
            "prodField003=" + prodField003 + ", " +
            "prodField004=" + prodField004 + ", " +
            "}";
    }
}
