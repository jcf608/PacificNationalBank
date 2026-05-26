package com.pnb.collections;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * CollectionsDto047 — Data Transfer Object for collections operations.
 * Variant 47 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CollectionsDto047 {

    @JsonProperty("collField000")
    private Integer collField000;

    @JsonProperty("collField001")
    private Double collField001;

    @JsonProperty("collField002")
    private Integer collField002;

    @JsonProperty("collField003")
    private LocalDate collField003;

    @DecimalMin(value = "0.00")
    @JsonProperty("collField004")
    private BigDecimal collField004;

    @JsonProperty("collField005")
    private Boolean collField005;

    @JsonProperty("collField006")
    private Boolean collField006;

    @JsonProperty("collField007")
    private LocalDate collField007;

    @DecimalMin(value = "0.00")
    @JsonProperty("collField008")
    private BigDecimal collField008;

    @JsonProperty("collField009")
    private Integer collField009;

    @JsonProperty("collField010")
    private Boolean collField010;

    @JsonProperty("collField011")
    private Integer collField011;

    @DecimalMin(value = "0.00")
    @JsonProperty("collField012")
    private BigDecimal collField012;

    @JsonProperty("collField013")
    private Boolean collField013;

    @JsonProperty("collField014")
    private Double collField014;

    @JsonProperty("collField015")
    private LocalDate collField015;

    @JsonProperty("collField016")
    private Integer collField016;

    @JsonProperty("collField017")
    private Long collField017;

    @JsonProperty("collField018")
    private Double collField018;

    public CollectionsDto047() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final CollectionsDto047 instance = new CollectionsDto047();

        public Builder collField000(Integer val) { instance.collField000 = val; return this; }
        public Builder collField001(Double val) { instance.collField001 = val; return this; }
        public Builder collField002(Integer val) { instance.collField002 = val; return this; }
        public Builder collField003(LocalDate val) { instance.collField003 = val; return this; }
        public Builder collField004(BigDecimal val) { instance.collField004 = val; return this; }
        public Builder collField005(Boolean val) { instance.collField005 = val; return this; }
        public Builder collField006(Boolean val) { instance.collField006 = val; return this; }
        public Builder collField007(LocalDate val) { instance.collField007 = val; return this; }
        public Builder collField008(BigDecimal val) { instance.collField008 = val; return this; }
        public Builder collField009(Integer val) { instance.collField009 = val; return this; }
        public Builder collField010(Boolean val) { instance.collField010 = val; return this; }
        public Builder collField011(Integer val) { instance.collField011 = val; return this; }
        public Builder collField012(BigDecimal val) { instance.collField012 = val; return this; }
        public Builder collField013(Boolean val) { instance.collField013 = val; return this; }
        public Builder collField014(Double val) { instance.collField014 = val; return this; }
        public Builder collField015(LocalDate val) { instance.collField015 = val; return this; }
        public Builder collField016(Integer val) { instance.collField016 = val; return this; }
        public Builder collField017(Long val) { instance.collField017 = val; return this; }
        public Builder collField018(Double val) { instance.collField018 = val; return this; }
        public CollectionsDto047 build() { return instance; }
    }

    public Integer getCollField000() { return collField000; }
    public void setCollField000(Integer collField000) { this.collField000 = collField000; }

    public Double getCollField001() { return collField001; }
    public void setCollField001(Double collField001) { this.collField001 = collField001; }

    public Integer getCollField002() { return collField002; }
    public void setCollField002(Integer collField002) { this.collField002 = collField002; }

    public LocalDate getCollField003() { return collField003; }
    public void setCollField003(LocalDate collField003) { this.collField003 = collField003; }

    public BigDecimal getCollField004() { return collField004; }
    public void setCollField004(BigDecimal collField004) { this.collField004 = collField004; }

    public Boolean getCollField005() { return collField005; }
    public void setCollField005(Boolean collField005) { this.collField005 = collField005; }

    public Boolean getCollField006() { return collField006; }
    public void setCollField006(Boolean collField006) { this.collField006 = collField006; }

    public LocalDate getCollField007() { return collField007; }
    public void setCollField007(LocalDate collField007) { this.collField007 = collField007; }

    public BigDecimal getCollField008() { return collField008; }
    public void setCollField008(BigDecimal collField008) { this.collField008 = collField008; }

    public Integer getCollField009() { return collField009; }
    public void setCollField009(Integer collField009) { this.collField009 = collField009; }

    public Boolean getCollField010() { return collField010; }
    public void setCollField010(Boolean collField010) { this.collField010 = collField010; }

    public Integer getCollField011() { return collField011; }
    public void setCollField011(Integer collField011) { this.collField011 = collField011; }

    public BigDecimal getCollField012() { return collField012; }
    public void setCollField012(BigDecimal collField012) { this.collField012 = collField012; }

    public Boolean getCollField013() { return collField013; }
    public void setCollField013(Boolean collField013) { this.collField013 = collField013; }

    public Double getCollField014() { return collField014; }
    public void setCollField014(Double collField014) { this.collField014 = collField014; }

    public LocalDate getCollField015() { return collField015; }
    public void setCollField015(LocalDate collField015) { this.collField015 = collField015; }

    public Integer getCollField016() { return collField016; }
    public void setCollField016(Integer collField016) { this.collField016 = collField016; }

    public Long getCollField017() { return collField017; }
    public void setCollField017(Long collField017) { this.collField017 = collField017; }

    public Double getCollField018() { return collField018; }
    public void setCollField018(Double collField018) { this.collField018 = collField018; }

    @Override
    public String toString() {
        return "CollectionsDto047{" +
            "collField000=" + collField000 + ", " +
            "collField001=" + collField001 + ", " +
            "collField002=" + collField002 + ", " +
            "collField003=" + collField003 + ", " +
            "collField004=" + collField004 + ", " +
            "}";
    }
}
