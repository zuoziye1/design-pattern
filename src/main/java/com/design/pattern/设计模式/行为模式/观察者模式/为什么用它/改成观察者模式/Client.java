package com.design.pattern.设计模式.行为模式.观察者模式.为什么用它.改成观察者模式;

/**
 * @Author: 姚飞虎
 * @Date: 2023/5/17 7:11 PM
 * @Description:
 */
public class Client {

    public static void main(String[] args) {
        放票系统 放票系统 = new 放票系统();
        StudentBuyer studentBuyer = new StudentBuyer();
        studentBuyer.tt = 放票系统;
        WorkerBuyer workerBuyer = new WorkerBuyer();
        workerBuyer.tt = 放票系统;

        放票系统.addBuyer(studentBuyer);
        放票系统.addBuyer(workerBuyer);

        放票系统.放票();
        System.out.println(放票系统.getCount());

    }
}
