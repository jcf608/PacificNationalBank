package com.pnb.branch;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * BranchDto024 — Data Transfer Object for branch operations.
 * Variant 24 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BranchDto024 {

    @JsonProperty("branField000")
    private Boolean branField000;

    @JsonProperty("branField001")
    private Double branField001;

    @JsonProperty("branField002")
    private LocalDate branField002;

    @JsonProperty("branField003")
    private LocalDate branField003;

    @JsonProperty("branField004")
    private Integer branField004;

    @JsonProperty("branField005")
    private Long branField005;

    @JsonProperty("branField006")
    private Integer branField006;

    @JsonProperty("branField007")
    private LocalDate branField007;

    public BranchDto024() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final BranchDto024 instance = new BranchDto024();

        public Builder branField000(Boolean val) { instance.branField000 = val; return this; }
        public Builder branField001(Double val) { instance.branField001 = val; return this; }
        public Builder branField002(LocalDate val) { instance.branField002 = val; return this; }
        public Builder branField003(LocalDate val) { instance.branField003 = val; return this; }
        public Builder branField004(Integer val) { instance.branField004 = val; return this; }
        public Builder branField005(Long val) { instance.branField005 = val; return this; }
        public Builder branField006(Integer val) { instance.branField006 = val; return this; }
        public Builder branField007(LocalDate val) { instance.branField007 = val; return this; }
        public BranchDto024 build() { return instance; }
    }

    public Boolean getBranField000() { return branField000; }
    public void setBranField000(Boolean branField000) { this.branField000 = branField000; }

    public Double getBranField001() { return branField001; }
    public void setBranField001(Double branField001) { this.branField001 = branField001; }

    public LocalDate getBranField002() { return branField002; }
    public void setBranField002(LocalDate branField002) { this.branField002 = branField002; }

    public LocalDate getBranField003() { return branField003; }
    public void setBranField003(LocalDate branField003) { this.branField003 = branField003; }

    public Integer getBranField004() { return branField004; }
    public void setBranField004(Integer branField004) { this.branField004 = branField004; }

    public Long getBranField005() { return branField005; }
    public void setBranField005(Long branField005) { this.branField005 = branField005; }

    public Integer getBranField006() { return branField006; }
    public void setBranField006(Integer branField006) { this.branField006 = branField006; }

    public LocalDate getBranField007() { return branField007; }
    public void setBranField007(LocalDate branField007) { this.branField007 = branField007; }

    @Override
    public String toString() {
        return "BranchDto024{" +
            "branField000=" + branField000 + ", " +
            "branField001=" + branField001 + ", " +
            "branField002=" + branField002 + ", " +
            "branField003=" + branField003 + ", " +
            "branField004=" + branField004 + ", " +
            "}";
    }
}
