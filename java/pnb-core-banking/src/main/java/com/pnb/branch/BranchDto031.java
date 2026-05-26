package com.pnb.branch;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * BranchDto031 — Data Transfer Object for branch operations.
 * Variant 31 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BranchDto031 {

    @JsonProperty("branField000")
    private Integer branField000;

    @DecimalMin(value = "0.00")
    @JsonProperty("branField001")
    private BigDecimal branField001;

    @Size(max = 60)
    @JsonProperty("branField002")
    private String branField002;

    @JsonProperty("branField003")
    private Long branField003;

    @JsonProperty("branField004")
    private Integer branField004;

    @Size(max = 100)
    @JsonProperty("branField005")
    private String branField005;

    @JsonProperty("branField006")
    private LocalDate branField006;

    @Size(max = 60)
    @JsonProperty("branField007")
    private String branField007;

    @Size(max = 40)
    @JsonProperty("branField008")
    private String branField008;

    @DecimalMin(value = "0.00")
    @JsonProperty("branField009")
    private BigDecimal branField009;

    @DecimalMin(value = "0.00")
    @JsonProperty("branField010")
    private BigDecimal branField010;

    @JsonProperty("branField011")
    private Long branField011;

    @JsonProperty("branField012")
    private Boolean branField012;

    @JsonProperty("branField013")
    private Double branField013;

    @JsonProperty("branField014")
    private Double branField014;

    public BranchDto031() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final BranchDto031 instance = new BranchDto031();

        public Builder branField000(Integer val) { instance.branField000 = val; return this; }
        public Builder branField001(BigDecimal val) { instance.branField001 = val; return this; }
        public Builder branField002(String val) { instance.branField002 = val; return this; }
        public Builder branField003(Long val) { instance.branField003 = val; return this; }
        public Builder branField004(Integer val) { instance.branField004 = val; return this; }
        public Builder branField005(String val) { instance.branField005 = val; return this; }
        public Builder branField006(LocalDate val) { instance.branField006 = val; return this; }
        public Builder branField007(String val) { instance.branField007 = val; return this; }
        public Builder branField008(String val) { instance.branField008 = val; return this; }
        public Builder branField009(BigDecimal val) { instance.branField009 = val; return this; }
        public Builder branField010(BigDecimal val) { instance.branField010 = val; return this; }
        public Builder branField011(Long val) { instance.branField011 = val; return this; }
        public Builder branField012(Boolean val) { instance.branField012 = val; return this; }
        public Builder branField013(Double val) { instance.branField013 = val; return this; }
        public Builder branField014(Double val) { instance.branField014 = val; return this; }
        public BranchDto031 build() { return instance; }
    }

    public Integer getBranField000() { return branField000; }
    public void setBranField000(Integer branField000) { this.branField000 = branField000; }

    public BigDecimal getBranField001() { return branField001; }
    public void setBranField001(BigDecimal branField001) { this.branField001 = branField001; }

    public String getBranField002() { return branField002; }
    public void setBranField002(String branField002) { this.branField002 = branField002; }

    public Long getBranField003() { return branField003; }
    public void setBranField003(Long branField003) { this.branField003 = branField003; }

    public Integer getBranField004() { return branField004; }
    public void setBranField004(Integer branField004) { this.branField004 = branField004; }

    public String getBranField005() { return branField005; }
    public void setBranField005(String branField005) { this.branField005 = branField005; }

    public LocalDate getBranField006() { return branField006; }
    public void setBranField006(LocalDate branField006) { this.branField006 = branField006; }

    public String getBranField007() { return branField007; }
    public void setBranField007(String branField007) { this.branField007 = branField007; }

    public String getBranField008() { return branField008; }
    public void setBranField008(String branField008) { this.branField008 = branField008; }

    public BigDecimal getBranField009() { return branField009; }
    public void setBranField009(BigDecimal branField009) { this.branField009 = branField009; }

    public BigDecimal getBranField010() { return branField010; }
    public void setBranField010(BigDecimal branField010) { this.branField010 = branField010; }

    public Long getBranField011() { return branField011; }
    public void setBranField011(Long branField011) { this.branField011 = branField011; }

    public Boolean getBranField012() { return branField012; }
    public void setBranField012(Boolean branField012) { this.branField012 = branField012; }

    public Double getBranField013() { return branField013; }
    public void setBranField013(Double branField013) { this.branField013 = branField013; }

    public Double getBranField014() { return branField014; }
    public void setBranField014(Double branField014) { this.branField014 = branField014; }

    @Override
    public String toString() {
        return "BranchDto031{" +
            "branField000=" + branField000 + ", " +
            "branField001=" + branField001 + ", " +
            "branField002=" + branField002 + ", " +
            "branField003=" + branField003 + ", " +
            "branField004=" + branField004 + ", " +
            "}";
    }
}
