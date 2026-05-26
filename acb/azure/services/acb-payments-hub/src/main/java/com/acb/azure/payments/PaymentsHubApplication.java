package com.acb.azure.payments;

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
        @GetMapping("/api/v1/acb/payments/health")
        String health() {
            return "{\"bank\":\"ACB\",\"domain\":\"payments\",\"status\":\"UP\"}";
        }
    }
}
