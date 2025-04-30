package com.toad.devkit.web.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = {})
@ComponentScan({"com.toad.devkit.web.server"})
public class DevkitServerApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(DevkitServerApplication.class, args);
    }
}
