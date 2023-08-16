package com.zhf.eureka;

import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceCanceledEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class TestEvent {

    @EventListener
    public void listen(EurekaInstanceCanceledEvent event) {
        // 发邮件、短信
        System.out.println("下线：" + event.getServerId());

    }
}
