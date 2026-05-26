package com.pnb.product;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * ProductDto058 — Data Transfer Object for product operations.
 * Variant 58 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductDto058 {

    @JsonProperty("prodField000")
    private Boolean prodField000;

    @DecimalMin(value = "0.00")
    @JsonProperty("prodField001")
    private BigDecimal prodField001;

    @Size(max = 20)
    @JsonProperty("prodField002")
    private String prodField002;

    @DecimalMin(value = "0.00")
    @JsonProperty("prodField003")
    private BigDecimal prodField003;

    @JsonProperty("prodField004")
    private Boolean prodField004;

    @JsonProperty("prodField005")
    private LocalDate prodField005;

    @Size(max = 20)
    @JsonProperty("prodField006")
    private String prodField006;

    @Size(max = 200)
    @JsonProperty("prodField007")
    private String prodField007;

    @JsonProperty("prodField008")
    private Boolean prodField008;

    @JsonProperty("prodField009")
    private Boolean prodField009;

    @DecimalMin(value = "0.00")
    @JsonProperty("prodField010")
    private BigDecimal prodField010;

    @JsonProperty("prodField011")
    private Double prodField011;

    @JsonProperty("prodField012")
    private Boolean prodField012;

    @JsonProperty("prodField013")
    private Integer prodField013;

    @JsonProperty("prodField014")
    private Long prodField014;

    @Size(max = 20)
    @JsonProperty("prodField015")
    private String prodField015;

    @Size(max = 100)
    @JsonProperty("prodField016")
    private String prodField016;

    @JsonProperty("prodField017")
    private Double prodField017;

    public ProductDto058() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final ProductDto058 instance = new ProductDto058();

        public Builder prodField000(Boolean val) { instance.prodField000 = val; return this; }
        public Builder prodField001(BigDecimal val) { instance.prodField001 = val; return this; }
        public Builder prodField002(String val) { instance.prodField002 = val; return this; }
        public Builder prodField003(BigDecimal val) { instance.prodField003 = val; return this; }
        public Builder prodField004(Boolean val) { instance.prodField004 = val; return this; }
        public Builder prodField005(LocalDate val) { instance.prodField005 = val; return this; }
        public Builder prodField006(String val) { instance.prodField006 = val; return this; }
        public Builder prodField007(String val) { instance.prodField007 = val; return this; }
        public Builder prodField008(Boolean val) { instance.prodField008 = val; return this; }
        public Builder prodField009(Boolean val) { instance.prodField009 = val; return this; }
        public Builder prodField010(BigDecimal val) { instance.prodField010 = val; return this; }
        public Builder prodField011(Double val) { instance.prodField011 = val; return this; }
        public Builder prodField012(Boolean val) { instance.prodField012 = val; return this; }
        public Builder prodField013(Integer val) { instance.prodField013 = val; return this; }
        public Builder prodField014(Long val) { instance.prodField014 = val; return this; }
        public Builder prodField015(String val) { instance.prodField015 = val; return this; }
        public Builder prodField016(String val) { instance.prodField016 = val; return this; }
        public Builder prodField017(Double val) { instance.prodField017 = val; return this; }
        public ProductDto058 build() { return instance; }
    }

    public Boolean getProdField000() { return prodField000; }
    public void setProdField000(Boolean prodField000) { this.prodField000 = prodField000; }

    public BigDecimal getProdField001() { return prodField001; }
    public void setProdField001(BigDecimal prodField001) { this.prodField001 = prodField001; }

    public String getProdField002() { return prodField002; }
    public void setProdField002(String prodField002) { this.prodField002 = prodField002; }

    public BigDecimal getProdField003() { return prodField003; }
    public void setProdField003(BigDecimal prodField003) { this.prodField003 = prodField003; }

    public Boolean getProdField004() { return prodField004; }
    public void setProdField004(Boolean prodField004) { this.prodField004 = prodField004; }

    public LocalDate getProdField005() { return prodField005; }
    public void setProdField005(LocalDate prodField005) { this.prodField005 = prodField005; }

    public String getProdField006() { return prodField006; }
    public void setProdField006(String prodField006) { this.prodField006 = prodField006; }

    public String getProdField007() { return prodField007; }
    public void setProdField007(String prodField007) { this.prodField007 = prodField007; }

    public Boolean getProdField008() { return prodField008; }
    public void setProdField008(Boolean prodField008) { this.prodField008 = prodField008; }

    public Boolean getProdField009() { return prodField009; }
    public void setProdField009(Boolean prodField009) { this.prodField009 = prodField009; }

    public BigDecimal getProdField010() { return prodField010; }
    public void setProdField010(BigDecimal prodField010) { this.prodField010 = prodField010; }

    public Double getProdField011() { return prodField011; }
    public void setProdField011(Double prodField011) { this.prodField011 = prodField011; }

    public Boolean getProdField012() { return prodField012; }
    public void setProdField012(Boolean prodField012) { this.prodField012 = prodField012; }

    public Integer getProdField013() { return prodField013; }
    public void setProdField013(Integer prodField013) { this.prodField013 = prodField013; }

    public Long getProdField014() { return prodField014; }
    public void setProdField014(Long prodField014) { this.prodField014 = prodField014; }

    public String getProdField015() { return prodField015; }
    public void setProdField015(String prodField015) { this.prodField015 = prodField015; }

    public String getProdField016() { return prodField016; }
    public void setProdField016(String prodField016) { this.prodField016 = prodField016; }

    public Double getProdField017() { return prodField017; }
    public void setProdField017(Double prodField017) { this.prodField017 = prodField017; }

    @Override
    public String toString() {
        return "ProductDto058{" +
            "prodField000=" + prodField000 + ", " +
            "prodField001=" + prodField001 + ", " +
            "prodField002=" + prodField002 + ", " +
            "prodField003=" + prodField003 + ", " +
            "prodField004=" + prodField004 + ", " +
            "}";
    }
}
