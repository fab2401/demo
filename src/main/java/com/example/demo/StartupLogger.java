package com.example.demo;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Slf4j
@Component
public class StartupLogger {

    @PostConstruct
    public void logStartup() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = LocalDateTime.now().format(formatter);

        log.info("Hello World !");
        log.info("Heure actuelle : {}", formattedDateTime);
    }
}