package com.pnb.transaction;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * TransactionDto046 — Data Transfer Object for transaction operations.
 * Variant 46 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransactionDto046 {

    @JsonProperty("tranField000")
    private Long tranField000;

    @JsonProperty("tranField001")
    private Double tranField001;

    @JsonProperty("tranField002")
    private Integer tranField002;

    @JsonProperty("tranField003")
    private Long tranField003;

    @JsonProperty("tranField004")
    private Boolean tranField004;

    @JsonProperty("tranField005")
    private Double tranField005;

    @JsonProperty("tranField006")
    private Long tranField006;

    @JsonProperty("tranField007")
    private Boolean tranField007;

    @DecimalMin(value = "0.00")
    @JsonProperty("tranField008")
    private BigDecimal tranField008;

    @Size(max = 100)
    @JsonProperty("tranField009")
    private String tranField009;

    @JsonProperty("tranField010")
    private Long tranField010;

    @DecimalMin(value = "0.00")
    @JsonProperty("tranField011")
    private BigDecimal tranField011;

    @Size(max = 100)
    @JsonProperty("tranField012")
    private String tranField012;

    @Size(max = 20)
    @JsonProperty("tranField013")
    private String tranField013;

    @JsonProperty("tranField014")
    private Double tranField014;

    @JsonProperty("tranField015")
    private Double tranField015;

    @JsonProperty("tranField016")
    private LocalDate tranField016;

    @JsonProperty("tranField017")
    private Long tranField017;

    public TransactionDto046() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final TransactionDto046 instance = new TransactionDto046();

        public Builder tranField000(Long val) { instance.tranField000 = val; return this; }
        public Builder tranField001(Double val) { instance.tranField001 = val; return this; }
        public Builder tranField002(Integer val) { instance.tranField002 = val; return this; }
        public Builder tranField003(Long val) { instance.tranField003 = val; return this; }
        public Builder tranField004(Boolean val) { instance.tranField004 = val; return this; }
        public Builder tranField005(Double val) { instance.tranField005 = val; return this; }
        public Builder tranField006(Long val) { instance.tranField006 = val; return this; }
        public Builder tranField007(Boolean val) { instance.tranField007 = val; return this; }
        public Builder tranField008(BigDecimal val) { instance.tranField008 = val; return this; }
        public Builder tranField009(String val) { instance.tranField009 = val; return this; }
        public Builder tranField010(Long val) { instance.tranField010 = val; return this; }
        public Builder tranField011(BigDecimal val) { instance.tranField011 = val; return this; }
        public Builder tranField012(String val) { instance.tranField012 = val; return this; }
        public Builder tranField013(String val) { instance.tranField013 = val; return this; }
        public Builder tranField014(Double val) { instance.tranField014 = val; return this; }
        public Builder tranField015(Double val) { instance.tranField015 = val; return this; }
        public Builder tranField016(LocalDate val) { instance.tranField016 = val; return this; }
        public Builder tranField017(Long val) { instance.tranField017 = val; return this; }
        public TransactionDto046 build() { return instance; }
    }

    public Long getTranField000() { return tranField000; }
    public void setTranField000(Long tranField000) { this.tranField000 = tranField000; }

    public Double getTranField001() { return tranField001; }
    public void setTranField001(Double tranField001) { this.tranField001 = tranField001; }

    public Integer getTranField002() { return tranField002; }
    public void setTranField002(Integer tranField002) { this.tranField002 = tranField002; }

    public Long getTranField003() { return tranField003; }
    public void setTranField003(Long tranField003) { this.tranField003 = tranField003; }

    public Boolean getTranField004() { return tranField004; }
    public void setTranField004(Boolean tranField004) { this.tranField004 = tranField004; }

    public Double getTranField005() { return tranField005; }
    public void setTranField005(Double tranField005) { this.tranField005 = tranField005; }

    public Long getTranField006() { return tranField006; }
    public void setTranField006(Long tranField006) { this.tranField006 = tranField006; }

    public Boolean getTranField007() { return tranField007; }
    public void setTranField007(Boolean tranField007) { this.tranField007 = tranField007; }

    public BigDecimal getTranField008() { return tranField008; }
    public void setTranField008(BigDecimal tranField008) { this.tranField008 = tranField008; }

    public String getTranField009() { return tranField009; }
    public void setTranField009(String tranField009) { this.tranField009 = tranField009; }

    public Long getTranField010() { return tranField010; }
    public void setTranField010(Long tranField010) { this.tranField010 = tranField010; }

    public BigDecimal getTranField011() { return tranField011; }
    public void setTranField011(BigDecimal tranField011) { this.tranField011 = tranField011; }

    public String getTranField012() { return tranField012; }
    public void setTranField012(String tranField012) { this.tranField012 = tranField012; }

    public String getTranField013() { return tranField013; }
    public void setTranField013(String tranField013) { this.tranField013 = tranField013; }

    public Double getTranField014() { return tranField014; }
    public void setTranField014(Double tranField014) { this.tranField014 = tranField014; }

    public Double getTranField015() { return tranField015; }
    public void setTranField015(Double tranField015) { this.tranField015 = tranField015; }

    public LocalDate getTranField016() { return tranField016; }
    public void setTranField016(LocalDate tranField016) { this.tranField016 = tranField016; }

    public Long getTranField017() { return tranField017; }
    public void setTranField017(Long tranField017) { this.tranField017 = tranField017; }

    @Override
    public String toString() {
        return "TransactionDto046{" +
            "tranField000=" + tranField000 + ", " +
            "tranField001=" + tranField001 + ", " +
            "tranField002=" + tranField002 + ", " +
            "tranField003=" + tranField003 + ", " +
            "tranField004=" + tranField004 + ", " +
            "}";
    }
}
