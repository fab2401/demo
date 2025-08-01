package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.system.CapturedOutput;
import org.springframework.boot.test.system.OutputCaptureExtension;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
@ExtendWith(OutputCaptureExtension.class)
class DemoApplicationTests {

    @Test
    void heureEstAfficheeEtFormatCorrect(CapturedOutput output) {
        String logs = output.getOut();
        // Vérifie que le log contient "Heure actuelle : " suivi d'une date au bon format
        assertTrue(logs.matches("(?s).*Heure actuelle : \\d{2}-\\d{2}-\\d{4} \\d{2}:\\d{2}:\\d{2}.*"));
    }
}