package com.pnb.transaction;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * TransactionDto045 — Data Transfer Object for transaction operations.
 * Variant 45 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransactionDto045 {

    @JsonProperty("tranField000")
    private LocalDate tranField000;

    @JsonProperty("tranField001")
    private LocalDate tranField001;

    @Size(max = 200)
    @JsonProperty("tranField002")
    private String tranField002;

    @Size(max = 200)
    @JsonProperty("tranField003")
    private String tranField003;

    @JsonProperty("tranField004")
    private Boolean tranField004;

    @JsonProperty("tranField005")
    private LocalDate tranField005;

    @JsonProperty("tranField006")
    private Boolean tranField006;

    @Size(max = 100)
    @JsonProperty("tranField007")
    private String tranField007;

    @JsonProperty("tranField008")
    private LocalDate tranField008;

    @JsonProperty("tranField009")
    private Long tranField009;

    @JsonProperty("tranField010")
    private Double tranField010;

    @JsonProperty("tranField011")
    private Double tranField011;

    @JsonProperty("tranField012")
    private Integer tranField012;

    @DecimalMin(value = "0.00")
    @JsonProperty("tranField013")
    private BigDecimal tranField013;

    @Size(max = 40)
    @JsonProperty("tranField014")
    private String tranField014;

    @JsonProperty("tranField015")
    private Boolean tranField015;

    @DecimalMin(value = "0.00")
    @JsonProperty("tranField016")
    private BigDecimal tranField016;

    public TransactionDto045() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final TransactionDto045 instance = new TransactionDto045();

        public Builder tranField000(LocalDate val) { instance.tranField000 = val; return this; }
        public Builder tranField001(LocalDate val) { instance.tranField001 = val; return this; }
        public Builder tranField002(String val) { instance.tranField002 = val; return this; }
        public Builder tranField003(String val) { instance.tranField003 = val; return this; }
        public Builder tranField004(Boolean val) { instance.tranField004 = val; return this; }
        public Builder tranField005(LocalDate val) { instance.tranField005 = val; return this; }
        public Builder tranField006(Boolean val) { instance.tranField006 = val; return this; }
        public Builder tranField007(String val) { instance.tranField007 = val; return this; }
        public Builder tranField008(LocalDate val) { instance.tranField008 = val; return this; }
        public Builder tranField009(Long val) { instance.tranField009 = val; return this; }
        public Builder tranField010(Double val) { instance.tranField010 = val; return this; }
        public Builder tranField011(Double val) { instance.tranField011 = val; return this; }
        public Builder tranField012(Integer val) { instance.tranField012 = val; return this; }
        public Builder tranField013(BigDecimal val) { instance.tranField013 = val; return this; }
        public Builder tranField014(String val) { instance.tranField014 = val; return this; }
        public Builder tranField015(Boolean val) { instance.tranField015 = val; return this; }
        public Builder tranField016(BigDecimal val) { instance.tranField016 = val; return this; }
        public TransactionDto045 build() { return instance; }
    }

    public LocalDate getTranField000() { return tranField000; }
    public void setTranField000(LocalDate tranField000) { this.tranField000 = tranField000; }

    public LocalDate getTranField001() { return tranField001; }
    public void setTranField001(LocalDate tranField001) { this.tranField001 = tranField001; }

    public String getTranField002() { return tranField002; }
    public void setTranField002(String tranField002) { this.tranField002 = tranField002; }

    public String getTranField003() { return tranField003; }
    public void setTranField003(String tranField003) { this.tranField003 = tranField003; }

    public Boolean getTranField004() { return tranField004; }
    public void setTranField004(Boolean tranField004) { this.tranField004 = tranField004; }

    public LocalDate getTranField005() { return tranField005; }
    public void setTranField005(LocalDate tranField005) { this.tranField005 = tranField005; }

    public Boolean getTranField006() { return tranField006; }
    public void setTranField006(Boolean tranField006) { this.tranField006 = tranField006; }

    public String getTranField007() { return tranField007; }
    public void setTranField007(String tranField007) { this.tranField007 = tranField007; }

    public LocalDate getTranField008() { return tranField008; }
    public void setTranField008(LocalDate tranField008) { this.tranField008 = tranField008; }

    public Long getTranField009() { return tranField009; }
    public void setTranField009(Long tranField009) { this.tranField009 = tranField009; }

    public Double getTranField010() { return tranField010; }
    public void setTranField010(Double tranField010) { this.tranField010 = tranField010; }

    public Double getTranField011() { return tranField011; }
    public void setTranField011(Double tranField011) { this.tranField011 = tranField011; }

    public Integer getTranField012() { return tranField012; }
    public void setTranField012(Integer tranField012) { this.tranField012 = tranField012; }

    public BigDecimal getTranField013() { return tranField013; }
    public void setTranField013(BigDecimal tranField013) { this.tranField013 = tranField013; }

    public String getTranField014() { return tranField014; }
    public void setTranField014(String tranField014) { this.tranField014 = tranField014; }

    public Boolean getTranField015() { return tranField015; }
    public void setTranField015(Boolean tranField015) { this.tranField015 = tranField015; }

    public BigDecimal getTranField016() { return tranField016; }
    public void setTranField016(BigDecimal tranField016) { this.tranField016 = tranField016; }

    @Override
    public String toString() {
        return "TransactionDto045{" +
            "tranField000=" + tranField000 + ", " +
            "tranField001=" + tranField001 + ", " +
            "tranField002=" + tranField002 + ", " +
            "tranField003=" + tranField003 + ", " +
            "tranField004=" + tranField004 + ", " +
            "}";
    }
}
