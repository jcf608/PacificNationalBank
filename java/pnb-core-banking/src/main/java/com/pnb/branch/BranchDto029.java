package com.pnb.branch;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * BranchDto029 — Data Transfer Object for branch operations.
 * Variant 29 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BranchDto029 {

    @DecimalMin(value = "0.00")
    @JsonProperty("branField000")
    private BigDecimal branField000;

    @JsonProperty("branField001")
    private Boolean branField001;

    @JsonProperty("branField002")
    private Double branField002;

    @JsonProperty("branField003")
    private Boolean branField003;

    @JsonProperty("branField004")
    private Double branField004;

    @JsonProperty("branField005")
    private Integer branField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("branField006")
    private BigDecimal branField006;

    @Size(max = 100)
    @JsonProperty("branField007")
    private String branField007;

    @DecimalMin(value = "0.00")
    @JsonProperty("branField008")
    private BigDecimal branField008;

    @JsonProperty("branField009")
    private Integer branField009;

    @JsonProperty("branField010")
    private Long branField010;

    @JsonProperty("branField011")
    private Integer branField011;

    @JsonProperty("branField012")
    private Boolean branField012;

    public BranchDto029() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final BranchDto029 instance = new BranchDto029();

        public Builder branField000(BigDecimal val) { instance.branField000 = val; return this; }
        public Builder branField001(Boolean val) { instance.branField001 = val; return this; }
        public Builder branField002(Double val) { instance.branField002 = val; return this; }
        public Builder branField003(Boolean val) { instance.branField003 = val; return this; }
        public Builder branField004(Double val) { instance.branField004 = val; return this; }
        public Builder branField005(Integer val) { instance.branField005 = val; return this; }
        public Builder branField006(BigDecimal val) { instance.branField006 = val; return this; }
        public Builder branField007(String val) { instance.branField007 = val; return this; }
        public Builder branField008(BigDecimal val) { instance.branField008 = val; return this; }
        public Builder branField009(Integer val) { instance.branField009 = val; return this; }
        public Builder branField010(Long val) { instance.branField010 = val; return this; }
        public Builder branField011(Integer val) { instance.branField011 = val; return this; }
        public Builder branField012(Boolean val) { instance.branField012 = val; return this; }
        public BranchDto029 build() { return instance; }
    }

    public BigDecimal getBranField000() { return branField000; }
    public void setBranField000(BigDecimal branField000) { this.branField000 = branField000; }

    public Boolean getBranField001() { return branField001; }
    public void setBranField001(Boolean branField001) { this.branField001 = branField001; }

    public Double getBranField002() { return branField002; }
    public void setBranField002(Double branField002) { this.branField002 = branField002; }

    public Boolean getBranField003() { return branField003; }
    public void setBranField003(Boolean branField003) { this.branField003 = branField003; }

    public Double getBranField004() { return branField004; }
    public void setBranField004(Double branField004) { this.branField004 = branField004; }

    public Integer getBranField005() { return branField005; }
    public void setBranField005(Integer branField005) { this.branField005 = branField005; }

    public BigDecimal getBranField006() { return branField006; }
    public void setBranField006(BigDecimal branField006) { this.branField006 = branField006; }

    public String getBranField007() { return branField007; }
    public void setBranField007(String branField007) { this.branField007 = branField007; }

    public BigDecimal getBranField008() { return branField008; }
    public void setBranField008(BigDecimal branField008) { this.branField008 = branField008; }

    public Integer getBranField009() { return branField009; }
    public void setBranField009(Integer branField009) { this.branField009 = branField009; }

    public Long getBranField010() { return branField010; }
    public void setBranField010(Long branField010) { this.branField010 = branField010; }

    public Integer getBranField011() { return branField011; }
    public void setBranField011(Integer branField011) { this.branField011 = branField011; }

    public Boolean getBranField012() { return branField012; }
    public void setBranField012(Boolean branField012) { this.branField012 = branField012; }

    @Override
    public String toString() {
        return "BranchDto029{" +
            "branField000=" + branField000 + ", " +
            "branField001=" + branField001 + ", " +
            "branField002=" + branField002 + ", " +
            "branField003=" + branField003 + ", " +
            "branField004=" + branField004 + ", " +
            "}";
    }
}
