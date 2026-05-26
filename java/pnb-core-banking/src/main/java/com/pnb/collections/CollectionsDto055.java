package com.pnb.collections;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * CollectionsDto055 — Data Transfer Object for collections operations.
 * Variant 55 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CollectionsDto055 {

    @DecimalMin(value = "0.00")
    @JsonProperty("collField000")
    private BigDecimal collField000;

    @DecimalMin(value = "0.00")
    @JsonProperty("collField001")
    private BigDecimal collField001;

    @JsonProperty("collField002")
    private Long collField002;

    @JsonProperty("collField003")
    private Boolean collField003;

    @JsonProperty("collField004")
    private Long collField004;

    @JsonProperty("collField005")
    private Long collField005;

    @JsonProperty("collField006")
    private Integer collField006;

    @Size(max = 60)
    @JsonProperty("collField007")
    private String collField007;

    @Size(max = 20)
    @JsonProperty("collField008")
    private String collField008;

    @JsonProperty("collField009")
    private LocalDate collField009;

    @JsonProperty("collField010")
    private LocalDate collField010;

    @Size(max = 60)
    @JsonProperty("collField011")
    private String collField011;

    @JsonProperty("collField012")
    private Long collField012;

    @JsonProperty("collField013")
    private Boolean collField013;

    @JsonProperty("collField014")
    private Long collField014;

    public CollectionsDto055() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final CollectionsDto055 instance = new CollectionsDto055();

        public Builder collField000(BigDecimal val) { instance.collField000 = val; return this; }
        public Builder collField001(BigDecimal val) { instance.collField001 = val; return this; }
        public Builder collField002(Long val) { instance.collField002 = val; return this; }
        public Builder collField003(Boolean val) { instance.collField003 = val; return this; }
        public Builder collField004(Long val) { instance.collField004 = val; return this; }
        public Builder collField005(Long val) { instance.collField005 = val; return this; }
        public Builder collField006(Integer val) { instance.collField006 = val; return this; }
        public Builder collField007(String val) { instance.collField007 = val; return this; }
        public Builder collField008(String val) { instance.collField008 = val; return this; }
        public Builder collField009(LocalDate val) { instance.collField009 = val; return this; }
        public Builder collField010(LocalDate val) { instance.collField010 = val; return this; }
        public Builder collField011(String val) { instance.collField011 = val; return this; }
        public Builder collField012(Long val) { instance.collField012 = val; return this; }
        public Builder collField013(Boolean val) { instance.collField013 = val; return this; }
        public Builder collField014(Long val) { instance.collField014 = val; return this; }
        public CollectionsDto055 build() { return instance; }
    }

    public BigDecimal getCollField000() { return collField000; }
    public void setCollField000(BigDecimal collField000) { this.collField000 = collField000; }

    public BigDecimal getCollField001() { return collField001; }
    public void setCollField001(BigDecimal collField001) { this.collField001 = collField001; }

    public Long getCollField002() { return collField002; }
    public void setCollField002(Long collField002) { this.collField002 = collField002; }

    public Boolean getCollField003() { return collField003; }
    public void setCollField003(Boolean collField003) { this.collField003 = collField003; }

    public Long getCollField004() { return collField004; }
    public void setCollField004(Long collField004) { this.collField004 = collField004; }

    public Long getCollField005() { return collField005; }
    public void setCollField005(Long collField005) { this.collField005 = collField005; }

    public Integer getCollField006() { return collField006; }
    public void setCollField006(Integer collField006) { this.collField006 = collField006; }

    public String getCollField007() { return collField007; }
    public void setCollField007(String collField007) { this.collField007 = collField007; }

    public String getCollField008() { return collField008; }
    public void setCollField008(String collField008) { this.collField008 = collField008; }

    public LocalDate getCollField009() { return collField009; }
    public void setCollField009(LocalDate collField009) { this.collField009 = collField009; }

    public LocalDate getCollField010() { return collField010; }
    public void setCollField010(LocalDate collField010) { this.collField010 = collField010; }

    public String getCollField011() { return collField011; }
    public void setCollField011(String collField011) { this.collField011 = collField011; }

    public Long getCollField012() { return collField012; }
    public void setCollField012(Long collField012) { this.collField012 = collField012; }

    public Boolean getCollField013() { return collField013; }
    public void setCollField013(Boolean collField013) { this.collField013 = collField013; }

    public Long getCollField014() { return collField014; }
    public void setCollField014(Long collField014) { this.collField014 = collField014; }

    @Override
    public String toString() {
        return "CollectionsDto055{" +
            "collField000=" + collField000 + ", " +
            "collField001=" + collField001 + ", " +
            "collField002=" + collField002 + ", " +
            "collField003=" + collField003 + ", " +
            "collField004=" + collField004 + ", " +
            "}";
    }
}
