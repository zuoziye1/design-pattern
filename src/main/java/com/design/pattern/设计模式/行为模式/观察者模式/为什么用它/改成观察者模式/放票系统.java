package com.design.pattern.设计模式.行为模式.观察者模式.为什么用它.改成观察者模式;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * 通知者负责管理观察者
 * @Author: 姚飞虎
 * @Date: 2023/5/17 7:09 PM
 * @Description:
 */
@Getter
public class 放票系统 {

    private List<Buyer> buyerList = new ArrayList<>();

    /**
     * 余票
     */
    private int count;

    public void 放票(){
        count = 100;
        for (Buyer buyer : buyerList) {
            buyer.抢票();
        }
    }

    public void addBuyer(Buyer buyer){
        buyerList.add(buyer);
    }

    public void decrementCount(){
        synchronized (this){
            count--;
        }
    }
}
