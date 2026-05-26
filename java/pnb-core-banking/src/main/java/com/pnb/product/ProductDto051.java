package com.pnb.product;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * ProductDto051 — Data Transfer Object for product operations.
 * Variant 51 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductDto051 {

    @JsonProperty("prodField000")
    private Boolean prodField000;

    @JsonProperty("prodField001")
    private Boolean prodField001;

    @JsonProperty("prodField002")
    private Long prodField002;

    @JsonProperty("prodField003")
    private Long prodField003;

    @JsonProperty("prodField004")
    private Boolean prodField004;

    @JsonProperty("prodField005")
    private Long prodField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("prodField006")
    private BigDecimal prodField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("prodField007")
    private BigDecimal prodField007;

    @JsonProperty("prodField008")
    private Long prodField008;

    @JsonProperty("prodField009")
    private Integer prodField009;

    @JsonProperty("prodField010")
    private Long prodField010;

    public ProductDto051() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final ProductDto051 instance = new ProductDto051();

        public Builder prodField000(Boolean val) { instance.prodField000 = val; return this; }
        public Builder prodField001(Boolean val) { instance.prodField001 = val; return this; }
        public Builder prodField002(Long val) { instance.prodField002 = val; return this; }
        public Builder prodField003(Long val) { instance.prodField003 = val; return this; }
        public Builder prodField004(Boolean val) { instance.prodField004 = val; return this; }
        public Builder prodField005(Long val) { instance.prodField005 = val; return this; }
        public Builder prodField006(BigDecimal val) { instance.prodField006 = val; return this; }
        public Builder prodField007(BigDecimal val) { instance.prodField007 = val; return this; }
        public Builder prodField008(Long val) { instance.prodField008 = val; return this; }
        public Builder prodField009(Integer val) { instance.prodField009 = val; return this; }
        public Builder prodField010(Long val) { instance.prodField010 = val; return this; }
        public ProductDto051 build() { return instance; }
    }

    public Boolean getProdField000() { return prodField000; }
    public void setProdField000(Boolean prodField000) { this.prodField000 = prodField000; }

    public Boolean getProdField001() { return prodField001; }
    public void setProdField001(Boolean prodField001) { this.prodField001 = prodField001; }

    public Long getProdField002() { return prodField002; }
    public void setProdField002(Long prodField002) { this.prodField002 = prodField002; }

    public Long getProdField003() { return prodField003; }
    public void setProdField003(Long prodField003) { this.prodField003 = prodField003; }

    public Boolean getProdField004() { return prodField004; }
    public void setProdField004(Boolean prodField004) { this.prodField004 = prodField004; }

    public Long getProdField005() { return prodField005; }
    public void setProdField005(Long prodField005) { this.prodField005 = prodField005; }

    public BigDecimal getProdField006() { return prodField006; }
    public void setProdField006(BigDecimal prodField006) { this.prodField006 = prodField006; }

    public BigDecimal getProdField007() { return prodField007; }
    public void setProdField007(BigDecimal prodField007) { this.prodField007 = prodField007; }

    public Long getProdField008() { return prodField008; }
    public void setProdField008(Long prodField008) { this.prodField008 = prodField008; }

    public Integer getProdField009() { return prodField009; }
    public void setProdField009(Integer prodField009) { this.prodField009 = prodField009; }

    public Long getProdField010() { return prodField010; }
    public void setProdField010(Long prodField010) { this.prodField010 = prodField010; }

    @Override
    public String toString() {
        return "ProductDto051{" +
            "prodField000=" + prodField000 + ", " +
            "prodField001=" + prodField001 + ", " +
            "prodField002=" + prodField002 + ", " +
            "prodField003=" + prodField003 + ", " +
            "prodField004=" + prodField004 + ", " +
            "}";
    }
}
