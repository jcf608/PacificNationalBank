package com.pnb.risk;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import org.eclipse.microprofile.config.inject.ConfigProperty;

/**
 * RiskConfig039 — Configuration for risk module.
 */
@ApplicationScoped
public class RiskConfig039 {

    @ConfigProperty(name = "pnb.risk.v39.enabled", defaultValue = "true")
    private boolean enabled;

    @ConfigProperty(name = "pnb.risk.v39.max-amount", defaultValue = "999999.99")
    private String maxAmount;

    @ConfigProperty(name = "pnb.risk.v39.timeout-ms", defaultValue = "30000")
    private int timeoutMs;

    @ConfigProperty(name = "pnb.risk.v39.retry-count", defaultValue = "3")
    private int retryCount;

    public boolean isEnabled() { return enabled; }
    public String getMaxAmount() { return maxAmount; }
    public int getTimeoutMs() { return timeoutMs; }
    public int getRetryCount() { return retryCount; }
}
