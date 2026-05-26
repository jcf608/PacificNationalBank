package com.pnb.product;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * ProductDto041 — Data Transfer Object for product operations.
 * Variant 41 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductDto041 {

    @JsonProperty("prodField000")
    private Integer prodField000;

    @JsonProperty("prodField001")
    private Long prodField001;

    @JsonProperty("prodField002")
    private Long prodField002;

    @JsonProperty("prodField003")
    private Double prodField003;

    @JsonProperty("prodField004")
    private Double prodField004;

    @JsonProperty("prodField005")
    private Boolean prodField005;

    @JsonProperty("prodField006")
    private Integer prodField006;

    @JsonProperty("prodField007")
    private Boolean prodField007;

    @JsonProperty("prodField008")
    private Integer prodField008;

    @DecimalMin(value = "0.00")
    @JsonProperty("prodField009")
    private BigDecimal prodField009;

    @JsonProperty("prodField010")
    private Double prodField010;

    @JsonProperty("prodField011")
    private Long prodField011;

    @JsonProperty("prodField012")
    private Integer prodField012;

    public ProductDto041() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final ProductDto041 instance = new ProductDto041();

        public Builder prodField000(Integer val) { instance.prodField000 = val; return this; }
        public Builder prodField001(Long val) { instance.prodField001 = val; return this; }
        public Builder prodField002(Long val) { instance.prodField002 = val; return this; }
        public Builder prodField003(Double val) { instance.prodField003 = val; return this; }
        public Builder prodField004(Double val) { instance.prodField004 = val; return this; }
        public Builder prodField005(Boolean val) { instance.prodField005 = val; return this; }
        public Builder prodField006(Integer val) { instance.prodField006 = val; return this; }
        public Builder prodField007(Boolean val) { instance.prodField007 = val; return this; }
        public Builder prodField008(Integer val) { instance.prodField008 = val; return this; }
        public Builder prodField009(BigDecimal val) { instance.prodField009 = val; return this; }
        public Builder prodField010(Double val) { instance.prodField010 = val; return this; }
        public Builder prodField011(Long val) { instance.prodField011 = val; return this; }
        public Builder prodField012(Integer val) { instance.prodField012 = val; return this; }
        public ProductDto041 build() { return instance; }
    }

    public Integer getProdField000() { return prodField000; }
    public void setProdField000(Integer prodField000) { this.prodField000 = prodField000; }

    public Long getProdField001() { return prodField001; }
    public void setProdField001(Long prodField001) { this.prodField001 = prodField001; }

    public Long getProdField002() { return prodField002; }
    public void setProdField002(Long prodField002) { this.prodField002 = prodField002; }

    public Double getProdField003() { return prodField003; }
    public void setProdField003(Double prodField003) { this.prodField003 = prodField003; }

    public Double getProdField004() { return prodField004; }
    public void setProdField004(Double prodField004) { this.prodField004 = prodField004; }

    public Boolean getProdField005() { return prodField005; }
    public void setProdField005(Boolean prodField005) { this.prodField005 = prodField005; }

    public Integer getProdField006() { return prodField006; }
    public void setProdField006(Integer prodField006) { this.prodField006 = prodField006; }

    public Boolean getProdField007() { return prodField007; }
    public void setProdField007(Boolean prodField007) { this.prodField007 = prodField007; }

    public Integer getProdField008() { return prodField008; }
    public void setProdField008(Integer prodField008) { this.prodField008 = prodField008; }

    public BigDecimal getProdField009() { return prodField009; }
    public void setProdField009(BigDecimal prodField009) { this.prodField009 = prodField009; }

    public Double getProdField010() { return prodField010; }
    public void setProdField010(Double prodField010) { this.prodField010 = prodField010; }

    public Long getProdField011() { return prodField011; }
    public void setProdField011(Long prodField011) { this.prodField011 = prodField011; }

    public Integer getProdField012() { return prodField012; }
    public void setProdField012(Integer prodField012) { this.prodField012 = prodField012; }

    @Override
    public String toString() {
        return "ProductDto041{" +
            "prodField000=" + prodField000 + ", " +
            "prodField001=" + prodField001 + ", " +
            "prodField002=" + prodField002 + ", " +
            "prodField003=" + prodField003 + ", " +
            "prodField004=" + prodField004 + ", " +
            "}";
    }
}
