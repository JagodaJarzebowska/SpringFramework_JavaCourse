package com.sda;


import com.mongo.MessagerRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext appCtx = new AnnotationConfigApplicationContext(AppConfig.class);
        MessageSender messageSender = appCtx.getBean(MessageSender.class);
        messageSender.sendMessage();
        UdpSender udpSender = appCtx.getBean(UdpSender.class);
        udpSender.send();

        MessagerRepository messagerRepository = appCtx.getBean(MessagerRepository.class);
        System.out.printf("Message repository is %s null:", messagerRepository == null ? "" : "not");
    }
}
