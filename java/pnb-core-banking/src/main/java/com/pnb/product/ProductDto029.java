package com.pnb.product;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * ProductDto029 — Data Transfer Object for product operations.
 * Variant 29 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductDto029 {

    @JsonProperty("prodField000")
    private Long prodField000;

    @JsonProperty("prodField001")
    private LocalDate prodField001;

    @Size(max = 100)
    @JsonProperty("prodField002")
    private String prodField002;

    @JsonProperty("prodField003")
    private Integer prodField003;

    @JsonProperty("prodField004")
    private Long prodField004;

    @JsonProperty("prodField005")
    private Boolean prodField005;

    @JsonProperty("prodField006")
    private Double prodField006;

    @JsonProperty("prodField007")
    private Boolean prodField007;

    @DecimalMin(value = "0.00")
    @JsonProperty("prodField008")
    private BigDecimal prodField008;

    @JsonProperty("prodField009")
    private LocalDate prodField009;

    @DecimalMin(value = "0.00")
    @JsonProperty("prodField010")
    private BigDecimal prodField010;

    @JsonProperty("prodField011")
    private Long prodField011;

    @JsonProperty("prodField012")
    private Long prodField012;

    public ProductDto029() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final ProductDto029 instance = new ProductDto029();

        public Builder prodField000(Long val) { instance.prodField000 = val; return this; }
        public Builder prodField001(LocalDate val) { instance.prodField001 = val; return this; }
        public Builder prodField002(String val) { instance.prodField002 = val; return this; }
        public Builder prodField003(Integer val) { instance.prodField003 = val; return this; }
        public Builder prodField004(Long val) { instance.prodField004 = val; return this; }
        public Builder prodField005(Boolean val) { instance.prodField005 = val; return this; }
        public Builder prodField006(Double val) { instance.prodField006 = val; return this; }
        public Builder prodField007(Boolean val) { instance.prodField007 = val; return this; }
        public Builder prodField008(BigDecimal val) { instance.prodField008 = val; return this; }
        public Builder prodField009(LocalDate val) { instance.prodField009 = val; return this; }
        public Builder prodField010(BigDecimal val) { instance.prodField010 = val; return this; }
        public Builder prodField011(Long val) { instance.prodField011 = val; return this; }
        public Builder prodField012(Long val) { instance.prodField012 = val; return this; }
        public ProductDto029 build() { return instance; }
    }

    public Long getProdField000() { return prodField000; }
    public void setProdField000(Long prodField000) { this.prodField000 = prodField000; }

    public LocalDate getProdField001() { return prodField001; }
    public void setProdField001(LocalDate prodField001) { this.prodField001 = prodField001; }

    public String getProdField002() { return prodField002; }
    public void setProdField002(String prodField002) { this.prodField002 = prodField002; }

    public Integer getProdField003() { return prodField003; }
    public void setProdField003(Integer prodField003) { this.prodField003 = prodField003; }

    public Long getProdField004() { return prodField004; }
    public void setProdField004(Long prodField004) { this.prodField004 = prodField004; }

    public Boolean getProdField005() { return prodField005; }
    public void setProdField005(Boolean prodField005) { this.prodField005 = prodField005; }

    public Double getProdField006() { return prodField006; }
    public void setProdField006(Double prodField006) { this.prodField006 = prodField006; }

    public Boolean getProdField007() { return prodField007; }
    public void setProdField007(Boolean prodField007) { this.prodField007 = prodField007; }

    public BigDecimal getProdField008() { return prodField008; }
    public void setProdField008(BigDecimal prodField008) { this.prodField008 = prodField008; }

    public LocalDate getProdField009() { return prodField009; }
    public void setProdField009(LocalDate prodField009) { this.prodField009 = prodField009; }

    public BigDecimal getProdField010() { return prodField010; }
    public void setProdField010(BigDecimal prodField010) { this.prodField010 = prodField010; }

    public Long getProdField011() { return prodField011; }
    public void setProdField011(Long prodField011) { this.prodField011 = prodField011; }

    public Long getProdField012() { return prodField012; }
    public void setProdField012(Long prodField012) { this.prodField012 = prodField012; }

    @Override
    public String toString() {
        return "ProductDto029{" +
            "prodField000=" + prodField000 + ", " +
            "prodField001=" + prodField001 + ", " +
            "prodField002=" + prodField002 + ", " +
            "prodField003=" + prodField003 + ", " +
            "prodField004=" + prodField004 + ", " +
            "}";
    }
}
