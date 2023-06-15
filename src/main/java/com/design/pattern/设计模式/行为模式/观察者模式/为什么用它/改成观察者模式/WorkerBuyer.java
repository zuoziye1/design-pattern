package com.design.pattern.设计模式.行为模式.观察者模式.为什么用它.改成观察者模式;

import lombok.Data;

/**
 * @Author: 姚飞虎
 * @Date: 2023/5/16 7:10 PM
 * @Description:
 */
@Data
public class WorkerBuyer extends Buyer{

    @Override
    public void 抢票(){
        System.out.println("以成人价收费");
        tt.decrementCount();
    }
}
