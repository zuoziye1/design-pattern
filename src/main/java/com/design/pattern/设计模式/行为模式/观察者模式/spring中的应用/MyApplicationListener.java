package com.design.pattern.设计模式.行为模式.观察者模式.spring中的应用;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 事件监听，也可以用 @EventListener
 * @Author: 姚飞虎
 * @Date: 2023/6/19 5:01 PM
 * @Description:
 */
@Component
public class MyApplicationListener implements ApplicationListener<MyApplicationEvent> {

    @Override
    public void onApplicationEvent(MyApplicationEvent event) {
        MyEventDTO myEventDTO = event.getMyEventDTO();
        String test = (String) event.getSource();
        System.out.println("监听器--"+test+",dto:"+myEventDTO);
    }
}
