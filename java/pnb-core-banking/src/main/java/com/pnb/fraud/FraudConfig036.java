package com.pnb.fraud;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import org.eclipse.microprofile.config.inject.ConfigProperty;

/**
 * FraudConfig036 — Configuration for fraud module.
 */
@ApplicationScoped
public class FraudConfig036 {

    @ConfigProperty(name = "pnb.fraud.v36.enabled", defaultValue = "true")
    private boolean enabled;

    @ConfigProperty(name = "pnb.fraud.v36.max-amount", defaultValue = "999999.99")
    private String maxAmount;

    @ConfigProperty(name = "pnb.fraud.v36.timeout-ms", defaultValue = "30000")
    private int timeoutMs;

    @ConfigProperty(name = "pnb.fraud.v36.retry-count", defaultValue = "3")
    private int retryCount;

    public boolean isEnabled() { return enabled; }
    public String getMaxAmount() { return maxAmount; }
    public int getTimeoutMs() { return timeoutMs; }
    public int getRetryCount() { return retryCount; }
}
