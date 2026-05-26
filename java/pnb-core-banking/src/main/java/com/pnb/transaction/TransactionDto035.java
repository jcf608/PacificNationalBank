package com.pnb.transaction;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * TransactionDto035 — Data Transfer Object for transaction operations.
 * Variant 35 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransactionDto035 {

    @JsonProperty("tranField000")
    private Double tranField000;

    @JsonProperty("tranField001")
    private LocalDate tranField001;

    @JsonProperty("tranField002")
    private LocalDate tranField002;

    @JsonProperty("tranField003")
    private Integer tranField003;

    @JsonProperty("tranField004")
    private Double tranField004;

    @JsonProperty("tranField005")
    private Double tranField005;

    @JsonProperty("tranField006")
    private Double tranField006;

    @Size(max = 60)
    @JsonProperty("tranField007")
    private String tranField007;

    @JsonProperty("tranField008")
    private Integer tranField008;

    @JsonProperty("tranField009")
    private Double tranField009;

    @JsonProperty("tranField010")
    private LocalDate tranField010;

    @DecimalMin(value = "0.00")
    @JsonProperty("tranField011")
    private BigDecimal tranField011;

    @DecimalMin(value = "0.00")
    @JsonProperty("tranField012")
    private BigDecimal tranField012;

    @DecimalMin(value = "0.00")
    @JsonProperty("tranField013")
    private BigDecimal tranField013;

    @JsonProperty("tranField014")
    private Long tranField014;

    @JsonProperty("tranField015")
    private Integer tranField015;

    @JsonProperty("tranField016")
    private LocalDate tranField016;

    @DecimalMin(value = "0.00")
    @JsonProperty("tranField017")
    private BigDecimal tranField017;

    @JsonProperty("tranField018")
    private LocalDate tranField018;

    public TransactionDto035() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final TransactionDto035 instance = new TransactionDto035();

        public Builder tranField000(Double val) { instance.tranField000 = val; return this; }
        public Builder tranField001(LocalDate val) { instance.tranField001 = val; return this; }
        public Builder tranField002(LocalDate val) { instance.tranField002 = val; return this; }
        public Builder tranField003(Integer val) { instance.tranField003 = val; return this; }
        public Builder tranField004(Double val) { instance.tranField004 = val; return this; }
        public Builder tranField005(Double val) { instance.tranField005 = val; return this; }
        public Builder tranField006(Double val) { instance.tranField006 = val; return this; }
        public Builder tranField007(String val) { instance.tranField007 = val; return this; }
        public Builder tranField008(Integer val) { instance.tranField008 = val; return this; }
        public Builder tranField009(Double val) { instance.tranField009 = val; return this; }
        public Builder tranField010(LocalDate val) { instance.tranField010 = val; return this; }
        public Builder tranField011(BigDecimal val) { instance.tranField011 = val; return this; }
        public Builder tranField012(BigDecimal val) { instance.tranField012 = val; return this; }
        public Builder tranField013(BigDecimal val) { instance.tranField013 = val; return this; }
        public Builder tranField014(Long val) { instance.tranField014 = val; return this; }
        public Builder tranField015(Integer val) { instance.tranField015 = val; return this; }
        public Builder tranField016(LocalDate val) { instance.tranField016 = val; return this; }
        public Builder tranField017(BigDecimal val) { instance.tranField017 = val; return this; }
        public Builder tranField018(LocalDate val) { instance.tranField018 = val; return this; }
        public TransactionDto035 build() { return instance; }
    }

    public Double getTranField000() { return tranField000; }
    public void setTranField000(Double tranField000) { this.tranField000 = tranField000; }

    public LocalDate getTranField001() { return tranField001; }
    public void setTranField001(LocalDate tranField001) { this.tranField001 = tranField001; }

    public LocalDate getTranField002() { return tranField002; }
    public void setTranField002(LocalDate tranField002) { this.tranField002 = tranField002; }

    public Integer getTranField003() { return tranField003; }
    public void setTranField003(Integer tranField003) { this.tranField003 = tranField003; }

    public Double getTranField004() { return tranField004; }
    public void setTranField004(Double tranField004) { this.tranField004 = tranField004; }

    public Double getTranField005() { return tranField005; }
    public void setTranField005(Double tranField005) { this.tranField005 = tranField005; }

    public Double getTranField006() { return tranField006; }
    public void setTranField006(Double tranField006) { this.tranField006 = tranField006; }

    public String getTranField007() { return tranField007; }
    public void setTranField007(String tranField007) { this.tranField007 = tranField007; }

    public Integer getTranField008() { return tranField008; }
    public void setTranField008(Integer tranField008) { this.tranField008 = tranField008; }

    public Double getTranField009() { return tranField009; }
    public void setTranField009(Double tranField009) { this.tranField009 = tranField009; }

    public LocalDate getTranField010() { return tranField010; }
    public void setTranField010(LocalDate tranField010) { this.tranField010 = tranField010; }

    public BigDecimal getTranField011() { return tranField011; }
    public void setTranField011(BigDecimal tranField011) { this.tranField011 = tranField011; }

    public BigDecimal getTranField012() { return tranField012; }
    public void setTranField012(BigDecimal tranField012) { this.tranField012 = tranField012; }

    public BigDecimal getTranField013() { return tranField013; }
    public void setTranField013(BigDecimal tranField013) { this.tranField013 = tranField013; }

    public Long getTranField014() { return tranField014; }
    public void setTranField014(Long tranField014) { this.tranField014 = tranField014; }

    public Integer getTranField015() { return tranField015; }
    public void setTranField015(Integer tranField015) { this.tranField015 = tranField015; }

    public LocalDate getTranField016() { return tranField016; }
    public void setTranField016(LocalDate tranField016) { this.tranField016 = tranField016; }

    public BigDecimal getTranField017() { return tranField017; }
    public void setTranField017(BigDecimal tranField017) { this.tranField017 = tranField017; }

    public LocalDate getTranField018() { return tranField018; }
    public void setTranField018(LocalDate tranField018) { this.tranField018 = tranField018; }

    @Override
    public String toString() {
        return "TransactionDto035{" +
            "tranField000=" + tranField000 + ", " +
            "tranField001=" + tranField001 + ", " +
            "tranField002=" + tranField002 + ", " +
            "tranField003=" + tranField003 + ", " +
            "tranField004=" + tranField004 + ", " +
            "}";
    }
}
