package com.pnb.transaction;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * TransactionDto022 — Data Transfer Object for transaction operations.
 * Variant 22 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransactionDto022 {

    @JsonProperty("tranField000")
    private Boolean tranField000;

    @JsonProperty("tranField001")
    private Double tranField001;

    @JsonProperty("tranField002")
    private Boolean tranField002;

    @JsonProperty("tranField003")
    private Boolean tranField003;

    @JsonProperty("tranField004")
    private Double tranField004;

    @JsonProperty("tranField005")
    private Long tranField005;

    @JsonProperty("tranField006")
    private Long tranField006;

    @JsonProperty("tranField007")
    private LocalDate tranField007;

    @DecimalMin(value = "0.00")
    @JsonProperty("tranField008")
    private BigDecimal tranField008;

    @JsonProperty("tranField009")
    private LocalDate tranField009;

    @JsonProperty("tranField010")
    private LocalDate tranField010;

    @Size(max = 200)
    @JsonProperty("tranField011")
    private String tranField011;

    @JsonProperty("tranField012")
    private Boolean tranField012;

    @JsonProperty("tranField013")
    private LocalDate tranField013;

    @DecimalMin(value = "0.00")
    @JsonProperty("tranField014")
    private BigDecimal tranField014;

    @Size(max = 60)
    @JsonProperty("tranField015")
    private String tranField015;

    @DecimalMin(value = "0.00")
    @JsonProperty("tranField016")
    private BigDecimal tranField016;

    @JsonProperty("tranField017")
    private Boolean tranField017;

    public TransactionDto022() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final TransactionDto022 instance = new TransactionDto022();

        public Builder tranField000(Boolean val) { instance.tranField000 = val; return this; }
        public Builder tranField001(Double val) { instance.tranField001 = val; return this; }
        public Builder tranField002(Boolean val) { instance.tranField002 = val; return this; }
        public Builder tranField003(Boolean val) { instance.tranField003 = val; return this; }
        public Builder tranField004(Double val) { instance.tranField004 = val; return this; }
        public Builder tranField005(Long val) { instance.tranField005 = val; return this; }
        public Builder tranField006(Long val) { instance.tranField006 = val; return this; }
        public Builder tranField007(LocalDate val) { instance.tranField007 = val; return this; }
        public Builder tranField008(BigDecimal val) { instance.tranField008 = val; return this; }
        public Builder tranField009(LocalDate val) { instance.tranField009 = val; return this; }
        public Builder tranField010(LocalDate val) { instance.tranField010 = val; return this; }
        public Builder tranField011(String val) { instance.tranField011 = val; return this; }
        public Builder tranField012(Boolean val) { instance.tranField012 = val; return this; }
        public Builder tranField013(LocalDate val) { instance.tranField013 = val; return this; }
        public Builder tranField014(BigDecimal val) { instance.tranField014 = val; return this; }
        public Builder tranField015(String val) { instance.tranField015 = val; return this; }
        public Builder tranField016(BigDecimal val) { instance.tranField016 = val; return this; }
        public Builder tranField017(Boolean val) { instance.tranField017 = val; return this; }
        public TransactionDto022 build() { return instance; }
    }

    public Boolean getTranField000() { return tranField000; }
    public void setTranField000(Boolean tranField000) { this.tranField000 = tranField000; }

    public Double getTranField001() { return tranField001; }
    public void setTranField001(Double tranField001) { this.tranField001 = tranField001; }

    public Boolean getTranField002() { return tranField002; }
    public void setTranField002(Boolean tranField002) { this.tranField002 = tranField002; }

    public Boolean getTranField003() { return tranField003; }
    public void setTranField003(Boolean tranField003) { this.tranField003 = tranField003; }

    public Double getTranField004() { return tranField004; }
    public void setTranField004(Double tranField004) { this.tranField004 = tranField004; }

    public Long getTranField005() { return tranField005; }
    public void setTranField005(Long tranField005) { this.tranField005 = tranField005; }

    public Long getTranField006() { return tranField006; }
    public void setTranField006(Long tranField006) { this.tranField006 = tranField006; }

    public LocalDate getTranField007() { return tranField007; }
    public void setTranField007(LocalDate tranField007) { this.tranField007 = tranField007; }

    public BigDecimal getTranField008() { return tranField008; }
    public void setTranField008(BigDecimal tranField008) { this.tranField008 = tranField008; }

    public LocalDate getTranField009() { return tranField009; }
    public void setTranField009(LocalDate tranField009) { this.tranField009 = tranField009; }

    public LocalDate getTranField010() { return tranField010; }
    public void setTranField010(LocalDate tranField010) { this.tranField010 = tranField010; }

    public String getTranField011() { return tranField011; }
    public void setTranField011(String tranField011) { this.tranField011 = tranField011; }

    public Boolean getTranField012() { return tranField012; }
    public void setTranField012(Boolean tranField012) { this.tranField012 = tranField012; }

    public LocalDate getTranField013() { return tranField013; }
    public void setTranField013(LocalDate tranField013) { this.tranField013 = tranField013; }

    public BigDecimal getTranField014() { return tranField014; }
    public void setTranField014(BigDecimal tranField014) { this.tranField014 = tranField014; }

    public String getTranField015() { return tranField015; }
    public void setTranField015(String tranField015) { this.tranField015 = tranField015; }

    public BigDecimal getTranField016() { return tranField016; }
    public void setTranField016(BigDecimal tranField016) { this.tranField016 = tranField016; }

    public Boolean getTranField017() { return tranField017; }
    public void setTranField017(Boolean tranField017) { this.tranField017 = tranField017; }

    @Override
    public String toString() {
        return "TransactionDto022{" +
            "tranField000=" + tranField000 + ", " +
            "tranField001=" + tranField001 + ", " +
            "tranField002=" + tranField002 + ", " +
            "tranField003=" + tranField003 + ", " +
            "tranField004=" + tranField004 + ", " +
            "}";
    }
}
