package com.pnb.branch;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * BranchDto026 — Data Transfer Object for branch operations.
 * Variant 26 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BranchDto026 {

    @JsonProperty("branField000")
    private Double branField000;

    @JsonProperty("branField001")
    private Double branField001;

    @JsonProperty("branField002")
    private Boolean branField002;

    @Size(max = 200)
    @JsonProperty("branField003")
    private String branField003;

    @JsonProperty("branField004")
    private Integer branField004;

    @JsonProperty("branField005")
    private Boolean branField005;

    @JsonProperty("branField006")
    private LocalDate branField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("branField007")
    private BigDecimal branField007;

    @JsonProperty("branField008")
    private LocalDate branField008;

    @JsonProperty("branField009")
    private Double branField009;

    public BranchDto026() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final BranchDto026 instance = new BranchDto026();

        public Builder branField000(Double val) { instance.branField000 = val; return this; }
        public Builder branField001(Double val) { instance.branField001 = val; return this; }
        public Builder branField002(Boolean val) { instance.branField002 = val; return this; }
        public Builder branField003(String val) { instance.branField003 = val; return this; }
        public Builder branField004(Integer val) { instance.branField004 = val; return this; }
        public Builder branField005(Boolean val) { instance.branField005 = val; return this; }
        public Builder branField006(LocalDate val) { instance.branField006 = val; return this; }
        public Builder branField007(BigDecimal val) { instance.branField007 = val; return this; }
        public Builder branField008(LocalDate val) { instance.branField008 = val; return this; }
        public Builder branField009(Double val) { instance.branField009 = val; return this; }
        public BranchDto026 build() { return instance; }
    }

    public Double getBranField000() { return branField000; }
    public void setBranField000(Double branField000) { this.branField000 = branField000; }

    public Double getBranField001() { return branField001; }
    public void setBranField001(Double branField001) { this.branField001 = branField001; }

    public Boolean getBranField002() { return branField002; }
    public void setBranField002(Boolean branField002) { this.branField002 = branField002; }

    public String getBranField003() { return branField003; }
    public void setBranField003(String branField003) { this.branField003 = branField003; }

    public Integer getBranField004() { return branField004; }
    public void setBranField004(Integer branField004) { this.branField004 = branField004; }

    public Boolean getBranField005() { return branField005; }
    public void setBranField005(Boolean branField005) { this.branField005 = branField005; }

    public LocalDate getBranField006() { return branField006; }
    public void setBranField006(LocalDate branField006) { this.branField006 = branField006; }

    public BigDecimal getBranField007() { return branField007; }
    public void setBranField007(BigDecimal branField007) { this.branField007 = branField007; }

    public LocalDate getBranField008() { return branField008; }
    public void setBranField008(LocalDate branField008) { this.branField008 = branField008; }

    public Double getBranField009() { return branField009; }
    public void setBranField009(Double branField009) { this.branField009 = branField009; }

    @Override
    public String toString() {
        return "BranchDto026{" +
            "branField000=" + branField000 + ", " +
            "branField001=" + branField001 + ", " +
            "branField002=" + branField002 + ", " +
            "branField003=" + branField003 + ", " +
            "branField004=" + branField004 + ", " +
            "}";
    }
}
