package com.pnb.collections;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * CollectionsDto028 — Data Transfer Object for collections operations.
 * Variant 28 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CollectionsDto028 {

    @JsonProperty("collField000")
    private Long collField000;

    @JsonProperty("collField001")
    private Double collField001;

    @JsonProperty("collField002")
    private Boolean collField002;

    @JsonProperty("collField003")
    private Long collField003;

    @JsonProperty("collField004")
    private LocalDate collField004;

    @JsonProperty("collField005")
    private Double collField005;

    @JsonProperty("collField006")
    private Integer collField006;

    @JsonProperty("collField007")
    private Boolean collField007;

    @JsonProperty("collField008")
    private Integer collField008;

    @JsonProperty("collField009")
    private Integer collField009;

    @Size(max = 20)
    @JsonProperty("collField010")
    private String collField010;

    @DecimalMin(value = "0.00")
    @JsonProperty("collField011")
    private BigDecimal collField011;

    public CollectionsDto028() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final CollectionsDto028 instance = new CollectionsDto028();

        public Builder collField000(Long val) { instance.collField000 = val; return this; }
        public Builder collField001(Double val) { instance.collField001 = val; return this; }
        public Builder collField002(Boolean val) { instance.collField002 = val; return this; }
        public Builder collField003(Long val) { instance.collField003 = val; return this; }
        public Builder collField004(LocalDate val) { instance.collField004 = val; return this; }
        public Builder collField005(Double val) { instance.collField005 = val; return this; }
        public Builder collField006(Integer val) { instance.collField006 = val; return this; }
        public Builder collField007(Boolean val) { instance.collField007 = val; return this; }
        public Builder collField008(Integer val) { instance.collField008 = val; return this; }
        public Builder collField009(Integer val) { instance.collField009 = val; return this; }
        public Builder collField010(String val) { instance.collField010 = val; return this; }
        public Builder collField011(BigDecimal val) { instance.collField011 = val; return this; }
        public CollectionsDto028 build() { return instance; }
    }

    public Long getCollField000() { return collField000; }
    public void setCollField000(Long collField000) { this.collField000 = collField000; }

    public Double getCollField001() { return collField001; }
    public void setCollField001(Double collField001) { this.collField001 = collField001; }

    public Boolean getCollField002() { return collField002; }
    public void setCollField002(Boolean collField002) { this.collField002 = collField002; }

    public Long getCollField003() { return collField003; }
    public void setCollField003(Long collField003) { this.collField003 = collField003; }

    public LocalDate getCollField004() { return collField004; }
    public void setCollField004(LocalDate collField004) { this.collField004 = collField004; }

    public Double getCollField005() { return collField005; }
    public void setCollField005(Double collField005) { this.collField005 = collField005; }

    public Integer getCollField006() { return collField006; }
    public void setCollField006(Integer collField006) { this.collField006 = collField006; }

    public Boolean getCollField007() { return collField007; }
    public void setCollField007(Boolean collField007) { this.collField007 = collField007; }

    public Integer getCollField008() { return collField008; }
    public void setCollField008(Integer collField008) { this.collField008 = collField008; }

    public Integer getCollField009() { return collField009; }
    public void setCollField009(Integer collField009) { this.collField009 = collField009; }

    public String getCollField010() { return collField010; }
    public void setCollField010(String collField010) { this.collField010 = collField010; }

    public BigDecimal getCollField011() { return collField011; }
    public void setCollField011(BigDecimal collField011) { this.collField011 = collField011; }

    @Override
    public String toString() {
        return "CollectionsDto028{" +
            "collField000=" + collField000 + ", " +
            "collField001=" + collField001 + ", " +
            "collField002=" + collField002 + ", " +
            "collField003=" + collField003 + ", " +
            "collField004=" + collField004 + ", " +
            "}";
    }
}
