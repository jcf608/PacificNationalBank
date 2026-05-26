package com.pnb.risk;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import org.eclipse.microprofile.config.inject.ConfigProperty;

/**
 * RiskConfig028 — Configuration for risk module.
 */
@ApplicationScoped
public class RiskConfig028 {

    @ConfigProperty(name = "pnb.risk.v28.enabled", defaultValue = "true")
    private boolean enabled;

    @ConfigProperty(name = "pnb.risk.v28.max-amount", defaultValue = "999999.99")
    private String maxAmount;

    @ConfigProperty(name = "pnb.risk.v28.timeout-ms", defaultValue = "30000")
    private int timeoutMs;

    @ConfigProperty(name = "pnb.risk.v28.retry-count", defaultValue = "3")
    private int retryCount;

    public boolean isEnabled() { return enabled; }
    public String getMaxAmount() { return maxAmount; }
    public int getTimeoutMs() { return timeoutMs; }
    public int getRetryCount() { return retryCount; }
}
