package com.pnb.azure.deposits.service;

import com.azure.messaging.servicebus.ServiceBusMessage;
import com.azure.messaging.servicebus.ServiceBusSenderClient;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pnb.azure.deposits.domain.DepositAccount;
import com.pnb.azure.deposits.web.dto.PostingRequest;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MergerEventPublisher {

    private static final Logger log = LoggerFactory.getLogger(MergerEventPublisher.class);

    private final ServiceBusSenderClient senderClient;
    private final ObjectMapper objectMapper;

    @Value("${pnb.merger.topic:merger-reconciliation}")
    private String topic;

    public MergerEventPublisher(
            @Autowired(required = false) ServiceBusSenderClient senderClient,
            ObjectMapper objectMapper) {
        this.senderClient = senderClient;
        this.objectMapper = objectMapper;
    }

    public void publishBalanceChange(DepositAccount account, PostingRequest request) {
        if (senderClient == null) {
            log.debug("Service Bus not configured; skipping merger event for {}", account.getAccountNumber());
            return;
        }
        Map<String, Object> payload =
                Map.of(
                        "eventType",
                        "PNB_DEPOSIT_BALANCE_CHANGED",
                        "accountNumber",
                        account.getAccountNumber(),
                        "legacyPnbKey",
                        account.getLegacyPnbAccountKey(),
                        "acbReconciledKey",
                        account.getReconciledAcbAccountKey(),
                        "transactionId",
                        request.transactionId(),
                        "amount",
                        request.amount(),
                        "channel",
                        request.channel());

        try {
            String body = objectMapper.writeValueAsString(payload);
            senderClient.sendMessage(new ServiceBusMessage(body));
        } catch (JsonProcessingException ex) {
            log.error("Failed to serialize merger event", ex);
        }
    }
}
