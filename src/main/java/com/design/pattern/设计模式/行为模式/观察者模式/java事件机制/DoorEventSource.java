package com.design.pattern.设计模式.行为模式.观察者模式.java事件机制;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * 事件源
 * @Author: 姚飞虎
 * @Date: 2023/6/16 6:27 PM
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DoorEventSource {

    /**
     * 下课铃声是否响起,然后开门
     * true.下课铃声响起，各教室开门
     */
    private boolean ling;

    private List<DoorListener> listeners;

    public void addDoorListener(DoorListener listener) {
        if (listeners == null) {
            listeners = new ArrayList<>();
        }
        listeners.add(listener);
    }

    public void notify(DoorEvent doorEvent){
        for (DoorListener listener : listeners) {
            listener.handle(doorEvent);
        }
    }
}
