package com.feng.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
@Async
@Service
public class AsyncService {
    public void Hello(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("你被执行了");
    }
}
