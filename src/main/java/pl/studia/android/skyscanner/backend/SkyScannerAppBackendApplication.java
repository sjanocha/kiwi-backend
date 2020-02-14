package pl.studia.android.skyscanner.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class SkyScannerAppBackendApplication {

    public static void main(String[] args) {

        SpringApplication.run(SkyScannerAppBackendApplication.class, args);
    }

}
