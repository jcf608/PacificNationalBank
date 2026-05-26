package com.acb.azure.treasury;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class TreasuryApplication {
    public static void main(String[] args) {
        SpringApplication.run(TreasuryApplication.class, args);
    }

    @RestController
    static class Health {
        @GetMapping("/api/v1/acb/treasury/health")
        String health() {
            return "{\"bank\":\"ACB\",\"domain\":\"treasury\",\"status\":\"UP\"}";
        }
    }
}
