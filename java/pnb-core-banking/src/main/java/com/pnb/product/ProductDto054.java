package com.pnb.product;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * ProductDto054 — Data Transfer Object for product operations.
 * Variant 54 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductDto054 {

    @DecimalMin(value = "0.00")
    @JsonProperty("prodField000")
    private BigDecimal prodField000;

    @JsonProperty("prodField001")
    private LocalDate prodField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("prodField002")
    private BigDecimal prodField002;

    @JsonProperty("prodField003")
    private LocalDate prodField003;

    @JsonProperty("prodField004")
    private Integer prodField004;

    @JsonProperty("prodField005")
    private Long prodField005;

    @JsonProperty("prodField006")
    private LocalDate prodField006;

    @JsonProperty("prodField007")
    private Long prodField007;

    @DecimalMin(value = "0.00")
    @JsonProperty("prodField008")
    private BigDecimal prodField008;

    @JsonProperty("prodField009")
    private Long prodField009;

    @JsonProperty("prodField010")
    private Boolean prodField010;

    @JsonProperty("prodField011")
    private Double prodField011;

    @DecimalMin(value = "0.00")
    @JsonProperty("prodField012")
    private BigDecimal prodField012;

    @JsonProperty("prodField013")
    private Boolean prodField013;

    public ProductDto054() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final ProductDto054 instance = new ProductDto054();

        public Builder prodField000(BigDecimal val) { instance.prodField000 = val; return this; }
        public Builder prodField001(LocalDate val) { instance.prodField001 = val; return this; }
        public Builder prodField002(BigDecimal val) { instance.prodField002 = val; return this; }
        public Builder prodField003(LocalDate val) { instance.prodField003 = val; return this; }
        public Builder prodField004(Integer val) { instance.prodField004 = val; return this; }
        public Builder prodField005(Long val) { instance.prodField005 = val; return this; }
        public Builder prodField006(LocalDate val) { instance.prodField006 = val; return this; }
        public Builder prodField007(Long val) { instance.prodField007 = val; return this; }
        public Builder prodField008(BigDecimal val) { instance.prodField008 = val; return this; }
        public Builder prodField009(Long val) { instance.prodField009 = val; return this; }
        public Builder prodField010(Boolean val) { instance.prodField010 = val; return this; }
        public Builder prodField011(Double val) { instance.prodField011 = val; return this; }
        public Builder prodField012(BigDecimal val) { instance.prodField012 = val; return this; }
        public Builder prodField013(Boolean val) { instance.prodField013 = val; return this; }
        public ProductDto054 build() { return instance; }
    }

    public BigDecimal getProdField000() { return prodField000; }
    public void setProdField000(BigDecimal prodField000) { this.prodField000 = prodField000; }

    public LocalDate getProdField001() { return prodField001; }
    public void setProdField001(LocalDate prodField001) { this.prodField001 = prodField001; }

    public BigDecimal getProdField002() { return prodField002; }
    public void setProdField002(BigDecimal prodField002) { this.prodField002 = prodField002; }

    public LocalDate getProdField003() { return prodField003; }
    public void setProdField003(LocalDate prodField003) { this.prodField003 = prodField003; }

    public Integer getProdField004() { return prodField004; }
    public void setProdField004(Integer prodField004) { this.prodField004 = prodField004; }

    public Long getProdField005() { return prodField005; }
    public void setProdField005(Long prodField005) { this.prodField005 = prodField005; }

    public LocalDate getProdField006() { return prodField006; }
    public void setProdField006(LocalDate prodField006) { this.prodField006 = prodField006; }

    public Long getProdField007() { return prodField007; }
    public void setProdField007(Long prodField007) { this.prodField007 = prodField007; }

    public BigDecimal getProdField008() { return prodField008; }
    public void setProdField008(BigDecimal prodField008) { this.prodField008 = prodField008; }

    public Long getProdField009() { return prodField009; }
    public void setProdField009(Long prodField009) { this.prodField009 = prodField009; }

    public Boolean getProdField010() { return prodField010; }
    public void setProdField010(Boolean prodField010) { this.prodField010 = prodField010; }

    public Double getProdField011() { return prodField011; }
    public void setProdField011(Double prodField011) { this.prodField011 = prodField011; }

    public BigDecimal getProdField012() { return prodField012; }
    public void setProdField012(BigDecimal prodField012) { this.prodField012 = prodField012; }

    public Boolean getProdField013() { return prodField013; }
    public void setProdField013(Boolean prodField013) { this.prodField013 = prodField013; }

    @Override
    public String toString() {
        return "ProductDto054{" +
            "prodField000=" + prodField000 + ", " +
            "prodField001=" + prodField001 + ", " +
            "prodField002=" + prodField002 + ", " +
            "prodField003=" + prodField003 + ", " +
            "prodField004=" + prodField004 + ", " +
            "}";
    }
}
