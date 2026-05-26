package com.pnb.branch;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * BranchDto040 — Data Transfer Object for branch operations.
 * Variant 40 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BranchDto040 {

    @JsonProperty("branField000")
    private Double branField000;

    @Size(max = 200)
    @JsonProperty("branField001")
    private String branField001;

    @JsonProperty("branField002")
    private Integer branField002;

    @JsonProperty("branField003")
    private Integer branField003;

    @DecimalMin(value = "0.00")
    @JsonProperty("branField004")
    private BigDecimal branField004;

    @JsonProperty("branField005")
    private LocalDate branField005;

    @JsonProperty("branField006")
    private LocalDate branField006;

    @JsonProperty("branField007")
    private LocalDate branField007;

    @JsonProperty("branField008")
    private Integer branField008;

    @JsonProperty("branField009")
    private LocalDate branField009;

    @JsonProperty("branField010")
    private Double branField010;

    @JsonProperty("branField011")
    private Boolean branField011;

    public BranchDto040() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final BranchDto040 instance = new BranchDto040();

        public Builder branField000(Double val) { instance.branField000 = val; return this; }
        public Builder branField001(String val) { instance.branField001 = val; return this; }
        public Builder branField002(Integer val) { instance.branField002 = val; return this; }
        public Builder branField003(Integer val) { instance.branField003 = val; return this; }
        public Builder branField004(BigDecimal val) { instance.branField004 = val; return this; }
        public Builder branField005(LocalDate val) { instance.branField005 = val; return this; }
        public Builder branField006(LocalDate val) { instance.branField006 = val; return this; }
        public Builder branField007(LocalDate val) { instance.branField007 = val; return this; }
        public Builder branField008(Integer val) { instance.branField008 = val; return this; }
        public Builder branField009(LocalDate val) { instance.branField009 = val; return this; }
        public Builder branField010(Double val) { instance.branField010 = val; return this; }
        public Builder branField011(Boolean val) { instance.branField011 = val; return this; }
        public BranchDto040 build() { return instance; }
    }

    public Double getBranField000() { return branField000; }
    public void setBranField000(Double branField000) { this.branField000 = branField000; }

    public String getBranField001() { return branField001; }
    public void setBranField001(String branField001) { this.branField001 = branField001; }

    public Integer getBranField002() { return branField002; }
    public void setBranField002(Integer branField002) { this.branField002 = branField002; }

    public Integer getBranField003() { return branField003; }
    public void setBranField003(Integer branField003) { this.branField003 = branField003; }

    public BigDecimal getBranField004() { return branField004; }
    public void setBranField004(BigDecimal branField004) { this.branField004 = branField004; }

    public LocalDate getBranField005() { return branField005; }
    public void setBranField005(LocalDate branField005) { this.branField005 = branField005; }

    public LocalDate getBranField006() { return branField006; }
    public void setBranField006(LocalDate branField006) { this.branField006 = branField006; }

    public LocalDate getBranField007() { return branField007; }
    public void setBranField007(LocalDate branField007) { this.branField007 = branField007; }

    public Integer getBranField008() { return branField008; }
    public void setBranField008(Integer branField008) { this.branField008 = branField008; }

    public LocalDate getBranField009() { return branField009; }
    public void setBranField009(LocalDate branField009) { this.branField009 = branField009; }

    public Double getBranField010() { return branField010; }
    public void setBranField010(Double branField010) { this.branField010 = branField010; }

    public Boolean getBranField011() { return branField011; }
    public void setBranField011(Boolean branField011) { this.branField011 = branField011; }

    @Override
    public String toString() {
        return "BranchDto040{" +
            "branField000=" + branField000 + ", " +
            "branField001=" + branField001 + ", " +
            "branField002=" + branField002 + ", " +
            "branField003=" + branField003 + ", " +
            "branField004=" + branField004 + ", " +
            "}";
    }
}
