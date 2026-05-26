package com.pnb.transaction;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * TransactionDto030 — Data Transfer Object for transaction operations.
 * Variant 30 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransactionDto030 {

    @JsonProperty("tranField000")
    private Long tranField000;

    @JsonProperty("tranField001")
    private Double tranField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("tranField002")
    private BigDecimal tranField002;

    @Size(max = 60)
    @JsonProperty("tranField003")
    private String tranField003;

    @DecimalMin(value = "0.00")
    @JsonProperty("tranField004")
    private BigDecimal tranField004;

    @JsonProperty("tranField005")
    private Integer tranField005;

    @JsonProperty("tranField006")
    private LocalDate tranField006;

    @JsonProperty("tranField007")
    private Double tranField007;

    @DecimalMin(value = "0.00")
    @JsonProperty("tranField008")
    private BigDecimal tranField008;

    @JsonProperty("tranField009")
    private Boolean tranField009;

    @JsonProperty("tranField010")
    private LocalDate tranField010;

    @JsonProperty("tranField011")
    private Integer tranField011;

    @DecimalMin(value = "0.00")
    @JsonProperty("tranField012")
    private BigDecimal tranField012;

    @JsonProperty("tranField013")
    private LocalDate tranField013;

    public TransactionDto030() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final TransactionDto030 instance = new TransactionDto030();

        public Builder tranField000(Long val) { instance.tranField000 = val; return this; }
        public Builder tranField001(Double val) { instance.tranField001 = val; return this; }
        public Builder tranField002(BigDecimal val) { instance.tranField002 = val; return this; }
        public Builder tranField003(String val) { instance.tranField003 = val; return this; }
        public Builder tranField004(BigDecimal val) { instance.tranField004 = val; return this; }
        public Builder tranField005(Integer val) { instance.tranField005 = val; return this; }
        public Builder tranField006(LocalDate val) { instance.tranField006 = val; return this; }
        public Builder tranField007(Double val) { instance.tranField007 = val; return this; }
        public Builder tranField008(BigDecimal val) { instance.tranField008 = val; return this; }
        public Builder tranField009(Boolean val) { instance.tranField009 = val; return this; }
        public Builder tranField010(LocalDate val) { instance.tranField010 = val; return this; }
        public Builder tranField011(Integer val) { instance.tranField011 = val; return this; }
        public Builder tranField012(BigDecimal val) { instance.tranField012 = val; return this; }
        public Builder tranField013(LocalDate val) { instance.tranField013 = val; return this; }
        public TransactionDto030 build() { return instance; }
    }

    public Long getTranField000() { return tranField000; }
    public void setTranField000(Long tranField000) { this.tranField000 = tranField000; }

    public Double getTranField001() { return tranField001; }
    public void setTranField001(Double tranField001) { this.tranField001 = tranField001; }

    public BigDecimal getTranField002() { return tranField002; }
    public void setTranField002(BigDecimal tranField002) { this.tranField002 = tranField002; }

    public String getTranField003() { return tranField003; }
    public void setTranField003(String tranField003) { this.tranField003 = tranField003; }

    public BigDecimal getTranField004() { return tranField004; }
    public void setTranField004(BigDecimal tranField004) { this.tranField004 = tranField004; }

    public Integer getTranField005() { return tranField005; }
    public void setTranField005(Integer tranField005) { this.tranField005 = tranField005; }

    public LocalDate getTranField006() { return tranField006; }
    public void setTranField006(LocalDate tranField006) { this.tranField006 = tranField006; }

    public Double getTranField007() { return tranField007; }
    public void setTranField007(Double tranField007) { this.tranField007 = tranField007; }

    public BigDecimal getTranField008() { return tranField008; }
    public void setTranField008(BigDecimal tranField008) { this.tranField008 = tranField008; }

    public Boolean getTranField009() { return tranField009; }
    public void setTranField009(Boolean tranField009) { this.tranField009 = tranField009; }

    public LocalDate getTranField010() { return tranField010; }
    public void setTranField010(LocalDate tranField010) { this.tranField010 = tranField010; }

    public Integer getTranField011() { return tranField011; }
    public void setTranField011(Integer tranField011) { this.tranField011 = tranField011; }

    public BigDecimal getTranField012() { return tranField012; }
    public void setTranField012(BigDecimal tranField012) { this.tranField012 = tranField012; }

    public LocalDate getTranField013() { return tranField013; }
    public void setTranField013(LocalDate tranField013) { this.tranField013 = tranField013; }

    @Override
    public String toString() {
        return "TransactionDto030{" +
            "tranField000=" + tranField000 + ", " +
            "tranField001=" + tranField001 + ", " +
            "tranField002=" + tranField002 + ", " +
            "tranField003=" + tranField003 + ", " +
            "tranField004=" + tranField004 + ", " +
            "}";
    }
}
