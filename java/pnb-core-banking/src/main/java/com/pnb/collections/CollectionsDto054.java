package com.pnb.collections;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * CollectionsDto054 — Data Transfer Object for collections operations.
 * Variant 54 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CollectionsDto054 {

    @JsonProperty("collField000")
    private Double collField000;

    @JsonProperty("collField001")
    private Boolean collField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("collField002")
    private BigDecimal collField002;

    @JsonProperty("collField003")
    private LocalDate collField003;

    @JsonProperty("collField004")
    private LocalDate collField004;

    @JsonProperty("collField005")
    private LocalDate collField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("collField006")
    private BigDecimal collField006;

    @JsonProperty("collField007")
    private Integer collField007;

    @JsonProperty("collField008")
    private Integer collField008;

    @JsonProperty("collField009")
    private LocalDate collField009;

    @JsonProperty("collField010")
    private Boolean collField010;

    @JsonProperty("collField011")
    private Integer collField011;

    @JsonProperty("collField012")
    private Long collField012;

    @Size(max = 20)
    @JsonProperty("collField013")
    private String collField013;

    public CollectionsDto054() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final CollectionsDto054 instance = new CollectionsDto054();

        public Builder collField000(Double val) { instance.collField000 = val; return this; }
        public Builder collField001(Boolean val) { instance.collField001 = val; return this; }
        public Builder collField002(BigDecimal val) { instance.collField002 = val; return this; }
        public Builder collField003(LocalDate val) { instance.collField003 = val; return this; }
        public Builder collField004(LocalDate val) { instance.collField004 = val; return this; }
        public Builder collField005(LocalDate val) { instance.collField005 = val; return this; }
        public Builder collField006(BigDecimal val) { instance.collField006 = val; return this; }
        public Builder collField007(Integer val) { instance.collField007 = val; return this; }
        public Builder collField008(Integer val) { instance.collField008 = val; return this; }
        public Builder collField009(LocalDate val) { instance.collField009 = val; return this; }
        public Builder collField010(Boolean val) { instance.collField010 = val; return this; }
        public Builder collField011(Integer val) { instance.collField011 = val; return this; }
        public Builder collField012(Long val) { instance.collField012 = val; return this; }
        public Builder collField013(String val) { instance.collField013 = val; return this; }
        public CollectionsDto054 build() { return instance; }
    }

    public Double getCollField000() { return collField000; }
    public void setCollField000(Double collField000) { this.collField000 = collField000; }

    public Boolean getCollField001() { return collField001; }
    public void setCollField001(Boolean collField001) { this.collField001 = collField001; }

    public BigDecimal getCollField002() { return collField002; }
    public void setCollField002(BigDecimal collField002) { this.collField002 = collField002; }

    public LocalDate getCollField003() { return collField003; }
    public void setCollField003(LocalDate collField003) { this.collField003 = collField003; }

    public LocalDate getCollField004() { return collField004; }
    public void setCollField004(LocalDate collField004) { this.collField004 = collField004; }

    public LocalDate getCollField005() { return collField005; }
    public void setCollField005(LocalDate collField005) { this.collField005 = collField005; }

    public BigDecimal getCollField006() { return collField006; }
    public void setCollField006(BigDecimal collField006) { this.collField006 = collField006; }

    public Integer getCollField007() { return collField007; }
    public void setCollField007(Integer collField007) { this.collField007 = collField007; }

    public Integer getCollField008() { return collField008; }
    public void setCollField008(Integer collField008) { this.collField008 = collField008; }

    public LocalDate getCollField009() { return collField009; }
    public void setCollField009(LocalDate collField009) { this.collField009 = collField009; }

    public Boolean getCollField010() { return collField010; }
    public void setCollField010(Boolean collField010) { this.collField010 = collField010; }

    public Integer getCollField011() { return collField011; }
    public void setCollField011(Integer collField011) { this.collField011 = collField011; }

    public Long getCollField012() { return collField012; }
    public void setCollField012(Long collField012) { this.collField012 = collField012; }

    public String getCollField013() { return collField013; }
    public void setCollField013(String collField013) { this.collField013 = collField013; }

    @Override
    public String toString() {
        return "CollectionsDto054{" +
            "collField000=" + collField000 + ", " +
            "collField001=" + collField001 + ", " +
            "collField002=" + collField002 + ", " +
            "collField003=" + collField003 + ", " +
            "collField004=" + collField004 + ", " +
            "}";
    }
}
