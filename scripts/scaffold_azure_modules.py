#!/usr/bin/env python3
"""Scaffold remaining Azure service modules from deposits template."""
from pathlib import Path

ROOT = Path(__file__).resolve().parents[1]

MODULES = {
    "pnb": [
        ("pnb-payments-hub", 8082, "payments", "PaymentsHub"),
        ("pnb-lending-service", 8083, "lending", "Lending"),
        ("pnb-treasury-service", 8084, "treasury", "Treasury"),
    ],
    "acb": [
        ("acb-deposits-service", 8181, "deposits", "Deposits"),
        ("acb-payments-hub", 8182, "payments", "PaymentsHub"),
        ("acb-lending-service", 8183, "lending", "Lending"),
        ("acb-treasury-service", 8184, "treasury", "Treasury"),
    ],
}


def pom(artifact: str, parent_group: str, parent_artifact: str) -> str:
    return f"""<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>
  <parent>
    <groupId>{parent_group}</groupId>
    <artifactId>{parent_artifact}</artifactId>
    <version>1.0.0-SNAPSHOT</version>
  </parent>
  <artifactId>{artifact}</artifactId>
  <dependencies>
    <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-actuator</artifactId>
    </dependency>
  </dependencies>
  <build>
    <plugins>
      <plugin>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-maven-plugin</artifactId>
        <version>${{spring-boot.version}}</version>
      </plugin>
    </plugins>
  </build>
</project>
"""


def app_java(bank: str, pkg: str, cls: str) -> str:
    return f"""package com.{bank}.azure.{pkg};

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class {cls}Application {{
    public static void main(String[] args) {{
        SpringApplication.run({cls}Application.class, args);
    }}

    @RestController
    static class Health {{
        @GetMapping("/api/v1/{bank}/{pkg}/health")
        String health() {{
            return "{{\\"bank\\":\\"{bank.upper()}\\",\\"domain\\":\\"{pkg}\\",\\"status\\":\\"UP\\"}}";
        }}
    }}
}}
"""


def yml(bank: str, pkg: str, port: int) -> str:
    return f"""server:
  port: {port}
spring:
  application:
    name: {bank}-{pkg}-service
management:
  endpoints:
    web:
      exposure:
        include: health,info
"""


def main() -> None:
    for bank, modules in MODULES.items():
        if bank == "pnb":
            base = ROOT / "pnb" / "azure" / "services"
            parent_group = "com.pnb.azure"
            parent_artifact = "pnb-azure-services"
        else:
            base = ROOT / "acb" / "azure" / "services"
            parent_group = "com.acb.azure"
            parent_artifact = "acb-azure-services"

        for artifact, port, pkg, cls in modules:
            if (base / artifact).exists() and artifact.endswith("deposits-service"):
                continue
            mod = base / artifact
            mod.mkdir(parents=True, exist_ok=True)
            (mod / "pom.xml").write_text(pom(artifact, parent_group, parent_artifact), encoding="utf-8")
            java_dir = mod / "src/main/java" / f"com/{bank}/azure/{pkg}"
            java_dir.mkdir(parents=True, exist_ok=True)
            (java_dir / f"{cls}Application.java").write_text(
                app_java(bank, pkg, cls), encoding="utf-8"
            )
            res = mod / "src/main/resources"
            res.mkdir(parents=True, exist_ok=True)
            (res / "application.yml").write_text(yml(bank, pkg, port), encoding="utf-8")


if __name__ == "__main__":
    main()
