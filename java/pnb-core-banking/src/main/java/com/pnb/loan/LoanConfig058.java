package com.pnb.loan;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import org.eclipse.microprofile.config.inject.ConfigProperty;

/**
 * LoanConfig058 — Configuration for loan module.
 */
@ApplicationScoped
public class LoanConfig058 {

    @ConfigProperty(name = "pnb.loan.v58.enabled", defaultValue = "true")
    private boolean enabled;

    @ConfigProperty(name = "pnb.loan.v58.max-amount", defaultValue = "999999.99")
    private String maxAmount;

    @ConfigProperty(name = "pnb.loan.v58.timeout-ms", defaultValue = "30000")
    private int timeoutMs;

    @ConfigProperty(name = "pnb.loan.v58.retry-count", defaultValue = "3")
    private int retryCount;

    public boolean isEnabled() { return enabled; }
    public String getMaxAmount() { return maxAmount; }
    public int getTimeoutMs() { return timeoutMs; }
    public int getRetryCount() { return retryCount; }
}
