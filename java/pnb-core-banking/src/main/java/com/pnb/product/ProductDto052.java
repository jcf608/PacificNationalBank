package com.pnb.product;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * ProductDto052 — Data Transfer Object for product operations.
 * Variant 52 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductDto052 {

    @JsonProperty("prodField000")
    private LocalDate prodField000;

    @JsonProperty("prodField001")
    private Double prodField001;

    @Size(max = 20)
    @JsonProperty("prodField002")
    private String prodField002;

    @JsonProperty("prodField003")
    private Integer prodField003;

    @JsonProperty("prodField004")
    private Boolean prodField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("prodField005")
    private BigDecimal prodField005;

    @JsonProperty("prodField006")
    private Double prodField006;

    @JsonProperty("prodField007")
    private Double prodField007;

    @JsonProperty("prodField008")
    private Double prodField008;

    @Size(max = 40)
    @JsonProperty("prodField009")
    private String prodField009;

    @JsonProperty("prodField010")
    private LocalDate prodField010;

    @Size(max = 40)
    @JsonProperty("prodField011")
    private String prodField011;

    public ProductDto052() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final ProductDto052 instance = new ProductDto052();

        public Builder prodField000(LocalDate val) { instance.prodField000 = val; return this; }
        public Builder prodField001(Double val) { instance.prodField001 = val; return this; }
        public Builder prodField002(String val) { instance.prodField002 = val; return this; }
        public Builder prodField003(Integer val) { instance.prodField003 = val; return this; }
        public Builder prodField004(Boolean val) { instance.prodField004 = val; return this; }
        public Builder prodField005(BigDecimal val) { instance.prodField005 = val; return this; }
        public Builder prodField006(Double val) { instance.prodField006 = val; return this; }
        public Builder prodField007(Double val) { instance.prodField007 = val; return this; }
        public Builder prodField008(Double val) { instance.prodField008 = val; return this; }
        public Builder prodField009(String val) { instance.prodField009 = val; return this; }
        public Builder prodField010(LocalDate val) { instance.prodField010 = val; return this; }
        public Builder prodField011(String val) { instance.prodField011 = val; return this; }
        public ProductDto052 build() { return instance; }
    }

    public LocalDate getProdField000() { return prodField000; }
    public void setProdField000(LocalDate prodField000) { this.prodField000 = prodField000; }

    public Double getProdField001() { return prodField001; }
    public void setProdField001(Double prodField001) { this.prodField001 = prodField001; }

    public String getProdField002() { return prodField002; }
    public void setProdField002(String prodField002) { this.prodField002 = prodField002; }

    public Integer getProdField003() { return prodField003; }
    public void setProdField003(Integer prodField003) { this.prodField003 = prodField003; }

    public Boolean getProdField004() { return prodField004; }
    public void setProdField004(Boolean prodField004) { this.prodField004 = prodField004; }

    public BigDecimal getProdField005() { return prodField005; }
    public void setProdField005(BigDecimal prodField005) { this.prodField005 = prodField005; }

    public Double getProdField006() { return prodField006; }
    public void setProdField006(Double prodField006) { this.prodField006 = prodField006; }

    public Double getProdField007() { return prodField007; }
    public void setProdField007(Double prodField007) { this.prodField007 = prodField007; }

    public Double getProdField008() { return prodField008; }
    public void setProdField008(Double prodField008) { this.prodField008 = prodField008; }

    public String getProdField009() { return prodField009; }
    public void setProdField009(String prodField009) { this.prodField009 = prodField009; }

    public LocalDate getProdField010() { return prodField010; }
    public void setProdField010(LocalDate prodField010) { this.prodField010 = prodField010; }

    public String getProdField011() { return prodField011; }
    public void setProdField011(String prodField011) { this.prodField011 = prodField011; }

    @Override
    public String toString() {
        return "ProductDto052{" +
            "prodField000=" + prodField000 + ", " +
            "prodField001=" + prodField001 + ", " +
            "prodField002=" + prodField002 + ", " +
            "prodField003=" + prodField003 + ", " +
            "prodField004=" + prodField004 + ", " +
            "}";
    }
}
