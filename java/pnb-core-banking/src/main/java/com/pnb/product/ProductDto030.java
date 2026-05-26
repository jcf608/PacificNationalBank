package com.pnb.product;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * ProductDto030 — Data Transfer Object for product operations.
 * Variant 30 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductDto030 {

    @JsonProperty("prodField000")
    private Integer prodField000;

    @DecimalMin(value = "0.00")
    @JsonProperty("prodField001")
    private BigDecimal prodField001;

    @JsonProperty("prodField002")
    private LocalDate prodField002;

    @JsonProperty("prodField003")
    private Double prodField003;

    @JsonProperty("prodField004")
    private Integer prodField004;

    @JsonProperty("prodField005")
    private Boolean prodField005;

    @JsonProperty("prodField006")
    private Integer prodField006;

    @JsonProperty("prodField007")
    private Integer prodField007;

    @JsonProperty("prodField008")
    private LocalDate prodField008;

    @JsonProperty("prodField009")
    private Double prodField009;

    @JsonProperty("prodField010")
    private Integer prodField010;

    @JsonProperty("prodField011")
    private LocalDate prodField011;

    @JsonProperty("prodField012")
    private Double prodField012;

    @JsonProperty("prodField013")
    private Long prodField013;

    public ProductDto030() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final ProductDto030 instance = new ProductDto030();

        public Builder prodField000(Integer val) { instance.prodField000 = val; return this; }
        public Builder prodField001(BigDecimal val) { instance.prodField001 = val; return this; }
        public Builder prodField002(LocalDate val) { instance.prodField002 = val; return this; }
        public Builder prodField003(Double val) { instance.prodField003 = val; return this; }
        public Builder prodField004(Integer val) { instance.prodField004 = val; return this; }
        public Builder prodField005(Boolean val) { instance.prodField005 = val; return this; }
        public Builder prodField006(Integer val) { instance.prodField006 = val; return this; }
        public Builder prodField007(Integer val) { instance.prodField007 = val; return this; }
        public Builder prodField008(LocalDate val) { instance.prodField008 = val; return this; }
        public Builder prodField009(Double val) { instance.prodField009 = val; return this; }
        public Builder prodField010(Integer val) { instance.prodField010 = val; return this; }
        public Builder prodField011(LocalDate val) { instance.prodField011 = val; return this; }
        public Builder prodField012(Double val) { instance.prodField012 = val; return this; }
        public Builder prodField013(Long val) { instance.prodField013 = val; return this; }
        public ProductDto030 build() { return instance; }
    }

    public Integer getProdField000() { return prodField000; }
    public void setProdField000(Integer prodField000) { this.prodField000 = prodField000; }

    public BigDecimal getProdField001() { return prodField001; }
    public void setProdField001(BigDecimal prodField001) { this.prodField001 = prodField001; }

    public LocalDate getProdField002() { return prodField002; }
    public void setProdField002(LocalDate prodField002) { this.prodField002 = prodField002; }

    public Double getProdField003() { return prodField003; }
    public void setProdField003(Double prodField003) { this.prodField003 = prodField003; }

    public Integer getProdField004() { return prodField004; }
    public void setProdField004(Integer prodField004) { this.prodField004 = prodField004; }

    public Boolean getProdField005() { return prodField005; }
    public void setProdField005(Boolean prodField005) { this.prodField005 = prodField005; }

    public Integer getProdField006() { return prodField006; }
    public void setProdField006(Integer prodField006) { this.prodField006 = prodField006; }

    public Integer getProdField007() { return prodField007; }
    public void setProdField007(Integer prodField007) { this.prodField007 = prodField007; }

    public LocalDate getProdField008() { return prodField008; }
    public void setProdField008(LocalDate prodField008) { this.prodField008 = prodField008; }

    public Double getProdField009() { return prodField009; }
    public void setProdField009(Double prodField009) { this.prodField009 = prodField009; }

    public Integer getProdField010() { return prodField010; }
    public void setProdField010(Integer prodField010) { this.prodField010 = prodField010; }

    public LocalDate getProdField011() { return prodField011; }
    public void setProdField011(LocalDate prodField011) { this.prodField011 = prodField011; }

    public Double getProdField012() { return prodField012; }
    public void setProdField012(Double prodField012) { this.prodField012 = prodField012; }

    public Long getProdField013() { return prodField013; }
    public void setProdField013(Long prodField013) { this.prodField013 = prodField013; }

    @Override
    public String toString() {
        return "ProductDto030{" +
            "prodField000=" + prodField000 + ", " +
            "prodField001=" + prodField001 + ", " +
            "prodField002=" + prodField002 + ", " +
            "prodField003=" + prodField003 + ", " +
            "prodField004=" + prodField004 + ", " +
            "}";
    }
}
