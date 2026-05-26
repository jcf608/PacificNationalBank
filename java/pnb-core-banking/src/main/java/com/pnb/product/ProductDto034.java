package com.pnb.product;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * ProductDto034 — Data Transfer Object for product operations.
 * Variant 34 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductDto034 {

    @JsonProperty("prodField000")
    private Long prodField000;

    @JsonProperty("prodField001")
    private LocalDate prodField001;

    @JsonProperty("prodField002")
    private Long prodField002;

    @JsonProperty("prodField003")
    private Double prodField003;

    @JsonProperty("prodField004")
    private Boolean prodField004;

    @JsonProperty("prodField005")
    private LocalDate prodField005;

    @JsonProperty("prodField006")
    private LocalDate prodField006;

    @JsonProperty("prodField007")
    private Long prodField007;

    @JsonProperty("prodField008")
    private Long prodField008;

    @JsonProperty("prodField009")
    private LocalDate prodField009;

    @JsonProperty("prodField010")
    private Long prodField010;

    @JsonProperty("prodField011")
    private Long prodField011;

    @JsonProperty("prodField012")
    private LocalDate prodField012;

    @JsonProperty("prodField013")
    private LocalDate prodField013;

    @DecimalMin(value = "0.00")
    @JsonProperty("prodField014")
    private BigDecimal prodField014;

    @JsonProperty("prodField015")
    private LocalDate prodField015;

    @JsonProperty("prodField016")
    private Boolean prodField016;

    @DecimalMin(value = "0.00")
    @JsonProperty("prodField017")
    private BigDecimal prodField017;

    public ProductDto034() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final ProductDto034 instance = new ProductDto034();

        public Builder prodField000(Long val) { instance.prodField000 = val; return this; }
        public Builder prodField001(LocalDate val) { instance.prodField001 = val; return this; }
        public Builder prodField002(Long val) { instance.prodField002 = val; return this; }
        public Builder prodField003(Double val) { instance.prodField003 = val; return this; }
        public Builder prodField004(Boolean val) { instance.prodField004 = val; return this; }
        public Builder prodField005(LocalDate val) { instance.prodField005 = val; return this; }
        public Builder prodField006(LocalDate val) { instance.prodField006 = val; return this; }
        public Builder prodField007(Long val) { instance.prodField007 = val; return this; }
        public Builder prodField008(Long val) { instance.prodField008 = val; return this; }
        public Builder prodField009(LocalDate val) { instance.prodField009 = val; return this; }
        public Builder prodField010(Long val) { instance.prodField010 = val; return this; }
        public Builder prodField011(Long val) { instance.prodField011 = val; return this; }
        public Builder prodField012(LocalDate val) { instance.prodField012 = val; return this; }
        public Builder prodField013(LocalDate val) { instance.prodField013 = val; return this; }
        public Builder prodField014(BigDecimal val) { instance.prodField014 = val; return this; }
        public Builder prodField015(LocalDate val) { instance.prodField015 = val; return this; }
        public Builder prodField016(Boolean val) { instance.prodField016 = val; return this; }
        public Builder prodField017(BigDecimal val) { instance.prodField017 = val; return this; }
        public ProductDto034 build() { return instance; }
    }

    public Long getProdField000() { return prodField000; }
    public void setProdField000(Long prodField000) { this.prodField000 = prodField000; }

    public LocalDate getProdField001() { return prodField001; }
    public void setProdField001(LocalDate prodField001) { this.prodField001 = prodField001; }

    public Long getProdField002() { return prodField002; }
    public void setProdField002(Long prodField002) { this.prodField002 = prodField002; }

    public Double getProdField003() { return prodField003; }
    public void setProdField003(Double prodField003) { this.prodField003 = prodField003; }

    public Boolean getProdField004() { return prodField004; }
    public void setProdField004(Boolean prodField004) { this.prodField004 = prodField004; }

    public LocalDate getProdField005() { return prodField005; }
    public void setProdField005(LocalDate prodField005) { this.prodField005 = prodField005; }

    public LocalDate getProdField006() { return prodField006; }
    public void setProdField006(LocalDate prodField006) { this.prodField006 = prodField006; }

    public Long getProdField007() { return prodField007; }
    public void setProdField007(Long prodField007) { this.prodField007 = prodField007; }

    public Long getProdField008() { return prodField008; }
    public void setProdField008(Long prodField008) { this.prodField008 = prodField008; }

    public LocalDate getProdField009() { return prodField009; }
    public void setProdField009(LocalDate prodField009) { this.prodField009 = prodField009; }

    public Long getProdField010() { return prodField010; }
    public void setProdField010(Long prodField010) { this.prodField010 = prodField010; }

    public Long getProdField011() { return prodField011; }
    public void setProdField011(Long prodField011) { this.prodField011 = prodField011; }

    public LocalDate getProdField012() { return prodField012; }
    public void setProdField012(LocalDate prodField012) { this.prodField012 = prodField012; }

    public LocalDate getProdField013() { return prodField013; }
    public void setProdField013(LocalDate prodField013) { this.prodField013 = prodField013; }

    public BigDecimal getProdField014() { return prodField014; }
    public void setProdField014(BigDecimal prodField014) { this.prodField014 = prodField014; }

    public LocalDate getProdField015() { return prodField015; }
    public void setProdField015(LocalDate prodField015) { this.prodField015 = prodField015; }

    public Boolean getProdField016() { return prodField016; }
    public void setProdField016(Boolean prodField016) { this.prodField016 = prodField016; }

    public BigDecimal getProdField017() { return prodField017; }
    public void setProdField017(BigDecimal prodField017) { this.prodField017 = prodField017; }

    @Override
    public String toString() {
        return "ProductDto034{" +
            "prodField000=" + prodField000 + ", " +
            "prodField001=" + prodField001 + ", " +
            "prodField002=" + prodField002 + ", " +
            "prodField003=" + prodField003 + ", " +
            "prodField004=" + prodField004 + ", " +
            "}";
    }
}
