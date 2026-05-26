package com.pnb.collections;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * CollectionsDto034 — Data Transfer Object for collections operations.
 * Variant 34 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CollectionsDto034 {

    @DecimalMin(value = "0.00")
    @JsonProperty("collField000")
    private BigDecimal collField000;

    @JsonProperty("collField001")
    private Boolean collField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("collField002")
    private BigDecimal collField002;

    @JsonProperty("collField003")
    private Long collField003;

    @JsonProperty("collField004")
    private LocalDate collField004;

    @JsonProperty("collField005")
    private Double collField005;

    @JsonProperty("collField006")
    private Long collField006;

    @JsonProperty("collField007")
    private Boolean collField007;

    @Size(max = 100)
    @JsonProperty("collField008")
    private String collField008;

    @JsonProperty("collField009")
    private Long collField009;

    @Size(max = 60)
    @JsonProperty("collField010")
    private String collField010;

    @Size(max = 60)
    @JsonProperty("collField011")
    private String collField011;

    @JsonProperty("collField012")
    private LocalDate collField012;

    @JsonProperty("collField013")
    private LocalDate collField013;

    @DecimalMin(value = "0.00")
    @JsonProperty("collField014")
    private BigDecimal collField014;

    @JsonProperty("collField015")
    private Boolean collField015;

    @JsonProperty("collField016")
    private LocalDate collField016;

    @JsonProperty("collField017")
    private Integer collField017;

    public CollectionsDto034() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final CollectionsDto034 instance = new CollectionsDto034();

        public Builder collField000(BigDecimal val) { instance.collField000 = val; return this; }
        public Builder collField001(Boolean val) { instance.collField001 = val; return this; }
        public Builder collField002(BigDecimal val) { instance.collField002 = val; return this; }
        public Builder collField003(Long val) { instance.collField003 = val; return this; }
        public Builder collField004(LocalDate val) { instance.collField004 = val; return this; }
        public Builder collField005(Double val) { instance.collField005 = val; return this; }
        public Builder collField006(Long val) { instance.collField006 = val; return this; }
        public Builder collField007(Boolean val) { instance.collField007 = val; return this; }
        public Builder collField008(String val) { instance.collField008 = val; return this; }
        public Builder collField009(Long val) { instance.collField009 = val; return this; }
        public Builder collField010(String val) { instance.collField010 = val; return this; }
        public Builder collField011(String val) { instance.collField011 = val; return this; }
        public Builder collField012(LocalDate val) { instance.collField012 = val; return this; }
        public Builder collField013(LocalDate val) { instance.collField013 = val; return this; }
        public Builder collField014(BigDecimal val) { instance.collField014 = val; return this; }
        public Builder collField015(Boolean val) { instance.collField015 = val; return this; }
        public Builder collField016(LocalDate val) { instance.collField016 = val; return this; }
        public Builder collField017(Integer val) { instance.collField017 = val; return this; }
        public CollectionsDto034 build() { return instance; }
    }

    public BigDecimal getCollField000() { return collField000; }
    public void setCollField000(BigDecimal collField000) { this.collField000 = collField000; }

    public Boolean getCollField001() { return collField001; }
    public void setCollField001(Boolean collField001) { this.collField001 = collField001; }

    public BigDecimal getCollField002() { return collField002; }
    public void setCollField002(BigDecimal collField002) { this.collField002 = collField002; }

    public Long getCollField003() { return collField003; }
    public void setCollField003(Long collField003) { this.collField003 = collField003; }

    public LocalDate getCollField004() { return collField004; }
    public void setCollField004(LocalDate collField004) { this.collField004 = collField004; }

    public Double getCollField005() { return collField005; }
    public void setCollField005(Double collField005) { this.collField005 = collField005; }

    public Long getCollField006() { return collField006; }
    public void setCollField006(Long collField006) { this.collField006 = collField006; }

    public Boolean getCollField007() { return collField007; }
    public void setCollField007(Boolean collField007) { this.collField007 = collField007; }

    public String getCollField008() { return collField008; }
    public void setCollField008(String collField008) { this.collField008 = collField008; }

    public Long getCollField009() { return collField009; }
    public void setCollField009(Long collField009) { this.collField009 = collField009; }

    public String getCollField010() { return collField010; }
    public void setCollField010(String collField010) { this.collField010 = collField010; }

    public String getCollField011() { return collField011; }
    public void setCollField011(String collField011) { this.collField011 = collField011; }

    public LocalDate getCollField012() { return collField012; }
    public void setCollField012(LocalDate collField012) { this.collField012 = collField012; }

    public LocalDate getCollField013() { return collField013; }
    public void setCollField013(LocalDate collField013) { this.collField013 = collField013; }

    public BigDecimal getCollField014() { return collField014; }
    public void setCollField014(BigDecimal collField014) { this.collField014 = collField014; }

    public Boolean getCollField015() { return collField015; }
    public void setCollField015(Boolean collField015) { this.collField015 = collField015; }

    public LocalDate getCollField016() { return collField016; }
    public void setCollField016(LocalDate collField016) { this.collField016 = collField016; }

    public Integer getCollField017() { return collField017; }
    public void setCollField017(Integer collField017) { this.collField017 = collField017; }

    @Override
    public String toString() {
        return "CollectionsDto034{" +
            "collField000=" + collField000 + ", " +
            "collField001=" + collField001 + ", " +
            "collField002=" + collField002 + ", " +
            "collField003=" + collField003 + ", " +
            "collField004=" + collField004 + ", " +
            "}";
    }
}
