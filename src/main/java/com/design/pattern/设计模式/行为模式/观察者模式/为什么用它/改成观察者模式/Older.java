package com.design.pattern.设计模式.行为模式.观察者模式.为什么用它.改成观察者模式;

/**
 * 假设有这样的老代码，在观察者模式出现前就有了
 * @Author: 姚飞虎
 * @Date: 2023/6/15 4:04 PM
 * @Description:
 */
public class Older {

    protected 放票系统 tt;

    public void 老人抢票(){
        tt.decrementCount();
    }

}
