package com.pnb.transaction;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * TransactionDto047 — Data Transfer Object for transaction operations.
 * Variant 47 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransactionDto047 {

    @JsonProperty("tranField000")
    private Double tranField000;

    @JsonProperty("tranField001")
    private Long tranField001;

    @Size(max = 60)
    @JsonProperty("tranField002")
    private String tranField002;

    @DecimalMin(value = "0.00")
    @JsonProperty("tranField003")
    private BigDecimal tranField003;

    @DecimalMin(value = "0.00")
    @JsonProperty("tranField004")
    private BigDecimal tranField004;

    @JsonProperty("tranField005")
    private Double tranField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("tranField006")
    private BigDecimal tranField006;

    @JsonProperty("tranField007")
    private Long tranField007;

    @JsonProperty("tranField008")
    private LocalDate tranField008;

    @JsonProperty("tranField009")
    private Boolean tranField009;

    @JsonProperty("tranField010")
    private Boolean tranField010;

    @JsonProperty("tranField011")
    private Boolean tranField011;

    @Size(max = 100)
    @JsonProperty("tranField012")
    private String tranField012;

    @Size(max = 40)
    @JsonProperty("tranField013")
    private String tranField013;

    @JsonProperty("tranField014")
    private Integer tranField014;

    @JsonProperty("tranField015")
    private Boolean tranField015;

    @JsonProperty("tranField016")
    private Double tranField016;

    @Size(max = 40)
    @JsonProperty("tranField017")
    private String tranField017;

    @DecimalMin(value = "0.00")
    @JsonProperty("tranField018")
    private BigDecimal tranField018;

    public TransactionDto047() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final TransactionDto047 instance = new TransactionDto047();

        public Builder tranField000(Double val) { instance.tranField000 = val; return this; }
        public Builder tranField001(Long val) { instance.tranField001 = val; return this; }
        public Builder tranField002(String val) { instance.tranField002 = val; return this; }
        public Builder tranField003(BigDecimal val) { instance.tranField003 = val; return this; }
        public Builder tranField004(BigDecimal val) { instance.tranField004 = val; return this; }
        public Builder tranField005(Double val) { instance.tranField005 = val; return this; }
        public Builder tranField006(BigDecimal val) { instance.tranField006 = val; return this; }
        public Builder tranField007(Long val) { instance.tranField007 = val; return this; }
        public Builder tranField008(LocalDate val) { instance.tranField008 = val; return this; }
        public Builder tranField009(Boolean val) { instance.tranField009 = val; return this; }
        public Builder tranField010(Boolean val) { instance.tranField010 = val; return this; }
        public Builder tranField011(Boolean val) { instance.tranField011 = val; return this; }
        public Builder tranField012(String val) { instance.tranField012 = val; return this; }
        public Builder tranField013(String val) { instance.tranField013 = val; return this; }
        public Builder tranField014(Integer val) { instance.tranField014 = val; return this; }
        public Builder tranField015(Boolean val) { instance.tranField015 = val; return this; }
        public Builder tranField016(Double val) { instance.tranField016 = val; return this; }
        public Builder tranField017(String val) { instance.tranField017 = val; return this; }
        public Builder tranField018(BigDecimal val) { instance.tranField018 = val; return this; }
        public TransactionDto047 build() { return instance; }
    }

    public Double getTranField000() { return tranField000; }
    public void setTranField000(Double tranField000) { this.tranField000 = tranField000; }

    public Long getTranField001() { return tranField001; }
    public void setTranField001(Long tranField001) { this.tranField001 = tranField001; }

    public String getTranField002() { return tranField002; }
    public void setTranField002(String tranField002) { this.tranField002 = tranField002; }

    public BigDecimal getTranField003() { return tranField003; }
    public void setTranField003(BigDecimal tranField003) { this.tranField003 = tranField003; }

    public BigDecimal getTranField004() { return tranField004; }
    public void setTranField004(BigDecimal tranField004) { this.tranField004 = tranField004; }

    public Double getTranField005() { return tranField005; }
    public void setTranField005(Double tranField005) { this.tranField005 = tranField005; }

    public BigDecimal getTranField006() { return tranField006; }
    public void setTranField006(BigDecimal tranField006) { this.tranField006 = tranField006; }

    public Long getTranField007() { return tranField007; }
    public void setTranField007(Long tranField007) { this.tranField007 = tranField007; }

    public LocalDate getTranField008() { return tranField008; }
    public void setTranField008(LocalDate tranField008) { this.tranField008 = tranField008; }

    public Boolean getTranField009() { return tranField009; }
    public void setTranField009(Boolean tranField009) { this.tranField009 = tranField009; }

    public Boolean getTranField010() { return tranField010; }
    public void setTranField010(Boolean tranField010) { this.tranField010 = tranField010; }

    public Boolean getTranField011() { return tranField011; }
    public void setTranField011(Boolean tranField011) { this.tranField011 = tranField011; }

    public String getTranField012() { return tranField012; }
    public void setTranField012(String tranField012) { this.tranField012 = tranField012; }

    public String getTranField013() { return tranField013; }
    public void setTranField013(String tranField013) { this.tranField013 = tranField013; }

    public Integer getTranField014() { return tranField014; }
    public void setTranField014(Integer tranField014) { this.tranField014 = tranField014; }

    public Boolean getTranField015() { return tranField015; }
    public void setTranField015(Boolean tranField015) { this.tranField015 = tranField015; }

    public Double getTranField016() { return tranField016; }
    public void setTranField016(Double tranField016) { this.tranField016 = tranField016; }

    public String getTranField017() { return tranField017; }
    public void setTranField017(String tranField017) { this.tranField017 = tranField017; }

    public BigDecimal getTranField018() { return tranField018; }
    public void setTranField018(BigDecimal tranField018) { this.tranField018 = tranField018; }

    @Override
    public String toString() {
        return "TransactionDto047{" +
            "tranField000=" + tranField000 + ", " +
            "tranField001=" + tranField001 + ", " +
            "tranField002=" + tranField002 + ", " +
            "tranField003=" + tranField003 + ", " +
            "tranField004=" + tranField004 + ", " +
            "}";
    }
}
