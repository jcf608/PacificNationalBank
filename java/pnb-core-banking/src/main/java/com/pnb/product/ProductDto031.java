package com.pnb.product;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * ProductDto031 — Data Transfer Object for product operations.
 * Variant 31 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductDto031 {

    @JsonProperty("prodField000")
    private LocalDate prodField000;

    @JsonProperty("prodField001")
    private LocalDate prodField001;

    @JsonProperty("prodField002")
    private LocalDate prodField002;

    @JsonProperty("prodField003")
    private Boolean prodField003;

    @JsonProperty("prodField004")
    private Integer prodField004;

    @JsonProperty("prodField005")
    private Long prodField005;

    @JsonProperty("prodField006")
    private Boolean prodField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("prodField007")
    private BigDecimal prodField007;

    @JsonProperty("prodField008")
    private Long prodField008;

    @Size(max = 60)
    @JsonProperty("prodField009")
    private String prodField009;

    @JsonProperty("prodField010")
    private Integer prodField010;

    @Size(max = 40)
    @JsonProperty("prodField011")
    private String prodField011;

    @JsonProperty("prodField012")
    private Long prodField012;

    @JsonProperty("prodField013")
    private Long prodField013;

    @Size(max = 200)
    @JsonProperty("prodField014")
    private String prodField014;

    public ProductDto031() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final ProductDto031 instance = new ProductDto031();

        public Builder prodField000(LocalDate val) { instance.prodField000 = val; return this; }
        public Builder prodField001(LocalDate val) { instance.prodField001 = val; return this; }
        public Builder prodField002(LocalDate val) { instance.prodField002 = val; return this; }
        public Builder prodField003(Boolean val) { instance.prodField003 = val; return this; }
        public Builder prodField004(Integer val) { instance.prodField004 = val; return this; }
        public Builder prodField005(Long val) { instance.prodField005 = val; return this; }
        public Builder prodField006(Boolean val) { instance.prodField006 = val; return this; }
        public Builder prodField007(BigDecimal val) { instance.prodField007 = val; return this; }
        public Builder prodField008(Long val) { instance.prodField008 = val; return this; }
        public Builder prodField009(String val) { instance.prodField009 = val; return this; }
        public Builder prodField010(Integer val) { instance.prodField010 = val; return this; }
        public Builder prodField011(String val) { instance.prodField011 = val; return this; }
        public Builder prodField012(Long val) { instance.prodField012 = val; return this; }
        public Builder prodField013(Long val) { instance.prodField013 = val; return this; }
        public Builder prodField014(String val) { instance.prodField014 = val; return this; }
        public ProductDto031 build() { return instance; }
    }

    public LocalDate getProdField000() { return prodField000; }
    public void setProdField000(LocalDate prodField000) { this.prodField000 = prodField000; }

    public LocalDate getProdField001() { return prodField001; }
    public void setProdField001(LocalDate prodField001) { this.prodField001 = prodField001; }

    public LocalDate getProdField002() { return prodField002; }
    public void setProdField002(LocalDate prodField002) { this.prodField002 = prodField002; }

    public Boolean getProdField003() { return prodField003; }
    public void setProdField003(Boolean prodField003) { this.prodField003 = prodField003; }

    public Integer getProdField004() { return prodField004; }
    public void setProdField004(Integer prodField004) { this.prodField004 = prodField004; }

    public Long getProdField005() { return prodField005; }
    public void setProdField005(Long prodField005) { this.prodField005 = prodField005; }

    public Boolean getProdField006() { return prodField006; }
    public void setProdField006(Boolean prodField006) { this.prodField006 = prodField006; }

    public BigDecimal getProdField007() { return prodField007; }
    public void setProdField007(BigDecimal prodField007) { this.prodField007 = prodField007; }

    public Long getProdField008() { return prodField008; }
    public void setProdField008(Long prodField008) { this.prodField008 = prodField008; }

    public String getProdField009() { return prodField009; }
    public void setProdField009(String prodField009) { this.prodField009 = prodField009; }

    public Integer getProdField010() { return prodField010; }
    public void setProdField010(Integer prodField010) { this.prodField010 = prodField010; }

    public String getProdField011() { return prodField011; }
    public void setProdField011(String prodField011) { this.prodField011 = prodField011; }

    public Long getProdField012() { return prodField012; }
    public void setProdField012(Long prodField012) { this.prodField012 = prodField012; }

    public Long getProdField013() { return prodField013; }
    public void setProdField013(Long prodField013) { this.prodField013 = prodField013; }

    public String getProdField014() { return prodField014; }
    public void setProdField014(String prodField014) { this.prodField014 = prodField014; }

    @Override
    public String toString() {
        return "ProductDto031{" +
            "prodField000=" + prodField000 + ", " +
            "prodField001=" + prodField001 + ", " +
            "prodField002=" + prodField002 + ", " +
            "prodField003=" + prodField003 + ", " +
            "prodField004=" + prodField004 + ", " +
            "}";
    }
}
