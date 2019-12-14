package io.github.flpmartins88.springasync;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements ApplicationRunner {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    private final SimpleService simpleService;

    public Application(SimpleService simpleService) {
        this.simpleService = simpleService;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        for (int i = 0; i < 50; i++) {
            simpleService.process(i);
        }
    }
}
