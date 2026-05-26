package com.pnb.transaction;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * TransactionDto023 — Data Transfer Object for transaction operations.
 * Variant 23 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransactionDto023 {

    @JsonProperty("tranField000")
    private Long tranField000;

    @JsonProperty("tranField001")
    private Long tranField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("tranField002")
    private BigDecimal tranField002;

    @Size(max = 60)
    @JsonProperty("tranField003")
    private String tranField003;

    @Size(max = 40)
    @JsonProperty("tranField004")
    private String tranField004;

    @JsonProperty("tranField005")
    private LocalDate tranField005;

    @JsonProperty("tranField006")
    private Double tranField006;

    @Size(max = 200)
    @JsonProperty("tranField007")
    private String tranField007;

    @JsonProperty("tranField008")
    private Integer tranField008;

    @Size(max = 100)
    @JsonProperty("tranField009")
    private String tranField009;

    @Size(max = 20)
    @JsonProperty("tranField010")
    private String tranField010;

    @DecimalMin(value = "0.00")
    @JsonProperty("tranField011")
    private BigDecimal tranField011;

    @JsonProperty("tranField012")
    private Boolean tranField012;

    @Size(max = 200)
    @JsonProperty("tranField013")
    private String tranField013;

    @JsonProperty("tranField014")
    private Boolean tranField014;

    @JsonProperty("tranField015")
    private LocalDate tranField015;

    @Size(max = 20)
    @JsonProperty("tranField016")
    private String tranField016;

    @DecimalMin(value = "0.00")
    @JsonProperty("tranField017")
    private BigDecimal tranField017;

    @JsonProperty("tranField018")
    private Double tranField018;

    public TransactionDto023() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final TransactionDto023 instance = new TransactionDto023();

        public Builder tranField000(Long val) { instance.tranField000 = val; return this; }
        public Builder tranField001(Long val) { instance.tranField001 = val; return this; }
        public Builder tranField002(BigDecimal val) { instance.tranField002 = val; return this; }
        public Builder tranField003(String val) { instance.tranField003 = val; return this; }
        public Builder tranField004(String val) { instance.tranField004 = val; return this; }
        public Builder tranField005(LocalDate val) { instance.tranField005 = val; return this; }
        public Builder tranField006(Double val) { instance.tranField006 = val; return this; }
        public Builder tranField007(String val) { instance.tranField007 = val; return this; }
        public Builder tranField008(Integer val) { instance.tranField008 = val; return this; }
        public Builder tranField009(String val) { instance.tranField009 = val; return this; }
        public Builder tranField010(String val) { instance.tranField010 = val; return this; }
        public Builder tranField011(BigDecimal val) { instance.tranField011 = val; return this; }
        public Builder tranField012(Boolean val) { instance.tranField012 = val; return this; }
        public Builder tranField013(String val) { instance.tranField013 = val; return this; }
        public Builder tranField014(Boolean val) { instance.tranField014 = val; return this; }
        public Builder tranField015(LocalDate val) { instance.tranField015 = val; return this; }
        public Builder tranField016(String val) { instance.tranField016 = val; return this; }
        public Builder tranField017(BigDecimal val) { instance.tranField017 = val; return this; }
        public Builder tranField018(Double val) { instance.tranField018 = val; return this; }
        public TransactionDto023 build() { return instance; }
    }

    public Long getTranField000() { return tranField000; }
    public void setTranField000(Long tranField000) { this.tranField000 = tranField000; }

    public Long getTranField001() { return tranField001; }
    public void setTranField001(Long tranField001) { this.tranField001 = tranField001; }

    public BigDecimal getTranField002() { return tranField002; }
    public void setTranField002(BigDecimal tranField002) { this.tranField002 = tranField002; }

    public String getTranField003() { return tranField003; }
    public void setTranField003(String tranField003) { this.tranField003 = tranField003; }

    public String getTranField004() { return tranField004; }
    public void setTranField004(String tranField004) { this.tranField004 = tranField004; }

    public LocalDate getTranField005() { return tranField005; }
    public void setTranField005(LocalDate tranField005) { this.tranField005 = tranField005; }

    public Double getTranField006() { return tranField006; }
    public void setTranField006(Double tranField006) { this.tranField006 = tranField006; }

    public String getTranField007() { return tranField007; }
    public void setTranField007(String tranField007) { this.tranField007 = tranField007; }

    public Integer getTranField008() { return tranField008; }
    public void setTranField008(Integer tranField008) { this.tranField008 = tranField008; }

    public String getTranField009() { return tranField009; }
    public void setTranField009(String tranField009) { this.tranField009 = tranField009; }

    public String getTranField010() { return tranField010; }
    public void setTranField010(String tranField010) { this.tranField010 = tranField010; }

    public BigDecimal getTranField011() { return tranField011; }
    public void setTranField011(BigDecimal tranField011) { this.tranField011 = tranField011; }

    public Boolean getTranField012() { return tranField012; }
    public void setTranField012(Boolean tranField012) { this.tranField012 = tranField012; }

    public String getTranField013() { return tranField013; }
    public void setTranField013(String tranField013) { this.tranField013 = tranField013; }

    public Boolean getTranField014() { return tranField014; }
    public void setTranField014(Boolean tranField014) { this.tranField014 = tranField014; }

    public LocalDate getTranField015() { return tranField015; }
    public void setTranField015(LocalDate tranField015) { this.tranField015 = tranField015; }

    public String getTranField016() { return tranField016; }
    public void setTranField016(String tranField016) { this.tranField016 = tranField016; }

    public BigDecimal getTranField017() { return tranField017; }
    public void setTranField017(BigDecimal tranField017) { this.tranField017 = tranField017; }

    public Double getTranField018() { return tranField018; }
    public void setTranField018(Double tranField018) { this.tranField018 = tranField018; }

    @Override
    public String toString() {
        return "TransactionDto023{" +
            "tranField000=" + tranField000 + ", " +
            "tranField001=" + tranField001 + ", " +
            "tranField002=" + tranField002 + ", " +
            "tranField003=" + tranField003 + ", " +
            "tranField004=" + tranField004 + ", " +
            "}";
    }
}
