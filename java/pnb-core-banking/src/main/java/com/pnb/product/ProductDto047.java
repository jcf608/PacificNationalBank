package com.pnb.product;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * ProductDto047 — Data Transfer Object for product operations.
 * Variant 47 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductDto047 {

    @Size(max = 200)
    @JsonProperty("prodField000")
    private String prodField000;

    @JsonProperty("prodField001")
    private Integer prodField001;

    @JsonProperty("prodField002")
    private Boolean prodField002;

    @JsonProperty("prodField003")
    private Boolean prodField003;

    @JsonProperty("prodField004")
    private Long prodField004;

    @Size(max = 20)
    @JsonProperty("prodField005")
    private String prodField005;

    @Size(max = 40)
    @JsonProperty("prodField006")
    private String prodField006;

    @JsonProperty("prodField007")
    private Double prodField007;

    @JsonProperty("prodField008")
    private Double prodField008;

    @JsonProperty("prodField009")
    private LocalDate prodField009;

    @JsonProperty("prodField010")
    private Double prodField010;

    @JsonProperty("prodField011")
    private Long prodField011;

    @JsonProperty("prodField012")
    private Boolean prodField012;

    @Size(max = 200)
    @JsonProperty("prodField013")
    private String prodField013;

    @JsonProperty("prodField014")
    private Long prodField014;

    @JsonProperty("prodField015")
    private Long prodField015;

    @JsonProperty("prodField016")
    private Integer prodField016;

    @JsonProperty("prodField017")
    private Integer prodField017;

    @DecimalMin(value = "0.00")
    @JsonProperty("prodField018")
    private BigDecimal prodField018;

    public ProductDto047() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final ProductDto047 instance = new ProductDto047();

        public Builder prodField000(String val) { instance.prodField000 = val; return this; }
        public Builder prodField001(Integer val) { instance.prodField001 = val; return this; }
        public Builder prodField002(Boolean val) { instance.prodField002 = val; return this; }
        public Builder prodField003(Boolean val) { instance.prodField003 = val; return this; }
        public Builder prodField004(Long val) { instance.prodField004 = val; return this; }
        public Builder prodField005(String val) { instance.prodField005 = val; return this; }
        public Builder prodField006(String val) { instance.prodField006 = val; return this; }
        public Builder prodField007(Double val) { instance.prodField007 = val; return this; }
        public Builder prodField008(Double val) { instance.prodField008 = val; return this; }
        public Builder prodField009(LocalDate val) { instance.prodField009 = val; return this; }
        public Builder prodField010(Double val) { instance.prodField010 = val; return this; }
        public Builder prodField011(Long val) { instance.prodField011 = val; return this; }
        public Builder prodField012(Boolean val) { instance.prodField012 = val; return this; }
        public Builder prodField013(String val) { instance.prodField013 = val; return this; }
        public Builder prodField014(Long val) { instance.prodField014 = val; return this; }
        public Builder prodField015(Long val) { instance.prodField015 = val; return this; }
        public Builder prodField016(Integer val) { instance.prodField016 = val; return this; }
        public Builder prodField017(Integer val) { instance.prodField017 = val; return this; }
        public Builder prodField018(BigDecimal val) { instance.prodField018 = val; return this; }
        public ProductDto047 build() { return instance; }
    }

    public String getProdField000() { return prodField000; }
    public void setProdField000(String prodField000) { this.prodField000 = prodField000; }

    public Integer getProdField001() { return prodField001; }
    public void setProdField001(Integer prodField001) { this.prodField001 = prodField001; }

    public Boolean getProdField002() { return prodField002; }
    public void setProdField002(Boolean prodField002) { this.prodField002 = prodField002; }

    public Boolean getProdField003() { return prodField003; }
    public void setProdField003(Boolean prodField003) { this.prodField003 = prodField003; }

    public Long getProdField004() { return prodField004; }
    public void setProdField004(Long prodField004) { this.prodField004 = prodField004; }

    public String getProdField005() { return prodField005; }
    public void setProdField005(String prodField005) { this.prodField005 = prodField005; }

    public String getProdField006() { return prodField006; }
    public void setProdField006(String prodField006) { this.prodField006 = prodField006; }

    public Double getProdField007() { return prodField007; }
    public void setProdField007(Double prodField007) { this.prodField007 = prodField007; }

    public Double getProdField008() { return prodField008; }
    public void setProdField008(Double prodField008) { this.prodField008 = prodField008; }

    public LocalDate getProdField009() { return prodField009; }
    public void setProdField009(LocalDate prodField009) { this.prodField009 = prodField009; }

    public Double getProdField010() { return prodField010; }
    public void setProdField010(Double prodField010) { this.prodField010 = prodField010; }

    public Long getProdField011() { return prodField011; }
    public void setProdField011(Long prodField011) { this.prodField011 = prodField011; }

    public Boolean getProdField012() { return prodField012; }
    public void setProdField012(Boolean prodField012) { this.prodField012 = prodField012; }

    public String getProdField013() { return prodField013; }
    public void setProdField013(String prodField013) { this.prodField013 = prodField013; }

    public Long getProdField014() { return prodField014; }
    public void setProdField014(Long prodField014) { this.prodField014 = prodField014; }

    public Long getProdField015() { return prodField015; }
    public void setProdField015(Long prodField015) { this.prodField015 = prodField015; }

    public Integer getProdField016() { return prodField016; }
    public void setProdField016(Integer prodField016) { this.prodField016 = prodField016; }

    public Integer getProdField017() { return prodField017; }
    public void setProdField017(Integer prodField017) { this.prodField017 = prodField017; }

    public BigDecimal getProdField018() { return prodField018; }
    public void setProdField018(BigDecimal prodField018) { this.prodField018 = prodField018; }

    @Override
    public String toString() {
        return "ProductDto047{" +
            "prodField000=" + prodField000 + ", " +
            "prodField001=" + prodField001 + ", " +
            "prodField002=" + prodField002 + ", " +
            "prodField003=" + prodField003 + ", " +
            "prodField004=" + prodField004 + ", " +
            "}";
    }
}
