package com.mproske.dmp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.gemfire.config.annotation.CacheServerApplication;

@SpringBootApplication(scanBasePackages = "com.mproske.dmp")
public class DmpApplication {

    public static void main(String[] args) {
        SpringApplication.run(DmpApplication.class, args);
    }
}
