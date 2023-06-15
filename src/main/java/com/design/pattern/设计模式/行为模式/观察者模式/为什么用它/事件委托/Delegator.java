package com.design.pattern.设计模式.行为模式.观察者模式.为什么用它.事件委托;

/**
 * 委托者
 * @Author: 姚飞虎
 * @Date: 2023/6/15 4:43 PM
 * @Description:
 */
public class Delegator {

    private EventHandler eventHandler = new EventHandler();

    /**
     * 添加 处理委托的事件
     * @param event
     */
    public void addListener(Event event){
        eventHandler.addEvent(event);
    }

    /**
     * 委托 【这些事件】进行处理
     */
    public void delegate(){
        eventHandler.handle();
    }
}
