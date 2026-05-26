package com.pnb.branch;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * BranchDto021 — Data Transfer Object for branch operations.
 * Variant 21 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BranchDto021 {

    @JsonProperty("branField000")
    private LocalDate branField000;

    @JsonProperty("branField001")
    private LocalDate branField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("branField002")
    private BigDecimal branField002;

    @JsonProperty("branField003")
    private Double branField003;

    @JsonProperty("branField004")
    private Integer branField004;

    @Size(max = 200)
    @JsonProperty("branField005")
    private String branField005;

    @JsonProperty("branField006")
    private Long branField006;

    @JsonProperty("branField007")
    private LocalDate branField007;

    @Size(max = 60)
    @JsonProperty("branField008")
    private String branField008;

    @Size(max = 40)
    @JsonProperty("branField009")
    private String branField009;

    @JsonProperty("branField010")
    private Double branField010;

    @JsonProperty("branField011")
    private LocalDate branField011;

    @JsonProperty("branField012")
    private Boolean branField012;

    @DecimalMin(value = "0.00")
    @JsonProperty("branField013")
    private BigDecimal branField013;

    @JsonProperty("branField014")
    private LocalDate branField014;

    @JsonProperty("branField015")
    private LocalDate branField015;

    @JsonProperty("branField016")
    private Boolean branField016;

    public BranchDto021() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final BranchDto021 instance = new BranchDto021();

        public Builder branField000(LocalDate val) { instance.branField000 = val; return this; }
        public Builder branField001(LocalDate val) { instance.branField001 = val; return this; }
        public Builder branField002(BigDecimal val) { instance.branField002 = val; return this; }
        public Builder branField003(Double val) { instance.branField003 = val; return this; }
        public Builder branField004(Integer val) { instance.branField004 = val; return this; }
        public Builder branField005(String val) { instance.branField005 = val; return this; }
        public Builder branField006(Long val) { instance.branField006 = val; return this; }
        public Builder branField007(LocalDate val) { instance.branField007 = val; return this; }
        public Builder branField008(String val) { instance.branField008 = val; return this; }
        public Builder branField009(String val) { instance.branField009 = val; return this; }
        public Builder branField010(Double val) { instance.branField010 = val; return this; }
        public Builder branField011(LocalDate val) { instance.branField011 = val; return this; }
        public Builder branField012(Boolean val) { instance.branField012 = val; return this; }
        public Builder branField013(BigDecimal val) { instance.branField013 = val; return this; }
        public Builder branField014(LocalDate val) { instance.branField014 = val; return this; }
        public Builder branField015(LocalDate val) { instance.branField015 = val; return this; }
        public Builder branField016(Boolean val) { instance.branField016 = val; return this; }
        public BranchDto021 build() { return instance; }
    }

    public LocalDate getBranField000() { return branField000; }
    public void setBranField000(LocalDate branField000) { this.branField000 = branField000; }

    public LocalDate getBranField001() { return branField001; }
    public void setBranField001(LocalDate branField001) { this.branField001 = branField001; }

    public BigDecimal getBranField002() { return branField002; }
    public void setBranField002(BigDecimal branField002) { this.branField002 = branField002; }

    public Double getBranField003() { return branField003; }
    public void setBranField003(Double branField003) { this.branField003 = branField003; }

    public Integer getBranField004() { return branField004; }
    public void setBranField004(Integer branField004) { this.branField004 = branField004; }

    public String getBranField005() { return branField005; }
    public void setBranField005(String branField005) { this.branField005 = branField005; }

    public Long getBranField006() { return branField006; }
    public void setBranField006(Long branField006) { this.branField006 = branField006; }

    public LocalDate getBranField007() { return branField007; }
    public void setBranField007(LocalDate branField007) { this.branField007 = branField007; }

    public String getBranField008() { return branField008; }
    public void setBranField008(String branField008) { this.branField008 = branField008; }

    public String getBranField009() { return branField009; }
    public void setBranField009(String branField009) { this.branField009 = branField009; }

    public Double getBranField010() { return branField010; }
    public void setBranField010(Double branField010) { this.branField010 = branField010; }

    public LocalDate getBranField011() { return branField011; }
    public void setBranField011(LocalDate branField011) { this.branField011 = branField011; }

    public Boolean getBranField012() { return branField012; }
    public void setBranField012(Boolean branField012) { this.branField012 = branField012; }

    public BigDecimal getBranField013() { return branField013; }
    public void setBranField013(BigDecimal branField013) { this.branField013 = branField013; }

    public LocalDate getBranField014() { return branField014; }
    public void setBranField014(LocalDate branField014) { this.branField014 = branField014; }

    public LocalDate getBranField015() { return branField015; }
    public void setBranField015(LocalDate branField015) { this.branField015 = branField015; }

    public Boolean getBranField016() { return branField016; }
    public void setBranField016(Boolean branField016) { this.branField016 = branField016; }

    @Override
    public String toString() {
        return "BranchDto021{" +
            "branField000=" + branField000 + ", " +
            "branField001=" + branField001 + ", " +
            "branField002=" + branField002 + ", " +
            "branField003=" + branField003 + ", " +
            "branField004=" + branField004 + ", " +
            "}";
    }
}
