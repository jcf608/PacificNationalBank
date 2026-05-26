package com.pnb.branch;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * BranchDto058 — Data Transfer Object for branch operations.
 * Variant 58 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BranchDto058 {

    @JsonProperty("branField000")
    private Integer branField000;

    @Size(max = 100)
    @JsonProperty("branField001")
    private String branField001;

    @JsonProperty("branField002")
    private Boolean branField002;

    @DecimalMin(value = "0.00")
    @JsonProperty("branField003")
    private BigDecimal branField003;

    @JsonProperty("branField004")
    private Double branField004;

    @JsonProperty("branField005")
    private Double branField005;

    @JsonProperty("branField006")
    private Long branField006;

    @JsonProperty("branField007")
    private Double branField007;

    @JsonProperty("branField008")
    private Integer branField008;

    @JsonProperty("branField009")
    private Integer branField009;

    @JsonProperty("branField010")
    private Double branField010;

    @Size(max = 100)
    @JsonProperty("branField011")
    private String branField011;

    @JsonProperty("branField012")
    private Integer branField012;

    @JsonProperty("branField013")
    private Double branField013;

    @JsonProperty("branField014")
    private LocalDate branField014;

    @JsonProperty("branField015")
    private Double branField015;

    @JsonProperty("branField016")
    private Integer branField016;

    @DecimalMin(value = "0.00")
    @JsonProperty("branField017")
    private BigDecimal branField017;

    public BranchDto058() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final BranchDto058 instance = new BranchDto058();

        public Builder branField000(Integer val) { instance.branField000 = val; return this; }
        public Builder branField001(String val) { instance.branField001 = val; return this; }
        public Builder branField002(Boolean val) { instance.branField002 = val; return this; }
        public Builder branField003(BigDecimal val) { instance.branField003 = val; return this; }
        public Builder branField004(Double val) { instance.branField004 = val; return this; }
        public Builder branField005(Double val) { instance.branField005 = val; return this; }
        public Builder branField006(Long val) { instance.branField006 = val; return this; }
        public Builder branField007(Double val) { instance.branField007 = val; return this; }
        public Builder branField008(Integer val) { instance.branField008 = val; return this; }
        public Builder branField009(Integer val) { instance.branField009 = val; return this; }
        public Builder branField010(Double val) { instance.branField010 = val; return this; }
        public Builder branField011(String val) { instance.branField011 = val; return this; }
        public Builder branField012(Integer val) { instance.branField012 = val; return this; }
        public Builder branField013(Double val) { instance.branField013 = val; return this; }
        public Builder branField014(LocalDate val) { instance.branField014 = val; return this; }
        public Builder branField015(Double val) { instance.branField015 = val; return this; }
        public Builder branField016(Integer val) { instance.branField016 = val; return this; }
        public Builder branField017(BigDecimal val) { instance.branField017 = val; return this; }
        public BranchDto058 build() { return instance; }
    }

    public Integer getBranField000() { return branField000; }
    public void setBranField000(Integer branField000) { this.branField000 = branField000; }

    public String getBranField001() { return branField001; }
    public void setBranField001(String branField001) { this.branField001 = branField001; }

    public Boolean getBranField002() { return branField002; }
    public void setBranField002(Boolean branField002) { this.branField002 = branField002; }

    public BigDecimal getBranField003() { return branField003; }
    public void setBranField003(BigDecimal branField003) { this.branField003 = branField003; }

    public Double getBranField004() { return branField004; }
    public void setBranField004(Double branField004) { this.branField004 = branField004; }

    public Double getBranField005() { return branField005; }
    public void setBranField005(Double branField005) { this.branField005 = branField005; }

    public Long getBranField006() { return branField006; }
    public void setBranField006(Long branField006) { this.branField006 = branField006; }

    public Double getBranField007() { return branField007; }
    public void setBranField007(Double branField007) { this.branField007 = branField007; }

    public Integer getBranField008() { return branField008; }
    public void setBranField008(Integer branField008) { this.branField008 = branField008; }

    public Integer getBranField009() { return branField009; }
    public void setBranField009(Integer branField009) { this.branField009 = branField009; }

    public Double getBranField010() { return branField010; }
    public void setBranField010(Double branField010) { this.branField010 = branField010; }

    public String getBranField011() { return branField011; }
    public void setBranField011(String branField011) { this.branField011 = branField011; }

    public Integer getBranField012() { return branField012; }
    public void setBranField012(Integer branField012) { this.branField012 = branField012; }

    public Double getBranField013() { return branField013; }
    public void setBranField013(Double branField013) { this.branField013 = branField013; }

    public LocalDate getBranField014() { return branField014; }
    public void setBranField014(LocalDate branField014) { this.branField014 = branField014; }

    public Double getBranField015() { return branField015; }
    public void setBranField015(Double branField015) { this.branField015 = branField015; }

    public Integer getBranField016() { return branField016; }
    public void setBranField016(Integer branField016) { this.branField016 = branField016; }

    public BigDecimal getBranField017() { return branField017; }
    public void setBranField017(BigDecimal branField017) { this.branField017 = branField017; }

    @Override
    public String toString() {
        return "BranchDto058{" +
            "branField000=" + branField000 + ", " +
            "branField001=" + branField001 + ", " +
            "branField002=" + branField002 + ", " +
            "branField003=" + branField003 + ", " +
            "branField004=" + branField004 + ", " +
            "}";
    }
}
