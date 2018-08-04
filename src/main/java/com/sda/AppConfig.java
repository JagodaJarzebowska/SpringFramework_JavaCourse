package com.sda;

import com.mongo.MongoConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.sda")
@Import(MongoConfig.class)
public class AppConfig {

    @Bean
    MessageSender getMessageSender(){
        return new MessageSender();
    }

}
