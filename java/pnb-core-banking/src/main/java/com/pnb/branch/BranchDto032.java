package com.pnb.branch;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * BranchDto032 — Data Transfer Object for branch operations.
 * Variant 32 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BranchDto032 {

    @JsonProperty("branField000")
    private LocalDate branField000;

    @JsonProperty("branField001")
    private Integer branField001;

    @Size(max = 20)
    @JsonProperty("branField002")
    private String branField002;

    @JsonProperty("branField003")
    private Long branField003;

    @JsonProperty("branField004")
    private Double branField004;

    @JsonProperty("branField005")
    private Double branField005;

    @JsonProperty("branField006")
    private LocalDate branField006;

    @JsonProperty("branField007")
    private Double branField007;

    @JsonProperty("branField008")
    private Boolean branField008;

    @JsonProperty("branField009")
    private Boolean branField009;

    @JsonProperty("branField010")
    private Double branField010;

    @JsonProperty("branField011")
    private Double branField011;

    @JsonProperty("branField012")
    private Long branField012;

    @DecimalMin(value = "0.00")
    @JsonProperty("branField013")
    private BigDecimal branField013;

    @Size(max = 200)
    @JsonProperty("branField014")
    private String branField014;

    @JsonProperty("branField015")
    private Double branField015;

    public BranchDto032() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final BranchDto032 instance = new BranchDto032();

        public Builder branField000(LocalDate val) { instance.branField000 = val; return this; }
        public Builder branField001(Integer val) { instance.branField001 = val; return this; }
        public Builder branField002(String val) { instance.branField002 = val; return this; }
        public Builder branField003(Long val) { instance.branField003 = val; return this; }
        public Builder branField004(Double val) { instance.branField004 = val; return this; }
        public Builder branField005(Double val) { instance.branField005 = val; return this; }
        public Builder branField006(LocalDate val) { instance.branField006 = val; return this; }
        public Builder branField007(Double val) { instance.branField007 = val; return this; }
        public Builder branField008(Boolean val) { instance.branField008 = val; return this; }
        public Builder branField009(Boolean val) { instance.branField009 = val; return this; }
        public Builder branField010(Double val) { instance.branField010 = val; return this; }
        public Builder branField011(Double val) { instance.branField011 = val; return this; }
        public Builder branField012(Long val) { instance.branField012 = val; return this; }
        public Builder branField013(BigDecimal val) { instance.branField013 = val; return this; }
        public Builder branField014(String val) { instance.branField014 = val; return this; }
        public Builder branField015(Double val) { instance.branField015 = val; return this; }
        public BranchDto032 build() { return instance; }
    }

    public LocalDate getBranField000() { return branField000; }
    public void setBranField000(LocalDate branField000) { this.branField000 = branField000; }

    public Integer getBranField001() { return branField001; }
    public void setBranField001(Integer branField001) { this.branField001 = branField001; }

    public String getBranField002() { return branField002; }
    public void setBranField002(String branField002) { this.branField002 = branField002; }

    public Long getBranField003() { return branField003; }
    public void setBranField003(Long branField003) { this.branField003 = branField003; }

    public Double getBranField004() { return branField004; }
    public void setBranField004(Double branField004) { this.branField004 = branField004; }

    public Double getBranField005() { return branField005; }
    public void setBranField005(Double branField005) { this.branField005 = branField005; }

    public LocalDate getBranField006() { return branField006; }
    public void setBranField006(LocalDate branField006) { this.branField006 = branField006; }

    public Double getBranField007() { return branField007; }
    public void setBranField007(Double branField007) { this.branField007 = branField007; }

    public Boolean getBranField008() { return branField008; }
    public void setBranField008(Boolean branField008) { this.branField008 = branField008; }

    public Boolean getBranField009() { return branField009; }
    public void setBranField009(Boolean branField009) { this.branField009 = branField009; }

    public Double getBranField010() { return branField010; }
    public void setBranField010(Double branField010) { this.branField010 = branField010; }

    public Double getBranField011() { return branField011; }
    public void setBranField011(Double branField011) { this.branField011 = branField011; }

    public Long getBranField012() { return branField012; }
    public void setBranField012(Long branField012) { this.branField012 = branField012; }

    public BigDecimal getBranField013() { return branField013; }
    public void setBranField013(BigDecimal branField013) { this.branField013 = branField013; }

    public String getBranField014() { return branField014; }
    public void setBranField014(String branField014) { this.branField014 = branField014; }

    public Double getBranField015() { return branField015; }
    public void setBranField015(Double branField015) { this.branField015 = branField015; }

    @Override
    public String toString() {
        return "BranchDto032{" +
            "branField000=" + branField000 + ", " +
            "branField001=" + branField001 + ", " +
            "branField002=" + branField002 + ", " +
            "branField003=" + branField003 + ", " +
            "branField004=" + branField004 + ", " +
            "}";
    }
}
