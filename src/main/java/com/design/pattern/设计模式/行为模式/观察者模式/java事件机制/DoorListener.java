package com.design.pattern.设计模式.行为模式.观察者模式.java事件机制;

import java.util.EventListener;

/**
 * @Author: 姚飞虎
 * @Date: 2023/6/16 5:57 PM
 * @Description:
 */
public interface DoorListener extends EventListener {

    /**
     * 监听DoorEvent
     * @param doorEvent
     */
    void handle(DoorEvent doorEvent);
}
