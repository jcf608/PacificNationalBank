package com.pnb.branch;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * BranchDto046 — Data Transfer Object for branch operations.
 * Variant 46 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BranchDto046 {

    @JsonProperty("branField000")
    private LocalDate branField000;

    @JsonProperty("branField001")
    private Boolean branField001;

    @JsonProperty("branField002")
    private Long branField002;

    @JsonProperty("branField003")
    private Long branField003;

    @JsonProperty("branField004")
    private LocalDate branField004;

    @JsonProperty("branField005")
    private Integer branField005;

    @Size(max = 200)
    @JsonProperty("branField006")
    private String branField006;

    @JsonProperty("branField007")
    private Long branField007;

    @JsonProperty("branField008")
    private Boolean branField008;

    @Size(max = 200)
    @JsonProperty("branField009")
    private String branField009;

    @Size(max = 60)
    @JsonProperty("branField010")
    private String branField010;

    @JsonProperty("branField011")
    private LocalDate branField011;

    @JsonProperty("branField012")
    private Boolean branField012;

    @DecimalMin(value = "0.00")
    @JsonProperty("branField013")
    private BigDecimal branField013;

    @JsonProperty("branField014")
    private Double branField014;

    @JsonProperty("branField015")
    private Boolean branField015;

    @JsonProperty("branField016")
    private Integer branField016;

    @JsonProperty("branField017")
    private Boolean branField017;

    public BranchDto046() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final BranchDto046 instance = new BranchDto046();

        public Builder branField000(LocalDate val) { instance.branField000 = val; return this; }
        public Builder branField001(Boolean val) { instance.branField001 = val; return this; }
        public Builder branField002(Long val) { instance.branField002 = val; return this; }
        public Builder branField003(Long val) { instance.branField003 = val; return this; }
        public Builder branField004(LocalDate val) { instance.branField004 = val; return this; }
        public Builder branField005(Integer val) { instance.branField005 = val; return this; }
        public Builder branField006(String val) { instance.branField006 = val; return this; }
        public Builder branField007(Long val) { instance.branField007 = val; return this; }
        public Builder branField008(Boolean val) { instance.branField008 = val; return this; }
        public Builder branField009(String val) { instance.branField009 = val; return this; }
        public Builder branField010(String val) { instance.branField010 = val; return this; }
        public Builder branField011(LocalDate val) { instance.branField011 = val; return this; }
        public Builder branField012(Boolean val) { instance.branField012 = val; return this; }
        public Builder branField013(BigDecimal val) { instance.branField013 = val; return this; }
        public Builder branField014(Double val) { instance.branField014 = val; return this; }
        public Builder branField015(Boolean val) { instance.branField015 = val; return this; }
        public Builder branField016(Integer val) { instance.branField016 = val; return this; }
        public Builder branField017(Boolean val) { instance.branField017 = val; return this; }
        public BranchDto046 build() { return instance; }
    }

    public LocalDate getBranField000() { return branField000; }
    public void setBranField000(LocalDate branField000) { this.branField000 = branField000; }

    public Boolean getBranField001() { return branField001; }
    public void setBranField001(Boolean branField001) { this.branField001 = branField001; }

    public Long getBranField002() { return branField002; }
    public void setBranField002(Long branField002) { this.branField002 = branField002; }

    public Long getBranField003() { return branField003; }
    public void setBranField003(Long branField003) { this.branField003 = branField003; }

    public LocalDate getBranField004() { return branField004; }
    public void setBranField004(LocalDate branField004) { this.branField004 = branField004; }

    public Integer getBranField005() { return branField005; }
    public void setBranField005(Integer branField005) { this.branField005 = branField005; }

    public String getBranField006() { return branField006; }
    public void setBranField006(String branField006) { this.branField006 = branField006; }

    public Long getBranField007() { return branField007; }
    public void setBranField007(Long branField007) { this.branField007 = branField007; }

    public Boolean getBranField008() { return branField008; }
    public void setBranField008(Boolean branField008) { this.branField008 = branField008; }

    public String getBranField009() { return branField009; }
    public void setBranField009(String branField009) { this.branField009 = branField009; }

    public String getBranField010() { return branField010; }
    public void setBranField010(String branField010) { this.branField010 = branField010; }

    public LocalDate getBranField011() { return branField011; }
    public void setBranField011(LocalDate branField011) { this.branField011 = branField011; }

    public Boolean getBranField012() { return branField012; }
    public void setBranField012(Boolean branField012) { this.branField012 = branField012; }

    public BigDecimal getBranField013() { return branField013; }
    public void setBranField013(BigDecimal branField013) { this.branField013 = branField013; }

    public Double getBranField014() { return branField014; }
    public void setBranField014(Double branField014) { this.branField014 = branField014; }

    public Boolean getBranField015() { return branField015; }
    public void setBranField015(Boolean branField015) { this.branField015 = branField015; }

    public Integer getBranField016() { return branField016; }
    public void setBranField016(Integer branField016) { this.branField016 = branField016; }

    public Boolean getBranField017() { return branField017; }
    public void setBranField017(Boolean branField017) { this.branField017 = branField017; }

    @Override
    public String toString() {
        return "BranchDto046{" +
            "branField000=" + branField000 + ", " +
            "branField001=" + branField001 + ", " +
            "branField002=" + branField002 + ", " +
            "branField003=" + branField003 + ", " +
            "branField004=" + branField004 + ", " +
            "}";
    }
}
