package com.design.pattern.设计模式.行为模式.观察者模式.改成发布订阅模式;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 订阅器
 * @Author: 姚飞虎
 * @Date: 2023/5/24 6:24 PM
 * @Description:
 */
public class SubscribePublish {

    private Map<String, List<ISubscriber>> subscriberMap = new HashMap<>();

    /**
     * 本类实例
     */
    private static SubscribePublish subscribePublish = new SubscribePublish();

    /**
     * 订阅
     * @param subscriber
     */
    public void subscribe(ISubscriber subscriber){
        String messageType = subscriber.getMessageType();
        // 给该消息类型增加订阅者
        subscriberMap.compute(messageType,(key,value)->{
            if(value == null){
                value = new ArrayList<>();
                value.add(subscriber);
            }else {
                value.add(subscriber);
            }
            return value;
        });
    }

    /**
     * 退订
     */
    public void unSubscribe(ISubscriber subscriber){
        String messageType = subscriber.getMessageType();
        subscriberMap.computeIfPresent(
                messageType,(key,value)-> {
                    value.remove(subscriber);
                    return value;
                }
        );
    }

    /**
     * 发布消息
     * @param messageType
     * @param messageBase
     */
    public void publishMessage(String messageType,MessageBase messageBase){
        subscriberMap.getOrDefault(messageType,new ArrayList<>())
                .forEach(subscriber -> subscriber.receiveMsg(messageBase));
    }

    public static SubscribePublish getSubscribePublish(){
        return subscribePublish;
    }


}
