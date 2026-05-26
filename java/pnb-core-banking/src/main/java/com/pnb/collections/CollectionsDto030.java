package com.pnb.collections;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * CollectionsDto030 — Data Transfer Object for collections operations.
 * Variant 30 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CollectionsDto030 {

    @Size(max = 200)
    @JsonProperty("collField000")
    private String collField000;

    @JsonProperty("collField001")
    private Double collField001;

    @JsonProperty("collField002")
    private Integer collField002;

    @Size(max = 20)
    @JsonProperty("collField003")
    private String collField003;

    @DecimalMin(value = "0.00")
    @JsonProperty("collField004")
    private BigDecimal collField004;

    @JsonProperty("collField005")
    private Double collField005;

    @JsonProperty("collField006")
    private Long collField006;

    @JsonProperty("collField007")
    private Boolean collField007;

    @JsonProperty("collField008")
    private Boolean collField008;

    @JsonProperty("collField009")
    private Double collField009;

    @Size(max = 60)
    @JsonProperty("collField010")
    private String collField010;

    @JsonProperty("collField011")
    private Integer collField011;

    @JsonProperty("collField012")
    private Integer collField012;

    @JsonProperty("collField013")
    private Integer collField013;

    public CollectionsDto030() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final CollectionsDto030 instance = new CollectionsDto030();

        public Builder collField000(String val) { instance.collField000 = val; return this; }
        public Builder collField001(Double val) { instance.collField001 = val; return this; }
        public Builder collField002(Integer val) { instance.collField002 = val; return this; }
        public Builder collField003(String val) { instance.collField003 = val; return this; }
        public Builder collField004(BigDecimal val) { instance.collField004 = val; return this; }
        public Builder collField005(Double val) { instance.collField005 = val; return this; }
        public Builder collField006(Long val) { instance.collField006 = val; return this; }
        public Builder collField007(Boolean val) { instance.collField007 = val; return this; }
        public Builder collField008(Boolean val) { instance.collField008 = val; return this; }
        public Builder collField009(Double val) { instance.collField009 = val; return this; }
        public Builder collField010(String val) { instance.collField010 = val; return this; }
        public Builder collField011(Integer val) { instance.collField011 = val; return this; }
        public Builder collField012(Integer val) { instance.collField012 = val; return this; }
        public Builder collField013(Integer val) { instance.collField013 = val; return this; }
        public CollectionsDto030 build() { return instance; }
    }

    public String getCollField000() { return collField000; }
    public void setCollField000(String collField000) { this.collField000 = collField000; }

    public Double getCollField001() { return collField001; }
    public void setCollField001(Double collField001) { this.collField001 = collField001; }

    public Integer getCollField002() { return collField002; }
    public void setCollField002(Integer collField002) { this.collField002 = collField002; }

    public String getCollField003() { return collField003; }
    public void setCollField003(String collField003) { this.collField003 = collField003; }

    public BigDecimal getCollField004() { return collField004; }
    public void setCollField004(BigDecimal collField004) { this.collField004 = collField004; }

    public Double getCollField005() { return collField005; }
    public void setCollField005(Double collField005) { this.collField005 = collField005; }

    public Long getCollField006() { return collField006; }
    public void setCollField006(Long collField006) { this.collField006 = collField006; }

    public Boolean getCollField007() { return collField007; }
    public void setCollField007(Boolean collField007) { this.collField007 = collField007; }

    public Boolean getCollField008() { return collField008; }
    public void setCollField008(Boolean collField008) { this.collField008 = collField008; }

    public Double getCollField009() { return collField009; }
    public void setCollField009(Double collField009) { this.collField009 = collField009; }

    public String getCollField010() { return collField010; }
    public void setCollField010(String collField010) { this.collField010 = collField010; }

    public Integer getCollField011() { return collField011; }
    public void setCollField011(Integer collField011) { this.collField011 = collField011; }

    public Integer getCollField012() { return collField012; }
    public void setCollField012(Integer collField012) { this.collField012 = collField012; }

    public Integer getCollField013() { return collField013; }
    public void setCollField013(Integer collField013) { this.collField013 = collField013; }

    @Override
    public String toString() {
        return "CollectionsDto030{" +
            "collField000=" + collField000 + ", " +
            "collField001=" + collField001 + ", " +
            "collField002=" + collField002 + ", " +
            "collField003=" + collField003 + ", " +
            "collField004=" + collField004 + ", " +
            "}";
    }
}
