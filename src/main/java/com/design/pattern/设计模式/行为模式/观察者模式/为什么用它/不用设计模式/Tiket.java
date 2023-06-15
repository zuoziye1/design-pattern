package com.design.pattern.设计模式.行为模式.观察者模式.为什么用它.不用设计模式;

import lombok.Data;

/**
 * @Author: 姚飞虎
 * @Date: 2023/5/16 7:12 PM
 * @Description:
 */
@Data
public class Tiket {

    int count ;

    public void 有票了(){
        System.out.println("放票200张");
    }

    public void decrement(){
        System.out.println("如果抢到票，就扣减一张");
        count--;
    }
}
