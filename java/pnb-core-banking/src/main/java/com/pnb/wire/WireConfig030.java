package com.pnb.wire;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import org.eclipse.microprofile.config.inject.ConfigProperty;

/**
 * WireConfig030 — Configuration for wire module.
 */
@ApplicationScoped
public class WireConfig030 {

    @ConfigProperty(name = "pnb.wire.v30.enabled", defaultValue = "true")
    private boolean enabled;

    @ConfigProperty(name = "pnb.wire.v30.max-amount", defaultValue = "999999.99")
    private String maxAmount;

    @ConfigProperty(name = "pnb.wire.v30.timeout-ms", defaultValue = "30000")
    private int timeoutMs;

    @ConfigProperty(name = "pnb.wire.v30.retry-count", defaultValue = "3")
    private int retryCount;

    public boolean isEnabled() { return enabled; }
    public String getMaxAmount() { return maxAmount; }
    public int getTimeoutMs() { return timeoutMs; }
    public int getRetryCount() { return retryCount; }
}
