package com.design.pattern.设计模式.行为模式.观察者模式.改成发布订阅模式;

/**
 * @Author: 姚飞虎
 * @Date: 2023/6/1 2:11 PM
 * @Description:
 */
public class Client {

    public static void main(String[] args) {
        // 订阅消息
        SubscriberOne subscriberOne = new SubscriberOne();
        subscriberOne.registry();

        SubscriberTwo subscriberTwo = new SubscriberTwo();
        subscriberTwo.registry();


        // 发布消息
        PublisherOne publisherOne = new PublisherOne();
        MessageBase messageBase = new MessageBase();
        messageBase.setId(1L);
        messageBase.setTitle("I'm topic one message");
        publisherOne.pushMsg(messageBase);
    }
}
