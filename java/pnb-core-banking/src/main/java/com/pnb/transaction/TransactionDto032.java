package com.pnb.transaction;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * TransactionDto032 — Data Transfer Object for transaction operations.
 * Variant 32 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransactionDto032 {

    @DecimalMin(value = "0.00")
    @JsonProperty("tranField000")
    private BigDecimal tranField000;

    @DecimalMin(value = "0.00")
    @JsonProperty("tranField001")
    private BigDecimal tranField001;

    @JsonProperty("tranField002")
    private Boolean tranField002;

    @JsonProperty("tranField003")
    private Integer tranField003;

    @Size(max = 40)
    @JsonProperty("tranField004")
    private String tranField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("tranField005")
    private BigDecimal tranField005;

    @JsonProperty("tranField006")
    private Boolean tranField006;

    @JsonProperty("tranField007")
    private Long tranField007;

    @DecimalMin(value = "0.00")
    @JsonProperty("tranField008")
    private BigDecimal tranField008;

    @JsonProperty("tranField009")
    private LocalDate tranField009;

    @JsonProperty("tranField010")
    private Long tranField010;

    @JsonProperty("tranField011")
    private Boolean tranField011;

    @Size(max = 100)
    @JsonProperty("tranField012")
    private String tranField012;

    @Size(max = 100)
    @JsonProperty("tranField013")
    private String tranField013;

    @JsonProperty("tranField014")
    private Double tranField014;

    @DecimalMin(value = "0.00")
    @JsonProperty("tranField015")
    private BigDecimal tranField015;

    public TransactionDto032() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final TransactionDto032 instance = new TransactionDto032();

        public Builder tranField000(BigDecimal val) { instance.tranField000 = val; return this; }
        public Builder tranField001(BigDecimal val) { instance.tranField001 = val; return this; }
        public Builder tranField002(Boolean val) { instance.tranField002 = val; return this; }
        public Builder tranField003(Integer val) { instance.tranField003 = val; return this; }
        public Builder tranField004(String val) { instance.tranField004 = val; return this; }
        public Builder tranField005(BigDecimal val) { instance.tranField005 = val; return this; }
        public Builder tranField006(Boolean val) { instance.tranField006 = val; return this; }
        public Builder tranField007(Long val) { instance.tranField007 = val; return this; }
        public Builder tranField008(BigDecimal val) { instance.tranField008 = val; return this; }
        public Builder tranField009(LocalDate val) { instance.tranField009 = val; return this; }
        public Builder tranField010(Long val) { instance.tranField010 = val; return this; }
        public Builder tranField011(Boolean val) { instance.tranField011 = val; return this; }
        public Builder tranField012(String val) { instance.tranField012 = val; return this; }
        public Builder tranField013(String val) { instance.tranField013 = val; return this; }
        public Builder tranField014(Double val) { instance.tranField014 = val; return this; }
        public Builder tranField015(BigDecimal val) { instance.tranField015 = val; return this; }
        public TransactionDto032 build() { return instance; }
    }

    public BigDecimal getTranField000() { return tranField000; }
    public void setTranField000(BigDecimal tranField000) { this.tranField000 = tranField000; }

    public BigDecimal getTranField001() { return tranField001; }
    public void setTranField001(BigDecimal tranField001) { this.tranField001 = tranField001; }

    public Boolean getTranField002() { return tranField002; }
    public void setTranField002(Boolean tranField002) { this.tranField002 = tranField002; }

    public Integer getTranField003() { return tranField003; }
    public void setTranField003(Integer tranField003) { this.tranField003 = tranField003; }

    public String getTranField004() { return tranField004; }
    public void setTranField004(String tranField004) { this.tranField004 = tranField004; }

    public BigDecimal getTranField005() { return tranField005; }
    public void setTranField005(BigDecimal tranField005) { this.tranField005 = tranField005; }

    public Boolean getTranField006() { return tranField006; }
    public void setTranField006(Boolean tranField006) { this.tranField006 = tranField006; }

    public Long getTranField007() { return tranField007; }
    public void setTranField007(Long tranField007) { this.tranField007 = tranField007; }

    public BigDecimal getTranField008() { return tranField008; }
    public void setTranField008(BigDecimal tranField008) { this.tranField008 = tranField008; }

    public LocalDate getTranField009() { return tranField009; }
    public void setTranField009(LocalDate tranField009) { this.tranField009 = tranField009; }

    public Long getTranField010() { return tranField010; }
    public void setTranField010(Long tranField010) { this.tranField010 = tranField010; }

    public Boolean getTranField011() { return tranField011; }
    public void setTranField011(Boolean tranField011) { this.tranField011 = tranField011; }

    public String getTranField012() { return tranField012; }
    public void setTranField012(String tranField012) { this.tranField012 = tranField012; }

    public String getTranField013() { return tranField013; }
    public void setTranField013(String tranField013) { this.tranField013 = tranField013; }

    public Double getTranField014() { return tranField014; }
    public void setTranField014(Double tranField014) { this.tranField014 = tranField014; }

    public BigDecimal getTranField015() { return tranField015; }
    public void setTranField015(BigDecimal tranField015) { this.tranField015 = tranField015; }

    @Override
    public String toString() {
        return "TransactionDto032{" +
            "tranField000=" + tranField000 + ", " +
            "tranField001=" + tranField001 + ", " +
            "tranField002=" + tranField002 + ", " +
            "tranField003=" + tranField003 + ", " +
            "tranField004=" + tranField004 + ", " +
            "}";
    }
}
