package com.pnb.product;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * ProductDto022 — Data Transfer Object for product operations.
 * Variant 22 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductDto022 {

    @JsonProperty("prodField000")
    private Integer prodField000;

    @JsonProperty("prodField001")
    private Boolean prodField001;

    @JsonProperty("prodField002")
    private Integer prodField002;

    @JsonProperty("prodField003")
    private LocalDate prodField003;

    @JsonProperty("prodField004")
    private Double prodField004;

    @JsonProperty("prodField005")
    private Boolean prodField005;

    @Size(max = 40)
    @JsonProperty("prodField006")
    private String prodField006;

    @JsonProperty("prodField007")
    private Double prodField007;

    @DecimalMin(value = "0.00")
    @JsonProperty("prodField008")
    private BigDecimal prodField008;

    @JsonProperty("prodField009")
    private Long prodField009;

    @DecimalMin(value = "0.00")
    @JsonProperty("prodField010")
    private BigDecimal prodField010;

    @JsonProperty("prodField011")
    private Double prodField011;

    @JsonProperty("prodField012")
    private Integer prodField012;

    @JsonProperty("prodField013")
    private LocalDate prodField013;

    @JsonProperty("prodField014")
    private LocalDate prodField014;

    @JsonProperty("prodField015")
    private Integer prodField015;

    @JsonProperty("prodField016")
    private LocalDate prodField016;

    @JsonProperty("prodField017")
    private Long prodField017;

    public ProductDto022() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final ProductDto022 instance = new ProductDto022();

        public Builder prodField000(Integer val) { instance.prodField000 = val; return this; }
        public Builder prodField001(Boolean val) { instance.prodField001 = val; return this; }
        public Builder prodField002(Integer val) { instance.prodField002 = val; return this; }
        public Builder prodField003(LocalDate val) { instance.prodField003 = val; return this; }
        public Builder prodField004(Double val) { instance.prodField004 = val; return this; }
        public Builder prodField005(Boolean val) { instance.prodField005 = val; return this; }
        public Builder prodField006(String val) { instance.prodField006 = val; return this; }
        public Builder prodField007(Double val) { instance.prodField007 = val; return this; }
        public Builder prodField008(BigDecimal val) { instance.prodField008 = val; return this; }
        public Builder prodField009(Long val) { instance.prodField009 = val; return this; }
        public Builder prodField010(BigDecimal val) { instance.prodField010 = val; return this; }
        public Builder prodField011(Double val) { instance.prodField011 = val; return this; }
        public Builder prodField012(Integer val) { instance.prodField012 = val; return this; }
        public Builder prodField013(LocalDate val) { instance.prodField013 = val; return this; }
        public Builder prodField014(LocalDate val) { instance.prodField014 = val; return this; }
        public Builder prodField015(Integer val) { instance.prodField015 = val; return this; }
        public Builder prodField016(LocalDate val) { instance.prodField016 = val; return this; }
        public Builder prodField017(Long val) { instance.prodField017 = val; return this; }
        public ProductDto022 build() { return instance; }
    }

    public Integer getProdField000() { return prodField000; }
    public void setProdField000(Integer prodField000) { this.prodField000 = prodField000; }

    public Boolean getProdField001() { return prodField001; }
    public void setProdField001(Boolean prodField001) { this.prodField001 = prodField001; }

    public Integer getProdField002() { return prodField002; }
    public void setProdField002(Integer prodField002) { this.prodField002 = prodField002; }

    public LocalDate getProdField003() { return prodField003; }
    public void setProdField003(LocalDate prodField003) { this.prodField003 = prodField003; }

    public Double getProdField004() { return prodField004; }
    public void setProdField004(Double prodField004) { this.prodField004 = prodField004; }

    public Boolean getProdField005() { return prodField005; }
    public void setProdField005(Boolean prodField005) { this.prodField005 = prodField005; }

    public String getProdField006() { return prodField006; }
    public void setProdField006(String prodField006) { this.prodField006 = prodField006; }

    public Double getProdField007() { return prodField007; }
    public void setProdField007(Double prodField007) { this.prodField007 = prodField007; }

    public BigDecimal getProdField008() { return prodField008; }
    public void setProdField008(BigDecimal prodField008) { this.prodField008 = prodField008; }

    public Long getProdField009() { return prodField009; }
    public void setProdField009(Long prodField009) { this.prodField009 = prodField009; }

    public BigDecimal getProdField010() { return prodField010; }
    public void setProdField010(BigDecimal prodField010) { this.prodField010 = prodField010; }

    public Double getProdField011() { return prodField011; }
    public void setProdField011(Double prodField011) { this.prodField011 = prodField011; }

    public Integer getProdField012() { return prodField012; }
    public void setProdField012(Integer prodField012) { this.prodField012 = prodField012; }

    public LocalDate getProdField013() { return prodField013; }
    public void setProdField013(LocalDate prodField013) { this.prodField013 = prodField013; }

    public LocalDate getProdField014() { return prodField014; }
    public void setProdField014(LocalDate prodField014) { this.prodField014 = prodField014; }

    public Integer getProdField015() { return prodField015; }
    public void setProdField015(Integer prodField015) { this.prodField015 = prodField015; }

    public LocalDate getProdField016() { return prodField016; }
    public void setProdField016(LocalDate prodField016) { this.prodField016 = prodField016; }

    public Long getProdField017() { return prodField017; }
    public void setProdField017(Long prodField017) { this.prodField017 = prodField017; }

    @Override
    public String toString() {
        return "ProductDto022{" +
            "prodField000=" + prodField000 + ", " +
            "prodField001=" + prodField001 + ", " +
            "prodField002=" + prodField002 + ", " +
            "prodField003=" + prodField003 + ", " +
            "prodField004=" + prodField004 + ", " +
            "}";
    }
}
