package com.design.pattern.设计模式.行为模式.观察者模式.改成发布订阅模式;

import lombok.Data;

/**
 * 消息基类
 * @Author: 姚飞虎
 * @Date: 2023/6/1 12:01 PM
 * @Description:
 */
@Data
public class MessageBase {

    private Long id ;

    private String title;
}
