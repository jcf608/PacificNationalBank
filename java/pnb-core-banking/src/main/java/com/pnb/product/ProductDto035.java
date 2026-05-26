package com.pnb.product;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * ProductDto035 — Data Transfer Object for product operations.
 * Variant 35 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductDto035 {

    @DecimalMin(value = "0.00")
    @JsonProperty("prodField000")
    private BigDecimal prodField000;

    @JsonProperty("prodField001")
    private Long prodField001;

    @JsonProperty("prodField002")
    private Double prodField002;

    @JsonProperty("prodField003")
    private Double prodField003;

    @JsonProperty("prodField004")
    private Double prodField004;

    @JsonProperty("prodField005")
    private LocalDate prodField005;

    @JsonProperty("prodField006")
    private Double prodField006;

    @JsonProperty("prodField007")
    private Integer prodField007;

    @JsonProperty("prodField008")
    private Long prodField008;

    @JsonProperty("prodField009")
    private LocalDate prodField009;

    @Size(max = 20)
    @JsonProperty("prodField010")
    private String prodField010;

    @JsonProperty("prodField011")
    private Double prodField011;

    @JsonProperty("prodField012")
    private LocalDate prodField012;

    @JsonProperty("prodField013")
    private Boolean prodField013;

    @DecimalMin(value = "0.00")
    @JsonProperty("prodField014")
    private BigDecimal prodField014;

    @Size(max = 40)
    @JsonProperty("prodField015")
    private String prodField015;

    @JsonProperty("prodField016")
    private LocalDate prodField016;

    @Size(max = 40)
    @JsonProperty("prodField017")
    private String prodField017;

    @JsonProperty("prodField018")
    private Double prodField018;

    public ProductDto035() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final ProductDto035 instance = new ProductDto035();

        public Builder prodField000(BigDecimal val) { instance.prodField000 = val; return this; }
        public Builder prodField001(Long val) { instance.prodField001 = val; return this; }
        public Builder prodField002(Double val) { instance.prodField002 = val; return this; }
        public Builder prodField003(Double val) { instance.prodField003 = val; return this; }
        public Builder prodField004(Double val) { instance.prodField004 = val; return this; }
        public Builder prodField005(LocalDate val) { instance.prodField005 = val; return this; }
        public Builder prodField006(Double val) { instance.prodField006 = val; return this; }
        public Builder prodField007(Integer val) { instance.prodField007 = val; return this; }
        public Builder prodField008(Long val) { instance.prodField008 = val; return this; }
        public Builder prodField009(LocalDate val) { instance.prodField009 = val; return this; }
        public Builder prodField010(String val) { instance.prodField010 = val; return this; }
        public Builder prodField011(Double val) { instance.prodField011 = val; return this; }
        public Builder prodField012(LocalDate val) { instance.prodField012 = val; return this; }
        public Builder prodField013(Boolean val) { instance.prodField013 = val; return this; }
        public Builder prodField014(BigDecimal val) { instance.prodField014 = val; return this; }
        public Builder prodField015(String val) { instance.prodField015 = val; return this; }
        public Builder prodField016(LocalDate val) { instance.prodField016 = val; return this; }
        public Builder prodField017(String val) { instance.prodField017 = val; return this; }
        public Builder prodField018(Double val) { instance.prodField018 = val; return this; }
        public ProductDto035 build() { return instance; }
    }

    public BigDecimal getProdField000() { return prodField000; }
    public void setProdField000(BigDecimal prodField000) { this.prodField000 = prodField000; }

    public Long getProdField001() { return prodField001; }
    public void setProdField001(Long prodField001) { this.prodField001 = prodField001; }

    public Double getProdField002() { return prodField002; }
    public void setProdField002(Double prodField002) { this.prodField002 = prodField002; }

    public Double getProdField003() { return prodField003; }
    public void setProdField003(Double prodField003) { this.prodField003 = prodField003; }

    public Double getProdField004() { return prodField004; }
    public void setProdField004(Double prodField004) { this.prodField004 = prodField004; }

    public LocalDate getProdField005() { return prodField005; }
    public void setProdField005(LocalDate prodField005) { this.prodField005 = prodField005; }

    public Double getProdField006() { return prodField006; }
    public void setProdField006(Double prodField006) { this.prodField006 = prodField006; }

    public Integer getProdField007() { return prodField007; }
    public void setProdField007(Integer prodField007) { this.prodField007 = prodField007; }

    public Long getProdField008() { return prodField008; }
    public void setProdField008(Long prodField008) { this.prodField008 = prodField008; }

    public LocalDate getProdField009() { return prodField009; }
    public void setProdField009(LocalDate prodField009) { this.prodField009 = prodField009; }

    public String getProdField010() { return prodField010; }
    public void setProdField010(String prodField010) { this.prodField010 = prodField010; }

    public Double getProdField011() { return prodField011; }
    public void setProdField011(Double prodField011) { this.prodField011 = prodField011; }

    public LocalDate getProdField012() { return prodField012; }
    public void setProdField012(LocalDate prodField012) { this.prodField012 = prodField012; }

    public Boolean getProdField013() { return prodField013; }
    public void setProdField013(Boolean prodField013) { this.prodField013 = prodField013; }

    public BigDecimal getProdField014() { return prodField014; }
    public void setProdField014(BigDecimal prodField014) { this.prodField014 = prodField014; }

    public String getProdField015() { return prodField015; }
    public void setProdField015(String prodField015) { this.prodField015 = prodField015; }

    public LocalDate getProdField016() { return prodField016; }
    public void setProdField016(LocalDate prodField016) { this.prodField016 = prodField016; }

    public String getProdField017() { return prodField017; }
    public void setProdField017(String prodField017) { this.prodField017 = prodField017; }

    public Double getProdField018() { return prodField018; }
    public void setProdField018(Double prodField018) { this.prodField018 = prodField018; }

    @Override
    public String toString() {
        return "ProductDto035{" +
            "prodField000=" + prodField000 + ", " +
            "prodField001=" + prodField001 + ", " +
            "prodField002=" + prodField002 + ", " +
            "prodField003=" + prodField003 + ", " +
            "prodField004=" + prodField004 + ", " +
            "}";
    }
}
