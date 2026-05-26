package com.pnb.product;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * ProductDto027 — Data Transfer Object for product operations.
 * Variant 27 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductDto027 {

    @JsonProperty("prodField000")
    private Integer prodField000;

    @JsonProperty("prodField001")
    private Integer prodField001;

    @JsonProperty("prodField002")
    private Integer prodField002;

    @Size(max = 60)
    @JsonProperty("prodField003")
    private String prodField003;

    @JsonProperty("prodField004")
    private LocalDate prodField004;

    @Size(max = 60)
    @JsonProperty("prodField005")
    private String prodField005;

    @JsonProperty("prodField006")
    private Integer prodField006;

    @JsonProperty("prodField007")
    private LocalDate prodField007;

    @Size(max = 100)
    @JsonProperty("prodField008")
    private String prodField008;

    @JsonProperty("prodField009")
    private LocalDate prodField009;

    @DecimalMin(value = "0.00")
    @JsonProperty("prodField010")
    private BigDecimal prodField010;

    public ProductDto027() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final ProductDto027 instance = new ProductDto027();

        public Builder prodField000(Integer val) { instance.prodField000 = val; return this; }
        public Builder prodField001(Integer val) { instance.prodField001 = val; return this; }
        public Builder prodField002(Integer val) { instance.prodField002 = val; return this; }
        public Builder prodField003(String val) { instance.prodField003 = val; return this; }
        public Builder prodField004(LocalDate val) { instance.prodField004 = val; return this; }
        public Builder prodField005(String val) { instance.prodField005 = val; return this; }
        public Builder prodField006(Integer val) { instance.prodField006 = val; return this; }
        public Builder prodField007(LocalDate val) { instance.prodField007 = val; return this; }
        public Builder prodField008(String val) { instance.prodField008 = val; return this; }
        public Builder prodField009(LocalDate val) { instance.prodField009 = val; return this; }
        public Builder prodField010(BigDecimal val) { instance.prodField010 = val; return this; }
        public ProductDto027 build() { return instance; }
    }

    public Integer getProdField000() { return prodField000; }
    public void setProdField000(Integer prodField000) { this.prodField000 = prodField000; }

    public Integer getProdField001() { return prodField001; }
    public void setProdField001(Integer prodField001) { this.prodField001 = prodField001; }

    public Integer getProdField002() { return prodField002; }
    public void setProdField002(Integer prodField002) { this.prodField002 = prodField002; }

    public String getProdField003() { return prodField003; }
    public void setProdField003(String prodField003) { this.prodField003 = prodField003; }

    public LocalDate getProdField004() { return prodField004; }
    public void setProdField004(LocalDate prodField004) { this.prodField004 = prodField004; }

    public String getProdField005() { return prodField005; }
    public void setProdField005(String prodField005) { this.prodField005 = prodField005; }

    public Integer getProdField006() { return prodField006; }
    public void setProdField006(Integer prodField006) { this.prodField006 = prodField006; }

    public LocalDate getProdField007() { return prodField007; }
    public void setProdField007(LocalDate prodField007) { this.prodField007 = prodField007; }

    public String getProdField008() { return prodField008; }
    public void setProdField008(String prodField008) { this.prodField008 = prodField008; }

    public LocalDate getProdField009() { return prodField009; }
    public void setProdField009(LocalDate prodField009) { this.prodField009 = prodField009; }

    public BigDecimal getProdField010() { return prodField010; }
    public void setProdField010(BigDecimal prodField010) { this.prodField010 = prodField010; }

    @Override
    public String toString() {
        return "ProductDto027{" +
            "prodField000=" + prodField000 + ", " +
            "prodField001=" + prodField001 + ", " +
            "prodField002=" + prodField002 + ", " +
            "prodField003=" + prodField003 + ", " +
            "prodField004=" + prodField004 + ", " +
            "}";
    }
}
