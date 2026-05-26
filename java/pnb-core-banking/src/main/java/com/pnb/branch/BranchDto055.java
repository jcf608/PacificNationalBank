package com.pnb.branch;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * BranchDto055 — Data Transfer Object for branch operations.
 * Variant 55 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BranchDto055 {

    @DecimalMin(value = "0.00")
    @JsonProperty("branField000")
    private BigDecimal branField000;

    @JsonProperty("branField001")
    private Boolean branField001;

    @JsonProperty("branField002")
    private Double branField002;

    @DecimalMin(value = "0.00")
    @JsonProperty("branField003")
    private BigDecimal branField003;

    @JsonProperty("branField004")
    private Boolean branField004;

    @JsonProperty("branField005")
    private Long branField005;

    @JsonProperty("branField006")
    private LocalDate branField006;

    @JsonProperty("branField007")
    private Boolean branField007;

    @JsonProperty("branField008")
    private Integer branField008;

    @JsonProperty("branField009")
    private LocalDate branField009;

    @JsonProperty("branField010")
    private Long branField010;

    @JsonProperty("branField011")
    private Boolean branField011;

    @JsonProperty("branField012")
    private Long branField012;

    @JsonProperty("branField013")
    private LocalDate branField013;

    @JsonProperty("branField014")
    private Boolean branField014;

    public BranchDto055() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final BranchDto055 instance = new BranchDto055();

        public Builder branField000(BigDecimal val) { instance.branField000 = val; return this; }
        public Builder branField001(Boolean val) { instance.branField001 = val; return this; }
        public Builder branField002(Double val) { instance.branField002 = val; return this; }
        public Builder branField003(BigDecimal val) { instance.branField003 = val; return this; }
        public Builder branField004(Boolean val) { instance.branField004 = val; return this; }
        public Builder branField005(Long val) { instance.branField005 = val; return this; }
        public Builder branField006(LocalDate val) { instance.branField006 = val; return this; }
        public Builder branField007(Boolean val) { instance.branField007 = val; return this; }
        public Builder branField008(Integer val) { instance.branField008 = val; return this; }
        public Builder branField009(LocalDate val) { instance.branField009 = val; return this; }
        public Builder branField010(Long val) { instance.branField010 = val; return this; }
        public Builder branField011(Boolean val) { instance.branField011 = val; return this; }
        public Builder branField012(Long val) { instance.branField012 = val; return this; }
        public Builder branField013(LocalDate val) { instance.branField013 = val; return this; }
        public Builder branField014(Boolean val) { instance.branField014 = val; return this; }
        public BranchDto055 build() { return instance; }
    }

    public BigDecimal getBranField000() { return branField000; }
    public void setBranField000(BigDecimal branField000) { this.branField000 = branField000; }

    public Boolean getBranField001() { return branField001; }
    public void setBranField001(Boolean branField001) { this.branField001 = branField001; }

    public Double getBranField002() { return branField002; }
    public void setBranField002(Double branField002) { this.branField002 = branField002; }

    public BigDecimal getBranField003() { return branField003; }
    public void setBranField003(BigDecimal branField003) { this.branField003 = branField003; }

    public Boolean getBranField004() { return branField004; }
    public void setBranField004(Boolean branField004) { this.branField004 = branField004; }

    public Long getBranField005() { return branField005; }
    public void setBranField005(Long branField005) { this.branField005 = branField005; }

    public LocalDate getBranField006() { return branField006; }
    public void setBranField006(LocalDate branField006) { this.branField006 = branField006; }

    public Boolean getBranField007() { return branField007; }
    public void setBranField007(Boolean branField007) { this.branField007 = branField007; }

    public Integer getBranField008() { return branField008; }
    public void setBranField008(Integer branField008) { this.branField008 = branField008; }

    public LocalDate getBranField009() { return branField009; }
    public void setBranField009(LocalDate branField009) { this.branField009 = branField009; }

    public Long getBranField010() { return branField010; }
    public void setBranField010(Long branField010) { this.branField010 = branField010; }

    public Boolean getBranField011() { return branField011; }
    public void setBranField011(Boolean branField011) { this.branField011 = branField011; }

    public Long getBranField012() { return branField012; }
    public void setBranField012(Long branField012) { this.branField012 = branField012; }

    public LocalDate getBranField013() { return branField013; }
    public void setBranField013(LocalDate branField013) { this.branField013 = branField013; }

    public Boolean getBranField014() { return branField014; }
    public void setBranField014(Boolean branField014) { this.branField014 = branField014; }

    @Override
    public String toString() {
        return "BranchDto055{" +
            "branField000=" + branField000 + ", " +
            "branField001=" + branField001 + ", " +
            "branField002=" + branField002 + ", " +
            "branField003=" + branField003 + ", " +
            "branField004=" + branField004 + ", " +
            "}";
    }
}
