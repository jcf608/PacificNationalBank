package com.pnb.rate;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import org.eclipse.microprofile.config.inject.ConfigProperty;

/**
 * RateConfig031 — Configuration for rate module.
 */
@ApplicationScoped
public class RateConfig031 {

    @ConfigProperty(name = "pnb.rate.v31.enabled", defaultValue = "true")
    private boolean enabled;

    @ConfigProperty(name = "pnb.rate.v31.max-amount", defaultValue = "999999.99")
    private String maxAmount;

    @ConfigProperty(name = "pnb.rate.v31.timeout-ms", defaultValue = "30000")
    private int timeoutMs;

    @ConfigProperty(name = "pnb.rate.v31.retry-count", defaultValue = "3")
    private int retryCount;

    public boolean isEnabled() { return enabled; }
    public String getMaxAmount() { return maxAmount; }
    public int getTimeoutMs() { return timeoutMs; }
    public int getRetryCount() { return retryCount; }
}
