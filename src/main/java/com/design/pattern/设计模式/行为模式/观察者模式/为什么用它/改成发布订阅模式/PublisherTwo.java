package com.design.pattern.设计模式.行为模式.观察者模式.为什么用它.改成发布订阅模式;

/**
 * @Author: 姚飞虎
 * @Date: 2023/6/1 2:18 PM
 * @Description:
 */
public class PublisherTwo implements IPublisher{
    @Override
    public String getMessageType() {
        return "topic-Two";
    }
}
