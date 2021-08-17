package com.mphasis.main.cui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ApplicationContext context=new FileSystemXmlApplicationContext("src/main/java/Beans.xml");
        MessageService messageService=(MessageService) context.getBean("email");
        messageService.sendMessage("This is an email ","amitprajapat");

    }
}
