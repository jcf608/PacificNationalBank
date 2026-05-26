package com.pnb.product;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * ProductDto036 — Data Transfer Object for product operations.
 * Variant 36 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductDto036 {

    @DecimalMin(value = "0.00")
    @JsonProperty("prodField000")
    private BigDecimal prodField000;

    @JsonProperty("prodField001")
    private Boolean prodField001;

    @JsonProperty("prodField002")
    private Boolean prodField002;

    @JsonProperty("prodField003")
    private Integer prodField003;

    @JsonProperty("prodField004")
    private LocalDate prodField004;

    @JsonProperty("prodField005")
    private Boolean prodField005;

    @JsonProperty("prodField006")
    private Boolean prodField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("prodField007")
    private BigDecimal prodField007;

    public ProductDto036() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final ProductDto036 instance = new ProductDto036();

        public Builder prodField000(BigDecimal val) { instance.prodField000 = val; return this; }
        public Builder prodField001(Boolean val) { instance.prodField001 = val; return this; }
        public Builder prodField002(Boolean val) { instance.prodField002 = val; return this; }
        public Builder prodField003(Integer val) { instance.prodField003 = val; return this; }
        public Builder prodField004(LocalDate val) { instance.prodField004 = val; return this; }
        public Builder prodField005(Boolean val) { instance.prodField005 = val; return this; }
        public Builder prodField006(Boolean val) { instance.prodField006 = val; return this; }
        public Builder prodField007(BigDecimal val) { instance.prodField007 = val; return this; }
        public ProductDto036 build() { return instance; }
    }

    public BigDecimal getProdField000() { return prodField000; }
    public void setProdField000(BigDecimal prodField000) { this.prodField000 = prodField000; }

    public Boolean getProdField001() { return prodField001; }
    public void setProdField001(Boolean prodField001) { this.prodField001 = prodField001; }

    public Boolean getProdField002() { return prodField002; }
    public void setProdField002(Boolean prodField002) { this.prodField002 = prodField002; }

    public Integer getProdField003() { return prodField003; }
    public void setProdField003(Integer prodField003) { this.prodField003 = prodField003; }

    public LocalDate getProdField004() { return prodField004; }
    public void setProdField004(LocalDate prodField004) { this.prodField004 = prodField004; }

    public Boolean getProdField005() { return prodField005; }
    public void setProdField005(Boolean prodField005) { this.prodField005 = prodField005; }

    public Boolean getProdField006() { return prodField006; }
    public void setProdField006(Boolean prodField006) { this.prodField006 = prodField006; }

    public BigDecimal getProdField007() { return prodField007; }
    public void setProdField007(BigDecimal prodField007) { this.prodField007 = prodField007; }

    @Override
    public String toString() {
        return "ProductDto036{" +
            "prodField000=" + prodField000 + ", " +
            "prodField001=" + prodField001 + ", " +
            "prodField002=" + prodField002 + ", " +
            "prodField003=" + prodField003 + ", " +
            "prodField004=" + prodField004 + ", " +
            "}";
    }
}
