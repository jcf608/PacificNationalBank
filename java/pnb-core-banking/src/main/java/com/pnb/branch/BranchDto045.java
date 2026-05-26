package com.pnb.branch;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * BranchDto045 — Data Transfer Object for branch operations.
 * Variant 45 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BranchDto045 {

    @JsonProperty("branField000")
    private Double branField000;

    @Size(max = 40)
    @JsonProperty("branField001")
    private String branField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("branField002")
    private BigDecimal branField002;

    @Size(max = 20)
    @JsonProperty("branField003")
    private String branField003;

    @JsonProperty("branField004")
    private Integer branField004;

    @JsonProperty("branField005")
    private LocalDate branField005;

    @JsonProperty("branField006")
    private Long branField006;

    @JsonProperty("branField007")
    private Boolean branField007;

    @JsonProperty("branField008")
    private LocalDate branField008;

    @JsonProperty("branField009")
    private Long branField009;

    @Size(max = 20)
    @JsonProperty("branField010")
    private String branField010;

    @Size(max = 200)
    @JsonProperty("branField011")
    private String branField011;

    @JsonProperty("branField012")
    private Integer branField012;

    @DecimalMin(value = "0.00")
    @JsonProperty("branField013")
    private BigDecimal branField013;

    @JsonProperty("branField014")
    private Double branField014;

    @JsonProperty("branField015")
    private Boolean branField015;

    @JsonProperty("branField016")
    private Double branField016;

    public BranchDto045() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final BranchDto045 instance = new BranchDto045();

        public Builder branField000(Double val) { instance.branField000 = val; return this; }
        public Builder branField001(String val) { instance.branField001 = val; return this; }
        public Builder branField002(BigDecimal val) { instance.branField002 = val; return this; }
        public Builder branField003(String val) { instance.branField003 = val; return this; }
        public Builder branField004(Integer val) { instance.branField004 = val; return this; }
        public Builder branField005(LocalDate val) { instance.branField005 = val; return this; }
        public Builder branField006(Long val) { instance.branField006 = val; return this; }
        public Builder branField007(Boolean val) { instance.branField007 = val; return this; }
        public Builder branField008(LocalDate val) { instance.branField008 = val; return this; }
        public Builder branField009(Long val) { instance.branField009 = val; return this; }
        public Builder branField010(String val) { instance.branField010 = val; return this; }
        public Builder branField011(String val) { instance.branField011 = val; return this; }
        public Builder branField012(Integer val) { instance.branField012 = val; return this; }
        public Builder branField013(BigDecimal val) { instance.branField013 = val; return this; }
        public Builder branField014(Double val) { instance.branField014 = val; return this; }
        public Builder branField015(Boolean val) { instance.branField015 = val; return this; }
        public Builder branField016(Double val) { instance.branField016 = val; return this; }
        public BranchDto045 build() { return instance; }
    }

    public Double getBranField000() { return branField000; }
    public void setBranField000(Double branField000) { this.branField000 = branField000; }

    public String getBranField001() { return branField001; }
    public void setBranField001(String branField001) { this.branField001 = branField001; }

    public BigDecimal getBranField002() { return branField002; }
    public void setBranField002(BigDecimal branField002) { this.branField002 = branField002; }

    public String getBranField003() { return branField003; }
    public void setBranField003(String branField003) { this.branField003 = branField003; }

    public Integer getBranField004() { return branField004; }
    public void setBranField004(Integer branField004) { this.branField004 = branField004; }

    public LocalDate getBranField005() { return branField005; }
    public void setBranField005(LocalDate branField005) { this.branField005 = branField005; }

    public Long getBranField006() { return branField006; }
    public void setBranField006(Long branField006) { this.branField006 = branField006; }

    public Boolean getBranField007() { return branField007; }
    public void setBranField007(Boolean branField007) { this.branField007 = branField007; }

    public LocalDate getBranField008() { return branField008; }
    public void setBranField008(LocalDate branField008) { this.branField008 = branField008; }

    public Long getBranField009() { return branField009; }
    public void setBranField009(Long branField009) { this.branField009 = branField009; }

    public String getBranField010() { return branField010; }
    public void setBranField010(String branField010) { this.branField010 = branField010; }

    public String getBranField011() { return branField011; }
    public void setBranField011(String branField011) { this.branField011 = branField011; }

    public Integer getBranField012() { return branField012; }
    public void setBranField012(Integer branField012) { this.branField012 = branField012; }

    public BigDecimal getBranField013() { return branField013; }
    public void setBranField013(BigDecimal branField013) { this.branField013 = branField013; }

    public Double getBranField014() { return branField014; }
    public void setBranField014(Double branField014) { this.branField014 = branField014; }

    public Boolean getBranField015() { return branField015; }
    public void setBranField015(Boolean branField015) { this.branField015 = branField015; }

    public Double getBranField016() { return branField016; }
    public void setBranField016(Double branField016) { this.branField016 = branField016; }

    @Override
    public String toString() {
        return "BranchDto045{" +
            "branField000=" + branField000 + ", " +
            "branField001=" + branField001 + ", " +
            "branField002=" + branField002 + ", " +
            "branField003=" + branField003 + ", " +
            "branField004=" + branField004 + ", " +
            "}";
    }
}
