package com.design.pattern.设计模式.行为模式.观察者模式.java事件机制;

/**
 * @Author: 姚飞虎
 * @Date: 2023/6/19 2:38 PM
 * @Description:
 */
public class Client {

    public static void main(String[] args) {
        DoorEventSource doorManager = new DoorEventSource();
        doorManager.addDoorListener(new StudyDoorListener());
        doorManager.addDoorListener(new TeacherDoorListener());

        // 事件源触发特定事件
        doorManager.setLing(true);
        // 这里可以传递任何想要传递的Object
        DoorEvent doorEvent = new DoorEvent(doorManager);
        doorManager.notify(doorEvent);

    }
}
