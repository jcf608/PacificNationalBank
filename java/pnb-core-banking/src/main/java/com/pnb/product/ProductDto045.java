package com.pnb.product;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * ProductDto045 — Data Transfer Object for product operations.
 * Variant 45 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductDto045 {

    @JsonProperty("prodField000")
    private Boolean prodField000;

    @JsonProperty("prodField001")
    private Long prodField001;

    @JsonProperty("prodField002")
    private Long prodField002;

    @Size(max = 200)
    @JsonProperty("prodField003")
    private String prodField003;

    @JsonProperty("prodField004")
    private Double prodField004;

    @JsonProperty("prodField005")
    private LocalDate prodField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("prodField006")
    private BigDecimal prodField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("prodField007")
    private BigDecimal prodField007;

    @Size(max = 20)
    @JsonProperty("prodField008")
    private String prodField008;

    @JsonProperty("prodField009")
    private Boolean prodField009;

    @JsonProperty("prodField010")
    private Double prodField010;

    @JsonProperty("prodField011")
    private Double prodField011;

    @Size(max = 100)
    @JsonProperty("prodField012")
    private String prodField012;

    @JsonProperty("prodField013")
    private Double prodField013;

    @JsonProperty("prodField014")
    private LocalDate prodField014;

    @JsonProperty("prodField015")
    private Double prodField015;

    @JsonProperty("prodField016")
    private Double prodField016;

    public ProductDto045() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final ProductDto045 instance = new ProductDto045();

        public Builder prodField000(Boolean val) { instance.prodField000 = val; return this; }
        public Builder prodField001(Long val) { instance.prodField001 = val; return this; }
        public Builder prodField002(Long val) { instance.prodField002 = val; return this; }
        public Builder prodField003(String val) { instance.prodField003 = val; return this; }
        public Builder prodField004(Double val) { instance.prodField004 = val; return this; }
        public Builder prodField005(LocalDate val) { instance.prodField005 = val; return this; }
        public Builder prodField006(BigDecimal val) { instance.prodField006 = val; return this; }
        public Builder prodField007(BigDecimal val) { instance.prodField007 = val; return this; }
        public Builder prodField008(String val) { instance.prodField008 = val; return this; }
        public Builder prodField009(Boolean val) { instance.prodField009 = val; return this; }
        public Builder prodField010(Double val) { instance.prodField010 = val; return this; }
        public Builder prodField011(Double val) { instance.prodField011 = val; return this; }
        public Builder prodField012(String val) { instance.prodField012 = val; return this; }
        public Builder prodField013(Double val) { instance.prodField013 = val; return this; }
        public Builder prodField014(LocalDate val) { instance.prodField014 = val; return this; }
        public Builder prodField015(Double val) { instance.prodField015 = val; return this; }
        public Builder prodField016(Double val) { instance.prodField016 = val; return this; }
        public ProductDto045 build() { return instance; }
    }

    public Boolean getProdField000() { return prodField000; }
    public void setProdField000(Boolean prodField000) { this.prodField000 = prodField000; }

    public Long getProdField001() { return prodField001; }
    public void setProdField001(Long prodField001) { this.prodField001 = prodField001; }

    public Long getProdField002() { return prodField002; }
    public void setProdField002(Long prodField002) { this.prodField002 = prodField002; }

    public String getProdField003() { return prodField003; }
    public void setProdField003(String prodField003) { this.prodField003 = prodField003; }

    public Double getProdField004() { return prodField004; }
    public void setProdField004(Double prodField004) { this.prodField004 = prodField004; }

    public LocalDate getProdField005() { return prodField005; }
    public void setProdField005(LocalDate prodField005) { this.prodField005 = prodField005; }

    public BigDecimal getProdField006() { return prodField006; }
    public void setProdField006(BigDecimal prodField006) { this.prodField006 = prodField006; }

    public BigDecimal getProdField007() { return prodField007; }
    public void setProdField007(BigDecimal prodField007) { this.prodField007 = prodField007; }

    public String getProdField008() { return prodField008; }
    public void setProdField008(String prodField008) { this.prodField008 = prodField008; }

    public Boolean getProdField009() { return prodField009; }
    public void setProdField009(Boolean prodField009) { this.prodField009 = prodField009; }

    public Double getProdField010() { return prodField010; }
    public void setProdField010(Double prodField010) { this.prodField010 = prodField010; }

    public Double getProdField011() { return prodField011; }
    public void setProdField011(Double prodField011) { this.prodField011 = prodField011; }

    public String getProdField012() { return prodField012; }
    public void setProdField012(String prodField012) { this.prodField012 = prodField012; }

    public Double getProdField013() { return prodField013; }
    public void setProdField013(Double prodField013) { this.prodField013 = prodField013; }

    public LocalDate getProdField014() { return prodField014; }
    public void setProdField014(LocalDate prodField014) { this.prodField014 = prodField014; }

    public Double getProdField015() { return prodField015; }
    public void setProdField015(Double prodField015) { this.prodField015 = prodField015; }

    public Double getProdField016() { return prodField016; }
    public void setProdField016(Double prodField016) { this.prodField016 = prodField016; }

    @Override
    public String toString() {
        return "ProductDto045{" +
            "prodField000=" + prodField000 + ", " +
            "prodField001=" + prodField001 + ", " +
            "prodField002=" + prodField002 + ", " +
            "prodField003=" + prodField003 + ", " +
            "prodField004=" + prodField004 + ", " +
            "}";
    }
}
