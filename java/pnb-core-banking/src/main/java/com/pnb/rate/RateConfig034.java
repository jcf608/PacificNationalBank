package com.pnb.rate;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import org.eclipse.microprofile.config.inject.ConfigProperty;

/**
 * RateConfig034 — Configuration for rate module.
 */
@ApplicationScoped
public class RateConfig034 {

    @ConfigProperty(name = "pnb.rate.v34.enabled", defaultValue = "true")
    private boolean enabled;

    @ConfigProperty(name = "pnb.rate.v34.max-amount", defaultValue = "999999.99")
    private String maxAmount;

    @ConfigProperty(name = "pnb.rate.v34.timeout-ms", defaultValue = "30000")
    private int timeoutMs;

    @ConfigProperty(name = "pnb.rate.v34.retry-count", defaultValue = "3")
    private int retryCount;

    public boolean isEnabled() { return enabled; }
    public String getMaxAmount() { return maxAmount; }
    public int getTimeoutMs() { return timeoutMs; }
    public int getRetryCount() { return retryCount; }
}
