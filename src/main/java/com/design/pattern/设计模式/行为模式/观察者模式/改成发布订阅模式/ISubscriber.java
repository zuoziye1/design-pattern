package com.design.pattern.设计模式.行为模式.观察者模式.改成发布订阅模式;

/**
 * @Author: 姚飞虎
 * @Date: 2023/5/24 6:19 PM
 * @Description:
 */
public interface ISubscriber {

    /**
     * 订阅的消息类型
     * @return
     */
    String getMessageType();

    /**
     * 订阅
     */
    default void registry(){
        SubscribePublish.getSubscribePublish().subscribe(this);
    }

    /**
     * 退订
     */
    default void unRegistry(){
        SubscribePublish.getSubscribePublish().unSubscribe(this);
    }

    /**
     * 接收消息
     * @param messageBase
     */
    void receiveMsg(MessageBase messageBase);
}
