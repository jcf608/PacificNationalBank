package com.pnb.branch;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * BranchDto053 — Data Transfer Object for branch operations.
 * Variant 53 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BranchDto053 {

    @JsonProperty("branField000")
    private Long branField000;

    @JsonProperty("branField001")
    private Long branField001;

    @JsonProperty("branField002")
    private Double branField002;

    @Size(max = 100)
    @JsonProperty("branField003")
    private String branField003;

    @JsonProperty("branField004")
    private Boolean branField004;

    @JsonProperty("branField005")
    private Long branField005;

    @Size(max = 100)
    @JsonProperty("branField006")
    private String branField006;

    @JsonProperty("branField007")
    private Double branField007;

    @JsonProperty("branField008")
    private LocalDate branField008;

    @DecimalMin(value = "0.00")
    @JsonProperty("branField009")
    private BigDecimal branField009;

    @Size(max = 100)
    @JsonProperty("branField010")
    private String branField010;

    @Size(max = 40)
    @JsonProperty("branField011")
    private String branField011;

    @Size(max = 200)
    @JsonProperty("branField012")
    private String branField012;

    public BranchDto053() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final BranchDto053 instance = new BranchDto053();

        public Builder branField000(Long val) { instance.branField000 = val; return this; }
        public Builder branField001(Long val) { instance.branField001 = val; return this; }
        public Builder branField002(Double val) { instance.branField002 = val; return this; }
        public Builder branField003(String val) { instance.branField003 = val; return this; }
        public Builder branField004(Boolean val) { instance.branField004 = val; return this; }
        public Builder branField005(Long val) { instance.branField005 = val; return this; }
        public Builder branField006(String val) { instance.branField006 = val; return this; }
        public Builder branField007(Double val) { instance.branField007 = val; return this; }
        public Builder branField008(LocalDate val) { instance.branField008 = val; return this; }
        public Builder branField009(BigDecimal val) { instance.branField009 = val; return this; }
        public Builder branField010(String val) { instance.branField010 = val; return this; }
        public Builder branField011(String val) { instance.branField011 = val; return this; }
        public Builder branField012(String val) { instance.branField012 = val; return this; }
        public BranchDto053 build() { return instance; }
    }

    public Long getBranField000() { return branField000; }
    public void setBranField000(Long branField000) { this.branField000 = branField000; }

    public Long getBranField001() { return branField001; }
    public void setBranField001(Long branField001) { this.branField001 = branField001; }

    public Double getBranField002() { return branField002; }
    public void setBranField002(Double branField002) { this.branField002 = branField002; }

    public String getBranField003() { return branField003; }
    public void setBranField003(String branField003) { this.branField003 = branField003; }

    public Boolean getBranField004() { return branField004; }
    public void setBranField004(Boolean branField004) { this.branField004 = branField004; }

    public Long getBranField005() { return branField005; }
    public void setBranField005(Long branField005) { this.branField005 = branField005; }

    public String getBranField006() { return branField006; }
    public void setBranField006(String branField006) { this.branField006 = branField006; }

    public Double getBranField007() { return branField007; }
    public void setBranField007(Double branField007) { this.branField007 = branField007; }

    public LocalDate getBranField008() { return branField008; }
    public void setBranField008(LocalDate branField008) { this.branField008 = branField008; }

    public BigDecimal getBranField009() { return branField009; }
    public void setBranField009(BigDecimal branField009) { this.branField009 = branField009; }

    public String getBranField010() { return branField010; }
    public void setBranField010(String branField010) { this.branField010 = branField010; }

    public String getBranField011() { return branField011; }
    public void setBranField011(String branField011) { this.branField011 = branField011; }

    public String getBranField012() { return branField012; }
    public void setBranField012(String branField012) { this.branField012 = branField012; }

    @Override
    public String toString() {
        return "BranchDto053{" +
            "branField000=" + branField000 + ", " +
            "branField001=" + branField001 + ", " +
            "branField002=" + branField002 + ", " +
            "branField003=" + branField003 + ", " +
            "branField004=" + branField004 + ", " +
            "}";
    }
}
