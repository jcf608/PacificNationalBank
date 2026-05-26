package com.pnb.branch;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * BranchDto041 — Data Transfer Object for branch operations.
 * Variant 41 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BranchDto041 {

    @DecimalMin(value = "0.00")
    @JsonProperty("branField000")
    private BigDecimal branField000;

    @JsonProperty("branField001")
    private Integer branField001;

    @Size(max = 100)
    @JsonProperty("branField002")
    private String branField002;

    @JsonProperty("branField003")
    private Integer branField003;

    @DecimalMin(value = "0.00")
    @JsonProperty("branField004")
    private BigDecimal branField004;

    @JsonProperty("branField005")
    private Integer branField005;

    @JsonProperty("branField006")
    private Boolean branField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("branField007")
    private BigDecimal branField007;

    @JsonProperty("branField008")
    private Integer branField008;

    @JsonProperty("branField009")
    private LocalDate branField009;

    @Size(max = 100)
    @JsonProperty("branField010")
    private String branField010;

    @JsonProperty("branField011")
    private Integer branField011;

    @JsonProperty("branField012")
    private LocalDate branField012;

    public BranchDto041() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final BranchDto041 instance = new BranchDto041();

        public Builder branField000(BigDecimal val) { instance.branField000 = val; return this; }
        public Builder branField001(Integer val) { instance.branField001 = val; return this; }
        public Builder branField002(String val) { instance.branField002 = val; return this; }
        public Builder branField003(Integer val) { instance.branField003 = val; return this; }
        public Builder branField004(BigDecimal val) { instance.branField004 = val; return this; }
        public Builder branField005(Integer val) { instance.branField005 = val; return this; }
        public Builder branField006(Boolean val) { instance.branField006 = val; return this; }
        public Builder branField007(BigDecimal val) { instance.branField007 = val; return this; }
        public Builder branField008(Integer val) { instance.branField008 = val; return this; }
        public Builder branField009(LocalDate val) { instance.branField009 = val; return this; }
        public Builder branField010(String val) { instance.branField010 = val; return this; }
        public Builder branField011(Integer val) { instance.branField011 = val; return this; }
        public Builder branField012(LocalDate val) { instance.branField012 = val; return this; }
        public BranchDto041 build() { return instance; }
    }

    public BigDecimal getBranField000() { return branField000; }
    public void setBranField000(BigDecimal branField000) { this.branField000 = branField000; }

    public Integer getBranField001() { return branField001; }
    public void setBranField001(Integer branField001) { this.branField001 = branField001; }

    public String getBranField002() { return branField002; }
    public void setBranField002(String branField002) { this.branField002 = branField002; }

    public Integer getBranField003() { return branField003; }
    public void setBranField003(Integer branField003) { this.branField003 = branField003; }

    public BigDecimal getBranField004() { return branField004; }
    public void setBranField004(BigDecimal branField004) { this.branField004 = branField004; }

    public Integer getBranField005() { return branField005; }
    public void setBranField005(Integer branField005) { this.branField005 = branField005; }

    public Boolean getBranField006() { return branField006; }
    public void setBranField006(Boolean branField006) { this.branField006 = branField006; }

    public BigDecimal getBranField007() { return branField007; }
    public void setBranField007(BigDecimal branField007) { this.branField007 = branField007; }

    public Integer getBranField008() { return branField008; }
    public void setBranField008(Integer branField008) { this.branField008 = branField008; }

    public LocalDate getBranField009() { return branField009; }
    public void setBranField009(LocalDate branField009) { this.branField009 = branField009; }

    public String getBranField010() { return branField010; }
    public void setBranField010(String branField010) { this.branField010 = branField010; }

    public Integer getBranField011() { return branField011; }
    public void setBranField011(Integer branField011) { this.branField011 = branField011; }

    public LocalDate getBranField012() { return branField012; }
    public void setBranField012(LocalDate branField012) { this.branField012 = branField012; }

    @Override
    public String toString() {
        return "BranchDto041{" +
            "branField000=" + branField000 + ", " +
            "branField001=" + branField001 + ", " +
            "branField002=" + branField002 + ", " +
            "branField003=" + branField003 + ", " +
            "branField004=" + branField004 + ", " +
            "}";
    }
}
