package com.pnb.branch;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * BranchDto025 — Data Transfer Object for branch operations.
 * Variant 25 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BranchDto025 {

    @JsonProperty("branField000")
    private Long branField000;

    @JsonProperty("branField001")
    private Boolean branField001;

    @JsonProperty("branField002")
    private LocalDate branField002;

    @JsonProperty("branField003")
    private LocalDate branField003;

    @Size(max = 20)
    @JsonProperty("branField004")
    private String branField004;

    @JsonProperty("branField005")
    private LocalDate branField005;

    @JsonProperty("branField006")
    private Double branField006;

    @JsonProperty("branField007")
    private Integer branField007;

    @JsonProperty("branField008")
    private Integer branField008;

    public BranchDto025() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final BranchDto025 instance = new BranchDto025();

        public Builder branField000(Long val) { instance.branField000 = val; return this; }
        public Builder branField001(Boolean val) { instance.branField001 = val; return this; }
        public Builder branField002(LocalDate val) { instance.branField002 = val; return this; }
        public Builder branField003(LocalDate val) { instance.branField003 = val; return this; }
        public Builder branField004(String val) { instance.branField004 = val; return this; }
        public Builder branField005(LocalDate val) { instance.branField005 = val; return this; }
        public Builder branField006(Double val) { instance.branField006 = val; return this; }
        public Builder branField007(Integer val) { instance.branField007 = val; return this; }
        public Builder branField008(Integer val) { instance.branField008 = val; return this; }
        public BranchDto025 build() { return instance; }
    }

    public Long getBranField000() { return branField000; }
    public void setBranField000(Long branField000) { this.branField000 = branField000; }

    public Boolean getBranField001() { return branField001; }
    public void setBranField001(Boolean branField001) { this.branField001 = branField001; }

    public LocalDate getBranField002() { return branField002; }
    public void setBranField002(LocalDate branField002) { this.branField002 = branField002; }

    public LocalDate getBranField003() { return branField003; }
    public void setBranField003(LocalDate branField003) { this.branField003 = branField003; }

    public String getBranField004() { return branField004; }
    public void setBranField004(String branField004) { this.branField004 = branField004; }

    public LocalDate getBranField005() { return branField005; }
    public void setBranField005(LocalDate branField005) { this.branField005 = branField005; }

    public Double getBranField006() { return branField006; }
    public void setBranField006(Double branField006) { this.branField006 = branField006; }

    public Integer getBranField007() { return branField007; }
    public void setBranField007(Integer branField007) { this.branField007 = branField007; }

    public Integer getBranField008() { return branField008; }
    public void setBranField008(Integer branField008) { this.branField008 = branField008; }

    @Override
    public String toString() {
        return "BranchDto025{" +
            "branField000=" + branField000 + ", " +
            "branField001=" + branField001 + ", " +
            "branField002=" + branField002 + ", " +
            "branField003=" + branField003 + ", " +
            "branField004=" + branField004 + ", " +
            "}";
    }
}
