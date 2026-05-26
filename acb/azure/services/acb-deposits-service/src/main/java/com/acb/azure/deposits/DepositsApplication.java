package com.acb.azure.deposits;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DepositsApplication {
    public static void main(String[] args) {
        SpringApplication.run(DepositsApplication.class, args);
    }

    @RestController
    static class Health {
        @GetMapping("/api/v1/acb/deposits/health")
        String health() {
            return "{\"bank\":\"ACB\",\"domain\":\"deposits\",\"status\":\"UP\"}";
        }
    }
}
