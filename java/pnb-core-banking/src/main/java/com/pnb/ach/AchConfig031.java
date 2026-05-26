package com.pnb.ach;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import org.eclipse.microprofile.config.inject.ConfigProperty;

/**
 * AchConfig031 — Configuration for ach module.
 */
@ApplicationScoped
public class AchConfig031 {

    @ConfigProperty(name = "pnb.ach.v31.enabled", defaultValue = "true")
    private boolean enabled;

    @ConfigProperty(name = "pnb.ach.v31.max-amount", defaultValue = "999999.99")
    private String maxAmount;

    @ConfigProperty(name = "pnb.ach.v31.timeout-ms", defaultValue = "30000")
    private int timeoutMs;

    @ConfigProperty(name = "pnb.ach.v31.retry-count", defaultValue = "3")
    private int retryCount;

    public boolean isEnabled() { return enabled; }
    public String getMaxAmount() { return maxAmount; }
    public int getTimeoutMs() { return timeoutMs; }
    public int getRetryCount() { return retryCount; }
}
