package com.design.pattern.设计模式.行为模式.观察者模式.为什么用它.事件委托;

/**
 * @Author: 姚飞虎
 * @Date: 2023/6/15 9:02 PM
 * @Description:
 */
public class Client {

    public static void main(String[] args) {
        散户 tt = new 散户("小张");
        基金经理 manager = new 基金经理("葛兰");
        tt.addEvent(new Event(manager,"buyStockA",null));
        tt.addEvent(new Event(manager,"buyStockB",null));
        tt.buy();
    }
}
