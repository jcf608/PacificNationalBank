package com.pnb.product;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * ProductDto037 — Data Transfer Object for product operations.
 * Variant 37 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductDto037 {

    @JsonProperty("prodField000")
    private LocalDate prodField000;

    @DecimalMin(value = "0.00")
    @JsonProperty("prodField001")
    private BigDecimal prodField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("prodField002")
    private BigDecimal prodField002;

    @JsonProperty("prodField003")
    private Boolean prodField003;

    @JsonProperty("prodField004")
    private Integer prodField004;

    @JsonProperty("prodField005")
    private Double prodField005;

    @JsonProperty("prodField006")
    private LocalDate prodField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("prodField007")
    private BigDecimal prodField007;

    @JsonProperty("prodField008")
    private Double prodField008;

    public ProductDto037() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final ProductDto037 instance = new ProductDto037();

        public Builder prodField000(LocalDate val) { instance.prodField000 = val; return this; }
        public Builder prodField001(BigDecimal val) { instance.prodField001 = val; return this; }
        public Builder prodField002(BigDecimal val) { instance.prodField002 = val; return this; }
        public Builder prodField003(Boolean val) { instance.prodField003 = val; return this; }
        public Builder prodField004(Integer val) { instance.prodField004 = val; return this; }
        public Builder prodField005(Double val) { instance.prodField005 = val; return this; }
        public Builder prodField006(LocalDate val) { instance.prodField006 = val; return this; }
        public Builder prodField007(BigDecimal val) { instance.prodField007 = val; return this; }
        public Builder prodField008(Double val) { instance.prodField008 = val; return this; }
        public ProductDto037 build() { return instance; }
    }

    public LocalDate getProdField000() { return prodField000; }
    public void setProdField000(LocalDate prodField000) { this.prodField000 = prodField000; }

    public BigDecimal getProdField001() { return prodField001; }
    public void setProdField001(BigDecimal prodField001) { this.prodField001 = prodField001; }

    public BigDecimal getProdField002() { return prodField002; }
    public void setProdField002(BigDecimal prodField002) { this.prodField002 = prodField002; }

    public Boolean getProdField003() { return prodField003; }
    public void setProdField003(Boolean prodField003) { this.prodField003 = prodField003; }

    public Integer getProdField004() { return prodField004; }
    public void setProdField004(Integer prodField004) { this.prodField004 = prodField004; }

    public Double getProdField005() { return prodField005; }
    public void setProdField005(Double prodField005) { this.prodField005 = prodField005; }

    public LocalDate getProdField006() { return prodField006; }
    public void setProdField006(LocalDate prodField006) { this.prodField006 = prodField006; }

    public BigDecimal getProdField007() { return prodField007; }
    public void setProdField007(BigDecimal prodField007) { this.prodField007 = prodField007; }

    public Double getProdField008() { return prodField008; }
    public void setProdField008(Double prodField008) { this.prodField008 = prodField008; }

    @Override
    public String toString() {
        return "ProductDto037{" +
            "prodField000=" + prodField000 + ", " +
            "prodField001=" + prodField001 + ", " +
            "prodField002=" + prodField002 + ", " +
            "prodField003=" + prodField003 + ", " +
            "prodField004=" + prodField004 + ", " +
            "}";
    }
}
