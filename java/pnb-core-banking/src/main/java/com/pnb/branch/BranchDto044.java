package com.pnb.branch;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * BranchDto044 — Data Transfer Object for branch operations.
 * Variant 44 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BranchDto044 {

    @JsonProperty("branField000")
    private Boolean branField000;

    @JsonProperty("branField001")
    private Double branField001;

    @Size(max = 20)
    @JsonProperty("branField002")
    private String branField002;

    @DecimalMin(value = "0.00")
    @JsonProperty("branField003")
    private BigDecimal branField003;

    @DecimalMin(value = "0.00")
    @JsonProperty("branField004")
    private BigDecimal branField004;

    @Size(max = 60)
    @JsonProperty("branField005")
    private String branField005;

    @JsonProperty("branField006")
    private LocalDate branField006;

    @JsonProperty("branField007")
    private Double branField007;

    @JsonProperty("branField008")
    private Boolean branField008;

    @Size(max = 60)
    @JsonProperty("branField009")
    private String branField009;

    @DecimalMin(value = "0.00")
    @JsonProperty("branField010")
    private BigDecimal branField010;

    @JsonProperty("branField011")
    private Integer branField011;

    @JsonProperty("branField012")
    private LocalDate branField012;

    @JsonProperty("branField013")
    private Double branField013;

    @JsonProperty("branField014")
    private LocalDate branField014;

    @JsonProperty("branField015")
    private Double branField015;

    public BranchDto044() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final BranchDto044 instance = new BranchDto044();

        public Builder branField000(Boolean val) { instance.branField000 = val; return this; }
        public Builder branField001(Double val) { instance.branField001 = val; return this; }
        public Builder branField002(String val) { instance.branField002 = val; return this; }
        public Builder branField003(BigDecimal val) { instance.branField003 = val; return this; }
        public Builder branField004(BigDecimal val) { instance.branField004 = val; return this; }
        public Builder branField005(String val) { instance.branField005 = val; return this; }
        public Builder branField006(LocalDate val) { instance.branField006 = val; return this; }
        public Builder branField007(Double val) { instance.branField007 = val; return this; }
        public Builder branField008(Boolean val) { instance.branField008 = val; return this; }
        public Builder branField009(String val) { instance.branField009 = val; return this; }
        public Builder branField010(BigDecimal val) { instance.branField010 = val; return this; }
        public Builder branField011(Integer val) { instance.branField011 = val; return this; }
        public Builder branField012(LocalDate val) { instance.branField012 = val; return this; }
        public Builder branField013(Double val) { instance.branField013 = val; return this; }
        public Builder branField014(LocalDate val) { instance.branField014 = val; return this; }
        public Builder branField015(Double val) { instance.branField015 = val; return this; }
        public BranchDto044 build() { return instance; }
    }

    public Boolean getBranField000() { return branField000; }
    public void setBranField000(Boolean branField000) { this.branField000 = branField000; }

    public Double getBranField001() { return branField001; }
    public void setBranField001(Double branField001) { this.branField001 = branField001; }

    public String getBranField002() { return branField002; }
    public void setBranField002(String branField002) { this.branField002 = branField002; }

    public BigDecimal getBranField003() { return branField003; }
    public void setBranField003(BigDecimal branField003) { this.branField003 = branField003; }

    public BigDecimal getBranField004() { return branField004; }
    public void setBranField004(BigDecimal branField004) { this.branField004 = branField004; }

    public String getBranField005() { return branField005; }
    public void setBranField005(String branField005) { this.branField005 = branField005; }

    public LocalDate getBranField006() { return branField006; }
    public void setBranField006(LocalDate branField006) { this.branField006 = branField006; }

    public Double getBranField007() { return branField007; }
    public void setBranField007(Double branField007) { this.branField007 = branField007; }

    public Boolean getBranField008() { return branField008; }
    public void setBranField008(Boolean branField008) { this.branField008 = branField008; }

    public String getBranField009() { return branField009; }
    public void setBranField009(String branField009) { this.branField009 = branField009; }

    public BigDecimal getBranField010() { return branField010; }
    public void setBranField010(BigDecimal branField010) { this.branField010 = branField010; }

    public Integer getBranField011() { return branField011; }
    public void setBranField011(Integer branField011) { this.branField011 = branField011; }

    public LocalDate getBranField012() { return branField012; }
    public void setBranField012(LocalDate branField012) { this.branField012 = branField012; }

    public Double getBranField013() { return branField013; }
    public void setBranField013(Double branField013) { this.branField013 = branField013; }

    public LocalDate getBranField014() { return branField014; }
    public void setBranField014(LocalDate branField014) { this.branField014 = branField014; }

    public Double getBranField015() { return branField015; }
    public void setBranField015(Double branField015) { this.branField015 = branField015; }

    @Override
    public String toString() {
        return "BranchDto044{" +
            "branField000=" + branField000 + ", " +
            "branField001=" + branField001 + ", " +
            "branField002=" + branField002 + ", " +
            "branField003=" + branField003 + ", " +
            "branField004=" + branField004 + ", " +
            "}";
    }
}
