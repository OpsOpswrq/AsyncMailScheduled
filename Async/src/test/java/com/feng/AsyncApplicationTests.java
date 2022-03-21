package com.feng;

import com.feng.service.ScheduledService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Scheduled;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

@SpringBootTest
class AsyncApplicationTests {
    @Autowired
    JavaMailSenderImpl javaMailSender;
    @Test
    void contextLoads() {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setSubject("你好");
        simpleMailMessage.setText("你好");
        simpleMailMessage.setTo("2560965468@qq.com");
        simpleMailMessage.setFrom("2560965468@qq.com");
        javaMailSender.send(simpleMailMessage);
    }
    @Test
    void contextLoads1() throws MessagingException {
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);
        mimeMessageHelper.setSubject("测试");
        mimeMessageHelper.setText("<p style='color:red;font-size:30px;'>大佬你的数模作业写了吗</p>",true);
        mimeMessageHelper.addAttachment("1.png",new File("C:\\Users\\feng\\Desktop\\2.png"));
        mimeMessageHelper.setTo("2560965468@qq.com");
        mimeMessageHelper.setFrom("2560965468@qq.com");
        javaMailSender.send(mimeMessage);
    }
}
