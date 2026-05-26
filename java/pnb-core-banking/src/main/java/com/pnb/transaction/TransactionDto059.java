package com.pnb.transaction;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * TransactionDto059 — Data Transfer Object for transaction operations.
 * Variant 59 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransactionDto059 {

    @JsonProperty("tranField000")
    private Double tranField000;

    @JsonProperty("tranField001")
    private Long tranField001;

    @JsonProperty("tranField002")
    private Boolean tranField002;

    @DecimalMin(value = "0.00")
    @JsonProperty("tranField003")
    private BigDecimal tranField003;

    @DecimalMin(value = "0.00")
    @JsonProperty("tranField004")
    private BigDecimal tranField004;

    @JsonProperty("tranField005")
    private LocalDate tranField005;

    @JsonProperty("tranField006")
    private Boolean tranField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("tranField007")
    private BigDecimal tranField007;

    @Size(max = 100)
    @JsonProperty("tranField008")
    private String tranField008;

    @DecimalMin(value = "0.00")
    @JsonProperty("tranField009")
    private BigDecimal tranField009;

    @DecimalMin(value = "0.00")
    @JsonProperty("tranField010")
    private BigDecimal tranField010;

    @JsonProperty("tranField011")
    private LocalDate tranField011;

    @JsonProperty("tranField012")
    private Boolean tranField012;

    @Size(max = 20)
    @JsonProperty("tranField013")
    private String tranField013;

    @JsonProperty("tranField014")
    private LocalDate tranField014;

    @JsonProperty("tranField015")
    private Long tranField015;

    @JsonProperty("tranField016")
    private LocalDate tranField016;

    @DecimalMin(value = "0.00")
    @JsonProperty("tranField017")
    private BigDecimal tranField017;

    @Size(max = 100)
    @JsonProperty("tranField018")
    private String tranField018;

    public TransactionDto059() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final TransactionDto059 instance = new TransactionDto059();

        public Builder tranField000(Double val) { instance.tranField000 = val; return this; }
        public Builder tranField001(Long val) { instance.tranField001 = val; return this; }
        public Builder tranField002(Boolean val) { instance.tranField002 = val; return this; }
        public Builder tranField003(BigDecimal val) { instance.tranField003 = val; return this; }
        public Builder tranField004(BigDecimal val) { instance.tranField004 = val; return this; }
        public Builder tranField005(LocalDate val) { instance.tranField005 = val; return this; }
        public Builder tranField006(Boolean val) { instance.tranField006 = val; return this; }
        public Builder tranField007(BigDecimal val) { instance.tranField007 = val; return this; }
        public Builder tranField008(String val) { instance.tranField008 = val; return this; }
        public Builder tranField009(BigDecimal val) { instance.tranField009 = val; return this; }
        public Builder tranField010(BigDecimal val) { instance.tranField010 = val; return this; }
        public Builder tranField011(LocalDate val) { instance.tranField011 = val; return this; }
        public Builder tranField012(Boolean val) { instance.tranField012 = val; return this; }
        public Builder tranField013(String val) { instance.tranField013 = val; return this; }
        public Builder tranField014(LocalDate val) { instance.tranField014 = val; return this; }
        public Builder tranField015(Long val) { instance.tranField015 = val; return this; }
        public Builder tranField016(LocalDate val) { instance.tranField016 = val; return this; }
        public Builder tranField017(BigDecimal val) { instance.tranField017 = val; return this; }
        public Builder tranField018(String val) { instance.tranField018 = val; return this; }
        public TransactionDto059 build() { return instance; }
    }

    public Double getTranField000() { return tranField000; }
    public void setTranField000(Double tranField000) { this.tranField000 = tranField000; }

    public Long getTranField001() { return tranField001; }
    public void setTranField001(Long tranField001) { this.tranField001 = tranField001; }

    public Boolean getTranField002() { return tranField002; }
    public void setTranField002(Boolean tranField002) { this.tranField002 = tranField002; }

    public BigDecimal getTranField003() { return tranField003; }
    public void setTranField003(BigDecimal tranField003) { this.tranField003 = tranField003; }

    public BigDecimal getTranField004() { return tranField004; }
    public void setTranField004(BigDecimal tranField004) { this.tranField004 = tranField004; }

    public LocalDate getTranField005() { return tranField005; }
    public void setTranField005(LocalDate tranField005) { this.tranField005 = tranField005; }

    public Boolean getTranField006() { return tranField006; }
    public void setTranField006(Boolean tranField006) { this.tranField006 = tranField006; }

    public BigDecimal getTranField007() { return tranField007; }
    public void setTranField007(BigDecimal tranField007) { this.tranField007 = tranField007; }

    public String getTranField008() { return tranField008; }
    public void setTranField008(String tranField008) { this.tranField008 = tranField008; }

    public BigDecimal getTranField009() { return tranField009; }
    public void setTranField009(BigDecimal tranField009) { this.tranField009 = tranField009; }

    public BigDecimal getTranField010() { return tranField010; }
    public void setTranField010(BigDecimal tranField010) { this.tranField010 = tranField010; }

    public LocalDate getTranField011() { return tranField011; }
    public void setTranField011(LocalDate tranField011) { this.tranField011 = tranField011; }

    public Boolean getTranField012() { return tranField012; }
    public void setTranField012(Boolean tranField012) { this.tranField012 = tranField012; }

    public String getTranField013() { return tranField013; }
    public void setTranField013(String tranField013) { this.tranField013 = tranField013; }

    public LocalDate getTranField014() { return tranField014; }
    public void setTranField014(LocalDate tranField014) { this.tranField014 = tranField014; }

    public Long getTranField015() { return tranField015; }
    public void setTranField015(Long tranField015) { this.tranField015 = tranField015; }

    public LocalDate getTranField016() { return tranField016; }
    public void setTranField016(LocalDate tranField016) { this.tranField016 = tranField016; }

    public BigDecimal getTranField017() { return tranField017; }
    public void setTranField017(BigDecimal tranField017) { this.tranField017 = tranField017; }

    public String getTranField018() { return tranField018; }
    public void setTranField018(String tranField018) { this.tranField018 = tranField018; }

    @Override
    public String toString() {
        return "TransactionDto059{" +
            "tranField000=" + tranField000 + ", " +
            "tranField001=" + tranField001 + ", " +
            "tranField002=" + tranField002 + ", " +
            "tranField003=" + tranField003 + ", " +
            "tranField004=" + tranField004 + ", " +
            "}";
    }
}
