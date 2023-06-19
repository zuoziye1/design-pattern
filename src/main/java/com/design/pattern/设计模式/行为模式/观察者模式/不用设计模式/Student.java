package com.design.pattern.设计模式.行为模式.观察者模式.不用设计模式;

import lombok.Data;

/**
 * @Author: 姚飞虎
 * @Date: 2023/5/16 7:05 PM
 * @Description:
 */
@Data
public class Student {

    public void 抢票(Tiket tiket){
        System.out.println("以学生价收费");
        tiket.decrement();
    }
}
