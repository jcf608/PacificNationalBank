package com.pnb.product;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * ProductDto039 — Data Transfer Object for product operations.
 * Variant 39 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductDto039 {

    @JsonProperty("prodField000")
    private Integer prodField000;

    @JsonProperty("prodField001")
    private Long prodField001;

    @JsonProperty("prodField002")
    private Double prodField002;

    @JsonProperty("prodField003")
    private Long prodField003;

    @JsonProperty("prodField004")
    private Boolean prodField004;

    @JsonProperty("prodField005")
    private Boolean prodField005;

    @JsonProperty("prodField006")
    private Boolean prodField006;

    @Size(max = 100)
    @JsonProperty("prodField007")
    private String prodField007;

    @Size(max = 40)
    @JsonProperty("prodField008")
    private String prodField008;

    @JsonProperty("prodField009")
    private LocalDate prodField009;

    @JsonProperty("prodField010")
    private Boolean prodField010;

    public ProductDto039() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final ProductDto039 instance = new ProductDto039();

        public Builder prodField000(Integer val) { instance.prodField000 = val; return this; }
        public Builder prodField001(Long val) { instance.prodField001 = val; return this; }
        public Builder prodField002(Double val) { instance.prodField002 = val; return this; }
        public Builder prodField003(Long val) { instance.prodField003 = val; return this; }
        public Builder prodField004(Boolean val) { instance.prodField004 = val; return this; }
        public Builder prodField005(Boolean val) { instance.prodField005 = val; return this; }
        public Builder prodField006(Boolean val) { instance.prodField006 = val; return this; }
        public Builder prodField007(String val) { instance.prodField007 = val; return this; }
        public Builder prodField008(String val) { instance.prodField008 = val; return this; }
        public Builder prodField009(LocalDate val) { instance.prodField009 = val; return this; }
        public Builder prodField010(Boolean val) { instance.prodField010 = val; return this; }
        public ProductDto039 build() { return instance; }
    }

    public Integer getProdField000() { return prodField000; }
    public void setProdField000(Integer prodField000) { this.prodField000 = prodField000; }

    public Long getProdField001() { return prodField001; }
    public void setProdField001(Long prodField001) { this.prodField001 = prodField001; }

    public Double getProdField002() { return prodField002; }
    public void setProdField002(Double prodField002) { this.prodField002 = prodField002; }

    public Long getProdField003() { return prodField003; }
    public void setProdField003(Long prodField003) { this.prodField003 = prodField003; }

    public Boolean getProdField004() { return prodField004; }
    public void setProdField004(Boolean prodField004) { this.prodField004 = prodField004; }

    public Boolean getProdField005() { return prodField005; }
    public void setProdField005(Boolean prodField005) { this.prodField005 = prodField005; }

    public Boolean getProdField006() { return prodField006; }
    public void setProdField006(Boolean prodField006) { this.prodField006 = prodField006; }

    public String getProdField007() { return prodField007; }
    public void setProdField007(String prodField007) { this.prodField007 = prodField007; }

    public String getProdField008() { return prodField008; }
    public void setProdField008(String prodField008) { this.prodField008 = prodField008; }

    public LocalDate getProdField009() { return prodField009; }
    public void setProdField009(LocalDate prodField009) { this.prodField009 = prodField009; }

    public Boolean getProdField010() { return prodField010; }
    public void setProdField010(Boolean prodField010) { this.prodField010 = prodField010; }

    @Override
    public String toString() {
        return "ProductDto039{" +
            "prodField000=" + prodField000 + ", " +
            "prodField001=" + prodField001 + ", " +
            "prodField002=" + prodField002 + ", " +
            "prodField003=" + prodField003 + ", " +
            "prodField004=" + prodField004 + ", " +
            "}";
    }
}
