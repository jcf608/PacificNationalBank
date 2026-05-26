package com.pnb.product;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * ProductDto044 — Data Transfer Object for product operations.
 * Variant 44 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductDto044 {

    @JsonProperty("prodField000")
    private Integer prodField000;

    @DecimalMin(value = "0.00")
    @JsonProperty("prodField001")
    private BigDecimal prodField001;

    @JsonProperty("prodField002")
    private Boolean prodField002;

    @JsonProperty("prodField003")
    private Integer prodField003;

    @JsonProperty("prodField004")
    private LocalDate prodField004;

    @JsonProperty("prodField005")
    private Double prodField005;

    @JsonProperty("prodField006")
    private Boolean prodField006;

    @JsonProperty("prodField007")
    private Boolean prodField007;

    @JsonProperty("prodField008")
    private Long prodField008;

    @JsonProperty("prodField009")
    private LocalDate prodField009;

    @JsonProperty("prodField010")
    private Double prodField010;

    @JsonProperty("prodField011")
    private Double prodField011;

    @JsonProperty("prodField012")
    private Double prodField012;

    @Size(max = 100)
    @JsonProperty("prodField013")
    private String prodField013;

    @DecimalMin(value = "0.00")
    @JsonProperty("prodField014")
    private BigDecimal prodField014;

    @JsonProperty("prodField015")
    private Long prodField015;

    public ProductDto044() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final ProductDto044 instance = new ProductDto044();

        public Builder prodField000(Integer val) { instance.prodField000 = val; return this; }
        public Builder prodField001(BigDecimal val) { instance.prodField001 = val; return this; }
        public Builder prodField002(Boolean val) { instance.prodField002 = val; return this; }
        public Builder prodField003(Integer val) { instance.prodField003 = val; return this; }
        public Builder prodField004(LocalDate val) { instance.prodField004 = val; return this; }
        public Builder prodField005(Double val) { instance.prodField005 = val; return this; }
        public Builder prodField006(Boolean val) { instance.prodField006 = val; return this; }
        public Builder prodField007(Boolean val) { instance.prodField007 = val; return this; }
        public Builder prodField008(Long val) { instance.prodField008 = val; return this; }
        public Builder prodField009(LocalDate val) { instance.prodField009 = val; return this; }
        public Builder prodField010(Double val) { instance.prodField010 = val; return this; }
        public Builder prodField011(Double val) { instance.prodField011 = val; return this; }
        public Builder prodField012(Double val) { instance.prodField012 = val; return this; }
        public Builder prodField013(String val) { instance.prodField013 = val; return this; }
        public Builder prodField014(BigDecimal val) { instance.prodField014 = val; return this; }
        public Builder prodField015(Long val) { instance.prodField015 = val; return this; }
        public ProductDto044 build() { return instance; }
    }

    public Integer getProdField000() { return prodField000; }
    public void setProdField000(Integer prodField000) { this.prodField000 = prodField000; }

    public BigDecimal getProdField001() { return prodField001; }
    public void setProdField001(BigDecimal prodField001) { this.prodField001 = prodField001; }

    public Boolean getProdField002() { return prodField002; }
    public void setProdField002(Boolean prodField002) { this.prodField002 = prodField002; }

    public Integer getProdField003() { return prodField003; }
    public void setProdField003(Integer prodField003) { this.prodField003 = prodField003; }

    public LocalDate getProdField004() { return prodField004; }
    public void setProdField004(LocalDate prodField004) { this.prodField004 = prodField004; }

    public Double getProdField005() { return prodField005; }
    public void setProdField005(Double prodField005) { this.prodField005 = prodField005; }

    public Boolean getProdField006() { return prodField006; }
    public void setProdField006(Boolean prodField006) { this.prodField006 = prodField006; }

    public Boolean getProdField007() { return prodField007; }
    public void setProdField007(Boolean prodField007) { this.prodField007 = prodField007; }

    public Long getProdField008() { return prodField008; }
    public void setProdField008(Long prodField008) { this.prodField008 = prodField008; }

    public LocalDate getProdField009() { return prodField009; }
    public void setProdField009(LocalDate prodField009) { this.prodField009 = prodField009; }

    public Double getProdField010() { return prodField010; }
    public void setProdField010(Double prodField010) { this.prodField010 = prodField010; }

    public Double getProdField011() { return prodField011; }
    public void setProdField011(Double prodField011) { this.prodField011 = prodField011; }

    public Double getProdField012() { return prodField012; }
    public void setProdField012(Double prodField012) { this.prodField012 = prodField012; }

    public String getProdField013() { return prodField013; }
    public void setProdField013(String prodField013) { this.prodField013 = prodField013; }

    public BigDecimal getProdField014() { return prodField014; }
    public void setProdField014(BigDecimal prodField014) { this.prodField014 = prodField014; }

    public Long getProdField015() { return prodField015; }
    public void setProdField015(Long prodField015) { this.prodField015 = prodField015; }

    @Override
    public String toString() {
        return "ProductDto044{" +
            "prodField000=" + prodField000 + ", " +
            "prodField001=" + prodField001 + ", " +
            "prodField002=" + prodField002 + ", " +
            "prodField003=" + prodField003 + ", " +
            "prodField004=" + prodField004 + ", " +
            "}";
    }
}
