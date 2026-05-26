package com.pnb.product;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * ProductDto033 — Data Transfer Object for product operations.
 * Variant 33 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductDto033 {

    @JsonProperty("prodField000")
    private LocalDate prodField000;

    @DecimalMin(value = "0.00")
    @JsonProperty("prodField001")
    private BigDecimal prodField001;

    @JsonProperty("prodField002")
    private Long prodField002;

    @DecimalMin(value = "0.00")
    @JsonProperty("prodField003")
    private BigDecimal prodField003;

    @JsonProperty("prodField004")
    private Boolean prodField004;

    @JsonProperty("prodField005")
    private Long prodField005;

    @JsonProperty("prodField006")
    private Integer prodField006;

    @JsonProperty("prodField007")
    private Boolean prodField007;

    @DecimalMin(value = "0.00")
    @JsonProperty("prodField008")
    private BigDecimal prodField008;

    @JsonProperty("prodField009")
    private Integer prodField009;

    @JsonProperty("prodField010")
    private LocalDate prodField010;

    @JsonProperty("prodField011")
    private Double prodField011;

    @Size(max = 20)
    @JsonProperty("prodField012")
    private String prodField012;

    @JsonProperty("prodField013")
    private Double prodField013;

    @JsonProperty("prodField014")
    private Double prodField014;

    @JsonProperty("prodField015")
    private Boolean prodField015;

    @DecimalMin(value = "0.00")
    @JsonProperty("prodField016")
    private BigDecimal prodField016;

    public ProductDto033() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final ProductDto033 instance = new ProductDto033();

        public Builder prodField000(LocalDate val) { instance.prodField000 = val; return this; }
        public Builder prodField001(BigDecimal val) { instance.prodField001 = val; return this; }
        public Builder prodField002(Long val) { instance.prodField002 = val; return this; }
        public Builder prodField003(BigDecimal val) { instance.prodField003 = val; return this; }
        public Builder prodField004(Boolean val) { instance.prodField004 = val; return this; }
        public Builder prodField005(Long val) { instance.prodField005 = val; return this; }
        public Builder prodField006(Integer val) { instance.prodField006 = val; return this; }
        public Builder prodField007(Boolean val) { instance.prodField007 = val; return this; }
        public Builder prodField008(BigDecimal val) { instance.prodField008 = val; return this; }
        public Builder prodField009(Integer val) { instance.prodField009 = val; return this; }
        public Builder prodField010(LocalDate val) { instance.prodField010 = val; return this; }
        public Builder prodField011(Double val) { instance.prodField011 = val; return this; }
        public Builder prodField012(String val) { instance.prodField012 = val; return this; }
        public Builder prodField013(Double val) { instance.prodField013 = val; return this; }
        public Builder prodField014(Double val) { instance.prodField014 = val; return this; }
        public Builder prodField015(Boolean val) { instance.prodField015 = val; return this; }
        public Builder prodField016(BigDecimal val) { instance.prodField016 = val; return this; }
        public ProductDto033 build() { return instance; }
    }

    public LocalDate getProdField000() { return prodField000; }
    public void setProdField000(LocalDate prodField000) { this.prodField000 = prodField000; }

    public BigDecimal getProdField001() { return prodField001; }
    public void setProdField001(BigDecimal prodField001) { this.prodField001 = prodField001; }

    public Long getProdField002() { return prodField002; }
    public void setProdField002(Long prodField002) { this.prodField002 = prodField002; }

    public BigDecimal getProdField003() { return prodField003; }
    public void setProdField003(BigDecimal prodField003) { this.prodField003 = prodField003; }

    public Boolean getProdField004() { return prodField004; }
    public void setProdField004(Boolean prodField004) { this.prodField004 = prodField004; }

    public Long getProdField005() { return prodField005; }
    public void setProdField005(Long prodField005) { this.prodField005 = prodField005; }

    public Integer getProdField006() { return prodField006; }
    public void setProdField006(Integer prodField006) { this.prodField006 = prodField006; }

    public Boolean getProdField007() { return prodField007; }
    public void setProdField007(Boolean prodField007) { this.prodField007 = prodField007; }

    public BigDecimal getProdField008() { return prodField008; }
    public void setProdField008(BigDecimal prodField008) { this.prodField008 = prodField008; }

    public Integer getProdField009() { return prodField009; }
    public void setProdField009(Integer prodField009) { this.prodField009 = prodField009; }

    public LocalDate getProdField010() { return prodField010; }
    public void setProdField010(LocalDate prodField010) { this.prodField010 = prodField010; }

    public Double getProdField011() { return prodField011; }
    public void setProdField011(Double prodField011) { this.prodField011 = prodField011; }

    public String getProdField012() { return prodField012; }
    public void setProdField012(String prodField012) { this.prodField012 = prodField012; }

    public Double getProdField013() { return prodField013; }
    public void setProdField013(Double prodField013) { this.prodField013 = prodField013; }

    public Double getProdField014() { return prodField014; }
    public void setProdField014(Double prodField014) { this.prodField014 = prodField014; }

    public Boolean getProdField015() { return prodField015; }
    public void setProdField015(Boolean prodField015) { this.prodField015 = prodField015; }

    public BigDecimal getProdField016() { return prodField016; }
    public void setProdField016(BigDecimal prodField016) { this.prodField016 = prodField016; }

    @Override
    public String toString() {
        return "ProductDto033{" +
            "prodField000=" + prodField000 + ", " +
            "prodField001=" + prodField001 + ", " +
            "prodField002=" + prodField002 + ", " +
            "prodField003=" + prodField003 + ", " +
            "prodField004=" + prodField004 + ", " +
            "}";
    }
}
