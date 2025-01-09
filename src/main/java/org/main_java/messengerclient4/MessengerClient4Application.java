package org.main_java.messengerclient4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MessengerClient4Application {

    public static void main(String[] args) {
        SpringApplication.run(MessengerClient4Application.class, args);
    }

}
