package org.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Messaging {

    public static void main(String[] args) {
        System.out.println("Welcome to SpringBoot");
        SpringApplication.run(Messaging.class, args);
    }

}
