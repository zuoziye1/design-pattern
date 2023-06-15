package com.design.pattern.设计模式.行为模式.观察者模式.为什么用它.事件委托;

import java.util.ArrayList;
import java.util.List;

/**
 * 事件处理器
 * @Author: 姚飞虎
 * @Date: 2023/6/15 4:40 PM
 * @Description:
 */
public class EventHandler {

    private List<Event> events = new ArrayList<>();

    public void addEvent(Event event){
        events.add(event);
    }

    /**
     * 处理所有事件
     */
    public void handle(){
        for (Event event : events) {
            event.invoke();
        }
    }

}
