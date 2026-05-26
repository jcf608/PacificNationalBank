package com.pnb.product;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * ProductDto023 — Data Transfer Object for product operations.
 * Variant 23 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductDto023 {

    @Size(max = 20)
    @JsonProperty("prodField000")
    private String prodField000;

    @JsonProperty("prodField001")
    private Double prodField001;

    @JsonProperty("prodField002")
    private Integer prodField002;

    @JsonProperty("prodField003")
    private Double prodField003;

    @JsonProperty("prodField004")
    private Double prodField004;

    @JsonProperty("prodField005")
    private Integer prodField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("prodField006")
    private BigDecimal prodField006;

    @JsonProperty("prodField007")
    private Integer prodField007;

    @JsonProperty("prodField008")
    private LocalDate prodField008;

    @JsonProperty("prodField009")
    private Double prodField009;

    @JsonProperty("prodField010")
    private Double prodField010;

    @JsonProperty("prodField011")
    private Integer prodField011;

    @JsonProperty("prodField012")
    private Boolean prodField012;

    @DecimalMin(value = "0.00")
    @JsonProperty("prodField013")
    private BigDecimal prodField013;

    @DecimalMin(value = "0.00")
    @JsonProperty("prodField014")
    private BigDecimal prodField014;

    @JsonProperty("prodField015")
    private LocalDate prodField015;

    @DecimalMin(value = "0.00")
    @JsonProperty("prodField016")
    private BigDecimal prodField016;

    @JsonProperty("prodField017")
    private Boolean prodField017;

    @JsonProperty("prodField018")
    private LocalDate prodField018;

    public ProductDto023() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final ProductDto023 instance = new ProductDto023();

        public Builder prodField000(String val) { instance.prodField000 = val; return this; }
        public Builder prodField001(Double val) { instance.prodField001 = val; return this; }
        public Builder prodField002(Integer val) { instance.prodField002 = val; return this; }
        public Builder prodField003(Double val) { instance.prodField003 = val; return this; }
        public Builder prodField004(Double val) { instance.prodField004 = val; return this; }
        public Builder prodField005(Integer val) { instance.prodField005 = val; return this; }
        public Builder prodField006(BigDecimal val) { instance.prodField006 = val; return this; }
        public Builder prodField007(Integer val) { instance.prodField007 = val; return this; }
        public Builder prodField008(LocalDate val) { instance.prodField008 = val; return this; }
        public Builder prodField009(Double val) { instance.prodField009 = val; return this; }
        public Builder prodField010(Double val) { instance.prodField010 = val; return this; }
        public Builder prodField011(Integer val) { instance.prodField011 = val; return this; }
        public Builder prodField012(Boolean val) { instance.prodField012 = val; return this; }
        public Builder prodField013(BigDecimal val) { instance.prodField013 = val; return this; }
        public Builder prodField014(BigDecimal val) { instance.prodField014 = val; return this; }
        public Builder prodField015(LocalDate val) { instance.prodField015 = val; return this; }
        public Builder prodField016(BigDecimal val) { instance.prodField016 = val; return this; }
        public Builder prodField017(Boolean val) { instance.prodField017 = val; return this; }
        public Builder prodField018(LocalDate val) { instance.prodField018 = val; return this; }
        public ProductDto023 build() { return instance; }
    }

    public String getProdField000() { return prodField000; }
    public void setProdField000(String prodField000) { this.prodField000 = prodField000; }

    public Double getProdField001() { return prodField001; }
    public void setProdField001(Double prodField001) { this.prodField001 = prodField001; }

    public Integer getProdField002() { return prodField002; }
    public void setProdField002(Integer prodField002) { this.prodField002 = prodField002; }

    public Double getProdField003() { return prodField003; }
    public void setProdField003(Double prodField003) { this.prodField003 = prodField003; }

    public Double getProdField004() { return prodField004; }
    public void setProdField004(Double prodField004) { this.prodField004 = prodField004; }

    public Integer getProdField005() { return prodField005; }
    public void setProdField005(Integer prodField005) { this.prodField005 = prodField005; }

    public BigDecimal getProdField006() { return prodField006; }
    public void setProdField006(BigDecimal prodField006) { this.prodField006 = prodField006; }

    public Integer getProdField007() { return prodField007; }
    public void setProdField007(Integer prodField007) { this.prodField007 = prodField007; }

    public LocalDate getProdField008() { return prodField008; }
    public void setProdField008(LocalDate prodField008) { this.prodField008 = prodField008; }

    public Double getProdField009() { return prodField009; }
    public void setProdField009(Double prodField009) { this.prodField009 = prodField009; }

    public Double getProdField010() { return prodField010; }
    public void setProdField010(Double prodField010) { this.prodField010 = prodField010; }

    public Integer getProdField011() { return prodField011; }
    public void setProdField011(Integer prodField011) { this.prodField011 = prodField011; }

    public Boolean getProdField012() { return prodField012; }
    public void setProdField012(Boolean prodField012) { this.prodField012 = prodField012; }

    public BigDecimal getProdField013() { return prodField013; }
    public void setProdField013(BigDecimal prodField013) { this.prodField013 = prodField013; }

    public BigDecimal getProdField014() { return prodField014; }
    public void setProdField014(BigDecimal prodField014) { this.prodField014 = prodField014; }

    public LocalDate getProdField015() { return prodField015; }
    public void setProdField015(LocalDate prodField015) { this.prodField015 = prodField015; }

    public BigDecimal getProdField016() { return prodField016; }
    public void setProdField016(BigDecimal prodField016) { this.prodField016 = prodField016; }

    public Boolean getProdField017() { return prodField017; }
    public void setProdField017(Boolean prodField017) { this.prodField017 = prodField017; }

    public LocalDate getProdField018() { return prodField018; }
    public void setProdField018(LocalDate prodField018) { this.prodField018 = prodField018; }

    @Override
    public String toString() {
        return "ProductDto023{" +
            "prodField000=" + prodField000 + ", " +
            "prodField001=" + prodField001 + ", " +
            "prodField002=" + prodField002 + ", " +
            "prodField003=" + prodField003 + ", " +
            "prodField004=" + prodField004 + ", " +
            "}";
    }
}
