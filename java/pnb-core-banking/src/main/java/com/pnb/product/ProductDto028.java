package com.pnb.product;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * ProductDto028 — Data Transfer Object for product operations.
 * Variant 28 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductDto028 {

    @JsonProperty("prodField000")
    private LocalDate prodField000;

    @JsonProperty("prodField001")
    private Double prodField001;

    @JsonProperty("prodField002")
    private Integer prodField002;

    @Size(max = 60)
    @JsonProperty("prodField003")
    private String prodField003;

    @DecimalMin(value = "0.00")
    @JsonProperty("prodField004")
    private BigDecimal prodField004;

    @JsonProperty("prodField005")
    private Boolean prodField005;

    @JsonProperty("prodField006")
    private Integer prodField006;

    @JsonProperty("prodField007")
    private Boolean prodField007;

    @Size(max = 100)
    @JsonProperty("prodField008")
    private String prodField008;

    @Size(max = 40)
    @JsonProperty("prodField009")
    private String prodField009;

    @DecimalMin(value = "0.00")
    @JsonProperty("prodField010")
    private BigDecimal prodField010;

    @JsonProperty("prodField011")
    private Boolean prodField011;

    public ProductDto028() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final ProductDto028 instance = new ProductDto028();

        public Builder prodField000(LocalDate val) { instance.prodField000 = val; return this; }
        public Builder prodField001(Double val) { instance.prodField001 = val; return this; }
        public Builder prodField002(Integer val) { instance.prodField002 = val; return this; }
        public Builder prodField003(String val) { instance.prodField003 = val; return this; }
        public Builder prodField004(BigDecimal val) { instance.prodField004 = val; return this; }
        public Builder prodField005(Boolean val) { instance.prodField005 = val; return this; }
        public Builder prodField006(Integer val) { instance.prodField006 = val; return this; }
        public Builder prodField007(Boolean val) { instance.prodField007 = val; return this; }
        public Builder prodField008(String val) { instance.prodField008 = val; return this; }
        public Builder prodField009(String val) { instance.prodField009 = val; return this; }
        public Builder prodField010(BigDecimal val) { instance.prodField010 = val; return this; }
        public Builder prodField011(Boolean val) { instance.prodField011 = val; return this; }
        public ProductDto028 build() { return instance; }
    }

    public LocalDate getProdField000() { return prodField000; }
    public void setProdField000(LocalDate prodField000) { this.prodField000 = prodField000; }

    public Double getProdField001() { return prodField001; }
    public void setProdField001(Double prodField001) { this.prodField001 = prodField001; }

    public Integer getProdField002() { return prodField002; }
    public void setProdField002(Integer prodField002) { this.prodField002 = prodField002; }

    public String getProdField003() { return prodField003; }
    public void setProdField003(String prodField003) { this.prodField003 = prodField003; }

    public BigDecimal getProdField004() { return prodField004; }
    public void setProdField004(BigDecimal prodField004) { this.prodField004 = prodField004; }

    public Boolean getProdField005() { return prodField005; }
    public void setProdField005(Boolean prodField005) { this.prodField005 = prodField005; }

    public Integer getProdField006() { return prodField006; }
    public void setProdField006(Integer prodField006) { this.prodField006 = prodField006; }

    public Boolean getProdField007() { return prodField007; }
    public void setProdField007(Boolean prodField007) { this.prodField007 = prodField007; }

    public String getProdField008() { return prodField008; }
    public void setProdField008(String prodField008) { this.prodField008 = prodField008; }

    public String getProdField009() { return prodField009; }
    public void setProdField009(String prodField009) { this.prodField009 = prodField009; }

    public BigDecimal getProdField010() { return prodField010; }
    public void setProdField010(BigDecimal prodField010) { this.prodField010 = prodField010; }

    public Boolean getProdField011() { return prodField011; }
    public void setProdField011(Boolean prodField011) { this.prodField011 = prodField011; }

    @Override
    public String toString() {
        return "ProductDto028{" +
            "prodField000=" + prodField000 + ", " +
            "prodField001=" + prodField001 + ", " +
            "prodField002=" + prodField002 + ", " +
            "prodField003=" + prodField003 + ", " +
            "prodField004=" + prodField004 + ", " +
            "}";
    }
}
