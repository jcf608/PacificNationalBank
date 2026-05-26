package com.pnb.fraud;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import org.eclipse.microprofile.config.inject.ConfigProperty;

/**
 * FraudConfig033 — Configuration for fraud module.
 */
@ApplicationScoped
public class FraudConfig033 {

    @ConfigProperty(name = "pnb.fraud.v33.enabled", defaultValue = "true")
    private boolean enabled;

    @ConfigProperty(name = "pnb.fraud.v33.max-amount", defaultValue = "999999.99")
    private String maxAmount;

    @ConfigProperty(name = "pnb.fraud.v33.timeout-ms", defaultValue = "30000")
    private int timeoutMs;

    @ConfigProperty(name = "pnb.fraud.v33.retry-count", defaultValue = "3")
    private int retryCount;

    public boolean isEnabled() { return enabled; }
    public String getMaxAmount() { return maxAmount; }
    public int getTimeoutMs() { return timeoutMs; }
    public int getRetryCount() { return retryCount; }
}
