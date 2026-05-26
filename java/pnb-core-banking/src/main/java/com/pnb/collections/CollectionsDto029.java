package com.pnb.collections;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * CollectionsDto029 — Data Transfer Object for collections operations.
 * Variant 29 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CollectionsDto029 {

    @DecimalMin(value = "0.00")
    @JsonProperty("collField000")
    private BigDecimal collField000;

    @JsonProperty("collField001")
    private LocalDate collField001;

    @JsonProperty("collField002")
    private LocalDate collField002;

    @JsonProperty("collField003")
    private Integer collField003;

    @JsonProperty("collField004")
    private Double collField004;

    @JsonProperty("collField005")
    private Integer collField005;

    @JsonProperty("collField006")
    private Double collField006;

    @JsonProperty("collField007")
    private Boolean collField007;

    @JsonProperty("collField008")
    private Long collField008;

    @JsonProperty("collField009")
    private Boolean collField009;

    @JsonProperty("collField010")
    private Integer collField010;

    @Size(max = 40)
    @JsonProperty("collField011")
    private String collField011;

    @JsonProperty("collField012")
    private Boolean collField012;

    public CollectionsDto029() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final CollectionsDto029 instance = new CollectionsDto029();

        public Builder collField000(BigDecimal val) { instance.collField000 = val; return this; }
        public Builder collField001(LocalDate val) { instance.collField001 = val; return this; }
        public Builder collField002(LocalDate val) { instance.collField002 = val; return this; }
        public Builder collField003(Integer val) { instance.collField003 = val; return this; }
        public Builder collField004(Double val) { instance.collField004 = val; return this; }
        public Builder collField005(Integer val) { instance.collField005 = val; return this; }
        public Builder collField006(Double val) { instance.collField006 = val; return this; }
        public Builder collField007(Boolean val) { instance.collField007 = val; return this; }
        public Builder collField008(Long val) { instance.collField008 = val; return this; }
        public Builder collField009(Boolean val) { instance.collField009 = val; return this; }
        public Builder collField010(Integer val) { instance.collField010 = val; return this; }
        public Builder collField011(String val) { instance.collField011 = val; return this; }
        public Builder collField012(Boolean val) { instance.collField012 = val; return this; }
        public CollectionsDto029 build() { return instance; }
    }

    public BigDecimal getCollField000() { return collField000; }
    public void setCollField000(BigDecimal collField000) { this.collField000 = collField000; }

    public LocalDate getCollField001() { return collField001; }
    public void setCollField001(LocalDate collField001) { this.collField001 = collField001; }

    public LocalDate getCollField002() { return collField002; }
    public void setCollField002(LocalDate collField002) { this.collField002 = collField002; }

    public Integer getCollField003() { return collField003; }
    public void setCollField003(Integer collField003) { this.collField003 = collField003; }

    public Double getCollField004() { return collField004; }
    public void setCollField004(Double collField004) { this.collField004 = collField004; }

    public Integer getCollField005() { return collField005; }
    public void setCollField005(Integer collField005) { this.collField005 = collField005; }

    public Double getCollField006() { return collField006; }
    public void setCollField006(Double collField006) { this.collField006 = collField006; }

    public Boolean getCollField007() { return collField007; }
    public void setCollField007(Boolean collField007) { this.collField007 = collField007; }

    public Long getCollField008() { return collField008; }
    public void setCollField008(Long collField008) { this.collField008 = collField008; }

    public Boolean getCollField009() { return collField009; }
    public void setCollField009(Boolean collField009) { this.collField009 = collField009; }

    public Integer getCollField010() { return collField010; }
    public void setCollField010(Integer collField010) { this.collField010 = collField010; }

    public String getCollField011() { return collField011; }
    public void setCollField011(String collField011) { this.collField011 = collField011; }

    public Boolean getCollField012() { return collField012; }
    public void setCollField012(Boolean collField012) { this.collField012 = collField012; }

    @Override
    public String toString() {
        return "CollectionsDto029{" +
            "collField000=" + collField000 + ", " +
            "collField001=" + collField001 + ", " +
            "collField002=" + collField002 + ", " +
            "collField003=" + collField003 + ", " +
            "collField004=" + collField004 + ", " +
            "}";
    }
}
