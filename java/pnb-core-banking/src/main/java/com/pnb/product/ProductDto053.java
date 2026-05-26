package com.pnb.product;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * ProductDto053 — Data Transfer Object for product operations.
 * Variant 53 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductDto053 {

    @JsonProperty("prodField000")
    private Long prodField000;

    @JsonProperty("prodField001")
    private Double prodField001;

    @JsonProperty("prodField002")
    private LocalDate prodField002;

    @JsonProperty("prodField003")
    private Long prodField003;

    @JsonProperty("prodField004")
    private Boolean prodField004;

    @Size(max = 60)
    @JsonProperty("prodField005")
    private String prodField005;

    @JsonProperty("prodField006")
    private Boolean prodField006;

    @JsonProperty("prodField007")
    private Double prodField007;

    @JsonProperty("prodField008")
    private Boolean prodField008;

    @DecimalMin(value = "0.00")
    @JsonProperty("prodField009")
    private BigDecimal prodField009;

    @JsonProperty("prodField010")
    private Integer prodField010;

    @Size(max = 60)
    @JsonProperty("prodField011")
    private String prodField011;

    @Size(max = 40)
    @JsonProperty("prodField012")
    private String prodField012;

    public ProductDto053() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final ProductDto053 instance = new ProductDto053();

        public Builder prodField000(Long val) { instance.prodField000 = val; return this; }
        public Builder prodField001(Double val) { instance.prodField001 = val; return this; }
        public Builder prodField002(LocalDate val) { instance.prodField002 = val; return this; }
        public Builder prodField003(Long val) { instance.prodField003 = val; return this; }
        public Builder prodField004(Boolean val) { instance.prodField004 = val; return this; }
        public Builder prodField005(String val) { instance.prodField005 = val; return this; }
        public Builder prodField006(Boolean val) { instance.prodField006 = val; return this; }
        public Builder prodField007(Double val) { instance.prodField007 = val; return this; }
        public Builder prodField008(Boolean val) { instance.prodField008 = val; return this; }
        public Builder prodField009(BigDecimal val) { instance.prodField009 = val; return this; }
        public Builder prodField010(Integer val) { instance.prodField010 = val; return this; }
        public Builder prodField011(String val) { instance.prodField011 = val; return this; }
        public Builder prodField012(String val) { instance.prodField012 = val; return this; }
        public ProductDto053 build() { return instance; }
    }

    public Long getProdField000() { return prodField000; }
    public void setProdField000(Long prodField000) { this.prodField000 = prodField000; }

    public Double getProdField001() { return prodField001; }
    public void setProdField001(Double prodField001) { this.prodField001 = prodField001; }

    public LocalDate getProdField002() { return prodField002; }
    public void setProdField002(LocalDate prodField002) { this.prodField002 = prodField002; }

    public Long getProdField003() { return prodField003; }
    public void setProdField003(Long prodField003) { this.prodField003 = prodField003; }

    public Boolean getProdField004() { return prodField004; }
    public void setProdField004(Boolean prodField004) { this.prodField004 = prodField004; }

    public String getProdField005() { return prodField005; }
    public void setProdField005(String prodField005) { this.prodField005 = prodField005; }

    public Boolean getProdField006() { return prodField006; }
    public void setProdField006(Boolean prodField006) { this.prodField006 = prodField006; }

    public Double getProdField007() { return prodField007; }
    public void setProdField007(Double prodField007) { this.prodField007 = prodField007; }

    public Boolean getProdField008() { return prodField008; }
    public void setProdField008(Boolean prodField008) { this.prodField008 = prodField008; }

    public BigDecimal getProdField009() { return prodField009; }
    public void setProdField009(BigDecimal prodField009) { this.prodField009 = prodField009; }

    public Integer getProdField010() { return prodField010; }
    public void setProdField010(Integer prodField010) { this.prodField010 = prodField010; }

    public String getProdField011() { return prodField011; }
    public void setProdField011(String prodField011) { this.prodField011 = prodField011; }

    public String getProdField012() { return prodField012; }
    public void setProdField012(String prodField012) { this.prodField012 = prodField012; }

    @Override
    public String toString() {
        return "ProductDto053{" +
            "prodField000=" + prodField000 + ", " +
            "prodField001=" + prodField001 + ", " +
            "prodField002=" + prodField002 + ", " +
            "prodField003=" + prodField003 + ", " +
            "prodField004=" + prodField004 + ", " +
            "}";
    }
}
