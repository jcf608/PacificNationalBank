package com.pnb.collections;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * CollectionsDto035 — Data Transfer Object for collections operations.
 * Variant 35 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CollectionsDto035 {

    @DecimalMin(value = "0.00")
    @JsonProperty("collField000")
    private BigDecimal collField000;

    @JsonProperty("collField001")
    private Double collField001;

    @JsonProperty("collField002")
    private Long collField002;

    @JsonProperty("collField003")
    private Double collField003;

    @JsonProperty("collField004")
    private Boolean collField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("collField005")
    private BigDecimal collField005;

    @JsonProperty("collField006")
    private Long collField006;

    @JsonProperty("collField007")
    private Double collField007;

    @DecimalMin(value = "0.00")
    @JsonProperty("collField008")
    private BigDecimal collField008;

    @DecimalMin(value = "0.00")
    @JsonProperty("collField009")
    private BigDecimal collField009;

    @JsonProperty("collField010")
    private Integer collField010;

    @JsonProperty("collField011")
    private Long collField011;

    @JsonProperty("collField012")
    private Long collField012;

    @JsonProperty("collField013")
    private Boolean collField013;

    @JsonProperty("collField014")
    private Double collField014;

    @JsonProperty("collField015")
    private Boolean collField015;

    @JsonProperty("collField016")
    private Long collField016;

    @DecimalMin(value = "0.00")
    @JsonProperty("collField017")
    private BigDecimal collField017;

    @JsonProperty("collField018")
    private Double collField018;

    public CollectionsDto035() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final CollectionsDto035 instance = new CollectionsDto035();

        public Builder collField000(BigDecimal val) { instance.collField000 = val; return this; }
        public Builder collField001(Double val) { instance.collField001 = val; return this; }
        public Builder collField002(Long val) { instance.collField002 = val; return this; }
        public Builder collField003(Double val) { instance.collField003 = val; return this; }
        public Builder collField004(Boolean val) { instance.collField004 = val; return this; }
        public Builder collField005(BigDecimal val) { instance.collField005 = val; return this; }
        public Builder collField006(Long val) { instance.collField006 = val; return this; }
        public Builder collField007(Double val) { instance.collField007 = val; return this; }
        public Builder collField008(BigDecimal val) { instance.collField008 = val; return this; }
        public Builder collField009(BigDecimal val) { instance.collField009 = val; return this; }
        public Builder collField010(Integer val) { instance.collField010 = val; return this; }
        public Builder collField011(Long val) { instance.collField011 = val; return this; }
        public Builder collField012(Long val) { instance.collField012 = val; return this; }
        public Builder collField013(Boolean val) { instance.collField013 = val; return this; }
        public Builder collField014(Double val) { instance.collField014 = val; return this; }
        public Builder collField015(Boolean val) { instance.collField015 = val; return this; }
        public Builder collField016(Long val) { instance.collField016 = val; return this; }
        public Builder collField017(BigDecimal val) { instance.collField017 = val; return this; }
        public Builder collField018(Double val) { instance.collField018 = val; return this; }
        public CollectionsDto035 build() { return instance; }
    }

    public BigDecimal getCollField000() { return collField000; }
    public void setCollField000(BigDecimal collField000) { this.collField000 = collField000; }

    public Double getCollField001() { return collField001; }
    public void setCollField001(Double collField001) { this.collField001 = collField001; }

    public Long getCollField002() { return collField002; }
    public void setCollField002(Long collField002) { this.collField002 = collField002; }

    public Double getCollField003() { return collField003; }
    public void setCollField003(Double collField003) { this.collField003 = collField003; }

    public Boolean getCollField004() { return collField004; }
    public void setCollField004(Boolean collField004) { this.collField004 = collField004; }

    public BigDecimal getCollField005() { return collField005; }
    public void setCollField005(BigDecimal collField005) { this.collField005 = collField005; }

    public Long getCollField006() { return collField006; }
    public void setCollField006(Long collField006) { this.collField006 = collField006; }

    public Double getCollField007() { return collField007; }
    public void setCollField007(Double collField007) { this.collField007 = collField007; }

    public BigDecimal getCollField008() { return collField008; }
    public void setCollField008(BigDecimal collField008) { this.collField008 = collField008; }

    public BigDecimal getCollField009() { return collField009; }
    public void setCollField009(BigDecimal collField009) { this.collField009 = collField009; }

    public Integer getCollField010() { return collField010; }
    public void setCollField010(Integer collField010) { this.collField010 = collField010; }

    public Long getCollField011() { return collField011; }
    public void setCollField011(Long collField011) { this.collField011 = collField011; }

    public Long getCollField012() { return collField012; }
    public void setCollField012(Long collField012) { this.collField012 = collField012; }

    public Boolean getCollField013() { return collField013; }
    public void setCollField013(Boolean collField013) { this.collField013 = collField013; }

    public Double getCollField014() { return collField014; }
    public void setCollField014(Double collField014) { this.collField014 = collField014; }

    public Boolean getCollField015() { return collField015; }
    public void setCollField015(Boolean collField015) { this.collField015 = collField015; }

    public Long getCollField016() { return collField016; }
    public void setCollField016(Long collField016) { this.collField016 = collField016; }

    public BigDecimal getCollField017() { return collField017; }
    public void setCollField017(BigDecimal collField017) { this.collField017 = collField017; }

    public Double getCollField018() { return collField018; }
    public void setCollField018(Double collField018) { this.collField018 = collField018; }

    @Override
    public String toString() {
        return "CollectionsDto035{" +
            "collField000=" + collField000 + ", " +
            "collField001=" + collField001 + ", " +
            "collField002=" + collField002 + ", " +
            "collField003=" + collField003 + ", " +
            "collField004=" + collField004 + ", " +
            "}";
    }
}
