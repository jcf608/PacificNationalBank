package com.pnb.stop;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import org.eclipse.microprofile.config.inject.ConfigProperty;

/**
 * StopConfig032 — Configuration for stop module.
 */
@ApplicationScoped
public class StopConfig032 {

    @ConfigProperty(name = "pnb.stop.v32.enabled", defaultValue = "true")
    private boolean enabled;

    @ConfigProperty(name = "pnb.stop.v32.max-amount", defaultValue = "999999.99")
    private String maxAmount;

    @ConfigProperty(name = "pnb.stop.v32.timeout-ms", defaultValue = "30000")
    private int timeoutMs;

    @ConfigProperty(name = "pnb.stop.v32.retry-count", defaultValue = "3")
    private int retryCount;

    public boolean isEnabled() { return enabled; }
    public String getMaxAmount() { return maxAmount; }
    public int getTimeoutMs() { return timeoutMs; }
    public int getRetryCount() { return retryCount; }
}
