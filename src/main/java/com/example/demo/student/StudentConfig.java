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
                    1L,
                    "Jake",
                    "jake@mail.com",
                    LocalDate.of(2000, Month.APRIL, 7),
                    22
            );

            Student herms = new Student(
                    "Herms",
                    "herms@mail.com",
                    LocalDate.of(2001, Month.SEPTEMBER, 6),
                    21
            );

            repository.saveAll(
                    List.of(jake, herms)
            );
        };

    }
}
