package com.pnb.product;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * ProductDto055 — Data Transfer Object for product operations.
 * Variant 55 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductDto055 {

    @JsonProperty("prodField000")
    private Long prodField000;

    @JsonProperty("prodField001")
    private Boolean prodField001;

    @JsonProperty("prodField002")
    private Boolean prodField002;

    @JsonProperty("prodField003")
    private Long prodField003;

    @Size(max = 40)
    @JsonProperty("prodField004")
    private String prodField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("prodField005")
    private BigDecimal prodField005;

    @JsonProperty("prodField006")
    private LocalDate prodField006;

    @Size(max = 20)
    @JsonProperty("prodField007")
    private String prodField007;

    @Size(max = 100)
    @JsonProperty("prodField008")
    private String prodField008;

    @JsonProperty("prodField009")
    private Boolean prodField009;

    @Size(max = 40)
    @JsonProperty("prodField010")
    private String prodField010;

    @Size(max = 100)
    @JsonProperty("prodField011")
    private String prodField011;

    @JsonProperty("prodField012")
    private Boolean prodField012;

    @Size(max = 40)
    @JsonProperty("prodField013")
    private String prodField013;

    @JsonProperty("prodField014")
    private Boolean prodField014;

    public ProductDto055() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final ProductDto055 instance = new ProductDto055();

        public Builder prodField000(Long val) { instance.prodField000 = val; return this; }
        public Builder prodField001(Boolean val) { instance.prodField001 = val; return this; }
        public Builder prodField002(Boolean val) { instance.prodField002 = val; return this; }
        public Builder prodField003(Long val) { instance.prodField003 = val; return this; }
        public Builder prodField004(String val) { instance.prodField004 = val; return this; }
        public Builder prodField005(BigDecimal val) { instance.prodField005 = val; return this; }
        public Builder prodField006(LocalDate val) { instance.prodField006 = val; return this; }
        public Builder prodField007(String val) { instance.prodField007 = val; return this; }
        public Builder prodField008(String val) { instance.prodField008 = val; return this; }
        public Builder prodField009(Boolean val) { instance.prodField009 = val; return this; }
        public Builder prodField010(String val) { instance.prodField010 = val; return this; }
        public Builder prodField011(String val) { instance.prodField011 = val; return this; }
        public Builder prodField012(Boolean val) { instance.prodField012 = val; return this; }
        public Builder prodField013(String val) { instance.prodField013 = val; return this; }
        public Builder prodField014(Boolean val) { instance.prodField014 = val; return this; }
        public ProductDto055 build() { return instance; }
    }

    public Long getProdField000() { return prodField000; }
    public void setProdField000(Long prodField000) { this.prodField000 = prodField000; }

    public Boolean getProdField001() { return prodField001; }
    public void setProdField001(Boolean prodField001) { this.prodField001 = prodField001; }

    public Boolean getProdField002() { return prodField002; }
    public void setProdField002(Boolean prodField002) { this.prodField002 = prodField002; }

    public Long getProdField003() { return prodField003; }
    public void setProdField003(Long prodField003) { this.prodField003 = prodField003; }

    public String getProdField004() { return prodField004; }
    public void setProdField004(String prodField004) { this.prodField004 = prodField004; }

    public BigDecimal getProdField005() { return prodField005; }
    public void setProdField005(BigDecimal prodField005) { this.prodField005 = prodField005; }

    public LocalDate getProdField006() { return prodField006; }
    public void setProdField006(LocalDate prodField006) { this.prodField006 = prodField006; }

    public String getProdField007() { return prodField007; }
    public void setProdField007(String prodField007) { this.prodField007 = prodField007; }

    public String getProdField008() { return prodField008; }
    public void setProdField008(String prodField008) { this.prodField008 = prodField008; }

    public Boolean getProdField009() { return prodField009; }
    public void setProdField009(Boolean prodField009) { this.prodField009 = prodField009; }

    public String getProdField010() { return prodField010; }
    public void setProdField010(String prodField010) { this.prodField010 = prodField010; }

    public String getProdField011() { return prodField011; }
    public void setProdField011(String prodField011) { this.prodField011 = prodField011; }

    public Boolean getProdField012() { return prodField012; }
    public void setProdField012(Boolean prodField012) { this.prodField012 = prodField012; }

    public String getProdField013() { return prodField013; }
    public void setProdField013(String prodField013) { this.prodField013 = prodField013; }

    public Boolean getProdField014() { return prodField014; }
    public void setProdField014(Boolean prodField014) { this.prodField014 = prodField014; }

    @Override
    public String toString() {
        return "ProductDto055{" +
            "prodField000=" + prodField000 + ", " +
            "prodField001=" + prodField001 + ", " +
            "prodField002=" + prodField002 + ", " +
            "prodField003=" + prodField003 + ", " +
            "prodField004=" + prodField004 + ", " +
            "}";
    }
}
