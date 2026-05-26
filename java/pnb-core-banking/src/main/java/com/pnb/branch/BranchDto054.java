package com.pnb.branch;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * BranchDto054 — Data Transfer Object for branch operations.
 * Variant 54 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BranchDto054 {

    @DecimalMin(value = "0.00")
    @JsonProperty("branField000")
    private BigDecimal branField000;

    @DecimalMin(value = "0.00")
    @JsonProperty("branField001")
    private BigDecimal branField001;

    @JsonProperty("branField002")
    private Boolean branField002;

    @JsonProperty("branField003")
    private Integer branField003;

    @DecimalMin(value = "0.00")
    @JsonProperty("branField004")
    private BigDecimal branField004;

    @JsonProperty("branField005")
    private Integer branField005;

    @JsonProperty("branField006")
    private Integer branField006;

    @JsonProperty("branField007")
    private LocalDate branField007;

    @DecimalMin(value = "0.00")
    @JsonProperty("branField008")
    private BigDecimal branField008;

    @JsonProperty("branField009")
    private Double branField009;

    @JsonProperty("branField010")
    private LocalDate branField010;

    @JsonProperty("branField011")
    private Double branField011;

    @JsonProperty("branField012")
    private Boolean branField012;

    @JsonProperty("branField013")
    private Double branField013;

    public BranchDto054() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final BranchDto054 instance = new BranchDto054();

        public Builder branField000(BigDecimal val) { instance.branField000 = val; return this; }
        public Builder branField001(BigDecimal val) { instance.branField001 = val; return this; }
        public Builder branField002(Boolean val) { instance.branField002 = val; return this; }
        public Builder branField003(Integer val) { instance.branField003 = val; return this; }
        public Builder branField004(BigDecimal val) { instance.branField004 = val; return this; }
        public Builder branField005(Integer val) { instance.branField005 = val; return this; }
        public Builder branField006(Integer val) { instance.branField006 = val; return this; }
        public Builder branField007(LocalDate val) { instance.branField007 = val; return this; }
        public Builder branField008(BigDecimal val) { instance.branField008 = val; return this; }
        public Builder branField009(Double val) { instance.branField009 = val; return this; }
        public Builder branField010(LocalDate val) { instance.branField010 = val; return this; }
        public Builder branField011(Double val) { instance.branField011 = val; return this; }
        public Builder branField012(Boolean val) { instance.branField012 = val; return this; }
        public Builder branField013(Double val) { instance.branField013 = val; return this; }
        public BranchDto054 build() { return instance; }
    }

    public BigDecimal getBranField000() { return branField000; }
    public void setBranField000(BigDecimal branField000) { this.branField000 = branField000; }

    public BigDecimal getBranField001() { return branField001; }
    public void setBranField001(BigDecimal branField001) { this.branField001 = branField001; }

    public Boolean getBranField002() { return branField002; }
    public void setBranField002(Boolean branField002) { this.branField002 = branField002; }

    public Integer getBranField003() { return branField003; }
    public void setBranField003(Integer branField003) { this.branField003 = branField003; }

    public BigDecimal getBranField004() { return branField004; }
    public void setBranField004(BigDecimal branField004) { this.branField004 = branField004; }

    public Integer getBranField005() { return branField005; }
    public void setBranField005(Integer branField005) { this.branField005 = branField005; }

    public Integer getBranField006() { return branField006; }
    public void setBranField006(Integer branField006) { this.branField006 = branField006; }

    public LocalDate getBranField007() { return branField007; }
    public void setBranField007(LocalDate branField007) { this.branField007 = branField007; }

    public BigDecimal getBranField008() { return branField008; }
    public void setBranField008(BigDecimal branField008) { this.branField008 = branField008; }

    public Double getBranField009() { return branField009; }
    public void setBranField009(Double branField009) { this.branField009 = branField009; }

    public LocalDate getBranField010() { return branField010; }
    public void setBranField010(LocalDate branField010) { this.branField010 = branField010; }

    public Double getBranField011() { return branField011; }
    public void setBranField011(Double branField011) { this.branField011 = branField011; }

    public Boolean getBranField012() { return branField012; }
    public void setBranField012(Boolean branField012) { this.branField012 = branField012; }

    public Double getBranField013() { return branField013; }
    public void setBranField013(Double branField013) { this.branField013 = branField013; }

    @Override
    public String toString() {
        return "BranchDto054{" +
            "branField000=" + branField000 + ", " +
            "branField001=" + branField001 + ", " +
            "branField002=" + branField002 + ", " +
            "branField003=" + branField003 + ", " +
            "branField004=" + branField004 + ", " +
            "}";
    }
}
