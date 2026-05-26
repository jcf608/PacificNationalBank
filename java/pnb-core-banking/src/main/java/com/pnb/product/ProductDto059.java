package com.pnb.product;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * ProductDto059 — Data Transfer Object for product operations.
 * Variant 59 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductDto059 {

    @JsonProperty("prodField000")
    private Double prodField000;

    @JsonProperty("prodField001")
    private Double prodField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("prodField002")
    private BigDecimal prodField002;

    @Size(max = 20)
    @JsonProperty("prodField003")
    private String prodField003;

    @Size(max = 60)
    @JsonProperty("prodField004")
    private String prodField004;

    @JsonProperty("prodField005")
    private Double prodField005;

    @JsonProperty("prodField006")
    private Double prodField006;

    @JsonProperty("prodField007")
    private Integer prodField007;

    @JsonProperty("prodField008")
    private LocalDate prodField008;

    @JsonProperty("prodField009")
    private Double prodField009;

    @JsonProperty("prodField010")
    private Boolean prodField010;

    @JsonProperty("prodField011")
    private LocalDate prodField011;

    @JsonProperty("prodField012")
    private Double prodField012;

    @JsonProperty("prodField013")
    private Long prodField013;

    @JsonProperty("prodField014")
    private Boolean prodField014;

    @JsonProperty("prodField015")
    private LocalDate prodField015;

    @DecimalMin(value = "0.00")
    @JsonProperty("prodField016")
    private BigDecimal prodField016;

    @Size(max = 40)
    @JsonProperty("prodField017")
    private String prodField017;

    @JsonProperty("prodField018")
    private Long prodField018;

    public ProductDto059() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final ProductDto059 instance = new ProductDto059();

        public Builder prodField000(Double val) { instance.prodField000 = val; return this; }
        public Builder prodField001(Double val) { instance.prodField001 = val; return this; }
        public Builder prodField002(BigDecimal val) { instance.prodField002 = val; return this; }
        public Builder prodField003(String val) { instance.prodField003 = val; return this; }
        public Builder prodField004(String val) { instance.prodField004 = val; return this; }
        public Builder prodField005(Double val) { instance.prodField005 = val; return this; }
        public Builder prodField006(Double val) { instance.prodField006 = val; return this; }
        public Builder prodField007(Integer val) { instance.prodField007 = val; return this; }
        public Builder prodField008(LocalDate val) { instance.prodField008 = val; return this; }
        public Builder prodField009(Double val) { instance.prodField009 = val; return this; }
        public Builder prodField010(Boolean val) { instance.prodField010 = val; return this; }
        public Builder prodField011(LocalDate val) { instance.prodField011 = val; return this; }
        public Builder prodField012(Double val) { instance.prodField012 = val; return this; }
        public Builder prodField013(Long val) { instance.prodField013 = val; return this; }
        public Builder prodField014(Boolean val) { instance.prodField014 = val; return this; }
        public Builder prodField015(LocalDate val) { instance.prodField015 = val; return this; }
        public Builder prodField016(BigDecimal val) { instance.prodField016 = val; return this; }
        public Builder prodField017(String val) { instance.prodField017 = val; return this; }
        public Builder prodField018(Long val) { instance.prodField018 = val; return this; }
        public ProductDto059 build() { return instance; }
    }

    public Double getProdField000() { return prodField000; }
    public void setProdField000(Double prodField000) { this.prodField000 = prodField000; }

    public Double getProdField001() { return prodField001; }
    public void setProdField001(Double prodField001) { this.prodField001 = prodField001; }

    public BigDecimal getProdField002() { return prodField002; }
    public void setProdField002(BigDecimal prodField002) { this.prodField002 = prodField002; }

    public String getProdField003() { return prodField003; }
    public void setProdField003(String prodField003) { this.prodField003 = prodField003; }

    public String getProdField004() { return prodField004; }
    public void setProdField004(String prodField004) { this.prodField004 = prodField004; }

    public Double getProdField005() { return prodField005; }
    public void setProdField005(Double prodField005) { this.prodField005 = prodField005; }

    public Double getProdField006() { return prodField006; }
    public void setProdField006(Double prodField006) { this.prodField006 = prodField006; }

    public Integer getProdField007() { return prodField007; }
    public void setProdField007(Integer prodField007) { this.prodField007 = prodField007; }

    public LocalDate getProdField008() { return prodField008; }
    public void setProdField008(LocalDate prodField008) { this.prodField008 = prodField008; }

    public Double getProdField009() { return prodField009; }
    public void setProdField009(Double prodField009) { this.prodField009 = prodField009; }

    public Boolean getProdField010() { return prodField010; }
    public void setProdField010(Boolean prodField010) { this.prodField010 = prodField010; }

    public LocalDate getProdField011() { return prodField011; }
    public void setProdField011(LocalDate prodField011) { this.prodField011 = prodField011; }

    public Double getProdField012() { return prodField012; }
    public void setProdField012(Double prodField012) { this.prodField012 = prodField012; }

    public Long getProdField013() { return prodField013; }
    public void setProdField013(Long prodField013) { this.prodField013 = prodField013; }

    public Boolean getProdField014() { return prodField014; }
    public void setProdField014(Boolean prodField014) { this.prodField014 = prodField014; }

    public LocalDate getProdField015() { return prodField015; }
    public void setProdField015(LocalDate prodField015) { this.prodField015 = prodField015; }

    public BigDecimal getProdField016() { return prodField016; }
    public void setProdField016(BigDecimal prodField016) { this.prodField016 = prodField016; }

    public String getProdField017() { return prodField017; }
    public void setProdField017(String prodField017) { this.prodField017 = prodField017; }

    public Long getProdField018() { return prodField018; }
    public void setProdField018(Long prodField018) { this.prodField018 = prodField018; }

    @Override
    public String toString() {
        return "ProductDto059{" +
            "prodField000=" + prodField000 + ", " +
            "prodField001=" + prodField001 + ", " +
            "prodField002=" + prodField002 + ", " +
            "prodField003=" + prodField003 + ", " +
            "prodField004=" + prodField004 + ", " +
            "}";
    }
}
