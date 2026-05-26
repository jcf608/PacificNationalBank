package com.pnb.collections;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * CollectionsDto022 — Data Transfer Object for collections operations.
 * Variant 22 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CollectionsDto022 {

    @JsonProperty("collField000")
    private Boolean collField000;

    @JsonProperty("collField001")
    private Boolean collField001;

    @JsonProperty("collField002")
    private LocalDate collField002;

    @JsonProperty("collField003")
    private Integer collField003;

    @JsonProperty("collField004")
    private Long collField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("collField005")
    private BigDecimal collField005;

    @JsonProperty("collField006")
    private LocalDate collField006;

    @JsonProperty("collField007")
    private Integer collField007;

    @Size(max = 20)
    @JsonProperty("collField008")
    private String collField008;

    @JsonProperty("collField009")
    private Boolean collField009;

    @Size(max = 60)
    @JsonProperty("collField010")
    private String collField010;

    @DecimalMin(value = "0.00")
    @JsonProperty("collField011")
    private BigDecimal collField011;

    @Size(max = 200)
    @JsonProperty("collField012")
    private String collField012;

    @JsonProperty("collField013")
    private Double collField013;

    @JsonProperty("collField014")
    private Boolean collField014;

    @Size(max = 60)
    @JsonProperty("collField015")
    private String collField015;

    @DecimalMin(value = "0.00")
    @JsonProperty("collField016")
    private BigDecimal collField016;

    @Size(max = 40)
    @JsonProperty("collField017")
    private String collField017;

    public CollectionsDto022() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final CollectionsDto022 instance = new CollectionsDto022();

        public Builder collField000(Boolean val) { instance.collField000 = val; return this; }
        public Builder collField001(Boolean val) { instance.collField001 = val; return this; }
        public Builder collField002(LocalDate val) { instance.collField002 = val; return this; }
        public Builder collField003(Integer val) { instance.collField003 = val; return this; }
        public Builder collField004(Long val) { instance.collField004 = val; return this; }
        public Builder collField005(BigDecimal val) { instance.collField005 = val; return this; }
        public Builder collField006(LocalDate val) { instance.collField006 = val; return this; }
        public Builder collField007(Integer val) { instance.collField007 = val; return this; }
        public Builder collField008(String val) { instance.collField008 = val; return this; }
        public Builder collField009(Boolean val) { instance.collField009 = val; return this; }
        public Builder collField010(String val) { instance.collField010 = val; return this; }
        public Builder collField011(BigDecimal val) { instance.collField011 = val; return this; }
        public Builder collField012(String val) { instance.collField012 = val; return this; }
        public Builder collField013(Double val) { instance.collField013 = val; return this; }
        public Builder collField014(Boolean val) { instance.collField014 = val; return this; }
        public Builder collField015(String val) { instance.collField015 = val; return this; }
        public Builder collField016(BigDecimal val) { instance.collField016 = val; return this; }
        public Builder collField017(String val) { instance.collField017 = val; return this; }
        public CollectionsDto022 build() { return instance; }
    }

    public Boolean getCollField000() { return collField000; }
    public void setCollField000(Boolean collField000) { this.collField000 = collField000; }

    public Boolean getCollField001() { return collField001; }
    public void setCollField001(Boolean collField001) { this.collField001 = collField001; }

    public LocalDate getCollField002() { return collField002; }
    public void setCollField002(LocalDate collField002) { this.collField002 = collField002; }

    public Integer getCollField003() { return collField003; }
    public void setCollField003(Integer collField003) { this.collField003 = collField003; }

    public Long getCollField004() { return collField004; }
    public void setCollField004(Long collField004) { this.collField004 = collField004; }

    public BigDecimal getCollField005() { return collField005; }
    public void setCollField005(BigDecimal collField005) { this.collField005 = collField005; }

    public LocalDate getCollField006() { return collField006; }
    public void setCollField006(LocalDate collField006) { this.collField006 = collField006; }

    public Integer getCollField007() { return collField007; }
    public void setCollField007(Integer collField007) { this.collField007 = collField007; }

    public String getCollField008() { return collField008; }
    public void setCollField008(String collField008) { this.collField008 = collField008; }

    public Boolean getCollField009() { return collField009; }
    public void setCollField009(Boolean collField009) { this.collField009 = collField009; }

    public String getCollField010() { return collField010; }
    public void setCollField010(String collField010) { this.collField010 = collField010; }

    public BigDecimal getCollField011() { return collField011; }
    public void setCollField011(BigDecimal collField011) { this.collField011 = collField011; }

    public String getCollField012() { return collField012; }
    public void setCollField012(String collField012) { this.collField012 = collField012; }

    public Double getCollField013() { return collField013; }
    public void setCollField013(Double collField013) { this.collField013 = collField013; }

    public Boolean getCollField014() { return collField014; }
    public void setCollField014(Boolean collField014) { this.collField014 = collField014; }

    public String getCollField015() { return collField015; }
    public void setCollField015(String collField015) { this.collField015 = collField015; }

    public BigDecimal getCollField016() { return collField016; }
    public void setCollField016(BigDecimal collField016) { this.collField016 = collField016; }

    public String getCollField017() { return collField017; }
    public void setCollField017(String collField017) { this.collField017 = collField017; }

    @Override
    public String toString() {
        return "CollectionsDto022{" +
            "collField000=" + collField000 + ", " +
            "collField001=" + collField001 + ", " +
            "collField002=" + collField002 + ", " +
            "collField003=" + collField003 + ", " +
            "collField004=" + collField004 + ", " +
            "}";
    }
}
