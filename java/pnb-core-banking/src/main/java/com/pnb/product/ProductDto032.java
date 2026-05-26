package com.pnb.product;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * ProductDto032 — Data Transfer Object for product operations.
 * Variant 32 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductDto032 {

    @JsonProperty("prodField000")
    private Integer prodField000;

    @DecimalMin(value = "0.00")
    @JsonProperty("prodField001")
    private BigDecimal prodField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("prodField002")
    private BigDecimal prodField002;

    @JsonProperty("prodField003")
    private LocalDate prodField003;

    @JsonProperty("prodField004")
    private Long prodField004;

    @Size(max = 100)
    @JsonProperty("prodField005")
    private String prodField005;

    @JsonProperty("prodField006")
    private Double prodField006;

    @JsonProperty("prodField007")
    private LocalDate prodField007;

    @DecimalMin(value = "0.00")
    @JsonProperty("prodField008")
    private BigDecimal prodField008;

    @JsonProperty("prodField009")
    private Double prodField009;

    @JsonProperty("prodField010")
    private LocalDate prodField010;

    @Size(max = 20)
    @JsonProperty("prodField011")
    private String prodField011;

    @JsonProperty("prodField012")
    private Integer prodField012;

    @JsonProperty("prodField013")
    private Integer prodField013;

    @JsonProperty("prodField014")
    private Integer prodField014;

    @JsonProperty("prodField015")
    private LocalDate prodField015;

    public ProductDto032() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final ProductDto032 instance = new ProductDto032();

        public Builder prodField000(Integer val) { instance.prodField000 = val; return this; }
        public Builder prodField001(BigDecimal val) { instance.prodField001 = val; return this; }
        public Builder prodField002(BigDecimal val) { instance.prodField002 = val; return this; }
        public Builder prodField003(LocalDate val) { instance.prodField003 = val; return this; }
        public Builder prodField004(Long val) { instance.prodField004 = val; return this; }
        public Builder prodField005(String val) { instance.prodField005 = val; return this; }
        public Builder prodField006(Double val) { instance.prodField006 = val; return this; }
        public Builder prodField007(LocalDate val) { instance.prodField007 = val; return this; }
        public Builder prodField008(BigDecimal val) { instance.prodField008 = val; return this; }
        public Builder prodField009(Double val) { instance.prodField009 = val; return this; }
        public Builder prodField010(LocalDate val) { instance.prodField010 = val; return this; }
        public Builder prodField011(String val) { instance.prodField011 = val; return this; }
        public Builder prodField012(Integer val) { instance.prodField012 = val; return this; }
        public Builder prodField013(Integer val) { instance.prodField013 = val; return this; }
        public Builder prodField014(Integer val) { instance.prodField014 = val; return this; }
        public Builder prodField015(LocalDate val) { instance.prodField015 = val; return this; }
        public ProductDto032 build() { return instance; }
    }

    public Integer getProdField000() { return prodField000; }
    public void setProdField000(Integer prodField000) { this.prodField000 = prodField000; }

    public BigDecimal getProdField001() { return prodField001; }
    public void setProdField001(BigDecimal prodField001) { this.prodField001 = prodField001; }

    public BigDecimal getProdField002() { return prodField002; }
    public void setProdField002(BigDecimal prodField002) { this.prodField002 = prodField002; }

    public LocalDate getProdField003() { return prodField003; }
    public void setProdField003(LocalDate prodField003) { this.prodField003 = prodField003; }

    public Long getProdField004() { return prodField004; }
    public void setProdField004(Long prodField004) { this.prodField004 = prodField004; }

    public String getProdField005() { return prodField005; }
    public void setProdField005(String prodField005) { this.prodField005 = prodField005; }

    public Double getProdField006() { return prodField006; }
    public void setProdField006(Double prodField006) { this.prodField006 = prodField006; }

    public LocalDate getProdField007() { return prodField007; }
    public void setProdField007(LocalDate prodField007) { this.prodField007 = prodField007; }

    public BigDecimal getProdField008() { return prodField008; }
    public void setProdField008(BigDecimal prodField008) { this.prodField008 = prodField008; }

    public Double getProdField009() { return prodField009; }
    public void setProdField009(Double prodField009) { this.prodField009 = prodField009; }

    public LocalDate getProdField010() { return prodField010; }
    public void setProdField010(LocalDate prodField010) { this.prodField010 = prodField010; }

    public String getProdField011() { return prodField011; }
    public void setProdField011(String prodField011) { this.prodField011 = prodField011; }

    public Integer getProdField012() { return prodField012; }
    public void setProdField012(Integer prodField012) { this.prodField012 = prodField012; }

    public Integer getProdField013() { return prodField013; }
    public void setProdField013(Integer prodField013) { this.prodField013 = prodField013; }

    public Integer getProdField014() { return prodField014; }
    public void setProdField014(Integer prodField014) { this.prodField014 = prodField014; }

    public LocalDate getProdField015() { return prodField015; }
    public void setProdField015(LocalDate prodField015) { this.prodField015 = prodField015; }

    @Override
    public String toString() {
        return "ProductDto032{" +
            "prodField000=" + prodField000 + ", " +
            "prodField001=" + prodField001 + ", " +
            "prodField002=" + prodField002 + ", " +
            "prodField003=" + prodField003 + ", " +
            "prodField004=" + prodField004 + ", " +
            "}";
    }
}
