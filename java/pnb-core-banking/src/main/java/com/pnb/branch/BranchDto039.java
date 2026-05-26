package com.pnb.branch;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * BranchDto039 — Data Transfer Object for branch operations.
 * Variant 39 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BranchDto039 {

    @JsonProperty("branField000")
    private LocalDate branField000;

    @JsonProperty("branField001")
    private Long branField001;

    @JsonProperty("branField002")
    private Boolean branField002;

    @JsonProperty("branField003")
    private Integer branField003;

    @JsonProperty("branField004")
    private Integer branField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("branField005")
    private BigDecimal branField005;

    @JsonProperty("branField006")
    private Long branField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("branField007")
    private BigDecimal branField007;

    @JsonProperty("branField008")
    private Boolean branField008;

    @JsonProperty("branField009")
    private Boolean branField009;

    @JsonProperty("branField010")
    private Integer branField010;

    public BranchDto039() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final BranchDto039 instance = new BranchDto039();

        public Builder branField000(LocalDate val) { instance.branField000 = val; return this; }
        public Builder branField001(Long val) { instance.branField001 = val; return this; }
        public Builder branField002(Boolean val) { instance.branField002 = val; return this; }
        public Builder branField003(Integer val) { instance.branField003 = val; return this; }
        public Builder branField004(Integer val) { instance.branField004 = val; return this; }
        public Builder branField005(BigDecimal val) { instance.branField005 = val; return this; }
        public Builder branField006(Long val) { instance.branField006 = val; return this; }
        public Builder branField007(BigDecimal val) { instance.branField007 = val; return this; }
        public Builder branField008(Boolean val) { instance.branField008 = val; return this; }
        public Builder branField009(Boolean val) { instance.branField009 = val; return this; }
        public Builder branField010(Integer val) { instance.branField010 = val; return this; }
        public BranchDto039 build() { return instance; }
    }

    public LocalDate getBranField000() { return branField000; }
    public void setBranField000(LocalDate branField000) { this.branField000 = branField000; }

    public Long getBranField001() { return branField001; }
    public void setBranField001(Long branField001) { this.branField001 = branField001; }

    public Boolean getBranField002() { return branField002; }
    public void setBranField002(Boolean branField002) { this.branField002 = branField002; }

    public Integer getBranField003() { return branField003; }
    public void setBranField003(Integer branField003) { this.branField003 = branField003; }

    public Integer getBranField004() { return branField004; }
    public void setBranField004(Integer branField004) { this.branField004 = branField004; }

    public BigDecimal getBranField005() { return branField005; }
    public void setBranField005(BigDecimal branField005) { this.branField005 = branField005; }

    public Long getBranField006() { return branField006; }
    public void setBranField006(Long branField006) { this.branField006 = branField006; }

    public BigDecimal getBranField007() { return branField007; }
    public void setBranField007(BigDecimal branField007) { this.branField007 = branField007; }

    public Boolean getBranField008() { return branField008; }
    public void setBranField008(Boolean branField008) { this.branField008 = branField008; }

    public Boolean getBranField009() { return branField009; }
    public void setBranField009(Boolean branField009) { this.branField009 = branField009; }

    public Integer getBranField010() { return branField010; }
    public void setBranField010(Integer branField010) { this.branField010 = branField010; }

    @Override
    public String toString() {
        return "BranchDto039{" +
            "branField000=" + branField000 + ", " +
            "branField001=" + branField001 + ", " +
            "branField002=" + branField002 + ", " +
            "branField003=" + branField003 + ", " +
            "branField004=" + branField004 + ", " +
            "}";
    }
}
