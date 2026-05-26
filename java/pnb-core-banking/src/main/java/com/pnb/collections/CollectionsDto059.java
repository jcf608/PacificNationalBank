package com.pnb.collections;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * CollectionsDto059 — Data Transfer Object for collections operations.
 * Variant 59 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CollectionsDto059 {

    @JsonProperty("collField000")
    private LocalDate collField000;

    @JsonProperty("collField001")
    private Double collField001;

    @JsonProperty("collField002")
    private Long collField002;

    @JsonProperty("collField003")
    private Double collField003;

    @JsonProperty("collField004")
    private LocalDate collField004;

    @JsonProperty("collField005")
    private Boolean collField005;

    @JsonProperty("collField006")
    private Double collField006;

    @Size(max = 40)
    @JsonProperty("collField007")
    private String collField007;

    @JsonProperty("collField008")
    private LocalDate collField008;

    @DecimalMin(value = "0.00")
    @JsonProperty("collField009")
    private BigDecimal collField009;

    @JsonProperty("collField010")
    private Long collField010;

    @Size(max = 60)
    @JsonProperty("collField011")
    private String collField011;

    @JsonProperty("collField012")
    private Long collField012;

    @JsonProperty("collField013")
    private Boolean collField013;

    @JsonProperty("collField014")
    private Boolean collField014;

    @JsonProperty("collField015")
    private Double collField015;

    @JsonProperty("collField016")
    private LocalDate collField016;

    @JsonProperty("collField017")
    private Double collField017;

    @DecimalMin(value = "0.00")
    @JsonProperty("collField018")
    private BigDecimal collField018;

    public CollectionsDto059() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final CollectionsDto059 instance = new CollectionsDto059();

        public Builder collField000(LocalDate val) { instance.collField000 = val; return this; }
        public Builder collField001(Double val) { instance.collField001 = val; return this; }
        public Builder collField002(Long val) { instance.collField002 = val; return this; }
        public Builder collField003(Double val) { instance.collField003 = val; return this; }
        public Builder collField004(LocalDate val) { instance.collField004 = val; return this; }
        public Builder collField005(Boolean val) { instance.collField005 = val; return this; }
        public Builder collField006(Double val) { instance.collField006 = val; return this; }
        public Builder collField007(String val) { instance.collField007 = val; return this; }
        public Builder collField008(LocalDate val) { instance.collField008 = val; return this; }
        public Builder collField009(BigDecimal val) { instance.collField009 = val; return this; }
        public Builder collField010(Long val) { instance.collField010 = val; return this; }
        public Builder collField011(String val) { instance.collField011 = val; return this; }
        public Builder collField012(Long val) { instance.collField012 = val; return this; }
        public Builder collField013(Boolean val) { instance.collField013 = val; return this; }
        public Builder collField014(Boolean val) { instance.collField014 = val; return this; }
        public Builder collField015(Double val) { instance.collField015 = val; return this; }
        public Builder collField016(LocalDate val) { instance.collField016 = val; return this; }
        public Builder collField017(Double val) { instance.collField017 = val; return this; }
        public Builder collField018(BigDecimal val) { instance.collField018 = val; return this; }
        public CollectionsDto059 build() { return instance; }
    }

    public LocalDate getCollField000() { return collField000; }
    public void setCollField000(LocalDate collField000) { this.collField000 = collField000; }

    public Double getCollField001() { return collField001; }
    public void setCollField001(Double collField001) { this.collField001 = collField001; }

    public Long getCollField002() { return collField002; }
    public void setCollField002(Long collField002) { this.collField002 = collField002; }

    public Double getCollField003() { return collField003; }
    public void setCollField003(Double collField003) { this.collField003 = collField003; }

    public LocalDate getCollField004() { return collField004; }
    public void setCollField004(LocalDate collField004) { this.collField004 = collField004; }

    public Boolean getCollField005() { return collField005; }
    public void setCollField005(Boolean collField005) { this.collField005 = collField005; }

    public Double getCollField006() { return collField006; }
    public void setCollField006(Double collField006) { this.collField006 = collField006; }

    public String getCollField007() { return collField007; }
    public void setCollField007(String collField007) { this.collField007 = collField007; }

    public LocalDate getCollField008() { return collField008; }
    public void setCollField008(LocalDate collField008) { this.collField008 = collField008; }

    public BigDecimal getCollField009() { return collField009; }
    public void setCollField009(BigDecimal collField009) { this.collField009 = collField009; }

    public Long getCollField010() { return collField010; }
    public void setCollField010(Long collField010) { this.collField010 = collField010; }

    public String getCollField011() { return collField011; }
    public void setCollField011(String collField011) { this.collField011 = collField011; }

    public Long getCollField012() { return collField012; }
    public void setCollField012(Long collField012) { this.collField012 = collField012; }

    public Boolean getCollField013() { return collField013; }
    public void setCollField013(Boolean collField013) { this.collField013 = collField013; }

    public Boolean getCollField014() { return collField014; }
    public void setCollField014(Boolean collField014) { this.collField014 = collField014; }

    public Double getCollField015() { return collField015; }
    public void setCollField015(Double collField015) { this.collField015 = collField015; }

    public LocalDate getCollField016() { return collField016; }
    public void setCollField016(LocalDate collField016) { this.collField016 = collField016; }

    public Double getCollField017() { return collField017; }
    public void setCollField017(Double collField017) { this.collField017 = collField017; }

    public BigDecimal getCollField018() { return collField018; }
    public void setCollField018(BigDecimal collField018) { this.collField018 = collField018; }

    @Override
    public String toString() {
        return "CollectionsDto059{" +
            "collField000=" + collField000 + ", " +
            "collField001=" + collField001 + ", " +
            "collField002=" + collField002 + ", " +
            "collField003=" + collField003 + ", " +
            "collField004=" + collField004 + ", " +
            "}";
    }
}
