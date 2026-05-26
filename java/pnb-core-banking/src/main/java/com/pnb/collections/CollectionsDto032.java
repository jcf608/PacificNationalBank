package com.pnb.collections;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * CollectionsDto032 — Data Transfer Object for collections operations.
 * Variant 32 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CollectionsDto032 {

    @JsonProperty("collField000")
    private Integer collField000;

    @JsonProperty("collField001")
    private Integer collField001;

    @JsonProperty("collField002")
    private Boolean collField002;

    @JsonProperty("collField003")
    private Double collField003;

    @JsonProperty("collField004")
    private Long collField004;

    @Size(max = 200)
    @JsonProperty("collField005")
    private String collField005;

    @JsonProperty("collField006")
    private Long collField006;

    @Size(max = 100)
    @JsonProperty("collField007")
    private String collField007;

    @JsonProperty("collField008")
    private Long collField008;

    @DecimalMin(value = "0.00")
    @JsonProperty("collField009")
    private BigDecimal collField009;

    @JsonProperty("collField010")
    private Long collField010;

    @JsonProperty("collField011")
    private Long collField011;

    @JsonProperty("collField012")
    private Boolean collField012;

    @JsonProperty("collField013")
    private LocalDate collField013;

    @JsonProperty("collField014")
    private Boolean collField014;

    @Size(max = 200)
    @JsonProperty("collField015")
    private String collField015;

    public CollectionsDto032() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final CollectionsDto032 instance = new CollectionsDto032();

        public Builder collField000(Integer val) { instance.collField000 = val; return this; }
        public Builder collField001(Integer val) { instance.collField001 = val; return this; }
        public Builder collField002(Boolean val) { instance.collField002 = val; return this; }
        public Builder collField003(Double val) { instance.collField003 = val; return this; }
        public Builder collField004(Long val) { instance.collField004 = val; return this; }
        public Builder collField005(String val) { instance.collField005 = val; return this; }
        public Builder collField006(Long val) { instance.collField006 = val; return this; }
        public Builder collField007(String val) { instance.collField007 = val; return this; }
        public Builder collField008(Long val) { instance.collField008 = val; return this; }
        public Builder collField009(BigDecimal val) { instance.collField009 = val; return this; }
        public Builder collField010(Long val) { instance.collField010 = val; return this; }
        public Builder collField011(Long val) { instance.collField011 = val; return this; }
        public Builder collField012(Boolean val) { instance.collField012 = val; return this; }
        public Builder collField013(LocalDate val) { instance.collField013 = val; return this; }
        public Builder collField014(Boolean val) { instance.collField014 = val; return this; }
        public Builder collField015(String val) { instance.collField015 = val; return this; }
        public CollectionsDto032 build() { return instance; }
    }

    public Integer getCollField000() { return collField000; }
    public void setCollField000(Integer collField000) { this.collField000 = collField000; }

    public Integer getCollField001() { return collField001; }
    public void setCollField001(Integer collField001) { this.collField001 = collField001; }

    public Boolean getCollField002() { return collField002; }
    public void setCollField002(Boolean collField002) { this.collField002 = collField002; }

    public Double getCollField003() { return collField003; }
    public void setCollField003(Double collField003) { this.collField003 = collField003; }

    public Long getCollField004() { return collField004; }
    public void setCollField004(Long collField004) { this.collField004 = collField004; }

    public String getCollField005() { return collField005; }
    public void setCollField005(String collField005) { this.collField005 = collField005; }

    public Long getCollField006() { return collField006; }
    public void setCollField006(Long collField006) { this.collField006 = collField006; }

    public String getCollField007() { return collField007; }
    public void setCollField007(String collField007) { this.collField007 = collField007; }

    public Long getCollField008() { return collField008; }
    public void setCollField008(Long collField008) { this.collField008 = collField008; }

    public BigDecimal getCollField009() { return collField009; }
    public void setCollField009(BigDecimal collField009) { this.collField009 = collField009; }

    public Long getCollField010() { return collField010; }
    public void setCollField010(Long collField010) { this.collField010 = collField010; }

    public Long getCollField011() { return collField011; }
    public void setCollField011(Long collField011) { this.collField011 = collField011; }

    public Boolean getCollField012() { return collField012; }
    public void setCollField012(Boolean collField012) { this.collField012 = collField012; }

    public LocalDate getCollField013() { return collField013; }
    public void setCollField013(LocalDate collField013) { this.collField013 = collField013; }

    public Boolean getCollField014() { return collField014; }
    public void setCollField014(Boolean collField014) { this.collField014 = collField014; }

    public String getCollField015() { return collField015; }
    public void setCollField015(String collField015) { this.collField015 = collField015; }

    @Override
    public String toString() {
        return "CollectionsDto032{" +
            "collField000=" + collField000 + ", " +
            "collField001=" + collField001 + ", " +
            "collField002=" + collField002 + ", " +
            "collField003=" + collField003 + ", " +
            "collField004=" + collField004 + ", " +
            "}";
    }
}
