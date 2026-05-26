package com.pnb.collections;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * CollectionsDto031 — Data Transfer Object for collections operations.
 * Variant 31 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CollectionsDto031 {

    @DecimalMin(value = "0.00")
    @JsonProperty("collField000")
    private BigDecimal collField000;

    @DecimalMin(value = "0.00")
    @JsonProperty("collField001")
    private BigDecimal collField001;

    @JsonProperty("collField002")
    private Double collField002;

    @JsonProperty("collField003")
    private Integer collField003;

    @JsonProperty("collField004")
    private Long collField004;

    @JsonProperty("collField005")
    private LocalDate collField005;

    @Size(max = 60)
    @JsonProperty("collField006")
    private String collField006;

    @JsonProperty("collField007")
    private Double collField007;

    @Size(max = 200)
    @JsonProperty("collField008")
    private String collField008;

    @JsonProperty("collField009")
    private Integer collField009;

    @JsonProperty("collField010")
    private Double collField010;

    @JsonProperty("collField011")
    private Long collField011;

    @Size(max = 200)
    @JsonProperty("collField012")
    private String collField012;

    @DecimalMin(value = "0.00")
    @JsonProperty("collField013")
    private BigDecimal collField013;

    @JsonProperty("collField014")
    private Long collField014;

    public CollectionsDto031() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final CollectionsDto031 instance = new CollectionsDto031();

        public Builder collField000(BigDecimal val) { instance.collField000 = val; return this; }
        public Builder collField001(BigDecimal val) { instance.collField001 = val; return this; }
        public Builder collField002(Double val) { instance.collField002 = val; return this; }
        public Builder collField003(Integer val) { instance.collField003 = val; return this; }
        public Builder collField004(Long val) { instance.collField004 = val; return this; }
        public Builder collField005(LocalDate val) { instance.collField005 = val; return this; }
        public Builder collField006(String val) { instance.collField006 = val; return this; }
        public Builder collField007(Double val) { instance.collField007 = val; return this; }
        public Builder collField008(String val) { instance.collField008 = val; return this; }
        public Builder collField009(Integer val) { instance.collField009 = val; return this; }
        public Builder collField010(Double val) { instance.collField010 = val; return this; }
        public Builder collField011(Long val) { instance.collField011 = val; return this; }
        public Builder collField012(String val) { instance.collField012 = val; return this; }
        public Builder collField013(BigDecimal val) { instance.collField013 = val; return this; }
        public Builder collField014(Long val) { instance.collField014 = val; return this; }
        public CollectionsDto031 build() { return instance; }
    }

    public BigDecimal getCollField000() { return collField000; }
    public void setCollField000(BigDecimal collField000) { this.collField000 = collField000; }

    public BigDecimal getCollField001() { return collField001; }
    public void setCollField001(BigDecimal collField001) { this.collField001 = collField001; }

    public Double getCollField002() { return collField002; }
    public void setCollField002(Double collField002) { this.collField002 = collField002; }

    public Integer getCollField003() { return collField003; }
    public void setCollField003(Integer collField003) { this.collField003 = collField003; }

    public Long getCollField004() { return collField004; }
    public void setCollField004(Long collField004) { this.collField004 = collField004; }

    public LocalDate getCollField005() { return collField005; }
    public void setCollField005(LocalDate collField005) { this.collField005 = collField005; }

    public String getCollField006() { return collField006; }
    public void setCollField006(String collField006) { this.collField006 = collField006; }

    public Double getCollField007() { return collField007; }
    public void setCollField007(Double collField007) { this.collField007 = collField007; }

    public String getCollField008() { return collField008; }
    public void setCollField008(String collField008) { this.collField008 = collField008; }

    public Integer getCollField009() { return collField009; }
    public void setCollField009(Integer collField009) { this.collField009 = collField009; }

    public Double getCollField010() { return collField010; }
    public void setCollField010(Double collField010) { this.collField010 = collField010; }

    public Long getCollField011() { return collField011; }
    public void setCollField011(Long collField011) { this.collField011 = collField011; }

    public String getCollField012() { return collField012; }
    public void setCollField012(String collField012) { this.collField012 = collField012; }

    public BigDecimal getCollField013() { return collField013; }
    public void setCollField013(BigDecimal collField013) { this.collField013 = collField013; }

    public Long getCollField014() { return collField014; }
    public void setCollField014(Long collField014) { this.collField014 = collField014; }

    @Override
    public String toString() {
        return "CollectionsDto031{" +
            "collField000=" + collField000 + ", " +
            "collField001=" + collField001 + ", " +
            "collField002=" + collField002 + ", " +
            "collField003=" + collField003 + ", " +
            "collField004=" + collField004 + ", " +
            "}";
    }
}
