package com.design.pattern.设计模式.行为模式.观察者模式.java事件机制;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.EventObject;

/**
 * 事件
 * @Author: 姚飞虎
 * @Date: 2023/6/16 4:34 PM
 * @Description:
 */
public class DoorEvent extends EventObject {

    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public DoorEvent(Object source) {
        super(source);
    }
}
