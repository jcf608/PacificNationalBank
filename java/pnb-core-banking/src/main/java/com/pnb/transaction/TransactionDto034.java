package com.pnb.transaction;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * TransactionDto034 — Data Transfer Object for transaction operations.
 * Variant 34 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransactionDto034 {

    @DecimalMin(value = "0.00")
    @JsonProperty("tranField000")
    private BigDecimal tranField000;

    @JsonProperty("tranField001")
    private Long tranField001;

    @JsonProperty("tranField002")
    private Long tranField002;

    @DecimalMin(value = "0.00")
    @JsonProperty("tranField003")
    private BigDecimal tranField003;

    @JsonProperty("tranField004")
    private LocalDate tranField004;

    @JsonProperty("tranField005")
    private Boolean tranField005;

    @JsonProperty("tranField006")
    private Long tranField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("tranField007")
    private BigDecimal tranField007;

    @JsonProperty("tranField008")
    private Double tranField008;

    @JsonProperty("tranField009")
    private Double tranField009;

    @JsonProperty("tranField010")
    private Long tranField010;

    @JsonProperty("tranField011")
    private Long tranField011;

    @JsonProperty("tranField012")
    private Double tranField012;

    @DecimalMin(value = "0.00")
    @JsonProperty("tranField013")
    private BigDecimal tranField013;

    @JsonProperty("tranField014")
    private Boolean tranField014;

    @JsonProperty("tranField015")
    private LocalDate tranField015;

    @JsonProperty("tranField016")
    private Double tranField016;

    @JsonProperty("tranField017")
    private Boolean tranField017;

    public TransactionDto034() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final TransactionDto034 instance = new TransactionDto034();

        public Builder tranField000(BigDecimal val) { instance.tranField000 = val; return this; }
        public Builder tranField001(Long val) { instance.tranField001 = val; return this; }
        public Builder tranField002(Long val) { instance.tranField002 = val; return this; }
        public Builder tranField003(BigDecimal val) { instance.tranField003 = val; return this; }
        public Builder tranField004(LocalDate val) { instance.tranField004 = val; return this; }
        public Builder tranField005(Boolean val) { instance.tranField005 = val; return this; }
        public Builder tranField006(Long val) { instance.tranField006 = val; return this; }
        public Builder tranField007(BigDecimal val) { instance.tranField007 = val; return this; }
        public Builder tranField008(Double val) { instance.tranField008 = val; return this; }
        public Builder tranField009(Double val) { instance.tranField009 = val; return this; }
        public Builder tranField010(Long val) { instance.tranField010 = val; return this; }
        public Builder tranField011(Long val) { instance.tranField011 = val; return this; }
        public Builder tranField012(Double val) { instance.tranField012 = val; return this; }
        public Builder tranField013(BigDecimal val) { instance.tranField013 = val; return this; }
        public Builder tranField014(Boolean val) { instance.tranField014 = val; return this; }
        public Builder tranField015(LocalDate val) { instance.tranField015 = val; return this; }
        public Builder tranField016(Double val) { instance.tranField016 = val; return this; }
        public Builder tranField017(Boolean val) { instance.tranField017 = val; return this; }
        public TransactionDto034 build() { return instance; }
    }

    public BigDecimal getTranField000() { return tranField000; }
    public void setTranField000(BigDecimal tranField000) { this.tranField000 = tranField000; }

    public Long getTranField001() { return tranField001; }
    public void setTranField001(Long tranField001) { this.tranField001 = tranField001; }

    public Long getTranField002() { return tranField002; }
    public void setTranField002(Long tranField002) { this.tranField002 = tranField002; }

    public BigDecimal getTranField003() { return tranField003; }
    public void setTranField003(BigDecimal tranField003) { this.tranField003 = tranField003; }

    public LocalDate getTranField004() { return tranField004; }
    public void setTranField004(LocalDate tranField004) { this.tranField004 = tranField004; }

    public Boolean getTranField005() { return tranField005; }
    public void setTranField005(Boolean tranField005) { this.tranField005 = tranField005; }

    public Long getTranField006() { return tranField006; }
    public void setTranField006(Long tranField006) { this.tranField006 = tranField006; }

    public BigDecimal getTranField007() { return tranField007; }
    public void setTranField007(BigDecimal tranField007) { this.tranField007 = tranField007; }

    public Double getTranField008() { return tranField008; }
    public void setTranField008(Double tranField008) { this.tranField008 = tranField008; }

    public Double getTranField009() { return tranField009; }
    public void setTranField009(Double tranField009) { this.tranField009 = tranField009; }

    public Long getTranField010() { return tranField010; }
    public void setTranField010(Long tranField010) { this.tranField010 = tranField010; }

    public Long getTranField011() { return tranField011; }
    public void setTranField011(Long tranField011) { this.tranField011 = tranField011; }

    public Double getTranField012() { return tranField012; }
    public void setTranField012(Double tranField012) { this.tranField012 = tranField012; }

    public BigDecimal getTranField013() { return tranField013; }
    public void setTranField013(BigDecimal tranField013) { this.tranField013 = tranField013; }

    public Boolean getTranField014() { return tranField014; }
    public void setTranField014(Boolean tranField014) { this.tranField014 = tranField014; }

    public LocalDate getTranField015() { return tranField015; }
    public void setTranField015(LocalDate tranField015) { this.tranField015 = tranField015; }

    public Double getTranField016() { return tranField016; }
    public void setTranField016(Double tranField016) { this.tranField016 = tranField016; }

    public Boolean getTranField017() { return tranField017; }
    public void setTranField017(Boolean tranField017) { this.tranField017 = tranField017; }

    @Override
    public String toString() {
        return "TransactionDto034{" +
            "tranField000=" + tranField000 + ", " +
            "tranField001=" + tranField001 + ", " +
            "tranField002=" + tranField002 + ", " +
            "tranField003=" + tranField003 + ", " +
            "tranField004=" + tranField004 + ", " +
            "}";
    }
}
