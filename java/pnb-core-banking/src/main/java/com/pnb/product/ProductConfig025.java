package com.pnb.product;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import org.eclipse.microprofile.config.inject.ConfigProperty;

/**
 * ProductConfig025 — Configuration for product module.
 */
@ApplicationScoped
public class ProductConfig025 {

    @ConfigProperty(name = "pnb.product.v25.enabled", defaultValue = "true")
    private boolean enabled;

    @ConfigProperty(name = "pnb.product.v25.max-amount", defaultValue = "999999.99")
    private String maxAmount;

    @ConfigProperty(name = "pnb.product.v25.timeout-ms", defaultValue = "30000")
    private int timeoutMs;

    @ConfigProperty(name = "pnb.product.v25.retry-count", defaultValue = "3")
    private int retryCount;

    public boolean isEnabled() { return enabled; }
    public String getMaxAmount() { return maxAmount; }
    public int getTimeoutMs() { return timeoutMs; }
    public int getRetryCount() { return retryCount; }
}
