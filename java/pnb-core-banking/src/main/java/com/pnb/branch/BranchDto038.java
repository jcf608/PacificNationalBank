package com.pnb.branch;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * BranchDto038 — Data Transfer Object for branch operations.
 * Variant 38 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BranchDto038 {

    @DecimalMin(value = "0.00")
    @JsonProperty("branField000")
    private BigDecimal branField000;

    @JsonProperty("branField001")
    private Double branField001;

    @JsonProperty("branField002")
    private LocalDate branField002;

    @JsonProperty("branField003")
    private Double branField003;

    @JsonProperty("branField004")
    private Boolean branField004;

    @JsonProperty("branField005")
    private Long branField005;

    @JsonProperty("branField006")
    private LocalDate branField006;

    @Size(max = 100)
    @JsonProperty("branField007")
    private String branField007;

    @JsonProperty("branField008")
    private LocalDate branField008;

    @JsonProperty("branField009")
    private Integer branField009;

    public BranchDto038() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final BranchDto038 instance = new BranchDto038();

        public Builder branField000(BigDecimal val) { instance.branField000 = val; return this; }
        public Builder branField001(Double val) { instance.branField001 = val; return this; }
        public Builder branField002(LocalDate val) { instance.branField002 = val; return this; }
        public Builder branField003(Double val) { instance.branField003 = val; return this; }
        public Builder branField004(Boolean val) { instance.branField004 = val; return this; }
        public Builder branField005(Long val) { instance.branField005 = val; return this; }
        public Builder branField006(LocalDate val) { instance.branField006 = val; return this; }
        public Builder branField007(String val) { instance.branField007 = val; return this; }
        public Builder branField008(LocalDate val) { instance.branField008 = val; return this; }
        public Builder branField009(Integer val) { instance.branField009 = val; return this; }
        public BranchDto038 build() { return instance; }
    }

    public BigDecimal getBranField000() { return branField000; }
    public void setBranField000(BigDecimal branField000) { this.branField000 = branField000; }

    public Double getBranField001() { return branField001; }
    public void setBranField001(Double branField001) { this.branField001 = branField001; }

    public LocalDate getBranField002() { return branField002; }
    public void setBranField002(LocalDate branField002) { this.branField002 = branField002; }

    public Double getBranField003() { return branField003; }
    public void setBranField003(Double branField003) { this.branField003 = branField003; }

    public Boolean getBranField004() { return branField004; }
    public void setBranField004(Boolean branField004) { this.branField004 = branField004; }

    public Long getBranField005() { return branField005; }
    public void setBranField005(Long branField005) { this.branField005 = branField005; }

    public LocalDate getBranField006() { return branField006; }
    public void setBranField006(LocalDate branField006) { this.branField006 = branField006; }

    public String getBranField007() { return branField007; }
    public void setBranField007(String branField007) { this.branField007 = branField007; }

    public LocalDate getBranField008() { return branField008; }
    public void setBranField008(LocalDate branField008) { this.branField008 = branField008; }

    public Integer getBranField009() { return branField009; }
    public void setBranField009(Integer branField009) { this.branField009 = branField009; }

    @Override
    public String toString() {
        return "BranchDto038{" +
            "branField000=" + branField000 + ", " +
            "branField001=" + branField001 + ", " +
            "branField002=" + branField002 + ", " +
            "branField003=" + branField003 + ", " +
            "branField004=" + branField004 + ", " +
            "}";
    }
}
