package com.mphasis.main.cui;

public class EmailService1 implements MessageService{
    @Override
    public boolean sendMessage(String msg, String recipient) {
        System.out.println("Email message "+ msg + "sent to " +recipient);
        return true;
    }
}
