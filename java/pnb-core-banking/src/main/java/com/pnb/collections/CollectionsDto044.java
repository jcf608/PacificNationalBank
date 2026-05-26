package com.pnb.collections;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * CollectionsDto044 — Data Transfer Object for collections operations.
 * Variant 44 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CollectionsDto044 {

    @JsonProperty("collField000")
    private LocalDate collField000;

    @Size(max = 100)
    @JsonProperty("collField001")
    private String collField001;

    @JsonProperty("collField002")
    private Integer collField002;

    @JsonProperty("collField003")
    private Integer collField003;

    @JsonProperty("collField004")
    private Integer collField004;

    @JsonProperty("collField005")
    private Integer collField005;

    @Size(max = 20)
    @JsonProperty("collField006")
    private String collField006;

    @JsonProperty("collField007")
    private Double collField007;

    @JsonProperty("collField008")
    private Integer collField008;

    @JsonProperty("collField009")
    private Integer collField009;

    @JsonProperty("collField010")
    private Long collField010;

    @DecimalMin(value = "0.00")
    @JsonProperty("collField011")
    private BigDecimal collField011;

    @JsonProperty("collField012")
    private Integer collField012;

    @JsonProperty("collField013")
    private LocalDate collField013;

    @JsonProperty("collField014")
    private Boolean collField014;

    @JsonProperty("collField015")
    private LocalDate collField015;

    public CollectionsDto044() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final CollectionsDto044 instance = new CollectionsDto044();

        public Builder collField000(LocalDate val) { instance.collField000 = val; return this; }
        public Builder collField001(String val) { instance.collField001 = val; return this; }
        public Builder collField002(Integer val) { instance.collField002 = val; return this; }
        public Builder collField003(Integer val) { instance.collField003 = val; return this; }
        public Builder collField004(Integer val) { instance.collField004 = val; return this; }
        public Builder collField005(Integer val) { instance.collField005 = val; return this; }
        public Builder collField006(String val) { instance.collField006 = val; return this; }
        public Builder collField007(Double val) { instance.collField007 = val; return this; }
        public Builder collField008(Integer val) { instance.collField008 = val; return this; }
        public Builder collField009(Integer val) { instance.collField009 = val; return this; }
        public Builder collField010(Long val) { instance.collField010 = val; return this; }
        public Builder collField011(BigDecimal val) { instance.collField011 = val; return this; }
        public Builder collField012(Integer val) { instance.collField012 = val; return this; }
        public Builder collField013(LocalDate val) { instance.collField013 = val; return this; }
        public Builder collField014(Boolean val) { instance.collField014 = val; return this; }
        public Builder collField015(LocalDate val) { instance.collField015 = val; return this; }
        public CollectionsDto044 build() { return instance; }
    }

    public LocalDate getCollField000() { return collField000; }
    public void setCollField000(LocalDate collField000) { this.collField000 = collField000; }

    public String getCollField001() { return collField001; }
    public void setCollField001(String collField001) { this.collField001 = collField001; }

    public Integer getCollField002() { return collField002; }
    public void setCollField002(Integer collField002) { this.collField002 = collField002; }

    public Integer getCollField003() { return collField003; }
    public void setCollField003(Integer collField003) { this.collField003 = collField003; }

    public Integer getCollField004() { return collField004; }
    public void setCollField004(Integer collField004) { this.collField004 = collField004; }

    public Integer getCollField005() { return collField005; }
    public void setCollField005(Integer collField005) { this.collField005 = collField005; }

    public String getCollField006() { return collField006; }
    public void setCollField006(String collField006) { this.collField006 = collField006; }

    public Double getCollField007() { return collField007; }
    public void setCollField007(Double collField007) { this.collField007 = collField007; }

    public Integer getCollField008() { return collField008; }
    public void setCollField008(Integer collField008) { this.collField008 = collField008; }

    public Integer getCollField009() { return collField009; }
    public void setCollField009(Integer collField009) { this.collField009 = collField009; }

    public Long getCollField010() { return collField010; }
    public void setCollField010(Long collField010) { this.collField010 = collField010; }

    public BigDecimal getCollField011() { return collField011; }
    public void setCollField011(BigDecimal collField011) { this.collField011 = collField011; }

    public Integer getCollField012() { return collField012; }
    public void setCollField012(Integer collField012) { this.collField012 = collField012; }

    public LocalDate getCollField013() { return collField013; }
    public void setCollField013(LocalDate collField013) { this.collField013 = collField013; }

    public Boolean getCollField014() { return collField014; }
    public void setCollField014(Boolean collField014) { this.collField014 = collField014; }

    public LocalDate getCollField015() { return collField015; }
    public void setCollField015(LocalDate collField015) { this.collField015 = collField015; }

    @Override
    public String toString() {
        return "CollectionsDto044{" +
            "collField000=" + collField000 + ", " +
            "collField001=" + collField001 + ", " +
            "collField002=" + collField002 + ", " +
            "collField003=" + collField003 + ", " +
            "collField004=" + collField004 + ", " +
            "}";
    }
}
