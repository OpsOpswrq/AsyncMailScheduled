package com.feng.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduledService {
    @Autowired
    SendMail sendMail;
    @Scheduled(cron = "0/10 * * * * ?")
    public void hello(){
        sendMail.contextLoads();
    }
}
