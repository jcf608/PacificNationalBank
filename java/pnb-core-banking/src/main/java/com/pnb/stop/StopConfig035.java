package com.pnb.stop;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import org.eclipse.microprofile.config.inject.ConfigProperty;

/**
 * StopConfig035 — Configuration for stop module.
 */
@ApplicationScoped
public class StopConfig035 {

    @ConfigProperty(name = "pnb.stop.v35.enabled", defaultValue = "true")
    private boolean enabled;

    @ConfigProperty(name = "pnb.stop.v35.max-amount", defaultValue = "999999.99")
    private String maxAmount;

    @ConfigProperty(name = "pnb.stop.v35.timeout-ms", defaultValue = "30000")
    private int timeoutMs;

    @ConfigProperty(name = "pnb.stop.v35.retry-count", defaultValue = "3")
    private int retryCount;

    public boolean isEnabled() { return enabled; }
    public String getMaxAmount() { return maxAmount; }
    public int getTimeoutMs() { return timeoutMs; }
    public int getRetryCount() { return retryCount; }
}
