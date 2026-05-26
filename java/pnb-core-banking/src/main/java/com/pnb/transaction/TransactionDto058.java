package com.pnb.transaction;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * TransactionDto058 — Data Transfer Object for transaction operations.
 * Variant 58 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransactionDto058 {

    @JsonProperty("tranField000")
    private Boolean tranField000;

    @Size(max = 100)
    @JsonProperty("tranField001")
    private String tranField001;

    @JsonProperty("tranField002")
    private Integer tranField002;

    @DecimalMin(value = "0.00")
    @JsonProperty("tranField003")
    private BigDecimal tranField003;

    @Size(max = 100)
    @JsonProperty("tranField004")
    private String tranField004;

    @JsonProperty("tranField005")
    private Long tranField005;

    @JsonProperty("tranField006")
    private Double tranField006;

    @JsonProperty("tranField007")
    private Double tranField007;

    @JsonProperty("tranField008")
    private Integer tranField008;

    @JsonProperty("tranField009")
    private Integer tranField009;

    @JsonProperty("tranField010")
    private Boolean tranField010;

    @JsonProperty("tranField011")
    private LocalDate tranField011;

    @JsonProperty("tranField012")
    private Boolean tranField012;

    @JsonProperty("tranField013")
    private Boolean tranField013;

    @Size(max = 100)
    @JsonProperty("tranField014")
    private String tranField014;

    @Size(max = 60)
    @JsonProperty("tranField015")
    private String tranField015;

    @JsonProperty("tranField016")
    private LocalDate tranField016;

    @JsonProperty("tranField017")
    private Boolean tranField017;

    public TransactionDto058() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final TransactionDto058 instance = new TransactionDto058();

        public Builder tranField000(Boolean val) { instance.tranField000 = val; return this; }
        public Builder tranField001(String val) { instance.tranField001 = val; return this; }
        public Builder tranField002(Integer val) { instance.tranField002 = val; return this; }
        public Builder tranField003(BigDecimal val) { instance.tranField003 = val; return this; }
        public Builder tranField004(String val) { instance.tranField004 = val; return this; }
        public Builder tranField005(Long val) { instance.tranField005 = val; return this; }
        public Builder tranField006(Double val) { instance.tranField006 = val; return this; }
        public Builder tranField007(Double val) { instance.tranField007 = val; return this; }
        public Builder tranField008(Integer val) { instance.tranField008 = val; return this; }
        public Builder tranField009(Integer val) { instance.tranField009 = val; return this; }
        public Builder tranField010(Boolean val) { instance.tranField010 = val; return this; }
        public Builder tranField011(LocalDate val) { instance.tranField011 = val; return this; }
        public Builder tranField012(Boolean val) { instance.tranField012 = val; return this; }
        public Builder tranField013(Boolean val) { instance.tranField013 = val; return this; }
        public Builder tranField014(String val) { instance.tranField014 = val; return this; }
        public Builder tranField015(String val) { instance.tranField015 = val; return this; }
        public Builder tranField016(LocalDate val) { instance.tranField016 = val; return this; }
        public Builder tranField017(Boolean val) { instance.tranField017 = val; return this; }
        public TransactionDto058 build() { return instance; }
    }

    public Boolean getTranField000() { return tranField000; }
    public void setTranField000(Boolean tranField000) { this.tranField000 = tranField000; }

    public String getTranField001() { return tranField001; }
    public void setTranField001(String tranField001) { this.tranField001 = tranField001; }

    public Integer getTranField002() { return tranField002; }
    public void setTranField002(Integer tranField002) { this.tranField002 = tranField002; }

    public BigDecimal getTranField003() { return tranField003; }
    public void setTranField003(BigDecimal tranField003) { this.tranField003 = tranField003; }

    public String getTranField004() { return tranField004; }
    public void setTranField004(String tranField004) { this.tranField004 = tranField004; }

    public Long getTranField005() { return tranField005; }
    public void setTranField005(Long tranField005) { this.tranField005 = tranField005; }

    public Double getTranField006() { return tranField006; }
    public void setTranField006(Double tranField006) { this.tranField006 = tranField006; }

    public Double getTranField007() { return tranField007; }
    public void setTranField007(Double tranField007) { this.tranField007 = tranField007; }

    public Integer getTranField008() { return tranField008; }
    public void setTranField008(Integer tranField008) { this.tranField008 = tranField008; }

    public Integer getTranField009() { return tranField009; }
    public void setTranField009(Integer tranField009) { this.tranField009 = tranField009; }

    public Boolean getTranField010() { return tranField010; }
    public void setTranField010(Boolean tranField010) { this.tranField010 = tranField010; }

    public LocalDate getTranField011() { return tranField011; }
    public void setTranField011(LocalDate tranField011) { this.tranField011 = tranField011; }

    public Boolean getTranField012() { return tranField012; }
    public void setTranField012(Boolean tranField012) { this.tranField012 = tranField012; }

    public Boolean getTranField013() { return tranField013; }
    public void setTranField013(Boolean tranField013) { this.tranField013 = tranField013; }

    public String getTranField014() { return tranField014; }
    public void setTranField014(String tranField014) { this.tranField014 = tranField014; }

    public String getTranField015() { return tranField015; }
    public void setTranField015(String tranField015) { this.tranField015 = tranField015; }

    public LocalDate getTranField016() { return tranField016; }
    public void setTranField016(LocalDate tranField016) { this.tranField016 = tranField016; }

    public Boolean getTranField017() { return tranField017; }
    public void setTranField017(Boolean tranField017) { this.tranField017 = tranField017; }

    @Override
    public String toString() {
        return "TransactionDto058{" +
            "tranField000=" + tranField000 + ", " +
            "tranField001=" + tranField001 + ", " +
            "tranField002=" + tranField002 + ", " +
            "tranField003=" + tranField003 + ", " +
            "tranField004=" + tranField004 + ", " +
            "}";
    }
}
