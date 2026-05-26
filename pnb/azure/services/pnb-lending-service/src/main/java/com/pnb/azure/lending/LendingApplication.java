package com.pnb.azure.lending;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class LendingApplication {
    public static void main(String[] args) {
        SpringApplication.run(LendingApplication.class, args);
    }

    @RestController
    static class Health {
        @GetMapping("/api/v1/pnb/lending/health")
        String health() {
            return "{\"bank\":\"PNB\",\"domain\":\"lending\",\"status\":\"UP\"}";
        }
    }
}
