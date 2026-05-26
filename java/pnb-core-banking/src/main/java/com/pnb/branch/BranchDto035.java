package com.pnb.branch;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * BranchDto035 — Data Transfer Object for branch operations.
 * Variant 35 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BranchDto035 {

    @JsonProperty("branField000")
    private LocalDate branField000;

    @JsonProperty("branField001")
    private Long branField001;

    @JsonProperty("branField002")
    private Integer branField002;

    @Size(max = 200)
    @JsonProperty("branField003")
    private String branField003;

    @Size(max = 60)
    @JsonProperty("branField004")
    private String branField004;

    @JsonProperty("branField005")
    private LocalDate branField005;

    @JsonProperty("branField006")
    private Double branField006;

    @JsonProperty("branField007")
    private LocalDate branField007;

    @DecimalMin(value = "0.00")
    @JsonProperty("branField008")
    private BigDecimal branField008;

    @JsonProperty("branField009")
    private Boolean branField009;

    @JsonProperty("branField010")
    private LocalDate branField010;

    @Size(max = 60)
    @JsonProperty("branField011")
    private String branField011;

    @JsonProperty("branField012")
    private LocalDate branField012;

    @JsonProperty("branField013")
    private Double branField013;

    @JsonProperty("branField014")
    private Double branField014;

    @JsonProperty("branField015")
    private Integer branField015;

    @Size(max = 200)
    @JsonProperty("branField016")
    private String branField016;

    @JsonProperty("branField017")
    private Boolean branField017;

    @JsonProperty("branField018")
    private Boolean branField018;

    public BranchDto035() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final BranchDto035 instance = new BranchDto035();

        public Builder branField000(LocalDate val) { instance.branField000 = val; return this; }
        public Builder branField001(Long val) { instance.branField001 = val; return this; }
        public Builder branField002(Integer val) { instance.branField002 = val; return this; }
        public Builder branField003(String val) { instance.branField003 = val; return this; }
        public Builder branField004(String val) { instance.branField004 = val; return this; }
        public Builder branField005(LocalDate val) { instance.branField005 = val; return this; }
        public Builder branField006(Double val) { instance.branField006 = val; return this; }
        public Builder branField007(LocalDate val) { instance.branField007 = val; return this; }
        public Builder branField008(BigDecimal val) { instance.branField008 = val; return this; }
        public Builder branField009(Boolean val) { instance.branField009 = val; return this; }
        public Builder branField010(LocalDate val) { instance.branField010 = val; return this; }
        public Builder branField011(String val) { instance.branField011 = val; return this; }
        public Builder branField012(LocalDate val) { instance.branField012 = val; return this; }
        public Builder branField013(Double val) { instance.branField013 = val; return this; }
        public Builder branField014(Double val) { instance.branField014 = val; return this; }
        public Builder branField015(Integer val) { instance.branField015 = val; return this; }
        public Builder branField016(String val) { instance.branField016 = val; return this; }
        public Builder branField017(Boolean val) { instance.branField017 = val; return this; }
        public Builder branField018(Boolean val) { instance.branField018 = val; return this; }
        public BranchDto035 build() { return instance; }
    }

    public LocalDate getBranField000() { return branField000; }
    public void setBranField000(LocalDate branField000) { this.branField000 = branField000; }

    public Long getBranField001() { return branField001; }
    public void setBranField001(Long branField001) { this.branField001 = branField001; }

    public Integer getBranField002() { return branField002; }
    public void setBranField002(Integer branField002) { this.branField002 = branField002; }

    public String getBranField003() { return branField003; }
    public void setBranField003(String branField003) { this.branField003 = branField003; }

    public String getBranField004() { return branField004; }
    public void setBranField004(String branField004) { this.branField004 = branField004; }

    public LocalDate getBranField005() { return branField005; }
    public void setBranField005(LocalDate branField005) { this.branField005 = branField005; }

    public Double getBranField006() { return branField006; }
    public void setBranField006(Double branField006) { this.branField006 = branField006; }

    public LocalDate getBranField007() { return branField007; }
    public void setBranField007(LocalDate branField007) { this.branField007 = branField007; }

    public BigDecimal getBranField008() { return branField008; }
    public void setBranField008(BigDecimal branField008) { this.branField008 = branField008; }

    public Boolean getBranField009() { return branField009; }
    public void setBranField009(Boolean branField009) { this.branField009 = branField009; }

    public LocalDate getBranField010() { return branField010; }
    public void setBranField010(LocalDate branField010) { this.branField010 = branField010; }

    public String getBranField011() { return branField011; }
    public void setBranField011(String branField011) { this.branField011 = branField011; }

    public LocalDate getBranField012() { return branField012; }
    public void setBranField012(LocalDate branField012) { this.branField012 = branField012; }

    public Double getBranField013() { return branField013; }
    public void setBranField013(Double branField013) { this.branField013 = branField013; }

    public Double getBranField014() { return branField014; }
    public void setBranField014(Double branField014) { this.branField014 = branField014; }

    public Integer getBranField015() { return branField015; }
    public void setBranField015(Integer branField015) { this.branField015 = branField015; }

    public String getBranField016() { return branField016; }
    public void setBranField016(String branField016) { this.branField016 = branField016; }

    public Boolean getBranField017() { return branField017; }
    public void setBranField017(Boolean branField017) { this.branField017 = branField017; }

    public Boolean getBranField018() { return branField018; }
    public void setBranField018(Boolean branField018) { this.branField018 = branField018; }

    @Override
    public String toString() {
        return "BranchDto035{" +
            "branField000=" + branField000 + ", " +
            "branField001=" + branField001 + ", " +
            "branField002=" + branField002 + ", " +
            "branField003=" + branField003 + ", " +
            "branField004=" + branField004 + ", " +
            "}";
    }
}
