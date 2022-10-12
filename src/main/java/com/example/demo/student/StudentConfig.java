package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student jake = new Student(
                    "Jake",
                    "jake@mail.com",
                    LocalDate.of(2000, Month.APRIL, 7)
            );

            Student herms = new Student(
                    "Herms",
                    "herms@mail.com",
                    LocalDate.of(2004, Month.SEPTEMBER, 6)
            );

            repository.saveAll(
                    List.of(jake, herms)
            );
        };

    }
}
