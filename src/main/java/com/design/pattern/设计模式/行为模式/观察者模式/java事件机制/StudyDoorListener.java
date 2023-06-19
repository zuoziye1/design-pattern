package com.design.pattern.设计模式.行为模式.观察者模式.java事件机制;

/**
 * @Author: 姚飞虎
 * @Date: 2023/6/16 6:03 PM
 * @Description:
 */
public class StudyDoorListener implements DoorListener{

    @Override
    public void handle(DoorEvent doorEvent) {
        DoorEventSource doorEventSource = (DoorEventSource) doorEvent.getSource();
        if(doorEventSource.isLing()){
            System.out.println("开门，下课");
        }else {
            System.out.println("关门，上课");
        }
    }
}
