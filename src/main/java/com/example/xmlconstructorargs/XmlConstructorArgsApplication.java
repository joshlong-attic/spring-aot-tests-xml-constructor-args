package com.example.xmlconstructorargs;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@ImportResource("/context.xml")
@SpringBootApplication
public class XmlConstructorArgsApplication {

    public static void main(String[] args) {
        SpringApplication.run(XmlConstructorArgsApplication.class, args);
    }

}

class AnnouncingApplicationRunner implements ApplicationRunner {

    private final String message;

    AnnouncingApplicationRunner(String message) {
        this.message = message;
    }

    AnnouncingApplicationRunner() {
        this.message = "Hello, world";
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(this.message);
    }
}