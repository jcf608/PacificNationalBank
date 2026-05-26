package com.pnb.product;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import org.eclipse.microprofile.config.inject.ConfigProperty;

/**
 * ProductConfig023 — Configuration for product module.
 */
@ApplicationScoped
public class ProductConfig023 {

    @ConfigProperty(name = "pnb.product.v23.enabled", defaultValue = "true")
    private boolean enabled;

    @ConfigProperty(name = "pnb.product.v23.max-amount", defaultValue = "999999.99")
    private String maxAmount;

    @ConfigProperty(name = "pnb.product.v23.timeout-ms", defaultValue = "30000")
    private int timeoutMs;

    @ConfigProperty(name = "pnb.product.v23.retry-count", defaultValue = "3")
    private int retryCount;

    public boolean isEnabled() { return enabled; }
    public String getMaxAmount() { return maxAmount; }
    public int getTimeoutMs() { return timeoutMs; }
    public int getRetryCount() { return retryCount; }
}
