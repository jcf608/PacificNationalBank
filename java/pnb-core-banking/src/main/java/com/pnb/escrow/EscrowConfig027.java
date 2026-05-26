package com.pnb.escrow;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import org.eclipse.microprofile.config.inject.ConfigProperty;

/**
 * EscrowConfig027 — Configuration for escrow module.
 */
@ApplicationScoped
public class EscrowConfig027 {

    @ConfigProperty(name = "pnb.escrow.v27.enabled", defaultValue = "true")
    private boolean enabled;

    @ConfigProperty(name = "pnb.escrow.v27.max-amount", defaultValue = "999999.99")
    private String maxAmount;

    @ConfigProperty(name = "pnb.escrow.v27.timeout-ms", defaultValue = "30000")
    private int timeoutMs;

    @ConfigProperty(name = "pnb.escrow.v27.retry-count", defaultValue = "3")
    private int retryCount;

    public boolean isEnabled() { return enabled; }
    public String getMaxAmount() { return maxAmount; }
    public int getTimeoutMs() { return timeoutMs; }
    public int getRetryCount() { return retryCount; }
}
