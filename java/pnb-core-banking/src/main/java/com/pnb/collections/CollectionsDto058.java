package com.pnb.collections;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * CollectionsDto058 — Data Transfer Object for collections operations.
 * Variant 58 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CollectionsDto058 {

    @JsonProperty("collField000")
    private Boolean collField000;

    @JsonProperty("collField001")
    private LocalDate collField001;

    @Size(max = 60)
    @JsonProperty("collField002")
    private String collField002;

    @JsonProperty("collField003")
    private Long collField003;

    @JsonProperty("collField004")
    private Long collField004;

    @JsonProperty("collField005")
    private Double collField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("collField006")
    private BigDecimal collField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("collField007")
    private BigDecimal collField007;

    @JsonProperty("collField008")
    private Long collField008;

    @Size(max = 60)
    @JsonProperty("collField009")
    private String collField009;

    @JsonProperty("collField010")
    private LocalDate collField010;

    @JsonProperty("collField011")
    private LocalDate collField011;

    @DecimalMin(value = "0.00")
    @JsonProperty("collField012")
    private BigDecimal collField012;

    @JsonProperty("collField013")
    private Integer collField013;

    @JsonProperty("collField014")
    private Long collField014;

    @JsonProperty("collField015")
    private Double collField015;

    @Size(max = 200)
    @JsonProperty("collField016")
    private String collField016;

    @Size(max = 20)
    @JsonProperty("collField017")
    private String collField017;

    public CollectionsDto058() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final CollectionsDto058 instance = new CollectionsDto058();

        public Builder collField000(Boolean val) { instance.collField000 = val; return this; }
        public Builder collField001(LocalDate val) { instance.collField001 = val; return this; }
        public Builder collField002(String val) { instance.collField002 = val; return this; }
        public Builder collField003(Long val) { instance.collField003 = val; return this; }
        public Builder collField004(Long val) { instance.collField004 = val; return this; }
        public Builder collField005(Double val) { instance.collField005 = val; return this; }
        public Builder collField006(BigDecimal val) { instance.collField006 = val; return this; }
        public Builder collField007(BigDecimal val) { instance.collField007 = val; return this; }
        public Builder collField008(Long val) { instance.collField008 = val; return this; }
        public Builder collField009(String val) { instance.collField009 = val; return this; }
        public Builder collField010(LocalDate val) { instance.collField010 = val; return this; }
        public Builder collField011(LocalDate val) { instance.collField011 = val; return this; }
        public Builder collField012(BigDecimal val) { instance.collField012 = val; return this; }
        public Builder collField013(Integer val) { instance.collField013 = val; return this; }
        public Builder collField014(Long val) { instance.collField014 = val; return this; }
        public Builder collField015(Double val) { instance.collField015 = val; return this; }
        public Builder collField016(String val) { instance.collField016 = val; return this; }
        public Builder collField017(String val) { instance.collField017 = val; return this; }
        public CollectionsDto058 build() { return instance; }
    }

    public Boolean getCollField000() { return collField000; }
    public void setCollField000(Boolean collField000) { this.collField000 = collField000; }

    public LocalDate getCollField001() { return collField001; }
    public void setCollField001(LocalDate collField001) { this.collField001 = collField001; }

    public String getCollField002() { return collField002; }
    public void setCollField002(String collField002) { this.collField002 = collField002; }

    public Long getCollField003() { return collField003; }
    public void setCollField003(Long collField003) { this.collField003 = collField003; }

    public Long getCollField004() { return collField004; }
    public void setCollField004(Long collField004) { this.collField004 = collField004; }

    public Double getCollField005() { return collField005; }
    public void setCollField005(Double collField005) { this.collField005 = collField005; }

    public BigDecimal getCollField006() { return collField006; }
    public void setCollField006(BigDecimal collField006) { this.collField006 = collField006; }

    public BigDecimal getCollField007() { return collField007; }
    public void setCollField007(BigDecimal collField007) { this.collField007 = collField007; }

    public Long getCollField008() { return collField008; }
    public void setCollField008(Long collField008) { this.collField008 = collField008; }

    public String getCollField009() { return collField009; }
    public void setCollField009(String collField009) { this.collField009 = collField009; }

    public LocalDate getCollField010() { return collField010; }
    public void setCollField010(LocalDate collField010) { this.collField010 = collField010; }

    public LocalDate getCollField011() { return collField011; }
    public void setCollField011(LocalDate collField011) { this.collField011 = collField011; }

    public BigDecimal getCollField012() { return collField012; }
    public void setCollField012(BigDecimal collField012) { this.collField012 = collField012; }

    public Integer getCollField013() { return collField013; }
    public void setCollField013(Integer collField013) { this.collField013 = collField013; }

    public Long getCollField014() { return collField014; }
    public void setCollField014(Long collField014) { this.collField014 = collField014; }

    public Double getCollField015() { return collField015; }
    public void setCollField015(Double collField015) { this.collField015 = collField015; }

    public String getCollField016() { return collField016; }
    public void setCollField016(String collField016) { this.collField016 = collField016; }

    public String getCollField017() { return collField017; }
    public void setCollField017(String collField017) { this.collField017 = collField017; }

    @Override
    public String toString() {
        return "CollectionsDto058{" +
            "collField000=" + collField000 + ", " +
            "collField001=" + collField001 + ", " +
            "collField002=" + collField002 + ", " +
            "collField003=" + collField003 + ", " +
            "collField004=" + collField004 + ", " +
            "}";
    }
}
