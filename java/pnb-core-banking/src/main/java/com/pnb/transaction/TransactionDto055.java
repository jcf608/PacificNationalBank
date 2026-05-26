package com.pnb.transaction;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * TransactionDto055 — Data Transfer Object for transaction operations.
 * Variant 55 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransactionDto055 {

    @Size(max = 20)
    @JsonProperty("tranField000")
    private String tranField000;

    @JsonProperty("tranField001")
    private Double tranField001;

    @JsonProperty("tranField002")
    private LocalDate tranField002;

    @JsonProperty("tranField003")
    private Long tranField003;

    @JsonProperty("tranField004")
    private Long tranField004;

    @JsonProperty("tranField005")
    private LocalDate tranField005;

    @JsonProperty("tranField006")
    private Integer tranField006;

    @JsonProperty("tranField007")
    private Double tranField007;

    @DecimalMin(value = "0.00")
    @JsonProperty("tranField008")
    private BigDecimal tranField008;

    @Size(max = 100)
    @JsonProperty("tranField009")
    private String tranField009;

    @Size(max = 40)
    @JsonProperty("tranField010")
    private String tranField010;

    @JsonProperty("tranField011")
    private Double tranField011;

    @Size(max = 40)
    @JsonProperty("tranField012")
    private String tranField012;

    @JsonProperty("tranField013")
    private Long tranField013;

    @JsonProperty("tranField014")
    private LocalDate tranField014;

    public TransactionDto055() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final TransactionDto055 instance = new TransactionDto055();

        public Builder tranField000(String val) { instance.tranField000 = val; return this; }
        public Builder tranField001(Double val) { instance.tranField001 = val; return this; }
        public Builder tranField002(LocalDate val) { instance.tranField002 = val; return this; }
        public Builder tranField003(Long val) { instance.tranField003 = val; return this; }
        public Builder tranField004(Long val) { instance.tranField004 = val; return this; }
        public Builder tranField005(LocalDate val) { instance.tranField005 = val; return this; }
        public Builder tranField006(Integer val) { instance.tranField006 = val; return this; }
        public Builder tranField007(Double val) { instance.tranField007 = val; return this; }
        public Builder tranField008(BigDecimal val) { instance.tranField008 = val; return this; }
        public Builder tranField009(String val) { instance.tranField009 = val; return this; }
        public Builder tranField010(String val) { instance.tranField010 = val; return this; }
        public Builder tranField011(Double val) { instance.tranField011 = val; return this; }
        public Builder tranField012(String val) { instance.tranField012 = val; return this; }
        public Builder tranField013(Long val) { instance.tranField013 = val; return this; }
        public Builder tranField014(LocalDate val) { instance.tranField014 = val; return this; }
        public TransactionDto055 build() { return instance; }
    }

    public String getTranField000() { return tranField000; }
    public void setTranField000(String tranField000) { this.tranField000 = tranField000; }

    public Double getTranField001() { return tranField001; }
    public void setTranField001(Double tranField001) { this.tranField001 = tranField001; }

    public LocalDate getTranField002() { return tranField002; }
    public void setTranField002(LocalDate tranField002) { this.tranField002 = tranField002; }

    public Long getTranField003() { return tranField003; }
    public void setTranField003(Long tranField003) { this.tranField003 = tranField003; }

    public Long getTranField004() { return tranField004; }
    public void setTranField004(Long tranField004) { this.tranField004 = tranField004; }

    public LocalDate getTranField005() { return tranField005; }
    public void setTranField005(LocalDate tranField005) { this.tranField005 = tranField005; }

    public Integer getTranField006() { return tranField006; }
    public void setTranField006(Integer tranField006) { this.tranField006 = tranField006; }

    public Double getTranField007() { return tranField007; }
    public void setTranField007(Double tranField007) { this.tranField007 = tranField007; }

    public BigDecimal getTranField008() { return tranField008; }
    public void setTranField008(BigDecimal tranField008) { this.tranField008 = tranField008; }

    public String getTranField009() { return tranField009; }
    public void setTranField009(String tranField009) { this.tranField009 = tranField009; }

    public String getTranField010() { return tranField010; }
    public void setTranField010(String tranField010) { this.tranField010 = tranField010; }

    public Double getTranField011() { return tranField011; }
    public void setTranField011(Double tranField011) { this.tranField011 = tranField011; }

    public String getTranField012() { return tranField012; }
    public void setTranField012(String tranField012) { this.tranField012 = tranField012; }

    public Long getTranField013() { return tranField013; }
    public void setTranField013(Long tranField013) { this.tranField013 = tranField013; }

    public LocalDate getTranField014() { return tranField014; }
    public void setTranField014(LocalDate tranField014) { this.tranField014 = tranField014; }

    @Override
    public String toString() {
        return "TransactionDto055{" +
            "tranField000=" + tranField000 + ", " +
            "tranField001=" + tranField001 + ", " +
            "tranField002=" + tranField002 + ", " +
            "tranField003=" + tranField003 + ", " +
            "tranField004=" + tranField004 + ", " +
            "}";
    }
}
