package com.pnb.branch;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * BranchDto043 — Data Transfer Object for branch operations.
 * Variant 43 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BranchDto043 {

    @JsonProperty("branField000")
    private Integer branField000;

    @DecimalMin(value = "0.00")
    @JsonProperty("branField001")
    private BigDecimal branField001;

    @JsonProperty("branField002")
    private LocalDate branField002;

    @JsonProperty("branField003")
    private Boolean branField003;

    @Size(max = 40)
    @JsonProperty("branField004")
    private String branField004;

    @JsonProperty("branField005")
    private Double branField005;

    @JsonProperty("branField006")
    private Boolean branField006;

    @JsonProperty("branField007")
    private LocalDate branField007;

    @JsonProperty("branField008")
    private LocalDate branField008;

    @JsonProperty("branField009")
    private Boolean branField009;

    @JsonProperty("branField010")
    private Integer branField010;

    @JsonProperty("branField011")
    private Boolean branField011;

    @JsonProperty("branField012")
    private Integer branField012;

    @JsonProperty("branField013")
    private Integer branField013;

    @JsonProperty("branField014")
    private LocalDate branField014;

    public BranchDto043() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final BranchDto043 instance = new BranchDto043();

        public Builder branField000(Integer val) { instance.branField000 = val; return this; }
        public Builder branField001(BigDecimal val) { instance.branField001 = val; return this; }
        public Builder branField002(LocalDate val) { instance.branField002 = val; return this; }
        public Builder branField003(Boolean val) { instance.branField003 = val; return this; }
        public Builder branField004(String val) { instance.branField004 = val; return this; }
        public Builder branField005(Double val) { instance.branField005 = val; return this; }
        public Builder branField006(Boolean val) { instance.branField006 = val; return this; }
        public Builder branField007(LocalDate val) { instance.branField007 = val; return this; }
        public Builder branField008(LocalDate val) { instance.branField008 = val; return this; }
        public Builder branField009(Boolean val) { instance.branField009 = val; return this; }
        public Builder branField010(Integer val) { instance.branField010 = val; return this; }
        public Builder branField011(Boolean val) { instance.branField011 = val; return this; }
        public Builder branField012(Integer val) { instance.branField012 = val; return this; }
        public Builder branField013(Integer val) { instance.branField013 = val; return this; }
        public Builder branField014(LocalDate val) { instance.branField014 = val; return this; }
        public BranchDto043 build() { return instance; }
    }

    public Integer getBranField000() { return branField000; }
    public void setBranField000(Integer branField000) { this.branField000 = branField000; }

    public BigDecimal getBranField001() { return branField001; }
    public void setBranField001(BigDecimal branField001) { this.branField001 = branField001; }

    public LocalDate getBranField002() { return branField002; }
    public void setBranField002(LocalDate branField002) { this.branField002 = branField002; }

    public Boolean getBranField003() { return branField003; }
    public void setBranField003(Boolean branField003) { this.branField003 = branField003; }

    public String getBranField004() { return branField004; }
    public void setBranField004(String branField004) { this.branField004 = branField004; }

    public Double getBranField005() { return branField005; }
    public void setBranField005(Double branField005) { this.branField005 = branField005; }

    public Boolean getBranField006() { return branField006; }
    public void setBranField006(Boolean branField006) { this.branField006 = branField006; }

    public LocalDate getBranField007() { return branField007; }
    public void setBranField007(LocalDate branField007) { this.branField007 = branField007; }

    public LocalDate getBranField008() { return branField008; }
    public void setBranField008(LocalDate branField008) { this.branField008 = branField008; }

    public Boolean getBranField009() { return branField009; }
    public void setBranField009(Boolean branField009) { this.branField009 = branField009; }

    public Integer getBranField010() { return branField010; }
    public void setBranField010(Integer branField010) { this.branField010 = branField010; }

    public Boolean getBranField011() { return branField011; }
    public void setBranField011(Boolean branField011) { this.branField011 = branField011; }

    public Integer getBranField012() { return branField012; }
    public void setBranField012(Integer branField012) { this.branField012 = branField012; }

    public Integer getBranField013() { return branField013; }
    public void setBranField013(Integer branField013) { this.branField013 = branField013; }

    public LocalDate getBranField014() { return branField014; }
    public void setBranField014(LocalDate branField014) { this.branField014 = branField014; }

    @Override
    public String toString() {
        return "BranchDto043{" +
            "branField000=" + branField000 + ", " +
            "branField001=" + branField001 + ", " +
            "branField002=" + branField002 + ", " +
            "branField003=" + branField003 + ", " +
            "branField004=" + branField004 + ", " +
            "}";
    }
}
