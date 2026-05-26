package com.pnb.product;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * ProductDto046 — Data Transfer Object for product operations.
 * Variant 46 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductDto046 {

    @JsonProperty("prodField000")
    private Boolean prodField000;

    @JsonProperty("prodField001")
    private LocalDate prodField001;

    @JsonProperty("prodField002")
    private LocalDate prodField002;

    @Size(max = 60)
    @JsonProperty("prodField003")
    private String prodField003;

    @JsonProperty("prodField004")
    private LocalDate prodField004;

    @JsonProperty("prodField005")
    private LocalDate prodField005;

    @JsonProperty("prodField006")
    private LocalDate prodField006;

    @JsonProperty("prodField007")
    private Long prodField007;

    @JsonProperty("prodField008")
    private Long prodField008;

    @JsonProperty("prodField009")
    private Long prodField009;

    @DecimalMin(value = "0.00")
    @JsonProperty("prodField010")
    private BigDecimal prodField010;

    @Size(max = 60)
    @JsonProperty("prodField011")
    private String prodField011;

    @Size(max = 20)
    @JsonProperty("prodField012")
    private String prodField012;

    @JsonProperty("prodField013")
    private Boolean prodField013;

    @JsonProperty("prodField014")
    private Boolean prodField014;

    @JsonProperty("prodField015")
    private Boolean prodField015;

    @JsonProperty("prodField016")
    private LocalDate prodField016;

    @Size(max = 60)
    @JsonProperty("prodField017")
    private String prodField017;

    public ProductDto046() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final ProductDto046 instance = new ProductDto046();

        public Builder prodField000(Boolean val) { instance.prodField000 = val; return this; }
        public Builder prodField001(LocalDate val) { instance.prodField001 = val; return this; }
        public Builder prodField002(LocalDate val) { instance.prodField002 = val; return this; }
        public Builder prodField003(String val) { instance.prodField003 = val; return this; }
        public Builder prodField004(LocalDate val) { instance.prodField004 = val; return this; }
        public Builder prodField005(LocalDate val) { instance.prodField005 = val; return this; }
        public Builder prodField006(LocalDate val) { instance.prodField006 = val; return this; }
        public Builder prodField007(Long val) { instance.prodField007 = val; return this; }
        public Builder prodField008(Long val) { instance.prodField008 = val; return this; }
        public Builder prodField009(Long val) { instance.prodField009 = val; return this; }
        public Builder prodField010(BigDecimal val) { instance.prodField010 = val; return this; }
        public Builder prodField011(String val) { instance.prodField011 = val; return this; }
        public Builder prodField012(String val) { instance.prodField012 = val; return this; }
        public Builder prodField013(Boolean val) { instance.prodField013 = val; return this; }
        public Builder prodField014(Boolean val) { instance.prodField014 = val; return this; }
        public Builder prodField015(Boolean val) { instance.prodField015 = val; return this; }
        public Builder prodField016(LocalDate val) { instance.prodField016 = val; return this; }
        public Builder prodField017(String val) { instance.prodField017 = val; return this; }
        public ProductDto046 build() { return instance; }
    }

    public Boolean getProdField000() { return prodField000; }
    public void setProdField000(Boolean prodField000) { this.prodField000 = prodField000; }

    public LocalDate getProdField001() { return prodField001; }
    public void setProdField001(LocalDate prodField001) { this.prodField001 = prodField001; }

    public LocalDate getProdField002() { return prodField002; }
    public void setProdField002(LocalDate prodField002) { this.prodField002 = prodField002; }

    public String getProdField003() { return prodField003; }
    public void setProdField003(String prodField003) { this.prodField003 = prodField003; }

    public LocalDate getProdField004() { return prodField004; }
    public void setProdField004(LocalDate prodField004) { this.prodField004 = prodField004; }

    public LocalDate getProdField005() { return prodField005; }
    public void setProdField005(LocalDate prodField005) { this.prodField005 = prodField005; }

    public LocalDate getProdField006() { return prodField006; }
    public void setProdField006(LocalDate prodField006) { this.prodField006 = prodField006; }

    public Long getProdField007() { return prodField007; }
    public void setProdField007(Long prodField007) { this.prodField007 = prodField007; }

    public Long getProdField008() { return prodField008; }
    public void setProdField008(Long prodField008) { this.prodField008 = prodField008; }

    public Long getProdField009() { return prodField009; }
    public void setProdField009(Long prodField009) { this.prodField009 = prodField009; }

    public BigDecimal getProdField010() { return prodField010; }
    public void setProdField010(BigDecimal prodField010) { this.prodField010 = prodField010; }

    public String getProdField011() { return prodField011; }
    public void setProdField011(String prodField011) { this.prodField011 = prodField011; }

    public String getProdField012() { return prodField012; }
    public void setProdField012(String prodField012) { this.prodField012 = prodField012; }

    public Boolean getProdField013() { return prodField013; }
    public void setProdField013(Boolean prodField013) { this.prodField013 = prodField013; }

    public Boolean getProdField014() { return prodField014; }
    public void setProdField014(Boolean prodField014) { this.prodField014 = prodField014; }

    public Boolean getProdField015() { return prodField015; }
    public void setProdField015(Boolean prodField015) { this.prodField015 = prodField015; }

    public LocalDate getProdField016() { return prodField016; }
    public void setProdField016(LocalDate prodField016) { this.prodField016 = prodField016; }

    public String getProdField017() { return prodField017; }
    public void setProdField017(String prodField017) { this.prodField017 = prodField017; }

    @Override
    public String toString() {
        return "ProductDto046{" +
            "prodField000=" + prodField000 + ", " +
            "prodField001=" + prodField001 + ", " +
            "prodField002=" + prodField002 + ", " +
            "prodField003=" + prodField003 + ", " +
            "prodField004=" + prodField004 + ", " +
            "}";
    }
}
