package com.pnb.customer;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import org.eclipse.microprofile.config.inject.ConfigProperty;

/**
 * CustomerConfig047 — Configuration for customer module.
 */
@ApplicationScoped
public class CustomerConfig047 {

    @ConfigProperty(name = "pnb.customer.v47.enabled", defaultValue = "true")
    private boolean enabled;

    @ConfigProperty(name = "pnb.customer.v47.max-amount", defaultValue = "999999.99")
    private String maxAmount;

    @ConfigProperty(name = "pnb.customer.v47.timeout-ms", defaultValue = "30000")
    private int timeoutMs;

    @ConfigProperty(name = "pnb.customer.v47.retry-count", defaultValue = "3")
    private int retryCount;

    public boolean isEnabled() { return enabled; }
    public String getMaxAmount() { return maxAmount; }
    public int getTimeoutMs() { return timeoutMs; }
    public int getRetryCount() { return retryCount; }
}
