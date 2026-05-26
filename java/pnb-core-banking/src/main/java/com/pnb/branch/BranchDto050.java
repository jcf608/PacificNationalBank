package com.pnb.branch;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * BranchDto050 — Data Transfer Object for branch operations.
 * Variant 50 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BranchDto050 {

    @JsonProperty("branField000")
    private Boolean branField000;

    @DecimalMin(value = "0.00")
    @JsonProperty("branField001")
    private BigDecimal branField001;

    @JsonProperty("branField002")
    private Boolean branField002;

    @JsonProperty("branField003")
    private Long branField003;

    @JsonProperty("branField004")
    private Integer branField004;

    @JsonProperty("branField005")
    private Double branField005;

    @JsonProperty("branField006")
    private Double branField006;

    @Size(max = 200)
    @JsonProperty("branField007")
    private String branField007;

    @JsonProperty("branField008")
    private Integer branField008;

    @JsonProperty("branField009")
    private LocalDate branField009;

    public BranchDto050() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final BranchDto050 instance = new BranchDto050();

        public Builder branField000(Boolean val) { instance.branField000 = val; return this; }
        public Builder branField001(BigDecimal val) { instance.branField001 = val; return this; }
        public Builder branField002(Boolean val) { instance.branField002 = val; return this; }
        public Builder branField003(Long val) { instance.branField003 = val; return this; }
        public Builder branField004(Integer val) { instance.branField004 = val; return this; }
        public Builder branField005(Double val) { instance.branField005 = val; return this; }
        public Builder branField006(Double val) { instance.branField006 = val; return this; }
        public Builder branField007(String val) { instance.branField007 = val; return this; }
        public Builder branField008(Integer val) { instance.branField008 = val; return this; }
        public Builder branField009(LocalDate val) { instance.branField009 = val; return this; }
        public BranchDto050 build() { return instance; }
    }

    public Boolean getBranField000() { return branField000; }
    public void setBranField000(Boolean branField000) { this.branField000 = branField000; }

    public BigDecimal getBranField001() { return branField001; }
    public void setBranField001(BigDecimal branField001) { this.branField001 = branField001; }

    public Boolean getBranField002() { return branField002; }
    public void setBranField002(Boolean branField002) { this.branField002 = branField002; }

    public Long getBranField003() { return branField003; }
    public void setBranField003(Long branField003) { this.branField003 = branField003; }

    public Integer getBranField004() { return branField004; }
    public void setBranField004(Integer branField004) { this.branField004 = branField004; }

    public Double getBranField005() { return branField005; }
    public void setBranField005(Double branField005) { this.branField005 = branField005; }

    public Double getBranField006() { return branField006; }
    public void setBranField006(Double branField006) { this.branField006 = branField006; }

    public String getBranField007() { return branField007; }
    public void setBranField007(String branField007) { this.branField007 = branField007; }

    public Integer getBranField008() { return branField008; }
    public void setBranField008(Integer branField008) { this.branField008 = branField008; }

    public LocalDate getBranField009() { return branField009; }
    public void setBranField009(LocalDate branField009) { this.branField009 = branField009; }

    @Override
    public String toString() {
        return "BranchDto050{" +
            "branField000=" + branField000 + ", " +
            "branField001=" + branField001 + ", " +
            "branField002=" + branField002 + ", " +
            "branField003=" + branField003 + ", " +
            "branField004=" + branField004 + ", " +
            "}";
    }
}
