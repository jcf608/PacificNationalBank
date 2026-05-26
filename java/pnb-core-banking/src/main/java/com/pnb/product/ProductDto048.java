package com.pnb.product;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * ProductDto048 — Data Transfer Object for product operations.
 * Variant 48 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductDto048 {

    @JsonProperty("prodField000")
    private Boolean prodField000;

    @JsonProperty("prodField001")
    private Boolean prodField001;

    @JsonProperty("prodField002")
    private Long prodField002;

    @DecimalMin(value = "0.00")
    @JsonProperty("prodField003")
    private BigDecimal prodField003;

    @JsonProperty("prodField004")
    private Long prodField004;

    @JsonProperty("prodField005")
    private Double prodField005;

    @Size(max = 40)
    @JsonProperty("prodField006")
    private String prodField006;

    @JsonProperty("prodField007")
    private Double prodField007;

    public ProductDto048() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final ProductDto048 instance = new ProductDto048();

        public Builder prodField000(Boolean val) { instance.prodField000 = val; return this; }
        public Builder prodField001(Boolean val) { instance.prodField001 = val; return this; }
        public Builder prodField002(Long val) { instance.prodField002 = val; return this; }
        public Builder prodField003(BigDecimal val) { instance.prodField003 = val; return this; }
        public Builder prodField004(Long val) { instance.prodField004 = val; return this; }
        public Builder prodField005(Double val) { instance.prodField005 = val; return this; }
        public Builder prodField006(String val) { instance.prodField006 = val; return this; }
        public Builder prodField007(Double val) { instance.prodField007 = val; return this; }
        public ProductDto048 build() { return instance; }
    }

    public Boolean getProdField000() { return prodField000; }
    public void setProdField000(Boolean prodField000) { this.prodField000 = prodField000; }

    public Boolean getProdField001() { return prodField001; }
    public void setProdField001(Boolean prodField001) { this.prodField001 = prodField001; }

    public Long getProdField002() { return prodField002; }
    public void setProdField002(Long prodField002) { this.prodField002 = prodField002; }

    public BigDecimal getProdField003() { return prodField003; }
    public void setProdField003(BigDecimal prodField003) { this.prodField003 = prodField003; }

    public Long getProdField004() { return prodField004; }
    public void setProdField004(Long prodField004) { this.prodField004 = prodField004; }

    public Double getProdField005() { return prodField005; }
    public void setProdField005(Double prodField005) { this.prodField005 = prodField005; }

    public String getProdField006() { return prodField006; }
    public void setProdField006(String prodField006) { this.prodField006 = prodField006; }

    public Double getProdField007() { return prodField007; }
    public void setProdField007(Double prodField007) { this.prodField007 = prodField007; }

    @Override
    public String toString() {
        return "ProductDto048{" +
            "prodField000=" + prodField000 + ", " +
            "prodField001=" + prodField001 + ", " +
            "prodField002=" + prodField002 + ", " +
            "prodField003=" + prodField003 + ", " +
            "prodField004=" + prodField004 + ", " +
            "}";
    }
}
