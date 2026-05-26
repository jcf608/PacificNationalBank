package com.pnb.product;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * ProductDto049 — Data Transfer Object for product operations.
 * Variant 49 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductDto049 {

    @Size(max = 100)
    @JsonProperty("prodField000")
    private String prodField000;

    @Size(max = 20)
    @JsonProperty("prodField001")
    private String prodField001;

    @JsonProperty("prodField002")
    private Boolean prodField002;

    @JsonProperty("prodField003")
    private Long prodField003;

    @JsonProperty("prodField004")
    private Boolean prodField004;

    @JsonProperty("prodField005")
    private Double prodField005;

    @JsonProperty("prodField006")
    private Boolean prodField006;

    @JsonProperty("prodField007")
    private LocalDate prodField007;

    @JsonProperty("prodField008")
    private Integer prodField008;

    public ProductDto049() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final ProductDto049 instance = new ProductDto049();

        public Builder prodField000(String val) { instance.prodField000 = val; return this; }
        public Builder prodField001(String val) { instance.prodField001 = val; return this; }
        public Builder prodField002(Boolean val) { instance.prodField002 = val; return this; }
        public Builder prodField003(Long val) { instance.prodField003 = val; return this; }
        public Builder prodField004(Boolean val) { instance.prodField004 = val; return this; }
        public Builder prodField005(Double val) { instance.prodField005 = val; return this; }
        public Builder prodField006(Boolean val) { instance.prodField006 = val; return this; }
        public Builder prodField007(LocalDate val) { instance.prodField007 = val; return this; }
        public Builder prodField008(Integer val) { instance.prodField008 = val; return this; }
        public ProductDto049 build() { return instance; }
    }

    public String getProdField000() { return prodField000; }
    public void setProdField000(String prodField000) { this.prodField000 = prodField000; }

    public String getProdField001() { return prodField001; }
    public void setProdField001(String prodField001) { this.prodField001 = prodField001; }

    public Boolean getProdField002() { return prodField002; }
    public void setProdField002(Boolean prodField002) { this.prodField002 = prodField002; }

    public Long getProdField003() { return prodField003; }
    public void setProdField003(Long prodField003) { this.prodField003 = prodField003; }

    public Boolean getProdField004() { return prodField004; }
    public void setProdField004(Boolean prodField004) { this.prodField004 = prodField004; }

    public Double getProdField005() { return prodField005; }
    public void setProdField005(Double prodField005) { this.prodField005 = prodField005; }

    public Boolean getProdField006() { return prodField006; }
    public void setProdField006(Boolean prodField006) { this.prodField006 = prodField006; }

    public LocalDate getProdField007() { return prodField007; }
    public void setProdField007(LocalDate prodField007) { this.prodField007 = prodField007; }

    public Integer getProdField008() { return prodField008; }
    public void setProdField008(Integer prodField008) { this.prodField008 = prodField008; }

    @Override
    public String toString() {
        return "ProductDto049{" +
            "prodField000=" + prodField000 + ", " +
            "prodField001=" + prodField001 + ", " +
            "prodField002=" + prodField002 + ", " +
            "prodField003=" + prodField003 + ", " +
            "prodField004=" + prodField004 + ", " +
            "}";
    }
}
