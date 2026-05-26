package com.pnb.branch;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * BranchDto023 — Data Transfer Object for branch operations.
 * Variant 23 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BranchDto023 {

    @JsonProperty("branField000")
    private Double branField000;

    @Size(max = 100)
    @JsonProperty("branField001")
    private String branField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("branField002")
    private BigDecimal branField002;

    @JsonProperty("branField003")
    private Integer branField003;

    @DecimalMin(value = "0.00")
    @JsonProperty("branField004")
    private BigDecimal branField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("branField005")
    private BigDecimal branField005;

    @JsonProperty("branField006")
    private Long branField006;

    @Size(max = 20)
    @JsonProperty("branField007")
    private String branField007;

    @JsonProperty("branField008")
    private Long branField008;

    @DecimalMin(value = "0.00")
    @JsonProperty("branField009")
    private BigDecimal branField009;

    @JsonProperty("branField010")
    private Integer branField010;

    @JsonProperty("branField011")
    private Long branField011;

    @Size(max = 40)
    @JsonProperty("branField012")
    private String branField012;

    @JsonProperty("branField013")
    private LocalDate branField013;

    @Size(max = 100)
    @JsonProperty("branField014")
    private String branField014;

    @JsonProperty("branField015")
    private LocalDate branField015;

    @Size(max = 40)
    @JsonProperty("branField016")
    private String branField016;

    @JsonProperty("branField017")
    private LocalDate branField017;

    @JsonProperty("branField018")
    private Boolean branField018;

    public BranchDto023() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final BranchDto023 instance = new BranchDto023();

        public Builder branField000(Double val) { instance.branField000 = val; return this; }
        public Builder branField001(String val) { instance.branField001 = val; return this; }
        public Builder branField002(BigDecimal val) { instance.branField002 = val; return this; }
        public Builder branField003(Integer val) { instance.branField003 = val; return this; }
        public Builder branField004(BigDecimal val) { instance.branField004 = val; return this; }
        public Builder branField005(BigDecimal val) { instance.branField005 = val; return this; }
        public Builder branField006(Long val) { instance.branField006 = val; return this; }
        public Builder branField007(String val) { instance.branField007 = val; return this; }
        public Builder branField008(Long val) { instance.branField008 = val; return this; }
        public Builder branField009(BigDecimal val) { instance.branField009 = val; return this; }
        public Builder branField010(Integer val) { instance.branField010 = val; return this; }
        public Builder branField011(Long val) { instance.branField011 = val; return this; }
        public Builder branField012(String val) { instance.branField012 = val; return this; }
        public Builder branField013(LocalDate val) { instance.branField013 = val; return this; }
        public Builder branField014(String val) { instance.branField014 = val; return this; }
        public Builder branField015(LocalDate val) { instance.branField015 = val; return this; }
        public Builder branField016(String val) { instance.branField016 = val; return this; }
        public Builder branField017(LocalDate val) { instance.branField017 = val; return this; }
        public Builder branField018(Boolean val) { instance.branField018 = val; return this; }
        public BranchDto023 build() { return instance; }
    }

    public Double getBranField000() { return branField000; }
    public void setBranField000(Double branField000) { this.branField000 = branField000; }

    public String getBranField001() { return branField001; }
    public void setBranField001(String branField001) { this.branField001 = branField001; }

    public BigDecimal getBranField002() { return branField002; }
    public void setBranField002(BigDecimal branField002) { this.branField002 = branField002; }

    public Integer getBranField003() { return branField003; }
    public void setBranField003(Integer branField003) { this.branField003 = branField003; }

    public BigDecimal getBranField004() { return branField004; }
    public void setBranField004(BigDecimal branField004) { this.branField004 = branField004; }

    public BigDecimal getBranField005() { return branField005; }
    public void setBranField005(BigDecimal branField005) { this.branField005 = branField005; }

    public Long getBranField006() { return branField006; }
    public void setBranField006(Long branField006) { this.branField006 = branField006; }

    public String getBranField007() { return branField007; }
    public void setBranField007(String branField007) { this.branField007 = branField007; }

    public Long getBranField008() { return branField008; }
    public void setBranField008(Long branField008) { this.branField008 = branField008; }

    public BigDecimal getBranField009() { return branField009; }
    public void setBranField009(BigDecimal branField009) { this.branField009 = branField009; }

    public Integer getBranField010() { return branField010; }
    public void setBranField010(Integer branField010) { this.branField010 = branField010; }

    public Long getBranField011() { return branField011; }
    public void setBranField011(Long branField011) { this.branField011 = branField011; }

    public String getBranField012() { return branField012; }
    public void setBranField012(String branField012) { this.branField012 = branField012; }

    public LocalDate getBranField013() { return branField013; }
    public void setBranField013(LocalDate branField013) { this.branField013 = branField013; }

    public String getBranField014() { return branField014; }
    public void setBranField014(String branField014) { this.branField014 = branField014; }

    public LocalDate getBranField015() { return branField015; }
    public void setBranField015(LocalDate branField015) { this.branField015 = branField015; }

    public String getBranField016() { return branField016; }
    public void setBranField016(String branField016) { this.branField016 = branField016; }

    public LocalDate getBranField017() { return branField017; }
    public void setBranField017(LocalDate branField017) { this.branField017 = branField017; }

    public Boolean getBranField018() { return branField018; }
    public void setBranField018(Boolean branField018) { this.branField018 = branField018; }

    @Override
    public String toString() {
        return "BranchDto023{" +
            "branField000=" + branField000 + ", " +
            "branField001=" + branField001 + ", " +
            "branField002=" + branField002 + ", " +
            "branField003=" + branField003 + ", " +
            "branField004=" + branField004 + ", " +
            "}";
    }
}
