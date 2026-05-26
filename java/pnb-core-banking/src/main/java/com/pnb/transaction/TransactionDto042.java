package com.pnb.transaction;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * TransactionDto042 — Data Transfer Object for transaction operations.
 * Variant 42 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransactionDto042 {

    @JsonProperty("tranField000")
    private Boolean tranField000;

    @JsonProperty("tranField001")
    private Integer tranField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("tranField002")
    private BigDecimal tranField002;

    @JsonProperty("tranField003")
    private Double tranField003;

    @JsonProperty("tranField004")
    private Boolean tranField004;

    @JsonProperty("tranField005")
    private Boolean tranField005;

    @JsonProperty("tranField006")
    private Boolean tranField006;

    @JsonProperty("tranField007")
    private Boolean tranField007;

    @JsonProperty("tranField008")
    private Integer tranField008;

    @JsonProperty("tranField009")
    private Double tranField009;

    @JsonProperty("tranField010")
    private LocalDate tranField010;

    @Size(max = 100)
    @JsonProperty("tranField011")
    private String tranField011;

    @JsonProperty("tranField012")
    private Integer tranField012;

    @JsonProperty("tranField013")
    private Double tranField013;

    public TransactionDto042() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final TransactionDto042 instance = new TransactionDto042();

        public Builder tranField000(Boolean val) { instance.tranField000 = val; return this; }
        public Builder tranField001(Integer val) { instance.tranField001 = val; return this; }
        public Builder tranField002(BigDecimal val) { instance.tranField002 = val; return this; }
        public Builder tranField003(Double val) { instance.tranField003 = val; return this; }
        public Builder tranField004(Boolean val) { instance.tranField004 = val; return this; }
        public Builder tranField005(Boolean val) { instance.tranField005 = val; return this; }
        public Builder tranField006(Boolean val) { instance.tranField006 = val; return this; }
        public Builder tranField007(Boolean val) { instance.tranField007 = val; return this; }
        public Builder tranField008(Integer val) { instance.tranField008 = val; return this; }
        public Builder tranField009(Double val) { instance.tranField009 = val; return this; }
        public Builder tranField010(LocalDate val) { instance.tranField010 = val; return this; }
        public Builder tranField011(String val) { instance.tranField011 = val; return this; }
        public Builder tranField012(Integer val) { instance.tranField012 = val; return this; }
        public Builder tranField013(Double val) { instance.tranField013 = val; return this; }
        public TransactionDto042 build() { return instance; }
    }

    public Boolean getTranField000() { return tranField000; }
    public void setTranField000(Boolean tranField000) { this.tranField000 = tranField000; }

    public Integer getTranField001() { return tranField001; }
    public void setTranField001(Integer tranField001) { this.tranField001 = tranField001; }

    public BigDecimal getTranField002() { return tranField002; }
    public void setTranField002(BigDecimal tranField002) { this.tranField002 = tranField002; }

    public Double getTranField003() { return tranField003; }
    public void setTranField003(Double tranField003) { this.tranField003 = tranField003; }

    public Boolean getTranField004() { return tranField004; }
    public void setTranField004(Boolean tranField004) { this.tranField004 = tranField004; }

    public Boolean getTranField005() { return tranField005; }
    public void setTranField005(Boolean tranField005) { this.tranField005 = tranField005; }

    public Boolean getTranField006() { return tranField006; }
    public void setTranField006(Boolean tranField006) { this.tranField006 = tranField006; }

    public Boolean getTranField007() { return tranField007; }
    public void setTranField007(Boolean tranField007) { this.tranField007 = tranField007; }

    public Integer getTranField008() { return tranField008; }
    public void setTranField008(Integer tranField008) { this.tranField008 = tranField008; }

    public Double getTranField009() { return tranField009; }
    public void setTranField009(Double tranField009) { this.tranField009 = tranField009; }

    public LocalDate getTranField010() { return tranField010; }
    public void setTranField010(LocalDate tranField010) { this.tranField010 = tranField010; }

    public String getTranField011() { return tranField011; }
    public void setTranField011(String tranField011) { this.tranField011 = tranField011; }

    public Integer getTranField012() { return tranField012; }
    public void setTranField012(Integer tranField012) { this.tranField012 = tranField012; }

    public Double getTranField013() { return tranField013; }
    public void setTranField013(Double tranField013) { this.tranField013 = tranField013; }

    @Override
    public String toString() {
        return "TransactionDto042{" +
            "tranField000=" + tranField000 + ", " +
            "tranField001=" + tranField001 + ", " +
            "tranField002=" + tranField002 + ", " +
            "tranField003=" + tranField003 + ", " +
            "tranField004=" + tranField004 + ", " +
            "}";
    }
}
