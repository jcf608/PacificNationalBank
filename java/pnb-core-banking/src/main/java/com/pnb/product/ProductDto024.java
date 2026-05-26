package com.pnb.product;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * ProductDto024 — Data Transfer Object for product operations.
 * Variant 24 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductDto024 {

    @JsonProperty("prodField000")
    private Double prodField000;

    @DecimalMin(value = "0.00")
    @JsonProperty("prodField001")
    private BigDecimal prodField001;

    @JsonProperty("prodField002")
    private Integer prodField002;

    @JsonProperty("prodField003")
    private Boolean prodField003;

    @DecimalMin(value = "0.00")
    @JsonProperty("prodField004")
    private BigDecimal prodField004;

    @JsonProperty("prodField005")
    private LocalDate prodField005;

    @JsonProperty("prodField006")
    private Boolean prodField006;

    @JsonProperty("prodField007")
    private Double prodField007;

    public ProductDto024() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final ProductDto024 instance = new ProductDto024();

        public Builder prodField000(Double val) { instance.prodField000 = val; return this; }
        public Builder prodField001(BigDecimal val) { instance.prodField001 = val; return this; }
        public Builder prodField002(Integer val) { instance.prodField002 = val; return this; }
        public Builder prodField003(Boolean val) { instance.prodField003 = val; return this; }
        public Builder prodField004(BigDecimal val) { instance.prodField004 = val; return this; }
        public Builder prodField005(LocalDate val) { instance.prodField005 = val; return this; }
        public Builder prodField006(Boolean val) { instance.prodField006 = val; return this; }
        public Builder prodField007(Double val) { instance.prodField007 = val; return this; }
        public ProductDto024 build() { return instance; }
    }

    public Double getProdField000() { return prodField000; }
    public void setProdField000(Double prodField000) { this.prodField000 = prodField000; }

    public BigDecimal getProdField001() { return prodField001; }
    public void setProdField001(BigDecimal prodField001) { this.prodField001 = prodField001; }

    public Integer getProdField002() { return prodField002; }
    public void setProdField002(Integer prodField002) { this.prodField002 = prodField002; }

    public Boolean getProdField003() { return prodField003; }
    public void setProdField003(Boolean prodField003) { this.prodField003 = prodField003; }

    public BigDecimal getProdField004() { return prodField004; }
    public void setProdField004(BigDecimal prodField004) { this.prodField004 = prodField004; }

    public LocalDate getProdField005() { return prodField005; }
    public void setProdField005(LocalDate prodField005) { this.prodField005 = prodField005; }

    public Boolean getProdField006() { return prodField006; }
    public void setProdField006(Boolean prodField006) { this.prodField006 = prodField006; }

    public Double getProdField007() { return prodField007; }
    public void setProdField007(Double prodField007) { this.prodField007 = prodField007; }

    @Override
    public String toString() {
        return "ProductDto024{" +
            "prodField000=" + prodField000 + ", " +
            "prodField001=" + prodField001 + ", " +
            "prodField002=" + prodField002 + ", " +
            "prodField003=" + prodField003 + ", " +
            "prodField004=" + prodField004 + ", " +
            "}";
    }
}
