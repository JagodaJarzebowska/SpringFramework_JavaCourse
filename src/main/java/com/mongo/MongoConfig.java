package com.mongo;

import org.springframework.context.annotation.Bean;

public class MongoConfig {


    @Bean
    public MessagerRepository getMessageRepository(){
        return new MessagerRepository();
    }
}
