package com.pnb.branch;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * BranchDto030 — Data Transfer Object for branch operations.
 * Variant 30 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BranchDto030 {

    @Size(max = 40)
    @JsonProperty("branField000")
    private String branField000;

    @JsonProperty("branField001")
    private Double branField001;

    @JsonProperty("branField002")
    private Boolean branField002;

    @JsonProperty("branField003")
    private Long branField003;

    @JsonProperty("branField004")
    private Long branField004;

    @JsonProperty("branField005")
    private Long branField005;

    @Size(max = 20)
    @JsonProperty("branField006")
    private String branField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("branField007")
    private BigDecimal branField007;

    @JsonProperty("branField008")
    private Boolean branField008;

    @DecimalMin(value = "0.00")
    @JsonProperty("branField009")
    private BigDecimal branField009;

    @JsonProperty("branField010")
    private Long branField010;

    @JsonProperty("branField011")
    private LocalDate branField011;

    @JsonProperty("branField012")
    private Double branField012;

    @JsonProperty("branField013")
    private Boolean branField013;

    public BranchDto030() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final BranchDto030 instance = new BranchDto030();

        public Builder branField000(String val) { instance.branField000 = val; return this; }
        public Builder branField001(Double val) { instance.branField001 = val; return this; }
        public Builder branField002(Boolean val) { instance.branField002 = val; return this; }
        public Builder branField003(Long val) { instance.branField003 = val; return this; }
        public Builder branField004(Long val) { instance.branField004 = val; return this; }
        public Builder branField005(Long val) { instance.branField005 = val; return this; }
        public Builder branField006(String val) { instance.branField006 = val; return this; }
        public Builder branField007(BigDecimal val) { instance.branField007 = val; return this; }
        public Builder branField008(Boolean val) { instance.branField008 = val; return this; }
        public Builder branField009(BigDecimal val) { instance.branField009 = val; return this; }
        public Builder branField010(Long val) { instance.branField010 = val; return this; }
        public Builder branField011(LocalDate val) { instance.branField011 = val; return this; }
        public Builder branField012(Double val) { instance.branField012 = val; return this; }
        public Builder branField013(Boolean val) { instance.branField013 = val; return this; }
        public BranchDto030 build() { return instance; }
    }

    public String getBranField000() { return branField000; }
    public void setBranField000(String branField000) { this.branField000 = branField000; }

    public Double getBranField001() { return branField001; }
    public void setBranField001(Double branField001) { this.branField001 = branField001; }

    public Boolean getBranField002() { return branField002; }
    public void setBranField002(Boolean branField002) { this.branField002 = branField002; }

    public Long getBranField003() { return branField003; }
    public void setBranField003(Long branField003) { this.branField003 = branField003; }

    public Long getBranField004() { return branField004; }
    public void setBranField004(Long branField004) { this.branField004 = branField004; }

    public Long getBranField005() { return branField005; }
    public void setBranField005(Long branField005) { this.branField005 = branField005; }

    public String getBranField006() { return branField006; }
    public void setBranField006(String branField006) { this.branField006 = branField006; }

    public BigDecimal getBranField007() { return branField007; }
    public void setBranField007(BigDecimal branField007) { this.branField007 = branField007; }

    public Boolean getBranField008() { return branField008; }
    public void setBranField008(Boolean branField008) { this.branField008 = branField008; }

    public BigDecimal getBranField009() { return branField009; }
    public void setBranField009(BigDecimal branField009) { this.branField009 = branField009; }

    public Long getBranField010() { return branField010; }
    public void setBranField010(Long branField010) { this.branField010 = branField010; }

    public LocalDate getBranField011() { return branField011; }
    public void setBranField011(LocalDate branField011) { this.branField011 = branField011; }

    public Double getBranField012() { return branField012; }
    public void setBranField012(Double branField012) { this.branField012 = branField012; }

    public Boolean getBranField013() { return branField013; }
    public void setBranField013(Boolean branField013) { this.branField013 = branField013; }

    @Override
    public String toString() {
        return "BranchDto030{" +
            "branField000=" + branField000 + ", " +
            "branField001=" + branField001 + ", " +
            "branField002=" + branField002 + ", " +
            "branField003=" + branField003 + ", " +
            "branField004=" + branField004 + ", " +
            "}";
    }
}
