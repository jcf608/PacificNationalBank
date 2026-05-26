package com.pnb.collections;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * CollectionsDto046 — Data Transfer Object for collections operations.
 * Variant 46 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CollectionsDto046 {

    @Size(max = 20)
    @JsonProperty("collField000")
    private String collField000;

    @JsonProperty("collField001")
    private Integer collField001;

    @JsonProperty("collField002")
    private Long collField002;

    @Size(max = 100)
    @JsonProperty("collField003")
    private String collField003;

    @Size(max = 200)
    @JsonProperty("collField004")
    private String collField004;

    @JsonProperty("collField005")
    private Double collField005;

    @JsonProperty("collField006")
    private Boolean collField006;

    @JsonProperty("collField007")
    private Long collField007;

    @JsonProperty("collField008")
    private Long collField008;

    @JsonProperty("collField009")
    private Double collField009;

    @JsonProperty("collField010")
    private Integer collField010;

    @Size(max = 200)
    @JsonProperty("collField011")
    private String collField011;

    @JsonProperty("collField012")
    private Long collField012;

    @Size(max = 60)
    @JsonProperty("collField013")
    private String collField013;

    @JsonProperty("collField014")
    private Integer collField014;

    @JsonProperty("collField015")
    private Integer collField015;

    @Size(max = 100)
    @JsonProperty("collField016")
    private String collField016;

    @JsonProperty("collField017")
    private Boolean collField017;

    public CollectionsDto046() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final CollectionsDto046 instance = new CollectionsDto046();

        public Builder collField000(String val) { instance.collField000 = val; return this; }
        public Builder collField001(Integer val) { instance.collField001 = val; return this; }
        public Builder collField002(Long val) { instance.collField002 = val; return this; }
        public Builder collField003(String val) { instance.collField003 = val; return this; }
        public Builder collField004(String val) { instance.collField004 = val; return this; }
        public Builder collField005(Double val) { instance.collField005 = val; return this; }
        public Builder collField006(Boolean val) { instance.collField006 = val; return this; }
        public Builder collField007(Long val) { instance.collField007 = val; return this; }
        public Builder collField008(Long val) { instance.collField008 = val; return this; }
        public Builder collField009(Double val) { instance.collField009 = val; return this; }
        public Builder collField010(Integer val) { instance.collField010 = val; return this; }
        public Builder collField011(String val) { instance.collField011 = val; return this; }
        public Builder collField012(Long val) { instance.collField012 = val; return this; }
        public Builder collField013(String val) { instance.collField013 = val; return this; }
        public Builder collField014(Integer val) { instance.collField014 = val; return this; }
        public Builder collField015(Integer val) { instance.collField015 = val; return this; }
        public Builder collField016(String val) { instance.collField016 = val; return this; }
        public Builder collField017(Boolean val) { instance.collField017 = val; return this; }
        public CollectionsDto046 build() { return instance; }
    }

    public String getCollField000() { return collField000; }
    public void setCollField000(String collField000) { this.collField000 = collField000; }

    public Integer getCollField001() { return collField001; }
    public void setCollField001(Integer collField001) { this.collField001 = collField001; }

    public Long getCollField002() { return collField002; }
    public void setCollField002(Long collField002) { this.collField002 = collField002; }

    public String getCollField003() { return collField003; }
    public void setCollField003(String collField003) { this.collField003 = collField003; }

    public String getCollField004() { return collField004; }
    public void setCollField004(String collField004) { this.collField004 = collField004; }

    public Double getCollField005() { return collField005; }
    public void setCollField005(Double collField005) { this.collField005 = collField005; }

    public Boolean getCollField006() { return collField006; }
    public void setCollField006(Boolean collField006) { this.collField006 = collField006; }

    public Long getCollField007() { return collField007; }
    public void setCollField007(Long collField007) { this.collField007 = collField007; }

    public Long getCollField008() { return collField008; }
    public void setCollField008(Long collField008) { this.collField008 = collField008; }

    public Double getCollField009() { return collField009; }
    public void setCollField009(Double collField009) { this.collField009 = collField009; }

    public Integer getCollField010() { return collField010; }
    public void setCollField010(Integer collField010) { this.collField010 = collField010; }

    public String getCollField011() { return collField011; }
    public void setCollField011(String collField011) { this.collField011 = collField011; }

    public Long getCollField012() { return collField012; }
    public void setCollField012(Long collField012) { this.collField012 = collField012; }

    public String getCollField013() { return collField013; }
    public void setCollField013(String collField013) { this.collField013 = collField013; }

    public Integer getCollField014() { return collField014; }
    public void setCollField014(Integer collField014) { this.collField014 = collField014; }

    public Integer getCollField015() { return collField015; }
    public void setCollField015(Integer collField015) { this.collField015 = collField015; }

    public String getCollField016() { return collField016; }
    public void setCollField016(String collField016) { this.collField016 = collField016; }

    public Boolean getCollField017() { return collField017; }
    public void setCollField017(Boolean collField017) { this.collField017 = collField017; }

    @Override
    public String toString() {
        return "CollectionsDto046{" +
            "collField000=" + collField000 + ", " +
            "collField001=" + collField001 + ", " +
            "collField002=" + collField002 + ", " +
            "collField003=" + collField003 + ", " +
            "collField004=" + collField004 + ", " +
            "}";
    }
}
