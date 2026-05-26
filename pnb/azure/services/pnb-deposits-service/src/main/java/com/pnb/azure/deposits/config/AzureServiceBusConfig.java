package com.pnb.azure.deposits.config;

import com.azure.messaging.servicebus.ServiceBusClientBuilder;
import com.azure.messaging.servicebus.ServiceBusSenderClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(name = "azure.servicebus.connection-string")
public class AzureServiceBusConfig {

    @Bean(destroyMethod = "close")
    public ServiceBusSenderClient mergerReconciliationSender(
            @Value("${azure.servicebus.connection-string}") String connectionString,
            @Value("${pnb.merger.topic:merger-reconciliation}") String topic) {
        return new ServiceBusClientBuilder()
                .connectionString(connectionString)
                .sender()
                .topicName(topic)
                .buildClient();
    }
}
