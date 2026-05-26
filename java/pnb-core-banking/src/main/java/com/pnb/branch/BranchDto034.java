package com.pnb.branch;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * BranchDto034 — Data Transfer Object for branch operations.
 * Variant 34 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BranchDto034 {

    @JsonProperty("branField000")
    private Long branField000;

    @Size(max = 200)
    @JsonProperty("branField001")
    private String branField001;

    @JsonProperty("branField002")
    private LocalDate branField002;

    @DecimalMin(value = "0.00")
    @JsonProperty("branField003")
    private BigDecimal branField003;

    @Size(max = 20)
    @JsonProperty("branField004")
    private String branField004;

    @JsonProperty("branField005")
    private Integer branField005;

    @JsonProperty("branField006")
    private Integer branField006;

    @JsonProperty("branField007")
    private Double branField007;

    @JsonProperty("branField008")
    private Long branField008;

    @DecimalMin(value = "0.00")
    @JsonProperty("branField009")
    private BigDecimal branField009;

    @DecimalMin(value = "0.00")
    @JsonProperty("branField010")
    private BigDecimal branField010;

    @JsonProperty("branField011")
    private Double branField011;

    @JsonProperty("branField012")
    private Integer branField012;

    @JsonProperty("branField013")
    private Long branField013;

    @DecimalMin(value = "0.00")
    @JsonProperty("branField014")
    private BigDecimal branField014;

    @JsonProperty("branField015")
    private Long branField015;

    @JsonProperty("branField016")
    private Integer branField016;

    @JsonProperty("branField017")
    private Double branField017;

    public BranchDto034() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final BranchDto034 instance = new BranchDto034();

        public Builder branField000(Long val) { instance.branField000 = val; return this; }
        public Builder branField001(String val) { instance.branField001 = val; return this; }
        public Builder branField002(LocalDate val) { instance.branField002 = val; return this; }
        public Builder branField003(BigDecimal val) { instance.branField003 = val; return this; }
        public Builder branField004(String val) { instance.branField004 = val; return this; }
        public Builder branField005(Integer val) { instance.branField005 = val; return this; }
        public Builder branField006(Integer val) { instance.branField006 = val; return this; }
        public Builder branField007(Double val) { instance.branField007 = val; return this; }
        public Builder branField008(Long val) { instance.branField008 = val; return this; }
        public Builder branField009(BigDecimal val) { instance.branField009 = val; return this; }
        public Builder branField010(BigDecimal val) { instance.branField010 = val; return this; }
        public Builder branField011(Double val) { instance.branField011 = val; return this; }
        public Builder branField012(Integer val) { instance.branField012 = val; return this; }
        public Builder branField013(Long val) { instance.branField013 = val; return this; }
        public Builder branField014(BigDecimal val) { instance.branField014 = val; return this; }
        public Builder branField015(Long val) { instance.branField015 = val; return this; }
        public Builder branField016(Integer val) { instance.branField016 = val; return this; }
        public Builder branField017(Double val) { instance.branField017 = val; return this; }
        public BranchDto034 build() { return instance; }
    }

    public Long getBranField000() { return branField000; }
    public void setBranField000(Long branField000) { this.branField000 = branField000; }

    public String getBranField001() { return branField001; }
    public void setBranField001(String branField001) { this.branField001 = branField001; }

    public LocalDate getBranField002() { return branField002; }
    public void setBranField002(LocalDate branField002) { this.branField002 = branField002; }

    public BigDecimal getBranField003() { return branField003; }
    public void setBranField003(BigDecimal branField003) { this.branField003 = branField003; }

    public String getBranField004() { return branField004; }
    public void setBranField004(String branField004) { this.branField004 = branField004; }

    public Integer getBranField005() { return branField005; }
    public void setBranField005(Integer branField005) { this.branField005 = branField005; }

    public Integer getBranField006() { return branField006; }
    public void setBranField006(Integer branField006) { this.branField006 = branField006; }

    public Double getBranField007() { return branField007; }
    public void setBranField007(Double branField007) { this.branField007 = branField007; }

    public Long getBranField008() { return branField008; }
    public void setBranField008(Long branField008) { this.branField008 = branField008; }

    public BigDecimal getBranField009() { return branField009; }
    public void setBranField009(BigDecimal branField009) { this.branField009 = branField009; }

    public BigDecimal getBranField010() { return branField010; }
    public void setBranField010(BigDecimal branField010) { this.branField010 = branField010; }

    public Double getBranField011() { return branField011; }
    public void setBranField011(Double branField011) { this.branField011 = branField011; }

    public Integer getBranField012() { return branField012; }
    public void setBranField012(Integer branField012) { this.branField012 = branField012; }

    public Long getBranField013() { return branField013; }
    public void setBranField013(Long branField013) { this.branField013 = branField013; }

    public BigDecimal getBranField014() { return branField014; }
    public void setBranField014(BigDecimal branField014) { this.branField014 = branField014; }

    public Long getBranField015() { return branField015; }
    public void setBranField015(Long branField015) { this.branField015 = branField015; }

    public Integer getBranField016() { return branField016; }
    public void setBranField016(Integer branField016) { this.branField016 = branField016; }

    public Double getBranField017() { return branField017; }
    public void setBranField017(Double branField017) { this.branField017 = branField017; }

    @Override
    public String toString() {
        return "BranchDto034{" +
            "branField000=" + branField000 + ", " +
            "branField001=" + branField001 + ", " +
            "branField002=" + branField002 + ", " +
            "branField003=" + branField003 + ", " +
            "branField004=" + branField004 + ", " +
            "}";
    }
}
