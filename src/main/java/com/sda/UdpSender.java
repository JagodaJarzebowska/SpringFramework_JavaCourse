package com.sda;

import org.springframework.stereotype.Service;

@Service
public class UdpSender {

    MessageSender messageSender;

    public void send(){
        System.out.println("Mesasge send from UdpSender");
    }
}
