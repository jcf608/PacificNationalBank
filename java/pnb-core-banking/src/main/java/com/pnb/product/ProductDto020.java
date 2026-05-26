package com.pnb.product;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * ProductDto020 — Data Transfer Object for product operations.
 * Variant 20 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductDto020 {

    @DecimalMin(value = "0.00")
    @JsonProperty("prodField000")
    private BigDecimal prodField000;

    @JsonProperty("prodField001")
    private Double prodField001;

    @Size(max = 40)
    @JsonProperty("prodField002")
    private String prodField002;

    @JsonProperty("prodField003")
    private Double prodField003;

    @JsonProperty("prodField004")
    private Double prodField004;

    @JsonProperty("prodField005")
    private LocalDate prodField005;

    @Size(max = 40)
    @JsonProperty("prodField006")
    private String prodField006;

    @JsonProperty("prodField007")
    private LocalDate prodField007;

    @Size(max = 60)
    @JsonProperty("prodField008")
    private String prodField008;

    @JsonProperty("prodField009")
    private Long prodField009;

    @JsonProperty("prodField010")
    private Integer prodField010;

    @Size(max = 40)
    @JsonProperty("prodField011")
    private String prodField011;

    @Size(max = 60)
    @JsonProperty("prodField012")
    private String prodField012;

    @JsonProperty("prodField013")
    private Double prodField013;

    @JsonProperty("prodField014")
    private Long prodField014;

    @JsonProperty("prodField015")
    private LocalDate prodField015;

    public ProductDto020() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final ProductDto020 instance = new ProductDto020();

        public Builder prodField000(BigDecimal val) { instance.prodField000 = val; return this; }
        public Builder prodField001(Double val) { instance.prodField001 = val; return this; }
        public Builder prodField002(String val) { instance.prodField002 = val; return this; }
        public Builder prodField003(Double val) { instance.prodField003 = val; return this; }
        public Builder prodField004(Double val) { instance.prodField004 = val; return this; }
        public Builder prodField005(LocalDate val) { instance.prodField005 = val; return this; }
        public Builder prodField006(String val) { instance.prodField006 = val; return this; }
        public Builder prodField007(LocalDate val) { instance.prodField007 = val; return this; }
        public Builder prodField008(String val) { instance.prodField008 = val; return this; }
        public Builder prodField009(Long val) { instance.prodField009 = val; return this; }
        public Builder prodField010(Integer val) { instance.prodField010 = val; return this; }
        public Builder prodField011(String val) { instance.prodField011 = val; return this; }
        public Builder prodField012(String val) { instance.prodField012 = val; return this; }
        public Builder prodField013(Double val) { instance.prodField013 = val; return this; }
        public Builder prodField014(Long val) { instance.prodField014 = val; return this; }
        public Builder prodField015(LocalDate val) { instance.prodField015 = val; return this; }
        public ProductDto020 build() { return instance; }
    }

    public BigDecimal getProdField000() { return prodField000; }
    public void setProdField000(BigDecimal prodField000) { this.prodField000 = prodField000; }

    public Double getProdField001() { return prodField001; }
    public void setProdField001(Double prodField001) { this.prodField001 = prodField001; }

    public String getProdField002() { return prodField002; }
    public void setProdField002(String prodField002) { this.prodField002 = prodField002; }

    public Double getProdField003() { return prodField003; }
    public void setProdField003(Double prodField003) { this.prodField003 = prodField003; }

    public Double getProdField004() { return prodField004; }
    public void setProdField004(Double prodField004) { this.prodField004 = prodField004; }

    public LocalDate getProdField005() { return prodField005; }
    public void setProdField005(LocalDate prodField005) { this.prodField005 = prodField005; }

    public String getProdField006() { return prodField006; }
    public void setProdField006(String prodField006) { this.prodField006 = prodField006; }

    public LocalDate getProdField007() { return prodField007; }
    public void setProdField007(LocalDate prodField007) { this.prodField007 = prodField007; }

    public String getProdField008() { return prodField008; }
    public void setProdField008(String prodField008) { this.prodField008 = prodField008; }

    public Long getProdField009() { return prodField009; }
    public void setProdField009(Long prodField009) { this.prodField009 = prodField009; }

    public Integer getProdField010() { return prodField010; }
    public void setProdField010(Integer prodField010) { this.prodField010 = prodField010; }

    public String getProdField011() { return prodField011; }
    public void setProdField011(String prodField011) { this.prodField011 = prodField011; }

    public String getProdField012() { return prodField012; }
    public void setProdField012(String prodField012) { this.prodField012 = prodField012; }

    public Double getProdField013() { return prodField013; }
    public void setProdField013(Double prodField013) { this.prodField013 = prodField013; }

    public Long getProdField014() { return prodField014; }
    public void setProdField014(Long prodField014) { this.prodField014 = prodField014; }

    public LocalDate getProdField015() { return prodField015; }
    public void setProdField015(LocalDate prodField015) { this.prodField015 = prodField015; }

    @Override
    public String toString() {
        return "ProductDto020{" +
            "prodField000=" + prodField000 + ", " +
            "prodField001=" + prodField001 + ", " +
            "prodField002=" + prodField002 + ", " +
            "prodField003=" + prodField003 + ", " +
            "prodField004=" + prodField004 + ", " +
            "}";
    }
}
