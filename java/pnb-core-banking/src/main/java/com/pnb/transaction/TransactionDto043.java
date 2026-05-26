package com.pnb.transaction;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * TransactionDto043 — Data Transfer Object for transaction operations.
 * Variant 43 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransactionDto043 {

    @JsonProperty("tranField000")
    private LocalDate tranField000;

    @JsonProperty("tranField001")
    private Long tranField001;

    @JsonProperty("tranField002")
    private LocalDate tranField002;

    @JsonProperty("tranField003")
    private Long tranField003;

    @JsonProperty("tranField004")
    private Long tranField004;

    @JsonProperty("tranField005")
    private Integer tranField005;

    @JsonProperty("tranField006")
    private LocalDate tranField006;

    @JsonProperty("tranField007")
    private LocalDate tranField007;

    @JsonProperty("tranField008")
    private Long tranField008;

    @JsonProperty("tranField009")
    private Double tranField009;

    @JsonProperty("tranField010")
    private LocalDate tranField010;

    @JsonProperty("tranField011")
    private Double tranField011;

    @DecimalMin(value = "0.00")
    @JsonProperty("tranField012")
    private BigDecimal tranField012;

    @Size(max = 40)
    @JsonProperty("tranField013")
    private String tranField013;

    @JsonProperty("tranField014")
    private Long tranField014;

    public TransactionDto043() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final TransactionDto043 instance = new TransactionDto043();

        public Builder tranField000(LocalDate val) { instance.tranField000 = val; return this; }
        public Builder tranField001(Long val) { instance.tranField001 = val; return this; }
        public Builder tranField002(LocalDate val) { instance.tranField002 = val; return this; }
        public Builder tranField003(Long val) { instance.tranField003 = val; return this; }
        public Builder tranField004(Long val) { instance.tranField004 = val; return this; }
        public Builder tranField005(Integer val) { instance.tranField005 = val; return this; }
        public Builder tranField006(LocalDate val) { instance.tranField006 = val; return this; }
        public Builder tranField007(LocalDate val) { instance.tranField007 = val; return this; }
        public Builder tranField008(Long val) { instance.tranField008 = val; return this; }
        public Builder tranField009(Double val) { instance.tranField009 = val; return this; }
        public Builder tranField010(LocalDate val) { instance.tranField010 = val; return this; }
        public Builder tranField011(Double val) { instance.tranField011 = val; return this; }
        public Builder tranField012(BigDecimal val) { instance.tranField012 = val; return this; }
        public Builder tranField013(String val) { instance.tranField013 = val; return this; }
        public Builder tranField014(Long val) { instance.tranField014 = val; return this; }
        public TransactionDto043 build() { return instance; }
    }

    public LocalDate getTranField000() { return tranField000; }
    public void setTranField000(LocalDate tranField000) { this.tranField000 = tranField000; }

    public Long getTranField001() { return tranField001; }
    public void setTranField001(Long tranField001) { this.tranField001 = tranField001; }

    public LocalDate getTranField002() { return tranField002; }
    public void setTranField002(LocalDate tranField002) { this.tranField002 = tranField002; }

    public Long getTranField003() { return tranField003; }
    public void setTranField003(Long tranField003) { this.tranField003 = tranField003; }

    public Long getTranField004() { return tranField004; }
    public void setTranField004(Long tranField004) { this.tranField004 = tranField004; }

    public Integer getTranField005() { return tranField005; }
    public void setTranField005(Integer tranField005) { this.tranField005 = tranField005; }

    public LocalDate getTranField006() { return tranField006; }
    public void setTranField006(LocalDate tranField006) { this.tranField006 = tranField006; }

    public LocalDate getTranField007() { return tranField007; }
    public void setTranField007(LocalDate tranField007) { this.tranField007 = tranField007; }

    public Long getTranField008() { return tranField008; }
    public void setTranField008(Long tranField008) { this.tranField008 = tranField008; }

    public Double getTranField009() { return tranField009; }
    public void setTranField009(Double tranField009) { this.tranField009 = tranField009; }

    public LocalDate getTranField010() { return tranField010; }
    public void setTranField010(LocalDate tranField010) { this.tranField010 = tranField010; }

    public Double getTranField011() { return tranField011; }
    public void setTranField011(Double tranField011) { this.tranField011 = tranField011; }

    public BigDecimal getTranField012() { return tranField012; }
    public void setTranField012(BigDecimal tranField012) { this.tranField012 = tranField012; }

    public String getTranField013() { return tranField013; }
    public void setTranField013(String tranField013) { this.tranField013 = tranField013; }

    public Long getTranField014() { return tranField014; }
    public void setTranField014(Long tranField014) { this.tranField014 = tranField014; }

    @Override
    public String toString() {
        return "TransactionDto043{" +
            "tranField000=" + tranField000 + ", " +
            "tranField001=" + tranField001 + ", " +
            "tranField002=" + tranField002 + ", " +
            "tranField003=" + tranField003 + ", " +
            "tranField004=" + tranField004 + ", " +
            "}";
    }
}
