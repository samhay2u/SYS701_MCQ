package com.example.mcq.config;

import com.example.mcq.model.Question;
import com.example.mcq.repository.QuestionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class DataInitializer {

    @Bean
    public CommandLineRunner initData(QuestionRepository questionRepository) {
        return args -> {
            // Create sample questions
            Question q1 = new Question();
            q1.setText("Which security control type focuses on reducing the impact of an incident?");
            q1.setOptions(Arrays.asList(
                    "Preventive",
                    "Detective",
                    "Corrective",
                    "Compensating"
            ));
            q1.setCorrectOptionIndex(2);
            q1.setExplanation("Corrective controls are designed to reduce the impact of an incident.");
            q1.setCategory("Security Controls");
            q1.setDifficultyLevel(1);
            
            Question q2 = new Question();
            q2.setText("Which encryption algorithm uses a 256-bit key?");
            q2.setOptions(Arrays.asList(
                    "DES",
                    "3DES",
                    "AES-256",
                    "RC4"
            ));
            q2.setCorrectOptionIndex(2);
            q2.setExplanation("AES-256 uses a 256-bit key for encryption and decryption.");
            q2.setCategory("Cryptography");
            q2.setDifficultyLevel(2);
            
            // Save to database
            questionRepository.saveAll(Arrays.asList(q1, q2));
        };
    }
}