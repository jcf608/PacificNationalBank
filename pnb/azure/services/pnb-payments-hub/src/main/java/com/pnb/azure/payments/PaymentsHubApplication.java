package com.pnb.azure.payments;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class PaymentsHubApplication {
    public static void main(String[] args) {
        SpringApplication.run(PaymentsHubApplication.class, args);
    }

    @RestController
    static class Health {
        @GetMapping("/api/v1/pnb/payments/health")
        String health() {
            return "{\"bank\":\"PNB\",\"domain\":\"payments\",\"status\":\"UP\"}";
        }
    }
}
