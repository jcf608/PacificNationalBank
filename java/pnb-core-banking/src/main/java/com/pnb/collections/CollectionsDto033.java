package com.pnb.collections;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * CollectionsDto033 — Data Transfer Object for collections operations.
 * Variant 33 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CollectionsDto033 {

    @DecimalMin(value = "0.00")
    @JsonProperty("collField000")
    private BigDecimal collField000;

    @JsonProperty("collField001")
    private Boolean collField001;

    @JsonProperty("collField002")
    private Boolean collField002;

    @Size(max = 20)
    @JsonProperty("collField003")
    private String collField003;

    @DecimalMin(value = "0.00")
    @JsonProperty("collField004")
    private BigDecimal collField004;

    @JsonProperty("collField005")
    private Double collField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("collField006")
    private BigDecimal collField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("collField007")
    private BigDecimal collField007;

    @JsonProperty("collField008")
    private LocalDate collField008;

    @JsonProperty("collField009")
    private LocalDate collField009;

    @DecimalMin(value = "0.00")
    @JsonProperty("collField010")
    private BigDecimal collField010;

    @JsonProperty("collField011")
    private LocalDate collField011;

    @JsonProperty("collField012")
    private Boolean collField012;

    @JsonProperty("collField013")
    private Long collField013;

    @JsonProperty("collField014")
    private Long collField014;

    @JsonProperty("collField015")
    private Integer collField015;

    @Size(max = 200)
    @JsonProperty("collField016")
    private String collField016;

    public CollectionsDto033() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final CollectionsDto033 instance = new CollectionsDto033();

        public Builder collField000(BigDecimal val) { instance.collField000 = val; return this; }
        public Builder collField001(Boolean val) { instance.collField001 = val; return this; }
        public Builder collField002(Boolean val) { instance.collField002 = val; return this; }
        public Builder collField003(String val) { instance.collField003 = val; return this; }
        public Builder collField004(BigDecimal val) { instance.collField004 = val; return this; }
        public Builder collField005(Double val) { instance.collField005 = val; return this; }
        public Builder collField006(BigDecimal val) { instance.collField006 = val; return this; }
        public Builder collField007(BigDecimal val) { instance.collField007 = val; return this; }
        public Builder collField008(LocalDate val) { instance.collField008 = val; return this; }
        public Builder collField009(LocalDate val) { instance.collField009 = val; return this; }
        public Builder collField010(BigDecimal val) { instance.collField010 = val; return this; }
        public Builder collField011(LocalDate val) { instance.collField011 = val; return this; }
        public Builder collField012(Boolean val) { instance.collField012 = val; return this; }
        public Builder collField013(Long val) { instance.collField013 = val; return this; }
        public Builder collField014(Long val) { instance.collField014 = val; return this; }
        public Builder collField015(Integer val) { instance.collField015 = val; return this; }
        public Builder collField016(String val) { instance.collField016 = val; return this; }
        public CollectionsDto033 build() { return instance; }
    }

    public BigDecimal getCollField000() { return collField000; }
    public void setCollField000(BigDecimal collField000) { this.collField000 = collField000; }

    public Boolean getCollField001() { return collField001; }
    public void setCollField001(Boolean collField001) { this.collField001 = collField001; }

    public Boolean getCollField002() { return collField002; }
    public void setCollField002(Boolean collField002) { this.collField002 = collField002; }

    public String getCollField003() { return collField003; }
    public void setCollField003(String collField003) { this.collField003 = collField003; }

    public BigDecimal getCollField004() { return collField004; }
    public void setCollField004(BigDecimal collField004) { this.collField004 = collField004; }

    public Double getCollField005() { return collField005; }
    public void setCollField005(Double collField005) { this.collField005 = collField005; }

    public BigDecimal getCollField006() { return collField006; }
    public void setCollField006(BigDecimal collField006) { this.collField006 = collField006; }

    public BigDecimal getCollField007() { return collField007; }
    public void setCollField007(BigDecimal collField007) { this.collField007 = collField007; }

    public LocalDate getCollField008() { return collField008; }
    public void setCollField008(LocalDate collField008) { this.collField008 = collField008; }

    public LocalDate getCollField009() { return collField009; }
    public void setCollField009(LocalDate collField009) { this.collField009 = collField009; }

    public BigDecimal getCollField010() { return collField010; }
    public void setCollField010(BigDecimal collField010) { this.collField010 = collField010; }

    public LocalDate getCollField011() { return collField011; }
    public void setCollField011(LocalDate collField011) { this.collField011 = collField011; }

    public Boolean getCollField012() { return collField012; }
    public void setCollField012(Boolean collField012) { this.collField012 = collField012; }

    public Long getCollField013() { return collField013; }
    public void setCollField013(Long collField013) { this.collField013 = collField013; }

    public Long getCollField014() { return collField014; }
    public void setCollField014(Long collField014) { this.collField014 = collField014; }

    public Integer getCollField015() { return collField015; }
    public void setCollField015(Integer collField015) { this.collField015 = collField015; }

    public String getCollField016() { return collField016; }
    public void setCollField016(String collField016) { this.collField016 = collField016; }

    @Override
    public String toString() {
        return "CollectionsDto033{" +
            "collField000=" + collField000 + ", " +
            "collField001=" + collField001 + ", " +
            "collField002=" + collField002 + ", " +
            "collField003=" + collField003 + ", " +
            "collField004=" + collField004 + ", " +
            "}";
    }
}
