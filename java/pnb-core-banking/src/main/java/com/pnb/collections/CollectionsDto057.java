package com.pnb.collections;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * CollectionsDto057 — Data Transfer Object for collections operations.
 * Variant 57 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CollectionsDto057 {

    @JsonProperty("collField000")
    private Long collField000;

    @JsonProperty("collField001")
    private Boolean collField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("collField002")
    private BigDecimal collField002;

    @JsonProperty("collField003")
    private Long collField003;

    @JsonProperty("collField004")
    private LocalDate collField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("collField005")
    private BigDecimal collField005;

    @JsonProperty("collField006")
    private Double collField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("collField007")
    private BigDecimal collField007;

    @JsonProperty("collField008")
    private Double collField008;

    @JsonProperty("collField009")
    private Boolean collField009;

    @JsonProperty("collField010")
    private LocalDate collField010;

    @JsonProperty("collField011")
    private Double collField011;

    @Size(max = 200)
    @JsonProperty("collField012")
    private String collField012;

    @DecimalMin(value = "0.00")
    @JsonProperty("collField013")
    private BigDecimal collField013;

    @JsonProperty("collField014")
    private LocalDate collField014;

    @DecimalMin(value = "0.00")
    @JsonProperty("collField015")
    private BigDecimal collField015;

    @JsonProperty("collField016")
    private Boolean collField016;

    public CollectionsDto057() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final CollectionsDto057 instance = new CollectionsDto057();

        public Builder collField000(Long val) { instance.collField000 = val; return this; }
        public Builder collField001(Boolean val) { instance.collField001 = val; return this; }
        public Builder collField002(BigDecimal val) { instance.collField002 = val; return this; }
        public Builder collField003(Long val) { instance.collField003 = val; return this; }
        public Builder collField004(LocalDate val) { instance.collField004 = val; return this; }
        public Builder collField005(BigDecimal val) { instance.collField005 = val; return this; }
        public Builder collField006(Double val) { instance.collField006 = val; return this; }
        public Builder collField007(BigDecimal val) { instance.collField007 = val; return this; }
        public Builder collField008(Double val) { instance.collField008 = val; return this; }
        public Builder collField009(Boolean val) { instance.collField009 = val; return this; }
        public Builder collField010(LocalDate val) { instance.collField010 = val; return this; }
        public Builder collField011(Double val) { instance.collField011 = val; return this; }
        public Builder collField012(String val) { instance.collField012 = val; return this; }
        public Builder collField013(BigDecimal val) { instance.collField013 = val; return this; }
        public Builder collField014(LocalDate val) { instance.collField014 = val; return this; }
        public Builder collField015(BigDecimal val) { instance.collField015 = val; return this; }
        public Builder collField016(Boolean val) { instance.collField016 = val; return this; }
        public CollectionsDto057 build() { return instance; }
    }

    public Long getCollField000() { return collField000; }
    public void setCollField000(Long collField000) { this.collField000 = collField000; }

    public Boolean getCollField001() { return collField001; }
    public void setCollField001(Boolean collField001) { this.collField001 = collField001; }

    public BigDecimal getCollField002() { return collField002; }
    public void setCollField002(BigDecimal collField002) { this.collField002 = collField002; }

    public Long getCollField003() { return collField003; }
    public void setCollField003(Long collField003) { this.collField003 = collField003; }

    public LocalDate getCollField004() { return collField004; }
    public void setCollField004(LocalDate collField004) { this.collField004 = collField004; }

    public BigDecimal getCollField005() { return collField005; }
    public void setCollField005(BigDecimal collField005) { this.collField005 = collField005; }

    public Double getCollField006() { return collField006; }
    public void setCollField006(Double collField006) { this.collField006 = collField006; }

    public BigDecimal getCollField007() { return collField007; }
    public void setCollField007(BigDecimal collField007) { this.collField007 = collField007; }

    public Double getCollField008() { return collField008; }
    public void setCollField008(Double collField008) { this.collField008 = collField008; }

    public Boolean getCollField009() { return collField009; }
    public void setCollField009(Boolean collField009) { this.collField009 = collField009; }

    public LocalDate getCollField010() { return collField010; }
    public void setCollField010(LocalDate collField010) { this.collField010 = collField010; }

    public Double getCollField011() { return collField011; }
    public void setCollField011(Double collField011) { this.collField011 = collField011; }

    public String getCollField012() { return collField012; }
    public void setCollField012(String collField012) { this.collField012 = collField012; }

    public BigDecimal getCollField013() { return collField013; }
    public void setCollField013(BigDecimal collField013) { this.collField013 = collField013; }

    public LocalDate getCollField014() { return collField014; }
    public void setCollField014(LocalDate collField014) { this.collField014 = collField014; }

    public BigDecimal getCollField015() { return collField015; }
    public void setCollField015(BigDecimal collField015) { this.collField015 = collField015; }

    public Boolean getCollField016() { return collField016; }
    public void setCollField016(Boolean collField016) { this.collField016 = collField016; }

    @Override
    public String toString() {
        return "CollectionsDto057{" +
            "collField000=" + collField000 + ", " +
            "collField001=" + collField001 + ", " +
            "collField002=" + collField002 + ", " +
            "collField003=" + collField003 + ", " +
            "collField004=" + collField004 + ", " +
            "}";
    }
}
