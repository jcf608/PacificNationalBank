package com.pnb.transaction;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * TransactionDto044 — Data Transfer Object for transaction operations.
 * Variant 44 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransactionDto044 {

    @JsonProperty("tranField000")
    private Double tranField000;

    @JsonProperty("tranField001")
    private Double tranField001;

    @JsonProperty("tranField002")
    private Double tranField002;

    @JsonProperty("tranField003")
    private Double tranField003;

    @Size(max = 200)
    @JsonProperty("tranField004")
    private String tranField004;

    @Size(max = 60)
    @JsonProperty("tranField005")
    private String tranField005;

    @JsonProperty("tranField006")
    private Double tranField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("tranField007")
    private BigDecimal tranField007;

    @JsonProperty("tranField008")
    private Boolean tranField008;

    @JsonProperty("tranField009")
    private Long tranField009;

    @DecimalMin(value = "0.00")
    @JsonProperty("tranField010")
    private BigDecimal tranField010;

    @DecimalMin(value = "0.00")
    @JsonProperty("tranField011")
    private BigDecimal tranField011;

    @JsonProperty("tranField012")
    private Boolean tranField012;

    @DecimalMin(value = "0.00")
    @JsonProperty("tranField013")
    private BigDecimal tranField013;

    @DecimalMin(value = "0.00")
    @JsonProperty("tranField014")
    private BigDecimal tranField014;

    @JsonProperty("tranField015")
    private Boolean tranField015;

    public TransactionDto044() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final TransactionDto044 instance = new TransactionDto044();

        public Builder tranField000(Double val) { instance.tranField000 = val; return this; }
        public Builder tranField001(Double val) { instance.tranField001 = val; return this; }
        public Builder tranField002(Double val) { instance.tranField002 = val; return this; }
        public Builder tranField003(Double val) { instance.tranField003 = val; return this; }
        public Builder tranField004(String val) { instance.tranField004 = val; return this; }
        public Builder tranField005(String val) { instance.tranField005 = val; return this; }
        public Builder tranField006(Double val) { instance.tranField006 = val; return this; }
        public Builder tranField007(BigDecimal val) { instance.tranField007 = val; return this; }
        public Builder tranField008(Boolean val) { instance.tranField008 = val; return this; }
        public Builder tranField009(Long val) { instance.tranField009 = val; return this; }
        public Builder tranField010(BigDecimal val) { instance.tranField010 = val; return this; }
        public Builder tranField011(BigDecimal val) { instance.tranField011 = val; return this; }
        public Builder tranField012(Boolean val) { instance.tranField012 = val; return this; }
        public Builder tranField013(BigDecimal val) { instance.tranField013 = val; return this; }
        public Builder tranField014(BigDecimal val) { instance.tranField014 = val; return this; }
        public Builder tranField015(Boolean val) { instance.tranField015 = val; return this; }
        public TransactionDto044 build() { return instance; }
    }

    public Double getTranField000() { return tranField000; }
    public void setTranField000(Double tranField000) { this.tranField000 = tranField000; }

    public Double getTranField001() { return tranField001; }
    public void setTranField001(Double tranField001) { this.tranField001 = tranField001; }

    public Double getTranField002() { return tranField002; }
    public void setTranField002(Double tranField002) { this.tranField002 = tranField002; }

    public Double getTranField003() { return tranField003; }
    public void setTranField003(Double tranField003) { this.tranField003 = tranField003; }

    public String getTranField004() { return tranField004; }
    public void setTranField004(String tranField004) { this.tranField004 = tranField004; }

    public String getTranField005() { return tranField005; }
    public void setTranField005(String tranField005) { this.tranField005 = tranField005; }

    public Double getTranField006() { return tranField006; }
    public void setTranField006(Double tranField006) { this.tranField006 = tranField006; }

    public BigDecimal getTranField007() { return tranField007; }
    public void setTranField007(BigDecimal tranField007) { this.tranField007 = tranField007; }

    public Boolean getTranField008() { return tranField008; }
    public void setTranField008(Boolean tranField008) { this.tranField008 = tranField008; }

    public Long getTranField009() { return tranField009; }
    public void setTranField009(Long tranField009) { this.tranField009 = tranField009; }

    public BigDecimal getTranField010() { return tranField010; }
    public void setTranField010(BigDecimal tranField010) { this.tranField010 = tranField010; }

    public BigDecimal getTranField011() { return tranField011; }
    public void setTranField011(BigDecimal tranField011) { this.tranField011 = tranField011; }

    public Boolean getTranField012() { return tranField012; }
    public void setTranField012(Boolean tranField012) { this.tranField012 = tranField012; }

    public BigDecimal getTranField013() { return tranField013; }
    public void setTranField013(BigDecimal tranField013) { this.tranField013 = tranField013; }

    public BigDecimal getTranField014() { return tranField014; }
    public void setTranField014(BigDecimal tranField014) { this.tranField014 = tranField014; }

    public Boolean getTranField015() { return tranField015; }
    public void setTranField015(Boolean tranField015) { this.tranField015 = tranField015; }

    @Override
    public String toString() {
        return "TransactionDto044{" +
            "tranField000=" + tranField000 + ", " +
            "tranField001=" + tranField001 + ", " +
            "tranField002=" + tranField002 + ", " +
            "tranField003=" + tranField003 + ", " +
            "tranField004=" + tranField004 + ", " +
            "}";
    }
}
