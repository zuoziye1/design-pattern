package com.design.pattern.设计模式.行为模式.观察者模式.改成发布订阅模式;

/**
 * @Author: 姚飞虎
 * @Date: 2023/6/1 2:11 PM
 * @Description:
 */
public class SubscriberOne implements ISubscriber{
    @Override
    public String getMessageType() {
        return "topic-One";
    }

    @Override
    public void receiveMsg(MessageBase messageBase) {
        System.out.println(messageBase);
    }
}
