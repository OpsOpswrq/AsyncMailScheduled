package com.feng.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Component;

@Component
public class SendMail {
    @Autowired
    JavaMailSenderImpl javaMailSender;
    void contextLoads() {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setSubject("你好");
        simpleMailMessage.setText("你好");
        simpleMailMessage.setTo("2560965468@qq.com");
        simpleMailMessage.setFrom("2560965468@qq.com");
        javaMailSender.send(simpleMailMessage);
    }
}
