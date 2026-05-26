package com.pnb.branch;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * BranchDto020 — Data Transfer Object for branch operations.
 * Variant 20 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BranchDto020 {

    @JsonProperty("branField000")
    private Long branField000;

    @JsonProperty("branField001")
    private LocalDate branField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("branField002")
    private BigDecimal branField002;

    @JsonProperty("branField003")
    private LocalDate branField003;

    @JsonProperty("branField004")
    private Integer branField004;

    @JsonProperty("branField005")
    private Boolean branField005;

    @JsonProperty("branField006")
    private Boolean branField006;

    @JsonProperty("branField007")
    private Double branField007;

    @JsonProperty("branField008")
    private Long branField008;

    @JsonProperty("branField009")
    private Double branField009;

    @JsonProperty("branField010")
    private LocalDate branField010;

    @JsonProperty("branField011")
    private LocalDate branField011;

    @JsonProperty("branField012")
    private Boolean branField012;

    @JsonProperty("branField013")
    private LocalDate branField013;

    @Size(max = 40)
    @JsonProperty("branField014")
    private String branField014;

    @JsonProperty("branField015")
    private Integer branField015;

    public BranchDto020() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final BranchDto020 instance = new BranchDto020();

        public Builder branField000(Long val) { instance.branField000 = val; return this; }
        public Builder branField001(LocalDate val) { instance.branField001 = val; return this; }
        public Builder branField002(BigDecimal val) { instance.branField002 = val; return this; }
        public Builder branField003(LocalDate val) { instance.branField003 = val; return this; }
        public Builder branField004(Integer val) { instance.branField004 = val; return this; }
        public Builder branField005(Boolean val) { instance.branField005 = val; return this; }
        public Builder branField006(Boolean val) { instance.branField006 = val; return this; }
        public Builder branField007(Double val) { instance.branField007 = val; return this; }
        public Builder branField008(Long val) { instance.branField008 = val; return this; }
        public Builder branField009(Double val) { instance.branField009 = val; return this; }
        public Builder branField010(LocalDate val) { instance.branField010 = val; return this; }
        public Builder branField011(LocalDate val) { instance.branField011 = val; return this; }
        public Builder branField012(Boolean val) { instance.branField012 = val; return this; }
        public Builder branField013(LocalDate val) { instance.branField013 = val; return this; }
        public Builder branField014(String val) { instance.branField014 = val; return this; }
        public Builder branField015(Integer val) { instance.branField015 = val; return this; }
        public BranchDto020 build() { return instance; }
    }

    public Long getBranField000() { return branField000; }
    public void setBranField000(Long branField000) { this.branField000 = branField000; }

    public LocalDate getBranField001() { return branField001; }
    public void setBranField001(LocalDate branField001) { this.branField001 = branField001; }

    public BigDecimal getBranField002() { return branField002; }
    public void setBranField002(BigDecimal branField002) { this.branField002 = branField002; }

    public LocalDate getBranField003() { return branField003; }
    public void setBranField003(LocalDate branField003) { this.branField003 = branField003; }

    public Integer getBranField004() { return branField004; }
    public void setBranField004(Integer branField004) { this.branField004 = branField004; }

    public Boolean getBranField005() { return branField005; }
    public void setBranField005(Boolean branField005) { this.branField005 = branField005; }

    public Boolean getBranField006() { return branField006; }
    public void setBranField006(Boolean branField006) { this.branField006 = branField006; }

    public Double getBranField007() { return branField007; }
    public void setBranField007(Double branField007) { this.branField007 = branField007; }

    public Long getBranField008() { return branField008; }
    public void setBranField008(Long branField008) { this.branField008 = branField008; }

    public Double getBranField009() { return branField009; }
    public void setBranField009(Double branField009) { this.branField009 = branField009; }

    public LocalDate getBranField010() { return branField010; }
    public void setBranField010(LocalDate branField010) { this.branField010 = branField010; }

    public LocalDate getBranField011() { return branField011; }
    public void setBranField011(LocalDate branField011) { this.branField011 = branField011; }

    public Boolean getBranField012() { return branField012; }
    public void setBranField012(Boolean branField012) { this.branField012 = branField012; }

    public LocalDate getBranField013() { return branField013; }
    public void setBranField013(LocalDate branField013) { this.branField013 = branField013; }

    public String getBranField014() { return branField014; }
    public void setBranField014(String branField014) { this.branField014 = branField014; }

    public Integer getBranField015() { return branField015; }
    public void setBranField015(Integer branField015) { this.branField015 = branField015; }

    @Override
    public String toString() {
        return "BranchDto020{" +
            "branField000=" + branField000 + ", " +
            "branField001=" + branField001 + ", " +
            "branField002=" + branField002 + ", " +
            "branField003=" + branField003 + ", " +
            "branField004=" + branField004 + ", " +
            "}";
    }
}
