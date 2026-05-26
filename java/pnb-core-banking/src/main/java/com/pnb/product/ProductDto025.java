package com.pnb.product;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * ProductDto025 — Data Transfer Object for product operations.
 * Variant 25 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductDto025 {

    @JsonProperty("prodField000")
    private LocalDate prodField000;

    @JsonProperty("prodField001")
    private Double prodField001;

    @Size(max = 60)
    @JsonProperty("prodField002")
    private String prodField002;

    @Size(max = 200)
    @JsonProperty("prodField003")
    private String prodField003;

    @JsonProperty("prodField004")
    private Double prodField004;

    @JsonProperty("prodField005")
    private Double prodField005;

    @JsonProperty("prodField006")
    private Boolean prodField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("prodField007")
    private BigDecimal prodField007;

    @JsonProperty("prodField008")
    private LocalDate prodField008;

    public ProductDto025() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final ProductDto025 instance = new ProductDto025();

        public Builder prodField000(LocalDate val) { instance.prodField000 = val; return this; }
        public Builder prodField001(Double val) { instance.prodField001 = val; return this; }
        public Builder prodField002(String val) { instance.prodField002 = val; return this; }
        public Builder prodField003(String val) { instance.prodField003 = val; return this; }
        public Builder prodField004(Double val) { instance.prodField004 = val; return this; }
        public Builder prodField005(Double val) { instance.prodField005 = val; return this; }
        public Builder prodField006(Boolean val) { instance.prodField006 = val; return this; }
        public Builder prodField007(BigDecimal val) { instance.prodField007 = val; return this; }
        public Builder prodField008(LocalDate val) { instance.prodField008 = val; return this; }
        public ProductDto025 build() { return instance; }
    }

    public LocalDate getProdField000() { return prodField000; }
    public void setProdField000(LocalDate prodField000) { this.prodField000 = prodField000; }

    public Double getProdField001() { return prodField001; }
    public void setProdField001(Double prodField001) { this.prodField001 = prodField001; }

    public String getProdField002() { return prodField002; }
    public void setProdField002(String prodField002) { this.prodField002 = prodField002; }

    public String getProdField003() { return prodField003; }
    public void setProdField003(String prodField003) { this.prodField003 = prodField003; }

    public Double getProdField004() { return prodField004; }
    public void setProdField004(Double prodField004) { this.prodField004 = prodField004; }

    public Double getProdField005() { return prodField005; }
    public void setProdField005(Double prodField005) { this.prodField005 = prodField005; }

    public Boolean getProdField006() { return prodField006; }
    public void setProdField006(Boolean prodField006) { this.prodField006 = prodField006; }

    public BigDecimal getProdField007() { return prodField007; }
    public void setProdField007(BigDecimal prodField007) { this.prodField007 = prodField007; }

    public LocalDate getProdField008() { return prodField008; }
    public void setProdField008(LocalDate prodField008) { this.prodField008 = prodField008; }

    @Override
    public String toString() {
        return "ProductDto025{" +
            "prodField000=" + prodField000 + ", " +
            "prodField001=" + prodField001 + ", " +
            "prodField002=" + prodField002 + ", " +
            "prodField003=" + prodField003 + ", " +
            "prodField004=" + prodField004 + ", " +
            "}";
    }
}
