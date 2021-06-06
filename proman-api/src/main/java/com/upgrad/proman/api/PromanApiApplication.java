package com.upgrad.proman.api;

import com.upgrad.proman.service.ServiceConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@SpringBootApplication
@Import(ServiceConfiguration.class)
public class PromanApiApplication {
        public static void main(String[] args) {
        SpringApplication.run(PromanApiApplication.class, args);
    }

}
