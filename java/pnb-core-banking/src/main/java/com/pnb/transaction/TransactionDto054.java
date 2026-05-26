package com.pnb.transaction;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * TransactionDto054 — Data Transfer Object for transaction operations.
 * Variant 54 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransactionDto054 {

    @DecimalMin(value = "0.00")
    @JsonProperty("tranField000")
    private BigDecimal tranField000;

    @JsonProperty("tranField001")
    private Boolean tranField001;

    @JsonProperty("tranField002")
    private LocalDate tranField002;

    @DecimalMin(value = "0.00")
    @JsonProperty("tranField003")
    private BigDecimal tranField003;

    @JsonProperty("tranField004")
    private LocalDate tranField004;

    @JsonProperty("tranField005")
    private Long tranField005;

    @Size(max = 40)
    @JsonProperty("tranField006")
    private String tranField006;

    @JsonProperty("tranField007")
    private Long tranField007;

    @JsonProperty("tranField008")
    private Double tranField008;

    @Size(max = 20)
    @JsonProperty("tranField009")
    private String tranField009;

    @JsonProperty("tranField010")
    private Boolean tranField010;

    @Size(max = 40)
    @JsonProperty("tranField011")
    private String tranField011;

    @JsonProperty("tranField012")
    private LocalDate tranField012;

    @JsonProperty("tranField013")
    private Integer tranField013;

    public TransactionDto054() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final TransactionDto054 instance = new TransactionDto054();

        public Builder tranField000(BigDecimal val) { instance.tranField000 = val; return this; }
        public Builder tranField001(Boolean val) { instance.tranField001 = val; return this; }
        public Builder tranField002(LocalDate val) { instance.tranField002 = val; return this; }
        public Builder tranField003(BigDecimal val) { instance.tranField003 = val; return this; }
        public Builder tranField004(LocalDate val) { instance.tranField004 = val; return this; }
        public Builder tranField005(Long val) { instance.tranField005 = val; return this; }
        public Builder tranField006(String val) { instance.tranField006 = val; return this; }
        public Builder tranField007(Long val) { instance.tranField007 = val; return this; }
        public Builder tranField008(Double val) { instance.tranField008 = val; return this; }
        public Builder tranField009(String val) { instance.tranField009 = val; return this; }
        public Builder tranField010(Boolean val) { instance.tranField010 = val; return this; }
        public Builder tranField011(String val) { instance.tranField011 = val; return this; }
        public Builder tranField012(LocalDate val) { instance.tranField012 = val; return this; }
        public Builder tranField013(Integer val) { instance.tranField013 = val; return this; }
        public TransactionDto054 build() { return instance; }
    }

    public BigDecimal getTranField000() { return tranField000; }
    public void setTranField000(BigDecimal tranField000) { this.tranField000 = tranField000; }

    public Boolean getTranField001() { return tranField001; }
    public void setTranField001(Boolean tranField001) { this.tranField001 = tranField001; }

    public LocalDate getTranField002() { return tranField002; }
    public void setTranField002(LocalDate tranField002) { this.tranField002 = tranField002; }

    public BigDecimal getTranField003() { return tranField003; }
    public void setTranField003(BigDecimal tranField003) { this.tranField003 = tranField003; }

    public LocalDate getTranField004() { return tranField004; }
    public void setTranField004(LocalDate tranField004) { this.tranField004 = tranField004; }

    public Long getTranField005() { return tranField005; }
    public void setTranField005(Long tranField005) { this.tranField005 = tranField005; }

    public String getTranField006() { return tranField006; }
    public void setTranField006(String tranField006) { this.tranField006 = tranField006; }

    public Long getTranField007() { return tranField007; }
    public void setTranField007(Long tranField007) { this.tranField007 = tranField007; }

    public Double getTranField008() { return tranField008; }
    public void setTranField008(Double tranField008) { this.tranField008 = tranField008; }

    public String getTranField009() { return tranField009; }
    public void setTranField009(String tranField009) { this.tranField009 = tranField009; }

    public Boolean getTranField010() { return tranField010; }
    public void setTranField010(Boolean tranField010) { this.tranField010 = tranField010; }

    public String getTranField011() { return tranField011; }
    public void setTranField011(String tranField011) { this.tranField011 = tranField011; }

    public LocalDate getTranField012() { return tranField012; }
    public void setTranField012(LocalDate tranField012) { this.tranField012 = tranField012; }

    public Integer getTranField013() { return tranField013; }
    public void setTranField013(Integer tranField013) { this.tranField013 = tranField013; }

    @Override
    public String toString() {
        return "TransactionDto054{" +
            "tranField000=" + tranField000 + ", " +
            "tranField001=" + tranField001 + ", " +
            "tranField002=" + tranField002 + ", " +
            "tranField003=" + tranField003 + ", " +
            "tranField004=" + tranField004 + ", " +
            "}";
    }
}
