package com.pnb.branch;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * BranchDto052 — Data Transfer Object for branch operations.
 * Variant 52 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BranchDto052 {

    @JsonProperty("branField000")
    private LocalDate branField000;

    @JsonProperty("branField001")
    private Double branField001;

    @JsonProperty("branField002")
    private LocalDate branField002;

    @DecimalMin(value = "0.00")
    @JsonProperty("branField003")
    private BigDecimal branField003;

    @JsonProperty("branField004")
    private Long branField004;

    @JsonProperty("branField005")
    private Double branField005;

    @Size(max = 40)
    @JsonProperty("branField006")
    private String branField006;

    @JsonProperty("branField007")
    private Double branField007;

    @JsonProperty("branField008")
    private Boolean branField008;

    @JsonProperty("branField009")
    private LocalDate branField009;

    @JsonProperty("branField010")
    private LocalDate branField010;

    @JsonProperty("branField011")
    private LocalDate branField011;

    public BranchDto052() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final BranchDto052 instance = new BranchDto052();

        public Builder branField000(LocalDate val) { instance.branField000 = val; return this; }
        public Builder branField001(Double val) { instance.branField001 = val; return this; }
        public Builder branField002(LocalDate val) { instance.branField002 = val; return this; }
        public Builder branField003(BigDecimal val) { instance.branField003 = val; return this; }
        public Builder branField004(Long val) { instance.branField004 = val; return this; }
        public Builder branField005(Double val) { instance.branField005 = val; return this; }
        public Builder branField006(String val) { instance.branField006 = val; return this; }
        public Builder branField007(Double val) { instance.branField007 = val; return this; }
        public Builder branField008(Boolean val) { instance.branField008 = val; return this; }
        public Builder branField009(LocalDate val) { instance.branField009 = val; return this; }
        public Builder branField010(LocalDate val) { instance.branField010 = val; return this; }
        public Builder branField011(LocalDate val) { instance.branField011 = val; return this; }
        public BranchDto052 build() { return instance; }
    }

    public LocalDate getBranField000() { return branField000; }
    public void setBranField000(LocalDate branField000) { this.branField000 = branField000; }

    public Double getBranField001() { return branField001; }
    public void setBranField001(Double branField001) { this.branField001 = branField001; }

    public LocalDate getBranField002() { return branField002; }
    public void setBranField002(LocalDate branField002) { this.branField002 = branField002; }

    public BigDecimal getBranField003() { return branField003; }
    public void setBranField003(BigDecimal branField003) { this.branField003 = branField003; }

    public Long getBranField004() { return branField004; }
    public void setBranField004(Long branField004) { this.branField004 = branField004; }

    public Double getBranField005() { return branField005; }
    public void setBranField005(Double branField005) { this.branField005 = branField005; }

    public String getBranField006() { return branField006; }
    public void setBranField006(String branField006) { this.branField006 = branField006; }

    public Double getBranField007() { return branField007; }
    public void setBranField007(Double branField007) { this.branField007 = branField007; }

    public Boolean getBranField008() { return branField008; }
    public void setBranField008(Boolean branField008) { this.branField008 = branField008; }

    public LocalDate getBranField009() { return branField009; }
    public void setBranField009(LocalDate branField009) { this.branField009 = branField009; }

    public LocalDate getBranField010() { return branField010; }
    public void setBranField010(LocalDate branField010) { this.branField010 = branField010; }

    public LocalDate getBranField011() { return branField011; }
    public void setBranField011(LocalDate branField011) { this.branField011 = branField011; }

    @Override
    public String toString() {
        return "BranchDto052{" +
            "branField000=" + branField000 + ", " +
            "branField001=" + branField001 + ", " +
            "branField002=" + branField002 + ", " +
            "branField003=" + branField003 + ", " +
            "branField004=" + branField004 + ", " +
            "}";
    }
}
