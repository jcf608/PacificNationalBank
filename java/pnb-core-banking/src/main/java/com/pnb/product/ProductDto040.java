package com.pnb.product;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * ProductDto040 — Data Transfer Object for product operations.
 * Variant 40 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductDto040 {

    @JsonProperty("prodField000")
    private Long prodField000;

    @JsonProperty("prodField001")
    private LocalDate prodField001;

    @JsonProperty("prodField002")
    private Long prodField002;

    @DecimalMin(value = "0.00")
    @JsonProperty("prodField003")
    private BigDecimal prodField003;

    @DecimalMin(value = "0.00")
    @JsonProperty("prodField004")
    private BigDecimal prodField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("prodField005")
    private BigDecimal prodField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("prodField006")
    private BigDecimal prodField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("prodField007")
    private BigDecimal prodField007;

    @JsonProperty("prodField008")
    private Integer prodField008;

    @JsonProperty("prodField009")
    private Integer prodField009;

    @JsonProperty("prodField010")
    private LocalDate prodField010;

    @Size(max = 60)
    @JsonProperty("prodField011")
    private String prodField011;

    public ProductDto040() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final ProductDto040 instance = new ProductDto040();

        public Builder prodField000(Long val) { instance.prodField000 = val; return this; }
        public Builder prodField001(LocalDate val) { instance.prodField001 = val; return this; }
        public Builder prodField002(Long val) { instance.prodField002 = val; return this; }
        public Builder prodField003(BigDecimal val) { instance.prodField003 = val; return this; }
        public Builder prodField004(BigDecimal val) { instance.prodField004 = val; return this; }
        public Builder prodField005(BigDecimal val) { instance.prodField005 = val; return this; }
        public Builder prodField006(BigDecimal val) { instance.prodField006 = val; return this; }
        public Builder prodField007(BigDecimal val) { instance.prodField007 = val; return this; }
        public Builder prodField008(Integer val) { instance.prodField008 = val; return this; }
        public Builder prodField009(Integer val) { instance.prodField009 = val; return this; }
        public Builder prodField010(LocalDate val) { instance.prodField010 = val; return this; }
        public Builder prodField011(String val) { instance.prodField011 = val; return this; }
        public ProductDto040 build() { return instance; }
    }

    public Long getProdField000() { return prodField000; }
    public void setProdField000(Long prodField000) { this.prodField000 = prodField000; }

    public LocalDate getProdField001() { return prodField001; }
    public void setProdField001(LocalDate prodField001) { this.prodField001 = prodField001; }

    public Long getProdField002() { return prodField002; }
    public void setProdField002(Long prodField002) { this.prodField002 = prodField002; }

    public BigDecimal getProdField003() { return prodField003; }
    public void setProdField003(BigDecimal prodField003) { this.prodField003 = prodField003; }

    public BigDecimal getProdField004() { return prodField004; }
    public void setProdField004(BigDecimal prodField004) { this.prodField004 = prodField004; }

    public BigDecimal getProdField005() { return prodField005; }
    public void setProdField005(BigDecimal prodField005) { this.prodField005 = prodField005; }

    public BigDecimal getProdField006() { return prodField006; }
    public void setProdField006(BigDecimal prodField006) { this.prodField006 = prodField006; }

    public BigDecimal getProdField007() { return prodField007; }
    public void setProdField007(BigDecimal prodField007) { this.prodField007 = prodField007; }

    public Integer getProdField008() { return prodField008; }
    public void setProdField008(Integer prodField008) { this.prodField008 = prodField008; }

    public Integer getProdField009() { return prodField009; }
    public void setProdField009(Integer prodField009) { this.prodField009 = prodField009; }

    public LocalDate getProdField010() { return prodField010; }
    public void setProdField010(LocalDate prodField010) { this.prodField010 = prodField010; }

    public String getProdField011() { return prodField011; }
    public void setProdField011(String prodField011) { this.prodField011 = prodField011; }

    @Override
    public String toString() {
        return "ProductDto040{" +
            "prodField000=" + prodField000 + ", " +
            "prodField001=" + prodField001 + ", " +
            "prodField002=" + prodField002 + ", " +
            "prodField003=" + prodField003 + ", " +
            "prodField004=" + prodField004 + ", " +
            "}";
    }
}
