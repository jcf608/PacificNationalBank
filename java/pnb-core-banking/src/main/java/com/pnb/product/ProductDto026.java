package com.pnb.product;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * ProductDto026 — Data Transfer Object for product operations.
 * Variant 26 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductDto026 {

    @JsonProperty("prodField000")
    private Boolean prodField000;

    @JsonProperty("prodField001")
    private LocalDate prodField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("prodField002")
    private BigDecimal prodField002;

    @JsonProperty("prodField003")
    private Boolean prodField003;

    @JsonProperty("prodField004")
    private Boolean prodField004;

    @JsonProperty("prodField005")
    private Boolean prodField005;

    @JsonProperty("prodField006")
    private Long prodField006;

    @JsonProperty("prodField007")
    private LocalDate prodField007;

    @JsonProperty("prodField008")
    private Integer prodField008;

    @JsonProperty("prodField009")
    private Double prodField009;

    public ProductDto026() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final ProductDto026 instance = new ProductDto026();

        public Builder prodField000(Boolean val) { instance.prodField000 = val; return this; }
        public Builder prodField001(LocalDate val) { instance.prodField001 = val; return this; }
        public Builder prodField002(BigDecimal val) { instance.prodField002 = val; return this; }
        public Builder prodField003(Boolean val) { instance.prodField003 = val; return this; }
        public Builder prodField004(Boolean val) { instance.prodField004 = val; return this; }
        public Builder prodField005(Boolean val) { instance.prodField005 = val; return this; }
        public Builder prodField006(Long val) { instance.prodField006 = val; return this; }
        public Builder prodField007(LocalDate val) { instance.prodField007 = val; return this; }
        public Builder prodField008(Integer val) { instance.prodField008 = val; return this; }
        public Builder prodField009(Double val) { instance.prodField009 = val; return this; }
        public ProductDto026 build() { return instance; }
    }

    public Boolean getProdField000() { return prodField000; }
    public void setProdField000(Boolean prodField000) { this.prodField000 = prodField000; }

    public LocalDate getProdField001() { return prodField001; }
    public void setProdField001(LocalDate prodField001) { this.prodField001 = prodField001; }

    public BigDecimal getProdField002() { return prodField002; }
    public void setProdField002(BigDecimal prodField002) { this.prodField002 = prodField002; }

    public Boolean getProdField003() { return prodField003; }
    public void setProdField003(Boolean prodField003) { this.prodField003 = prodField003; }

    public Boolean getProdField004() { return prodField004; }
    public void setProdField004(Boolean prodField004) { this.prodField004 = prodField004; }

    public Boolean getProdField005() { return prodField005; }
    public void setProdField005(Boolean prodField005) { this.prodField005 = prodField005; }

    public Long getProdField006() { return prodField006; }
    public void setProdField006(Long prodField006) { this.prodField006 = prodField006; }

    public LocalDate getProdField007() { return prodField007; }
    public void setProdField007(LocalDate prodField007) { this.prodField007 = prodField007; }

    public Integer getProdField008() { return prodField008; }
    public void setProdField008(Integer prodField008) { this.prodField008 = prodField008; }

    public Double getProdField009() { return prodField009; }
    public void setProdField009(Double prodField009) { this.prodField009 = prodField009; }

    @Override
    public String toString() {
        return "ProductDto026{" +
            "prodField000=" + prodField000 + ", " +
            "prodField001=" + prodField001 + ", " +
            "prodField002=" + prodField002 + ", " +
            "prodField003=" + prodField003 + ", " +
            "prodField004=" + prodField004 + ", " +
            "}";
    }
}
