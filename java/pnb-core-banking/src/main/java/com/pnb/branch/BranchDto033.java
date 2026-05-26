package com.pnb.branch;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * BranchDto033 — Data Transfer Object for branch operations.
 * Variant 33 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BranchDto033 {

    @JsonProperty("branField000")
    private Boolean branField000;

    @JsonProperty("branField001")
    private Integer branField001;

    @JsonProperty("branField002")
    private Long branField002;

    @JsonProperty("branField003")
    private Boolean branField003;

    @JsonProperty("branField004")
    private LocalDate branField004;

    @JsonProperty("branField005")
    private LocalDate branField005;

    @JsonProperty("branField006")
    private Double branField006;

    @JsonProperty("branField007")
    private Integer branField007;

    @JsonProperty("branField008")
    private LocalDate branField008;

    @JsonProperty("branField009")
    private Double branField009;

    @JsonProperty("branField010")
    private Double branField010;

    @JsonProperty("branField011")
    private Double branField011;

    @JsonProperty("branField012")
    private LocalDate branField012;

    @JsonProperty("branField013")
    private Long branField013;

    @JsonProperty("branField014")
    private Long branField014;

    @JsonProperty("branField015")
    private Boolean branField015;

    @DecimalMin(value = "0.00")
    @JsonProperty("branField016")
    private BigDecimal branField016;

    public BranchDto033() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final BranchDto033 instance = new BranchDto033();

        public Builder branField000(Boolean val) { instance.branField000 = val; return this; }
        public Builder branField001(Integer val) { instance.branField001 = val; return this; }
        public Builder branField002(Long val) { instance.branField002 = val; return this; }
        public Builder branField003(Boolean val) { instance.branField003 = val; return this; }
        public Builder branField004(LocalDate val) { instance.branField004 = val; return this; }
        public Builder branField005(LocalDate val) { instance.branField005 = val; return this; }
        public Builder branField006(Double val) { instance.branField006 = val; return this; }
        public Builder branField007(Integer val) { instance.branField007 = val; return this; }
        public Builder branField008(LocalDate val) { instance.branField008 = val; return this; }
        public Builder branField009(Double val) { instance.branField009 = val; return this; }
        public Builder branField010(Double val) { instance.branField010 = val; return this; }
        public Builder branField011(Double val) { instance.branField011 = val; return this; }
        public Builder branField012(LocalDate val) { instance.branField012 = val; return this; }
        public Builder branField013(Long val) { instance.branField013 = val; return this; }
        public Builder branField014(Long val) { instance.branField014 = val; return this; }
        public Builder branField015(Boolean val) { instance.branField015 = val; return this; }
        public Builder branField016(BigDecimal val) { instance.branField016 = val; return this; }
        public BranchDto033 build() { return instance; }
    }

    public Boolean getBranField000() { return branField000; }
    public void setBranField000(Boolean branField000) { this.branField000 = branField000; }

    public Integer getBranField001() { return branField001; }
    public void setBranField001(Integer branField001) { this.branField001 = branField001; }

    public Long getBranField002() { return branField002; }
    public void setBranField002(Long branField002) { this.branField002 = branField002; }

    public Boolean getBranField003() { return branField003; }
    public void setBranField003(Boolean branField003) { this.branField003 = branField003; }

    public LocalDate getBranField004() { return branField004; }
    public void setBranField004(LocalDate branField004) { this.branField004 = branField004; }

    public LocalDate getBranField005() { return branField005; }
    public void setBranField005(LocalDate branField005) { this.branField005 = branField005; }

    public Double getBranField006() { return branField006; }
    public void setBranField006(Double branField006) { this.branField006 = branField006; }

    public Integer getBranField007() { return branField007; }
    public void setBranField007(Integer branField007) { this.branField007 = branField007; }

    public LocalDate getBranField008() { return branField008; }
    public void setBranField008(LocalDate branField008) { this.branField008 = branField008; }

    public Double getBranField009() { return branField009; }
    public void setBranField009(Double branField009) { this.branField009 = branField009; }

    public Double getBranField010() { return branField010; }
    public void setBranField010(Double branField010) { this.branField010 = branField010; }

    public Double getBranField011() { return branField011; }
    public void setBranField011(Double branField011) { this.branField011 = branField011; }

    public LocalDate getBranField012() { return branField012; }
    public void setBranField012(LocalDate branField012) { this.branField012 = branField012; }

    public Long getBranField013() { return branField013; }
    public void setBranField013(Long branField013) { this.branField013 = branField013; }

    public Long getBranField014() { return branField014; }
    public void setBranField014(Long branField014) { this.branField014 = branField014; }

    public Boolean getBranField015() { return branField015; }
    public void setBranField015(Boolean branField015) { this.branField015 = branField015; }

    public BigDecimal getBranField016() { return branField016; }
    public void setBranField016(BigDecimal branField016) { this.branField016 = branField016; }

    @Override
    public String toString() {
        return "BranchDto033{" +
            "branField000=" + branField000 + ", " +
            "branField001=" + branField001 + ", " +
            "branField002=" + branField002 + ", " +
            "branField003=" + branField003 + ", " +
            "branField004=" + branField004 + ", " +
            "}";
    }
}
