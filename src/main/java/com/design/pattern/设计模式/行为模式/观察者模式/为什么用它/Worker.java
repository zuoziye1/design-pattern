package com.design.pattern.设计模式.行为模式.观察者模式.为什么用它;

import lombok.Data;

/**
 * @Author: 姚飞虎
 * @Date: 2023/5/16 7:10 PM
 * @Description:
 */
@Data
public class Worker {

    public void 抢票(Tiket tiket){
        System.out.println("以成人价收费");
        tiket.decrement();
    }
}
