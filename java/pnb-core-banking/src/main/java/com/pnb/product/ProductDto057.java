package com.pnb.product;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * ProductDto057 — Data Transfer Object for product operations.
 * Variant 57 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductDto057 {

    @JsonProperty("prodField000")
    private Integer prodField000;

    @JsonProperty("prodField001")
    private Boolean prodField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("prodField002")
    private BigDecimal prodField002;

    @JsonProperty("prodField003")
    private Long prodField003;

    @JsonProperty("prodField004")
    private LocalDate prodField004;

    @JsonProperty("prodField005")
    private Integer prodField005;

    @JsonProperty("prodField006")
    private Boolean prodField006;

    @JsonProperty("prodField007")
    private Boolean prodField007;

    @DecimalMin(value = "0.00")
    @JsonProperty("prodField008")
    private BigDecimal prodField008;

    @JsonProperty("prodField009")
    private Long prodField009;

    @JsonProperty("prodField010")
    private Double prodField010;

    @DecimalMin(value = "0.00")
    @JsonProperty("prodField011")
    private BigDecimal prodField011;

    @DecimalMin(value = "0.00")
    @JsonProperty("prodField012")
    private BigDecimal prodField012;

    @JsonProperty("prodField013")
    private Long prodField013;

    @JsonProperty("prodField014")
    private Long prodField014;

    @JsonProperty("prodField015")
    private Double prodField015;

    @DecimalMin(value = "0.00")
    @JsonProperty("prodField016")
    private BigDecimal prodField016;

    public ProductDto057() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final ProductDto057 instance = new ProductDto057();

        public Builder prodField000(Integer val) { instance.prodField000 = val; return this; }
        public Builder prodField001(Boolean val) { instance.prodField001 = val; return this; }
        public Builder prodField002(BigDecimal val) { instance.prodField002 = val; return this; }
        public Builder prodField003(Long val) { instance.prodField003 = val; return this; }
        public Builder prodField004(LocalDate val) { instance.prodField004 = val; return this; }
        public Builder prodField005(Integer val) { instance.prodField005 = val; return this; }
        public Builder prodField006(Boolean val) { instance.prodField006 = val; return this; }
        public Builder prodField007(Boolean val) { instance.prodField007 = val; return this; }
        public Builder prodField008(BigDecimal val) { instance.prodField008 = val; return this; }
        public Builder prodField009(Long val) { instance.prodField009 = val; return this; }
        public Builder prodField010(Double val) { instance.prodField010 = val; return this; }
        public Builder prodField011(BigDecimal val) { instance.prodField011 = val; return this; }
        public Builder prodField012(BigDecimal val) { instance.prodField012 = val; return this; }
        public Builder prodField013(Long val) { instance.prodField013 = val; return this; }
        public Builder prodField014(Long val) { instance.prodField014 = val; return this; }
        public Builder prodField015(Double val) { instance.prodField015 = val; return this; }
        public Builder prodField016(BigDecimal val) { instance.prodField016 = val; return this; }
        public ProductDto057 build() { return instance; }
    }

    public Integer getProdField000() { return prodField000; }
    public void setProdField000(Integer prodField000) { this.prodField000 = prodField000; }

    public Boolean getProdField001() { return prodField001; }
    public void setProdField001(Boolean prodField001) { this.prodField001 = prodField001; }

    public BigDecimal getProdField002() { return prodField002; }
    public void setProdField002(BigDecimal prodField002) { this.prodField002 = prodField002; }

    public Long getProdField003() { return prodField003; }
    public void setProdField003(Long prodField003) { this.prodField003 = prodField003; }

    public LocalDate getProdField004() { return prodField004; }
    public void setProdField004(LocalDate prodField004) { this.prodField004 = prodField004; }

    public Integer getProdField005() { return prodField005; }
    public void setProdField005(Integer prodField005) { this.prodField005 = prodField005; }

    public Boolean getProdField006() { return prodField006; }
    public void setProdField006(Boolean prodField006) { this.prodField006 = prodField006; }

    public Boolean getProdField007() { return prodField007; }
    public void setProdField007(Boolean prodField007) { this.prodField007 = prodField007; }

    public BigDecimal getProdField008() { return prodField008; }
    public void setProdField008(BigDecimal prodField008) { this.prodField008 = prodField008; }

    public Long getProdField009() { return prodField009; }
    public void setProdField009(Long prodField009) { this.prodField009 = prodField009; }

    public Double getProdField010() { return prodField010; }
    public void setProdField010(Double prodField010) { this.prodField010 = prodField010; }

    public BigDecimal getProdField011() { return prodField011; }
    public void setProdField011(BigDecimal prodField011) { this.prodField011 = prodField011; }

    public BigDecimal getProdField012() { return prodField012; }
    public void setProdField012(BigDecimal prodField012) { this.prodField012 = prodField012; }

    public Long getProdField013() { return prodField013; }
    public void setProdField013(Long prodField013) { this.prodField013 = prodField013; }

    public Long getProdField014() { return prodField014; }
    public void setProdField014(Long prodField014) { this.prodField014 = prodField014; }

    public Double getProdField015() { return prodField015; }
    public void setProdField015(Double prodField015) { this.prodField015 = prodField015; }

    public BigDecimal getProdField016() { return prodField016; }
    public void setProdField016(BigDecimal prodField016) { this.prodField016 = prodField016; }

    @Override
    public String toString() {
        return "ProductDto057{" +
            "prodField000=" + prodField000 + ", " +
            "prodField001=" + prodField001 + ", " +
            "prodField002=" + prodField002 + ", " +
            "prodField003=" + prodField003 + ", " +
            "prodField004=" + prodField004 + ", " +
            "}";
    }
}
