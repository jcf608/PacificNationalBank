package com.pnb.branch;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * BranchDto059 — Data Transfer Object for branch operations.
 * Variant 59 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BranchDto059 {

    @JsonProperty("branField000")
    private Long branField000;

    @JsonProperty("branField001")
    private LocalDate branField001;

    @JsonProperty("branField002")
    private Long branField002;

    @Size(max = 200)
    @JsonProperty("branField003")
    private String branField003;

    @JsonProperty("branField004")
    private Long branField004;

    @JsonProperty("branField005")
    private Integer branField005;

    @Size(max = 100)
    @JsonProperty("branField006")
    private String branField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("branField007")
    private BigDecimal branField007;

    @Size(max = 20)
    @JsonProperty("branField008")
    private String branField008;

    @DecimalMin(value = "0.00")
    @JsonProperty("branField009")
    private BigDecimal branField009;

    @DecimalMin(value = "0.00")
    @JsonProperty("branField010")
    private BigDecimal branField010;

    @DecimalMin(value = "0.00")
    @JsonProperty("branField011")
    private BigDecimal branField011;

    @JsonProperty("branField012")
    private LocalDate branField012;

    @JsonProperty("branField013")
    private Boolean branField013;

    @JsonProperty("branField014")
    private Long branField014;

    @JsonProperty("branField015")
    private Integer branField015;

    @JsonProperty("branField016")
    private Integer branField016;

    @Size(max = 60)
    @JsonProperty("branField017")
    private String branField017;

    @JsonProperty("branField018")
    private Double branField018;

    public BranchDto059() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final BranchDto059 instance = new BranchDto059();

        public Builder branField000(Long val) { instance.branField000 = val; return this; }
        public Builder branField001(LocalDate val) { instance.branField001 = val; return this; }
        public Builder branField002(Long val) { instance.branField002 = val; return this; }
        public Builder branField003(String val) { instance.branField003 = val; return this; }
        public Builder branField004(Long val) { instance.branField004 = val; return this; }
        public Builder branField005(Integer val) { instance.branField005 = val; return this; }
        public Builder branField006(String val) { instance.branField006 = val; return this; }
        public Builder branField007(BigDecimal val) { instance.branField007 = val; return this; }
        public Builder branField008(String val) { instance.branField008 = val; return this; }
        public Builder branField009(BigDecimal val) { instance.branField009 = val; return this; }
        public Builder branField010(BigDecimal val) { instance.branField010 = val; return this; }
        public Builder branField011(BigDecimal val) { instance.branField011 = val; return this; }
        public Builder branField012(LocalDate val) { instance.branField012 = val; return this; }
        public Builder branField013(Boolean val) { instance.branField013 = val; return this; }
        public Builder branField014(Long val) { instance.branField014 = val; return this; }
        public Builder branField015(Integer val) { instance.branField015 = val; return this; }
        public Builder branField016(Integer val) { instance.branField016 = val; return this; }
        public Builder branField017(String val) { instance.branField017 = val; return this; }
        public Builder branField018(Double val) { instance.branField018 = val; return this; }
        public BranchDto059 build() { return instance; }
    }

    public Long getBranField000() { return branField000; }
    public void setBranField000(Long branField000) { this.branField000 = branField000; }

    public LocalDate getBranField001() { return branField001; }
    public void setBranField001(LocalDate branField001) { this.branField001 = branField001; }

    public Long getBranField002() { return branField002; }
    public void setBranField002(Long branField002) { this.branField002 = branField002; }

    public String getBranField003() { return branField003; }
    public void setBranField003(String branField003) { this.branField003 = branField003; }

    public Long getBranField004() { return branField004; }
    public void setBranField004(Long branField004) { this.branField004 = branField004; }

    public Integer getBranField005() { return branField005; }
    public void setBranField005(Integer branField005) { this.branField005 = branField005; }

    public String getBranField006() { return branField006; }
    public void setBranField006(String branField006) { this.branField006 = branField006; }

    public BigDecimal getBranField007() { return branField007; }
    public void setBranField007(BigDecimal branField007) { this.branField007 = branField007; }

    public String getBranField008() { return branField008; }
    public void setBranField008(String branField008) { this.branField008 = branField008; }

    public BigDecimal getBranField009() { return branField009; }
    public void setBranField009(BigDecimal branField009) { this.branField009 = branField009; }

    public BigDecimal getBranField010() { return branField010; }
    public void setBranField010(BigDecimal branField010) { this.branField010 = branField010; }

    public BigDecimal getBranField011() { return branField011; }
    public void setBranField011(BigDecimal branField011) { this.branField011 = branField011; }

    public LocalDate getBranField012() { return branField012; }
    public void setBranField012(LocalDate branField012) { this.branField012 = branField012; }

    public Boolean getBranField013() { return branField013; }
    public void setBranField013(Boolean branField013) { this.branField013 = branField013; }

    public Long getBranField014() { return branField014; }
    public void setBranField014(Long branField014) { this.branField014 = branField014; }

    public Integer getBranField015() { return branField015; }
    public void setBranField015(Integer branField015) { this.branField015 = branField015; }

    public Integer getBranField016() { return branField016; }
    public void setBranField016(Integer branField016) { this.branField016 = branField016; }

    public String getBranField017() { return branField017; }
    public void setBranField017(String branField017) { this.branField017 = branField017; }

    public Double getBranField018() { return branField018; }
    public void setBranField018(Double branField018) { this.branField018 = branField018; }

    @Override
    public String toString() {
        return "BranchDto059{" +
            "branField000=" + branField000 + ", " +
            "branField001=" + branField001 + ", " +
            "branField002=" + branField002 + ", " +
            "branField003=" + branField003 + ", " +
            "branField004=" + branField004 + ", " +
            "}";
    }
}
