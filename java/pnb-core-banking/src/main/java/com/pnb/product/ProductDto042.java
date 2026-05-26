package com.pnb.product;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * ProductDto042 — Data Transfer Object for product operations.
 * Variant 42 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductDto042 {

    @JsonProperty("prodField000")
    private Long prodField000;

    @JsonProperty("prodField001")
    private Double prodField001;

    @Size(max = 200)
    @JsonProperty("prodField002")
    private String prodField002;

    @Size(max = 100)
    @JsonProperty("prodField003")
    private String prodField003;

    @Size(max = 200)
    @JsonProperty("prodField004")
    private String prodField004;

    @JsonProperty("prodField005")
    private Boolean prodField005;

    @JsonProperty("prodField006")
    private Integer prodField006;

    @Size(max = 60)
    @JsonProperty("prodField007")
    private String prodField007;

    @Size(max = 60)
    @JsonProperty("prodField008")
    private String prodField008;

    @JsonProperty("prodField009")
    private Double prodField009;

    @JsonProperty("prodField010")
    private Long prodField010;

    @JsonProperty("prodField011")
    private Boolean prodField011;

    @JsonProperty("prodField012")
    private Long prodField012;

    @DecimalMin(value = "0.00")
    @JsonProperty("prodField013")
    private BigDecimal prodField013;

    public ProductDto042() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final ProductDto042 instance = new ProductDto042();

        public Builder prodField000(Long val) { instance.prodField000 = val; return this; }
        public Builder prodField001(Double val) { instance.prodField001 = val; return this; }
        public Builder prodField002(String val) { instance.prodField002 = val; return this; }
        public Builder prodField003(String val) { instance.prodField003 = val; return this; }
        public Builder prodField004(String val) { instance.prodField004 = val; return this; }
        public Builder prodField005(Boolean val) { instance.prodField005 = val; return this; }
        public Builder prodField006(Integer val) { instance.prodField006 = val; return this; }
        public Builder prodField007(String val) { instance.prodField007 = val; return this; }
        public Builder prodField008(String val) { instance.prodField008 = val; return this; }
        public Builder prodField009(Double val) { instance.prodField009 = val; return this; }
        public Builder prodField010(Long val) { instance.prodField010 = val; return this; }
        public Builder prodField011(Boolean val) { instance.prodField011 = val; return this; }
        public Builder prodField012(Long val) { instance.prodField012 = val; return this; }
        public Builder prodField013(BigDecimal val) { instance.prodField013 = val; return this; }
        public ProductDto042 build() { return instance; }
    }

    public Long getProdField000() { return prodField000; }
    public void setProdField000(Long prodField000) { this.prodField000 = prodField000; }

    public Double getProdField001() { return prodField001; }
    public void setProdField001(Double prodField001) { this.prodField001 = prodField001; }

    public String getProdField002() { return prodField002; }
    public void setProdField002(String prodField002) { this.prodField002 = prodField002; }

    public String getProdField003() { return prodField003; }
    public void setProdField003(String prodField003) { this.prodField003 = prodField003; }

    public String getProdField004() { return prodField004; }
    public void setProdField004(String prodField004) { this.prodField004 = prodField004; }

    public Boolean getProdField005() { return prodField005; }
    public void setProdField005(Boolean prodField005) { this.prodField005 = prodField005; }

    public Integer getProdField006() { return prodField006; }
    public void setProdField006(Integer prodField006) { this.prodField006 = prodField006; }

    public String getProdField007() { return prodField007; }
    public void setProdField007(String prodField007) { this.prodField007 = prodField007; }

    public String getProdField008() { return prodField008; }
    public void setProdField008(String prodField008) { this.prodField008 = prodField008; }

    public Double getProdField009() { return prodField009; }
    public void setProdField009(Double prodField009) { this.prodField009 = prodField009; }

    public Long getProdField010() { return prodField010; }
    public void setProdField010(Long prodField010) { this.prodField010 = prodField010; }

    public Boolean getProdField011() { return prodField011; }
    public void setProdField011(Boolean prodField011) { this.prodField011 = prodField011; }

    public Long getProdField012() { return prodField012; }
    public void setProdField012(Long prodField012) { this.prodField012 = prodField012; }

    public BigDecimal getProdField013() { return prodField013; }
    public void setProdField013(BigDecimal prodField013) { this.prodField013 = prodField013; }

    @Override
    public String toString() {
        return "ProductDto042{" +
            "prodField000=" + prodField000 + ", " +
            "prodField001=" + prodField001 + ", " +
            "prodField002=" + prodField002 + ", " +
            "prodField003=" + prodField003 + ", " +
            "prodField004=" + prodField004 + ", " +
            "}";
    }
}
