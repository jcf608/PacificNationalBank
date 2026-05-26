package com.pnb.product;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * ProductDto043 — Data Transfer Object for product operations.
 * Variant 43 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductDto043 {

    @JsonProperty("prodField000")
    private Double prodField000;

    @JsonProperty("prodField001")
    private Double prodField001;

    @Size(max = 200)
    @JsonProperty("prodField002")
    private String prodField002;

    @JsonProperty("prodField003")
    private LocalDate prodField003;

    @JsonProperty("prodField004")
    private Integer prodField004;

    @JsonProperty("prodField005")
    private Integer prodField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("prodField006")
    private BigDecimal prodField006;

    @JsonProperty("prodField007")
    private LocalDate prodField007;

    @JsonProperty("prodField008")
    private Double prodField008;

    @DecimalMin(value = "0.00")
    @JsonProperty("prodField009")
    private BigDecimal prodField009;

    @JsonProperty("prodField010")
    private Long prodField010;

    @JsonProperty("prodField011")
    private Boolean prodField011;

    @DecimalMin(value = "0.00")
    @JsonProperty("prodField012")
    private BigDecimal prodField012;

    @JsonProperty("prodField013")
    private Integer prodField013;

    @JsonProperty("prodField014")
    private Boolean prodField014;

    public ProductDto043() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final ProductDto043 instance = new ProductDto043();

        public Builder prodField000(Double val) { instance.prodField000 = val; return this; }
        public Builder prodField001(Double val) { instance.prodField001 = val; return this; }
        public Builder prodField002(String val) { instance.prodField002 = val; return this; }
        public Builder prodField003(LocalDate val) { instance.prodField003 = val; return this; }
        public Builder prodField004(Integer val) { instance.prodField004 = val; return this; }
        public Builder prodField005(Integer val) { instance.prodField005 = val; return this; }
        public Builder prodField006(BigDecimal val) { instance.prodField006 = val; return this; }
        public Builder prodField007(LocalDate val) { instance.prodField007 = val; return this; }
        public Builder prodField008(Double val) { instance.prodField008 = val; return this; }
        public Builder prodField009(BigDecimal val) { instance.prodField009 = val; return this; }
        public Builder prodField010(Long val) { instance.prodField010 = val; return this; }
        public Builder prodField011(Boolean val) { instance.prodField011 = val; return this; }
        public Builder prodField012(BigDecimal val) { instance.prodField012 = val; return this; }
        public Builder prodField013(Integer val) { instance.prodField013 = val; return this; }
        public Builder prodField014(Boolean val) { instance.prodField014 = val; return this; }
        public ProductDto043 build() { return instance; }
    }

    public Double getProdField000() { return prodField000; }
    public void setProdField000(Double prodField000) { this.prodField000 = prodField000; }

    public Double getProdField001() { return prodField001; }
    public void setProdField001(Double prodField001) { this.prodField001 = prodField001; }

    public String getProdField002() { return prodField002; }
    public void setProdField002(String prodField002) { this.prodField002 = prodField002; }

    public LocalDate getProdField003() { return prodField003; }
    public void setProdField003(LocalDate prodField003) { this.prodField003 = prodField003; }

    public Integer getProdField004() { return prodField004; }
    public void setProdField004(Integer prodField004) { this.prodField004 = prodField004; }

    public Integer getProdField005() { return prodField005; }
    public void setProdField005(Integer prodField005) { this.prodField005 = prodField005; }

    public BigDecimal getProdField006() { return prodField006; }
    public void setProdField006(BigDecimal prodField006) { this.prodField006 = prodField006; }

    public LocalDate getProdField007() { return prodField007; }
    public void setProdField007(LocalDate prodField007) { this.prodField007 = prodField007; }

    public Double getProdField008() { return prodField008; }
    public void setProdField008(Double prodField008) { this.prodField008 = prodField008; }

    public BigDecimal getProdField009() { return prodField009; }
    public void setProdField009(BigDecimal prodField009) { this.prodField009 = prodField009; }

    public Long getProdField010() { return prodField010; }
    public void setProdField010(Long prodField010) { this.prodField010 = prodField010; }

    public Boolean getProdField011() { return prodField011; }
    public void setProdField011(Boolean prodField011) { this.prodField011 = prodField011; }

    public BigDecimal getProdField012() { return prodField012; }
    public void setProdField012(BigDecimal prodField012) { this.prodField012 = prodField012; }

    public Integer getProdField013() { return prodField013; }
    public void setProdField013(Integer prodField013) { this.prodField013 = prodField013; }

    public Boolean getProdField014() { return prodField014; }
    public void setProdField014(Boolean prodField014) { this.prodField014 = prodField014; }

    @Override
    public String toString() {
        return "ProductDto043{" +
            "prodField000=" + prodField000 + ", " +
            "prodField001=" + prodField001 + ", " +
            "prodField002=" + prodField002 + ", " +
            "prodField003=" + prodField003 + ", " +
            "prodField004=" + prodField004 + ", " +
            "}";
    }
}
