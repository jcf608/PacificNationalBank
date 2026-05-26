package com.pnb.wire;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import org.eclipse.microprofile.config.inject.ConfigProperty;

/**
 * WireConfig022 — Configuration for wire module.
 */
@ApplicationScoped
public class WireConfig022 {

    @ConfigProperty(name = "pnb.wire.v22.enabled", defaultValue = "true")
    private boolean enabled;

    @ConfigProperty(name = "pnb.wire.v22.max-amount", defaultValue = "999999.99")
    private String maxAmount;

    @ConfigProperty(name = "pnb.wire.v22.timeout-ms", defaultValue = "30000")
    private int timeoutMs;

    @ConfigProperty(name = "pnb.wire.v22.retry-count", defaultValue = "3")
    private int retryCount;

    public boolean isEnabled() { return enabled; }
    public String getMaxAmount() { return maxAmount; }
    public int getTimeoutMs() { return timeoutMs; }
    public int getRetryCount() { return retryCount; }
}
