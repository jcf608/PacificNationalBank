package com.pnb.collections;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * CollectionsDto043 — Data Transfer Object for collections operations.
 * Variant 43 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CollectionsDto043 {

    @JsonProperty("collField000")
    private LocalDate collField000;

    @JsonProperty("collField001")
    private Double collField001;

    @JsonProperty("collField002")
    private Boolean collField002;

    @DecimalMin(value = "0.00")
    @JsonProperty("collField003")
    private BigDecimal collField003;

    @JsonProperty("collField004")
    private Boolean collField004;

    @JsonProperty("collField005")
    private Long collField005;

    @JsonProperty("collField006")
    private Long collField006;

    @JsonProperty("collField007")
    private Long collField007;

    @Size(max = 200)
    @JsonProperty("collField008")
    private String collField008;

    @JsonProperty("collField009")
    private Integer collField009;

    @JsonProperty("collField010")
    private Integer collField010;

    @Size(max = 100)
    @JsonProperty("collField011")
    private String collField011;

    @JsonProperty("collField012")
    private LocalDate collField012;

    @JsonProperty("collField013")
    private LocalDate collField013;

    @JsonProperty("collField014")
    private Boolean collField014;

    public CollectionsDto043() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final CollectionsDto043 instance = new CollectionsDto043();

        public Builder collField000(LocalDate val) { instance.collField000 = val; return this; }
        public Builder collField001(Double val) { instance.collField001 = val; return this; }
        public Builder collField002(Boolean val) { instance.collField002 = val; return this; }
        public Builder collField003(BigDecimal val) { instance.collField003 = val; return this; }
        public Builder collField004(Boolean val) { instance.collField004 = val; return this; }
        public Builder collField005(Long val) { instance.collField005 = val; return this; }
        public Builder collField006(Long val) { instance.collField006 = val; return this; }
        public Builder collField007(Long val) { instance.collField007 = val; return this; }
        public Builder collField008(String val) { instance.collField008 = val; return this; }
        public Builder collField009(Integer val) { instance.collField009 = val; return this; }
        public Builder collField010(Integer val) { instance.collField010 = val; return this; }
        public Builder collField011(String val) { instance.collField011 = val; return this; }
        public Builder collField012(LocalDate val) { instance.collField012 = val; return this; }
        public Builder collField013(LocalDate val) { instance.collField013 = val; return this; }
        public Builder collField014(Boolean val) { instance.collField014 = val; return this; }
        public CollectionsDto043 build() { return instance; }
    }

    public LocalDate getCollField000() { return collField000; }
    public void setCollField000(LocalDate collField000) { this.collField000 = collField000; }

    public Double getCollField001() { return collField001; }
    public void setCollField001(Double collField001) { this.collField001 = collField001; }

    public Boolean getCollField002() { return collField002; }
    public void setCollField002(Boolean collField002) { this.collField002 = collField002; }

    public BigDecimal getCollField003() { return collField003; }
    public void setCollField003(BigDecimal collField003) { this.collField003 = collField003; }

    public Boolean getCollField004() { return collField004; }
    public void setCollField004(Boolean collField004) { this.collField004 = collField004; }

    public Long getCollField005() { return collField005; }
    public void setCollField005(Long collField005) { this.collField005 = collField005; }

    public Long getCollField006() { return collField006; }
    public void setCollField006(Long collField006) { this.collField006 = collField006; }

    public Long getCollField007() { return collField007; }
    public void setCollField007(Long collField007) { this.collField007 = collField007; }

    public String getCollField008() { return collField008; }
    public void setCollField008(String collField008) { this.collField008 = collField008; }

    public Integer getCollField009() { return collField009; }
    public void setCollField009(Integer collField009) { this.collField009 = collField009; }

    public Integer getCollField010() { return collField010; }
    public void setCollField010(Integer collField010) { this.collField010 = collField010; }

    public String getCollField011() { return collField011; }
    public void setCollField011(String collField011) { this.collField011 = collField011; }

    public LocalDate getCollField012() { return collField012; }
    public void setCollField012(LocalDate collField012) { this.collField012 = collField012; }

    public LocalDate getCollField013() { return collField013; }
    public void setCollField013(LocalDate collField013) { this.collField013 = collField013; }

    public Boolean getCollField014() { return collField014; }
    public void setCollField014(Boolean collField014) { this.collField014 = collField014; }

    @Override
    public String toString() {
        return "CollectionsDto043{" +
            "collField000=" + collField000 + ", " +
            "collField001=" + collField001 + ", " +
            "collField002=" + collField002 + ", " +
            "collField003=" + collField003 + ", " +
            "collField004=" + collField004 + ", " +
            "}";
    }
}
