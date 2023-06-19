package com.design.pattern.设计模式.行为模式.观察者模式.改成发布订阅模式;

/**
 * @Author: 姚飞虎
 * @Date: 2023/5/24 6:23 PM
 * @Description:
 */
public interface IPublisher {

    /**
     * 发布的消息类型
     * @return
     */
    String getMessageType();

    /**
     * 发布消息
     * @param messageBase
     */
    default void pushMsg(MessageBase messageBase){
        SubscribePublish.getSubscribePublish().publishMessage(this.getMessageType(),messageBase);
    }
}
