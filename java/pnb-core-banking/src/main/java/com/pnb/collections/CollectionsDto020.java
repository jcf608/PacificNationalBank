package com.pnb.collections;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * CollectionsDto020 — Data Transfer Object for collections operations.
 * Variant 20 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CollectionsDto020 {

    @JsonProperty("collField000")
    private LocalDate collField000;

    @JsonProperty("collField001")
    private LocalDate collField001;

    @JsonProperty("collField002")
    private Long collField002;

    @JsonProperty("collField003")
    private Double collField003;

    @JsonProperty("collField004")
    private Long collField004;

    @Size(max = 100)
    @JsonProperty("collField005")
    private String collField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("collField006")
    private BigDecimal collField006;

    @JsonProperty("collField007")
    private Long collField007;

    @JsonProperty("collField008")
    private Double collField008;

    @JsonProperty("collField009")
    private Long collField009;

    @JsonProperty("collField010")
    private Double collField010;

    @JsonProperty("collField011")
    private Long collField011;

    @JsonProperty("collField012")
    private Long collField012;

    @JsonProperty("collField013")
    private Boolean collField013;

    @JsonProperty("collField014")
    private Long collField014;

    @DecimalMin(value = "0.00")
    @JsonProperty("collField015")
    private BigDecimal collField015;

    public CollectionsDto020() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final CollectionsDto020 instance = new CollectionsDto020();

        public Builder collField000(LocalDate val) { instance.collField000 = val; return this; }
        public Builder collField001(LocalDate val) { instance.collField001 = val; return this; }
        public Builder collField002(Long val) { instance.collField002 = val; return this; }
        public Builder collField003(Double val) { instance.collField003 = val; return this; }
        public Builder collField004(Long val) { instance.collField004 = val; return this; }
        public Builder collField005(String val) { instance.collField005 = val; return this; }
        public Builder collField006(BigDecimal val) { instance.collField006 = val; return this; }
        public Builder collField007(Long val) { instance.collField007 = val; return this; }
        public Builder collField008(Double val) { instance.collField008 = val; return this; }
        public Builder collField009(Long val) { instance.collField009 = val; return this; }
        public Builder collField010(Double val) { instance.collField010 = val; return this; }
        public Builder collField011(Long val) { instance.collField011 = val; return this; }
        public Builder collField012(Long val) { instance.collField012 = val; return this; }
        public Builder collField013(Boolean val) { instance.collField013 = val; return this; }
        public Builder collField014(Long val) { instance.collField014 = val; return this; }
        public Builder collField015(BigDecimal val) { instance.collField015 = val; return this; }
        public CollectionsDto020 build() { return instance; }
    }

    public LocalDate getCollField000() { return collField000; }
    public void setCollField000(LocalDate collField000) { this.collField000 = collField000; }

    public LocalDate getCollField001() { return collField001; }
    public void setCollField001(LocalDate collField001) { this.collField001 = collField001; }

    public Long getCollField002() { return collField002; }
    public void setCollField002(Long collField002) { this.collField002 = collField002; }

    public Double getCollField003() { return collField003; }
    public void setCollField003(Double collField003) { this.collField003 = collField003; }

    public Long getCollField004() { return collField004; }
    public void setCollField004(Long collField004) { this.collField004 = collField004; }

    public String getCollField005() { return collField005; }
    public void setCollField005(String collField005) { this.collField005 = collField005; }

    public BigDecimal getCollField006() { return collField006; }
    public void setCollField006(BigDecimal collField006) { this.collField006 = collField006; }

    public Long getCollField007() { return collField007; }
    public void setCollField007(Long collField007) { this.collField007 = collField007; }

    public Double getCollField008() { return collField008; }
    public void setCollField008(Double collField008) { this.collField008 = collField008; }

    public Long getCollField009() { return collField009; }
    public void setCollField009(Long collField009) { this.collField009 = collField009; }

    public Double getCollField010() { return collField010; }
    public void setCollField010(Double collField010) { this.collField010 = collField010; }

    public Long getCollField011() { return collField011; }
    public void setCollField011(Long collField011) { this.collField011 = collField011; }

    public Long getCollField012() { return collField012; }
    public void setCollField012(Long collField012) { this.collField012 = collField012; }

    public Boolean getCollField013() { return collField013; }
    public void setCollField013(Boolean collField013) { this.collField013 = collField013; }

    public Long getCollField014() { return collField014; }
    public void setCollField014(Long collField014) { this.collField014 = collField014; }

    public BigDecimal getCollField015() { return collField015; }
    public void setCollField015(BigDecimal collField015) { this.collField015 = collField015; }

    @Override
    public String toString() {
        return "CollectionsDto020{" +
            "collField000=" + collField000 + ", " +
            "collField001=" + collField001 + ", " +
            "collField002=" + collField002 + ", " +
            "collField003=" + collField003 + ", " +
            "collField004=" + collField004 + ", " +
            "}";
    }
}
