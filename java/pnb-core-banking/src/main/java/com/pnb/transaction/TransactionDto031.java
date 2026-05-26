package com.pnb.transaction;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * TransactionDto031 — Data Transfer Object for transaction operations.
 * Variant 31 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransactionDto031 {

    @JsonProperty("tranField000")
    private Integer tranField000;

    @JsonProperty("tranField001")
    private LocalDate tranField001;

    @JsonProperty("tranField002")
    private Boolean tranField002;

    @DecimalMin(value = "0.00")
    @JsonProperty("tranField003")
    private BigDecimal tranField003;

    @JsonProperty("tranField004")
    private Integer tranField004;

    @JsonProperty("tranField005")
    private Boolean tranField005;

    @Size(max = 60)
    @JsonProperty("tranField006")
    private String tranField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("tranField007")
    private BigDecimal tranField007;

    @JsonProperty("tranField008")
    private Double tranField008;

    @JsonProperty("tranField009")
    private Long tranField009;

    @JsonProperty("tranField010")
    private Double tranField010;

    @Size(max = 40)
    @JsonProperty("tranField011")
    private String tranField011;

    @JsonProperty("tranField012")
    private Integer tranField012;

    @JsonProperty("tranField013")
    private Boolean tranField013;

    @JsonProperty("tranField014")
    private Boolean tranField014;

    public TransactionDto031() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final TransactionDto031 instance = new TransactionDto031();

        public Builder tranField000(Integer val) { instance.tranField000 = val; return this; }
        public Builder tranField001(LocalDate val) { instance.tranField001 = val; return this; }
        public Builder tranField002(Boolean val) { instance.tranField002 = val; return this; }
        public Builder tranField003(BigDecimal val) { instance.tranField003 = val; return this; }
        public Builder tranField004(Integer val) { instance.tranField004 = val; return this; }
        public Builder tranField005(Boolean val) { instance.tranField005 = val; return this; }
        public Builder tranField006(String val) { instance.tranField006 = val; return this; }
        public Builder tranField007(BigDecimal val) { instance.tranField007 = val; return this; }
        public Builder tranField008(Double val) { instance.tranField008 = val; return this; }
        public Builder tranField009(Long val) { instance.tranField009 = val; return this; }
        public Builder tranField010(Double val) { instance.tranField010 = val; return this; }
        public Builder tranField011(String val) { instance.tranField011 = val; return this; }
        public Builder tranField012(Integer val) { instance.tranField012 = val; return this; }
        public Builder tranField013(Boolean val) { instance.tranField013 = val; return this; }
        public Builder tranField014(Boolean val) { instance.tranField014 = val; return this; }
        public TransactionDto031 build() { return instance; }
    }

    public Integer getTranField000() { return tranField000; }
    public void setTranField000(Integer tranField000) { this.tranField000 = tranField000; }

    public LocalDate getTranField001() { return tranField001; }
    public void setTranField001(LocalDate tranField001) { this.tranField001 = tranField001; }

    public Boolean getTranField002() { return tranField002; }
    public void setTranField002(Boolean tranField002) { this.tranField002 = tranField002; }

    public BigDecimal getTranField003() { return tranField003; }
    public void setTranField003(BigDecimal tranField003) { this.tranField003 = tranField003; }

    public Integer getTranField004() { return tranField004; }
    public void setTranField004(Integer tranField004) { this.tranField004 = tranField004; }

    public Boolean getTranField005() { return tranField005; }
    public void setTranField005(Boolean tranField005) { this.tranField005 = tranField005; }

    public String getTranField006() { return tranField006; }
    public void setTranField006(String tranField006) { this.tranField006 = tranField006; }

    public BigDecimal getTranField007() { return tranField007; }
    public void setTranField007(BigDecimal tranField007) { this.tranField007 = tranField007; }

    public Double getTranField008() { return tranField008; }
    public void setTranField008(Double tranField008) { this.tranField008 = tranField008; }

    public Long getTranField009() { return tranField009; }
    public void setTranField009(Long tranField009) { this.tranField009 = tranField009; }

    public Double getTranField010() { return tranField010; }
    public void setTranField010(Double tranField010) { this.tranField010 = tranField010; }

    public String getTranField011() { return tranField011; }
    public void setTranField011(String tranField011) { this.tranField011 = tranField011; }

    public Integer getTranField012() { return tranField012; }
    public void setTranField012(Integer tranField012) { this.tranField012 = tranField012; }

    public Boolean getTranField013() { return tranField013; }
    public void setTranField013(Boolean tranField013) { this.tranField013 = tranField013; }

    public Boolean getTranField014() { return tranField014; }
    public void setTranField014(Boolean tranField014) { this.tranField014 = tranField014; }

    @Override
    public String toString() {
        return "TransactionDto031{" +
            "tranField000=" + tranField000 + ", " +
            "tranField001=" + tranField001 + ", " +
            "tranField002=" + tranField002 + ", " +
            "tranField003=" + tranField003 + ", " +
            "tranField004=" + tranField004 + ", " +
            "}";
    }
}
