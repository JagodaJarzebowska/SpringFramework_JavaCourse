package com.sda;

import org.springframework.beans.factory.annotation.Autowired;

public class MessageSender {

//1.    @Autowired
    private UdpSender udpSender;

    @Autowired
    public void setUdpSender(UdpSender udpSender) {
        this.udpSender = udpSender;
    }

    public void sendMessage(){
        System.out.println("Message send");
        System.out.println("sender is null: "+ (udpSender ==null));
    }
}
