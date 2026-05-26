package com.pnb.collections;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * CollectionsDto056 — Data Transfer Object for collections operations.
 * Variant 56 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CollectionsDto056 {

    @JsonProperty("collField000")
    private Double collField000;

    @DecimalMin(value = "0.00")
    @JsonProperty("collField001")
    private BigDecimal collField001;

    @JsonProperty("collField002")
    private Double collField002;

    @JsonProperty("collField003")
    private Integer collField003;

    @DecimalMin(value = "0.00")
    @JsonProperty("collField004")
    private BigDecimal collField004;

    @JsonProperty("collField005")
    private LocalDate collField005;

    @JsonProperty("collField006")
    private Boolean collField006;

    @JsonProperty("collField007")
    private LocalDate collField007;

    @JsonProperty("collField008")
    private Boolean collField008;

    @DecimalMin(value = "0.00")
    @JsonProperty("collField009")
    private BigDecimal collField009;

    @JsonProperty("collField010")
    private Double collField010;

    @Size(max = 40)
    @JsonProperty("collField011")
    private String collField011;

    @JsonProperty("collField012")
    private Integer collField012;

    @JsonProperty("collField013")
    private Integer collField013;

    @JsonProperty("collField014")
    private Long collField014;

    @JsonProperty("collField015")
    private Double collField015;

    public CollectionsDto056() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final CollectionsDto056 instance = new CollectionsDto056();

        public Builder collField000(Double val) { instance.collField000 = val; return this; }
        public Builder collField001(BigDecimal val) { instance.collField001 = val; return this; }
        public Builder collField002(Double val) { instance.collField002 = val; return this; }
        public Builder collField003(Integer val) { instance.collField003 = val; return this; }
        public Builder collField004(BigDecimal val) { instance.collField004 = val; return this; }
        public Builder collField005(LocalDate val) { instance.collField005 = val; return this; }
        public Builder collField006(Boolean val) { instance.collField006 = val; return this; }
        public Builder collField007(LocalDate val) { instance.collField007 = val; return this; }
        public Builder collField008(Boolean val) { instance.collField008 = val; return this; }
        public Builder collField009(BigDecimal val) { instance.collField009 = val; return this; }
        public Builder collField010(Double val) { instance.collField010 = val; return this; }
        public Builder collField011(String val) { instance.collField011 = val; return this; }
        public Builder collField012(Integer val) { instance.collField012 = val; return this; }
        public Builder collField013(Integer val) { instance.collField013 = val; return this; }
        public Builder collField014(Long val) { instance.collField014 = val; return this; }
        public Builder collField015(Double val) { instance.collField015 = val; return this; }
        public CollectionsDto056 build() { return instance; }
    }

    public Double getCollField000() { return collField000; }
    public void setCollField000(Double collField000) { this.collField000 = collField000; }

    public BigDecimal getCollField001() { return collField001; }
    public void setCollField001(BigDecimal collField001) { this.collField001 = collField001; }

    public Double getCollField002() { return collField002; }
    public void setCollField002(Double collField002) { this.collField002 = collField002; }

    public Integer getCollField003() { return collField003; }
    public void setCollField003(Integer collField003) { this.collField003 = collField003; }

    public BigDecimal getCollField004() { return collField004; }
    public void setCollField004(BigDecimal collField004) { this.collField004 = collField004; }

    public LocalDate getCollField005() { return collField005; }
    public void setCollField005(LocalDate collField005) { this.collField005 = collField005; }

    public Boolean getCollField006() { return collField006; }
    public void setCollField006(Boolean collField006) { this.collField006 = collField006; }

    public LocalDate getCollField007() { return collField007; }
    public void setCollField007(LocalDate collField007) { this.collField007 = collField007; }

    public Boolean getCollField008() { return collField008; }
    public void setCollField008(Boolean collField008) { this.collField008 = collField008; }

    public BigDecimal getCollField009() { return collField009; }
    public void setCollField009(BigDecimal collField009) { this.collField009 = collField009; }

    public Double getCollField010() { return collField010; }
    public void setCollField010(Double collField010) { this.collField010 = collField010; }

    public String getCollField011() { return collField011; }
    public void setCollField011(String collField011) { this.collField011 = collField011; }

    public Integer getCollField012() { return collField012; }
    public void setCollField012(Integer collField012) { this.collField012 = collField012; }

    public Integer getCollField013() { return collField013; }
    public void setCollField013(Integer collField013) { this.collField013 = collField013; }

    public Long getCollField014() { return collField014; }
    public void setCollField014(Long collField014) { this.collField014 = collField014; }

    public Double getCollField015() { return collField015; }
    public void setCollField015(Double collField015) { this.collField015 = collField015; }

    @Override
    public String toString() {
        return "CollectionsDto056{" +
            "collField000=" + collField000 + ", " +
            "collField001=" + collField001 + ", " +
            "collField002=" + collField002 + ", " +
            "collField003=" + collField003 + ", " +
            "collField004=" + collField004 + ", " +
            "}";
    }
}
